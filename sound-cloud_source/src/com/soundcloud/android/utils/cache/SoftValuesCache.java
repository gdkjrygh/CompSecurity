// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils.cache;

import java.lang.ref.SoftReference;

// Referenced classes of package com.soundcloud.android.utils.cache:
//            Cache, StrongValuesCache

class SoftValuesCache extends Cache
{

    private final StrongValuesCache cache;

    SoftValuesCache(int i)
    {
        cache = new StrongValuesCache(i);
    }

    public void clear()
    {
        cache.clear();
    }

    public Object get(Object obj)
    {
        obj = (SoftReference)cache.get(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            return ((SoftReference) (obj)).get();
        }
    }

    public Object get(Object obj, Cache.ValueProvider valueprovider)
    {
        Object obj2 = get(obj);
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
        cache.put(obj, new SoftReference(obj1));
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
