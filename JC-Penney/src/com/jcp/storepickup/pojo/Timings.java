// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.storepickup.pojo;


public class Timings
{

    private String days;
    private String time;

    public Timings()
    {
    }

    public String getDays()
    {
        return days;
    }

    public String getTime()
    {
        return time;
    }

    public void setDays(String s)
    {
        days = s;
    }

    public void setTime(String s)
    {
        time = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ClassPojo [time = ").append(time).append(", days = ").append(days).append("]").toString();
    }
}
