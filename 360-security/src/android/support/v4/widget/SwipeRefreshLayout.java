// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v4.view.m;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;

// Referenced classes of package android.support.v4.widget:
//            i

public class SwipeRefreshLayout extends ViewGroup
{
    private class a
        implements android.view.animation.Animation.AnimationListener
    {

        final SwipeRefreshLayout b;

        public void onAnimationEnd(Animation animation)
        {
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        private a()
        {
            b = SwipeRefreshLayout.this;
            super();
        }

    }

    public static interface b
    {

        public abstract void a();
    }


    private static final String a = android/support/v4/widget/SwipeRefreshLayout.getSimpleName();
    private static final int v[] = {
        0x101000e
    };
    private final Runnable A = new Runnable() {

        final SwipeRefreshLayout a;

        public void run()
        {
            SwipeRefreshLayout.a(a, true);
            SwipeRefreshLayout.a(a, SwipeRefreshLayout.f(a) + a.getPaddingTop(), SwipeRefreshLayout.g(a));
        }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
    };
    private final Runnable B = new Runnable() {

        final SwipeRefreshLayout a;

        public void run()
        {
            SwipeRefreshLayout.a(a, true);
            if (SwipeRefreshLayout.e(a) != null)
            {
                SwipeRefreshLayout.b(a, SwipeRefreshLayout.h(a));
                SwipeRefreshLayout.j(a).setDuration(SwipeRefreshLayout.i(a));
                SwipeRefreshLayout.j(a).setAnimationListener(SwipeRefreshLayout.k(a));
                SwipeRefreshLayout.j(a).reset();
                SwipeRefreshLayout.j(a).setInterpolator(SwipeRefreshLayout.l(a));
                a.startAnimation(SwipeRefreshLayout.j(a));
            }
            SwipeRefreshLayout.a(a, SwipeRefreshLayout.f(a) + a.getPaddingTop(), SwipeRefreshLayout.g(a));
        }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
    };
    private i b;
    private View c;
    private int d;
    private b e;
    private int f;
    private boolean g;
    private int h;
    private float i;
    private int j;
    private float k;
    private float l;
    private int m;
    private int n;
    private float o;
    private float p;
    private boolean q;
    private int r;
    private boolean s;
    private final DecelerateInterpolator t = new DecelerateInterpolator(2.0F);
    private final AccelerateInterpolator u = new AccelerateInterpolator(1.5F);
    private final Animation w = new Animation() {

        final SwipeRefreshLayout a;

        public void applyTransformation(float f1, Transformation transformation)
        {
            int i1 = 0;
            if (SwipeRefreshLayout.a(a) != SwipeRefreshLayout.b(a))
            {
                i1 = SwipeRefreshLayout.a(a) + (int)((float)(SwipeRefreshLayout.b(a) - SwipeRefreshLayout.a(a)) * f1);
            }
            int j1 = i1 - SwipeRefreshLayout.c(a).getTop();
            int k1 = SwipeRefreshLayout.c(a).getTop();
            i1 = j1;
            if (j1 + k1 < 0)
            {
                i1 = 0 - k1;
            }
            SwipeRefreshLayout.a(a, i1);
        }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
    };
    private Animation x;
    private final android.view.animation.Animation.AnimationListener y = new a() {

        final SwipeRefreshLayout a;

        public void onAnimationEnd(Animation animation)
        {
            SwipeRefreshLayout.b(a, 0);
        }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
    };
    private final android.view.animation.Animation.AnimationListener z = new a() {

        final SwipeRefreshLayout a;

        public void onAnimationEnd(Animation animation)
        {
            SwipeRefreshLayout.a(a, 0.0F);
        }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
    };

    public SwipeRefreshLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = false;
        i = -1F;
        k = 0.0F;
        l = 0.0F;
        r = -1;
        x = new Animation() {

            final SwipeRefreshLayout a;

            public void applyTransformation(float f1, Transformation transformation)
            {
                float f2 = SwipeRefreshLayout.d(a);
                float f3 = SwipeRefreshLayout.d(a);
                SwipeRefreshLayout.e(a).a(f2 + (0.0F - f3) * f1);
            }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
        };
        h = ViewConfiguration.get(context).getScaledTouchSlop();
        j = getResources().getInteger(0x10e0001);
        setWillNotDraw(false);
        b = new i(this);
        m = (int)(getResources().getDisplayMetrics().density * 4F);
        context = context.obtainStyledAttributes(attributeset, v);
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

    private void a(int i1)
    {
        int k1 = c.getTop();
        if ((float)i1 <= i) goto _L2; else goto _L1
_L1:
        int j1 = (int)i;
_L4:
        setTargetOffsetTopAndBottom(j1 - k1);
        return;
_L2:
        j1 = i1;
        if (i1 < 0)
        {
            j1 = 0;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(int i1, android.view.animation.Animation.AnimationListener animationlistener)
    {
        f = i1;
        w.reset();
        w.setDuration(j);
        w.setAnimationListener(animationlistener);
        w.setInterpolator(t);
        c.startAnimation(w);
    }

    static void a(SwipeRefreshLayout swiperefreshlayout, int i1)
    {
        swiperefreshlayout.setTargetOffsetTopAndBottom(i1);
    }

    static void a(SwipeRefreshLayout swiperefreshlayout, int i1, android.view.animation.Animation.AnimationListener animationlistener)
    {
        swiperefreshlayout.a(i1, animationlistener);
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = android.support.v4.view.m.b(motionevent);
        if (android.support.v4.view.m.b(motionevent, i1) == r)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            p = android.support.v4.view.m.d(motionevent, i1);
            r = android.support.v4.view.m.b(motionevent, i1);
        }
    }

    static boolean a(SwipeRefreshLayout swiperefreshlayout, boolean flag)
    {
        swiperefreshlayout.s = flag;
        return flag;
    }

    static float b(SwipeRefreshLayout swiperefreshlayout, float f1)
    {
        swiperefreshlayout.k = f1;
        return f1;
    }

    static int b(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.d;
    }

    static int b(SwipeRefreshLayout swiperefreshlayout, int i1)
    {
        swiperefreshlayout.n = i1;
        return i1;
    }

    private void b()
    {
        if (c == null)
        {
            if (getChildCount() > 1 && !isInEditMode())
            {
                throw new IllegalStateException("SwipeRefreshLayout can host only one direct child");
            }
            c = getChildAt(0);
            d = c.getTop() + getPaddingTop();
        }
        if (i == -1F && getParent() != null && ((View)getParent()).getHeight() > 0)
        {
            DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
            i = (int)Math.min((float)((View)getParent()).getHeight() * 0.6F, displaymetrics.density * 120F);
        }
    }

    static View c(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.c;
    }

    private void c()
    {
        removeCallbacks(B);
        A.run();
        setRefreshing(true);
        e.a();
    }

    static float d(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.k;
    }

    private void d()
    {
        removeCallbacks(B);
        postDelayed(B, 300L);
    }

    static i e(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.b;
    }

    static int f(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.n;
    }

    static android.view.animation.Animation.AnimationListener g(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.y;
    }

    static float h(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.l;
    }

    static int i(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.j;
    }

    static Animation j(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.x;
    }

    static android.view.animation.Animation.AnimationListener k(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.z;
    }

    static DecelerateInterpolator l(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.t;
    }

    private void setTargetOffsetTopAndBottom(int i1)
    {
        c.offsetTopAndBottom(i1);
        n = c.getTop();
    }

    private void setTriggerPercentage(float f1)
    {
        if (f1 == 0.0F)
        {
            l = 0.0F;
            return;
        } else
        {
            l = f1;
            b.a(f1);
            return;
        }
    }

    public boolean a()
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            if (c instanceof AbsListView)
            {
                AbsListView abslistview = (AbsListView)c;
                return abslistview.getChildCount() > 0 && (abslistview.getFirstVisiblePosition() > 0 || abslistview.getChildAt(0).getTop() < abslistview.getPaddingTop());
            }
            if (c.getScrollY() <= 0)
            {
                flag = false;
            }
            return flag;
        } else
        {
            return android.support.v4.view.s.b(c, -1);
        }
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        b.a(canvas);
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        removeCallbacks(B);
        removeCallbacks(A);
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(A);
        removeCallbacks(B);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        b();
        i1 = android.support.v4.view.m.a(motionevent);
        if (s && i1 == 0)
        {
            s = false;
        }
        if (!isEnabled() || s || a())
        {
            return false;
        }
        i1;
        JVM INSTR tableswitch 0 6: default 92
    //                   0 97
    //                   1 221
    //                   2 134
    //                   3 221
    //                   4 92
    //                   5 92
    //                   6 213;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L1 _L5
_L1:
        return q;
_L2:
        float f1 = motionevent.getY();
        o = f1;
        p = f1;
        r = android.support.v4.view.m.b(motionevent, 0);
        q = false;
        l = 0.0F;
        continue; /* Loop/switch isn't completed */
_L4:
        if (r == -1)
        {
            Log.e(a, "Got ACTION_MOVE event but don't have an active pointer id.");
            return false;
        }
        int j1 = android.support.v4.view.m.a(motionevent, r);
        if (j1 < 0)
        {
            Log.e(a, "Got ACTION_MOVE event but have an invalid active pointer id.");
            return false;
        }
        float f2 = android.support.v4.view.m.d(motionevent, j1);
        if (f2 - o > (float)h)
        {
            p = f2;
            q = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        a(motionevent);
        continue; /* Loop/switch isn't completed */
_L3:
        q = false;
        l = 0.0F;
        r = -1;
        if (true) goto _L1; else goto _L6
_L6:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        i1 = getMeasuredWidth();
        j1 = getMeasuredHeight();
        b.a(0, 0, i1, m);
        if (getChildCount() == 0)
        {
            return;
        } else
        {
            View view = getChildAt(0);
            k1 = getPaddingLeft();
            l1 = n + getPaddingTop();
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
        int i1;
        i1 = android.support.v4.view.m.a(motionevent);
        if (s && i1 == 0)
        {
            s = false;
        }
        if (!isEnabled() || s || a())
        {
            return false;
        }
        i1;
        JVM INSTR tableswitch 0 6: default 92
    //                   0 94
    //                   1 324
    //                   2 131
    //                   3 324
    //                   4 92
    //                   5 287
    //                   6 316;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L5 _L6
_L1:
        return true;
_L2:
        float f1 = motionevent.getY();
        o = f1;
        p = f1;
        r = android.support.v4.view.m.b(motionevent, 0);
        q = false;
        l = 0.0F;
        continue; /* Loop/switch isn't completed */
_L4:
        int j1 = android.support.v4.view.m.a(motionevent, r);
        if (j1 < 0)
        {
            Log.e(a, "Got ACTION_MOVE event but have an invalid active pointer id.");
            return false;
        }
        float f2 = android.support.v4.view.m.d(motionevent, j1);
        float f3 = f2 - o;
        if (!q && f3 > (float)h)
        {
            q = true;
        }
        if (q)
        {
            if (f3 > i)
            {
                c();
            } else
            {
                setTriggerPercentage(u.getInterpolation(f3 / i));
                a((int)f3);
                if (p > f2 && c.getTop() == getPaddingTop())
                {
                    removeCallbacks(B);
                } else
                {
                    d();
                }
            }
            p = f2;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int k1 = android.support.v4.view.m.b(motionevent);
        p = android.support.v4.view.m.d(motionevent, k1);
        r = android.support.v4.view.m.b(motionevent, k1);
        continue; /* Loop/switch isn't completed */
_L6:
        a(motionevent);
        if (true) goto _L1; else goto _L3
_L3:
        q = false;
        l = 0.0F;
        r = -1;
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
    }

    public void setOnRefreshListener(b b1)
    {
        e = b1;
    }

    public void setRefreshing(boolean flag)
    {
label0:
        {
            if (g != flag)
            {
                b();
                l = 0.0F;
                g = flag;
                if (!g)
                {
                    break label0;
                }
                b.a();
            }
            return;
        }
        b.b();
    }

}
