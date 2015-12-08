// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class ajh
{

    public aif a;
    public AtomicLong b;
    public AtomicInteger c;
    private ajb d;
    private AtomicLong e;
    private AtomicInteger f;
    private AtomicInteger g;
    private Object h;

    public ajh(aif aif1)
    {
        d = null;
        h = new Object();
        f = new AtomicInteger(0);
        e = new AtomicLong(-1L);
        b = new AtomicLong(-1L);
        c = new AtomicInteger(0);
        g = new AtomicInteger(0);
        a = aif1;
    }

    public final boolean a(ajg ajg1)
    {
        while (!a.N || ajg1 == null) 
        {
            return false;
        }
        ajx ajx1 = a.b;
        long l = System.currentTimeMillis();
        boolean flag;
        if (l < e.get())
        {
            f.set(0);
            e.set(l);
            c.set(0);
            b.set(l);
            ajx1.a("q_dcc", Integer.toString(c.get(), 10));
            ajx1.a("q_dcf", Long.toString(b.get(), 10));
        } else
        {
            if (l - e.get() > 1000L)
            {
                f.set(0);
                e.set(l);
            }
            if (l - b.get() > 0x5265c00L)
            {
                c.set(0);
                b.set(l);
                ajx1.a("q_dcc", Integer.toString(c.get(), 10));
                ajx1.a("q_dcf", Long.toString(b.get(), 10));
            }
        }
        if (f.get() < 20 && c.get() < 6000)
        {
            f.incrementAndGet();
            c.getAndIncrement();
            ajx1.a("q_dcc", Integer.toString(c.get(), 10));
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && a.b != null)
        {
            ajn.a(this, "Data not sent");
            return false;
        } else
        {
            return a.e.a(new ajj(this, ajg1), false);
        }
    }

    public final void b(ajg ajg1)
    {
        if (!a.N)
        {
            return;
        } else
        {
            g.getAndIncrement();
            ajg1.a(new ajf("ns_ap_ec", String.valueOf(g), Boolean.valueOf(false)));
            return;
        }
    }

    public final void c(ajg ajg1)
    {
        if (!a.N)
        {
            return;
        }
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        if (!(ajg1 instanceof ajb))
        {
            break MISSING_BLOCK_LABEL_205;
        }
        obj1 = (ajb)ajg1;
        ajg1 = ((ajg) (h));
        ajg1;
        JVM INSTR monitorenter ;
        Object obj2;
        if (d != null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        d = ((ajb) (obj1));
        obj1 = d;
        obj2 = new ArrayList();
        Iterator iterator1 = ((ajb) (obj1)).a.values().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            ajf ajf2 = (ajf)iterator1.next();
            if (ajb.a(ajf2.b).booleanValue())
            {
                ((ArrayList) (obj2)).add(ajf2);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_134;
        obj1;
        ajg1;
        JVM INSTR monitorexit ;
        throw obj1;
        ajg1;
        obj;
        JVM INSTR monitorexit ;
        throw ajg1;
        ajf ajf1;
        for (obj2 = ((ArrayList) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); ((ajb) (obj1)).a(ajf1.a, ajb.a(ajf1.b, ""), Boolean.valueOf(true)))
        {
            ajf1 = (ajf)((Iterator) (obj2)).next();
        }

        break MISSING_BLOCK_LABEL_200;
        d.a(((ajb) (obj1)).a());
        ajg1;
        JVM INSTR monitorexit ;
        obj;
        JVM INSTR monitorexit ;
        return;
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        for (Iterator iterator = d.a().iterator(); iterator.hasNext(); ajg1.a((ajf)iterator.next())) { }
        d = null;
        obj;
        JVM INSTR monitorexit ;
    }
}
