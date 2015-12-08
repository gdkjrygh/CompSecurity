// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jeremyfeinstein.slidingmenu.lib;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v4.view.aj;
import android.support.v4.view.ax;
import android.support.v4.view.r;
import android.support.v4.view.w;
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

// Referenced classes of package com.jeremyfeinstein.slidingmenu.lib:
//            a, b, CustomViewBehind, c, 
//            SlidingMenu, m, o

public class CustomViewAbove extends ViewGroup
{

    private static final Interpolator e = new a();
    private float A;
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
    private c u;
    private c v;
    private m w;
    private o x;
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
        A = 0.0F;
        setWillNotDraw(false);
        setDescendantFocusability(0x40000);
        setFocusable(true);
        context = getContext();
        h = new Scroller(context, e);
        attributeset = ViewConfiguration.get(context);
        m = ax.a(attributeset);
        q = attributeset.getScaledMinimumFlingVelocity();
        c = attributeset.getScaledMaximumFlingVelocity();
        attributeset = new b(this);
        c c1 = v;
        v = attributeset;
        r = (int)(context.getResources().getDisplayMetrics().density * 25F);
    }

    private int a(MotionEvent motionevent, int i1)
    {
        i1 = android.support.v4.view.w.a(motionevent, i1);
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

    private void a(int i1, boolean flag, boolean flag1)
    {
        a(i1, flag, flag1, 0);
    }

    private void a(int i1, boolean flag, boolean flag1, int j1)
    {
        if (flag1 || g != i1) goto _L2; else goto _L1
_L1:
        a(false);
_L4:
        return;
_L2:
        int k1;
        int l1;
        int i2;
        int j2;
        k1 = s.d(i1);
        if (g != k1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        g = k1;
        i2 = c(g);
        if (i1 != 0 && u != null)
        {
            u.a(k1);
        }
        if (i1 != 0 && v != null)
        {
            v.a(k1);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_333;
        }
        if (getChildCount() == 0)
        {
            a(false);
            return;
        }
        k1 = getScrollX();
        l1 = getScrollY();
        i2 -= k1;
        j2 = 0 - l1;
        if (i2 != 0 || j2 != 0)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        g();
        if (!d())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (x == null) goto _L4; else goto _L3
_L3:
        o o1 = x;
        return;
        if (w == null) goto _L4; else goto _L5
_L5:
        m m1 = w;
        return;
        a(true);
        j = true;
        i1 = e();
        int k2 = i1 / 2;
        float f3 = Math.min(1.0F, (1.0F * (float)Math.abs(i2)) / (float)i1);
        float f1 = k2;
        float f2 = k2;
        f3 = FloatMath.sin((float)((double)(f3 - 0.5F) * 0.4712389167638204D));
        i1 = Math.abs(j1);
        if (i1 > 0)
        {
            i1 = Math.round(Math.abs((f3 * f2 + f1) / (float)i1) * 1000F) * 4;
        } else
        {
            Math.abs(i2);
            i1 = 600;
        }
        i1 = Math.min(i1, 600);
        h.startScroll(k1, l1, i2, j2, i1);
        invalidate();
        return;
        g();
        scrollTo(i2, 0);
        return;
    }

    private void a(boolean flag)
    {
        if (i != flag)
        {
            i = flag;
        }
    }

    private boolean a(MotionEvent motionevent)
    {
        int i1;
        i1 = (int)(motionevent.getX() + A);
        if (d())
        {
            return s.a(f, g, i1);
        }
        d;
        JVM INSTR tableswitch 0 2: default 68
    //                   0 147
    //                   1 70
    //                   2 145;
           goto _L1 _L2 _L3 _L4
_L1:
        return false;
_L3:
        Rect rect;
        Iterator iterator;
        rect = new Rect();
        iterator = y.iterator();
_L8:
        if (iterator.hasNext()) goto _L6; else goto _L5
_L5:
        i1 = 0;
_L9:
        return i1 == 0;
_L6:
        ((View)iterator.next()).getHitRect(rect);
        if (!rect.contains((int)motionevent.getX(), (int)motionevent.getY())) goto _L8; else goto _L7
_L7:
        i1 = 1;
          goto _L9
_L4:
        return false;
_L2:
        return s.b(f, i1);
    }

    private void b(MotionEvent motionevent)
    {
        int i1 = a;
        int k1 = a(motionevent, i1);
        if (i1 != -1 && k1 != -1)
        {
            float f1 = android.support.v4.view.w.c(motionevent, k1);
            float f2 = f1 - o;
            float f3 = Math.abs(f2);
            float f4 = android.support.v4.view.w.d(motionevent, k1);
            float f5 = Math.abs(f4 - p);
            int j1;
            if (d())
            {
                j1 = m / 2;
            } else
            {
                j1 = m;
            }
            if (f3 > (float)j1 && f3 > f5)
            {
                boolean flag;
                if (d())
                {
                    flag = s.d(f2);
                } else
                {
                    flag = s.c(f2);
                }
                if (flag)
                {
                    k = true;
                    z = false;
                    o = f1;
                    p = f4;
                    a(true);
                    return;
                }
            }
            if (f3 > (float)m)
            {
                l = true;
                return;
            }
        }
    }

    private int c(int i1)
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

    private void c(MotionEvent motionevent)
    {
        int i1 = android.support.v4.view.w.b(motionevent);
        if (android.support.v4.view.w.b(motionevent, i1) == a)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            o = android.support.v4.view.w.c(motionevent, i1);
            a = android.support.v4.view.w.b(motionevent, i1);
            if (b != null)
            {
                b.clear();
            }
        }
    }

    private boolean d()
    {
        return g == 0 || g == 2;
    }

    private boolean d(int i1)
    {
        View view;
        View view1;
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = false;
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
        flag = view1.requestFocus();
_L7:
        if (flag)
        {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i1));
        }
        return flag;
