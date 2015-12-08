// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.h.a;

import com.c.a.a.u;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public final class a
{

    private final ConcurrentHashMap a;

    private a(ConcurrentHashMap concurrenthashmap)
    {
        a = (ConcurrentHashMap)u.a(concurrenthashmap);
    }

    public static a a()
    {
        return new a(new ConcurrentHashMap());
    }

    public final long a(Object obj)
    {
        obj = (AtomicLong)a.get(obj);
        if (obj == null)
        {
            return 0L;
        } else
        {
            return ((AtomicLong) (obj)).get();
        }
    }

    public final long b(Object obj)
    {
label0:
        do
        {
            AtomicLong atomiclong1 = (AtomicLong)a.get(obj);
            AtomicLong atomiclong = atomiclong1;
            if (atomiclong1 == null)
            {
                AtomicLong atomiclong2 = (AtomicLong)a.putIfAbsent(obj, new AtomicLong(1L));
                atomiclong = atomiclong2;
                if (atomiclong2 == null)
                {
                    return 1L;
                }
            }
            long l;
            long l1;
            do
            {
                l = atomiclong.get();
                if (l == 0L)
                {
                    if (a.replace(obj, atomiclong, new AtomicLong(1L)))
                    {
                        return 1L;
                    }
                    continue label0;
                }
                l1 = l + 1L;
            } while (!atomiclong.compareAndSet(l, l1));
            return l1;
        } while (true);
    }

    public final String toString()
    {
        return a.toString();
    }
}
