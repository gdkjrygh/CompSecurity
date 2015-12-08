// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.at;

import com.comscore.utils.f;
import com.comscore.utils.h;
import com.comscore.utils.n;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p.aq.b;
import p.as.a;

// Referenced classes of package p.at:
//            b, a, e

public class c
{

    b a;
    protected AtomicLong b;
    protected AtomicInteger c;
    protected AtomicLong d;
    protected AtomicInteger e;
    protected AtomicInteger f;
    protected Object g;
    private a h;

    public c(b b1)
    {
        h = null;
        g = new Object();
        c = new AtomicInteger(0);
        b = new AtomicLong(-1L);
        d = new AtomicLong(-1L);
        e = new AtomicInteger(0);
        f = new AtomicInteger(0);
        a = b1;
    }

    private void a(a a1)
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (h != null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        h = a1;
        h.b();
_L2:
        return;
        h.a(a1.a());
        if (true) goto _L2; else goto _L1
_L1:
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    static void a(c c1, p.at.b b1)
    {
        c1.d(b1);
    }

    private boolean b()
    {
        n n1;
        long l;
        boolean flag1;
        flag1 = false;
        n1 = a.r();
        l = com.comscore.utils.h.a();
        if (l >= b.get()) goto _L2; else goto _L1
_L1:
        c.set(0);
        b.set(l);
        e.set(0);
        d.set(l);
        n1.a("q_dcc", Integer.toString(e.get(), 10));
        n1.a("q_dcf", Long.toString(d.get(), 10));
_L4:
        boolean flag = flag1;
        if (c.get() < 20)
        {
            flag = flag1;
            if (e.get() < 6000)
            {
                c.incrementAndGet();
                e.getAndIncrement();
                n1.a("q_dcc", Integer.toString(e.get(), 10));
                flag = true;
            }
        }
        return flag;
_L2:
        if (l - b.get() > 1000L)
        {
            c.set(0);
            b.set(l);
        }
        if (l - d.get() > 0x5265c00L)
        {
            e.set(0);
            d.set(l);
            n1.a("q_dcc", Integer.toString(e.get(), 10));
            n1.a("q_dcf", Long.toString(d.get(), 10));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void d(p.at.b b1)
    {
        if (a.aq())
        {
            com.comscore.utils.c.a(this, (new StringBuilder()).append("sendMeasurmement: ").append(b1.a(a.ai())).toString());
            c(b1);
            if (!(b1 instanceof a))
            {
                b(b1);
                a(b1);
                (new p.au.b(a, b1)).b();
                return;
            }
        }
    }

    public void a()
    {
        n n1;
        if (a.aq())
        {
            if ((n1 = a.r()).a("q_dcc").booleanValue() && n1.a("q_dcf").booleanValue())
            {
                try
                {
                    int i = Integer.parseInt(n1.b("q_dcc"), 10);
                    long l = Long.parseLong(n1.b("q_dcf"), 10);
                    if (com.comscore.utils.h.a() >= l)
                    {
                        e.set(i);
                        d.set(l);
                        return;
                    }
                }
                catch (NumberFormatException numberformatexception)
                {
                    if (f.a)
                    {
                        com.comscore.utils.c.b(this, "Unexpected error parsing storage data: ");
                        com.comscore.utils.c.a(numberformatexception);
                        throw numberformatexception;
                    }
                }
            }
        }
    }

    protected void a(p.at.b b1)
    {
        if (a.aq())
        {
            b1.b(new p.at.a("c12", a.U(), Boolean.valueOf(false)));
            if (a.T() != null)
            {
                b1.b(new p.at.a("ns_ak", a.T(), Boolean.valueOf(false)));
                return;
            }
        }
    }

    public boolean a(p.at.b b1, boolean flag)
    {
        while (!a.aq() || b1 == null) 
        {
            return false;
        }
        if (!b() && a.r() != null)
        {
            com.comscore.utils.c.a(this, "Data not sent");
            return false;
        } else
        {
            return a.s().a(new e(this, b1), flag);
        }
    }

    public void b(p.at.b b1)
    {
        if (!a.aq())
        {
            return;
        } else
        {
            f.getAndIncrement();
            b1.b(new p.at.a("ns_ap_ec", String.valueOf(f), Boolean.valueOf(false)));
            return;
        }
    }

    public void c(p.at.b b1)
    {
        if (!a.aq())
        {
            return;
        }
        synchronized (g)
        {
            if (!(b1 instanceof a))
            {
                break MISSING_BLOCK_LABEL_41;
            }
            a((a)b1);
        }
        return;
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
        if (h == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        for (Iterator iterator = h.a().iterator(); iterator.hasNext(); b1.b((p.at.a)iterator.next())) { }
        h = null;
        obj;
        JVM INSTR monitorexit ;
    }
}
