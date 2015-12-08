// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            aq, bi

public abstract class ap
{

    private aq a;
    private ArrayList b;
    private long c;
    private long d;
    private long e;
    private long f;
    private boolean g;

    public ap()
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

    final void a(aq aq1)
    {
        a = aq1;
    }

    public abstract boolean a(bi bi);

    public abstract boolean a(bi bi, int j, int k, int l, int i1);

    public abstract boolean a(bi bi, bi bi1, int j, int k, int l, int i1);

    public abstract boolean b();

    public abstract boolean b(bi bi);

    public abstract void c();

    public abstract void c(bi bi);

    public final long d()
    {
        return e;
    }

    public final void d(bi bi)
    {
        if (a != null)
        {
            a.a(bi);
        }
    }

    public final long e()
    {
        return c;
    }

    public final void e(bi bi)
    {
        if (a != null)
        {
            a.c(bi);
        }
    }

    public final long f()
    {
        return d;
    }

    public final void f(bi bi)
    {
        if (a != null)
        {
            a.b(bi);
        }
    }

    public final long g()
    {
        return f;
    }

    public final void g(bi bi)
    {
        if (a != null)
        {
            a.d(bi);
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
