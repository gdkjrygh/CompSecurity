// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;
import java.util.List;

public final class CardContexts extends GenericJson
{

    private List contextIds;
    private List inlineContexts;

    public CardContexts()
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

    public CardContexts clone()
    {
        return (CardContexts)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public List getContextIds()
    {
        return contextIds;
    }

    public List getInlineContexts()
    {
        return inlineContexts;
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public CardContexts set(String s, Object obj)
    {
        return (CardContexts)super.set(s, obj);
    }

    public CardContexts setContextIds(List list)
    {
        contextIds = list;
        return this;
    }

    public CardContexts setInlineContexts(List list)
    {
        inlineContexts = list;
        return this;
    }
}
