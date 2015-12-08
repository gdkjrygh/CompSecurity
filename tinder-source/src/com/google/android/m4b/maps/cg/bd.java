// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.ay.b;
import com.google.android.m4b.maps.model.TileOverlayOptions;
import com.google.android.m4b.maps.model.internal.n;
import com.google.android.m4b.maps.model.u;
import com.google.android.m4b.maps.y.h;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            cb, af

public final class bd extends com.google.android.m4b.maps.model.internal.n.a
    implements af.a
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(int i1);

        public abstract void g();
    }


    private static final TileOverlayOptions c = new TileOverlayOptions();
    private static AtomicInteger d = new AtomicInteger(0);
    a a;
    public final u b;
    private final af e;
    private final cb f;
    private final String g;
    private final b h;
    private boolean i;
    private float j;
    private boolean k;
    private boolean l;

    public bd(TileOverlayOptions tileoverlayoptions, af af1, cb cb1, b b1)
    {
        g = String.format("to%d", new Object[] {
            Integer.valueOf(d.getAndIncrement())
        });
        e = af1;
        f = cb1;
        h = b1;
        b = tileoverlayoptions.c;
        i = tileoverlayoptions.d;
        j = tileoverlayoptions.e;
        k = tileoverlayoptions.f;
        l = false;
        if (tileoverlayoptions.d != c.d)
        {
            f.b(cb.a.ak);
        }
        if (tileoverlayoptions.e != c.e)
        {
            f.b(cb.a.aj);
        }
        if (tileoverlayoptions.f != c.f)
        {
            f.b(cb.a.al);
        }
    }

    private void a(int i1)
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

    public final String a()
    {
        return g;
    }

    public final void a(float f1)
    {
        h.a();
        f.b(cb.a.aj);
        this;
        JVM INSTR monitorenter ;
        j = f1;
        this;
        JVM INSTR monitorexit ;
        a(2);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(boolean flag)
    {
        h.a();
        f.b(cb.a.ak);
        this;
        JVM INSTR monitorenter ;
        i = flag;
        this;
        JVM INSTR monitorexit ;
        a(4);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean a(n n)
    {
        return equals(n);
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

    public final void b(boolean flag)
    {
        h.a();
        f.b(cb.a.al);
        this;
        JVM INSTR monitorenter ;
        k = flag;
        this;
        JVM INSTR monitorexit ;
        a(1);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c()
    {
        h.a();
        f.b(cb.a.y);
        b();
        e.b(this);
    }

    public final void d()
    {
        h.a();
        f.b(cb.a.ai);
        if (a != null)
        {
            a.g();
        }
    }

    public final float e()
    {
        this;
        JVM INSTR monitorenter ;
        float f1;
        h.a();
        f1 = f();
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    public final float f()
    {
        this;
        JVM INSTR monitorenter ;
        float f1 = j;
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean g()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        h.a();
        flag = h();
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean h()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = i;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean i()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        h.a();
        flag = j();
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean j()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = k;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final int k()
    {
        return hashCode();
    }

    public final String toString()
    {
        this;
        JVM INSTR monitorenter ;
        String s = com.google.android.m4b.maps.y.h.a(this).a("id", g).a("visible", i).a("zIndex", j).a("fadeIn", k).toString();
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

}
