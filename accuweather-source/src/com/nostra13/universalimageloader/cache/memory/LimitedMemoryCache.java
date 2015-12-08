// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.cache.memory;

import com.nostra13.universalimageloader.utils.L;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.nostra13.universalimageloader.cache.memory:
//            BaseMemoryCache

public abstract class LimitedMemoryCache extends BaseMemoryCache
{

    private static final int MAX_NORMAL_CACHE_SIZE = 0x1000000;
    private static final int MAX_NORMAL_CACHE_SIZE_IN_MB = 16;
    private final AtomicInteger cacheSize = new AtomicInteger();
    private final List hardCache = Collections.synchronizedList(new LinkedList());
    private final int sizeLimit;

    public LimitedMemoryCache(int i)
    {
        sizeLimit = i;
        if (i > 0x1000000)
        {
            L.w("You set too large memory cache size (more than %1$d Mb)", new Object[] {
                Integer.valueOf(16)
            });
        }
    }

    public void clear()
    {
        hardCache.clear();
        cacheSize.set(0);
        super.clear();
    }

    protected abstract int getSize(Object obj);

    protected int getSizeLimit()
    {
        return sizeLimit;
    }

    public boolean put(Object obj, Object obj1)
    {
        boolean flag = false;
        int j = getSize(obj1);
        int k = getSizeLimit();
        int i = cacheSize.get();
        if (j < k)
        {
            do
            {
                if (i + j <= k)
                {
                    break;
                }
                Object obj2 = removeNext();
                if (hardCache.remove(obj2))
                {
                    i = cacheSize.addAndGet(-getSize(obj2));
                }
            } while (true);
            hardCache.add(obj1);
            cacheSize.addAndGet(j);
            flag = true;
        }
        super.put(obj, obj1);
        return flag;
    }

    public void remove(Object obj)
    {
        Object obj1 = super.get(obj);
        if (obj1 != null && hardCache.remove(obj1))
        {
            cacheSize.addAndGet(-getSize(obj1));
        }
        super.remove(obj);
    }

    protected abstract Object removeNext();
}
