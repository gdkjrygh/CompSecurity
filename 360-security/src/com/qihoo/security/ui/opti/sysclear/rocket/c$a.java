// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear.rocket;

import android.view.animation.Interpolator;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear.rocket:
//            c

private class <init>
{

    final c a;
    private float b;
    private int c;
    private int d;
    private long e;

    public float a()
    {
        return b;
    }

    public void a(float f)
    {
        b = f;
    }

    public void a(int i)
    {
        c = i;
    }

    public void a(long l)
    {
        e = 0L;
    }

    public int b()
    {
        return c;
    }

    public void b(int i)
    {
        d = i;
    }

    public boolean b(long l)
    {
        if (d >= 10000)
        {
            return false;
        }
        float f = b;
        int i = c;
        Interpolator interpolator = a.b();
        if (interpolator != null)
        {
            if (e == 0L)
            {
                e = System.currentTimeMillis();
            }
            long l1 = Math.abs(l - e);
            l = l1;
            if (l1 > (long)com.qihoo.security.ui.opti.sysclear.rocket.c.a(a))
            {
                l = com.qihoo.security.ui.opti.sysclear.rocket.c.a(a);
            }
            d = (int)(interpolator.getInterpolation((float)l / (float)com.qihoo.security.ui.opti.sysclear.rocket.c.a(a)) * 10000F);
            b = com.qihoo.security.ui.opti.sysclear.rocket.c.b(a) + ((com.qihoo.security.ui.opti.sysclear.rocket.c.c(a) - com.qihoo.security.ui.opti.sysclear.rocket.c.b(a)) * (float)d) / 10000F;
            c = (int)((float)com.qihoo.security.ui.opti.sysclear.rocket.c.d(a) * (1.0F - (float)d / 10000F));
        }
        boolean flag;
        if (f != b || i != c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public float c()
    {
        return (float)d;
    }

    private (c c1)
    {
        a = c1;
        super();
        b = 0.0F;
        c = 255;
        d = 0;
        e = 0L;
    }

    e(c c1, e e1)
    {
        this(c1);
    }
}
