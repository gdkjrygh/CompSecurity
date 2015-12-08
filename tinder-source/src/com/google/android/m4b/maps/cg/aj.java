// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.ay.b;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.PolygonOptions;
import com.google.android.m4b.maps.model.internal.l;
import com.google.android.m4b.maps.y.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            ai, af, cb, bx

public final class aj extends com.google.android.m4b.maps.model.internal.l.a
    implements af.a, ai
{

    private static final PolygonOptions b = new PolygonOptions();
    private static AtomicInteger c = new AtomicInteger(0);
    ai.a a;
    private final String d;
    private final af e;
    private final cb f;
    private final b g;
    private ae h;
    private ae i;
    private ae j;
    private ae k;
    private int l;
    private int m;
    private float n;
    private float o;
    private boolean p;
    private boolean q;
    private boolean r;

    aj(PolygonOptions polygonoptions, af af1, cb cb1, b b1)
    {
        e = (af)com.google.android.m4b.maps.y.j.a(af1);
        f = (cb)com.google.android.m4b.maps.y.j.a(cb1);
        g = (b)com.google.android.m4b.maps.y.j.a(b1);
        d = String.format("pg%d", new Object[] {
            Integer.valueOf(c.getAndIncrement())
        });
        boolean flag;
        if (polygonoptions.d >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.a(flag, "line width is negative");
        n = polygonoptions.d;
        l = polygonoptions.e;
        m = polygonoptions.f;
        o = polygonoptions.g;
        q = polygonoptions.h;
        p = polygonoptions.i;
        h = c(polygonoptions.b);
        af1 = ae.g();
        for (cb1 = polygonoptions.c.iterator(); cb1.hasNext(); af1.c(c((List)cb1.next()))) { }
        j = af1.a();
        t();
        if (polygonoptions.e != b.e)
        {
            f.b(cb.a.K);
        }
        if (polygonoptions.d != b.d)
        {
            f.b(cb.a.J);
        }
        if (polygonoptions.i != b.i)
        {
            f.b(cb.a.O);
        }
        if (polygonoptions.h != b.h)
        {
            f.b(cb.a.N);
        }
        if (polygonoptions.g != b.g)
        {
            f.b(cb.a.M);
        }
        if (polygonoptions.c != b.c)
        {
            f.b(cb.a.I);
        }
    }

    private static ae c(List list)
    {
        com.google.android.m4b.maps.aa.ae.a a1 = ae.g();
        a1.b(list);
        if (!((LatLng)list.get(0)).equals(list.get(list.size() - 1)))
        {
            a1.c(list.get(0));
        }
        return a1.a();
    }

    private void c(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!r)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        Exception exception;
        if (a != null)
        {
            a.a(i1);
            return;
        } else
        {
            return;
        }
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void t()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (!p)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        i = bx.a(h);
        obj = ae.g();
        for (com.google.android.m4b.maps.aa.x x = j.a(); x.hasNext(); ((com.google.android.m4b.maps.aa.ae.a) (obj)).c(bx.a((ae)x.next()))) { }
        break MISSING_BLOCK_LABEL_66;
        obj;
        throw obj;
        k = ((com.google.android.m4b.maps.aa.ae.a) (obj)).a();
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        i = h;
        k = j;
          goto _L1
    }

    public final String a()
    {
        return d;
    }

    public final void a(float f1)
    {
        g.a();
        f.b(cb.a.J);
        boolean flag;
        if (f1 >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.a(flag, "line width is negative");
        this;
        JVM INSTR monitorenter ;
        n = f1;
        this;
        JVM INSTR monitorexit ;
        c(4);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i1)
    {
        g.a();
        f.b(cb.a.K);
        this;
        JVM INSTR monitorenter ;
        l = i1;
        this;
        JVM INSTR monitorexit ;
        c(8);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(List list)
    {
        g.a();
        f.b(cb.a.H);
        this;
        JVM INSTR monitorenter ;
        h = c(list);
        t();
        this;
        JVM INSTR monitorexit ;
        c(1);
        return;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
    }

    public final void a(boolean flag)
    {
        g.a();
        f.b(cb.a.O);
        this;
        JVM INSTR monitorenter ;
        p = flag;
        t();
        this;
        JVM INSTR monitorexit ;
        c(3);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean a(l l1)
    {
        return equals(l1);
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!r)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        r = true;
        this;
        JVM INSTR monitorexit ;
        Exception exception;
        if (a != null)
        {
            a.a();
            return;
        } else
        {
            return;
        }
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(float f1)
    {
        g.a();
        f.b(cb.a.M);
        this;
        JVM INSTR monitorenter ;
        o = f1;
        this;
        JVM INSTR monitorexit ;
        c(64);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(int i1)
    {
        g.a();
        f.b(cb.a.L);
        this;
        JVM INSTR monitorenter ;
        m = i1;
        this;
        JVM INSTR monitorexit ;
        c(16);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(List list)
    {
        com.google.android.m4b.maps.aa.ae.a a1;
        g.a();
        f.b(cb.a.I);
        a1 = ae.g();
        for (list = list.iterator(); list.hasNext(); a1.c(c((List)list.next()))) { }
        this;
        JVM INSTR monitorenter ;
        j = a1.a();
        t();
        this;
        JVM INSTR monitorexit ;
        c(2);
        return;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
    }

    public final void b(boolean flag)
    {
        g.a();
        f.b(cb.a.N);
        this;
        JVM INSTR monitorenter ;
        q = flag;
        this;
        JVM INSTR monitorexit ;
        c(32);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final ae c()
    {
        this;
        JVM INSTR monitorenter ;
        ae ae1 = i;
        this;
        JVM INSTR monitorexit ;
        return ae1;
        Exception exception;
        exception;
        throw exception;
    }

    public final ae d()
    {
        this;
        JVM INSTR monitorenter ;
        ae ae1 = k;
        this;
        JVM INSTR monitorexit ;
        return ae1;
        Exception exception;
        exception;
        throw exception;
    }

    public final float e()
    {
        this;
        JVM INSTR monitorenter ;
        float f1 = n;
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    public final int f()
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = l;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public final int g()
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = m;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean h()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = q;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final float i()
    {
        this;
        JVM INSTR monitorenter ;
        float f1 = o;
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void j()
    {
        g.a();
        f.b(cb.a.G);
        b();
        e.b(this);
    }

    public final List k()
    {
        g.a();
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist = com.google.android.m4b.maps.aa.f.a(h);
        this;
        JVM INSTR monitorexit ;
        return arraylist;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final List l()
    {
        g.a();
        this;
        JVM INSTR monitorenter ;
        Object obj1 = j;
        this;
        JVM INSTR monitorexit ;
        Object obj;
        obj = new ArrayList();
        for (obj1 = ((ae) (obj1)).a(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(com.google.android.m4b.maps.aa.f.a((ae)((Iterator) (obj1)).next()))) { }
        break MISSING_BLOCK_LABEL_65;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        return ((List) (obj));
    }

    public final int m()
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        g.a();
        i1 = f();
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public final int n()
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        g.a();
        i1 = g();
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public final float o()
    {
        this;
        JVM INSTR monitorenter ;
        float f1;
        g.a();
        f1 = e();
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    public final float p()
    {
        this;
        JVM INSTR monitorenter ;
        float f1;
        g.a();
        f1 = i();
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean q()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        g.a();
        flag = p;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean r()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        g.a();
        flag = h();
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final int s()
    {
        return hashCode();
    }

}
