// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Jo;
import PG;
import aY;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import dv;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class VerticalSwipeLayout extends ViewGroup
{
    public static interface a
    {

        public abstract void a(int i1, int j1, int k1);

        public abstract void b(int i1, int j1, int k1);

        public abstract void b_(int i1);
    }

    public static interface b
        extends Annotation
    {
    }

    final class c
    {

        int a;
        int b;

        public c(int i1, int j1)
        {
            b = i1;
            a = j1;
        }
    }


    private int a;
    private List b;
    public int c;
    public boolean d;
    private int e;
    private int f;
    private float g;
    private float h;
    private Scroller i;
    private float j;
    private float k;
    private boolean l;
    private boolean m;
    private int n;
    private VelocityTracker o;
    private int p;
    private final Rect q;
    private Map r;

    public VerticalSwipeLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0;
        b = new ArrayList();
        d = false;
        q = new Rect();
        r = new HashMap();
        d();
        context = context.getTheme().obtainStyledAttributes(attributeset, kx.a.VerticalSwipeLayout, 0, 0);
        c = context.getInt(0, 0);
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    private int a(View view, int i1)
    {
        view = (c)r.get(view);
        if (view == null)
        {
            return i1;
        }
        int k1 = ((c) (view)).b;
        int j1 = i1;
        if (k1 != 0)
        {
            if (k1 > i1)
            {
                j1 = i1;
            } else
            {
                j1 = k1;
            }
        }
        return j1 - ((c) (view)).a;
    }

    private boolean a()
    {
        return a(2) || a(1);
    }

    private boolean a(float f1)
    {
        if (g == -1F)
        {
            if (!i.isFinished())
            {
                i.abortAnimation();
            }
            g = f1;
            return true;
        } else
        {
            return false;
        }
    }

    private boolean a(float f1, boolean flag, boolean flag1)
    {
        if (f1 - g <= j) goto _L2; else goto _L1
_L1:
        if (!a(1) || c == 0 || flag) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (g - f1 > j)
        {
            if (!a(2) || c == getChildCount() - 1 || flag1)
            {
                return false;
            }
        } else
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private boolean a(int i1)
    {
        return (a & i1) == i1;
    }

    private boolean a(View view, Rect rect, MotionEvent motionevent, int i1)
    {
        int j1 = 0;
        if (i1 < 0 && !a(1))
        {
            return false;
        }
        if (i1 > 0 && !a(2))
        {
            return false;
        }
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        rect.set(ai[0], ai[1], ai[0] + view.getWidth(), ai[1] + view.getHeight());
        if (rect.contains((int)motionevent.getX(), (int)motionevent.getY()))
        {
            if (view instanceof ViewGroup)
            {
                ViewGroup viewgroup = (ViewGroup)view;
                for (int k1 = viewgroup.getChildCount(); j1 < k1; j1++)
                {
                    if (a(viewgroup.getChildAt(j1), rect, motionevent, i1))
                    {
                        return true;
                    }
                }

            }
            return aY.b(view, i1);
        } else
        {
            return false;
        }
    }

    private void b()
    {
        g = -1F;
        h = 0.0F;
        l = false;
        if (o != null)
        {
            o.recycle();
            o = null;
        }
    }

    private void b(float f1)
    {
label0:
        {
            int i1 = c;
            int j1;
            if (g - f1 > (float)f)
            {
                i1 = c + 1;
            } else
            if (f1 - g > (float)f)
            {
                i1 = c - 1;
            }
            j1 = i1;
            if (i1 == c)
            {
                if (o == null)
                {
                    j1 = 0;
                } else
                {
                    o.computeCurrentVelocity(1000, n);
                    j1 = (int)o.getYVelocity();
                }
                f1 -= g;
                if (f1 > k && j1 > p && c > 0)
                {
                    j1 = -1;
                } else
                if (f1 < -k && j1 < -p && c < getChildCount() - 1)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                j1 = i1 + j1;
            }
            j1 = Math.max(0, Math.min(j1, getChildCount() - 1));
            if (j1 <= c || a(2))
            {
                i1 = j1;
                if (j1 >= c)
                {
                    break label0;
                }
                i1 = j1;
                if (a(1))
                {
                    break label0;
                }
            }
            i1 = c;
        }
        a(i1, 1.0D);
    }

    public void a(int i1, double d1)
    {
        View view;
        boolean flag;
        boolean flag1;
        if (d1 >= 0.0D)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        dv.a(flag1);
        if (i1 != c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = getFocusedChild();
        if (view != null && flag && view == getChildAt(c))
        {
            view.clearFocus();
        }
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).a(2, c, i1)) { }
        c = i1;
        if (getChildCount() - 1 != c) goto _L2; else goto _L1
_L1:
        int l1 = getMeasuredHeight() - e;
_L4:
        i1 = getScrollY();
        int j1 = (int)(250D * d1);
        i.startScroll(0, getScrollY(), 0, l1 - i1, j1);
        m = true;
        invalidate();
        return;
_L2:
        int i2 = 0;
        int k1 = 0;
        do
        {
            l1 = k1;
            if (i2 >= i1)
            {
                continue;
            }
            l1 = a(getChildAt(i2), e);
            i2++;
            k1 = l1 + k1;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(View view, int i1, int j1)
    {
        super.addView(view);
        if (j1 != 0)
        {
            View view1 = getChildAt(getChildCount() - 2);
            c c1 = (c)r.get(view1);
            if (c1 == null)
            {
                c1 = new c(0, j1);
            } else
            {
                c1.a = j1;
            }
            r.put(view1, c1);
        }
        r.put(view, new c(i1, 0));
    }

    public final void a(a a1)
    {
        PG.a();
        b.add(a1);
    }

    public void a(boolean flag)
    {
        if (c * e != getScrollY() && (d || !e()))
        {
            a(c, 0.0D);
        }
    }

    public boolean canScrollVertically(int i1)
    {
        if (a() && getChildCount() != 0 && (i1 >= 0 || a(1)) && (i1 <= 0 || a(2)))
        {
            if (i1 < 0 && getScrollY() != 0 || i1 > 0 && getScrollY() != e * (getChildCount() - 1))
            {
                return true;
            }
            if (getChildAt(c) != null)
            {
                return getChildAt(c).canScrollVertically(i1);
            }
        }
        return false;
    }

    public void computeScroll()
    {
        if (!i.computeScrollOffset())
        {
            if (m)
            {
                m = false;
                for (Iterator iterator = b.iterator(); iterator.hasNext(); ((a)iterator.next()).b_(c)) { }
            }
        } else
        {
            scrollTo(i.getCurrX(), i.getCurrY());
            postInvalidate();
        }
    }

    public final void d()
    {
        i = new Scroller(getContext(), new DecelerateInterpolator(1.4F));
        c = 0;
        a = 0;
        o = null;
        m = false;
        ViewConfiguration viewconfiguration = ViewConfiguration.get(getContext());
        j = viewconfiguration.getScaledTouchSlop();
        k = viewconfiguration.getScaledPagingTouchSlop();
        n = viewconfiguration.getScaledMaximumFlingVelocity();
        p = (int)Jo.a(50F, getContext());
        b();
        setScrollableInBothDirections(true);
    }

    public final boolean e()
    {
        boolean flag1 = false;
        boolean flag;
        if (i.getCurrY() != i.getFinalY())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (l || flag)
        {
            flag1 = true;
        }
        return flag1;
    }

    public final boolean f()
    {
        return a(2) && a(1);
    }

    public final void g()
    {
        PG.a();
        b.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (o == null)
        {
            o = VelocityTracker.obtain();
        }
        o.addMovement(motionevent);
        boolean flag;
        if (motionevent.getPointerCount() > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a() && !flag) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        float f1;
        int i1;
        i1 = motionevent.getAction();
        f1 = motionevent.getY();
        i1;
        JVM INSTR tableswitch 0 2: default 92
    //                   0 94
    //                   1 300
    //                   2 101;
           goto _L3 _L4 _L5 _L6
_L5:
        continue; /* Loop/switch isn't completed */
_L3:
        return false;
_L4:
        g = f1;
        return false;
_L6:
        if (m || a(f1)) goto _L1; else goto _L7
_L7:
        View view = getChildAt(c);
        if (view == null) goto _L1; else goto _L8
_L8:
        boolean flag2;
        boolean flag3;
        flag2 = a(view, q, motionevent, -1);
        flag3 = a(view, q, motionevent, 1);
        boolean flag1;
        if (f1 - g > j && flag2 || g - f1 > j && flag3)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            requestDisallowInterceptTouchEvent(true);
            view.onTouchEvent(motionevent);
            return false;
        }
        if (!a(f1, flag2, flag3)) goto _L1; else goto _L9
_L9:
        g = f1;
        h = getScrollY();
        requestDisallowInterceptTouchEvent(true);
        for (motionevent = b.iterator(); motionevent.hasNext(); ((a)motionevent.next()).a(1, c, -1)) { }
        l = true;
        return true;
        if (!l) goto _L1; else goto _L10
_L10:
        b(f1);
        return true;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int j2 = getChildCount();
        j1 = 0;
        int i2;
        for (l1 = 0; j1 < j2; l1 = i2)
        {
            View view = getChildAt(j1);
            i2 = l1;
            if (view.getVisibility() != 8)
            {
                i2 = a(view, e);
                view.layout(0, l1, k1 - i1, l1 + i2);
                i2 = l1 + i2;
            }
            j1++;
        }

        a(flag);
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1 = 0;
        int i2 = getChildCount();
        e = android.view.View.MeasureSpec.getSize(j1);
        f = (int)((double)e * 0.5D);
        for (j1 = 0; j1 < i2;)
        {
            View view = getChildAt(j1);
            int l1 = k1;
            if (view.getVisibility() != 8)
            {
                l1 = a(view, e);
                measureChild(view, android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i1), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000));
                l1 = k1 + l1;
            }
            j1++;
            k1 = l1;
        }

        super.onMeasure(i1, android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000));
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (a()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (o == null)
        {
            return true;
        }
        int i1 = motionevent.getAction();
        float f1 = motionevent.getY();
        switch (i1)
        {
        default:
            return true;

        case 0: // '\0'
            g = f1;
            return true;

        case 2: // '\002'
            if (!m)
            {
                o.addMovement(motionevent);
                if (!a(f1) && (f1 - g <= 0.0F || c != 0) && (f1 - g >= 0.0F || c != getChildCount() - 1))
                {
                    if (l)
                    {
                        int k1 = Math.max((int)Math.min((g - f1) + h, getMeasuredHeight() - e), 0);
                        int j1;
                        if (h <= (float)k1)
                        {
                            j1 = c + 1;
                        } else
                        {
                            j1 = c - 1;
                        }
                        if (j1 > c && !a(2) || j1 < c && !a(1))
                        {
                            return true;
                        }
                        setScrollY(k1);
                        int l1 = e;
                        for (motionevent = b.iterator(); motionevent.hasNext(); ((a)motionevent.next()).b(k1 % l1, e, j1)) { }
                        return true;
                    }
                    motionevent = getChildAt(c);
                    if (motionevent != null && a(f1, aY.b(motionevent, -1), aY.b(motionevent, 1)))
                    {
                        g = f1;
                        h = getScrollY();
                        requestDisallowInterceptTouchEvent(true);
                        for (motionevent = b.iterator(); motionevent.hasNext(); ((a)motionevent.next()).a(1, c, -1)) { }
                        l = true;
                        return true;
                    }
                }
            }
            break;

        case 1: // '\001'
            if (l)
            {
                b(f1);
            }
            boolean flag = l;
            b();
            return flag;

        case 3: // '\003'
            b();
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void removeAllViews()
    {
        super.removeAllViews();
        r.clear();
    }

    public void removeView(View view)
    {
        super.removeView(view);
        r.remove(view);
    }

    public void setScrollableInBothDirections(boolean flag)
    {
        if (flag)
        {
            a = 3;
            return;
        } else
        {
            a = 0;
            return;
        }
    }

    public void setScrollableInDirection(int i1, boolean flag)
    {
        if (flag)
        {
            a = a | i1;
            return;
        } else
        {
            a = a & ~i1;
            return;
        }
    }
}
