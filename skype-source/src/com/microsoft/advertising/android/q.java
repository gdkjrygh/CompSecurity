// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;

// Referenced classes of package com.microsoft.advertising.android:
//            c, bj, af, p, 
//            by, ah, m

final class q
{

    private final c a;
    private final p b;
    private final ah c;
    private final bj d;
    private m e;
    private volatile int f;
    private volatile int g;
    private String h;

    public q(Context context, p p1, ah ah)
    {
        e = null;
        f = -1;
        g = -1;
        h = null;
        if (context == null || p1 == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            a = new c(context.getApplicationContext());
            b = p1;
            c = ah;
            d = new bj(c);
            return;
        }
    }

    public final p a()
    {
        return b;
    }

    public final void a(int k)
    {
        boolean flag1 = true;
        boolean flag;
        if (k > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        af.a(flag);
        if (f == -1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        af.a(flag);
        f = k;
    }

    public final void a(m m)
    {
        e = m;
    }

    public final void a(String s)
    {
        h = s;
    }

    public final c b()
    {
        return a;
    }

    public final void b(int k)
    {
        boolean flag1 = true;
        boolean flag;
        if (k > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        af.a(flag);
        if (g == -1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        af.a(flag);
        g = k;
    }

    public final int c()
    {
        return f;
    }

    public final int d()
    {
        return g;
    }

    public final boolean e()
    {
        return f != -1 && g != -1;
    }

    public final String f()
    {
        return h;
    }

    public final m g()
    {
        return e;
    }

    public final boolean h()
    {
        return by.a(b.b(), c);
    }

    public final ah i()
    {
        return c;
    }

    public final bj j()
    {
        return d;
    }
}
