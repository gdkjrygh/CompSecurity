// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.entity;

import java.io.Serializable;

public class MusicFolder
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private int num;
    private String path;

    public MusicFolder()
    {
    }

    public MusicFolder(int i, String s, String s1, int j)
    {
        id = i;
        name = s;
        path = s1;
        num = j;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getNum()
    {
        return num;
    }

    public String getPath()
    {
        return path;
    }

    public void setId(int i)
    {
        id = i;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setNum(int i)
    {
        num = i;
    }

    public void setPath(String s)
    {
        path = s;
    }

    public String toString()
    {
        return (new StringBuilder("MusicFolder [id=")).append(id).append(", name=").append(name).append(", path=").append(path).append("]").toString();
    }
}
