// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.view.View;

// Referenced classes of package com.roidapp.baselib.hlistview:
//            h, ad, AbsHListView, ag, 
//            w, l

final class g
    implements Runnable
{

    final AbsHListView a;
    private final ad b;
    private int c;
    private final Runnable d = new h(this);

    g(AbsHListView abshlistview)
    {
        a = abshlistview;
        super();
        b = new ad(abshlistview.getContext());
    }

    static ad a(g g1)
    {
        return g1.b;
    }

    final void a()
    {
        if (b.a(a.getScrollX()))
        {
            a.F = 6;
            a.invalidate();
            a.a.a(this);
            return;
        } else
        {
            a.F = -1;
            a.b(0);
            return;
        }
    }

    final void a(int i)
    {
        int j;
        if (i < 0)
        {
            j = 0x7fffffff;
        } else
        {
            j = 0;
        }
        c = j;
        b.a(null);
        b.a(j, i, 0, 0, 0x7fffffff, 0);
        a.F = 4;
        a.a.a(this);
    }

    final void a(int i, int j, boolean flag)
    {
        android.view.animation.Interpolator interpolator;
        ad ad1;
        int k;
        if (i < 0)
        {
            k = 0x7fffffff;
        } else
        {
            k = 0;
        }
        c = k;
        ad1 = b;
        if (flag)
        {
            interpolator = AbsHListView.T;
        } else
        {
            interpolator = null;
        }
        ad1.a(interpolator);
        b.a(k, 0, i, j);
        a.F = 4;
        a.a.a(this);
    }

    final void b()
    {
        a.F = -1;
        a.removeCallbacks(this);
        a.removeCallbacks(d);
        a.b(0);
        AbsHListView.k(a);
        b.f();
        AbsHListView.l(a);
    }

    final void b(int i)
    {
        b.a(null);
        b.a(a.getScrollX(), i, 0, 0x80000000, 0, a.getWidth());
        a.F = 6;
        a.invalidate();
        a.a.a(this);
    }

    final void c()
    {
        a.postDelayed(d, 40L);
    }

    public final void run()
    {
        boolean flag1;
        int i1;
        flag1 = false;
        i1 = 0;
        a.F;
        JVM INSTR tableswitch 3 6: default 44
    //                   3 49
    //                   4 59
    //                   5 44
    //                   6 574;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        b();
_L5:
        return;
_L2:
        if (b.a()) goto _L5; else goto _L3
_L3:
        if (a.aj)
        {
            a.d();
        }
        if (a.ao == 0 || a.getChildCount() == 0)
        {
            b();
            return;
        }
        Object obj = b;
        boolean flag2 = ((ad) (obj)).e();
        int j1 = ((ad) (obj)).c();
        int i = c - j1;
        int j;
        boolean flag3;
        if (i > 0)
        {
            a.A = a.V;
            obj = a.getChildAt(0);
            a.B = ((View) (obj)).getLeft();
            i = Math.min(a.getWidth() - a.getPaddingRight() - a.getPaddingLeft() - 1, i);
        } else
        {
            j = a.getChildCount() - 1;
            a.A = a.V + j;
            obj = a.getChildAt(j);
            a.B = ((View) (obj)).getLeft();
            i = Math.max(-(a.getWidth() - a.getPaddingRight() - a.getPaddingLeft() - 1), i);
        }
        obj = a.getChildAt(a.A - a.V);
        boolean flag;
        int k;
        if (obj != null)
        {
            j = ((View) (obj)).getLeft();
        } else
        {
            j = 0;
        }
        flag3 = a.a(i, i);
        flag1 = i1;
        if (flag3)
        {
            flag1 = i1;
            if (i != 0)
            {
                flag1 = true;
            }
        }
        if (!flag1) goto _L7; else goto _L6
_L6:
        if (obj != null)
        {
            j = -(i - (((View) (obj)).getLeft() - j));
            AbsHListView.a(a, j, a.getScrollX(), a.R);
        }
        if (!flag2) goto _L5; else goto _L8
_L8:
        b.a(a.getScrollX(), a.R);
        j = a.getOverScrollMode();
        if (j != 0 && (j != 1 || AbsHListView.h(a))) goto _L10; else goto _L9
_L9:
        a.F = 6;
        j = (int)b.d();
        if (i > 0)
        {
            AbsHListView.i(a).a(j);
        } else
        {
            AbsHListView.j(a).a(j);
        }
_L11:
        a.invalidate();
        a.a.a(this);
        return;
_L10:
        a.F = -1;
        if (a.I != null)
        {
            a.I.a();
        }
        if (true) goto _L11; else goto _L7
_L7:
        if (flag2 && !flag1)
        {
            if (flag3)
            {
                a.invalidate();
            }
            c = j1;
            a.a.a(this);
            return;
        } else
        {
            b();
            return;
        }
_L4:
        obj = b;
        if (((ad) (obj)).e())
        {
            i1 = a.getScrollX();
            j1 = ((ad) (obj)).c();
            if (AbsHListView.b(a, j1 - i1, i1, a.R))
            {
                if (i1 <= 0 && j1 > 0)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                flag = flag1;
                if (i1 >= 0)
                {
                    flag = flag1;
                    if (j1 < 0)
                    {
                        flag = true;
                    }
                }
                if (j != 0 || flag)
                {
                    k = (int)((ad) (obj)).d();
                    j = k;
                    if (flag)
                    {
                        j = -k;
                    }
                    ((ad) (obj)).f();
                    a(j);
                    return;
                } else
                {
                    a();
                    return;
                }
            } else
            {
                a.invalidate();
                a.a.a(this);
                return;
            }
        } else
        {
            b();
            return;
        }
    }
}
