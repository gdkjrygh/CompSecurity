// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.a.a.b.c.b;
import com.a.a.b.g.a;

// Referenced classes of package com.a.a.b:
//            d

public final class e
{

    private int a;
    private int b;
    private int c;
    private Drawable d;
    private Drawable e;
    private Drawable f;
    private boolean g;
    private boolean h;
    private boolean i;
    private com.a.a.b.a.e j;
    private android.graphics.BitmapFactory.Options k;
    private int l;
    private boolean m;
    private Object n;
    private a o;
    private a p;
    private com.a.a.b.c.a q;
    private Handler r;
    private boolean s;

    public e()
    {
        a = 0;
        b = 0;
        c = 0;
        d = null;
        e = null;
        f = null;
        g = false;
        h = false;
        i = false;
        j = com.a.a.b.a.e.b;
        k = new android.graphics.BitmapFactory.Options();
        l = 0;
        m = false;
        n = null;
        o = null;
        p = null;
        q = new b();
        r = null;
        s = false;
        k.inPurgeable = true;
        k.inInputShareable = true;
    }

    static int a(e e1)
    {
        return e1.a;
    }

    static int b(e e1)
    {
        return e1.b;
    }

    static int c(e e1)
    {
        return e1.c;
    }

    static Drawable d(e e1)
    {
        return e1.d;
    }

    static Drawable e(e e1)
    {
        return e1.e;
    }

    static Drawable f(e e1)
    {
        return e1.f;
    }

    static boolean g(e e1)
    {
        return e1.g;
    }

    static boolean h(e e1)
    {
        return e1.h;
    }

    static boolean i(e e1)
    {
        return e1.i;
    }

    static com.a.a.b.a.e j(e e1)
    {
        return e1.j;
    }

    static android.graphics.BitmapFactory.Options k(e e1)
    {
        return e1.k;
    }

    static int l(e e1)
    {
        return e1.l;
    }

    static boolean m(e e1)
    {
        return e1.m;
    }

    static Object n(e e1)
    {
        return e1.n;
    }

    static a o(e e1)
    {
        return e1.o;
    }

    static a p(e e1)
    {
        return e1.p;
    }

    static com.a.a.b.c.a q(e e1)
    {
        return e1.q;
    }

    static Handler r(e e1)
    {
        return e1.r;
    }

    static boolean s(e e1)
    {
        return e1.s;
    }

    public final e a()
    {
        h = true;
        return this;
    }

    public final e a(int i1)
    {
        a = i1;
        return this;
    }

    public final e a(android.graphics.Bitmap.Config config)
    {
        if (config == null)
        {
            throw new IllegalArgumentException("bitmapConfig can't be null");
        } else
        {
            k.inPreferredConfig = config;
            return this;
        }
    }

    public final e a(com.a.a.b.a.e e1)
    {
        j = e1;
        return this;
    }

    public final e a(d d1)
    {
        a = com.a.a.b.d.a(d1);
        b = com.a.a.b.d.b(d1);
        c = com.a.a.b.d.c(d1);
        d = com.a.a.b.d.d(d1);
        e = com.a.a.b.d.e(d1);
        f = com.a.a.b.d.f(d1);
        g = com.a.a.b.d.g(d1);
        h = com.a.a.b.d.h(d1);
        i = com.a.a.b.d.i(d1);
        j = com.a.a.b.d.j(d1);
        k = com.a.a.b.d.k(d1);
        l = com.a.a.b.d.l(d1);
        m = com.a.a.b.d.m(d1);
        n = com.a.a.b.d.n(d1);
        o = com.a.a.b.d.o(d1);
        p = com.a.a.b.d.p(d1);
        q = com.a.a.b.d.q(d1);
        r = com.a.a.b.d.r(d1);
        s = com.a.a.b.d.s(d1);
        return this;
    }

    public final e b()
    {
        i = true;
        return this;
    }

    public final e b(int i1)
    {
        b = i1;
        return this;
    }

    public final e c()
    {
        m = true;
        return this;
    }

    public final e c(int i1)
    {
        c = i1;
        return this;
    }

    public final d d()
    {
        return new d(this, (byte)0);
    }
}
