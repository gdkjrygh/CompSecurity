// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.slidingmenu.lib;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v4.view.ab;
import android.support.v4.view.h;
import android.support.v4.view.n;
import android.support.v4.view.r;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.FloatMath;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.slidingmenu.lib:
//            CustomViewBehind, SlidingMenu

public class CustomViewAbove extends ViewGroup
{
    public static interface a
    {

        public abstract void a(int i1);

        public abstract void a(int i1, float f1, int j1);
    }

    public static class b
        implements a
    {

        public void a(int i1)
        {
        }

        public void a(int i1, float f1, int j1)
        {
        }

        public b()
        {
        }
    }


    private static final Interpolator e = new Interpolator() {

        public float getInterpolation(float f1)
        {
            f1--;
            return f1 * (f1 * f1 * f1 * f1) + 1.0F;
        }

    };
    private boolean A;
    private float B;
    protected int a;
    protected VelocityTracker b;
    protected int c;
    protected int d;
    private View f;
    private int g;
    private Scroller h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private float n;
    private float o;
    private float p;
    private int q;
    private int r;
    private CustomViewBehind s;
    private boolean t;
    private a u;
    private a v;
    private SlidingMenu.c w;
    private SlidingMenu.e x;
    private List y;
    private boolean z;

    public CustomViewAbove(Context context)
    {
        this(context, null);
    }

    public CustomViewAbove(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = -1;
        t = true;
        y = new ArrayList();
        d = 0;
        z = false;
        A = false;
        B = 0.0F;
        a();
    }

    private int a(float f1, int i1, int j1)
    {
        int l1;
        l1 = g;
        if (Math.abs(j1) <= r || Math.abs(i1) <= q)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        if (i1 <= 0 || j1 <= 0) goto _L2; else goto _L1
_L1:
        int k1 = l1 - 1;
_L4:
        return k1;
_L2:
        k1 = l1;
        if (i1 >= 0) goto _L4; else goto _L3
_L3:
        k1 = l1;
        if (j1 >= 0) goto _L4; else goto _L5
_L5:
        return l1 + 1;
        return Math.round((float)g + f1);
    }

    private int a(MotionEvent motionevent, int i1)
    {
        i1 = android.support.v4.view.n.a(motionevent, i1);
        if (i1 == -1)
        {
            a = -1;
        }
        return i1;
    }

    static CustomViewBehind a(CustomViewAbove customviewabove)
    {
        return customviewabove.s;
    }

    private boolean a(MotionEvent motionevent)
    {
        Rect rect = new Rect();
        for (Iterator iterator = y.iterator(); iterator.hasNext();)
        {
            ((View)iterator.next()).getHitRect(rect);
            if (rect.contains((int)motionevent.getX(), (int)motionevent.getY()))
            {
                return true;
            }
        }

        return false;
    }

    private boolean b(float f1)
    {
        if (b())
        {
            return s.b(f1);
        } else
        {
            return s.a(f1);
        }
    }

