// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package bo.app:
//            iq, ik, km

public final class is
{

    final iq a;
    Executor b;
    public Executor c;
    public ExecutorService d;
    public final Map e = Collections.synchronizedMap(new HashMap());
    final AtomicBoolean f = new AtomicBoolean(false);
    final AtomicBoolean g = new AtomicBoolean(false);
    final AtomicBoolean h = new AtomicBoolean(false);
    final Object i = new Object();
    private final Map j = new WeakHashMap();

    is(iq iq1)
    {
        a = iq1;
        b = iq1.i;
        c = iq1.j;
        d = Executors.newCachedThreadPool();
    }

    private Executor b()
    {
        return ik.a(a.m, a.n, a.o);
    }

    final String a(km km1)
    {
        return (String)e.get(Integer.valueOf(km1.f()));
    }

    public final ReentrantLock a(String s)
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

    public final void a()
    {
        if (!a.k && ((ExecutorService)b).isShutdown())
        {
            b = b();
        }
        if (!a.l && ((ExecutorService)c).isShutdown())
        {
            c = b();
        }
    }

    public final void b(km km1)
    {
        e.remove(Integer.valueOf(km1.f()));
    }
}
