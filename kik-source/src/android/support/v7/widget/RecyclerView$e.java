// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static abstract class g
{
    static interface a
    {

        public abstract void a(RecyclerView.t t);

        public abstract void b(RecyclerView.t t);

        public abstract void c(RecyclerView.t t);

        public abstract void d(RecyclerView.t t);
    }


    private a a;
    private ArrayList b;
    private long c;
    private long d;
    private long e;
    private long f;
    private boolean g;

    public abstract void a();

    final void a(a a1)
    {
        a = a1;
    }

    public abstract boolean a(a a1);

    public abstract boolean a(a a1, int j, int k, int l, int i1);

    public abstract boolean a(a a1, a a2, int j, int k, int l, int i1);

    public abstract boolean b();

    public abstract boolean b(a a1);

    public abstract void c();

    public abstract void c(a a1);

    public final long d()
    {
        return e;
    }

    public final void d(e e1)
    {
        if (a != null)
        {
            a.a(e1);
        }
    }

    public final long e()
    {
        return c;
    }

    public final void e(c c1)
    {
        if (a != null)
        {
            a.c(c1);
        }
    }

    public final long f()
    {
        return d;
    }

    public final void f(d d1)
    {
        if (a != null)
        {
            a.b(d1);
        }
    }

    public final long g()
    {
        return f;
    }

    public final void g(f f1)
    {
        if (a != null)
        {
            a.d(f1);
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

    public a()
    {
        a = null;
        b = new ArrayList();
        c = 120L;
        d = 120L;
        e = 250L;
        f = 250L;
        g = true;
    }
}
