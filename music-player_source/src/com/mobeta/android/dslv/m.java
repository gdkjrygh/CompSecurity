// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.graphics.Point;
import android.view.View;

// Referenced classes of package com.mobeta.android.dslv:
//            t, DragSortListView

final class m extends t
{

    final DragSortListView a;
    private int d;
    private int e;
    private float f;
    private float g;

    public m(DragSortListView dragsortlistview, int i)
    {
        a = dragsortlistview;
        super(dragsortlistview, i);
    }

    private int e()
    {
        int i = a.getFirstVisiblePosition();
        int j = (DragSortListView.j(a) + a.getDividerHeight()) / 2;
        View view = a.getChildAt(d - i);
        if (view != null)
        {
            if (d == e)
            {
                return view.getTop();
            }
            if (d < e)
            {
                return view.getTop() - j;
            } else
            {
                return (view.getBottom() + j) - DragSortListView.k(a);
            }
        } else
        {
            d();
            return -1;
        }
    }

    public final void a()
    {
        d = DragSortListView.h(a);
        e = DragSortListView.i(a);
        DragSortListView.b(a, 2);
        f = DragSortListView.e(a).y - e();
        g = DragSortListView.e(a).x - a.getPaddingLeft();
    }

    public final void a(float f1)
    {
        int i = e();
        int j = a.getPaddingLeft();
        float f2 = DragSortListView.e(a).y - i;
        float f3 = DragSortListView.e(a).x - j;
        f1 = 1.0F - f1;
        if (f1 < Math.abs(f2 / f) || f1 < Math.abs(f3 / g))
        {
            DragSortListView.e(a).y = i + (int)(f * f1);
            DragSortListView.e(a).x = a.getPaddingLeft() + (int)(g * f1);
            DragSortListView.g(a);
        }
    }

    public final void b()
    {
        DragSortListView.l(a);
    }
}
