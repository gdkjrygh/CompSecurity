// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.kik.g:
//            k, f, ap, ar, 
//            i, e

public class ao
{

    private k a;
    private k b;
    private f c;
    private CopyOnWriteArrayList d;
    private AtomicLong e;
    private i f;

    public ao()
    {
        a = new k(this);
        b = new k(this);
        c = new f();
        d = new CopyOnWriteArrayList();
        e = new AtomicLong();
        f = new ap(this);
    }

    static void a(ao ao1, ar ar1)
    {
        CopyOnWriteArrayList copyonwritearraylist = ao1.d;
        copyonwritearraylist;
        JVM INSTR monitorenter ;
        if (!ao1.d.contains(ar1))
        {
            throw new IllegalStateException("Ticket already added to resource");
        }
        break MISSING_BLOCK_LABEL_33;
        ao1;
        copyonwritearraylist;
        JVM INSTR monitorexit ;
        throw ao1;
        ao1.c.b(ar1.a(), ao1.f);
        if (ar1.b())
        {
            ao1.a(false);
        }
        ao1.d.remove(ar1);
        copyonwritearraylist;
        JVM INSTR monitorexit ;
    }

    private void a(boolean flag)
    {
        AtomicLong atomiclong = e;
        atomiclong;
        JVM INSTR monitorenter ;
        long l1 = e.get();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        long l = e.incrementAndGet();
_L1:
        atomiclong;
        JVM INSTR monitorexit ;
        if (l < 0L)
        {
            throw new IllegalStateException("Holders can never be less than 0");
        }
        break MISSING_BLOCK_LABEL_65;
        l = e.decrementAndGet();
          goto _L1
        Exception exception;
        exception;
        atomiclong;
        JVM INSTR monitorexit ;
        throw exception;
        if (l > 0L && l1 == 0L)
        {
            a();
        } else
        if (l == 0L && l1 > 0L)
        {
            b();
            return;
        }
        return;
    }

    protected void a()
    {
        a.a(null);
    }

    protected void b()
    {
        b.a(null);
    }

    public final e d()
    {
        return b.a();
    }

    public final void e()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((ar)iterator.next()).c()) { }
    }

    public final ar f()
    {
        Object obj = new ar();
        CopyOnWriteArrayList copyonwritearraylist = d;
        copyonwritearraylist;
        JVM INSTR monitorenter ;
        if (d.contains(obj))
        {
            throw new IllegalStateException("Ticket already added to resource");
        }
        break MISSING_BLOCK_LABEL_41;
        obj;
        copyonwritearraylist;
        JVM INSTR monitorexit ;
        throw obj;
        if (((ar) (obj)).b())
        {
            a(true);
        }
        c.a(((ar) (obj)).a(), f);
        d.add(obj);
        copyonwritearraylist;
        JVM INSTR monitorexit ;
        return ((ar) (obj));
    }
}
