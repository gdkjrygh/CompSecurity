// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import com.tinder.managers.a;
import com.tinder.utils.v;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SparksEvent
    implements Cloneable
{

    public final String name;
    public final Map params;
    public final long timestamp;

    public SparksEvent(String s)
    {
        name = s;
        params = new ConcurrentHashMap(20);
        timestamp = System.currentTimeMillis();
    }

    public SparksEvent(String s, long l, Map map)
    {
        name = s;
        timestamp = l;
        if (map == null)
        {
            s = new ConcurrentHashMap(20);
        } else
        {
            s = new ConcurrentHashMap(map);
        }
        params = s;
    }

    public SparksEvent clone()
    {
        try
        {
            super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            v.a("could not call super.clone for sparks event.", clonenotsupportedexception);
        }
        return new SparksEvent(name, timestamp, params);
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public void fire()
    {
        if (name != null)
        {
            a.a(this);
            return;
        } else
        {
            throw new IllegalStateException("Name is null in SparksEvent");
        }
    }

    public SparksEvent put(String s, Object obj)
    {
        if (s == null || obj == null)
        {
            v.b("Cannot add null key or value to SparksEvent parameters.");
            return this;
        } else
        {
            params.put(s, obj);
            return this;
        }
    }

    public String toString()
    {
        return (new StringBuilder("SparksEvent{name='")).append(name).append('\'').append('}').toString();
    }
}
