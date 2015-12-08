// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.google.android.m4b.maps.ay.b;
import com.google.android.m4b.maps.model.GroundOverlayOptions;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.model.internal.f;
import com.google.android.m4b.maps.y.j;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            af, cb, bl, bm, 
//            bx

public final class cc extends com.google.android.m4b.maps.model.internal.f.a
    implements af.a
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(int i1);
    }


    private static final GroundOverlayOptions b = new GroundOverlayOptions();
    private static AtomicInteger w = new AtomicInteger(0);
    public a a;
    private final String c;
    private final af d;
    private final cb e;
    private LatLngBounds f;
    private float g;
    private float h;
    private LatLng i;
    private float j;
    private int k;
    private int l;
    private bl m;
    private float n;
    private float o;
    private float p;
    private final bm q;
    private float r;
    private boolean s;
    private boolean t;
    private final b u;
    private final Resources v;

    public cc(GroundOverlayOptions groundoverlayoptions, af af1, bm bm1, cb cb1, b b1, Resources resources)
    {
label0:
        {
            boolean flag1 = false;
            super();
            d = (af)com.google.android.m4b.maps.y.j.a(af1);
            e = (cb)com.google.android.m4b.maps.y.j.a(cb1);
            c = String.format("go%d", new Object[] {
                Integer.valueOf(w.getAndIncrement())
            });
            q = bm1;
            u = b1;
            v = resources;
            boolean flag;
            if (groundoverlayoptions.d >= 0.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.a(flag, "line width is negative");
            if (groundoverlayoptions.b != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.a(flag, "Options doesn't specify an image");
            o = groundoverlayoptions.k;
            p = groundoverlayoptions.l;
            s = groundoverlayoptions.i;
            r = groundoverlayoptions.h;
            n = groundoverlayoptions.j;
            m = bl.a(groundoverlayoptions.b, v);
            q.a(m);
            k = q.b(m).b.getHeight();
            l = q.b(m).b.getWidth();
            if (groundoverlayoptions.c == null)
            {
                flag = flag1;
                if (groundoverlayoptions.f == null)
                {
                    break label0;
                }
            }
            flag = true;
        }
        com.google.android.m4b.maps.y.j.a(flag, "Options doesn't specify a position");
        if (groundoverlayoptions.f != null)
        {
            f = groundoverlayoptions.f;
            u();
        } else
        {
            i = groundoverlayoptions.c;
            g = groundoverlayoptions.d;
            float f1;
            if (groundoverlayoptions.e != -1F)
            {
                f1 = groundoverlayoptions.e;
            } else
            {
                f1 = ((float)k / (float)l) * g;
            }
            h = f1;
            v();
        }
        j = groundoverlayoptions.g;
        if (groundoverlayoptions.g != b.g)
        {
            e.b(cb.a.aa);
        }
        if (groundoverlayoptions.j != b.j)
        {
            e.b(cb.a.af);
        }
        if (groundoverlayoptions.i != b.i)
        {
            e.b(cb.a.ae);
        }
        if (groundoverlayoptions.h != b.h)
        {
            e.b(cb.a.ad);
        }
    }

    private void a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!t)
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

    private float b(LatLngBounds latlngbounds)
    {
        this;
        JVM INSTR monitorenter ;
        double d1;
        double d2;
        LatLng latlng = i;
        d2 = bx.a(latlngbounds.c.c, latlngbounds.b.c);
        d1 = Math.cos(Math.toRadians(latlng.b));
        d2 = Math.toRadians(d2);
        float f1 = (float)(d1 * (d2 * 6371009D));
        this;
        JVM INSTR monitorexit ;
        return f1;
        latlngbounds;
        throw latlngbounds;
    }

    private float c(LatLngBounds latlngbounds)
    {
        this;
        JVM INSTR monitorenter ;
        double d1 = Math.toRadians(latlngbounds.c.b - latlngbounds.b.b);
        float f1 = (float)(d1 * 6371009D);
        this;
        JVM INSTR monitorexit ;
        return f1;
        latlngbounds;
        throw latlngbounds;
    }

    private void u()
    {
        this;
        JVM INSTR monitorenter ;
        double d2;
        double d3;
        double d4;
        double d5;
        LatLngBounds latlngbounds = f;
        d3 = latlngbounds.c.b;
        d4 = latlngbounds.b.b;
        d2 = latlngbounds.c.c;
        d5 = latlngbounds.b.c;
        double d1;
        d1 = d2;
        if (d2 < d5)
        {
            d1 = d2 + 360D;
        }
        float f1;
        float f2;
        f1 = o;
        f2 = p;
        double d6;
        double d7;
        d2 = 1.0F - f2;
        d6 = f2;
        d7 = 1.0F - f1;
        i = new LatLng(d3 * d2 + d4 * d6, d1 * (double)f1 + d5 * d7);
        g = b(f);
        h = c(f);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void v()
    {
        this;
        JVM INSTR monitorenter ;
        f = bx.a(i, o, p, bx.a(h), bx.a(i, g));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final String a()
    {
        return c;
    }

    public final void a(float f1)
    {
        u.a();
        e.b(cb.a.aa);
        this;
        JVM INSTR monitorenter ;
        j = f1;
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

    public final void a(float f1, float f2)
    {
        u.a();
        e.b(cb.a.ab);
        this;
        JVM INSTR monitorenter ;
        g = f1;
        if (f2 == -1F) goto _L2; else goto _L1
_L1:
        h = f2;
        v();
        this;
        JVM INSTR monitorexit ;
        a(2);
        return;
_L2:
        f2 = ((float)k / (float)l) * f1;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(com.google.android.m4b.maps.da.b b1)
    {
        u.a();
        e.b(cb.a.ag);
        this;
        JVM INSTR monitorenter ;
        q.c(m);
        m = bl.a(b1, v);
        q.a(m);
        k = q.b(m).b.getHeight();
        l = q.b(m).b.getWidth();
        this;
        JVM INSTR monitorexit ;
        a(4);
        return;
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public final void a(LatLng latlng)
    {
        u.a();
        e.b(cb.a.ac);
        this;
        JVM INSTR monitorenter ;
        i = latlng;
        v();
        this;
        JVM INSTR monitorexit ;
        a(16);
        return;
        latlng;
        this;
        JVM INSTR monitorexit ;
        throw latlng;
    }

    public final void a(LatLngBounds latlngbounds)
    {
        u.a();
        this;
        JVM INSTR monitorenter ;
        f = latlngbounds;
        u();
        this;
        JVM INSTR monitorexit ;
        a(16);
        return;
        latlngbounds;
        this;
        JVM INSTR monitorexit ;
        throw latlngbounds;
    }

    public final void a(boolean flag)
    {
        u.a();
        e.b(cb.a.ae);
        this;
        JVM INSTR monitorenter ;
        s = flag;
        this;
        JVM INSTR monitorexit ;
        a(32);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean a(f f1)
    {
        return equals(f1);
    }

    public final void b()
    {
        if (a != null)
        {
            a.a();
        }
        this;
        JVM INSTR monitorenter ;
        if (!t)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        t = true;
        q.c(m);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(float f1)
    {
        a(f1, -1F);
    }

    public final void c()
    {
        u.a();
        e.b(cb.a.Z);
        b();
        d.b(this);
    }

    public final void c(float f1)
    {
        u.a();
        e.b(cb.a.af);
        boolean flag;
        if (f1 >= 0.0F && f1 <= 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.a(flag, "Transparency must be in the range [0..1]");
        this;
        JVM INSTR monitorenter ;
        n = f1;
        this;
        JVM INSTR monitorexit ;
        a(64);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final float d()
    {
        this;
        JVM INSTR monitorenter ;
        float f1;
        u.a();
        f1 = e();
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void d(float f1)
    {
        u.a();
        e.b(cb.a.ad);
        this;
        JVM INSTR monitorenter ;
        r = f1;
        this;
        JVM INSTR monitorexit ;
        a(8);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final float e()
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

    public final LatLngBounds f()
    {
        this;
        JVM INSTR monitorenter ;
        LatLngBounds latlngbounds;
        u.a();
        latlngbounds = g();
        this;
        JVM INSTR monitorexit ;
        return latlngbounds;
        Exception exception;
        exception;
        throw exception;
    }

    public final LatLngBounds g()
    {
        this;
        JVM INSTR monitorenter ;
        LatLngBounds latlngbounds = f;
        this;
        JVM INSTR monitorexit ;
        return latlngbounds;
        Exception exception;
        exception;
        throw exception;
    }

    public final LatLng h()
    {
        this;
        JVM INSTR monitorenter ;
        LatLng latlng;
        u.a();
        latlng = i;
        this;
        JVM INSTR monitorexit ;
        return latlng;
        Exception exception;
        exception;
        throw exception;
    }

    public final float i()
    {
        this;
        JVM INSTR monitorenter ;
        float f1;
        u.a();
        f1 = h;
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    public final float j()
    {
        this;
        JVM INSTR monitorenter ;
        float f1;
        u.a();
        f1 = g;
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    public final float k()
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

    public final float l()
    {
        this;
        JVM INSTR monitorenter ;
        float f1 = p;
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
        u.a();
        f1 = n();
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

    public final float n()
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

    public final float o()
    {
        this;
        JVM INSTR monitorenter ;
        float f1;
        u.a();
        f1 = p();
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
        float f1 = r;
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
        u.a();
        flag = r();
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
        boolean flag = s;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final bm.a s()
    {
        this;
        JVM INSTR monitorenter ;
        bm.a a1 = q.b(m);
        this;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    public final int t()
    {
        return hashCode();
    }

}
