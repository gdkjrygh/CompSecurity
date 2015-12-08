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
//            iw, iq, ks

public final class iy
{

    final iw a;
    Executor b;
    public Executor c;
    public ExecutorService d;
    public final Map e = Collections.synchronizedMap(new HashMap());
    final AtomicBoolean f = new AtomicBoolean(false);
    final AtomicBoolean g = new AtomicBoolean(false);
    final AtomicBoolean h = new AtomicBoolean(false);
    final Object i = new Object();
    private final Map j = new WeakHashMap();

    iy(iw iw1)
    {
        a = iw1;
        b = iw1.i;
        c = iw1.j;
        d = Executors.newCachedThreadPool();
    }

    private Executor b()
    {
        return iq.a(a.m, a.n, a.o);
    }

    final String a(ks ks1)
    {
        return (String)e.get(Integer.valueOf(ks1.f()));
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

    public final void b(ks ks1)
    {
        e.remove(Integer.valueOf(ks1.f()));
    }
}
