// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yong.jamendo.api;

import java.util.Hashtable;
import java.util.LinkedList;

public class RequestCache
{

    private static int CACHE_LIMIT = 10;
    private Hashtable cache;
    private LinkedList history;

    public RequestCache()
    {
        history = new LinkedList();
        cache = new Hashtable();
    }

    public String get(String s)
    {
        return (String)cache.get(s);
    }

    public void put(String s, String s1)
    {
        history.add(s);
        if (history.size() > CACHE_LIMIT)
        {
            String s2 = (String)history.poll();
            cache.remove(s2);
        }
        cache.put(s, s1);
    }

}
