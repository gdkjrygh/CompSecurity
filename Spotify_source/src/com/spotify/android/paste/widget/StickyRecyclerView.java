// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import abd;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import dgu;
import dgv;
import dgw;
import dgx;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StickyRecyclerView extends ViewGroup
{

    private boolean a;
    private int b;
    private RecyclerView c;
    private final android.widget.AbsListView.LayoutParams d;
    private dgx e;
    private View f;
    private Rect g;
    private final Paint h;
    private boolean i;
    private boolean j;
    private int k;
    private View l;
    private int m;
    private int n[];
    private int o[];
    private boolean p;
    private Set q;

    public StickyRecyclerView(Context context)
    {
        this(context, null);
    }

    public StickyRecyclerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010074);
    }

    public StickyRecyclerView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        d = new android.widget.AbsListView.LayoutParams(0, 0);
        e = new dgx(this, (byte)0);
        g = new Rect();
        h = new Paint();
        n = new int[2];
        o = new int[2];
        q = new HashSet();
        a = true;
        c = new dgv(this, context, attributeset, i1);
        c.a(new dgu(this, (byte)0));
        addView(c);
        a = false;
        a(c());
    }

    public static boolean a(StickyRecyclerView stickyrecyclerview)
    {
        return stickyrecyclerview.a;
    }

    public static void b(StickyRecyclerView stickyrecyclerview)
    {
        stickyrecyclerview.h();
    }

    private View c()
    {
        View view = new View(getContext());
        view.setLayoutParams(new android.view.ViewGroup.LayoutParams(0, 0));
        return view;
    }

    public static dgx c(StickyRecyclerView stickyrecyclerview)
    {
        return stickyrecyclerview.e;
    }

    public static int d(StickyRecyclerView stickyrecyclerview)
    {
        return stickyrecyclerview.d.height;
    }

    private void d()
    {
        int j1 = k;
        float f1;
        Iterator iterator;
        int i1;
        if (e())
        {
            i1 = Math.min(-f(), j1);
        } else
        {
            i1 = j1;
        }
        if (j1 != 0)
        {
            f1 = (float)i1 / (float)j1;
        } else
        {
            f1 = 0.0F;
        }
        for (iterator = q.iterator(); iterator.hasNext(); ((dgw)iterator.next()).a(i1, f1)) { }
    }

    public static Paint e(StickyRecyclerView stickyrecyclerview)
    {
        return stickyrecyclerview.h;
    }

    private boolean e()
    {
        while (c.f.p() == 0 || RecyclerView.d(c.f.d(0)) == 0) 
        {
            return true;
        }
        return false;
    }

    private int f()
    {
        Object obj;
        int i1;
        boolean flag;
        flag = false;
        obj = c.f;
        i1 = ((flag) ? 1 : 0);
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (((abd) (obj)).p() != 0) goto _L4; else goto _L3
_L3:
        i1 = ((flag) ? 1 : 0);
_L2:
        return i1 - d.height;
_L4:
        obj = ((abd) (obj)).d(0);
        i1 = abd.h(((View) (obj))) + d.height;
        if (((View) (obj)).getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            i1 -= ((android.view.ViewGroup.MarginLayoutParams)((View) (obj)).getLayoutParams()).topMargin;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public static boolean f(StickyRecyclerView stickyrecyclerview)
    {
        return stickyrecyclerview.e();
    }

    public static int g(StickyRecyclerView stickyrecyclerview)
    {
        return stickyrecyclerview.f();
    }

    private boolean g()
    {
        return i && (!e() || f() < -k);
    }

    public static View h(StickyRecyclerView stickyrecyclerview)
    {
        return stickyrecyclerview.f;
    }

    private void h()
    {
        int i1;
        int j1;
        if (g())
        {
            i1 = -k;
        } else
        {
            i1 = f();
        }
        j1 = f.getTop();
        f.offsetTopAndBottom(i1 - j1);
        d();
    }

    public final RecyclerView a()
    {
        return c;
    }

    public final void a(int i1)
    {
        h.setColor(i1);
        c.p();
    }

    public final void a(View view)
    {
        if (f != null)
        {
            removeView(f);
        }
        View view1 = view;
        if (view == null)
        {
            view1 = c();
        }
        f = view1;
        addView(f);
        requestLayout();
    }

    public final void a(dgw dgw1)
    {
        q.add(dgw1);
    }

    public final void b()
    {
        i = true;
        requestLayout();
    }

    public final void b(int i1)
    {
        b = i1;
        requestLayout();
    }

    public final void b(View view)
    {
        l = view;
        requestLayout();
    }

    public final void b(dgw dgw1)
    {
        q.remove(dgw1);
    }

    public final void c(int i1)
    {
        m = i1;
        requestLayout();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (f != null)
        {
            f.getHitRect(g);
            if (g.contains((int)motionevent.getX(), (int)motionevent.getY()) && c.onInterceptTouchEvent(motionevent))
            {
                p = true;
                return true;
            }
        }
        return false;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        boolean flag1 = false;
        i1 = k1 - i1;
        c.layout(0, 0, i1, l1 - j1);
        f.layout(0, 0, i1, f.getMeasuredHeight());
        i1 = ((flag1) ? 1 : 0);
        if (f != null)
        {
            if (!i)
            {
                i1 = ((flag1) ? 1 : 0);
            } else
            if (l == null)
            {
                i1 = f.getMeasuredHeight() - m;
            } else
            {
                f.getLocationInWindow(n);
                l.getLocationInWindow(o);
                i1 = Math.max(0, o[1] - n[1] - m);
            }
        }
        k = i1;
        flag = g();
        if (f != null && flag != j)
        {
            j = flag;
            d();
        }
        h();
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        if (b > 0)
        {
            k1 = android.view.View.MeasureSpec.makeMeasureSpec(b, 0x40000000);
        } else
        {
            k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        f.measure(i1, k1);
        c.measure(i1, j1);
        setMeasuredDimension(c.getMeasuredWidth(), c.getMeasuredHeight());
        d.width = f.getMeasuredWidth();
        d.height = f.getMeasuredHeight();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        if (p)
        {
            flag = c.onTouchEvent(motionevent);
        } else
        {
            flag = super.onTouchEvent(motionevent);
        }
        if (motionevent.getAction() == 1 || motionevent.getAction() == 3)
        {
            p = false;
        }
        return flag;
    }
}
