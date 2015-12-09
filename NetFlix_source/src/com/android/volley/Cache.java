// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import java.util.Collections;
import java.util.Map;

public interface Cache
{
    public static class Entry
    {

        public byte data[];
        public String etag;
        public Map responseHeaders;
        public long serverDate;
        public long softTtl;
        public long ttl;

        public boolean isExpired()
        {
            return ttl < System.currentTimeMillis();
        }

        public boolean refreshNeeded()
        {
            return softTtl < System.currentTimeMillis();
        }

        public Entry()
        {
            responseHeaders = Collections.emptyMap();
        }
    }


    public abstract void clear();

    public abstract Entry get(String s);

    public abstract void initialize();

    public abstract void invalidate(String s, boolean flag);

    public abstract void put(String s, Entry entry);

    public abstract void remove(String s);
}
