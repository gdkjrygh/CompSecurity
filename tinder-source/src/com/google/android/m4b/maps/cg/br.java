// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.ay.b;
import com.google.android.m4b.maps.model.CircleOptions;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.internal.e;
import com.google.android.m4b.maps.y.j;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            ai, af, cb, bx

public final class br extends com.google.android.m4b.maps.model.internal.e.a
    implements af.a, ai
{

    private static final CircleOptions b = new CircleOptions();
    private static final AtomicInteger c = new AtomicInteger(0);
    ai.a a;
    private final String d;
    private final af e;
    private final cb f;
    private LatLng g;
    private double h;
    private ae i;
    private int j;
    private int k;
    private float l;
    private float m;
    private boolean n;
    private boolean o;
    private final b p;

    br(CircleOptions circleoptions, af af1, cb cb1, b b1)
    {
        boolean flag1 = true;
        super();
        e = (af)com.google.android.m4b.maps.y.j.a(af1);
        f = (cb)com.google.android.m4b.maps.y.j.a(cb1);
        p = (b)com.google.android.m4b.maps.y.j.a(b1);
        d = String.format("ci%d", new Object[] {
            Integer.valueOf(c.getAndIncrement())
        });
        boolean flag;
        if (circleoptions.d >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.a(flag, "line width is negative");
        com.google.android.m4b.maps.y.j.a(circleoptions.b);
        if (circleoptions.c >= 0.0D)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.a(flag, "radius is negative");
        g = circleoptions.b;
        h = circleoptions.c;
        l = circleoptions.d;
        j = circleoptions.e;
        k = circleoptions.f;
        m = circleoptions.g;
        n = circleoptions.h;
        i = com.google.android.m4b.maps.cg.bx.b(g, h);
        if (circleoptions.f != b.f)
        {
            f.b(cb.a.V);
        }
        if (circleoptions.e != b.e)
        {
            f.b(cb.a.U);
        }
        if (circleoptions.d != b.d)
        {
            f.b(cb.a.T);
        }
        if (circleoptions.h != b.h)
        {
            f.b(cb.a.X);
        }
        if (circleoptions.g != b.g)
        {
            f.b(cb.a.W);
        }
    }

    private void c(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!o)
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

    public final String a()
    {
        return d;
    }

    public final void a(double d1)
    {
        p.a();
        f.b(cb.a.S);
        this;
        JVM INSTR monitorenter ;
        h = d1;
        i = com.google.android.m4b.maps.cg.bx.b(g, d1);
        this;
        JVM INSTR monitorexit ;
        c(1);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(float f1)
    {
        p.a();
        f.b(cb.a.T);
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
        l = f1;
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
        p.a();
        f.b(cb.a.U);
        this;
        JVM INSTR monitorenter ;
        j = i1;
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

    public final void a(LatLng latlng)
    {
        p.a();
        f.b(cb.a.R);
        this;
        JVM INSTR monitorenter ;
        g = latlng;
        i = com.google.android.m4b.maps.cg.bx.b(latlng, h);
        this;
        JVM INSTR monitorexit ;
        c(1);
        return;
        latlng;
        this;
        JVM INSTR monitorexit ;
        throw latlng;
    }

    public final void a(boolean flag)
    {
        p.a();
        f.b(cb.a.X);
        this;
        JVM INSTR monitorenter ;
        n = flag;
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

    public final boolean a(e e1)
    {
        return equals(e1);
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!o)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        o = true;
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
        p.a();
        f.b(cb.a.W);
        this;
        JVM INSTR monitorenter ;
        m = f1;
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
        p.a();
        f.b(cb.a.V);
        this;
        JVM INSTR monitorenter ;
        k = i1;
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
        ae ae1 = ae.e();
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
        float f1 = l;
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
        int i1 = j;
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
        int i1 = k;
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
        boolean flag = n;
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
        float f1 = m;
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void j()
    {
        p.a();
        f.b(cb.a.Q);
        b();
        e.b(this);
    }

    public final LatLng k()
    {
        this;
        JVM INSTR monitorenter ;
        LatLng latlng;
        p.a();
        latlng = g;
        this;
        JVM INSTR monitorexit ;
        return latlng;
        Exception exception;
        exception;
        throw exception;
    }

    public final double l()
    {
        this;
        JVM INSTR monitorenter ;
        double d1;
        p.a();
        d1 = h;
        this;
        JVM INSTR monitorexit ;
        return d1;
        Exception exception;
        exception;
        throw exception;
    }

    public final int m()
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        p.a();
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
        p.a();
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
        p.a();
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
        p.a();
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
        p.a();
        flag = h();
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final int r()
    {
        return hashCode();
    }

}
