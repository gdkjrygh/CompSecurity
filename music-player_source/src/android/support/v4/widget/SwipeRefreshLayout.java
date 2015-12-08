// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v4.view.an;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;

// Referenced classes of package android.support.v4.widget:
//            ab, ac, ad, ae, 
//            af, ag, aa, ai

public class SwipeRefreshLayout extends ViewGroup
{

    private static final int s[] = {
        0x101000e
    };
    private aa a;
    private View b;
    private int c;
    private ai d;
    private MotionEvent e;
    private int f;
    private boolean g;
    private int h;
    private float i;
    private float j;
    private int k;
    private float l;
    private float m;
    private int n;
    private int o;
    private boolean p;
    private final DecelerateInterpolator q = new DecelerateInterpolator(2.0F);
    private final AccelerateInterpolator r = new AccelerateInterpolator(1.5F);
    private final Animation t = new ab(this);
    private Animation u;
    private final android.view.animation.Animation.AnimationListener v = new ad(this);
    private final android.view.animation.Animation.AnimationListener w = new ae(this);
    private final Runnable x = new af(this);
    private final Runnable y = new ag(this);

    public SwipeRefreshLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = false;
        i = -1F;
        l = 0.0F;
        m = 0.0F;
        u = new ac(this);
        h = ViewConfiguration.get(context).getScaledTouchSlop();
        k = getResources().getInteger(0x10e0001);
        setWillNotDraw(false);
        a = new aa(this);
        n = (int)(getResources().getDisplayMetrics().density * 4F);
        context = context.obtainStyledAttributes(attributeset, s);
        setEnabled(context.getBoolean(0, true));
        context.recycle();
    }

    static float a(SwipeRefreshLayout swiperefreshlayout, float f1)
    {
        swiperefreshlayout.l = f1;
        return f1;
    }

    static int a(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.f;
    }

    private void a()
    {
        if (b == null)
        {
            if (getChildCount() > 1 && !isInEditMode())
            {
                throw new IllegalStateException("SwipeRefreshLayout can host only one direct child");
            }
            b = getChildAt(0);
            c = b.getTop() + getPaddingTop();
        }
        if (i == -1F && getParent() != null && ((View)getParent()).getHeight() > 0)
        {
            DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
            i = (int)Math.min((float)((View)getParent()).getHeight() * 0.6F, displaymetrics.density * 120F);
        }
    }

    private void a(int i1)
    {
        b.offsetTopAndBottom(i1);
        o = b.getTop();
    }

    static void a(SwipeRefreshLayout swiperefreshlayout, int i1)
    {
        swiperefreshlayout.a(i1);
    }

    static void a(SwipeRefreshLayout swiperefreshlayout, int i1, android.view.animation.Animation.AnimationListener animationlistener)
    {
        swiperefreshlayout.f = i1;
        swiperefreshlayout.t.reset();
        swiperefreshlayout.t.setDuration(swiperefreshlayout.k);
        swiperefreshlayout.t.setAnimationListener(animationlistener);
        swiperefreshlayout.t.setInterpolator(swiperefreshlayout.q);
        swiperefreshlayout.b.startAnimation(swiperefreshlayout.t);
    }

    static int b(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.c;
    }

    static View c(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.b;
    }

    static float d(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.l;
    }

    static aa e(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.a;
    }

    static int f(SwipeRefreshLayout swiperefreshlayout)
    {
        swiperefreshlayout.o = 0;
        return 0;
    }

    static float g(SwipeRefreshLayout swiperefreshlayout)
    {
        swiperefreshlayout.m = 0.0F;
        return 0.0F;
    }

    static boolean h(SwipeRefreshLayout swiperefreshlayout)
    {
        swiperefreshlayout.p = true;
        return true;
    }

    static int i(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.o;
    }

    static android.view.animation.Animation.AnimationListener j(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.v;
    }

    static float k(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.m;
    }

    static int l(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.k;
    }

    static Animation m(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.u;
    }

    static android.view.animation.Animation.AnimationListener n(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.w;
    }

    static DecelerateInterpolator o(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.q;
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        a.a(canvas);
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        removeCallbacks(y);
        removeCallbacks(x);
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(x);
        removeCallbacks(y);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        a();
        if (p && motionevent.getAction() == 0)
        {
            p = false;
        }
        if (!isEnabled() || p) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            if (b instanceof AbsListView)
            {
                AbsListView abslistview = (AbsListView)b;
                boolean flag1;
                if (abslistview.getChildCount() > 0 && (abslistview.getFirstVisiblePosition() > 0 || abslistview.getChildAt(0).getTop() < abslistview.getPaddingTop()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            if (b.getScrollY() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = an.a(b);
        }
        if (flag) goto _L2; else goto _L3
_L3:
        flag = onTouchEvent(motionevent);
_L5:
        flag1 = flag;
        if (!flag)
        {
            flag1 = super.onInterceptTouchEvent(motionevent);
        }
        return flag1;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        i1 = getMeasuredWidth();
        j1 = getMeasuredHeight();
        a.a(i1, n);
        if (getChildCount() == 0)
        {
            return;
        } else
        {
            View view = getChildAt(0);
            k1 = getPaddingLeft();
            l1 = o + getPaddingTop();
            view.layout(k1, l1, (i1 - getPaddingLeft() - getPaddingRight()) + k1, (j1 - getPaddingTop() - getPaddingBottom()) + l1);
            return;
        }
    }

    public void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        if (getChildCount() > 1 && !isInEditMode())
        {
            throw new IllegalStateException("SwipeRefreshLayout can host only one direct child");
        }
        if (getChildCount() > 0)
        {
            getChildAt(0).measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 0x40000000));
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 38
    //                   1 368
    //                   2 64
    //                   3 368;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        return false;
_L2:
        m = 0.0F;
        e = MotionEvent.obtain(motionevent);
        j = e.getY();
        return false;
_L4:
        if (e != null && !p)
        {
            float f3 = motionevent.getY();
            float f2 = f3 - e.getY();
            if (f2 > (float)h)
            {
                if (f2 > i)
                {
                    removeCallbacks(y);
                    x.run();
                    if (!g)
                    {
                        a();
                        m = 0.0F;
                        g = true;
                        if (g)
                        {
                            a.a();
                        } else
                        {
                            a.b();
                        }
                    }
                    motionevent = d;
                    return true;
                }
                float f1 = r.getInterpolation(f2 / i);
                int i1;
                int j1;
                int k1;
                if (f1 == 0.0F)
                {
                    m = 0.0F;
                } else
                {
                    m = f1;
                    a.a(f1);
                }
                f1 = f2;
                if (j > f3)
                {
                    f1 = f2 - (float)h;
                }
                j1 = (int)f1;
                k1 = b.getTop();
                if ((float)j1 > i)
                {
                    i1 = (int)i;
                } else
                {
                    i1 = j1;
                    if (j1 < 0)
                    {
                        i1 = 0;
                    }
                }
                a(i1 - k1);
                if (j > f3 && b.getTop() < h)
                {
                    removeCallbacks(y);
                } else
                {
                    removeCallbacks(y);
                    postDelayed(y, 300L);
                }
                j = motionevent.getY();
                return true;
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (e != null)
        {
            e.recycle();
            e = null;
            return false;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
    }

}
