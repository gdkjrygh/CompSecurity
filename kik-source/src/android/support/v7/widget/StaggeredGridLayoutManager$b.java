// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            StaggeredGridLayoutManager, q

final class <init>
{

    int a;
    int b;
    int c;
    final int d;
    final StaggeredGridLayoutManager e;
    private ArrayList f;

    private int a(int i, int j)
    {
        byte byte1 = -1;
        int l = e.a.c();
        int i1 = e.a.d();
        byte byte0;
        if (j > i)
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        do
        {
label0:
            {
                int k = byte1;
                if (i != j)
                {
                    View view = (View)f.get(i);
                    k = e.a.a(view);
                    int j1 = e.a.b(view);
                    if (k >= i1 || j1 <= l)
                    {
                        break label0;
                    }
                    k = StaggeredGridLayoutManager.e(view);
                }
                return k;
            }
            i += byte0;
        } while (true);
    }

    static ArrayList a(e e1)
    {
        return e1.f;
    }

    private void g()
    {
        View view = (View)f.get(0);
        youtParams youtparams = (youtParams)view.getLayoutParams();
        a = e.a.a(view);
        if (youtparams.f)
        {
            zySpanLookup.FullSpanItem fullspanitem = e.f.d(((zySpanLookup.d) (youtparams)).d.d());
            if (fullspanitem != null && fullspanitem.b == -1)
            {
                a = a - fullspanitem.a(d);
            }
        }
    }

    private void h()
    {
        View view = (View)f.get(f.size() - 1);
        youtParams youtparams = (youtParams)view.getLayoutParams();
        b = e.a.b(view);
        if (youtparams.f)
        {
            zySpanLookup.FullSpanItem fullspanitem = e.f.d(((zySpanLookup.d) (youtparams)).d.d());
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
            g();
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
            g();
            return a;
        }
        return i;
    }

    final void a(View view)
    {
        youtParams youtparams = (youtParams)view.getLayoutParams();
        youtparams.e = this;
        f.add(0, view);
        a = 0x80000000;
        if (f.size() == 1)
        {
            b = 0x80000000;
        }
        if (((b) (youtparams)).b.b() || ((b) (youtparams)).b.b())
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
            h();
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
            h();
            return b;
        }
        return i;
    }

    final void b(View view)
    {
        youtParams youtparams = (youtParams)view.getLayoutParams();
        youtparams.e = this;
        f.add(view);
        b = 0x80000000;
        if (f.size() == 1)
        {
            a = 0x80000000;
        }
        if (((a) (youtparams)).a.a() || ((a) (youtparams)).a.a())
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
        youtParams youtparams = (youtParams)view.getLayoutParams();
        youtparams.e = null;
        if (((youtParams.e) (youtparams)).e.e() || ((youtParams.e) (youtparams)).e.e())
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
        youtParams youtparams = (youtParams)view.getLayoutParams();
        youtparams.e = null;
        if (f.size() == 0)
        {
            b = 0x80000000;
        }
        if (((b) (youtparams)).b.b() || ((b) (youtparams)).b.b())
        {
            c = c - e.a.c(view);
        }
        a = 0x80000000;
    }

    public final int f()
    {
        if (StaggeredGridLayoutManager.c(e))
        {
            return a(f.size() - 1, -1);
        } else
        {
            return a(0, f.size());
        }
    }

    private zySpanLookup.FullSpanItem(StaggeredGridLayoutManager staggeredgridlayoutmanager, int i)
    {
        e = staggeredgridlayoutmanager;
        super();
        f = new ArrayList();
        a = 0x80000000;
        b = 0x80000000;
        c = 0;
        d = i;
    }

    d(StaggeredGridLayoutManager staggeredgridlayoutmanager, int i, byte byte0)
    {
        this(staggeredgridlayoutmanager, i);
    }
}
