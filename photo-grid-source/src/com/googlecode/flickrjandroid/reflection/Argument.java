// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.reflection;


public class Argument
{

    private String description;
    private String name;
    private boolean optional;

    public Argument()
    {
    }

    public String getDescription()
    {
        return description;
    }

    public String getName()
    {
        return name;
    }

    public boolean isOptional()
    {
        return optional;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setOptional(boolean flag)
    {
        optional = flag;
    }
}