_L4:
        if (i1 != 66)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (view == null || view1.getLeft() > view.getLeft())
        {
            flag = view1.requestFocus();
            continue; /* Loop/switch isn't completed */
        }
          goto _L5
_L2:
        if (i1 == 17 || i1 == 1)
        {
            if (g > 0)
            {
                a(g - 1, true, false);
                flag = true;
            } else
            {
                flag = false;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (i1 != 66 && i1 != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        if (g <= 0)
        {
            a(g + 1, true, false);
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private int e()
    {
        if (s == null)
        {
            return 0;
        } else
        {
            return s.a();
        }
    }

    private void f()
    {
        getWidth();
        c c1;
        if (u != null)
        {
            c1 = u;
        }
        if (v != null)
        {
            c1 = v;
        }
    }

    private void g()
    {
        if (!j) goto _L2; else goto _L1
_L1:
        a(false);
        h.abortAnimation();
        int i1 = getScrollX();
        int j1 = getScrollY();
        int k1 = h.getCurrX();
        int l1 = h.getCurrY();
        if (i1 != k1 || j1 != l1)
        {
            scrollTo(k1, l1);
        }
        if (!d()) goto _L4; else goto _L3
_L3:
        Object obj;
        if (x != null)
        {
            obj = x;
        }
_L2:
        j = false;
        return;
_L4:
        if (w != null)
        {
            obj = w;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private void h()
    {
        z = false;
        k = false;
        l = false;
        a = -1;
        if (b != null)
        {
            b.recycle();
            b = null;
        }
    }

    public final int a()
    {
        return g;
    }

    public final void a(int i1)
    {
        a(i1, true, false);
    }

    public final void a(int i1, boolean flag)
    {
        a(i1, flag, false);
    }

    public final void a(View view)
    {
        if (f != null)
        {
            removeView(f);
        }
        f = view;
        addView(f);
    }

    public final void a(CustomViewBehind customviewbehind)
    {
        s = customviewbehind;
    }

    public final void a(c c1)
    {
        u = c1;
    }

    public final View b()
    {
        return f;
    }

    public final void b(int i1)
    {
        d = i1;
    }

    protected final float c()
    {
        return Math.abs(A - (float)f.getLeft()) / (float)e();
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
                f();
            }
            invalidate();
            return;
        } else
        {
            g();
            return;
        }
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        s.a(f, canvas);
        s.a(f, canvas, c());
        s.b(f, canvas, c());
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (super.dispatchKeyEvent(keyevent)) goto _L2; else goto _L1
_L1:
        if (keyevent.getAction() != 0) goto _L4; else goto _L3
_L3:
        keyevent.getKeyCode();
        JVM INSTR lookupswitch 3: default 52
    //                   21: 60
    //                   22: 70
    //                   61: 80;
           goto _L4 _L5 _L6 _L7
_L4:
        boolean flag = false;
_L8:
        if (!flag)
        {
            return false;
        }
          goto _L2
_L5:
        flag = d(17);
          goto _L8
_L6:
        flag = d(66);
          goto _L8
_L7:
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L4; else goto _L9
_L9:
        if (!android.support.v4.view.r.b(keyevent))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = d(2);
          goto _L8
        if (!android.support.v4.view.r.a(keyevent)) goto _L4; else goto _L10
_L10:
        flag = d(1);
          goto _L8
_L2:
        return true;
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
            h();
            return false;
        }
        i1;
        JVM INSTR lookupswitch 3: default 80
    //                   0: 133
    //                   2: 125
    //                   6: 248;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_248;
_L3:
        break; /* Loop/switch isn't completed */
_L5:
        break; /* Loop/switch isn't completed */
_L8:
        if (!k)
        {
            if (b == null)
            {
                b = VelocityTracker.obtain();
            }
            b.addMovement(motionevent);
        }
        if (k || z)
        {
            return true;
        }
        if (true) goto _L1; else goto _L7
_L7:
        b(motionevent);
          goto _L8
_L4:
        int j1 = android.support.v4.view.w.b(motionevent);
        a = android.support.v4.view.w.b(motionevent, j1);
        if (a != -1)
        {
            float f1 = android.support.v4.view.w.c(motionevent, j1);
            n = f1;
            o = f1;
            p = android.support.v4.view.w.d(motionevent, j1);
            if (a(motionevent))
            {
                k = false;
                l = false;
                if (d() && s.b(f, g, motionevent.getX() + A))
                {
                    z = true;
                }
            } else
            {
                l = true;
            }
        }
          goto _L8
        c(motionevent);
          goto _L8
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
            g();
            scrollTo(c(g), getScrollY());
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
_L2:
        return false;
        if (!t || !k && !a(motionevent)) goto _L2; else goto _L1
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
    //                   1 287
    //                   2 136
    //                   3 552
    //                   4 100
    //                   5 581
    //                   6 610;
           goto _L3 _L4 _L5 _L6 _L7 _L3 _L8 _L9
_L3:
        break; /* Loop/switch isn't completed */
_L9:
        break MISSING_BLOCK_LABEL_610;
_L10:
        return true;
_L4:
        g();
        a = android.support.v4.view.w.b(motionevent, android.support.v4.view.w.b(motionevent));
        float f1 = motionevent.getX();
        n = f1;
        o = f1;
          goto _L10
_L6:
        if (k)
        {
            break; /* Loop/switch isn't completed */
        }
        b(motionevent);
        if (l) goto _L2; else goto _L11
_L11:
        if (!k) goto _L10; else goto _L12
_L12:
        int j1 = a(motionevent, a);
        if (a != -1)
        {
            float f2 = android.support.v4.view.w.c(motionevent, j1);
            float f4 = o;
            o = f2;
            f2 = (float)getScrollX() + (f4 - f2);
            f4 = s.b(f);
            float f5 = s.c(f);
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
            f();
        }
          goto _L10
_L5:
        if (k)
        {
            VelocityTracker velocitytracker = b;
            velocitytracker.computeCurrentVelocity(1000, c);
            int k2 = (int)aj.a(velocitytracker, a);
            float f3 = (float)(getScrollX() - c(g)) / (float)e();
            int k1 = a(motionevent, a);
            if (a != -1)
            {
                int l2 = (int)(android.support.v4.view.w.c(motionevent, k1) - n);
                int j2 = g;
                if (Math.abs(l2) > r && Math.abs(k2) > q)
                {
                    if (k2 > 0 && l2 > 0)
                    {
                        k1 = j2 - 1;
                    } else
                    {
                        k1 = j2;
                        if (k2 < 0)
                        {
                            k1 = j2;
                            if (l2 < 0)
                            {
                                k1 = j2 + 1;
                            }
                        }
                    }
                } else
                {
                    k1 = Math.round((float)g + f3);
                }
                a(k1, true, true, k2);
            } else
            {
                a(g, true, true, k2);
            }
            a = -1;
            h();
        } else
        if (z && s.b(f, g, motionevent.getX() + A))
        {
            a(1, true, false);
            h();
        }
          goto _L10
_L7:
        if (k)
        {
            a(g, true, true);
            a = -1;
            h();
        }
          goto _L10
_L8:
        int l1 = android.support.v4.view.w.b(motionevent);
        o = android.support.v4.view.w.c(motionevent, l1);
        a = android.support.v4.view.w.b(motionevent, l1);
          goto _L10
        c(motionevent);
        int i2 = a(motionevent, a);
        if (a != -1)
        {
            o = android.support.v4.view.w.c(motionevent, i2);
        }
          goto _L10
    }

    public void scrollTo(int i1, int j1)
    {
        super.scrollTo(i1, j1);
        A = i1;
        s.a(f, i1, j1);
        ((SlidingMenu)getParent()).b(c());
    }

}
