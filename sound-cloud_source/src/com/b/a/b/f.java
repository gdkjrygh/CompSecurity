// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b;

import com.b.a.b.e.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.b.a.b:
//            e, a

final class f
{

    final e a;
    Executor b;
    Executor c;
    Executor d;
    final Map e = Collections.synchronizedMap(new HashMap());
    final AtomicBoolean f = new AtomicBoolean(false);
    final AtomicBoolean g = new AtomicBoolean(false);
    final AtomicBoolean h = new AtomicBoolean(false);
    final Object i = new Object();
    private final Map j = new WeakHashMap();

    f(e e1)
    {
        a = e1;
        b = e1.g;
        c = e1.h;
        d = Executors.newCachedThreadPool(com.b.a.b.a.a(5, "uil-pool-d-"));
    }

    private Executor b()
    {
        return com.b.a.b.a.a(a.k, a.l, a.m);
    }

    final String a(a a1)
    {
        return (String)e.get(Integer.valueOf(a1.f()));
    }

    final ReentrantLock a(String s)
    {
        ReentrantLock reentrantlock1 = (ReentrantLock)j.get(s);
        ReentrantLock reentrantlock = reentrantlock1;
        if (reentrantlock1 == null)
        {
            reentrantlock = new ReentrantLock();
            j.put(s, reentrantlock);
        }
        return reentrantlock;
    }

    final void a()
    {
        if (!a.i && ((ExecutorService)b).isShutdown())
        {
            b = b();
        }
        if (!a.j && ((ExecutorService)c).isShutdown())
        {
            c = b();
        }
    }

    final void b(a a1)
    {
        e.remove(Integer.valueOf(a1.f()));
    }
}
