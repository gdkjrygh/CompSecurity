// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import com.nineoldandroids.a.c;
import com.nineoldandroids.a.k;

public abstract class a extends com.a.a.a
{

    private final SparseArray a = new SparseArray();
    private long d;
    private int e;
    private int f;
    private boolean g;
    private boolean h;
    private long i;
    private long j;
    private long k;

    public a(BaseAdapter baseadapter)
    {
        super(baseadapter);
        h = true;
        i = 150L;
        j = 100L;
        k = 300L;
        d = -1L;
        e = -1;
        f = -1;
        if (baseadapter instanceof a)
        {
            ((a)baseadapter).a(true);
        }
    }

    private void a(int l, View view, ViewGroup viewgroup)
    {
        boolean flag;
        if ((a() instanceof GridView) && viewgroup.getHeight() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (l > f && h && !flag)
        {
            if (e == -1)
            {
                e = l;
            }
            a(viewgroup, view);
            f = l;
        }
    }

    private void a(View view)
    {
        int l = view.hashCode();
        view = (com.nineoldandroids.a.a)a.get(l);
        if (view != null)
        {
            view.c();
            a.remove(l);
        }
    }

    private void a(ViewGroup viewgroup, View view)
    {
        if (d == -1L)
        {
            d = System.currentTimeMillis();
        }
        com.nineoldandroids.view.a.a(view, 0.0F);
        com.nineoldandroids.a.a aa[];
        k k1;
        c c1;
        if (b instanceof a)
        {
            aa = ((a)b).b(viewgroup, view);
        } else
        {
            aa = new com.nineoldandroids.a.a[0];
        }
        viewgroup = b(viewgroup, view);
        k1 = com.nineoldandroids.a.k.a(view, "alpha", new float[] {
            0.0F, 1.0F
        });
        c1 = new c();
        c1.a(a(aa, ((com.nineoldandroids.a.a []) (viewgroup)), ((com.nineoldandroids.a.a) (k1))));
        c1.a(e());
        c1.c(d());
        c1.a();
        a.put(view.hashCode(), c1);
    }

    private com.nineoldandroids.a.a[] a(com.nineoldandroids.a.a aa[], com.nineoldandroids.a.a aa1[], com.nineoldandroids.a.a a1)
    {
        int i1 = 0;
        com.nineoldandroids.a.a aa2[] = new com.nineoldandroids.a.a[aa.length + aa1.length + 1];
        int l;
        for (l = 0; l < aa1.length; l++)
        {
            aa2[l] = aa1[l];
        }

        for (int j1 = aa.length; i1 < j1; i1++)
        {
            aa2[l] = aa[i1];
            l++;
        }

        aa2[aa2.length - 1] = a1;
        return aa2;
    }

    private long e()
    {
        long l;
        if ((a().getLastVisiblePosition() - a().getFirstVisiblePosition()) + 1 < f - e)
        {
            l = c();
            if ((a() instanceof GridView) && android.os.Build.VERSION.SDK_INT >= 11)
            {
                long l1 = c();
                l = (long)((f + 1) % ((GridView)a()).getNumColumns()) * l1 + l;
            }
        } else
        {
            l = ((long)((f - e) + 1) * c() + (d + b())) - System.currentTimeMillis();
        }
        return Math.max(0L, l);
    }

    public void a(boolean flag)
    {
        g = flag;
    }

    protected long b()
    {
        return i;
    }

    public abstract com.nineoldandroids.a.a[] b(ViewGroup viewgroup, View view);

    protected long c()
    {
        return j;
    }

    protected long d()
    {
        return k;
    }

    public final View getView(int l, View view, ViewGroup viewgroup)
    {
        if (!g)
        {
            if (a() == null)
            {
                throw new IllegalStateException("Call setListView() on this AnimationAdapter before setAdapter()!");
            }
            if (view != null)
            {
                a(view);
            }
        }
        view = super.getView(l, view, viewgroup);
        if (!g)
        {
            a(l, view, viewgroup);
        }
        return view;
    }
}
