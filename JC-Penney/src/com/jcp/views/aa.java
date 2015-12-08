// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.support.v4.view.ba;
import android.support.v4.view.bl;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ScrollView;
import android.widget.Scroller;

// Referenced classes of package com.jcp.views:
//            ab, DataListView

public class aa
    implements android.view.View.OnTouchListener
{

    private final int a;
    private final int b;
    private final int c = 400;
    private VelocityTracker d;
    private float e;
    private float f;
    private Scroller g;
    private Runnable h;
    private ScrollView i;
    private ViewGroup j;
    private int k;
    private int l;

    public aa(ScrollView scrollview, ViewGroup viewgroup)
    {
        e = -1F;
        f = -1F;
        i = scrollview;
        j = viewgroup;
        i.setOnTouchListener(this);
        g = new Scroller(i.getContext(), new DecelerateInterpolator(1.0F));
        h = new ab(this);
        scrollview = ViewConfiguration.get(scrollview.getContext());
        a = scrollview.getScaledMinimumFlingVelocity();
        b = scrollview.getScaledMaximumFlingVelocity();
    }

    static Scroller a(aa aa1)
    {
        return aa1.g;
    }

    private int b(int i1, int j1)
    {
        double d1 = Math.ceil((double)i1 / (double)j1);
        if (d1 == 0.0D || d1 == (double)(c() - 1))
        {
            l = 0;
        }
        if ((int)d1 == 0)
        {
            return i1;
        } else
        {
            return (int)d1 * j1;
        }
    }

    static ScrollView b(aa aa1)
    {
        return aa1.i;
    }

    final int a(int i1, int j1)
    {
        i1 = ((DataListView)i).getViewMaxHeight();
        k = ((j1 + i1) - j.getPaddingTop()) / i1;
        return k;
    }

    void a()
    {
        if (!g.isFinished())
        {
            g.abortAnimation();
            i.removeCallbacks(h);
        }
    }

    void a(int i1)
    {
        int j2 = g.getFinalY();
        int k1 = i.getHeight();
        int j1 = 0;
        int l1 = j2;
        while (j1 < c()) 
        {
            View view = j.getChildAt(j1);
            int k2 = view.getTop() - j2;
            int i2 = k1;
            if (Math.abs(k2) < Math.abs(k1))
            {
                l1 = view.getTop();
                i2 = k2;
            }
            j1++;
            k1 = i2;
        }
        i1 = b(l1, i1);
        g.setFinalY(i1);
    }

    void a(int i1, float f1)
    {
        char c1 = '\u0190';
        int j1 = i1;
        if (i1 < 0)
        {
            j1 = 0;
        }
        i1 = j1;
        if (j1 >= c())
        {
            i1 = c() - 1;
        }
        if (i1 < 0)
        {
            return;
        }
        j1 = j.getChildAt(i1).getTop() - i.getScrollY();
        i1 = c1;
        if (f1 > 0.99F)
        {
            i1 = Math.max(400, (int)((float)j1 / Math.abs(f1)));
        }
        g.startScroll(0, d(), 0, j1, i1);
        i.post(h);
    }

    void b()
    {
        e = -1F;
        f = -1F;
        if (d != null)
        {
            d.recycle();
            d = null;
        }
    }

    public int c()
    {
        return j.getChildCount();
    }

    final int d()
    {
        return i.getScrollY();
    }

    public int e()
    {
        return k;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (view != i)
        {
            return false;
        }
        int k1 = ba.b(motionevent);
        int i1 = ba.a(motionevent);
        k1 = ba.b(motionevent, k1);
        if (d == null)
        {
            d = VelocityTracker.obtain();
        }
        switch (i1)
        {
        default:
            return false;

        case 0: // '\0'
            a();
            d.addMovement(motionevent);
            e = motionevent.getY();
            f = e;
            return false;

        case 2: // '\002'
            d.addMovement(motionevent);
            f = motionevent.getY();
            return false;

        case 1: // '\001'
            d.addMovement(motionevent);
            d.computeCurrentVelocity(1000, b);
            float f1 = bl.b(d, k1);
            int j1 = i.getHeight();
            k1 = j.getHeight();
            int l1 = d();
            k = a(j1, l1);
            if (l > l1)
            {
                k = k - 1;
            }
            if (c() - 1 == k)
            {
                l = 0;
            } else
            {
                l = l1;
            }
            l1 = ((DataListView)i).getViewMaxHeight();
            if (d() < 0)
            {
                a(0, 0.0F);
            } else
            if (d() > k1 - j1)
            {
                a(c() - 1, 0.0F);
            } else
            if (Math.abs(f1) < (float)a)
            {
                if (((DataListView)i).getTotalDataSize() - 1 > e())
                {
                    a(k, f1);
                }
            } else
            if (Math.abs(f1) >= (float)a)
            {
                g.fling(0, d(), 0, (int)(-f1), 0, 0, 0, k1 - j1);
                if (((DataListView)i).getTotalDataSize() - 1 > e())
                {
                    a(l1);
                }
                i.post(h);
            }
            b();
            return true;

        case 3: // '\003'
            b();
            a();
            return false;
        }
    }
}
