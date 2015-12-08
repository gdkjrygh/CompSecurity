// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ag;
import com.nuance.b.b.a.am;
import com.nuance.b.b.a.e;
import com.nuance.b.b.a.f;
import com.nuance.b.b.a.m;
import com.nuance.b.b.a.o;
import com.nuance.b.b.a.r;
import com.nuance.b.b.a.z;
import com.nuance.b.c.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.nuance.b.b:
//            cx, dn, ci, ce, 
//            da, dh, cy, do, 
//            dd, dk, co, ct, 
//            cc, cb, dg, ca, 
//            dt, di, cf, dj, 
//            ch, cg, at, du

public final class bx
{

    private static ExecutorService v = Executors.newSingleThreadExecutor();
    volatile at a;
    volatile du b;
    private List c;
    private List d;
    private List e;
    private List f;
    private List g;
    private List h;
    private List i;
    private List j;
    private List k;
    private ci l;
    private ce m;
    private da n;
    private dh o;
    private cy p;
    private do q;
    private dd r;
    private dk s;
    private co t;
    private ct u;

    bx()
    {
        c = new ArrayList();
        d = new ArrayList();
        e = new ArrayList();
        f = new ArrayList();
        g = new ArrayList();
        h = new ArrayList();
        i = new ArrayList();
        j = new ArrayList();
        k = new ArrayList();
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
    }

    static List a(bx bx1)
    {
        return bx1.c;
    }

    static ci b(bx bx1)
    {
        return bx1.l;
    }

    static List c(bx bx1)
    {
        return bx1.e;
    }

    static List d(bx bx1)
    {
        return bx1.f;
    }

    static ExecutorService d()
    {
        return v;
    }

    static List e(bx bx1)
    {
        return bx1.g;
    }

    static List f(bx bx1)
    {
        return bx1.h;
    }

    static List g(bx bx1)
    {
        return bx1.i;
    }

    static List h(bx bx1)
    {
        return bx1.j;
    }

    static List i(bx bx1)
    {
        return bx1.k;
    }

    final b a(b b1)
    {
        b b2 = new b(b1.b());
        ci ci1 = l;
        b2.a(new cx(ci1));
        b2.b(new dn(ci1));
        b1.a(b2);
        return b2;
    }

    final void a()
    {
        l = new ci(this);
        m = new ce(this);
        n = new da(this);
        o = new dh(this);
        p = new cy(this);
        q = new do(this);
        r = new dd(this);
        s = new dk(this);
        t = new co(this);
        u = new ct(this);
    }

    public final void a(ag ag)
    {
        synchronized (j)
        {
            if (!j.contains(ag))
            {
                j.add(ag);
            }
        }
        return;
        ag;
        list;
        JVM INSTR monitorexit ;
        throw ag;
    }

    public final void a(am am)
    {
        if (am == null)
        {
            return;
        }
        synchronized (k)
        {
            if (!k.contains(am))
            {
                k.add(am);
            }
        }
        return;
        am;
        list;
        JVM INSTR monitorexit ;
        throw am;
    }

    public final void a(e e1)
    {
        if (e1 == null)
        {
            return;
        }
        synchronized (c)
        {
            if (!c.contains(e1))
            {
                c.add(e1);
            }
        }
        return;
        e1;
        list;
        JVM INSTR monitorexit ;
        throw e1;
    }

    final void a(f f1)
    {
        l.onConnectionLost(f1);
    }

    public final void a(m m1)
    {
        if (m1 == null)
        {
            return;
        }
        synchronized (d)
        {
            if (!d.contains(m1))
            {
                d.add(m1);
            }
        }
        return;
        m1;
        list;
        JVM INSTR monitorexit ;
        throw m1;
    }

    public final void a(o o1)
    {
        if (o1 == null)
        {
            return;
        }
        synchronized (e)
        {
            if (!e.contains(o1))
            {
                e.add(o1);
            }
        }
        return;
        o1;
        list;
        JVM INSTR monitorexit ;
        throw o1;
    }

    public final void a(r r1)
    {
        if (r1 == null)
        {
            return;
        }
        synchronized (f)
        {
            if (!f.contains(r1))
            {
                f.add(r1);
            }
        }
        return;
        r1;
        list;
        JVM INSTR monitorexit ;
        throw r1;
    }

    public final void a(z z)
    {
        if (z == null)
        {
            return;
        }
        synchronized (h)
        {
            if (!h.contains(z))
            {
                h.add(z);
            }
        }
        return;
        z;
        list;
        JVM INSTR monitorexit ;
        throw z;
    }

    final b b()
    {
        b b1 = new b();
        ci ci1 = l;
        b1.a(new cc(ci1));
        b1.b(new cb(ci1));
        return b1;
    }

    final b b(b b1)
    {
        b b2 = new b(b1.b());
        r.b(b2);
        b2.c(new dg(u));
        n.a(b2);
        o.a(b2);
        b1.a(b2);
        return b2;
    }

    public final void b(ag ag)
    {
        synchronized (j)
        {
            j.remove(ag);
        }
        return;
        ag;
        list;
        JVM INSTR monitorexit ;
        throw ag;
    }

    public final void b(am am)
    {
        synchronized (k)
        {
            k.remove(am);
        }
        return;
        am;
        list;
        JVM INSTR monitorexit ;
        throw am;
    }

    public final void b(e e1)
    {
        synchronized (c)
        {
            c.remove(e1);
        }
        return;
        e1;
        list;
        JVM INSTR monitorexit ;
        throw e1;
    }

    public final void b(o o1)
    {
        synchronized (e)
        {
            e.remove(o1);
        }
        return;
        o1;
        list;
        JVM INSTR monitorexit ;
        throw o1;
    }

    public final void b(r r1)
    {
        synchronized (f)
        {
            f.remove(r1);
        }
        return;
        r1;
        list;
        JVM INSTR monitorexit ;
        throw r1;
    }

    final b c()
    {
        b b1 = new b();
        co co1 = t;
        b1.a(new ca(co1));
        b1.b(new dt(co1));
        b1.c(new di(co1));
        p.a(b1);
        return b1;
    }

    final b c(b b1)
    {
        b b2 = new b(b1.b());
        do do1 = q;
        b2.a(new cf(do1));
        b2.b(new dj(do1));
        b1.a(b2);
        return b2;
    }

    final b d(b b1)
    {
        b b2 = new b(b1.b());
        r.a(b2);
        b1.a(b2);
        return b2;
    }

    final b e(b b1)
    {
        b b2 = new b(b1.b());
        dk dk1 = s;
        b2.a(new ch(dk1));
        b2.b(new cg(dk1));
        b1.a(b2);
        return b2;
    }

    final b f(b b1)
    {
        b b2 = new b(b1.b());
        r.c(b2);
        b1.a(b2);
        return b2;
    }

    final b g(b b1)
    {
        b b2 = new b(b1.b());
        r.b(b2);
        b2.c(new dg(u));
        n.b(b2);
        o.a(b2);
        b1.a(b2);
        return b2;
    }

}
