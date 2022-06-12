package com.bawp.todoister.model;
//наш Entity

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "task_table")
public class Task {

    @ColumnInfo(name="task_id")
    @PrimaryKey(autoGenerate = true)
    public long id;

    public String task;

    public Priority priority;

    @ColumnInfo(name="due_date")
    public Date dueDate;

    @ColumnInfo(name="created_at")
    public Date dateCreated;

    @ColumnInfo(name="is_done")
    public boolean isDone;

    public Task(String task, Priority priority, Date dueDate, Date dateCreated, boolean isDone) {
        this.task = task;
        this.priority = priority;
        this.dueDate = dueDate;
        this.dateCreated = dateCreated;
        this.isDone = isDone;
    }

    public long getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public Priority getPriority() {
        return priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", priority=" + priority +
                ", dueDate=" + dueDate +
                ", dateCreated=" + dateCreated +
                ", isDone=" + isDone +
                '}';
    }
}
