// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            StaggeredGridLayoutManager, l

final class zySpanLookup.FullSpanItem
{

    int a;
    int b;
    int c;
    final int d;
    final StaggeredGridLayoutManager e;
    private ArrayList f;

    static ArrayList a(zySpanLookup.FullSpanItem fullspanitem)
    {
        return fullspanitem.f;
    }

    private void f()
    {
        View view = (View)f.get(0);
        f f1 = (f)view.getLayoutParams();
        a = e.a.a(view);
        if (f1.f)
        {
            zySpanLookup.FullSpanItem fullspanitem = e.f.d(((zySpanLookup.d) (f1)).d.ion());
            if (fullspanitem != null && fullspanitem.b == -1)
            {
                a = a - fullspanitem.a(d);
            }
        }
    }

    private void g()
    {
        View view = (View)f.get(f.size() - 1);
        d d1 = (f)view.getLayoutParams();
        b = e.a.b(view);
        if (d1.f)
        {
            zySpanLookup.FullSpanItem fullspanitem = e.f.d(((zySpanLookup.d) (d1)).d.ion());
            if (fullspanitem != null && fullspanitem.b == 1)
            {
                b = b + fullspanitem.a(d);
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
        a a1 = (a)view.getLayoutParams();
        a1.e = this;
        f.add(0, view);
        a = 0x80000000;
        if (f.size() == 1)
        {
            b = 0x80000000;
        }
        if (((b) (a1)).b.b() || ((b) (a1)).b.b())
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
        b b1 = (b)view.getLayoutParams();
        b1.e = this;
        f.add(view);
        b = 0x80000000;
        if (f.size() == 1)
        {
            a = 0x80000000;
        }
        if (((a) (b1)).a.a() || ((a) (b1)).a.a())
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
        b b1 = (f)view.getLayoutParams();
        b1.e = null;
        if (((e) (b1)).e.e() || ((e) (b1)).e.e())
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
        b b1 = (f)view.getLayoutParams();
        b1.e = null;
        if (f.size() == 0)
        {
            b = 0x80000000;
        }
        if (((b) (b1)).b.b() || ((b) (b1)).b.b())
        {
            c = c - e.a.c(view);
        }
        a = 0x80000000;
    }
}
