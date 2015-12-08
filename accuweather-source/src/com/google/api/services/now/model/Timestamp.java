// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

public final class Timestamp extends GenericJson
{

    private Integer nanos;
    private Long seconds;

    public Timestamp()
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

    public Timestamp clone()
    {
        return (Timestamp)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public Integer getNanos()
    {
        return nanos;
    }

    public Long getSeconds()
    {
        return seconds;
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public Timestamp set(String s, Object obj)
    {
        return (Timestamp)super.set(s, obj);
    }

    public Timestamp setNanos(Integer integer)
    {
        nanos = integer;
        return this;
    }

    public Timestamp setSeconds(Long long1)
    {
        seconds = long1;
        return this;
    }
}
