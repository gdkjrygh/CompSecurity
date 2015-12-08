// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import com.mopub.volley.Cache;

public class NoCache
    implements Cache
{

    public NoCache()
    {
    }

    public void clear()
    {
    }

    public com.mopub.volley.Cache.Entry get(String s)
    {
        return null;
    }

    public void initialize()
    {
    }

    public void invalidate(String s, boolean flag)
    {
    }

    public void put(String s, com.mopub.volley.Cache.Entry entry)
    {
    }

    public void remove(String s)
    {
    }
}
