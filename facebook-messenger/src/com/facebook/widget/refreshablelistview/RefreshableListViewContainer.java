// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.refreshablelistview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Scroller;
import com.facebook.common.o.a;
import com.facebook.common.o.e;
import com.facebook.debug.log.b;
import com.facebook.inject.t;
import com.facebook.q;
import com.facebook.widget.r;

// Referenced classes of package com.facebook.widget.refreshablelistview:
//            b, d, RefreshableListViewItem, c, 
//            a

public class RefreshableListViewContainer extends ViewGroup
    implements com.facebook.widget.refreshablelistview.b
{

    private static final Class a = com/facebook/widget/refreshablelistview/RefreshableListViewContainer;
    private Scroller b;
    private d c;
    private int d;
    private int e;
    private c f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private boolean s;
    private boolean t;
    private boolean u;
    private a v;

    public RefreshableListViewContainer(Context context)
    {
        super(context);
        c = d.NORMAL;
        d = 0;
        j = 0;
        l = 0.0F;
        m = 0.0F;
        n = 0.0F;
        p = -1F;
        q = -1F;
        r = -1F;
        t = true;
        u = false;
        a(context, ((AttributeSet) (null)));
    }

    public RefreshableListViewContainer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = d.NORMAL;
        d = 0;
        j = 0;
        l = 0.0F;
        m = 0.0F;
        n = 0.0F;
        p = -1F;
        q = -1F;
        r = -1F;
        t = true;
        u = false;
        a(context, attributeset);
    }

    public RefreshableListViewContainer(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        c = d.NORMAL;
        d = 0;
        j = 0;
        l = 0.0F;
        m = 0.0F;
        n = 0.0F;
        p = -1F;
        q = -1F;
        r = -1F;
        t = true;
        u = false;
        a(context, attributeset);
    }

    private d a(int i1)
    {
        if (i1 == 0)
        {
            return d.PULL_TO_REFRESH;
        }
        if (i1 == 1)
        {
            return d.PUSH_TO_REFRESH;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown direction: ").append(i1).toString());
        }
    }

    private void a(Context context, AttributeSet attributeset)
    {
        b = new Scroller(context);
        d = context.obtainStyledAttributes(attributeset, q.PullToRefreshListView).getInt(q.PullToRefreshListView_refreshDirection, 0);
        e = (int)(context.getResources().getDisplayMetrics().density * 5F);
        v = ((e)com.facebook.inject.t.a(context).a(com/facebook/common/o/e)).b(android/graphics/Rect);
        attributeset = context.obtainStyledAttributes(attributeset, q.RefreshableListViewContainer);
        j = (int)attributeset.getDimension(q.RefreshableListViewContainer_overflowAndListOverlap, 0.0F);
        attributeset.recycle();
        k = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private void a(d d1)
    {
        a(d1, false);
    }

    private void a(d d1, boolean flag)
    {
        if (d1 != c)
        {
            Object obj = c;
            c = d1;
            obj = getHeaderView();
            ((RefreshableListViewItem) (obj)).setDirection(d);
            if (d1 == d.NORMAL)
            {
                ((RefreshableListViewItem) (obj)).setState(a(d));
            } else
            {
                ((RefreshableListViewItem) (obj)).setState(d1);
            }
            if (d1 == d.LOADING && f != null)
            {
                f.a(flag);
            }
        }
    }

    private void a(boolean flag)
    {
        if (c == d.NORMAL)
        {
            float f1 = h + i;
            int k1 = Math.max((int)((m / f1) * 1200F), 300);
            int i2 = (int)m;
            int j2 = (int)(f1 * 0.05F);
            int i1 = k1;
            if (i2 < j2)
            {
                i1 = (k1 * i2) / j2;
            }
            b.startScroll(0, i2, 0, -i2, i1);
            invalidate();
        } else
        if (c == d.LOADING)
        {
            if (!flag)
            {
                int l1 = (int)m;
                int j1;
                if (d == 0)
                {
                    j1 = h - l1;
                } else
                {
                    j1 = -h - l1;
                }
                b.startScroll(0, l1, 0, j1, 500);
            }
            invalidate();
            return;
        }
    }

    private boolean a(float f1)
    {
        if (m == 0.0F) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (d != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (d())
        {
            if (f1 <= 0.0F)
            {
                return false;
            }
        } else
        {
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (d == 1)
        {
            if (e())
            {
                if (f1 >= 0.0F)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Unknown direction: ").append(d).toString());
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private boolean a(MotionEvent motionevent)
    {
        AbsListView abslistview = getListView();
        if (abslistview.getVisibility() == 0 && abslistview.getAnimation() == null)
        {
            float f2 = motionevent.getX();
            float f1 = motionevent.getY();
            f2 = (float)getScrollX() + f2;
            f1 += getScrollY();
            int i1 = (int)f2;
            int j1 = (int)f1;
            if (motionevent.getActionMasked() == 0)
            {
                Rect rect = (Rect)v.a();
                abslistview.getHitRect(rect);
                u = rect.contains(i1, j1);
                v.a(rect);
            }
            if (u)
            {
                f2 -= abslistview.getLeft();
                f1 -= abslistview.getTop();
                q = f2;
                r = f1;
                motionevent.setLocation(f2, f1);
                return a(abslistview, motionevent);
            }
        }
        return true;
    }

    private boolean a(AbsListView abslistview, MotionEvent motionevent)
    {
        boolean flag;
        try
        {
            flag = abslistview.dispatchTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (AbsListView abslistview)
        {
            com.facebook.debug.log.b.d(a, "Caught and ignoring ArrayIndexOutOfBoundsException", abslistview);
            return true;
        }
        return flag;
    }

    private float b(float f1)
    {
        if (d == 0)
        {
            if (f1 > 0.0F)
            {
                l = l + f1;
                if (l > (float)e)
                {
                    f1 = l;
                    float f2 = e;
                    l = e;
                    return f1 - f2;
                } else
                {
                    return 0.0F;
                }
            } else
            {
                l = 0.0F;
                return f1;
            }
        }
        if (f1 < 0.0F)
        {
            l = l - f1;
            if (l > (float)e)
            {
                f1 = -(l - (float)e);
                l = e;
                return f1;
            } else
            {
                return 0.0F;
            }
        } else
        {
            l = 0.0F;
            return f1;
        }
    }

    private void b(MotionEvent motionevent)
    {
        if (!s && Math.abs(motionevent.getY() - p) >= (float)k)
        {
            AbsListView abslistview = getListView();
            if (abslistview.getVisibility() == 0 && abslistview.getAnimation() == null)
            {
                int j1 = k + 1;
                int i1 = j1;
                if (d == 1)
                {
                    i1 = -j1;
                }
                motionevent = MotionEvent.obtain(motionevent);
                motionevent.setLocation(q, r - (float)i1);
                a(abslistview, motionevent);
                motionevent.setLocation(q, r);
                a(abslistview, motionevent);
                s = true;
                return;
            }
        }
    }

    private void c()
    {
        if (b.computeScrollOffset())
        {
            m = b.getCurrY();
            if (!b.isFinished())
            {
                invalidate();
            }
        }
        int i1;
        if (n != m)
        {
            if ((i1 = (int)(m - n)) != 0)
            {
                n = n + (float)i1;
                getListView().offsetTopAndBottom(i1);
                getHeaderView().offsetTopAndBottom(i1);
                getOverScrollHeaderView().offsetTopAndBottom(i1);
                invalidate();
                return;
            }
        }
    }

    private void c(float f1)
    {
label0:
        {
            m = 0.8F * f1 + m;
            if (d == 0)
            {
                m = Math.max(0.0F, m);
            } else
            {
                m = Math.min(0.0F, m);
            }
            if (c == d.LOADING)
            {
                if (d != 0)
                {
                    break label0;
                }
                m = Math.min(m, h);
            }
            return;
        }
        m = Math.max(m, -h);
    }

    private boolean d()
    {
        Object obj = getListView();
        if (m <= 0.0F)
        {
            if (((AbsListView) (obj)).getFirstVisiblePosition() > 0)
            {
                return false;
            }
            obj = ((AbsListView) (obj)).getChildAt(0);
            if (obj != null && ((View) (obj)).getTop() < 0)
            {
                return false;
            }
        }
        return true;
    }

    private boolean e()
    {
        boolean flag = true;
        AbsListView abslistview = getListView();
        if (m < 0.0F)
        {
            return true;
        }
        if (abslistview.getLastVisiblePosition() != abslistview.getCount() - 1)
        {
            return false;
        }
        View view = abslistview.getChildAt(abslistview.getChildCount() - 1);
        if (view == null)
        {
            return false;
        }
        Rect rect = (Rect)v.a();
        Rect rect1 = (Rect)v.a();
        abslistview.getDrawingRect(rect1);
        view.getHitRect(rect);
        if (rect.bottom > rect1.bottom)
        {
            flag = false;
        }
        v.a(rect1);
        v.a(rect);
        return flag;
    }

    private RefreshableListViewItem getHeaderView()
    {
        return (RefreshableListViewItem)getChildAt(1);
    }

    private AbsListView getListView()
    {
        return (AbsListView)getChildAt(2);
    }

    private View getOverScrollHeaderView()
    {
        return getChildAt(0);
    }

    public void a()
    {
        if (c != d.LOADING)
        {
            a(d.LOADING);
            a(true);
        }
    }

    public void a(AbsListView abslistview, int i1)
    {
        g = i1;
    }

    public void b()
    {
        if (c == d.LOADING)
        {
            a(d.NORMAL);
            a(true);
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return true;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        c();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.LayoutParams(-1, -1);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new android.view.ViewGroup.LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new android.view.ViewGroup.LayoutParams(layoutparams);
    }

    public int getDirection()
    {
        return d;
    }

    public float getHeaderHeightExposed()
    {
        return m;
    }

    public c getOnRefreshListener()
    {
        return f;
    }

    public d getState()
    {
        return c;
    }

    protected void onFinishInflate()
    {
        ((r)getListView()).a(new com.facebook.widget.refreshablelistview.a(this));
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return true;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        if (getChildCount() != 3)
        {
            return;
        }
        com.facebook.debug.d.e e1 = com.facebook.debug.d.e.a("RefreshableListViewContainer.onLayout");
        if (d == 0)
        {
            getListView().layout(0, 0, k1 - i1, l1 - j1);
            l1 = j + 0;
            j1 = l1 - h;
            getHeaderView().layout(0, j1, k1 - i1, l1);
            l1 = i;
            getOverScrollHeaderView().layout(0, j1 - l1, k1 - i1, j1);
        } else
        if (d == 1)
        {
            l1 -= j1;
            getListView().layout(0, 0, k1 - i1, l1);
            j1 = h + l1;
            getHeaderView().layout(0, l1, k1 - i1, j1);
            l1 = i;
            getOverScrollHeaderView().layout(0, j1, k1 - i1, l1 + j1);
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Unknown direction: ").append(d).toString());
        }
        n = 0.0F;
        c();
        e1.a();
    }

    protected void onMeasure(int i1, int j1)
    {
        int i2 = 0;
        com.facebook.debug.d.e e1 = com.facebook.debug.d.e.a("RefreshableListViewContainer.onMeasure");
        int j2 = getChildCount();
        int k1 = 0;
        int l1 = 0;
        for (; i2 < j2; i2++)
        {
            View view = getChildAt(i2);
            measureChild(view, i1, j1);
            k1 = Math.max(k1, view.getMeasuredWidth());
            l1 = Math.max(l1, view.getMeasuredHeight());
        }

        l1 = Math.max(l1, getSuggestedMinimumHeight());
        setMeasuredDimension(resolveSize(Math.max(k1, getSuggestedMinimumWidth()), i1), resolveSize(l1, j1));
        h = getHeaderView().getMeasuredHeight();
        i = getOverScrollHeaderView().getMeasuredHeight();
        e1.a();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        float f2;
        int i1;
        i1 = motionevent.getAction();
        f2 = motionevent.getY();
        i1;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 59
    //                   1 96
    //                   2 197;
           goto _L1 _L2 _L3 _L4
_L1:
        boolean flag2 = a(motionevent);
_L6:
        o = f2;
        c();
        return flag2;
_L2:
        p = f2;
        s = false;
        if (!b.isFinished())
        {
            b.abortAnimation();
        }
        flag2 = a(motionevent);
        continue; /* Loop/switch isn't completed */
_L3:
        if (c == d.PULL_TO_REFRESH || c == d.PUSH_TO_REFRESH || c == d.BUFFERING)
        {
            a(d.NORMAL);
            a(false);
        } else
        if (c == d.RELEASE_TO_REFRESH)
        {
            a(d.LOADING, true);
            a(false);
        } else
        if (c == d.NORMAL)
        {
            m = 0.0F;
        }
        l = 0.0F;
        flag2 = a(motionevent);
        continue; /* Loop/switch isn't completed */
_L4:
        float f1 = f2 - o;
        boolean flag1;
        boolean flag3;
        if (c == d.NORMAL)
        {
            boolean flag;
            if (g == 0)
            {
                flag2 = a(motionevent);
                flag = false;
            } else
            {
                flag = true;
                flag2 = true;
            }
            flag1 = flag;
            flag3 = flag2;
            if (g == 1)
            {
                flag1 = flag;
                flag3 = flag2;
                if (a(f1))
                {
                    a(d.BUFFERING);
                    flag3 = flag2;
                    flag1 = flag;
                }
            }
        } else
        {
            flag1 = true;
            flag3 = true;
        }
        if (c == d.BUFFERING)
        {
            f1 = b(f1);
            if (l >= (float)e)
            {
                a(a(d));
            } else
            if (l == 0.0F)
            {
                a(d.NORMAL);
            }
            flag = false;
        } else
        {
            flag = flag1;
        }
        if (c == d.PULL_TO_REFRESH || c == d.RELEASE_TO_REFRESH || c == d.PUSH_TO_REFRESH)
        {
            c(f1);
            if (m == 0.0F)
            {
                a(d.NORMAL);
                flag1 = flag;
            } else
            {
                if (Math.abs(m) >= (float)h)
                {
                    a(d.RELEASE_TO_REFRESH);
                } else
                if (Math.abs(m) < (float)h)
                {
                    a(a(d));
                }
                flag1 = false;
            }
        } else
        {
            flag1 = flag;
            if (c == d.LOADING)
            {
                flag1 = flag;
                if (a(f1))
                {
                    c(f1);
                    flag1 = false;
                }
            }
        }
        if (flag1)
        {
            flag2 = a(motionevent);
        } else
        {
            flag2 = flag3;
            if (c == d.LOADING)
            {
                b(motionevent);
                flag2 = flag3;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void setDirection(int i1)
    {
        d = i1;
    }

    public void setLastLoadedTime(long l1)
    {
        getHeaderView().setLastLoadedTime(l1);
    }

    public void setOnRefreshListener(c c1)
    {
        f = c1;
    }

    public void setOverflowListOverlap(int i1)
    {
        j = getContext().getResources().getDimensionPixelSize(i1);
    }

}