    private boolean b(MotionEvent motionevent)
    {
        int i1;
        boolean flag1;
        flag1 = false;
        i1 = (int)(motionevent.getX() + B);
        if (!b()) goto _L2; else goto _L1
_L1:
        boolean flag = s.a(f, g, i1);
_L4:
        return flag;
_L2:
        flag = flag1;
        switch (d)
        {
        default:
            return false;

        case 2: // '\002'
            break;

        case 0: // '\0'
            return s.b(f, i1);

        case 1: // '\001'
            flag = flag1;
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (a(motionevent)) goto _L4; else goto _L5
_L5:
        return true;
    }

    private void c(int i1)
    {
        int j1 = getWidth();
        int k1 = i1 / j1;
        i1 %= j1;
        a(k1, (float)i1 / (float)j1, i1);
    }

    private void c(MotionEvent motionevent)
    {
        int i1 = a;
        int k1 = a(motionevent, i1);
        if (i1 != -1 && k1 != -1)
        {
            float f1 = android.support.v4.view.n.c(motionevent, k1);
            float f2 = f1 - o;
            float f3 = Math.abs(f2);
            float f4 = android.support.v4.view.n.d(motionevent, k1);
            float f5 = Math.abs(f4 - p);
            int j1;
            if (b())
            {
                j1 = m / 2;
            } else
            {
                j1 = m;
            }
            if (f3 > (float)j1 && f3 > f5 && b(f2))
            {
                f();
                o = f1;
                p = f4;
                setScrollingCacheEnabled(true);
                return;
            }
            if (f3 > (float)m)
            {
                l = true;
                return;
            }
        }
    }

    private void d(MotionEvent motionevent)
    {
        int i1 = android.support.v4.view.n.b(motionevent);
        if (android.support.v4.view.n.b(motionevent, i1) == a)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            o = android.support.v4.view.n.c(motionevent, i1);
            a = android.support.v4.view.n.b(motionevent, i1);
            if (b != null)
            {
                b.clear();
            }
        }
    }

