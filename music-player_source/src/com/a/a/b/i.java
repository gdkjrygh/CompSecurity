// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import com.a.a.b.e.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.a.a.b:
//            g, a, j, l, 
//            q

final class i
{

    final g a;
    private Executor b;
    private Executor c;
    private ExecutorService d;
    private final Map e = Collections.synchronizedMap(new HashMap());
    private final Map f = new WeakHashMap();
    private final AtomicBoolean g = new AtomicBoolean(false);
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final AtomicBoolean i = new AtomicBoolean(false);
    private final Object j = new Object();

    i(g g1)
    {
        a = g1;
        b = g1.i;
        c = g1.j;
        d = Executors.newCachedThreadPool();
    }

    static void a(i k)
    {
        k.e();
    }

    static Executor b(i k)
    {
        return k.c;
    }

    static Executor c(i k)
    {
        return k.b;
    }

    private void e()
    {
        if (!a.k && ((ExecutorService)b).isShutdown())
        {
            b = f();
        }
        if (!a.l && ((ExecutorService)c).isShutdown())
        {
            c = f();
        }
    }

    private Executor f()
    {
        return com.a.a.b.a.a(a.m, a.n, a.o);
    }

    final String a(a a1)
    {
        return (String)e.get(Integer.valueOf(a1.f()));
    }

    final AtomicBoolean a()
    {
        return g;
    }

    final ReentrantLock a(String s)
    {
        ReentrantLock reentrantlock1 = (ReentrantLock)f.get(s);
        ReentrantLock reentrantlock = reentrantlock1;
        if (reentrantlock1 == null)
        {
            reentrantlock = new ReentrantLock();
            f.put(s, reentrantlock);
        }
        return reentrantlock;
    }

    final void a(a a1, String s)
    {
        e.put(Integer.valueOf(a1.f()), s);
    }

    final void a(l l)
    {
        d.execute(new j(this, l));
    }

    final void a(q q)
    {
        e();
        c.execute(q);
    }

    final Object b()
    {
        return j;
    }

    final void b(a a1)
    {
        e.remove(Integer.valueOf(a1.f()));
    }

    final boolean c()
    {
        return h.get();
    }

    final boolean d()
    {
        return i.get();
    }
}
