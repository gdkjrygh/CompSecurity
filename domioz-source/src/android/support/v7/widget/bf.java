// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            bg, bv

public abstract class bf
{

    private bg a;
    private ArrayList b;
    private long c;
    private long d;
    private long e;
    private long f;
    private boolean g;

    public bf()
    {
        a = null;
        b = new ArrayList();
        c = 120L;
        d = 120L;
        e = 250L;
        f = 250L;
        g = true;
    }

    public abstract void a();

    final void a(bg bg1)
    {
        a = bg1;
    }

    public abstract boolean a(bv bv);

    public abstract boolean a(bv bv, int j, int k, int l, int i1);

    public abstract boolean a(bv bv, bv bv1, int j, int k, int l, int i1);

    public abstract boolean b();

    public abstract boolean b(bv bv);

    public abstract void c();

    public abstract void c(bv bv);

    public final long d()
    {
        return e;
    }

    public final void d(bv bv)
    {
        if (a != null)
        {
            a.a(bv);
        }
    }

    public final long e()
    {
        return c;
    }

    public final void e(bv bv)
    {
        if (a != null)
        {
            a.c(bv);
        }
    }

    public final long f()
    {
        return d;
    }

    public final void f(bv bv)
    {
        if (a != null)
        {
            a.b(bv);
        }
    }

    public final long g()
    {
        return f;
    }

    public final void g(bv bv)
    {
        if (a != null)
        {
            a.d(bv);
        }
    }

    public final boolean h()
    {
        return g;
    }

    public final void i()
    {
        int k = b.size();
        for (int j = 0; j < k; j++)
        {
            b.get(j);
        }

        b.clear();
    }
}
