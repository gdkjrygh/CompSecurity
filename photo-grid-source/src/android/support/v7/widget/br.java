// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            StaggeredGridLayoutManager, ad, bi

final class br
{

    int a;
    int b;
    int c;
    final int d;
    final StaggeredGridLayoutManager e;
    private ArrayList f;

    private br(StaggeredGridLayoutManager staggeredgridlayoutmanager, int i)
    {
        e = staggeredgridlayoutmanager;
        super();
        f = new ArrayList();
        a = 0x80000000;
        b = 0x80000000;
        c = 0;
        d = i;
    }

    br(StaggeredGridLayoutManager staggeredgridlayoutmanager, int i, byte byte0)
    {
        this(staggeredgridlayoutmanager, i);
    }

    static ArrayList a(br br1)
    {
        return br1.f;
    }

    private void f()
    {
        View view = (View)f.get(0);
        StaggeredGridLayoutManager.LayoutParams layoutparams = (StaggeredGridLayoutManager.LayoutParams)view.getLayoutParams();
        a = e.a.a(view);
        if (layoutparams.f)
        {
            StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem fullspanitem = e.f.d(((RecyclerView.LayoutParams) (layoutparams)).a.c());
            if (fullspanitem != null && fullspanitem.b == -1)
            {
                a = a - fullspanitem.a(d);
            }
        }
    }

    private void g()
    {
        View view = (View)f.get(f.size() - 1);
        StaggeredGridLayoutManager.LayoutParams layoutparams = (StaggeredGridLayoutManager.LayoutParams)view.getLayoutParams();
        b = e.a.b(view);
        if (layoutparams.f)
        {
            StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem fullspanitem = e.f.d(((RecyclerView.LayoutParams) (layoutparams)).a.c());
            if (fullspanitem != null && fullspanitem.b == 1)
            {
                int i = b;
                b = fullspanitem.a(d) + i;
            }
        }
    }

    final int a()
    {
        if (a != 0x80000000)
        {
            return a;
        } else
        {
            f();
            return a;
        }
    }

    final int a(int i)
    {
        if (a != 0x80000000)
        {
            i = a;
        } else
        if (f.size() != 0)
        {
            f();
            return a;
        }
        return i;
    }

    final void a(View view)
    {
        StaggeredGridLayoutManager.LayoutParams layoutparams = (StaggeredGridLayoutManager.LayoutParams)view.getLayoutParams();
        layoutparams.e = this;
        f.add(0, view);
        a = 0x80000000;
        if (f.size() == 1)
        {
            b = 0x80000000;
        }
        if (((RecyclerView.LayoutParams) (layoutparams)).a.n() || ((RecyclerView.LayoutParams) (layoutparams)).a.l())
        {
            c = c + e.a.c(view);
        }
    }

    final int b()
    {
        if (b != 0x80000000)
        {
            return b;
        } else
        {
            g();
            return b;
        }
    }

    final int b(int i)
    {
        if (b != 0x80000000)
        {
            i = b;
        } else
        if (f.size() != 0)
        {
            g();
            return b;
        }
        return i;
    }

    final void b(View view)
    {
        StaggeredGridLayoutManager.LayoutParams layoutparams = (StaggeredGridLayoutManager.LayoutParams)view.getLayoutParams();
        layoutparams.e = this;
        f.add(view);
        b = 0x80000000;
        if (f.size() == 1)
        {
            a = 0x80000000;
        }
        if (((RecyclerView.LayoutParams) (layoutparams)).a.n() || ((RecyclerView.LayoutParams) (layoutparams)).a.l())
        {
            c = c + e.a.c(view);
        }
    }

    final void c()
    {
        f.clear();
        a = 0x80000000;
        b = 0x80000000;
        c = 0;
    }

    final void c(int i)
    {
        a = i;
        b = i;
    }

    final void d()
    {
        int i = f.size();
        View view = (View)f.remove(i - 1);
        StaggeredGridLayoutManager.LayoutParams layoutparams = (StaggeredGridLayoutManager.LayoutParams)view.getLayoutParams();
        layoutparams.e = null;
        if (((RecyclerView.LayoutParams) (layoutparams)).a.n() || ((RecyclerView.LayoutParams) (layoutparams)).a.l())
        {
            c = c - e.a.c(view);
        }
        if (i == 1)
        {
            a = 0x80000000;
        }
        b = 0x80000000;
    }

    final void d(int i)
    {
        if (a != 0x80000000)
        {
            a = a + i;
        }
        if (b != 0x80000000)
        {
            b = b + i;
        }
    }

    final void e()
    {
        View view = (View)f.remove(0);
        StaggeredGridLayoutManager.LayoutParams layoutparams = (StaggeredGridLayoutManager.LayoutParams)view.getLayoutParams();
        layoutparams.e = null;
        if (f.size() == 0)
        {
            b = 0x80000000;
        }
        if (((RecyclerView.LayoutParams) (layoutparams)).a.n() || ((RecyclerView.LayoutParams) (layoutparams)).a.l())
        {
            c = c - e.a.c(view);
        }
        a = 0x80000000;
    }
}
