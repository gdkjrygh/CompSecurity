// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;

public abstract class g
{

    private ItemAnimatorListener a;
    private ArrayList b;
    private long c;
    private long d;
    private long e;
    private long f;
    private boolean g;

    public abstract void a();

    void a(ItemAnimatorListener itemanimatorlistener)
    {
        a = itemanimatorlistener;
    }

    public final void a(a a1, boolean flag)
    {
        d(a1, flag);
        class ItemAnimatorListener
        {

            public abstract void a(RecyclerView.ViewHolder viewholder);

            public abstract void b(RecyclerView.ViewHolder viewholder);

            public abstract void c(RecyclerView.ViewHolder viewholder);

            public abstract void d(RecyclerView.ViewHolder viewholder);
        }

        if (a != null)
        {
            a.d(a1);
        }
    }

    public abstract boolean a(ItemAnimatorListener.d d1);

    public abstract boolean a(ItemAnimatorListener.d d1, int i1, int j1, int k1, int l1);

    public abstract boolean a(ItemAnimatorListener.d d1, ItemAnimatorListener.d d2, int i1, int j1, int k1, int l1);

    public final void b(ItemAnimatorListener.d d1, boolean flag)
    {
        c(d1, flag);
    }

    public abstract boolean b();

    public abstract boolean b(c c1);

    public abstract void c();

    public abstract void c(c c1);

    public void c(c c1, boolean flag)
    {
    }

    public long d()
    {
        return e;
    }

    public final void d(e e1)
    {
        k(e1);
        if (a != null)
        {
            a.a(e1);
        }
    }

    public void d(ItemAnimatorListener.a a1, boolean flag)
    {
    }

    public long e()
    {
        return c;
    }

    public final void e(c c1)
    {
        o(c1);
        if (a != null)
        {
            a.c(c1);
        }
    }

    public long f()
    {
        return d;
    }

    public final void f(d d1)
    {
        m(d1);
        if (a != null)
        {
            a.b(d1);
        }
    }

    public long g()
    {
        return f;
    }

    public final void g(f f1)
    {
        j(f1);
    }

    public final void h(j j1)
    {
        n(j1);
    }

    public boolean h()
    {
        return g;
    }

    public final void i()
    {
        int j1 = b.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            class ItemAnimatorFinishedListener
            {

                public abstract void a();
            }

            ((ItemAnimatorFinishedListener)b.get(i1)).a();
        }

        b.clear();
    }

    public final void i(b b1)
    {
        l(b1);
    }

    public void j(l l1)
    {
    }

    public void k(l l1)
    {
    }

    public void l(l l1)
    {
    }

    public void m(l l1)
    {
    }

    public void n(l l1)
    {
    }

    public void o(l l1)
    {
    }

    public ItemAnimatorListener()
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
