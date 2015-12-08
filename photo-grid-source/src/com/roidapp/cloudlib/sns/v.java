// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import com.roidapp.baselib.c.ae;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            p, b, o, m, 
//            a

public final class v
{

    private static final int g = Math.max(1, Runtime.getRuntime().availableProcessors());
    private final BlockingQueue a = new LinkedBlockingQueue();
    private final BlockingQueue b = new LinkedBlockingQueue();
    private final Map c = new HashMap();
    private final p d = new p();
    private a e;
    private b f[];

    public v()
    {
        f = new b[g];
    }

    final p a()
    {
        return d;
    }

    public final void a(o o1)
    {
        String s = o1.p();
        Map map = c;
        map;
        JVM INSTR monitorenter ;
        o o2 = (o)c.remove(s);
        if (o2 == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        m.a((new StringBuilder("request in queue and cancel --- ")).append(o1.o()).append(" --- ").append(s).toString());
        o2.f();
        o2.s();
        c.put(s, o1);
        map;
        JVM INSTR monitorexit ;
        if (!o1.m() && o1.n())
        {
            m.b((new StringBuilder("add request to cache queue - ")).append(o1.o()).append(" --- ").append(s).toString());
            o1.a(this);
            a.add(o1);
            return;
        } else
        {
            m.b((new StringBuilder("add request to network queue - ")).append(o1.o()).append(" --- ").append(s).toString());
            o1.a(this);
            b.add(o1);
            return;
        }
        o1;
        map;
        JVM INSTR monitorexit ;
        throw o1;
    }

    public final void a(Object obj)
    {
        Map map = c;
        map;
        JVM INSTR monitorenter ;
        Iterator iterator = c.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            o o1 = (o)iterator.next();
            if (o1.t() == obj.hashCode())
            {
                String s = o1.p();
                m.a((new StringBuilder("cancel request by holder --- ")).append(obj).append(" url:").append(o1.o()).append(" --- ").append(s).toString());
                o1.f();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_116;
        obj;
        map;
        JVM INSTR monitorexit ;
        throw obj;
        map;
        JVM INSTR monitorexit ;
    }

    public final void b()
    {
        e = new a(a, b, d);
        e.start();
        for (int i = 0; i < g; i++)
        {
            f[i] = new b(b);
            f[i].start();
        }

    }

    final void b(o o1)
    {
        String s = o1.p();
        if (o1.r())
        {
            m.a((new StringBuilder("finish request, it has expired --- ")).append(o1.o()).append(" --- ").append(s).toString());
            return;
        }
        synchronized (c)
        {
            m.b((new StringBuilder("finish request - ")).append(o1.o()).append(" --- ").append(s).toString());
            c.remove(s);
        }
        return;
        o1;
        map;
        JVM INSTR monitorexit ;
        throw o1;
    }

    public final void c()
    {
        Map map = c;
        map;
        JVM INSTR monitorenter ;
        o o1;
        for (Iterator iterator = c.values().iterator(); iterator.hasNext(); o1.f())
        {
            o1 = (o)iterator.next();
            m.a((new StringBuilder("cancel all request url:")).append(o1.o()).append(" --- ").append(o1.p()).toString());
        }

        break MISSING_BLOCK_LABEL_87;
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        c.clear();
        map;
        JVM INSTR monitorexit ;
        if (e != null)
        {
            e.a();
            e = null;
        }
        for (int i = 0; i < g; i++)
        {
            if (f[i] != null)
            {
                f[i].a();
                f[i] = null;
            }
        }

        ae.a(this);
        return;
    }

}
