// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils.cache;

import android.support.v4.util.LruCache;

// Referenced classes of package com.soundcloud.android.utils.cache:
//            Cache

class StrongValuesCache extends Cache
{

    private final LruCache cache;

    StrongValuesCache(int i)
    {
        cache = new LruCache(i);
    }

    public void clear()
    {
        cache.evictAll();
    }

    public Object get(Object obj)
    {
        return cache.get(obj);
    }

    public Object get(Object obj, Cache.ValueProvider valueprovider)
    {
        Object obj2 = cache.get(obj);
        Object obj1 = obj2;
        if (obj2 == null)
        {
            try
            {
                obj1 = valueprovider.get(obj);
                put(obj, obj1);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
                return null;
            }
        }
        return obj1;
    }

    public int hitCount()
    {
        return cache.hitCount();
    }

    public int missCount()
    {
        return cache.missCount();
    }

    public Cache put(Object obj, Object obj1)
    {
        cache.put(obj, obj1);
        return this;
    }

    public int size()
    {
        return cache.size();
    }

    public String toString()
    {
        return cache.toString();
    }
}
