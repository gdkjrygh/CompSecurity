// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ay.b;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.model.MapsEngineLayerInfo;
import com.google.android.m4b.maps.model.MapsEngineLayerOptions;
import com.google.android.m4b.maps.model.internal.j;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            z, cb, af, bz

public final class y extends com.google.android.m4b.maps.model.internal.j.a
    implements af.a, z.a
{
    public static interface a
        extends z.a
    {

        public abstract void a();

        public abstract void a(int i1);
    }


    private static final MapsEngineLayerOptions d = new MapsEngineLayerOptions();
    private static AtomicInteger e = new AtomicInteger(0);
    final z a;
    a b;
    public final String c;
    private final af f;
    private final b g;
    private final cb h;
    private final MapsEngineLayerInfo i;
    private boolean j;
    private float k;
    private boolean l;
    private boolean m;

    private y(MapsEngineLayerOptions mapsenginelayeroptions, af af1, cb cb1, z z1, b b1)
    {
        c = String.format("me%d", new Object[] {
            Integer.valueOf(e.getAndIncrement())
        });
        f = af1;
        h = cb1;
        g = b1;
        i = mapsenginelayeroptions.b;
        j = mapsenginelayeroptions.c;
        k = mapsenginelayeroptions.d;
        l = mapsenginelayeroptions.e;
        a = z1;
        a.a(this);
        af1 = a;
        af1.c = ((z) (af1)).b.schedule(af1, 0L, TimeUnit.MILLISECONDS);
        if (mapsenginelayeroptions.c != d.c)
        {
            h.b(cb.a.an);
        }
        if (mapsenginelayeroptions.d != d.d)
        {
            h.b(cb.a.am);
        }
        if (mapsenginelayeroptions.e != d.e)
        {
            h.b(cb.a.ao);
        }
    }

    static y a(MapsEngineLayerOptions mapsenginelayeroptions, bz bz, ScheduledExecutorService scheduledexecutorservice, m m1, af af1, cb cb1, b b1)
    {
        return new y(mapsenginelayeroptions, af1, cb1, new z(mapsenginelayeroptions.b, bz, scheduledexecutorservice, m1), b1);
    }

    private void a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!m)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        Exception exception;
        if (b != null)
        {
            b.a(i1);
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

    public final void a()
    {
        g.a();
        h.b(cb.a.y);
        b();
        f.b(this);
    }

    public final void a(float f1)
    {
        g.a();
        h.b(cb.a.aj);
        this;
        JVM INSTR monitorenter ;
        k = f1;
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

    public final void a(com.google.android.m4b.maps.ac.a a1)
    {
        b.a(a1);
    }

    public final void a(boolean flag)
    {
        g.a();
        h.b(cb.a.ak);
        this;
        JVM INSTR monitorenter ;
        j = flag;
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

    public final boolean a(j j1)
    {
        return equals(j1);
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!m)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        m = true;
        this;
        JVM INSTR monitorexit ;
        if (b != null)
        {
            b.a();
        }
        z z1 = a;
        Exception exception;
        if (z1.c != null)
        {
            z1.c.cancel(true);
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
        g.a();
        h.b(cb.a.ao);
        l = flag;
        a(1);
    }

    public final MapsEngineLayerInfo c()
    {
        g.a();
        return i;
    }

    public final float d()
    {
        g.a();
        return e();
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

    public final boolean f()
    {
        g.a();
        return g();
    }

    public final boolean g()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = j;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean h()
    {
        g.a();
        return i();
    }

    public final boolean i()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = l;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final int j()
    {
        return hashCode();
    }

}
