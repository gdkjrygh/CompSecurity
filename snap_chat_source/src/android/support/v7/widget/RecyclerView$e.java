// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static abstract class m
{
    public static interface a
    {

        public abstract void a();
    }

    static interface b
    {

        public abstract void a(RecyclerView.v v);

        public abstract void b(RecyclerView.v v);

        public abstract void c(RecyclerView.v v);

        public abstract void d(RecyclerView.v v);
    }


    private ArrayList a;
    b h;
    public long i;
    public long j;
    public long k;
    public long l;
    public boolean m;

    public abstract void T_();

    public final boolean a(a a1)
    {
        boolean flag;
label0:
        {
            flag = b();
            if (a1 != null)
            {
                if (flag)
                {
                    break label0;
                }
                a1.a();
            }
            return flag;
        }
        a.add(a1);
        return flag;
    }

    public abstract boolean a(a a1);

    public abstract boolean a(a a1, int i1, int j1, int k1, int l1);

    public abstract boolean a(a a1, a a2, int i1, int j1, int k1, int l1);

    public abstract boolean b();

    public abstract boolean b(a a1);

    public abstract void c(a a1);

    public abstract void d();

    public final void d(a a1)
    {
        if (h != null)
        {
            h.a(a1);
        }
    }

    public final void e()
    {
        int j1 = a.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((a)a.get(i1)).a();
        }

        a.clear();
    }

    public final void e(a a1)
    {
        g();
        if (h != null)
        {
            h.c(a1);
        }
    }

    public void f()
    {
    }

    public final void f(b.c c1)
    {
        f();
        if (h != null)
        {
            h.b(c1);
        }
    }

    public void g()
    {
    }

    public final void g(b.b b1)
    {
        if (h != null)
        {
            h.d(b1);
        }
    }

    public void h(b.d d1)
    {
    }

    public void i(b.d d1)
    {
    }

    public b()
    {
        h = null;
        a = new ArrayList();
        i = 120L;
        j = 120L;
        k = 250L;
        l = 250L;
        m = true;
    }
}
