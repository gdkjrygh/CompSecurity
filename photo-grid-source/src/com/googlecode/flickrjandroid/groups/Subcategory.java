// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.groups;


public class Subcategory
{

    public static final long serialVersionUID = 12L;
    private int count;
    private int id;
    private String name;

    public Subcategory()
    {
    }

    public int getCount()
    {
        return count;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setCount(int i)
    {
        count = i;
    }

    public void setId(int i)
    {
        id = i;
    }

    public void setName(String s)
    {
        name = s;
    }
}
