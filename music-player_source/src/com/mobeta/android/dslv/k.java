// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.os.SystemClock;
import android.view.View;

// Referenced classes of package com.mobeta.android.dslv:
//            DragSortListView, j

final class k
    implements Runnable
{

    final DragSortListView a;
    private boolean b;
    private long c;
    private long d;
    private int e;
    private float f;
    private long g;
    private int h;
    private float i;
    private boolean j;

    public k(DragSortListView dragsortlistview)
    {
        a = dragsortlistview;
        super();
        j = false;
    }

    public final void a(int l)
    {
        if (!j)
        {
            b = false;
            j = true;
            g = SystemClock.uptimeMillis();
            c = g;
            h = l;
            a.post(this);
        }
    }

    public final boolean a()
    {
        return j;
    }

    public final int b()
    {
        if (j)
        {
            return h;
        } else
        {
            return -1;
        }
    }

    public final void c()
    {
        a.removeCallbacks(this);
        j = false;
    }

    public final void run()
    {
        if (b)
        {
            j = false;
            return;
        }
        int i1 = a.getFirstVisiblePosition();
        int l = a.getLastVisiblePosition();
        int k1 = a.getCount();
        int j1 = a.getPaddingTop();
        int l1 = a.getHeight() - j1 - a.getPaddingBottom();
        int i2 = Math.min(DragSortListView.f(a), DragSortListView.s(a) + DragSortListView.c(a));
        int j2 = Math.max(DragSortListView.f(a), DragSortListView.s(a) - DragSortListView.c(a));
        View view;
        if (h == 0)
        {
            Object obj = a.getChildAt(0);
            if (obj == null)
            {
                j = false;
                return;
            }
            if (i1 == 0 && ((View) (obj)).getTop() == j1)
            {
                j = false;
                return;
            }
            obj = DragSortListView.t(a);
            float f1 = (DragSortListView.u(a) - (float)j2) / DragSortListView.v(a);
            long l2 = c;
            i = ((j) (obj)).a(f1);
        } else
        {
            Object obj1 = a.getChildAt(l - i1);
            if (obj1 == null)
            {
                j = false;
                return;
            }
            if (l == k1 - 1 && ((View) (obj1)).getBottom() <= l1 + j1)
            {
                j = false;
                return;
            }
            obj1 = DragSortListView.t(a);
            float f2 = ((float)i2 - DragSortListView.w(a)) / DragSortListView.x(a);
            long l3 = c;
            i = -((j) (obj1)).a(f2);
        }
        d = SystemClock.uptimeMillis();
        f = d - c;
        e = Math.round(i * f);
        if (e >= 0)
        {
            e = Math.min(l1, e);
            l = i1;
        } else
        {
            e = Math.max(-l1, e);
        }
        view = a.getChildAt(l - i1);
        k1 = view.getTop() + e;
        i1 = k1;
        if (l == 0)
        {
            i1 = k1;
            if (k1 > j1)
            {
                i1 = j1;
            }
        }
        DragSortListView.a(a, true);
        a.setSelectionFromTop(l, i1 - j1);
        a.layoutChildren();
        a.invalidate();
        DragSortListView.a(a, false);
        DragSortListView.c(a, l, view);
        c = d;
        a.post(this);
    }
}
