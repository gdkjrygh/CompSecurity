// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

public final class ContextActivityContextWrapper extends GenericJson
{

    private String activityContext;

    public ContextActivityContextWrapper()
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

    public ContextActivityContextWrapper clone()
    {
        return (ContextActivityContextWrapper)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public String getActivityContext()
    {
        return activityContext;
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public ContextActivityContextWrapper set(String s, Object obj)
    {
        return (ContextActivityContextWrapper)super.set(s, obj);
    }

    public ContextActivityContextWrapper setActivityContext(String s)
    {
        activityContext = s;
        return this;
    }
}
