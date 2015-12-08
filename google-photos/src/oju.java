// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;

public class oju extends ViewGroup
{

    private static final Interpolator m = new ojv();
    private float a[] = {
        0.0F, 0.0F
    };
    private final int b[] = {
        0x80000001, 0x7fffffff
    };
    private int c;
    private int d;
    private int e;
    private float f;
    private VelocityTracker g;
    public boolean h;
    public boolean i;
    private boolean j;
    private boolean k;
    private Scroller l;

    public oju(Context context)
    {
        super(context);
        f = 0.0F;
        h = false;
        j = false;
        k = false;
        i = true;
        context = getContext();
        setFocusable(false);
        ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
        c = viewconfiguration.getScaledTouchSlop();
        e = viewconfiguration.getScaledMinimumFlingVelocity();
        d = viewconfiguration.getScaledMaximumFlingVelocity();
        l = new Scroller(context, m);
    }

    public oju(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = 0.0F;
        h = false;
        j = false;
        k = false;
        i = true;
        context = getContext();
        setFocusable(false);
        attributeset = ViewConfiguration.get(context);
        c = attributeset.getScaledTouchSlop();
        e = attributeset.getScaledMinimumFlingVelocity();
        d = attributeset.getScaledMaximumFlingVelocity();
        l = new Scroller(context, m);
    }

    public oju(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        f = 0.0F;
        h = false;
        j = false;
        k = false;
        i = true;
        context = getContext();
        setFocusable(false);
        attributeset = ViewConfiguration.get(context);
        c = attributeset.getScaledTouchSlop();
        e = attributeset.getScaledMinimumFlingVelocity();
        d = attributeset.getScaledMaximumFlingVelocity();
        l = new Scroller(context, m);
    }

    private boolean a(MotionEvent motionevent)
    {
        if (i)
        {
            if (h)
            {
                h = false;
                return false;
            }
            float f1;
            float f2;
            switch (motionevent.getAction())
            {
            case 1: // '\001'
            default:
                return false;

            case 0: // '\0'
                b(motionevent);
                if (!l.isFinished())
                {
                    c();
                    return true;
                } else
                {
                    k = true;
                    return false;
                }

            case 2: // '\002'
                f1 = motionevent.getX() - a[0];
                f2 = motionevent.getY() - a[1];
                break;
            }
            boolean flag;
            boolean flag1;
            if (f1 > (float)c || f1 < (float)(-c))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (f2 > (float)c || f2 < (float)(-c))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1 && !flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                b(motionevent);
                c();
                return true;
            }
        }
        return false;
    }

    private int b(int i1)
    {
        int j1;
        if (i1 < b[0])
        {
            j1 = b[0];
        } else
        {
            j1 = i1;
            if (i1 > b[1])
            {
                return b[1];
            }
        }
        return j1;
    }

    private void b(MotionEvent motionevent)
    {
        a[0] = motionevent.getX();
        a[1] = motionevent.getY();
    }

    private void c()
    {
        if (!h && l.isFinished())
        {
            a();
            j = true;
        }
        h = true;
        f = 0.0F;
        l.abortAnimation();
    }

    public void a()
    {
    }

    public void a(float f1)
    {
    }

    public final void a(int i1)
    {
        l.forceFinished(true);
        scrollTo(0, b(i1));
    }

    public final void a(int i1, int j1)
    {
        b[0] = i1;
        b[1] = j1;
    }

    public final void a(int i1, boolean flag, int j1)
    {
        int k1 = i1;
        if (flag)
        {
            k1 = b(i1);
        }
        i1 = getScrollY();
        l.startScroll(0, getScrollY(), 0, k1 - i1, j1);
        invalidate();
    }

    public void b()
    {
    }

    public void computeScroll()
    {
        if (l.computeScrollOffset())
        {
            int i1 = l.getCurrY();
            scrollTo(0, i1);
            invalidate();
            if (f != 0.0F)
            {
                a(f);
                f = 0.0F;
            }
            if (i1 == l.getFinalY())
            {
                l.abortAnimation();
                if (j)
                {
                    j = false;
                    b();
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return a(motionevent);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        i1 = motionevent.getAction();
        if (g == null)
        {
            g = VelocityTracker.obtain();
        }
        g.addMovement(motionevent);
        if (!h)
        {
            while (a(motionevent) || i1 != 1 || !k) 
            {
                return true;
            }
            k = false;
            return performClick();
        }
        i1;
        JVM INSTR tableswitch 1 3: default 96
    //                   1 98
    //                   2 246
    //                   3 98;
           goto _L1 _L2 _L3 _L2
_L1:
        return true;
_L2:
        if (i1 == 3)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        h = false;
        if (i1 == 0 && getChildCount() > 0)
        {
            g.computeCurrentVelocity(1000, d);
            float f1 = g.getYVelocity();
            float f2;
            if (f1 > (float)e || f1 < (float)(-e))
            {
                f1 = -f1;
                f = f1;
                i1 = getScrollX();
                int j1 = getScrollY();
                l.fling(i1, j1, 0, (int)f1, 0, 0, b[0], b[1]);
                invalidate();
            } else
            {
                a(0.0F);
            }
        } else
        {
            a(0.0F);
        }
        if (g != null)
        {
            g.recycle();
            g = null;
        }
_L5:
        k = false;
        return true;
_L3:
        f1 = a[1];
        b(motionevent);
        f2 = a[1];
        i1 = getScrollY();
        a(Math.round(f1 - f2) + i1);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean showContextMenuForChild(View view)
    {
        requestDisallowInterceptTouchEvent(true);
        return super.showContextMenuForChild(view);
    }

}
