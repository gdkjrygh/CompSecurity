// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import aP;
import aY;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import bs;
import bz;

public class SwipeRefreshLayout extends ViewGroup
{
    public static interface a
    {
    }


    private static final int q[] = {
        0x101000e
    };
    private float A;
    private boolean B;
    private int C;
    private int D;
    private boolean E;
    private android.view.animation.Animation.AnimationListener F = new android.view.animation.Animation.AnimationListener() {

        private SwipeRefreshLayout a;

        public final void onAnimationEnd(Animation animation)
        {
            if (SwipeRefreshLayout.a(a))
            {
                SwipeRefreshLayout.b(a).setAlpha(255);
                SwipeRefreshLayout.b(a).start();
                if (SwipeRefreshLayout.c(a) && SwipeRefreshLayout.d(a) != null)
                {
                    SwipeRefreshLayout.d(a);
                }
            } else
            {
                SwipeRefreshLayout.b(a).stop();
                SwipeRefreshLayout.e(a).setVisibility(8);
                SwipeRefreshLayout.f(a);
                if (SwipeRefreshLayout.g(a))
                {
                    SwipeRefreshLayout.a(a, 0.0F);
                } else
                {
                    SwipeRefreshLayout.a(a, a.b - SwipeRefreshLayout.h(a), true);
                }
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
    private final Animation G;
    private final Animation H;
    protected int a;
    protected int b;
    private View c;
    private a d;
    private boolean e;
    private int f;
    private float g;
    private int h;
    private int i;
    private boolean j;
    private float k;
    private float l;
    private boolean m;
    private int n;
    private boolean o;
    private final DecelerateInterpolator p;
    private bs r;
    private int s;
    private float t;
    private bz u;
    private Animation v;
    private Animation w;
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
        e = false;
        g = -1F;
        j = false;
        n = -1;
        s = -1;
        G = new Animation() {

            private SwipeRefreshLayout a;

            public final void applyTransformation(float f1, Transformation transformation)
            {
                int i1;
                int j1;
                int k1;
                if (!SwipeRefreshLayout.j(a))
                {
                    i1 = (int)(SwipeRefreshLayout.k(a) - (float)Math.abs(a.b));
                } else
                {
                    i1 = (int)SwipeRefreshLayout.k(a);
                }
                j1 = a.a;
                i1 = (int)((float)(i1 - a.a) * f1);
                k1 = SwipeRefreshLayout.e(a).getTop();
                SwipeRefreshLayout.a(a, (i1 + j1) - k1, false);
                SwipeRefreshLayout.b(a).a(1.0F - f1);
            }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
        };
        H = new Animation() {

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
        f = ViewConfiguration.get(context).getScaledTouchSlop();
        h = getResources().getInteger(0x10e0001);
        setWillNotDraw(false);
        p = new DecelerateInterpolator(2.0F);
        context = context.obtainStyledAttributes(attributeset, q);
        setEnabled(context.getBoolean(0, true));
        context.recycle();
        context = getResources().getDisplayMetrics();
        C = (int)(((DisplayMetrics) (context)).density * 40F);
        D = (int)(((DisplayMetrics) (context)).density * 40F);
        r = new bs(getContext());
        u = new bz(getContext(), this);
        u.b(0xfffafafa);
        r.setImageDrawable(u);
        r.setVisibility(8);
        addView(r);
        aY.a(this);
        A = ((DisplayMetrics) (context)).density * 64F;
        g = A;
    }

    private static float a(MotionEvent motionevent, int i1)
    {
        i1 = aP.a(motionevent, i1);
        if (i1 < 0)
        {
            return -1F;
        } else
        {
            return aP.d(motionevent, i1);
        }
    }

    static int a(SwipeRefreshLayout swiperefreshlayout, int i1)
    {
        swiperefreshlayout.i = i1;
        return i1;
    }

    private Animation a(int i1, int j1)
    {
        if (o && a())
        {
            return null;
        } else
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
            r.a = null;
            r.clearAnimation();
            r.startAnimation(animation);
            return animation;
        }
    }

    private void a(float f1)
    {
        if (a())
        {
            a((int)(255F * f1));
            return;
        } else
        {
            aY.d(r, f1);
            aY.e(r, f1);
            return;
        }
    }

    private void a(int i1)
    {
        r.getBackground().setAlpha(i1);
        u.setAlpha(i1);
    }

    private void a(int i1, boolean flag)
    {
        r.bringToFront();
        r.offsetTopAndBottom(i1);
        i = r.getTop();
        if (flag && android.os.Build.VERSION.SDK_INT < 11)
        {
            invalidate();
        }
    }

    static void a(SwipeRefreshLayout swiperefreshlayout, float f1)
    {
        swiperefreshlayout.a(f1);
    }

    static void a(SwipeRefreshLayout swiperefreshlayout, int i1, boolean flag)
    {
        swiperefreshlayout.a(i1, flag);
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = aP.b(motionevent);
        if (aP.b(motionevent, i1) == n)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            n = aP.b(motionevent, i1);
        }
    }

    private void a(android.view.animation.Animation.AnimationListener animationlistener)
    {
        w = new Animation() {

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
        w.setDuration(150L);
        r.a = animationlistener;
        r.clearAnimation();
        r.startAnimation(w);
    }

    private void a(boolean flag, boolean flag1)
    {
label0:
        {
            if (e != flag)
            {
                B = flag1;
                b();
                e = flag;
                if (!e)
                {
                    break label0;
                }
                int i1 = i;
                android.view.animation.Animation.AnimationListener animationlistener = F;
                a = i1;
                G.reset();
                G.setDuration(200L);
                G.setInterpolator(p);
                if (animationlistener != null)
                {
                    r.a = animationlistener;
                }
                r.clearAnimation();
                r.startAnimation(G);
            }
            return;
        }
        a(F);
    }

    private static boolean a()
    {
        return android.os.Build.VERSION.SDK_INT < 11;
    }

    static boolean a(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.e;
    }

    private static boolean a(Animation animation)
    {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    static bz b(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.u;
    }

    private void b()
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L7:
        if (i1 >= getChildCount()) goto _L2; else goto _L3
_L3:
        View view = getChildAt(i1);
        if (view.equals(r)) goto _L5; else goto _L4
_L4:
        c = view;
_L2:
        return;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static void b(SwipeRefreshLayout swiperefreshlayout, float f1)
    {
        swiperefreshlayout.a((swiperefreshlayout.a + (int)((float)(swiperefreshlayout.b - swiperefreshlayout.a) * f1)) - swiperefreshlayout.r.getTop(), false);
    }

    private boolean c()
    {
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            if (c instanceof AbsListView)
            {
                AbsListView abslistview = (AbsListView)c;
                return abslistview.getChildCount() > 0 && (abslistview.getFirstVisiblePosition() > 0 || abslistview.getChildAt(0).getTop() < abslistview.getPaddingTop());
            }
            return aY.b(c, -1) || c.getScrollY() > 0;
        } else
        {
            return aY.b(c, -1);
        }
    }

    static boolean c(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.B;
    }

    static a d(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.d;
    }

    static bs e(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.r;
    }

    static void f(SwipeRefreshLayout swiperefreshlayout)
    {
        swiperefreshlayout.a(255);
    }

    static boolean g(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.o;
    }

    static int h(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.i;
    }

    static void i(SwipeRefreshLayout swiperefreshlayout)
    {
        swiperefreshlayout.a(((android.view.animation.Animation.AnimationListener) (null)));
    }

    static boolean j(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.E;
    }

    static float k(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.A;
    }

    static float l(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.t;
    }

    protected int getChildDrawingOrder(int i1, int j1)
    {
        if (s >= 0)
        {
            if (j1 == i1 - 1)
            {
                return s;
            }
            if (j1 >= s)
            {
                return j1 + 1;
            }
        }
        return j1;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        b();
        i1 = aP.a(motionevent);
        if (isEnabled() && !c() && !e) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        i1;
        JVM INSTR tableswitch 0 6: default 76
    //                   0 81
    //                   1 221
    //                   2 136
    //                   3 221
    //                   4 76
    //                   5 76
    //                   6 213;
           goto _L3 _L4 _L5 _L6 _L5 _L3 _L3 _L7
_L3:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_221;
_L9:
        return m;
_L4:
        float f1;
        a(b - r.getTop(), true);
        n = aP.b(motionevent, 0);
        m = false;
        f1 = a(motionevent, n);
        if (f1 == -1F) goto _L1; else goto _L8
_L8:
        l = f1;
          goto _L9
_L6:
        if (n == -1) goto _L1; else goto _L10
_L10:
        f1 = a(motionevent, n);
        if (f1 == -1F) goto _L1; else goto _L11
_L11:
        if (f1 - l > (float)f && !m)
        {
            k = l + (float)f;
            m = true;
            u.setAlpha(76);
        }
          goto _L9
_L7:
        a(motionevent);
          goto _L9
        m = false;
        n = -1;
          goto _L9
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        i1 = getMeasuredWidth();
        j1 = getMeasuredHeight();
        if (getChildCount() != 0)
        {
            if (c == null)
            {
                b();
            }
            if (c != null)
            {
                View view = c;
                k1 = getPaddingLeft();
                l1 = getPaddingTop();
                view.layout(k1, l1, (i1 - getPaddingLeft() - getPaddingRight()) + k1, (j1 - getPaddingTop() - getPaddingBottom()) + l1);
                j1 = r.getMeasuredWidth();
                k1 = r.getMeasuredHeight();
                r.layout(i1 / 2 - j1 / 2, i, i1 / 2 + j1 / 2, i + k1);
                return;
            }
        }
    }

    public void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        if (c == null)
        {
            b();
        }
        if (c != null)
        {
            c.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 0x40000000));
            r.measure(android.view.View.MeasureSpec.makeMeasureSpec(C, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(D, 0x40000000));
            if (!E && !j)
            {
                j = true;
                i1 = -r.getMeasuredHeight();
                b = i1;
                i = i1;
            }
            s = -1;
            i1 = 0;
            while (i1 < getChildCount()) 
            {
                if (getChildAt(i1) == r)
                {
                    s = i1;
                    return;
                }
                i1++;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        i1 = aP.a(motionevent);
        if (!isEnabled() || c())
        {
            return false;
        }
        i1;
        JVM INSTR tableswitch 0 6: default 68
    //                   0 70
    //                   1 537
    //                   2 87
    //                   3 537
    //                   4 68
    //                   5 514
    //                   6 529;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L5 _L6
_L1:
        return true;
_L2:
        n = aP.b(motionevent, 0);
        m = false;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = aP.a(motionevent, n);
        if (i1 < 0)
        {
            return false;
        }
        float f3 = 0.5F * (aP.d(motionevent, i1) - k);
        if (!m)
        {
            continue; /* Loop/switch isn't completed */
        }
        u.a(true);
        float f1 = f3 / g;
        if (f1 < 0.0F)
        {
            return false;
        }
        float f5 = Math.min(1.0F, Math.abs(f1));
        float f6 = ((float)Math.max((double)f5 - 0.40000000000000002D, 0.0D) * 5F) / 3F;
        float f7 = Math.abs(f3);
        float f8 = g;
        int j1;
        if (E)
        {
            f1 = A - (float)b;
        } else
        {
            f1 = A;
        }
        f7 = Math.max(0.0F, Math.min(f7 - f8, f1 * 2.0F) / f1);
        f7 = (float)((double)(f7 / 4F) - Math.pow(f7 / 4F, 2D)) * 2.0F;
        i1 = b;
        j1 = (int)(f1 * f5 + f1 * f7 * 2.0F);
        if (r.getVisibility() != 0)
        {
            r.setVisibility(0);
        }
        if (!o)
        {
            aY.d(r, 1.0F);
            aY.e(r, 1.0F);
        }
        if (f3 >= g) goto _L8; else goto _L7
_L7:
        if (o)
        {
            a(f3 / g);
        }
        if (u.getAlpha() > 76 && !a(x))
        {
            x = a(u.getAlpha(), 76);
        }
        u.b(Math.min(0.8F, 0.8F * f6));
        u.a(Math.min(1.0F, f6));
_L9:
        u.a.c((-0.25F + 0.4F * f6 + f7 * 2.0F) * 0.5F);
        a((j1 + i1) - i, true);
        continue; /* Loop/switch isn't completed */
_L8:
        if (u.getAlpha() < 255 && !a(y))
        {
            y = a(u.getAlpha(), 255);
        }
        if (true) goto _L9; else goto _L5
_L5:
        n = aP.b(motionevent, aP.b(motionevent));
        continue; /* Loop/switch isn't completed */
_L6:
        a(motionevent);
        if (true) goto _L1; else goto _L3
_L3:
        float f2;
        float f4;
        if (n == -1)
        {
            return false;
        }
        f2 = aP.d(motionevent, aP.a(motionevent, n));
        f4 = k;
        m = false;
        if ((f2 - f4) * 0.5F <= g) goto _L11; else goto _L10
_L10:
        a(true, true);
_L13:
        n = -1;
        return false;
_L11:
        e = false;
        u.b(0.0F);
        motionevent = null;
        if (!o)
        {
            motionevent = new android.view.animation.Animation.AnimationListener() {

                private SwipeRefreshLayout a;

                public final void onAnimationEnd(Animation animation)
                {
                    if (!SwipeRefreshLayout.g(a))
                    {
                        SwipeRefreshLayout.i(a);
                    }
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
        }
        i1 = i;
        if (!o)
        {
            break; /* Loop/switch isn't completed */
        }
        a = i1;
        if (a())
        {
            t = u.getAlpha();
        } else
        {
            t = aY.p(r);
        }
        z = new Animation() {

            private SwipeRefreshLayout a;

            public final void applyTransformation(float f9, Transformation transformation)
            {
                float f10 = SwipeRefreshLayout.l(a);
                float f11 = -SwipeRefreshLayout.l(a);
                SwipeRefreshLayout.a(a, f10 + f11 * f9);
                SwipeRefreshLayout.b(a, f9);
            }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
        };
        z.setDuration(150L);
        if (motionevent != null)
        {
            r.a = motionevent;
        }
        r.clearAnimation();
        r.startAnimation(z);
_L14:
        u.a(false);
        if (true) goto _L13; else goto _L12
_L12:
        a = i1;
        H.reset();
        H.setDuration(200L);
        H.setInterpolator(p);
        if (motionevent != null)
        {
            r.a = motionevent;
        }
        r.clearAnimation();
        r.startAnimation(H);
          goto _L14
        if (true) goto _L13; else goto _L15
_L15:
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
    }

    public transient void setColorScheme(int ai[])
    {
        setColorSchemeResources(ai);
    }

    public transient void setColorSchemeColors(int ai[])
    {
        b();
        bz bz1 = u;
        bz1.a.a(ai);
        bz1.a.a(0);
    }

    public transient void setColorSchemeResources(int ai[])
    {
        Resources resources = getResources();
        int ai1[] = new int[ai.length];
        for (int i1 = 0; i1 < ai.length; i1++)
        {
            ai1[i1] = resources.getColor(ai[i1]);
        }

        setColorSchemeColors(ai1);
    }

    public void setDistanceToTriggerSync(int i1)
    {
        g = i1;
    }

    public void setOnRefreshListener(a a1)
    {
        d = a1;
    }

    public void setProgressBackgroundColor(int i1)
    {
        setProgressBackgroundColorSchemeResource(i1);
    }

    public void setProgressBackgroundColorSchemeColor(int i1)
    {
        r.setBackgroundColor(i1);
        u.b(i1);
    }

    public void setProgressBackgroundColorSchemeResource(int i1)
    {
        setProgressBackgroundColorSchemeColor(getResources().getColor(i1));
    }

    public void setProgressViewEndTarget(boolean flag, int i1)
    {
        A = i1;
        o = flag;
        r.invalidate();
    }

    public void setProgressViewOffset(boolean flag, int i1, int j1)
    {
        o = flag;
        r.setVisibility(8);
        i = i1;
        b = i1;
        A = j1;
        E = true;
        r.invalidate();
    }

    public void setRefreshing(boolean flag)
    {
        if (flag && e != flag)
        {
            e = flag;
            android.view.animation.Animation.AnimationListener animationlistener;
            int i1;
            if (!E)
            {
                i1 = (int)(A + (float)b);
            } else
            {
                i1 = (int)A;
            }
            a(i1 - i, true);
            B = false;
            animationlistener = F;
            r.setVisibility(0);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                u.setAlpha(255);
            }
            v = new Animation() {

                private SwipeRefreshLayout a;

                public final void applyTransformation(float f1, Transformation transformation)
                {
                    SwipeRefreshLayout.a(a, f1);
                }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
            };
            v.setDuration(h);
            if (animationlistener != null)
            {
                r.a = animationlistener;
            }
            r.clearAnimation();
            r.startAnimation(v);
            return;
        } else
        {
            a(flag, false);
            return;
        }
    }

    public void setSize(int i1)
    {
        if (i1 != 0 && i1 != 1)
        {
            return;
        }
        DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
        if (i1 == 0)
        {
            int j1 = (int)(displaymetrics.density * 56F);
            C = j1;
            D = j1;
        } else
        {
            int k1 = (int)(displaymetrics.density * 40F);
            C = k1;
            D = k1;
        }
        r.setImageDrawable(null);
        u.a(i1);
        r.setImageDrawable(u);
    }

    static 
    {
        android/support/v4/widget/SwipeRefreshLayout.getSimpleName();
    }
}
