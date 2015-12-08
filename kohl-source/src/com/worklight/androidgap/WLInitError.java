// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap;

import java.util.Map;

public class WLInitError extends Error
{

    private int errorStatus;
    private Map extraData;

    public WLInitError(int i)
    {
        this(i, null, null, null);
    }

    public WLInitError(int i, String s)
    {
        this(i, s, null, null);
    }

    public WLInitError(int i, String s, Throwable throwable)
    {
        this(i, s, null, throwable);
    }

    public WLInitError(int i, String s, Map map)
    {
        this(i, s, map, null);
    }

    public WLInitError(int i, String s, Map map, Throwable throwable)
    {
        super(s, throwable);
        errorStatus = i;
        extraData = map;
    }

    public int getErrorStatus()
    {
        return errorStatus;
    }

    public Map getExtraData()
    {
        return extraData;
    }
}
