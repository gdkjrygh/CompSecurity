// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

public final class ContextTimeContextWrapper extends GenericJson
{

    private String timeContext;

    public ContextTimeContextWrapper()
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

    public ContextTimeContextWrapper clone()
    {
        return (ContextTimeContextWrapper)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public String getTimeContext()
    {
        return timeContext;
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public ContextTimeContextWrapper set(String s, Object obj)
    {
        return (ContextTimeContextWrapper)super.set(s, obj);
    }

    public ContextTimeContextWrapper setTimeContext(String s)
    {
        timeContext = s;
        return this;
    }
}
