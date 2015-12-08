// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos;

import java.util.Date;

public class Photocount
{

    public static final long serialVersionUID = 12L;
    private int count;
    private Date fromDate;
    private Date toDate;

    public Photocount()
    {
    }

    public int getCount()
    {
        return count;
    }

    public Date getFromDate()
    {
        return fromDate;
    }

    public Date getToDate()
    {
        return toDate;
    }

    public void setCount(int i)
    {
        count = i;
    }

    public void setCount(String s)
    {
        if (s != null)
        {
            setCount(Integer.parseInt(s));
        }
    }

    public void setFromDate(long l)
    {
        setFromDate(new Date(l));
    }

    public void setFromDate(String s)
    {
        if (s != null)
        {
            setFromDate(Long.parseLong(s));
        }
    }

    public void setFromDate(Date date)
    {
        fromDate = date;
    }

    public void setToDate(long l)
    {
        setToDate(new Date(l));
    }

    public void setToDate(String s)
    {
        if (s != null)
        {
            setToDate(Long.parseLong(s));
        }
    }

    public void setToDate(Date date)
    {
        toDate = date;
    }
}