    private void e()
    {
        if (!j) goto _L2; else goto _L1
_L1:
        setScrollingCacheEnabled(false);
        h.abortAnimation();
        int i1 = getScrollX();
        int j1 = getScrollY();
        int k1 = h.getCurrX();
        int l1 = h.getCurrY();
        if (i1 != k1 || j1 != l1)
        {
            scrollTo(k1, l1);
        }
        if (!b()) goto _L4; else goto _L3
_L3:
        if (x != null)
        {
            x.a();
        }
_L2:
        j = false;
        return;
_L4:
        if (w != null)
        {
            w.a();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private void f()
    {
        k = true;
        A = false;
    }

    private void g()
    {
        A = false;
        k = false;
        l = false;
        a = -1;
        if (b != null)
        {
            b.recycle();
            b = null;
        }
    }

    private int getLeftBound()
    {
        return s.a(f);
    }

    private int getRightBound()
    {
        return s.b(f);
    }

    private void setScrollingCacheEnabled(boolean flag)
    {
        if (i != flag)
        {
            i = flag;
            int j1 = getChildCount();
            for (int i1 = 0; i1 < j1; i1++)
            {
                View view = getChildAt(i1);
                if (view.getVisibility() != 8)
                {
                    view.setDrawingCacheEnabled(flag);
                }
            }

        }
    }

    float a(float f1)
    {
        return FloatMath.sin((float)((double)(f1 - 0.5F) * 0.4712389167638204D));
    }

    public int a(int i1)
    {
        switch (i1)
        {
        default:
            return 0;

        case 0: // '\0'
        case 2: // '\002'
            return s.a(f, i1);

        case 1: // '\001'
            return f.getLeft();
        }
    }

    a a(a a1)
    {
        a a2 = v;
        v = a1;
        return a2;
    }

    void a()
    {
        setWillNotDraw(false);
        setDescendantFocusability(0x40000);
        setFocusable(true);
        Context context = getContext();
        h = new Scroller(context, e);
        ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
        m = ab.a(viewconfiguration);
        q = viewconfiguration.getScaledMinimumFlingVelocity();
        c = viewconfiguration.getScaledMaximumFlingVelocity();
        a(((a) (new b() {

            final CustomViewAbove a;

            public void a(int i1)
            {
                if (CustomViewAbove.a(a) == null) goto _L2; else goto _L1
_L1:
                i1;
                JVM INSTR tableswitch 0 2: default 36
            //                           0 37
            //                           1 49
            //                           2 37;
                   goto _L2 _L3 _L4 _L3
_L2:
                return;
_L3:
                CustomViewAbove.a(a).setChildrenEnabled(true);
                return;
_L4:
                CustomViewAbove.a(a).setChildrenEnabled(false);
                return;
            }

            
            {
                a = CustomViewAbove.this;
                super();
            }
        })));
        r = (int)(context.getResources().getDisplayMetrics().density * 25F);
    }

    protected void a(int i1, float f1, int j1)
    {
        if (u != null)
        {
            u.a(i1, f1, j1);
        }
        if (v != null)
        {
            v.a(i1, f1, j1);
        }
    }

    void a(int i1, int j1, int k1)
    {
        if (getChildCount() != 0) goto _L2; else goto _L1
_L1:
        setScrollingCacheEnabled(false);
_L4:
        return;
_L2:
        int l1;
        int i2;
        int j2;
        l1 = getScrollX();
        i2 = getScrollY();
        j2 = i1 - l1;
        j1 -= i2;
        if (j2 != 0 || j1 != 0)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        e();
        if (!b())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (x == null) goto _L4; else goto _L3
_L3:
        x.a();
        return;
        if (w == null) goto _L4; else goto _L5
_L5:
        w.a();
        return;
        setScrollingCacheEnabled(true);
        j = true;
        i1 = getBehindWidth();
        int k2 = i1 / 2;
        float f3 = Math.min(1.0F, ((float)Math.abs(j2) * 1.0F) / (float)i1);
        float f1 = k2;
        float f2 = k2;
        f3 = a(f3);
        k1 = Math.abs(k1);
        if (k1 > 0)
        {
            i1 = Math.round(1000F * Math.abs((f2 * f3 + f1) / (float)k1)) * 4;
        } else
        {
            i1 = (int)(((float)Math.abs(j2) / (float)i1 + 1.0F) * 100F);
            i1 = 600;
        }
        i1 = Math.min(i1, 600);
        h.startScroll(l1, i2, j2, j1, i1);
        invalidate();
        return;
    }

    public void a(int i1, boolean flag)
    {
        a(i1, flag, true);
    }

    void a(int i1, boolean flag, boolean flag1)
    {
        a(i1, flag, flag1, 0);
    }

    void a(int i1, boolean flag, boolean flag1, int j1)
    {
        if (!flag1 && g == i1)
        {
            setScrollingCacheEnabled(false);
            return;
        }
        int k1 = s.a(i1);
        int l1;
        if (g != k1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        g = k1;
        l1 = a(g);
        if (i1 != 0 && u != null)
        {
            u.a(k1);
        }
        if (i1 != 0 && v != null)
        {
            v.a(k1);
        }
        if (flag)
        {
            a(l1, 0, j1);
            return;
        } else
        {
            e();
            scrollTo(l1, 0);
            return;
        }
    }

    public boolean a(KeyEvent keyevent)
    {
        if (keyevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        keyevent.getKeyCode();
        JVM INSTR lookupswitch 3: default 44
    //                   21: 46
    //                   22: 53
    //                   61: 60;
           goto _L2 _L3 _L4 _L5
_L2:
        return false;
_L3:
        return b(17);
_L4:
        return b(66);
_L5:
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            if (android.support.v4.view.h.a(keyevent))
            {
                return b(2);
            }
            if (android.support.v4.view.h.a(keyevent, 1))
            {
                return b(1);
            }
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public boolean b()
    {
        return g == 0 || g == 2;
    }

    public boolean b(int i1)
    {
        View view;
        View view1;
        view1 = findFocus();
        view = view1;
        if (view1 == this)
        {
            view = null;
        }
        view1 = FocusFinder.getInstance().findNextFocus(this, view, i1);
        if (view1 == null || view1 == view) goto _L2; else goto _L1
_L1:
        if (i1 != 17) goto _L4; else goto _L3
_L3:
        boolean flag = view1.requestFocus();
_L7:
        if (flag)
        {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i1));
        }
        return flag;
_L4:
        if (i1 == 66)
        {
            if (view != null && view1.getLeft() <= view.getLeft())
            {
                flag = d();
            } else
            {
                flag = view1.requestFocus();
            }
            continue; /* Loop/switch isn't completed */
        }
          goto _L5
_L2:
        if (i1 == 17 || i1 == 1)
        {
            flag = c();
            continue; /* Loop/switch isn't completed */
        }
        if (i1 == 66 || i1 == 2)
        {
            flag = d();
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    boolean c()
    {
        if (g > 0)
        {
            a(g - 1, true);
            return true;
        } else
        {
            return false;
        }
    }

    public void computeScroll()
    {
        if (!h.isFinished() && h.computeScrollOffset())
        {
            int i1 = getScrollX();
            int j1 = getScrollY();
            int k1 = h.getCurrX();
            int l1 = h.getCurrY();
            if (i1 != k1 || j1 != l1)
            {
                scrollTo(k1, l1);
                c(k1);
            }
            invalidate();
            return;
        } else
        {
            e();
            return;
        }
    }

    boolean d()
    {
        if (g < 1)
        {
            a(g + 1, true);
            return true;
        } else
        {
            return false;
        }
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        s.a(f, canvas);
        s.a(f, canvas, getPercentOpen());
        s.b(f, canvas, getPercentOpen());
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return super.dispatchKeyEvent(keyevent) || a(keyevent);
    }

    public int getBehindWidth()
    {
        if (s == null)
        {
            return 0;
        } else
        {
            return s.getBehindWidth();
        }
    }

    public View getContent()
    {
        return f;
    }

    public int getContentLeft()
    {
        return f.getLeft() + f.getPaddingLeft();
    }

    public int getCurrentItem()
    {
        return g;
    }

    protected float getPercentOpen()
    {
        return Math.abs(B - (float)f.getLeft()) / (float)getBehindWidth();
    }

    public int getTouchMode()
    {
        return d;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (t) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i1;
        i1 = motionevent.getAction() & 0xff;
        if (i1 == 3 || i1 == 1 || i1 != 0 && l)
        {
            g();
            return false;
        }
        i1;
        JVM INSTR lookupswitch 3: default 80
    //                   0: 129
    //                   2: 121
    //                   6: 244;
           goto _L3 _L4 _L5 _L6
_L3:
        if (!k)
        {
            if (b == null)
            {
                b = VelocityTracker.obtain();
            }
            b.addMovement(motionevent);
        }
        if (z)
        {
            return k;
        }
        break; /* Loop/switch isn't completed */
_L5:
        c(motionevent);
        continue; /* Loop/switch isn't completed */
_L4:
        int j1 = android.support.v4.view.n.b(motionevent);
        a = android.support.v4.view.n.b(motionevent, j1);
        if (a != -1)
        {
            float f1 = android.support.v4.view.n.c(motionevent, j1);
            n = f1;
            o = f1;
            p = android.support.v4.view.n.d(motionevent, j1);
            if (b(motionevent))
            {
                k = false;
                l = false;
                if (b() && s.b(f, g, motionevent.getX() + B))
                {
                    A = true;
                }
            } else
            {
                l = true;
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        d(motionevent);
        if (true) goto _L3; else goto _L7
_L7:
        if (!k && !A) goto _L1; else goto _L8
_L8:
        return true;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        f.layout(0, 0, k1 - i1, l1 - j1);
    }

    protected void onMeasure(int i1, int j1)
    {
        int l1 = getDefaultSize(0, i1);
        int k1 = getDefaultSize(0, j1);
        setMeasuredDimension(l1, k1);
        i1 = getChildMeasureSpec(i1, 0, l1);
        j1 = getChildMeasureSpec(j1, 0, k1);
        f.measure(i1, j1);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1)
        {
            e();
            scrollTo(a(g), getScrollY());
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
_L2:
        return false;
        if (!t || !k && !b(motionevent)) goto _L2; else goto _L1
_L1:
        int i1;
        i1 = motionevent.getAction();
        if (b == null)
        {
            b = VelocityTracker.obtain();
        }
        b.addMovement(motionevent);
        i1 & 0xff;
        JVM INSTR tableswitch 0 6: default 100
    //                   0 102
    //                   1 275
    //                   2 136
    //                   3 453
    //                   4 100
    //                   5 482
    //                   6 511;
           goto _L3 _L4 _L5 _L6 _L7 _L3 _L8 _L9
_L3:
        break; /* Loop/switch isn't completed */
_L9:
        break MISSING_BLOCK_LABEL_511;
_L10:
        return true;
_L4:
        e();
        a = android.support.v4.view.n.b(motionevent, android.support.v4.view.n.b(motionevent));
        float f1 = motionevent.getX();
        n = f1;
        o = f1;
          goto _L10
_L6:
        if (k)
        {
            break; /* Loop/switch isn't completed */
        }
        c(motionevent);
        if (l) goto _L2; else goto _L11
_L11:
        if (!k) goto _L10; else goto _L12
_L12:
        int j1 = a(motionevent, a);
        if (a != -1)
        {
            float f2 = android.support.v4.view.n.c(motionevent, j1);
            float f4 = o;
            o = f2;
            f2 = (float)getScrollX() + (f4 - f2);
            f4 = getLeftBound();
            float f5 = getRightBound();
            if (f2 < f4)
            {
                f2 = f4;
            } else
            if (f2 > f5)
            {
                f2 = f5;
            }
            o = o + (f2 - (float)(int)f2);
            scrollTo((int)f2, getScrollY());
            c((int)f2);
        }
          goto _L10
_L5:
        if (k)
        {
            VelocityTracker velocitytracker = b;
            velocitytracker.computeCurrentVelocity(1000, c);
            int k1 = (int)android.support.v4.view.r.a(velocitytracker, a);
            float f3 = (float)(getScrollX() - a(g)) / (float)getBehindWidth();
            int j2 = a(motionevent, a);
            if (a != -1)
            {
                a(a(f3, k1, (int)(android.support.v4.view.n.c(motionevent, j2) - n)), true, true, k1);
            } else
            {
                a(g, true, true, k1);
            }
            a = -1;
            g();
        } else
        if (A && s.b(f, g, motionevent.getX() + B))
        {
            setCurrentItem(1);
            g();
        }
          goto _L10
_L7:
        if (k)
        {
            a(g, true, true);
            a = -1;
            g();
        }
          goto _L10
_L8:
        int l1 = android.support.v4.view.n.b(motionevent);
        o = android.support.v4.view.n.c(motionevent, l1);
        a = android.support.v4.view.n.b(motionevent, l1);
          goto _L10
        d(motionevent);
        int i2 = a(motionevent, a);
        if (a != -1)
        {
            o = android.support.v4.view.n.c(motionevent, i2);
        }
          goto _L10
    }

    public void scrollTo(int i1, int j1)
    {
        super.scrollTo(i1, j1);
        B = i1;
        if (t)
        {
            s.a(f, i1, j1);
        }
        ((SlidingMenu)getParent()).a(getPercentOpen());
    }

    public void setAboveOffset(int i1)
    {
        f.setPadding(i1, f.getPaddingTop(), f.getPaddingRight(), f.getPaddingBottom());
    }

    public void setContent(View view)
    {
        if (f != null)
        {
            removeView(f);
        }
        f = view;
        addView(f);
    }

    public void setCurrentItem(int i1)
    {
        a(i1, true, true);
    }

    public void setCustomViewBehind(CustomViewBehind customviewbehind)
    {
        s = customviewbehind;
    }

    public void setIgnoreQuickReturn(boolean flag)
    {
        z = flag;
    }

    public void setOnClosedListener(SlidingMenu.c c1)
    {
        w = c1;
    }

    public void setOnOpenedListener(SlidingMenu.e e1)
    {
        x = e1;
    }

    public void setOnPageChangeListener(a a1)
    {
        u = a1;
    }

    public void setSlidingEnabled(boolean flag)
    {
        t = flag;
    }

    public void setTouchMode(int i1)
    {
        d = i1;
    }

}
