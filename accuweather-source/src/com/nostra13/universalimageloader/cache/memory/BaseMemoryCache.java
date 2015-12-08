// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.cache.memory;

import java.lang.ref.Reference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

// Referenced classes of package com.nostra13.universalimageloader.cache.memory:
//            MemoryCacheAware

public abstract class BaseMemoryCache
    implements MemoryCacheAware
{

    private final Map softMap = Collections.synchronizedMap(new HashMap());

    public BaseMemoryCache()
    {
    }

    public void clear()
    {
        softMap.clear();
    }

    protected abstract Reference createReference(Object obj);

    public Object get(Object obj)
    {
        Object obj1 = null;
        Reference reference = (Reference)softMap.get(obj);
        obj = obj1;
        if (reference != null)
        {
            obj = reference.get();
        }
        return obj;
    }

    public Collection keys()
    {
        HashSet hashset;
        synchronized (softMap)
        {
            hashset = new HashSet(softMap.keySet());
        }
        return hashset;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean put(Object obj, Object obj1)
    {
        softMap.put(obj, createReference(obj1));
        return true;
    }

    public void remove(Object obj)
    {
        softMap.remove(obj);
    }
}
