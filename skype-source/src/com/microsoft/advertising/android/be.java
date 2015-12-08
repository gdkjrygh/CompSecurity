// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import java.util.Map;

// Referenced classes of package com.microsoft.advertising.android:
//            az, ay, by, AdWebView, 
//            an

public final class be extends az
{

    private float c;
    private float d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private float j;
    private float k;
    private float l;
    private float m;
    private ay.a n;

    public be(AdWebView adwebview)
    {
        super(adwebview);
        c = 0.05F;
        d = 5F;
        e = 10000;
        f = 1000;
        g = 0;
        h = 0;
        i = 0;
        j = 0.0F;
        k = 0.0F;
        l = 0.0F;
        m = 0.0F;
        n = new ay.a() {

            final be e;

            public final void a()
            {
                e.a.k().b();
            }

            public final void a(float f1, float f2, float f3)
            {
                be.a(e, f1);
                be.b(e, f2);
                be.c(e, f3);
                e.a.k().a(f1, f2, f3);
            }

            public final void a(int i1)
            {
                be.d(e, i1);
                e.a.k().a(i1);
            }

            public final void a(String s, String s1)
            {
                e.a.c(s, s1);
            }

            
            {
                e = be.this;
                super();
            }
        };
    }

    static void a(be be1, float f1)
    {
        be1.j = f1;
    }

    static void b(be be1, float f1)
    {
        be1.k = f1;
    }

    static void c(be be1, float f1)
    {
        be1.l = f1;
    }

    private void d()
    {
        if (g + h + i > 0)
        {
            ay.a(b).a(n);
        }
    }

    static void d(be be1, float f1)
    {
        be1.m = f1;
    }

    private void e()
    {
        if (g + h + i == 0)
        {
            ay.a(b).b(n);
        }
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        n.b = true;
        g = g + 1;
        d();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        n.c = true;
        h = h + 1;
        d();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void h()
    {
        this;
        JVM INSTR monitorenter ;
        n.a = true;
        i = i + 1;
        d();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void i()
    {
        this;
        JVM INSTR monitorenter ;
        g = g - 1;
        if (g == 0)
        {
            n.b = false;
        }
        e();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void j()
    {
        this;
        JVM INSTR monitorenter ;
        h = h - 1;
        if (h == 0)
        {
            n.c = false;
        }
        e();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void k()
    {
        this;
        JVM INSTR monitorenter ;
        i = i - 1;
        if (i == 0)
        {
            n.a = false;
        }
        e();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a()
    {
        i = 0;
        h = 0;
        g = 0;
        e();
    }

    public final void a(String s, Map map)
    {
        if (!s.equalsIgnoreCase("setShakeProperties")) goto _L2; else goto _L1
_L1:
        if (!by.b((String)map.get("interval")) || !by.b((String)map.get("intensity"))) goto _L4; else goto _L3
_L3:
        float f1;
        float f2;
        f1 = Float.valueOf((String)map.get("interval")).floatValue();
        f2 = Float.valueOf((String)map.get("intensity")).floatValue();
        if (f2 >= c && f2 <= d) goto _L6; else goto _L5
_L5:
        a.c("setShakeProperties", String.format("The intensity property passed in is out of range, it must be between %s' and %s", new Object[] {
            String.valueOf(c), String.valueOf(d)
        }));
_L4:
        return;
_L6:
        if (f1 < (float)f || f1 > (float)e)
        {
            a.c("setShakeProperties", String.format("The interval property passed in is out of range, it must be between %s' and %s", new Object[] {
                String.valueOf(f), String.valueOf(e)
            }));
            return;
        } else
        {
            n.d.b = f1;
            n.d.a = f2;
            return;
        }
_L2:
        map = (String)map.get("enabled");
        if (s.equalsIgnoreCase("tiltChange"))
        {
            if (map.equalsIgnoreCase("Y"))
            {
                f();
                return;
            } else
            {
                i();
                return;
            }
        }
        if (s.equalsIgnoreCase("shake"))
        {
            if (map.equalsIgnoreCase("Y"))
            {
                g();
                return;
            } else
            {
                j();
                return;
            }
        }
        if (s.equalsIgnoreCase("headingChange"))
        {
            if (map.equalsIgnoreCase("Y"))
            {
                h();
                return;
            } else
            {
                k();
                return;
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public final void b()
    {
        ay.a(b).b(n);
    }

    public final void c()
    {
        d();
    }
}
