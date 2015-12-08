// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.at;
import android.support.v4.view.az;
import android.support.v4.view.ba;
import android.support.v4.view.bb;
import android.support.v4.view.bc;
import android.support.v4.view.bt;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;

// Referenced classes of package android.support.v4.widget:
//            bu, bz, ca, cb, 
//            CircleImageView, al, bx, bw, 
//            ap, by, cc, bv, 
//            cd

public class SwipeRefreshLayout extends ViewGroup
    implements az, bb
{

    private static final String c = android/support/v4/widget/SwipeRefreshLayout.getSimpleName();
    private static final int w[] = {
        0x101000e
    };
    private al A;
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
    private android.view.animation.Animation.AnimationListener L;
    private final Animation M = new bz(this);
    private final Animation N = new ca(this);
    private final Animation O = new cb(this);
    public int a;
    public int b;
    private View d;
    private cd e;
    private boolean f;
    private int g;
    private float h;
    private float i;
    private final bc j = new bc(this);
    private final ba k = new ba(this);
    private final int l[] = new int[2];
    private int m;
    private int n;
    private boolean o;
    private float p;
    private float q;
    private boolean r;
    private int s;
    private boolean t;
    private boolean u;
    private final DecelerateInterpolator v = new DecelerateInterpolator(2.0F);
    private CircleImageView x;
    private int y;
    private float z;

    public SwipeRefreshLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = false;
        h = -1F;
        o = false;
        s = -1;
        y = -1;
        L = new bu(this);
        g = ViewConfiguration.get(context).getScaledTouchSlop();
        m = getResources().getInteger(0x10e0001);
        setWillNotDraw(false);
        context = context.obtainStyledAttributes(attributeset, w);
        setEnabled(context.getBoolean(0, true));
        context.recycle();
        context = getResources().getDisplayMetrics();
        I = (int)(((DisplayMetrics) (context)).density * 40F);
        J = (int)(((DisplayMetrics) (context)).density * 40F);
        x = new CircleImageView(getContext());
        A = new al(getContext(), this);
        A.b(0xfffafafa);
        x.setImageDrawable(A);
        x.setVisibility(8);
        addView(x);
        bt.a(this);
        G = ((DisplayMetrics) (context)).density * 64F;
        h = G;
        setNestedScrollingEnabled(true);
    }

    private static float a(MotionEvent motionevent, int i1)
    {
        i1 = at.a(motionevent, i1);
        if (i1 < 0)
        {
            return -1F;
        } else
        {
            return at.d(motionevent, i1);
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
            bx bx1 = new bx(this, i1, j1);
            bx1.setDuration(300L);
            x.setAnimationListener(null);
            x.clearAnimation();
            x.startAnimation(bx1);
            return bx1;
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
            bt.c(x, f1);
            bt.d(x, f1);
            return;
        }
    }

    private void a(int i1)
    {
        x.getBackground().setAlpha(i1);
        A.setAlpha(i1);
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
        swiperefreshlayout.a(f1);
    }

    static void a(SwipeRefreshLayout swiperefreshlayout, int i1, boolean flag)
    {
        swiperefreshlayout.a(i1, flag);
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = at.b(motionevent);
        if (at.b(motionevent, i1) == s)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            s = at.b(motionevent, i1);
        }
    }

    private void a(android.view.animation.Animation.AnimationListener animationlistener)
    {
        C = new bw(this);
        C.setDuration(150L);
        x.setAnimationListener(animationlistener);
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
                    x.setAnimationListener(animationlistener);
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

    static al b(SwipeRefreshLayout swiperefreshlayout)
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
            bt.c(x, 1.0F);
            bt.d(x, 1.0F);
        }
        if (f1 >= h) goto _L2; else goto _L1
