// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.util;


public class Date extends java.util.Date
{

    public Date()
    {
        super(System.currentTimeMillis());
    }

    public Date(long l)
    {
        super(l);
    }

    public Date(java.util.Date date)
    {
        super(date.getTime());
    }

    public void addDays(int i)
    {
        setTime(getTime() + (long)(0x5265c00 * i));
    }

    public void addMinutes(int i)
    {
        setTime(getTime() + (long)(60000 * i));
    }

    public java.util.Date getJavaDate()
    {
        return new java.util.Date(getTime());
    }

    public boolean isAfter(java.util.Date date)
    {
        return getTime() - date.getTime() > 0L;
    }

    public void subtractDays(int i)
    {
        addDays(-i);
    }

    public void subtractMinutes(int i)
    {
        setTime(-i);
    }
}
