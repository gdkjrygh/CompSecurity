// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.graphics.Point;
import android.view.View;

// Referenced classes of package com.mobeta.android.dslv:
//            DragSortListView

private class <init> extends <init>
{

    final DragSortListView a;
    private int d;
    private int e;
    private float f;
    private float g;

    private int e()
    {
        int i = a.getFirstVisiblePosition();
        int j = (DragSortListView.i(a) + a.getDividerHeight()) / 2;
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
                return (view.getBottom() + j) - DragSortListView.j(a);
            }
        } else
        {
            d();
            return -1;
        }
    }

    public void a()
    {
        d = DragSortListView.g(a);
        e = DragSortListView.h(a);
        DragSortListView.b(a, 2);
        f = DragSortListView.e(a).y - e();
        g = DragSortListView.e(a).x - a.getPaddingLeft();
    }

    public void a(float f1, float f2)
    {
        int i = e();
        int j = a.getPaddingLeft();
        f1 = DragSortListView.e(a).y - i;
        float f3 = DragSortListView.e(a).x - j;
        f2 = 1.0F - f2;
        if (f2 < Math.abs(f1 / f) || f2 < Math.abs(f3 / g))
        {
            DragSortListView.e(a).y = i + (int)(f * f2);
            DragSortListView.e(a).x = a.getPaddingLeft() + (int)(g * f2);
            DragSortListView.a(a, true);
        }
    }

    public void b()
    {
        DragSortListView.k(a);
    }

    public (DragSortListView dragsortlistview, float f1, int i)
    {
        a = dragsortlistview;
        super(dragsortlistview, f1, i);
    }
}
