// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.groups;


public class Throttle
{

    public static final long serialVersionUID = 12L;
    private int count;
    private String mode;
    private int remaining;

    public Throttle()
    {
    }

    public int getCount()
    {
        return count;
    }

    public String getMode()
    {
        return mode;
    }

    public int getRemaining()
    {
        return remaining;
    }

    public void setCount(int i)
    {
        count = i;
    }

    public void setMode(String s)
    {
        mode = s;
    }

    public void setRemaining(int i)
    {
        remaining = i;
    }
}
