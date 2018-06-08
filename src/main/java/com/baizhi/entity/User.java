package com.baizhi.entity;

import java.io.Serializable;

/**
 * Created by xiongyicheng on 2018/6/8.
 */
public class User implements Serializable {
    private String id;
    private String name;

    public User() {
    }

    public User(String id, String name) {

        this.id = id;
        this.name = name;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
