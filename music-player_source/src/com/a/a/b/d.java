// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.a.a.b.a.e;
import com.a.a.b.g.a;

// Referenced classes of package com.a.a.b:
//            e

public final class d
{

    private final int a;
    private final int b;
    private final int c;
    private final Drawable d;
    private final Drawable e;
    private final Drawable f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final e j;
    private final android.graphics.BitmapFactory.Options k;
    private final int l;
    private final boolean m;
    private final Object n;
    private final a o;
    private final a p;
    private final com.a.a.b.c.a q;
    private final Handler r;
    private final boolean s;

    private d(com.a.a.b.e e1)
    {
        a = com.a.a.b.e.a(e1);
        b = com.a.a.b.e.b(e1);
        c = com.a.a.b.e.c(e1);
        d = com.a.a.b.e.d(e1);
        e = com.a.a.b.e.e(e1);
        f = com.a.a.b.e.f(e1);
        g = com.a.a.b.e.g(e1);
        h = com.a.a.b.e.h(e1);
        i = com.a.a.b.e.i(e1);
        j = com.a.a.b.e.j(e1);
        k = com.a.a.b.e.k(e1);
        l = com.a.a.b.e.l(e1);
        m = com.a.a.b.e.m(e1);
        n = com.a.a.b.e.n(e1);
        o = com.a.a.b.e.o(e1);
        p = com.a.a.b.e.p(e1);
        q = com.a.a.b.e.q(e1);
        r = com.a.a.b.e.r(e1);
        s = com.a.a.b.e.s(e1);
    }

    d(com.a.a.b.e e1, byte byte0)
    {
        this(e1);
    }

    static int a(d d1)
    {
        return d1.a;
    }

    static int b(d d1)
    {
        return d1.b;
    }

    static int c(d d1)
    {
        return d1.c;
    }

    static Drawable d(d d1)
    {
        return d1.d;
    }

    static Drawable e(d d1)
    {
        return d1.e;
    }

    static Drawable f(d d1)
    {
        return d1.f;
    }

    static boolean g(d d1)
    {
        return d1.g;
    }

    static boolean h(d d1)
    {
        return d1.h;
    }

    static boolean i(d d1)
    {
        return d1.i;
    }

    static e j(d d1)
    {
        return d1.j;
    }

    static android.graphics.BitmapFactory.Options k(d d1)
    {
        return d1.k;
    }

    static int l(d d1)
    {
        return d1.l;
    }

    static boolean m(d d1)
    {
        return d1.m;
    }

    static Object n(d d1)
    {
        return d1.n;
    }

    static a o(d d1)
    {
        return d1.o;
    }

    static a p(d d1)
    {
        return d1.p;
    }

    static com.a.a.b.c.a q(d d1)
    {
        return d1.q;
    }

    static Handler r(d d1)
    {
        return d1.r;
    }

    static boolean s(d d1)
    {
        return d1.s;
    }

    public final Drawable a(Resources resources)
    {
        if (a != 0)
        {
            return resources.getDrawable(a);
        } else
        {
            return d;
        }
    }

    public final boolean a()
    {
        return d != null || a != 0;
    }

    public final Drawable b(Resources resources)
    {
        if (b != 0)
        {
            return resources.getDrawable(b);
        } else
        {
            return e;
        }
    }

    public final boolean b()
    {
        return e != null || b != 0;
    }

    public final Drawable c(Resources resources)
    {
        if (c != 0)
        {
            return resources.getDrawable(c);
        } else
        {
            return f;
        }
    }

    public final boolean c()
    {
        return f != null || c != 0;
    }

    public final boolean d()
    {
        return o != null;
    }

    public final boolean e()
    {
        return p != null;
    }

    public final boolean f()
    {
        return l > 0;
    }

    public final boolean g()
    {
        return g;
    }

    public final boolean h()
    {
        return h;
    }

    public final boolean i()
    {
        return i;
    }

    public final e j()
    {
        return j;
    }

    public final android.graphics.BitmapFactory.Options k()
    {
        return k;
    }

    public final int l()
    {
        return l;
    }

    public final boolean m()
    {
        return m;
    }

    public final Object n()
    {
        return n;
    }

    public final a o()
    {
        return o;
    }

    public final a p()
    {
        return p;
    }

    public final com.a.a.b.c.a q()
    {
        return q;
    }

    public final Handler r()
    {
        return r;
    }

    final boolean s()
    {
        return s;
    }
}
