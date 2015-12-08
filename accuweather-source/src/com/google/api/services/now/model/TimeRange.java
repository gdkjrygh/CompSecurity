// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

// Referenced classes of package com.google.api.services.now.model:
//            Timestamp

public final class TimeRange extends GenericJson
{

    private Timestamp endTime;
    private Timestamp startTime;

    public TimeRange()
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

    public TimeRange clone()
    {
        return (TimeRange)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public Timestamp getEndTime()
    {
        return endTime;
    }

    public Timestamp getStartTime()
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

    public TimeRange set(String s, Object obj)
    {
        return (TimeRange)super.set(s, obj);
    }

    public TimeRange setEndTime(Timestamp timestamp)
    {
        endTime = timestamp;
        return this;
    }

    public TimeRange setStartTime(Timestamp timestamp)
    {
        startTime = timestamp;
        return this;
    }
}
