// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;

// Referenced classes of package com.mobeta.android.dslv:
//            DragSortListView

private class h extends h
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

    public void a()
    {
        float f1;
        int i1;
        i1 = -1;
        g = -1;
        h = -1;
        i = DragSortListView.l(a);
        j = DragSortListView.m(a);
        k = DragSortListView.h(a);
        DragSortListView.b(a, 1);
        d = DragSortListView.e(a).x;
        if (!DragSortListView.n(a))
        {
            break MISSING_BLOCK_LABEL_205;
        }
        f1 = (float)a.getWidth() * 2.0F;
        if (DragSortListView.o(a) != 0.0F) goto _L2; else goto _L1
_L1:
        DragSortListView dragsortlistview = a;
        if (d >= 0.0F)
        {
            i1 = 1;
        }
        DragSortListView.a(dragsortlistview, (float)i1 * f1);
_L4:
        return;
_L2:
        f1 *= 2.0F;
        if (DragSortListView.o(a) < 0.0F && DragSortListView.o(a) > -f1)
        {
            DragSortListView.a(a, -f1);
            return;
        }
        if (DragSortListView.o(a) <= 0.0F || DragSortListView.o(a) >= f1) goto _L4; else goto _L3
_L3:
        DragSortListView.a(a, f1);
        return;
        DragSortListView.p(a);
        return;
    }

    public void a(float f1, float f2)
    {
        View view;
        int l1;
        f1 = 1.0F - f2;
        l1 = a.getFirstVisiblePosition();
        view = a.getChildAt(i - l1);
        if (!DragSortListView.n(a)) goto _L2; else goto _L1
_L1:
        f2 = (float)(SystemClock.uptimeMillis() - b) / 1000F;
        if (f2 != 0.0F) goto _L4; else goto _L3
_L3:
        return;
_L4:
        float f3 = DragSortListView.o(a);
        int i2 = a.getWidth();
        DragSortListView dragsortlistview = a;
        int i1;
        if (DragSortListView.o(a) > 0.0F)
        {
            i1 = 1;
        } else
        {
            i1 = -1;
        }
        DragSortListView.b(dragsortlistview, (float)i1 * f2 * (float)i2);
        d = d + f3 * f2;
        DragSortListView.e(a).x = (int)d;
        if (d < (float)i2 && d > (float)(-i2))
        {
            b = SystemClock.uptimeMillis();
            DragSortListView.a(a, true);
            return;
        }
_L2:
        if (view != null)
        {
            if (g == -1)
            {
                g = DragSortListView.b(a, i, view, false);
                e = view.getHeight() - g;
            }
            int j1 = Math.max((int)(e * f1), 1);
            android.view.ams ams = view.getLayoutParams();
            ams.height = j1 + g;
            view.setLayoutParams(ams);
        }
        if (j != i)
        {
            View view1 = a.getChildAt(j - l1);
            if (view1 != null)
            {
                if (h == -1)
                {
                    h = DragSortListView.b(a, j, view1, false);
                    f = view1.getHeight() - h;
                }
                int k1 = Math.max((int)(f * f1), 1);
                android.view.ams ams1 = view1.getLayoutParams();
                ams1.height = k1 + h;
                view1.setLayoutParams(ams1);
                return;
            }
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void b()
    {
        DragSortListView.q(a);
    }

    public (DragSortListView dragsortlistview, float f1, int i1)
    {
        a = dragsortlistview;
        super(dragsortlistview, f1, i1);
        g = -1;
        h = -1;
    }
}
