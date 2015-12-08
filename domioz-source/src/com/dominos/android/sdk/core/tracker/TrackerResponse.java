// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.tracker;

import java.io.Serializable;

public class TrackerResponse
    implements Serializable
{

    private int index;
    private String result;
    private String status;

    public TrackerResponse()
    {
    }

    public int getIndex()
    {
        return index;
    }

    public String getResult()
    {
        return result;
    }

    public String getStatus()
    {
        return status;
    }

    public void setIndex(int i)
    {
        index = i;
    }

    public void setResult(String s)
    {
        result = s;
    }

    public void setStatus(String s)
    {
        status = s;
    }
}
