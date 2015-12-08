// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import jo;
import ju;
import jv;
import jw;
import jx;
import km;
import ok;
import pm;
import pn;
import ql;

public class SwipeRefreshLayout extends ViewGroup
    implements ju, jw
{

    private static final String c = android/support/v4/widget/SwipeRefreshLayout.getSimpleName();
    private static final int t[] = {
        0x101000e
    };
    private float A;
    private boolean B;
    private int C;
    private int D;
    private android.view.animation.Animation.AnimationListener E = new android.view.animation.Animation.AnimationListener() {

        private SwipeRefreshLayout a;

        public final void onAnimationEnd(Animation animation)
        {
            if (SwipeRefreshLayout.a(a))
            {
                SwipeRefreshLayout.b(a).setAlpha(255);
                SwipeRefreshLayout.b(a).start();
                if (SwipeRefreshLayout.c(a) && SwipeRefreshLayout.d(a) != null)
                {
                    SwipeRefreshLayout.d(a).a();
                }
            } else
            {
                SwipeRefreshLayout.b(a).stop();
                SwipeRefreshLayout.e(a).setVisibility(8);
                SwipeRefreshLayout.f(a);
                SwipeRefreshLayout.c();
                SwipeRefreshLayout.a(a, a.b - SwipeRefreshLayout.g(a), true);
            }
            SwipeRefreshLayout.a(a, SwipeRefreshLayout.e(a).getTop());
        }

        public final void onAnimationRepeat(Animation animation)
        {
        }

        public final void onAnimationStart(Animation animation)
        {
        }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
    };
    private final Animation F;
    private final Animation G;
    protected int a;
    protected int b;
    private View d;
    private ql e;
    private boolean f;
    private int g;
    private float h;
    private float i;
    private final jx j;
    private final jv k;
    private final int l[];
    private int m;
    private boolean n;
    private float o;
    private float p;
    private boolean q;
    private int r;
    private final DecelerateInterpolator s;
    private ok u;
    private int v;
    private pm w;
    private Animation x;
    private Animation y;
    private Animation z;

    public SwipeRefreshLayout(Context context)
    {
        this(context, null);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = false;
        h = -1F;
        l = new int[2];
        n = false;
        r = -1;
        v = -1;
        F = new Animation() {

            private SwipeRefreshLayout a;

            public final void applyTransformation(float f1, Transformation transformation)
            {
                SwipeRefreshLayout.d();
                int j1 = (int)(SwipeRefreshLayout.i(a) - (float)Math.abs(a.b));
                int i1 = a.a;
                j1 = (int)((float)(j1 - a.a) * f1);
                int k1 = SwipeRefreshLayout.e(a).getTop();
                SwipeRefreshLayout.a(a, (j1 + i1) - k1, false);
                SwipeRefreshLayout.b(a).a(1.0F - f1);
            }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
        };
        G = new Animation() {

            private SwipeRefreshLayout a;

            public final void applyTransformation(float f1, Transformation transformation)
            {
                SwipeRefreshLayout.b(a, f1);
            }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
        };
        g = ViewConfiguration.get(context).getScaledTouchSlop();
        getResources().getInteger(0x10e0001);
        setWillNotDraw(false);
        s = new DecelerateInterpolator(2.0F);
        context = context.obtainStyledAttributes(attributeset, t);
        setEnabled(context.getBoolean(0, true));
        context.recycle();
        context = getResources().getDisplayMetrics();
        C = (int)(((DisplayMetrics) (context)).density * 40F);
        D = (int)(((DisplayMetrics) (context)).density * 40F);
        u = new ok(getContext());
        w = new pm(getContext(), this);
        w.a.v = 0xfffafafa;
        u.setImageDrawable(w);
        u.setVisibility(8);
        addView(u);
        km.a(this);
        A = ((DisplayMetrics) (context)).density * 64F;
        h = A;
        j = new jx();
        k = new jv(this);
        setNestedScrollingEnabled(true);
    }

    private static float a(MotionEvent motionevent, int i1)
    {
        i1 = jo.a(motionevent, i1);
        if (i1 < 0)
        {
            return -1F;
        } else
        {
            return jo.d(motionevent, i1);
        }
    }

    static int a(SwipeRefreshLayout swiperefreshlayout, int i1)
    {
        swiperefreshlayout.m = i1;
        return i1;
    }

    private Animation a(int i1, int j1)
    {
        Animation animation = new Animation(i1, j1) {

            private int a;
            private int b;
            private SwipeRefreshLayout c;

            public final void applyTransformation(float f1, Transformation transformation)
            {
                SwipeRefreshLayout.b(c).setAlpha((int)((float)a + (float)(b - a) * f1));
            }

            
            {
                c = SwipeRefreshLayout.this;
                a = i1;
                b = j1;
                super();
            }
        };
        animation.setDuration(300L);
        u.a = null;
        u.clearAnimation();
        u.startAnimation(animation);
        return animation;
    }

    private void a(float f1)
    {
        float f3;
        float f5;
        int i1;
        int j1;
        w.a(true);
        float f2 = Math.min(1.0F, Math.abs(f1 / h));
        f3 = ((float)Math.max((double)f2 - 0.40000000000000002D, 0.0D) * 5F) / 3F;
        f5 = Math.abs(f1);
        float f6 = h;
        float f4 = A;
        f5 = Math.max(0.0F, Math.min(f5 - f6, f4 * 2.0F) / f4);
        f5 = (float)((double)(f5 / 4F) - Math.pow(f5 / 4F, 2D)) * 2.0F;
        i1 = b;
        j1 = (int)(f2 * f4 + f4 * f5 * 2.0F);
        if (u.getVisibility() != 0)
        {
            u.setVisibility(0);
        }
        km.d(u, 1.0F);
        km.e(u, 1.0F);
        if (f1 >= h) goto _L2; else goto _L1
_L1:
        if (w.getAlpha() > 76 && !a(y))
        {
            y = a(w.getAlpha(), 76);
        }
        w.b(Math.min(0.8F, f3 * 0.8F));
        w.a(Math.min(1.0F, f3));
_L4:
        w.a.c(((f3 * 0.4F - 0.25F) + f5 * 2.0F) * 0.5F);
        a((j1 + i1) - m, true);
        return;
_L2:
        if (w.getAlpha() < 255 && !a(z))
        {
            z = a(w.getAlpha(), 255);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(int i1)
    {
        u.getBackground().setAlpha(i1);
        w.setAlpha(i1);
    }

    private void a(int i1, boolean flag)
    {
        u.bringToFront();
        u.offsetTopAndBottom(i1);
        m = u.getTop();
        if (flag && android.os.Build.VERSION.SDK_INT < 11)
        {
            invalidate();
        }
    }

    static void a(SwipeRefreshLayout swiperefreshlayout, float f1)
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            swiperefreshlayout.a((int)(255F * f1));
            return;
        } else
        {
            km.d(swiperefreshlayout.u, f1);
            km.e(swiperefreshlayout.u, f1);
            return;
        }
    }

    static void a(SwipeRefreshLayout swiperefreshlayout, int i1, boolean flag)
    {
        swiperefreshlayout.a(i1, flag);
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = jo.b(motionevent);
        if (jo.b(motionevent, i1) == r)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            r = jo.b(motionevent, i1);
        }
    }

    private void a(android.view.animation.Animation.AnimationListener animationlistener)
    {
        x = new Animation() {

            private SwipeRefreshLayout a;

            public final void applyTransformation(float f1, Transformation transformation)
            {
                SwipeRefreshLayout.a(a, 1.0F - f1);
            }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
        };
        x.setDuration(150L);
        u.a = animationlistener;
        u.clearAnimation();
        u.startAnimation(x);
    }

    private void a(boolean flag, boolean flag1)
    {
label0:
        {
            if (f != flag)
            {
                B = flag1;
                e();
                f = flag;
                if (!f)
                {
                    break label0;
                }
                int i1 = m;
                android.view.animation.Animation.AnimationListener animationlistener = E;
                a = i1;
                F.reset();
                F.setDuration(200L);
                F.setInterpolator(s);
                if (animationlistener != null)
                {
                    u.a = animationlistener;
                }
                u.clearAnimation();
                u.startAnimation(F);
            }
            return;
        }
        a(E);
    }

    static boolean a(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.f;
    }

    private static boolean a(Animation animation)
    {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    static pm b(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.w;
    }

    private void b(float f1)
    {
        if (f1 > h)
        {
            a(true, true);
            return;
        } else
        {
            f = false;
            w.b(0.0F);
            android.view.animation.Animation.AnimationListener animationlistener = new android.view.animation.Animation.AnimationListener() {

                private SwipeRefreshLayout a;

                public final void onAnimationEnd(Animation animation)
                {
                    SwipeRefreshLayout.c();
                    SwipeRefreshLayout.h(a);
                }

                public final void onAnimationRepeat(Animation animation)
                {
                }

                public final void onAnimationStart(Animation animation)
                {
                }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
            };
            a = m;
            G.reset();
            G.setDuration(200L);
            G.setInterpolator(s);
            u.a = animationlistener;
            u.clearAnimation();
            u.startAnimation(G);
            w.a(false);
            return;
        }
    }

    static void b(SwipeRefreshLayout swiperefreshlayout, float f1)
    {
        swiperefreshlayout.a((swiperefreshlayout.a + (int)((float)(swiperefreshlayout.b - swiperefreshlayout.a) * f1)) - swiperefreshlayout.u.getTop(), false);
    }

    static boolean c()
    {
        return false;
    }

    static boolean c(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.B;
    }

    static ql d(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.e;
    }

    static boolean d()
    {
        return false;
    }

    static ok e(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.u;
    }

    private void e()
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L7:
        if (i1 >= getChildCount()) goto _L2; else goto _L3
_L3:
        View view = getChildAt(i1);
        if (view.equals(u)) goto _L5; else goto _L4
_L4:
        d = view;
_L2:
        return;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static void f(SwipeRefreshLayout swiperefreshlayout)
    {
        swiperefreshlayout.a(255);
    }

    private boolean f()
    {
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            if (d instanceof AbsListView)
            {
                AbsListView abslistview = (AbsListView)d;
                return abslistview.getChildCount() > 0 && (abslistview.getFirstVisiblePosition() > 0 || abslistview.getChildAt(0).getTop() < abslistview.getPaddingTop());
            }
            return km.b(d, -1) || d.getScrollY() > 0;
        } else
        {
            return km.b(d, -1);
        }
    }

    static int g(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.m;
    }

    static void h(SwipeRefreshLayout swiperefreshlayout)
    {
        swiperefreshlayout.a(((android.view.animation.Animation.AnimationListener) (null)));
    }

    static float i(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.A;
    }

    public final void a()
    {
        a(false, false);
    }

    public final void a(ql ql)
    {
        e = ql;
    }

    public final transient void a(int ai[])
    {
        Resources resources = getResources();
        int ai1[] = new int[4];
        for (int i1 = 0; i1 < 4; i1++)
        {
            ai1[i1] = resources.getColor(ai[i1]);
        }

        e();
        ai = w;
        ((pm) (ai)).a.a(ai1);
        ((pm) (ai)).a.a(0);
    }

    public final boolean b()
    {
        return f;
    }

    public boolean dispatchNestedFling(float f1, float f2, boolean flag)
    {
        return k.a(f1, f2, flag);
    }

    public boolean dispatchNestedPreFling(float f1, float f2)
    {
        return k.a(f1, f2);
    }

    public boolean dispatchNestedPreScroll(int i1, int j1, int ai[], int ai1[])
    {
        return k.a(i1, j1, ai, ai1);
    }

    public boolean dispatchNestedScroll(int i1, int j1, int k1, int l1, int ai[])
    {
        return k.a(i1, j1, k1, l1, ai);
    }

    protected int getChildDrawingOrder(int i1, int j1)
    {
        if (v >= 0)
        {
            if (j1 == i1 - 1)
            {
                return v;
            }
            if (j1 >= v)
            {
                return j1 + 1;
            }
        }
        return j1;
    }

    public int getNestedScrollAxes()
    {
        return j.a;
    }

    public boolean hasNestedScrollingParent()
    {
        return k.a();
    }

    public boolean isNestedScrollingEnabled()
    {
        return k.a;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        e();
        i1 = jo.a(motionevent);
        if (isEnabled() && !f() && !f) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        i1;
        JVM INSTR tableswitch 0 6: default 76
    //                   0 81
    //                   1 233
    //                   2 136
    //                   3 233
    //                   4 76
    //                   5 76
    //                   6 225;
           goto _L3 _L4 _L5 _L6 _L5 _L3 _L3 _L7
_L3:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_233;
_L9:
        return q;
_L4:
        float f1;
        a(b - u.getTop(), true);
        r = jo.b(motionevent, 0);
        q = false;
        f1 = a(motionevent, r);
        if (f1 == -1F) goto _L1; else goto _L8
_L8:
        p = f1;
          goto _L9
_L6:
        if (r == -1)
        {
            Log.e(c, "Got ACTION_MOVE event but don't have an active pointer id.");
            return false;
        }
        f1 = a(motionevent, r);
        if (f1 == -1F) goto _L1; else goto _L10
_L10:
        if (f1 - p > (float)g && !q)
        {
            o = p + (float)g;
            q = true;
            w.setAlpha(76);
        }
          goto _L9
_L7:
        a(motionevent);
          goto _L9
        q = false;
        r = -1;
          goto _L9
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        i1 = getMeasuredWidth();
        j1 = getMeasuredHeight();
        if (getChildCount() != 0)
        {
            if (d == null)
            {
                e();
            }
            if (d != null)
            {
                View view = d;
                k1 = getPaddingLeft();
                l1 = getPaddingTop();
                view.layout(k1, l1, (i1 - getPaddingLeft() - getPaddingRight()) + k1, (j1 - getPaddingTop() - getPaddingBottom()) + l1);
                j1 = u.getMeasuredWidth();
                k1 = u.getMeasuredHeight();
                u.layout(i1 / 2 - j1 / 2, m, i1 / 2 + j1 / 2, m + k1);
                return;
            }
        }
    }

    public void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        if (d == null)
        {
            e();
        }
        if (d != null)
        {
            d.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 0x40000000));
            u.measure(android.view.View.MeasureSpec.makeMeasureSpec(C, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(D, 0x40000000));
            if (!n)
            {
                n = true;
                i1 = -u.getMeasuredHeight();
                b = i1;
                m = i1;
            }
            v = -1;
            i1 = 0;
            while (i1 < getChildCount()) 
            {
                if (getChildAt(i1) == u)
                {
                    v = i1;
                    return;
                }
                i1++;
            }
        }
    }

    public boolean onNestedFling(View view, float f1, float f2, boolean flag)
    {
        return dispatchNestedFling(f1, f2, flag);
    }

    public boolean onNestedPreFling(View view, float f1, float f2)
    {
        return dispatchNestedPreFling(f1, f2);
    }

    public void onNestedPreScroll(View view, int i1, int j1, int ai[])
    {
        if (j1 > 0 && i > 0.0F)
        {
            if ((float)j1 > i)
            {
                ai[1] = j1 - (int)i;
                i = 0.0F;
            } else
            {
                i = i - (float)j1;
                ai[1] = j1;
            }
            a(i);
        }
        view = l;
        if (dispatchNestedPreScroll(i1 - ai[0], j1 - ai[1], view, null))
        {
            ai[0] = ai[0] + view[0];
            i1 = ai[1];
            ai[1] = view[1] + i1;
        }
    }

    public void onNestedScroll(View view, int i1, int j1, int k1, int l1)
    {
        if (l1 < 0)
        {
            l1 = Math.abs(l1);
            float f1 = i;
            i = (float)l1 + f1;
            a(i);
        }
        dispatchNestedScroll(i1, j1, k1, i1, null);
    }

    public void onNestedScrollAccepted(View view, View view1, int i1)
    {
        j.a = i1;
        i = 0.0F;
    }

    public boolean onStartNestedScroll(View view, View view1, int i1)
    {
        if (isEnabled() && !f() && !f && (i1 & 2) != 0)
        {
            startNestedScroll(i1 & 2);
            return true;
        } else
        {
            return false;
        }
    }

    public void onStopNestedScroll(View view)
    {
        j.a = 0;
        if (i > 0.0F)
        {
            b(i);
            i = 0.0F;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1 = jo.a(motionevent);
        if (isEnabled() && !f()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        i1;
        JVM INSTR tableswitch 0 6: default 68
    //                   0 70
    //                   1 195
    //                   2 87
    //                   3 20
    //                   4 68
    //                   5 151
    //                   6 187;
           goto _L3 _L4 _L5 _L6 _L1 _L3 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_187;
_L3:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_195;
_L9:
        return true;
_L4:
        r = jo.b(motionevent, 0);
        q = false;
          goto _L9
_L6:
        float f1;
        int j1 = jo.a(motionevent, r);
        if (j1 < 0)
        {
            Log.e(c, "Got ACTION_MOVE event but have an invalid active pointer id.");
            return false;
        }
        f1 = (jo.d(motionevent, j1) - o) * 0.5F;
        if (!q) goto _L9; else goto _L10
_L10:
        if (f1 <= 0.0F) goto _L1; else goto _L11
_L11:
        a(f1);
          goto _L9
_L7:
        int k1 = jo.b(motionevent);
        if (k1 < 0)
        {
            Log.e(c, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
            return false;
        }
        r = jo.b(motionevent, k1);
          goto _L9
        a(motionevent);
          goto _L9
        int l1 = jo.a(motionevent, r);
        if (l1 < 0)
        {
            Log.e(c, "Got ACTION_UP event but don't have an active pointer id.");
            return false;
        } else
        {
            float f2 = jo.d(motionevent, l1);
            float f3 = o;
            q = false;
            b((f2 - f3) * 0.5F);
            r = -1;
            return false;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        if ((android.os.Build.VERSION.SDK_INT >= 21 || !(d instanceof AbsListView)) && (d == null || km.z(d)))
        {
            super.requestDisallowInterceptTouchEvent(flag);
        }
    }

    public void setNestedScrollingEnabled(boolean flag)
    {
        k.a(flag);
    }

    public boolean startNestedScroll(int i1)
    {
        return k.a(i1);
    }

    public void stopNestedScroll()
    {
        k.b();
    }

}
