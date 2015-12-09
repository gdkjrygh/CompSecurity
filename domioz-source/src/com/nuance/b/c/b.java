// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.nuance.b.c:
//            a, i, c, g, 
//            f, d, e, j, 
//            h

public class b
    implements a
{

    private static AtomicLong h = new AtomicLong(1L);
    private ExecutorService a;
    private ArrayList b;
    private ArrayList c;
    private ArrayList d;
    private i e;
    private Object f;
    private Object g;
    private final long i;

    public b()
    {
        this(h.getAndIncrement());
    }

    public b(long l)
    {
        b = new ArrayList(1);
        c = new ArrayList(1);
        d = new ArrayList(1);
        e = i.a;
        f = null;
        g = null;
        i = l;
        a = Executors.newSingleThreadExecutor();
    }

    private void a(j j1, Object obj)
    {
        a.execute(new c(this, j1, obj));
    }

    public final h a(b b1)
    {
        if (b1 == null)
        {
            throw new NullPointerException("output cannot be null");
        } else
        {
            g g1 = new g(this, b1);
            f f1 = new f(this, b1);
            d d1 = new d(this, b1);
            a(((j) (g1)));
            b(f1);
            c(d1);
            return b1;
        }
    }

    public final void a(j j1)
    {
        this;
        JVM INSTR monitorenter ;
        e.a[e.ordinal()];
        JVM INSTR tableswitch 1 3: default 96
    //                   1 72
    //                   2 84
    //                   3 81;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new UnsupportedOperationException((new StringBuilder("Unknown deferred state: ")).append(e).toString());
        j1;
        this;
        JVM INSTR monitorexit ;
        throw j1;
_L2:
        a(j1, f);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        b.add(j1);
          goto _L4
    }

    public void a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        i k;
        i l;
        k = i.a;
        l = e;
        if (k == l) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        e = i.b;
        f = obj;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); a((j)iterator.next(), obj)) { }
        break MISSING_BLOCK_LABEL_70;
        obj;
        throw obj;
        c = null;
        b = null;
        d = null;
        notifyAll();
          goto _L1
    }

    public final long b()
    {
        return i;
    }

    public final void b(j j1)
    {
        this;
        JVM INSTR monitorenter ;
        e.a[e.ordinal()];
        JVM INSTR tableswitch 1 3: default 96
    //                   1 81
    //                   2 84
    //                   3 72;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new UnsupportedOperationException((new StringBuilder("Unknown deferred state: ")).append(e).toString());
        j1;
        this;
        JVM INSTR monitorexit ;
        throw j1;
_L4:
        a(j1, g);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        c.add(j1);
          goto _L2
    }

    public void b(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        i k;
        i l;
        k = i.a;
        l = e;
        if (k == l) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        e = i.c;
        g = obj;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); a((j)iterator.next(), obj)) { }
        break MISSING_BLOCK_LABEL_70;
        obj;
        throw obj;
        c = null;
        b = null;
        d = null;
        notifyAll();
          goto _L1
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        b(null);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c(j j1)
    {
        this;
        JVM INSTR monitorenter ;
        if (i.a == e)
        {
            d.add(j1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        j1;
        throw j1;
    }

    public final i d()
    {
        this;
        JVM INSTR monitorenter ;
        i k = e;
        this;
        JVM INSTR monitorexit ;
        return k;
        Exception exception;
        exception;
        throw exception;
    }

    public final void d(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        i k;
        i l;
        k = i.a;
        l = e;
        if (k == l) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Iterator iterator = d.iterator();
        while (iterator.hasNext()) 
        {
            a((j)iterator.next(), obj);
        }
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        throw obj;
    }

}
