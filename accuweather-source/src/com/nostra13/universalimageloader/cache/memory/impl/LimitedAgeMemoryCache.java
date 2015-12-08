// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.cache.memory.impl;

import com.nostra13.universalimageloader.cache.memory.MemoryCacheAware;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LimitedAgeMemoryCache
    implements MemoryCacheAware
{

    private final MemoryCacheAware cache;
    private final Map loadingDates = Collections.synchronizedMap(new HashMap());
    private final long maxAge;

    public LimitedAgeMemoryCache(MemoryCacheAware memorycacheaware, long l)
    {
        cache = memorycacheaware;
        maxAge = 1000L * l;
    }

    public void clear()
    {
        cache.clear();
        loadingDates.clear();
    }

    public Object get(Object obj)
    {
        Long long1 = (Long)loadingDates.get(obj);
        if (long1 != null && System.currentTimeMillis() - long1.longValue() > maxAge)
        {
            cache.remove(obj);
            loadingDates.remove(obj);
        }
        return cache.get(obj);
    }

    public Collection keys()
    {
        return cache.keys();
    }

    public boolean put(Object obj, Object obj1)
    {
        boolean flag = cache.put(obj, obj1);
        if (flag)
        {
            loadingDates.put(obj, Long.valueOf(System.currentTimeMillis()));
        }
        return flag;
    }

    public void remove(Object obj)
    {
        cache.remove(obj);
        loadingDates.remove(obj);
    }
}