_L1:
        if (t)
        {
            a(f1 / h);
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

    static void b(SwipeRefreshLayout swiperefreshlayout, float f1)
    {
        swiperefreshlayout.a((swiperefreshlayout.a + (int)((float)(swiperefreshlayout.b - swiperefreshlayout.a) * f1)) - swiperefreshlayout.x.getTop(), false);
    }

    private void c(float f1)
    {
        if (f1 > h)
        {
            a(true, true);
            return;
        }
        f = false;
        A.b(0.0F);
        by by1 = null;
        if (!t)
        {
            by1 = new by(this);
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
                z = bt.m(x);
            }
            F = new cc(this);
            F.setDuration(150L);
            if (by1 != null)
            {
                x.setAnimationListener(by1);
            }
            x.clearAnimation();
            x.startAnimation(F);
        } else
        {
            a = i1;
            O.reset();
            O.setDuration(200L);
            O.setInterpolator(v);
            if (by1 != null)
            {
                x.setAnimationListener(by1);
            }
            x.clearAnimation();
            x.startAnimation(O);
        }
        A.a(false);
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
            return bt.b(d, -1) || d.getScrollY() > 0;
        } else
        {
            return bt.b(d, -1);
        }
    }

    static boolean c(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.H;
    }

    static cd d(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.e;
    }

    static CircleImageView e(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.x;
    }

    static void f(SwipeRefreshLayout swiperefreshlayout)
    {
        swiperefreshlayout.a(255);
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
        i1 = at.a(motionevent);
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
    //                   1 245
    //                   2 160
    //                   3 245
    //                   4 100
    //                   5 100
    //                   6 237;
           goto _L3 _L4 _L5 _L6 _L5 _L3 _L3 _L7
_L3:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_245;
_L9:
        return r;
_L4:
        float f1;
        a(b - x.getTop(), true);
        s = at.b(motionevent, 0);
        r = false;
        f1 = a(motionevent, s);
        if (f1 == -1F) goto _L1; else goto _L8
_L8:
        q = f1;
          goto _L9
_L6:
        if (s == -1) goto _L1; else goto _L10
_L10:
        f1 = a(motionevent, s);
        if (f1 == -1F) goto _L1; else goto _L11
_L11:
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
            b(i);
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
            b(i);
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
            c(i);
            i = 0.0F;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        i1 = at.a(motionevent);
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
    //                   1 186
    //                   2 111
    //                   3 186
    //                   4 92
    //                   5 163
    //                   6 178;
           goto _L3 _L4 _L5 _L6 _L5 _L3 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_178;
_L3:
        break; /* Loop/switch isn't completed */
_L5:
        continue; /* Loop/switch isn't completed */
_L9:
        return true;
_L4:
        s = at.b(motionevent, 0);
        r = false;
          goto _L9
_L6:
        i1 = at.a(motionevent, s);
        if (i1 < 0) goto _L1; else goto _L10
_L10:
        float f1 = (at.d(motionevent, i1) - p) * 0.5F;
        if (!r) goto _L9; else goto _L11
_L11:
        if (f1 <= 0.0F) goto _L1; else goto _L12
_L12:
        b(f1);
          goto _L9
_L7:
        s = at.b(motionevent, at.b(motionevent));
          goto _L9
        a(motionevent);
          goto _L9
        if (s == -1) goto _L1; else goto _L13
_L13:
        float f2 = at.d(motionevent, at.a(motionevent, s));
        float f3 = p;
        r = false;
        c((f2 - f3) * 0.5F);
        s = -1;
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        if ((android.os.Build.VERSION.SDK_INT >= 21 || !(d instanceof AbsListView)) && (d == null || bt.u(d)))
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
        al al1 = A;
        al1.a.a(ai);
        al1.a.a(0);
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

    public void setOnRefreshListener(cd cd)
    {
        e = cd;
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

    public void setProgressViewEndTarget(boolean flag, int i1)
    {
        G = i1;
        t = flag;
        x.invalidate();
    }

    public void setProgressViewOffset(boolean flag, int i1, int j1)
    {
        t = flag;
        x.setVisibility(8);
        n = i1;
        b = i1;
        G = j1;
        K = true;
        x.invalidate();
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
            B = new bv(this);
            B.setDuration(m);
            if (animationlistener != null)
            {
                x.setAnimationListener(animationlistener);
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
