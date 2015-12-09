// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.os.SystemClock;
import android.view.View;

// Referenced classes of package com.mobeta.android.dslv:
//            DragSortListView

private class m
    implements Runnable
{

    public static final int a = -1;
    public static final int b = 0;
    public static final int c = 1;
    final DragSortListView d;
    private boolean e;
    private long f;
    private long g;
    private int h;
    private float i;
    private long j;
    private int k;
    private float l;
    private boolean m;
    private int n;
    private int o;

    public void a(int i1)
    {
        if (!m)
        {
            e = false;
            m = true;
            j = SystemClock.uptimeMillis();
            f = j;
            k = i1;
            d.post(this);
        }
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            d.removeCallbacks(this);
            m = false;
            return;
        } else
        {
            e = true;
            return;
        }
    }

    public boolean a()
    {
        return m;
    }

    public int b()
    {
        if (m)
        {
            return k;
        } else
        {
            return -1;
        }
    }

    public void run()
    {
        if (e)
        {
            m = false;
            return;
        }
        int j1 = d.getFirstVisiblePosition();
        int i1 = d.getLastVisiblePosition();
        int l1 = d.getCount();
        int k1 = d.getPaddingTop();
        int i2 = d.getHeight() - k1 - d.getPaddingBottom();
        int j2 = Math.min(DragSortListView.f(d), DragSortListView.r(d) + DragSortListView.d(d));
        int k2 = Math.max(DragSortListView.f(d), DragSortListView.r(d) - DragSortListView.d(d));
        View view1;
        if (k == 0)
        {
            View view = d.getChildAt(0);
            if (view == null)
            {
                m = false;
                return;
            }
            if (j1 == 0 && view.getTop() == k1)
            {
                m = false;
                return;
            }
            l = DragSortListView.u(d).a((DragSortListView.s(d) - (float)k2) / DragSortListView.t(d), f);
        } else
        {
            View view2 = d.getChildAt(i1 - j1);
            if (view2 == null)
            {
                m = false;
                return;
            }
            if (i1 == l1 - 1 && view2.getBottom() <= i2 + k1)
            {
                m = false;
                return;
            }
            l = -DragSortListView.u(d).a(((float)j2 - DragSortListView.v(d)) / DragSortListView.w(d), f);
        }
        g = SystemClock.uptimeMillis();
        i = g - f;
        h = Math.round(l * i);
        if (h >= 0)
        {
            h = Math.min(i2, h);
            i1 = j1;
        } else
        {
            h = Math.max(-i2, h);
        }
        view1 = d.getChildAt(i1 - j1);
        l1 = view1.getTop() + h;
        j1 = l1;
        if (i1 == 0)
        {
            j1 = l1;
            if (l1 > k1)
            {
                j1 = k1;
            }
        }
        DragSortListView.b(d, true);
        d.setSelectionFromTop(i1, j1 - k1);
        d.layoutChildren();
        d.invalidate();
        DragSortListView.b(d, false);
        DragSortListView.c(d, i1, view1, false);
        f = g;
        d.post(this);
    }

    public (DragSortListView dragsortlistview)
    {
        d = dragsortlistview;
        super();
        m = false;
    }
}
