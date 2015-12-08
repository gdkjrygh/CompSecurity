// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            ScModel

class ModelCache
{

    private final AtomicInteger lruHits = new AtomicInteger(0);
    private final Map lruMap;
    private final Object mapLock = new Object();
    private final AtomicInteger requests = new AtomicInteger(0);

    ModelCache(final int final_i)
    {
        lruMap = new _cls1(0.75F, true, final_i);
    }

    public void clear()
    {
        synchronized (mapLock)
        {
            lruMap.clear();
        }
        lruHits.set(0);
        requests.set(0);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean containsKey(Long long1)
    {
        boolean flag;
        synchronized (mapLock)
        {
            flag = lruMap.containsKey(long1);
        }
        return flag;
        long1;
        obj;
        JVM INSTR monitorexit ;
        throw long1;
    }

    public ScModel get(Long long1)
    {
        this;
        JVM INSTR monitorenter ;
        requests.incrementAndGet();
        synchronized (mapLock)
        {
            long1 = (ScModel)lruMap.get(long1);
        }
        if (long1 == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        lruHits.incrementAndGet();
        this;
        JVM INSTR monitorexit ;
        return long1;
        long1;
        obj;
        JVM INSTR monitorexit ;
        throw long1;
        long1;
        this;
        JVM INSTR monitorexit ;
        throw long1;
    }

    public ScModel put(ScModel scmodel)
    {
        if (scmodel != null)
        {
            return put(Long.valueOf(scmodel.getId()), scmodel);
        } else
        {
            return null;
        }
    }

    public ScModel put(Long long1, ScModel scmodel)
    {
        synchronized (mapLock)
        {
            long1 = (ScModel)lruMap.put(long1, scmodel);
        }
        return long1;
        long1;
        obj;
        JVM INSTR monitorexit ;
        throw long1;
    }

    public void remove(Long long1)
    {
        synchronized (mapLock)
        {
            lruMap.remove(long1);
        }
        return;
        long1;
        obj;
        JVM INSTR monitorexit ;
        throw long1;
    }

    public String toString()
    {
        return (new StringBuilder("LruCache{lru: ")).append(lruMap.size()).append(" lru ratio: ").append(String.format("%.2f", new Object[] {
            Double.valueOf(lruHits.doubleValue() / requests.doubleValue())
        })).append("}").toString();
    }

    private class _cls1 extends LinkedHashMap
    {

        final ModelCache this$0;
        final int val$capacity;

        protected boolean removeEldestEntry(java.util.Map.Entry entry)
        {
            return size() > capacity;
        }

        _cls1(float f, boolean flag, int j)
        {
            this$0 = ModelCache.this;
            capacity = j;
            super(final_i, f, flag);
        }
    }

}
