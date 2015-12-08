// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.ay.b;
import com.google.android.m4b.maps.model.PolylineOptions;
import com.google.android.m4b.maps.model.internal.m;
import com.google.android.m4b.maps.y.j;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            ai, af, cb, bx

public final class ak extends com.google.android.m4b.maps.model.internal.m.a
    implements af.a, ai
{

    private static final PolylineOptions b = new PolylineOptions();
    private static AtomicInteger c = new AtomicInteger(0);
    ai.a a;
    private final String d;
    private final af e;
    private final cb f;
    private final b g;
    private ae h;
    private ae i;
    private int j;
    private float k;
    private boolean l;
    private float m;
    private boolean n;
    private boolean o;

    ak(PolylineOptions polylineoptions, af af1, cb cb1, b b1)
    {
        e = (af)com.google.android.m4b.maps.y.j.a(af1);
        f = (cb)com.google.android.m4b.maps.y.j.a(cb1);
        g = (b)com.google.android.m4b.maps.y.j.a(b1);
        d = String.format("pl%d", new Object[] {
            Integer.valueOf(c.getAndIncrement())
        });
        boolean flag;
        if (polylineoptions.c >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.a(flag, "line width is negative");
        k = polylineoptions.c;
        j = polylineoptions.d;
        m = polylineoptions.e;
        o = polylineoptions.f;
        n = polylineoptions.g;
        h = ae.a(polylineoptions.b);
        s();
        if (polylineoptions.d != b.d)
        {
            f.b(cb.a.B);
        }
        if (polylineoptions.c != b.c)
        {
            f.b(cb.a.A);
        }
        if (polylineoptions.g != b.g)
        {
            f.b(cb.a.E);
        }
        if (polylineoptions.f != b.f)
        {
            f.b(cb.a.D);
        }
        if (polylineoptions.e != b.e)
        {
            f.b(cb.a.C);
        }
    }

    private void b(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!l)
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

    private ae r()
    {
        this;
        JVM INSTR monitorenter ;
        ae ae1;
        g.a();
        ae1 = h;
        this;
        JVM INSTR monitorexit ;
        return ae1;
        Exception exception;
        exception;
        throw exception;
    }

    private void s()
    {
        this;
        JVM INSTR monitorenter ;
        ae ae1;
        if (!n)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        ae1 = bx.a(h);
_L1:
        i = ae1;
        this;
        JVM INSTR monitorexit ;
        return;
        ae1 = h;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    public final String a()
    {
        return d;
    }

    public final void a(float f1)
    {
        g.a();
        f.b(cb.a.A);
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
        k = f1;
        this;
        JVM INSTR monitorexit ;
        b(4);
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
        f.b(cb.a.B);
        this;
        JVM INSTR monitorenter ;
        j = i1;
        this;
        JVM INSTR monitorexit ;
        b(8);
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
        f.b(cb.a.z);
        this;
        JVM INSTR monitorenter ;
        h = ae.a(list);
        s();
        this;
        JVM INSTR monitorexit ;
        b(1);
        return;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
    }

    public final void a(boolean flag)
    {
        g.a();
        f.b(cb.a.E);
        this;
        JVM INSTR monitorenter ;
        n = flag;
        s();
        this;
        JVM INSTR monitorexit ;
        b(1);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean a(m m1)
    {
        return equals(m1);
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!l)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        l = true;
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
        f.b(cb.a.C);
        this;
        JVM INSTR monitorenter ;
        m = f1;
        this;
        JVM INSTR monitorexit ;
        b(64);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(boolean flag)
    {
        g.a();
        f.b(cb.a.D);
        this;
        JVM INSTR monitorenter ;
        o = flag;
        this;
        JVM INSTR monitorexit ;
        b(32);
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
        return ae.e();
    }

    public final float e()
    {
        this;
        JVM INSTR monitorenter ;
        float f1 = k;
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
        return 0;
    }

    public final boolean h()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = o;
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
        g.a();
        f.b(cb.a.y);
        b();
        e.b(this);
    }

    public final int k()
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

    public final float l()
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

    public final float m()
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

    public final boolean n()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        g.a();
        flag = n;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean o()
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

    public final int p()
    {
        return hashCode();
    }

    public final List q()
    {
        return r();
    }

}
