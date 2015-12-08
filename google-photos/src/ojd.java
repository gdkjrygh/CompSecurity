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

public class ojd extends ViewGroup
{

    private static final Interpolator o = new oje();
    public final int a[] = {
        0x80000001, 0x7fffffff
    };
    public Scroller b;
    private float c[] = {
        0.0F, 0.0F
    };
    private int d;
    private int e;
    private int f;
    private float g;
    private int h;
    private VelocityTracker i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;

    public ojd(Context context)
    {
        super(context);
        g = 0.0F;
        h = 0;
        j = true;
        k = true;
        l = false;
        m = true;
        n = false;
        context = getContext();
        setFocusable(false);
        ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
        d = viewconfiguration.getScaledTouchSlop();
        f = viewconfiguration.getScaledMinimumFlingVelocity();
        e = viewconfiguration.getScaledMaximumFlingVelocity();
        b = new Scroller(context, o);
    }

    public ojd(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = 0.0F;
        h = 0;
        j = true;
        k = true;
        l = false;
        m = true;
        n = false;
        context = getContext();
        setFocusable(false);
        attributeset = ViewConfiguration.get(context);
        d = attributeset.getScaledTouchSlop();
        f = attributeset.getScaledMinimumFlingVelocity();
        e = attributeset.getScaledMaximumFlingVelocity();
        b = new Scroller(context, o);
    }

    public ojd(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        g = 0.0F;
        h = 0;
        j = true;
        k = true;
        l = false;
        m = true;
        n = false;
        context = getContext();
        setFocusable(false);
        attributeset = ViewConfiguration.get(context);
        d = attributeset.getScaledTouchSlop();
        f = attributeset.getScaledMinimumFlingVelocity();
        e = attributeset.getScaledMaximumFlingVelocity();
        b = new Scroller(context, o);
    }

    private void a()
    {
        l = true;
        g = 0.0F;
        h = 0;
        b.abortAnimation();
    }

    private int b()
    {
        if (j)
        {
            return getScrollY();
        } else
        {
            return getScrollX();
        }
    }

    private boolean b(MotionEvent motionevent)
    {
        if (m)
        {
            if (l)
            {
                l = false;
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
                a(motionevent);
                if (!b.isFinished())
                {
                    a();
                    return true;
                } else
                {
                    n = true;
                    return false;
                }

            case 2: // '\002'
                f1 = motionevent.getX() - c[0];
                f2 = motionevent.getY() - c[1];
                break;
            }
            boolean flag;
            boolean flag1;
            if (f1 > (float)d || f1 < (float)(-d))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (f2 > (float)d || f2 < (float)(-d))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (j)
            {
                if (flag1 && !flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            if (flag && !flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                a(motionevent);
                a();
                return true;
            }
        }
        return false;
    }

    private int d(int i1)
    {
        int j1;
        if (i1 < a[0])
        {
            j1 = a[0];
        } else
        {
            j1 = i1;
            if (i1 > a[1])
            {
                return a[1];
            }
        }
        return j1;
    }

    public void a(int i1)
    {
    }

    public void a(int i1, int j1)
    {
        i1 = d(i1) - b();
        if (j)
        {
            b.startScroll(0, getScrollY(), 0, i1, j1);
        } else
        {
            b.startScroll(getScrollX(), 0, i1, 0, j1);
        }
        invalidate();
    }

    public final void a(MotionEvent motionevent)
    {
        c[0] = motionevent.getX();
        c[1] = motionevent.getY();
    }

    public void addView(View view)
    {
        View view1 = view.findViewById(c.fT);
        if (view1 == null) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        int k1;
        j1 = ((Integer)view1.getTag()).intValue();
        k1 = getChildCount();
        i1 = 0;
_L5:
        if (i1 >= k1)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if (((Integer)getChildAt(i1).findViewById(c.fT).getTag()).intValue() <= j1) goto _L4; else goto _L3
_L3:
        addView(view, i1);
        i1 = 1;
_L6:
        if (i1 == 0)
        {
            super.addView(view);
        }
        return;
_L4:
        i1++;
          goto _L5
_L2:
        super.addView(view);
        return;
        i1 = 0;
          goto _L6
    }

    public final void b(int i1)
    {
        if (j)
        {
            scrollTo(0, d(i1));
            return;
        } else
        {
            scrollTo(d(i1), 0);
            return;
        }
    }

    public final void c(int i1)
    {
        a(i1, 500);
    }

    public void computeScroll()
    {
        if (b.computeScrollOffset())
        {
            int i1;
            int j1;
            if (j)
            {
                i1 = b.getCurrY();
            } else
            {
                i1 = b.getCurrX();
            }
            b(i1);
            invalidate();
            if (j)
            {
                j1 = b.getFinalY();
            } else
            {
                j1 = b.getFinalX();
            }
            if (i1 == j1)
            {
                b.abortAnimation();
            }
            if (g != 0.0F)
            {
                if (g > 0.0F)
                {
                    i1 = 1;
                } else
                {
                    i1 = -1;
                }
                g = 0.0F;
                a(i1);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return b(motionevent);
    }

    protected void onScrollChanged(int i1, int j1, int k1, int l1)
    {
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        i1 = motionevent.getAction();
        if (k)
        {
            if (i == null)
            {
                i = VelocityTracker.obtain();
            }
            i.addMovement(motionevent);
        }
        if (!l)
        {
            while (b(motionevent) || i1 != 1 || !n) 
            {
                return true;
            }
            n = false;
            return performClick();
        }
        i1;
        JVM INSTR tableswitch 1 3: default 100
    //                   1 102
    //                   2 273
    //                   3 102;
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
        l = false;
        if (i1 == 0 && k && getChildCount() > 0)
        {
            i.computeCurrentVelocity(1000, e);
            float f1;
            if (j)
            {
                f1 = i.getYVelocity();
            } else
            {
                f1 = i.getXVelocity();
            }
            if (f1 > (float)f || f1 < (float)(-f))
            {
                f1 = -f1;
                g = f1;
                i1 = getScrollX();
                int j1 = getScrollY();
                if (j)
                {
                    b.fling(i1, j1, 0, (int)f1, 0, 0, a[0], a[1]);
                } else
                {
                    b.fling(i1, j1, (int)f1, 0, a[0], a[1], 0, 0);
                }
                invalidate();
            } else
            {
                a(h);
            }
        } else
        {
            a(h);
        }
        if (k && i != null)
        {
            i.recycle();
            i = null;
        }
_L5:
        n = false;
        return true;
_L3:
        if (j)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        f1 = c[i1];
        a(motionevent);
        f1 -= c[i1];
        if (f1 >= -1F)
        {
            break; /* Loop/switch isn't completed */
        }
        h = -1;
_L7:
        i1 = b();
        b((int)f1 + i1);
        if (true) goto _L5; else goto _L4
_L4:
        if (f1 <= 1.0F) goto _L7; else goto _L6
_L6:
        h = 1;
          goto _L7
    }

    public boolean showContextMenuForChild(View view)
    {
        requestDisallowInterceptTouchEvent(true);
        return super.showContextMenuForChild(view);
    }

}
