// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.model;

import com.google.zxing.Result;

public class QRModel
{

    private String date;
    private int id;
    private Result result;
    private String time;

    public QRModel()
    {
    }

    public QRModel(int i, Result result1, String s, String s1)
    {
        id = i;
        result = result1;
        time = s;
        date = s1;
    }

    public String getDate()
    {
        return date;
    }

    public int getId()
    {
        return id;
    }

    public Result getResult()
    {
        return result;
    }

    public String getTime()
    {
        return time;
    }

    public void setDate(String s)
    {
        date = s;
    }

    public void setId(int i)
    {
        id = i;
    }

    public void setResult(Result result1)
    {
        result = result1;
    }

    public void setTime(String s)
    {
        time = s;
    }
}
