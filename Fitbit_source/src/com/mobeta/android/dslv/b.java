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
//            h, DragSortListView

public class b extends h
    implements android.view.GestureDetector.OnGestureListener, android.view.View.OnTouchListener
{

    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = -1;
    private int A;
    private boolean B;
    private DragSortListView C;
    private int D;
    private android.view.GestureDetector.OnGestureListener E = new android.view.GestureDetector.SimpleOnGestureListener() {

        final b a;

        public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
        {
            if (!b.a(a) || !b.b(a)) goto _L2; else goto _L1
_L1:
            int j2 = b.c(a).getWidth() / 5;
            if (f1 <= b.d(a)) goto _L4; else goto _L3
_L3:
            if (b.e(a) > -j2)
            {
                b.c(a).a(true, f1);
            }
_L6:
            b.a(a, false);
_L2:
            return false;
_L4:
            if (f1 < -b.d(a) && b.e(a) < j2)
            {
                b.c(a).a(true, f1);
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

            
            {
                a = b.this;
                super();
            }
    };
    private int a;
    private boolean b;
    private int i;
    private boolean j;
    private boolean k;
    private GestureDetector l;
    private GestureDetector m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r[];
    private int s;
    private int t;
    private int u;
    private int v;
    private boolean w;
    private float x;
    private int y;
    private int z;

    public b(DragSortListView dragsortlistview)
    {
        this(dragsortlistview, 0, 0, 1);
    }

    public b(DragSortListView dragsortlistview, int i1, int j1, int k1)
    {
        this(dragsortlistview, i1, j1, k1, 0);
    }

    public b(DragSortListView dragsortlistview, int i1, int j1, int k1, int l1)
    {
        this(dragsortlistview, i1, j1, k1, l1, 0);
    }

    public b(DragSortListView dragsortlistview, int i1, int j1, int k1, int l1, int i2)
    {
        super(dragsortlistview);
        a = 0;
        b = true;
        j = false;
        k = false;
        o = -1;
        p = -1;
        q = -1;
        r = new int[2];
        w = false;
        x = 500F;
        C = dragsortlistview;
        l = new GestureDetector(dragsortlistview.getContext(), this);
        m = new GestureDetector(dragsortlistview.getContext(), E);
        m.setIsLongpressEnabled(false);
        n = ViewConfiguration.get(dragsortlistview.getContext()).getScaledTouchSlop();
        y = i1;
        z = l1;
        A = i2;
        c(k1);
        b(j1);
    }

    static boolean a(b b1)
    {
        return b1.j;
    }

    static boolean a(b b1, boolean flag)
    {
        b1.k = flag;
        return flag;
    }

    static boolean b(b b1)
    {
        return b1.k;
    }

    static DragSortListView c(b b1)
    {
        return b1.C;
    }

    static float d(b b1)
    {
        return b1.x;
    }

    static int e(b b1)
    {
        return b1.D;
    }

    public int a()
    {
        return a;
    }

    public int a(MotionEvent motionevent)
    {
        return c(motionevent);
    }

    public int a(MotionEvent motionevent, int i1)
    {
        int j1 = (int)motionevent.getX();
        int k1 = (int)motionevent.getY();
        j1 = C.pointToPosition(j1, k1);
        k1 = C.getHeaderViewsCount();
        int i2 = C.getFooterViewsCount();
        int k2 = C.getCount();
        if (j1 != -1 && j1 >= k1 && j1 < k2 - i2)
        {
            View view = C.getChildAt(j1 - C.getFirstVisiblePosition());
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
                motionevent.getLocationOnScreen(r);
                if (j2 > r[0] && l1 > r[1] && j2 < r[0] + motionevent.getWidth())
                {
                    i1 = r[1];
                    if (l1 < motionevent.getHeight() + i1)
                    {
                        s = view.getLeft();
                        t = view.getTop();
                        return j1;
                    }
                }
            }
        }
        return -1;
    }

    public void a(View view, Point point, Point point1)
    {
        if (j && k)
        {
            D = point.x;
        }
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public boolean a(int i1, int j1, int k1)
    {
        int l1 = 0;
        byte byte0 = l1;
        if (b)
        {
            byte0 = l1;
            if (!k)
            {
                byte0 = 12;
            }
        }
        l1 = byte0;
        if (j)
        {
            l1 = byte0;
            if (k)
            {
                l1 = byte0 | 1 | 2;
            }
        }
        w = C.a(i1 - C.getHeaderViewsCount(), l1, j1, k1);
        return w;
    }

    public int b(MotionEvent motionevent)
    {
        if (i == 1)
        {
            return d(motionevent);
        } else
        {
            return -1;
        }
    }

    public void b(int i1)
    {
        a = i1;
    }

    public void b(boolean flag)
    {
        j = flag;
    }

    public boolean b()
    {
        return b;
    }

    public int c()
    {
        return i;
    }

    public int c(MotionEvent motionevent)
    {
        return a(motionevent, y);
    }

    public void c(int i1)
    {
        i = i1;
    }

    public int d(MotionEvent motionevent)
    {
        return a(motionevent, A);
    }

    public void d(int i1)
    {
        y = i1;
    }

    public boolean d()
    {
        return j;
    }

    public void e(int i1)
    {
        A = i1;
    }

    public void f(int i1)
    {
        z = i1;
    }

    public boolean onDown(MotionEvent motionevent)
    {
        if (j && i == 0)
        {
            q = a(motionevent, z);
        }
        o = a(motionevent);
        if (o != -1 && a == 0)
        {
            a(o, (int)motionevent.getX() - s, (int)motionevent.getY() - t);
        }
        k = false;
        B = true;
        D = 0;
        p = b(motionevent);
        return true;
    }

    public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        return false;
    }

    public void onLongPress(MotionEvent motionevent)
    {
        if (o != -1 && a == 2)
        {
            C.performHapticFeedback(0);
            a(o, u - s, v - t);
        }
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
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
        i2 = k1 - s;
        j2 = l1 - t;
        if (!B || w || o == -1 && p == -1) goto _L2; else goto _L1
_L1:
        if (o == -1) goto _L4; else goto _L3
_L3:
        if (a != 1 || Math.abs(l1 - j1) <= n || !b) goto _L6; else goto _L5
_L5:
        a(o, i2, j2);
_L2:
        return false;
_L6:
        if (a != 0 && Math.abs(k1 - i1) > n && j)
        {
            k = true;
            a(p, i2, j2);
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (p != -1)
        {
            if (Math.abs(k1 - i1) > n && j)
            {
                k = true;
                a(p, i2, j2);
                return false;
            }
            if (Math.abs(l1 - j1) > n)
            {
                B = false;
                return false;
            }
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    public void onShowPress(MotionEvent motionevent)
    {
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        if (j && i == 0 && q != -1)
        {
            C.a(q - C.getHeaderViewsCount());
        }
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (!C.e() || C.d())
        {
            return false;
        }
        l.onTouchEvent(motionevent);
        if (j && w && i == 1)
        {
            m.onTouchEvent(motionevent);
        }
        switch (motionevent.getAction() & 0xff)
        {
        case 2: // '\002'
        default:
            return false;

        case 3: // '\003'
            break;

        case 0: // '\0'
            u = (int)motionevent.getX();
            v = (int)motionevent.getY();
            return false;

        case 1: // '\001'
            if (j && k)
            {
                int i1;
                if (D >= 0)
                {
                    i1 = D;
                } else
                {
                    i1 = -D;
                }
                if (i1 > C.getWidth() / 2)
                {
                    C.a(true, 0.0F);
                }
            }
            break;
        }
        k = false;
        w = false;
        return false;
    }
}
