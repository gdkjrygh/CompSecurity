// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

// Referenced classes of package com.mobeta.android.dslv:
//            w, b, DragSortListView

public final class a extends w
    implements android.view.GestureDetector.OnGestureListener, android.view.View.OnTouchListener
{

    private int a;
    private boolean b;
    private int c;
    private boolean d;
    private boolean e;
    private GestureDetector f;
    private GestureDetector g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l[];
    private int m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private float r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private DragSortListView w;
    private int x;
    private android.view.GestureDetector.OnGestureListener y;

    public a(DragSortListView dragsortlistview, int i1, int j1, int k1, int l1, int i2)
    {
        super(dragsortlistview);
        a = 0;
        b = true;
        d = false;
        e = false;
        i = -1;
        j = -1;
        k = -1;
        l = new int[2];
        q = false;
        r = 500F;
        y = new b(this);
        w = dragsortlistview;
        f = new GestureDetector(dragsortlistview.getContext(), this);
        g = new GestureDetector(dragsortlistview.getContext(), y);
        g.setIsLongpressEnabled(false);
        h = ViewConfiguration.get(dragsortlistview.getContext()).getScaledTouchSlop();
        s = i1;
        t = l1;
        u = i2;
        c = k1;
        a = j1;
    }

    private int a(MotionEvent motionevent, int i1)
    {
        int j1 = (int)motionevent.getX();
        int k1 = (int)motionevent.getY();
        j1 = w.pointToPosition(j1, k1);
        k1 = w.getHeaderViewsCount();
        int i2 = w.getFooterViewsCount();
        int k2 = w.getCount();
        if (j1 != -1 && j1 >= k1 && j1 < k2 - i2)
        {
            View view = w.getChildAt(j1 - w.getFirstVisiblePosition());
            int j2 = (int)motionevent.getRawX();
            int l1 = (int)motionevent.getRawY();
            if (i1 == 0)
            {
                motionevent = view;
            } else
            {
                motionevent = view.findViewById(i1);
            }
            if (motionevent != null)
            {
                motionevent.getLocationOnScreen(l);
                if (j2 > l[0] && l1 > l[1] && j2 < l[0] + motionevent.getWidth())
                {
                    i1 = l[1];
                    if (l1 < motionevent.getHeight() + i1)
                    {
                        m = view.getLeft();
                        n = view.getTop();
                        return j1;
                    }
                }
            }
        }
        return -1;
    }

    private boolean a(int i1, int j1, int k1)
    {
        int l1 = 0;
        byte byte0 = l1;
        if (b)
        {
            byte0 = l1;
            if (!e)
            {
                byte0 = 12;
            }
        }
        l1 = byte0;
        if (d)
        {
            l1 = byte0;
            if (e)
            {
                l1 = byte0 | 1 | 2;
            }
        }
        q = w.a(i1 - w.getHeaderViewsCount(), l1, j1, k1);
        return q;
    }

    static boolean a(a a1)
    {
        return a1.d;
    }

    static boolean b(a a1)
    {
        return a1.e;
    }

    static DragSortListView c(a a1)
    {
        return a1.w;
    }

    static float d(a a1)
    {
        return a1.r;
    }

    static int e(a a1)
    {
        return a1.x;
    }

    static void f(a a1)
    {
        a1.e = false;
    }

    public final void a(Point point)
    {
        if (d && e)
        {
            x = point.x;
        }
    }

    public final void a(boolean flag)
    {
        b = flag;
    }

    public final void b(boolean flag)
    {
        d = flag;
    }

    public final boolean onDown(MotionEvent motionevent)
    {
        int i1 = -1;
        if (d && c == 0)
        {
            k = a(motionevent, t);
        }
        i = a(motionevent, s);
        if (i != -1 && a == 0)
        {
            a(i, (int)motionevent.getX() - m, (int)motionevent.getY() - n);
        }
        e = false;
        v = true;
        x = 0;
        if (c == 1)
        {
            i1 = a(motionevent, u);
        }
        j = i1;
        return true;
    }

    public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        return false;
    }

    public final void onLongPress(MotionEvent motionevent)
    {
        if (i != -1 && a == 2)
        {
            w.performHapticFeedback(0);
            a(i, o - m, p - n);
        }
    }

    public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        i1 = (int)motionevent.getX();
        j1 = (int)motionevent.getY();
        k1 = (int)motionevent1.getX();
        l1 = (int)motionevent1.getY();
        i2 = k1 - m;
        j2 = l1 - n;
        if (!v || q || i == -1 && j == -1) goto _L2; else goto _L1
_L1:
        if (i == -1) goto _L4; else goto _L3
_L3:
        if (a != 1 || Math.abs(l1 - j1) <= h || !b) goto _L6; else goto _L5
_L5:
        a(i, i2, j2);
_L2:
        return false;
_L6:
        if (a != 0 && Math.abs(k1 - i1) > h && d)
        {
            e = true;
            a(j, i2, j2);
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (j != -1)
        {
            if (Math.abs(k1 - i1) > h && d)
            {
                e = true;
                a(j, i2, j2);
                return false;
            }
            if (Math.abs(l1 - j1) > h)
            {
                v = false;
                return false;
            }
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    public final void onShowPress(MotionEvent motionevent)
    {
    }

    public final boolean onSingleTapUp(MotionEvent motionevent)
    {
        if (d && c == 0 && k != -1)
        {
            w.a(k - w.getHeaderViewsCount());
        }
        return true;
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (!w.c() || w.b())
        {
            return false;
        }
        f.onTouchEvent(motionevent);
        if (d && q && c == 1)
        {
            g.onTouchEvent(motionevent);
        }
        switch (motionevent.getAction() & 0xff)
        {
        case 2: // '\002'
        default:
            return false;

        case 3: // '\003'
            break;

        case 0: // '\0'
            o = (int)motionevent.getX();
            p = (int)motionevent.getY();
            return false;

        case 1: // '\001'
            if (d && e)
            {
                int i1;
                if (x >= 0)
                {
                    i1 = x;
                } else
                {
                    i1 = -x;
                }
                if (i1 > w.getWidth() / 2)
                {
                    w.a(0.0F);
                }
            }
            break;
        }
        e = false;
        q = false;
        return false;
    }
}
