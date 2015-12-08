// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;
import java.util.List;

public final class TemplatedString extends GenericJson
{

    private String displayString;
    private List parameters;

    public TemplatedString()
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

    public TemplatedString clone()
    {
        return (TemplatedString)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public String getDisplayString()
    {
        return displayString;
    }

    public List getParameters()
    {
        return parameters;
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public TemplatedString set(String s, Object obj)
    {
        return (TemplatedString)super.set(s, obj);
    }

    public TemplatedString setDisplayString(String s)
    {
        displayString = s;
        return this;
    }

    public TemplatedString setParameters(List list)
    {
        parameters = list;
        return this;
    }
}
