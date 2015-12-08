// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;

// Referenced classes of package com.mobeta.android.dslv:
//            t, DragSortListView

final class r extends t
{

    final DragSortListView a;
    private float d;
    private float e;
    private float f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    public r(DragSortListView dragsortlistview, int l)
    {
        a = dragsortlistview;
        super(dragsortlistview, l);
        g = -1;
        h = -1;
    }

    public final void a()
    {
        float f1;
        int l;
        l = -1;
        g = -1;
        h = -1;
        i = DragSortListView.m(a);
        j = DragSortListView.n(a);
        k = DragSortListView.i(a);
        DragSortListView.b(a, 1);
        d = DragSortListView.e(a).x;
        if (!DragSortListView.o(a))
        {
            break MISSING_BLOCK_LABEL_201;
        }
        f1 = (float)a.getWidth() * 2.0F;
        if (DragSortListView.p(a) != 0.0F) goto _L2; else goto _L1
_L1:
        DragSortListView dragsortlistview = a;
        if (d >= 0.0F)
        {
            l = 1;
        }
        DragSortListView.a(dragsortlistview, (float)l * f1);
_L4:
        return;
_L2:
        f1 *= 2.0F;
        if (DragSortListView.p(a) < 0.0F && DragSortListView.p(a) > -f1)
        {
            DragSortListView.a(a, -f1);
            return;
        }
        if (DragSortListView.p(a) <= 0.0F || DragSortListView.p(a) >= f1) goto _L4; else goto _L3
_L3:
        DragSortListView.a(a, f1);
        return;
        DragSortListView.q(a);
        return;
    }

    public final void a(float f1)
    {
        View view;
        int k1;
        f1 = 1.0F - f1;
        k1 = a.getFirstVisiblePosition();
        view = a.getChildAt(i - k1);
        if (!DragSortListView.o(a)) goto _L2; else goto _L1
_L1:
        float f2 = (float)(SystemClock.uptimeMillis() - b) / 1000F;
        if (f2 != 0.0F) goto _L4; else goto _L3
_L3:
        return;
_L4:
        float f3 = DragSortListView.p(a);
        int l1 = a.getWidth();
        DragSortListView dragsortlistview = a;
        float f4 = DragSortListView.p(dragsortlistview);
        int l;
        if (DragSortListView.p(a) > 0.0F)
        {
            l = 1;
        } else
        {
            l = -1;
        }
        DragSortListView.a(dragsortlistview, (float)l * f2 * (float)l1 + f4);
        d = d + f3 * f2;
        DragSortListView.e(a).x = (int)d;
        if (d < (float)l1 && d > (float)(-l1))
        {
            b = SystemClock.uptimeMillis();
            DragSortListView.g(a);
            return;
        }
_L2:
        if (view != null)
        {
            if (g == -1)
            {
                g = DragSortListView.b(a, i, view);
                e = view.getHeight() - g;
            }
            int i1 = Math.max((int)(e * f1), 1);
            android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
            layoutparams.height = i1 + g;
            view.setLayoutParams(layoutparams);
        }
        if (j != i)
        {
            View view1 = a.getChildAt(j - k1);
            if (view1 != null)
            {
                if (h == -1)
                {
                    h = DragSortListView.b(a, j, view1);
                    f = view1.getHeight() - h;
                }
                int j1 = Math.max((int)(f * f1), 1);
                android.view.ViewGroup.LayoutParams layoutparams1 = view1.getLayoutParams();
                layoutparams1.height = j1 + h;
                view1.setLayoutParams(layoutparams1);
                return;
            }
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final void b()
    {
        DragSortListView.r(a);
    }
}
