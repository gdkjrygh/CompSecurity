// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget.prettylist;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import dix;
import diy;
import diz;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.spotify.android.paste.widget.prettylist:
//            HidingHeaderListView

public class StickyListView extends ViewGroup
{

    public dix a;
    public boolean b;
    public int c;
    public LinkedList d;
    private boolean e;
    private final FrameLayout f;
    private final android.widget.AbsListView.LayoutParams g;
    private diz h;
    private View i;
    private Rect j;
    private boolean k;
    private View l;
    private int m;
    private int n[];
    private int o[];
    private boolean p;

    public StickyListView(Context context)
    {
        this(context, null);
    }

    public StickyListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010074);
    }

    public StickyListView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        g = new android.widget.AbsListView.LayoutParams(0, 0);
        h = new diz(this, (byte)0);
        j = new Rect();
        n = new int[2];
        o = new int[2];
        d = new LinkedList();
        e = true;
        f = new FrameLayout(context);
        f.setLayoutParams(g);
        a = new dix(this, context, attributeset, i1);
        a.setId(0x102000a);
        a.a = true;
        addView(a);
        a.addHeaderView(f, null, false);
        e = false;
        a(d());
    }

    public static boolean a(StickyListView stickylistview)
    {
        return stickylistview.e;
    }

    public static void b(StickyListView stickylistview)
    {
        stickylistview.e();
    }

    public static boolean c(StickyListView stickylistview)
    {
        return stickylistview.f();
    }

    private View d()
    {
        View view = new View(getContext());
        view.setLayoutParams(new android.view.ViewGroup.LayoutParams(0, 0));
        return view;
    }

    public static diz d(StickyListView stickylistview)
    {
        return stickylistview.h;
    }

    private void e()
    {
        int j1 = c;
        float f1;
        Iterator iterator;
        int i1;
        if (a.getFirstVisiblePosition() == 0)
        {
            i1 = Math.min(-f.getTop(), j1);
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
        for (iterator = d.iterator(); iterator.hasNext(); ((diy)iterator.next()).a(i1, f1)) { }
    }

    private boolean f()
    {
        return k && (a.getFirstVisiblePosition() > 0 || f.getTop() <= -c);
    }

    public final ListView a()
    {
        return a;
    }

    public final void a(int i1)
    {
        f.setBackgroundColor(i1);
    }

    public final void a(View view)
    {
        if (i != null)
        {
            removeView(i);
            f.removeView(i);
        }
        View view1 = view;
        if (view == null)
        {
            view1 = d();
        }
        i = view1;
        addView(i);
        requestLayout();
    }

    public final void a(boolean flag)
    {
        k = flag;
        requestLayout();
    }

    public final View b()
    {
        return i;
    }

    public final void b(int i1)
    {
        m = i1;
        requestLayout();
    }

    public final void b(View view)
    {
        l = view;
        requestLayout();
    }

    public final boolean c()
    {
        return b;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (i != null && b)
        {
            i.getHitRect(j);
            if (j.contains((int)motionevent.getX(), (int)motionevent.getY()) && a.onInterceptTouchEvent(motionevent))
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
        int i2 = k1 - i1;
        a.layout(0, 0, i2, l1 - j1);
        if (i.getParent() == f)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (f.getParent() == a)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        k1 = i1;
        if (i1 != 0)
        {
            k1 = i1;
            if (j1 == 0)
            {
                f.removeViewInLayout(i);
                addViewInLayout(i, -1, g);
                k1 = 0;
            }
        }
        if (k1 == 0 && k)
        {
            i.layout(0, 0, i2, i.getMeasuredHeight());
        }
        i1 = ((flag1) ? 1 : 0);
        if (i != null)
        {
            if (!k)
            {
                i1 = ((flag1) ? 1 : 0);
            } else
            if (l == null)
            {
                i1 = i.getMeasuredHeight() - m;
            } else
            {
                i.getLocationInWindow(n);
                l.getLocationInWindow(o);
                i1 = Math.max(0, o[1] - n[1] - m);
            }
        }
        c = i1;
        flag = f();
        if (j1 != 0)
        {
            if (flag && k1 != 0)
            {
                boolean flag2 = i.hasFocus();
                f.removeViewInLayout(i);
                addViewInLayout(i, -1, g);
                if (flag2 && !i.hasFocus())
                {
                    i.requestFocus();
                }
            } else
            if (!flag && k1 == 0)
            {
                removeViewInLayout(i);
                f.addView(i);
            }
        }
        if (i != null && flag != b)
        {
            b = flag;
            e();
        }
        if (flag)
        {
            i.offsetTopAndBottom(-c);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        i.measure(i1, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        a.measure(i1, j1);
        setMeasuredDimension(a.getMeasuredWidth(), a.getMeasuredHeight());
        g.width = i.getMeasuredWidth();
        g.height = i.getMeasuredHeight();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        if (p)
        {
            flag = a.onTouchEvent(motionevent);
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
