// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

public final class LocalTimeRange extends GenericJson
{

    private String endTime;
    private String startTime;

    public LocalTimeRange()
    {
    }

    public volatile GenericJson clone()
    {
        return clone();
    }

    public volatile GenericData clone()
    {
        return clone();
    }

    public LocalTimeRange clone()
    {
        return (LocalTimeRange)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public String getEndTime()
    {
        return endTime;
    }

    public String getStartTime()
    {
        return startTime;
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public LocalTimeRange set(String s, Object obj)
    {
        return (LocalTimeRange)super.set(s, obj);
    }

    public LocalTimeRange setEndTime(String s)
    {
        endTime = s;
        return this;
    }

    public LocalTimeRange setStartTime(String s)
    {
        startTime = s;
        return this;
    }
}
