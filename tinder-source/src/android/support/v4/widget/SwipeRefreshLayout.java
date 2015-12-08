// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.n;
import android.support.v4.view.o;
import android.support.v4.view.p;
import android.support.v4.view.q;
import android.support.v4.view.r;
import android.support.v4.view.x;
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

// Referenced classes of package android.support.v4.widget:
//            b, m

public class SwipeRefreshLayout extends ViewGroup
    implements o, q
{
    public static interface a
    {

        public abstract void onRefresh();
    }


    private static final String c = android/support/v4/widget/SwipeRefreshLayout.getSimpleName();
    private static final int w[] = {
        0x101000e
    };
    private m A;
    private Animation B;
    private Animation C;
    private Animation D;
    private Animation E;
    private Animation F;
    private float G;
    private boolean H;
    private int I;
    private int J;
    private boolean K;
    private android.view.animation.Animation.AnimationListener L = new android.view.animation.Animation.AnimationListener() {

        final SwipeRefreshLayout a;

        public final void onAnimationEnd(Animation animation)
        {
            if (SwipeRefreshLayout.a(a))
            {
                SwipeRefreshLayout.b(a).setAlpha(255);
                SwipeRefreshLayout.b(a).start();
                if (SwipeRefreshLayout.c(a) && SwipeRefreshLayout.d(a) != null)
                {
                    SwipeRefreshLayout.d(a).onRefresh();
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
    private final Animation M;
    private final Animation N;
    private final Animation O;
    protected int a;
    protected int b;
    private View d;
    private a e;
    private boolean f;
    private int g;
    private float h;
    private float i;
    private final r j;
    private final p k;
    private final int l[];
    private int m;
    private int n;
    private boolean o;
    private float p;
    private float q;
    private boolean r;
    private int s;
    private boolean t;
    private boolean u;
    private final DecelerateInterpolator v;
    private b x;
    private int y;
    private float z;

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
        o = false;
        s = -1;
        y = -1;
        M = new Animation() {

            final SwipeRefreshLayout a;

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
        N = new Animation() {

            final SwipeRefreshLayout a;

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
        O = new Animation() {

            final SwipeRefreshLayout a;

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
        m = getResources().getInteger(0x10e0001);
        setWillNotDraw(false);
        v = new DecelerateInterpolator(2.0F);
        context = context.obtainStyledAttributes(attributeset, w);
        setEnabled(context.getBoolean(0, true));
        context.recycle();
        context = getResources().getDisplayMetrics();
        I = (int)(((DisplayMetrics) (context)).density * 40F);
        J = (int)(((DisplayMetrics) (context)).density * 40F);
        x = new b(getContext());
        A = new m(getContext(), this);
        A.b(0xfffafafa);
        x.setImageDrawable(A);
        x.setVisibility(8);
        addView(x);
        android.support.v4.view.x.a(this);
        G = ((DisplayMetrics) (context)).density * 64F;
        h = G;
        j = new r(this);
        k = new p(this);
        setNestedScrollingEnabled(true);
    }

    private static float a(MotionEvent motionevent, int i1)
    {
        i1 = android.support.v4.view.n.a(motionevent, i1);
        if (i1 < 0)
        {
            return -1F;
        } else
        {
            return android.support.v4.view.n.d(motionevent, i1);
        }
    }

    static int a(SwipeRefreshLayout swiperefreshlayout, int i1)
    {
        swiperefreshlayout.n = i1;
        return i1;
    }

    private Animation a(int i1, int j1)
    {
        if (t && a())
        {
            return null;
        } else
        {
            Animation animation = new Animation(i1, j1) {

                final int a;
                final int b;
                final SwipeRefreshLayout c;

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
            x.a = null;
            x.clearAnimation();
            x.startAnimation(animation);
            return animation;
        }
    }

    private void a(float f1)
    {
        A.a(true);
        float f3 = Math.min(1.0F, Math.abs(f1 / h));
        float f4 = ((float)Math.max((double)f3 - 0.40000000000000002D, 0.0D) * 5F) / 3F;
        float f5 = Math.abs(f1);
        float f6 = h;
        float f2;
        int i1;
        int j1;
        if (K)
        {
            f2 = G - (float)b;
        } else
        {
            f2 = G;
        }
        f5 = Math.max(0.0F, Math.min(f5 - f6, f2 * 2.0F) / f2);
        f5 = (float)((double)(f5 / 4F) - Math.pow(f5 / 4F, 2D)) * 2.0F;
        i1 = b;
        j1 = (int)(f2 * f3 + f2 * f5 * 2.0F);
        if (x.getVisibility() != 0)
        {
            x.setVisibility(0);
        }
        if (!t)
        {
            android.support.v4.view.x.d(x, 1.0F);
            android.support.v4.view.x.e(x, 1.0F);
        }
        if (f1 >= h) goto _L2; else goto _L1
_L1:
        if (t)
        {
            setAnimationProgress(f1 / h);
        }
        if (A.getAlpha() > 76 && !a(D))
        {
            D = a(A.getAlpha(), 76);
        }
        A.b(Math.min(0.8F, f4 * 0.8F));
        A.a(Math.min(1.0F, f4));
_L4:
        A.a.c((-0.25F + f4 * 0.4F + f5 * 2.0F) * 0.5F);
        a((j1 + i1) - n, true);
        return;
_L2:
        if (A.getAlpha() < 255 && !a(E))
        {
            E = a(A.getAlpha(), 255);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(int i1, boolean flag)
    {
        x.bringToFront();
        x.offsetTopAndBottom(i1);
        n = x.getTop();
        if (flag && android.os.Build.VERSION.SDK_INT < 11)
        {
            invalidate();
        }
    }

    static void a(SwipeRefreshLayout swiperefreshlayout, float f1)
    {
        swiperefreshlayout.setAnimationProgress(f1);
    }

    static void a(SwipeRefreshLayout swiperefreshlayout, int i1, boolean flag)
    {
        swiperefreshlayout.a(i1, flag);
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = android.support.v4.view.n.b(motionevent);
        if (android.support.v4.view.n.b(motionevent, i1) == s)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            s = android.support.v4.view.n.b(motionevent, i1);
        }
    }

    private void a(android.view.animation.Animation.AnimationListener animationlistener)
    {
        C = new Animation() {

            final SwipeRefreshLayout a;

            public final void applyTransformation(float f1, Transformation transformation)
            {
                SwipeRefreshLayout.a(a, 1.0F - f1);
            }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
        };
        C.setDuration(150L);
        x.a = animationlistener;
        x.clearAnimation();
        x.startAnimation(C);
    }

    private void a(boolean flag, boolean flag1)
    {
label0:
        {
            if (f != flag)
            {
                H = flag1;
                b();
                f = flag;
                if (!f)
                {
                    break label0;
                }
                int i1 = n;
                android.view.animation.Animation.AnimationListener animationlistener = L;
                a = i1;
                M.reset();
                M.setDuration(200L);
                M.setInterpolator(v);
                if (animationlistener != null)
                {
                    x.a = animationlistener;
                }
                x.clearAnimation();
                x.startAnimation(M);
            }
            return;
        }
        a(L);
    }

    private static boolean a()
    {
        return android.os.Build.VERSION.SDK_INT < 11;
    }

    static boolean a(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.f;
    }

    private static boolean a(Animation animation)
    {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    static m b(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.A;
    }

    private void b()
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L7:
        if (i1 >= getChildCount()) goto _L2; else goto _L3
_L3:
        View view = getChildAt(i1);
        if (view.equals(x)) goto _L5; else goto _L4
_L4:
        d = view;
_L2:
        return;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void b(float f1)
    {
        if (f1 > h)
        {
            a(true, true);
            return;
        }
        f = false;
        A.b(0.0F);
        android.view.animation.Animation.AnimationListener animationlistener = null;
        if (!t)
        {
            animationlistener = new android.view.animation.Animation.AnimationListener() {

                final SwipeRefreshLayout a;

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
        int i1 = n;
        if (t)
        {
            a = i1;
            if (a())
            {
                z = A.getAlpha();
            } else
            {
                z = android.support.v4.view.x.t(x);
            }
            F = new Animation() {

                final SwipeRefreshLayout a;

                public final void applyTransformation(float f2, Transformation transformation)
                {
                    float f3 = SwipeRefreshLayout.l(a);
                    float f4 = -SwipeRefreshLayout.l(a);
                    SwipeRefreshLayout.a(a, f3 + f4 * f2);
                    SwipeRefreshLayout.b(a, f2);
                }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
            };
            F.setDuration(150L);
            if (animationlistener != null)
            {
                x.a = animationlistener;
            }
            x.clearAnimation();
            x.startAnimation(F);
        } else
        {
            a = i1;
            O.reset();
            O.setDuration(200L);
            O.setInterpolator(v);
            if (animationlistener != null)
            {
                x.a = animationlistener;
            }
            x.clearAnimation();
            x.startAnimation(O);
        }
        A.a(false);
    }

    static void b(SwipeRefreshLayout swiperefreshlayout, float f1)
    {
        swiperefreshlayout.a((swiperefreshlayout.a + (int)((float)(swiperefreshlayout.b - swiperefreshlayout.a) * f1)) - swiperefreshlayout.x.getTop(), false);
    }

    private boolean c()
    {
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            if (d instanceof AbsListView)
            {
                AbsListView abslistview = (AbsListView)d;
                return abslistview.getChildCount() > 0 && (abslistview.getFirstVisiblePosition() > 0 || abslistview.getChildAt(0).getTop() < abslistview.getPaddingTop());
            }
            return android.support.v4.view.x.b(d, -1) || d.getScrollY() > 0;
        } else
        {
            return android.support.v4.view.x.b(d, -1);
        }
    }

    static boolean c(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.H;
    }

    static a d(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.e;
    }

    static b e(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.x;
    }

    static void f(SwipeRefreshLayout swiperefreshlayout)
    {
        swiperefreshlayout.setColorViewAlpha(255);
    }

    static boolean g(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.t;
    }

    static int h(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.n;
    }

    static void i(SwipeRefreshLayout swiperefreshlayout)
    {
        swiperefreshlayout.a(((android.view.animation.Animation.AnimationListener) (null)));
    }

    static boolean j(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.K;
    }

    static float k(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.G;
    }

    static float l(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.z;
    }

    private void setAnimationProgress(float f1)
    {
        if (a())
        {
            setColorViewAlpha((int)(255F * f1));
            return;
        } else
        {
            android.support.v4.view.x.d(x, f1);
            android.support.v4.view.x.e(x, f1);
            return;
        }
    }

    private void setColorViewAlpha(int i1)
    {
        x.getBackground().setAlpha(i1);
        A.setAlpha(i1);
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
        if (y >= 0)
        {
            if (j1 == i1 - 1)
            {
                return y;
            }
            if (j1 >= y)
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

    public int getProgressCircleDiameter()
    {
        if (x != null)
        {
            return x.getMeasuredHeight();
        } else
        {
            return 0;
        }
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
        b();
        i1 = android.support.v4.view.n.a(motionevent);
        if (u && i1 == 0)
        {
            u = false;
        }
        if (isEnabled() && !u && !c() && !f) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        i1;
        JVM INSTR tableswitch 0 6: default 100
    //                   0 105
    //                   1 257
    //                   2 160
    //                   3 257
    //                   4 100
    //                   5 100
    //                   6 249;
           goto _L3 _L4 _L5 _L6 _L5 _L3 _L3 _L7
_L3:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_257;
_L9:
        return r;
_L4:
        float f1;
        a(b - x.getTop(), true);
        s = android.support.v4.view.n.b(motionevent, 0);
        r = false;
        f1 = a(motionevent, s);
        if (f1 == -1F) goto _L1; else goto _L8
_L8:
        q = f1;
          goto _L9
_L6:
        if (s == -1)
        {
            Log.e(c, "Got ACTION_MOVE event but don't have an active pointer id.");
            return false;
        }
        f1 = a(motionevent, s);
        if (f1 == -1F) goto _L1; else goto _L10
_L10:
        if (f1 - q > (float)g && !r)
        {
            p = q + (float)g;
            r = true;
            A.setAlpha(76);
        }
          goto _L9
_L7:
        a(motionevent);
          goto _L9
        r = false;
        s = -1;
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
                b();
            }
            if (d != null)
            {
                View view = d;
                k1 = getPaddingLeft();
                l1 = getPaddingTop();
                view.layout(k1, l1, (i1 - getPaddingLeft() - getPaddingRight()) + k1, (j1 - getPaddingTop() - getPaddingBottom()) + l1);
                j1 = x.getMeasuredWidth();
                k1 = x.getMeasuredHeight();
                x.layout(i1 / 2 - j1 / 2, n, i1 / 2 + j1 / 2, n + k1);
                return;
            }
        }
    }

    public void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        if (d == null)
        {
            b();
        }
        if (d != null)
        {
            d.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 0x40000000));
            x.measure(android.view.View.MeasureSpec.makeMeasureSpec(I, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(J, 0x40000000));
            if (!K && !o)
            {
                o = true;
                i1 = -x.getMeasuredHeight();
                b = i1;
                n = i1;
            }
            y = -1;
            i1 = 0;
            while (i1 < getChildCount()) 
            {
                if (getChildAt(i1) == x)
                {
                    y = i1;
                    return;
                }
                i1++;
            }
        }
    }

    public boolean onNestedFling(View view, float f1, float f2, boolean flag)
    {
        return false;
    }

    public boolean onNestedPreFling(View view, float f1, float f2)
    {
        return false;
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
        if (isEnabled() && (i1 & 2) != 0)
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
        int i1;
        i1 = android.support.v4.view.n.a(motionevent);
        if (u && i1 == 0)
        {
            u = false;
        }
        if (isEnabled() && !u && !c()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        i1;
        JVM INSTR tableswitch 0 6: default 92
    //                   0 94
    //                   1 198
    //                   2 111
    //                   3 198
    //                   4 92
    //                   5 175
    //                   6 190;
           goto _L3 _L4 _L5 _L6 _L5 _L3 _L7 _L8
_L3:
        return true;
_L4:
        s = android.support.v4.view.n.b(motionevent, 0);
        r = false;
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = android.support.v4.view.n.a(motionevent, s);
        if (i1 < 0)
        {
            Log.e(c, "Got ACTION_MOVE event but have an invalid active pointer id.");
            return false;
        }
        float f1 = (android.support.v4.view.n.d(motionevent, i1) - p) * 0.5F;
        if (r)
        {
            if (f1 <= 0.0F)
            {
                continue; /* Loop/switch isn't completed */
            }
            a(f1);
        }
        continue; /* Loop/switch isn't completed */
_L7:
        s = android.support.v4.view.n.b(motionevent, android.support.v4.view.n.b(motionevent));
        continue; /* Loop/switch isn't completed */
_L8:
        a(motionevent);
        if (true) goto _L3; else goto _L5
_L5:
        if (s == -1)
        {
            if (i1 == 1)
            {
                Log.e(c, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
        } else
        {
            float f2 = android.support.v4.view.n.d(motionevent, android.support.v4.view.n.a(motionevent, s));
            float f3 = p;
            r = false;
            b((f2 - f3) * 0.5F);
            s = -1;
            return false;
        }
        if (true) goto _L1; else goto _L9
_L9:
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        if ((android.os.Build.VERSION.SDK_INT >= 21 || !(d instanceof AbsListView)) && (d == null || android.support.v4.view.x.C(d)))
        {
            super.requestDisallowInterceptTouchEvent(flag);
        }
    }

    public transient void setColorScheme(int ai[])
    {
        setColorSchemeResources(ai);
    }

    public transient void setColorSchemeColors(int ai[])
    {
        b();
        m m1 = A;
        m1.a.a(ai);
        m1.a.a(0);
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
        h = i1;
    }

    public void setNestedScrollingEnabled(boolean flag)
    {
        k.a(flag);
    }

    public void setOnRefreshListener(a a1)
    {
        e = a1;
    }

    public void setProgressBackgroundColor(int i1)
    {
        setProgressBackgroundColorSchemeResource(i1);
    }

    public void setProgressBackgroundColorSchemeColor(int i1)
    {
        x.setBackgroundColor(i1);
        A.b(i1);
    }

    public void setProgressBackgroundColorSchemeResource(int i1)
    {
        setProgressBackgroundColorSchemeColor(getResources().getColor(i1));
    }

    public void setRefreshing(boolean flag)
    {
        if (flag && f != flag)
        {
            f = flag;
            android.view.animation.Animation.AnimationListener animationlistener;
            int i1;
            if (!K)
            {
                i1 = (int)(G + (float)b);
            } else
            {
                i1 = (int)G;
            }
            a(i1 - n, true);
            H = false;
            animationlistener = L;
            x.setVisibility(0);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                A.setAlpha(255);
            }
            B = new Animation() {

                final SwipeRefreshLayout a;

                public final void applyTransformation(float f1, Transformation transformation)
                {
                    SwipeRefreshLayout.a(a, f1);
                }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
            };
            B.setDuration(m);
            if (animationlistener != null)
            {
                x.a = animationlistener;
            }
            x.clearAnimation();
            x.startAnimation(B);
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
            I = j1;
            J = j1;
        } else
        {
            int k1 = (int)(displaymetrics.density * 40F);
            I = k1;
            J = k1;
        }
        x.setImageDrawable(null);
        A.a(i1);
        x.setImageDrawable(A);
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
