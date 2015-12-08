// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.Cache;

public class NoCache
    implements Cache
{

    public NoCache()
    {
    }

    public void clear()
    {
    }

    public com.android.volley.Cache.Entry get(String s)
    {
        return null;
    }

    public void initialize()
    {
    }

    public void invalidate(String s, boolean flag)
    {
    }

    public void put(String s, com.android.volley.Cache.Entry entry)
    {
    }

    public void remove(String s)
    {
    }
}
