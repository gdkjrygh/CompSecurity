// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.modifiedrefresh;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;

// Referenced classes of package com.roidapp.cloudlib.sns.modifiedrefresh:
//            h, p, j, k, 
//            l, m, a, c, 
//            r, t, s, u, 
//            q, v, n, i, 
//            o, x, w

public class SwipeRefreshLayout2 extends ViewGroup
{

    private static final String e = com/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2.getSimpleName();
    private static final int y[] = {
        0x101000e
    };
    private a A;
    private int B;
    private float C;
    private c D;
    private c E;
    private Animation F;
    private Animation G;
    private Animation H;
    private Animation I;
    private Animation J;
    private Animation K;
    private Animation L;
    private Animation M;
    private Animation N;
    private float O;
    private boolean P;
    private boolean Q;
    private int R;
    private int S;
    private boolean T;
    private android.view.animation.Animation.AnimationListener U;
    private android.view.animation.Animation.AnimationListener V;
    private boolean W;
    protected int a;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private final Animation ad;
    private final Animation ae;
    private final Animation af;
    private final Animation ag;
    protected int b;
    protected int c;
    protected int d;
    private View f;
    private x g;
    private w h;
    private boolean i;
    private boolean j;
    private int k;
    private float l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private float q;
    private float r;
    private boolean s;
    private int t;
    private boolean u;
    private boolean v;
    private final DecelerateInterpolator w;
    private final DecelerateInterpolator x;
    private a z;

    public SwipeRefreshLayout2(Context context)
    {
        this(context, null);
    }

    public SwipeRefreshLayout2(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = false;
        j = false;
        l = -1F;
        p = false;
        t = -1;
        B = -1;
        U = new h(this);
        V = new p(this);
        ad = new j(this);
        ae = new k(this);
        af = new l(this);
        ag = new m(this);
        k = ViewConfiguration.get(context).getScaledTouchSlop();
        m = getResources().getInteger(0x10e0001);
        setWillNotDraw(false);
        w = new DecelerateInterpolator(2.0F);
        x = new DecelerateInterpolator(2.0F);
        context = context.obtainStyledAttributes(attributeset, y);
        setEnabled(context.getBoolean(0, true));
        context.recycle();
        context = getResources().getDisplayMetrics();
        R = (int)(((DisplayMetrics) (context)).density * 40F);
        S = (int)(((DisplayMetrics) (context)).density * 40F);
        z = new a(getContext());
        A = new a(getContext());
        D = new c(getContext(), this);
        E = new c(getContext(), this);
        D.a();
        E.a();
        z.setImageDrawable(D);
        z.setVisibility(8);
        A.setImageDrawable(E);
        A.setVisibility(8);
        addView(z);
        addView(A);
        ViewCompat.setChildrenDrawingOrderEnabled(this, true);
        O = ((DisplayMetrics) (context)).density * 64F;
        l = O;
    }

    private static float a(MotionEvent motionevent, int i1)
    {
        i1 = MotionEventCompat.findPointerIndex(motionevent, i1);
        if (i1 < 0)
        {
            return -1F;
        } else
        {
            return MotionEventCompat.getY(motionevent, i1);
        }
    }

    static int a(SwipeRefreshLayout2 swiperefreshlayout2, int i1)
    {
        swiperefreshlayout2.n = i1;
        return i1;
    }

    private void a(float f1)
    {
        if (e())
        {
            b((int)(255F * f1));
            return;
        } else
        {
            ViewCompat.setScaleX(z, f1);
            ViewCompat.setScaleY(z, f1);
            return;
        }
    }

    private void a(int i1, android.view.animation.Animation.AnimationListener animationlistener)
    {
        a = i1;
        ad.reset();
        ad.setDuration(200L);
        ad.setInterpolator(w);
        if (animationlistener != null)
        {
            z.a(animationlistener);
        }
        z.clearAnimation();
        z.startAnimation(ad);
    }

    private void a(int i1, boolean flag)
    {
        z.bringToFront();
        if (ac)
        {
            f.offsetTopAndBottom(i1);
        }
        z.offsetTopAndBottom(i1);
        n = z.getTop();
        if (flag && android.os.Build.VERSION.SDK_INT < 11)
        {
            invalidate();
        }
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = MotionEventCompat.getActionIndex(motionevent);
        if (MotionEventCompat.getPointerId(motionevent, i1) == t)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            t = MotionEventCompat.getPointerId(motionevent, i1);
        }
    }

    private void a(android.view.animation.Animation.AnimationListener animationlistener)
    {
        G = new r(this);
        G.setDuration(150L);
        z.a(animationlistener);
        z.clearAnimation();
        z.startAnimation(G);
    }

    static void a(SwipeRefreshLayout2 swiperefreshlayout2, float f1)
    {
        swiperefreshlayout2.a(f1);
    }

    static void a(SwipeRefreshLayout2 swiperefreshlayout2, int i1, boolean flag)
    {
        swiperefreshlayout2.a(i1, flag);
    }

    private void a(boolean flag, boolean flag1)
    {
label0:
        {
            if (i != flag)
            {
                P = flag1;
                f();
                i = flag;
                if (!i)
                {
                    break label0;
                }
                a(n, U);
            }
            return;
        }
        a(U);
    }

    private static boolean a(Animation animation)
    {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    static boolean a(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        return swiperefreshlayout2.i;
    }

    static int b(SwipeRefreshLayout2 swiperefreshlayout2, int i1)
    {
        swiperefreshlayout2.o = i1;
        return i1;
    }

    private Animation b(int i1, int j1)
    {
        if (u && e())
        {
            return null;
        } else
        {
            t t1 = new t(this, i1, j1);
            t1.setDuration(300L);
            z.a(null);
            z.clearAnimation();
            z.startAnimation(t1);
            return t1;
        }
    }

    static c b(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        return swiperefreshlayout2.D;
    }

    private void b(float f1)
    {
        if (e())
        {
            c((int)(255F * f1));
            return;
        } else
        {
            ViewCompat.setScaleX(A, f1);
            ViewCompat.setScaleY(A, f1);
            return;
        }
    }

    private void b(int i1)
    {
        z.getBackground().setAlpha(i1);
        D.setAlpha(i1);
    }

    private void b(int i1, android.view.animation.Animation.AnimationListener animationlistener)
    {
        b = i1;
        ae.reset();
        ae.setDuration(200L);
        ae.setInterpolator(x);
        if (animationlistener != null)
        {
            A.a(animationlistener);
        }
        A.clearAnimation();
        A.startAnimation(ae);
    }

    private void b(int i1, boolean flag)
    {
        A.bringToFront();
        f.offsetTopAndBottom(i1);
        A.offsetTopAndBottom(i1);
        o = A.getTop() - getHeight();
        if (flag && android.os.Build.VERSION.SDK_INT < 11)
        {
            invalidate();
        }
    }

    private void b(android.view.animation.Animation.AnimationListener animationlistener)
    {
        H = new s(this);
        H.setDuration(150L);
        A.a(animationlistener);
        A.clearAnimation();
        A.startAnimation(H);
    }

    static void b(SwipeRefreshLayout2 swiperefreshlayout2, float f1)
    {
        swiperefreshlayout2.b(f1);
    }

    static void b(SwipeRefreshLayout2 swiperefreshlayout2, int i1, boolean flag)
    {
        swiperefreshlayout2.b(i1, flag);
    }

    private void b(boolean flag, boolean flag1)
    {
label0:
        {
            if (j != flag)
            {
                Q = flag1;
                f();
                j = flag;
                if (!j)
                {
                    break label0;
                }
                b(o, V);
            }
            return;
        }
        b(V);
    }

    private Animation c(int i1, int j1)
    {
        if (u && e())
        {
            return null;
        } else
        {
            u u1 = new u(this, i1, j1);
            u1.setDuration(300L);
            A.a(null);
            A.clearAnimation();
            A.startAnimation(u1);
            return u1;
        }
    }

    private void c(int i1)
    {
        A.getBackground().setAlpha(i1);
        E.setAlpha(i1);
    }

    static void c(SwipeRefreshLayout2 swiperefreshlayout2, float f1)
    {
        swiperefreshlayout2.a((swiperefreshlayout2.a + (int)((float)(swiperefreshlayout2.c - swiperefreshlayout2.a) * f1)) - swiperefreshlayout2.z.getTop(), false);
    }

    static boolean c(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        return swiperefreshlayout2.P;
    }

    static void d(SwipeRefreshLayout2 swiperefreshlayout2, float f1)
    {
        swiperefreshlayout2.b((swiperefreshlayout2.b + (int)((float)(swiperefreshlayout2.d - swiperefreshlayout2.b) * f1)) - (swiperefreshlayout2.A.getTop() - swiperefreshlayout2.getHeight()), false);
    }

    static boolean d(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        swiperefreshlayout2.P = false;
        return false;
    }

    static x e(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        return swiperefreshlayout2.g;
    }

    private static boolean e()
    {
        return android.os.Build.VERSION.SDK_INT < 11;
    }

    static a f(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        return swiperefreshlayout2.z;
    }

    private void f()
    {
        if (f != null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L7:
        if (i1 >= getChildCount()) goto _L2; else goto _L3
_L3:
        View view = getChildAt(i1);
        if (view.equals(z) || view.equals(A)) goto _L5; else goto _L4
_L4:
        f = view;
_L2:
        return;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static void g(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        swiperefreshlayout2.b(255);
    }

    private boolean g()
    {
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            if (f instanceof AbsListView)
            {
                AbsListView abslistview = (AbsListView)f;
                return abslistview.getChildCount() > 0 && (abslistview.getFirstVisiblePosition() > 0 || abslistview.getChildAt(0).getTop() < abslistview.getPaddingTop());
            }
            return ViewCompat.canScrollVertically(f, -1) || f.getScrollY() > 0;
        } else
        {
            return ViewCompat.canScrollVertically(f, -1);
        }
    }

    private boolean h()
    {
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            if (f instanceof AbsListView)
            {
                AbsListView abslistview = (AbsListView)f;
                return abslistview.getChildCount() > 0 && (abslistview.getLastVisiblePosition() + 1 != abslistview.getCount() || abslistview.getChildAt(abslistview.getLastVisiblePosition() - abslistview.getFirstVisiblePosition()).getBottom() < abslistview.getPaddingBottom());
            }
            return ViewCompat.canScrollVertically(f, 1) || f.getScrollY() < 0;
        } else
        {
            return ViewCompat.canScrollVertically(f, 1);
        }
    }

    static boolean h(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        return swiperefreshlayout2.u;
    }

    static int i(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        return swiperefreshlayout2.n;
    }

    static boolean j(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        return swiperefreshlayout2.j;
    }

    static c k(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        return swiperefreshlayout2.E;
    }

    static boolean l(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        return swiperefreshlayout2.Q;
    }

    static boolean m(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        swiperefreshlayout2.Q = false;
        return false;
    }

    static w n(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        return swiperefreshlayout2.h;
    }

    static a o(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        return swiperefreshlayout2.A;
    }

    static void p(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        swiperefreshlayout2.c(255);
    }

    static void q(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        swiperefreshlayout2.a(((android.view.animation.Animation.AnimationListener) (null)));
    }

    static void r(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        swiperefreshlayout2.b(((android.view.animation.Animation.AnimationListener) (null)));
    }

    static boolean s(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        return swiperefreshlayout2.T;
    }

    static float t(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        return swiperefreshlayout2.O;
    }

    static float u(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        return swiperefreshlayout2.C;
    }

    public final void a()
    {
        b(false, false);
    }

    public final void a(int i1)
    {
        o = i1;
        d = i1;
    }

    public final void a(int i1, int j1)
    {
        u = false;
        z.setVisibility(8);
        n = i1;
        c = i1;
        O = j1;
        l = j1;
        T = true;
        z.invalidate();
    }

    public final void a(w w1)
    {
        h = w1;
    }

    public final void a(x x1)
    {
        g = x1;
    }

    public final void a(boolean flag)
    {
        if (flag && i != flag)
        {
            i = flag;
            android.view.animation.Animation.AnimationListener animationlistener;
            int i1;
            if (!T)
            {
                i1 = (int)(O + (float)c);
            } else
            {
                i1 = (int)O;
            }
            a(i1 - n, true);
            P = false;
            animationlistener = U;
            z.setVisibility(0);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                D.setAlpha(255);
            }
            F = new q(this);
            F.setDuration(m);
            if (animationlistener != null)
            {
                z.a(animationlistener);
            }
            z.clearAnimation();
            z.startAnimation(F);
            return;
        } else
        {
            a(flag, false);
            return;
        }
    }

    public final transient void a(int ai[])
    {
        f();
        D.a(ai);
        E.a(ai);
    }

    public final void b(boolean flag)
    {
        ab = flag;
    }

    public final boolean b()
    {
        return i;
    }

    public final void c(boolean flag)
    {
        ac = flag;
    }

    public final boolean c()
    {
        return j;
    }

    public final int d()
    {
        return o - d;
    }

    protected int getChildDrawingOrder(int i1, int j1)
    {
        if (B >= 0)
        {
            if (j1 == i1 - 1)
            {
                return B;
            }
            if (j1 >= B)
            {
                return j1 + 1;
            }
        }
        return j1;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (isEnabled()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        boolean flag;
        boolean flag1;
        f();
        int i1 = MotionEventCompat.getActionMasked(motionevent);
        if (v && i1 == 0)
        {
            v = false;
        }
        if (i && !ac || g())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i && !ac || !ab || h())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (v || flag1 && flag) goto _L1; else goto _L3
_L3:
        i1;
        JVM INSTR tableswitch 0 6: default 152
    //                   0 168
    //                   1 534
    //                   2 267
    //                   3 534
    //                   4 152
    //                   5 152
    //                   6 526;
           goto _L4 _L5 _L6 _L7 _L6 _L4 _L4 _L8
_L4:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_534;
_L10:
        return s;
_L5:
        float f1;
        t = MotionEventCompat.getPointerId(motionevent, 0);
        s = false;
        f1 = a(motionevent, t);
        if (f1 == -1F) goto _L1; else goto _L9
_L9:
        if (i || j)
        {
            q = f1;
        } else
        {
            a(c - z.getTop(), true);
            b((d + getHeight()) - A.getTop(), true);
        }
        r = f1;
          goto _L10
_L7:
        if (t == -1)
        {
            Log.e(e, "Got ACTION_MOVE event but don't have an active pointer id.");
            return false;
        }
        f1 = a(motionevent, t);
        if (f1 == -1F) goto _L1; else goto _L11
_L11:
        if (!flag)
        {
            if (f1 - r > (float)k && !s)
            {
                q = f1;
                W = true;
                s = true;
                D.setAlpha(76);
            } else
            if (i)
            {
                if (n > c)
                {
                    a((int)(f1 - q), true);
                    q = f1;
                    return false;
                }
                a(c - z.getTop(), true);
            }
        }
        if (!flag1)
        {
            if (r - f1 > (float)k && !s)
            {
                q = f1;
                aa = true;
                s = true;
                E.setAlpha(76);
            } else
            if (j)
            {
                if (o < d)
                {
                    b((int)(f1 - q), true);
                    q = f1;
                    return false;
                }
                b((d + getHeight()) - A.getTop(), true);
            }
        }
          goto _L10
_L8:
        a(motionevent);
          goto _L10
        W = false;
        aa = false;
        s = false;
        t = -1;
          goto _L10
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        j1 = 0;
        k1 = getMeasuredWidth();
        i1 = getMeasuredHeight();
        if (getChildCount() != 0)
        {
            if (f == null)
            {
                f();
            }
            if (f != null)
            {
                Object obj = f;
                int i2 = getPaddingLeft();
                int j2 = getPaddingTop();
                int k2 = getPaddingLeft();
                int l2 = getPaddingRight();
                l1 = i1 - getPaddingTop() - getPaddingBottom();
                if (ac)
                {
                    i1 = n;
                } else
                {
                    i1 = 0;
                }
                if (ac)
                {
                    j1 = c;
                }
                ((View) (obj)).layout(i2, (((j2 + i1) - j1) + o) - d, (k1 - k2 - l2) + i2, (((i1 + (j2 + l1)) - j1) + o) - d);
                i1 = z.getMeasuredWidth();
                j1 = z.getMeasuredHeight();
                z.layout(k1 / 2 - i1 / 2, n, k1 / 2 + i1 / 2, n + j1);
                obj = A;
                i2 = k1 / 2;
                j2 = i1 / 2;
                k2 = o;
                k1 /= 2;
                ((a) (obj)).layout(i2 - j2, k2 + l1, i1 / 2 + k1, j1 + (o + l1));
                return;
            }
        }
    }

    public void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        if (f == null)
        {
            f();
        }
        if (f != null)
        {
            f.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 0x40000000));
            z.measure(android.view.View.MeasureSpec.makeMeasureSpec(R, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(S, 0x40000000));
            if (!T && !p)
            {
                p = true;
                i1 = -z.getMeasuredHeight();
                c = i1;
                n = i1;
            }
            B = -1;
            i1 = 0;
            while (i1 < getChildCount()) 
            {
                if (getChildAt(i1) == z)
                {
                    B = i1;
                    return;
                }
                i1++;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1 = MotionEventCompat.getActionMasked(motionevent);
        if (!v || i1 != 0)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        v = false;
        boolean flag;
        boolean flag1;
        flag = g();
        flag1 = h();
        if (!isEnabled() || v) goto _L2; else goto _L1
_L1:
        if (flag1 && flag)
        {
            return false;
        }
          goto _L3
_L57:
        try
        {
            t = MotionEventCompat.getPointerId(motionevent, 0);
            s = false;
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            motionevent.printStackTrace();
            return true;
        }
          goto _L4
_L59:
        i1 = MotionEventCompat.findPointerIndex(motionevent, t);
        if (i1 >= 0)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        Log.e(e, "Got ACTION_MOVE event but have an invalid active pointer id.");
        return false;
        float f2 = (MotionEventCompat.getY(motionevent, i1) - q) * 0.5F;
        if (!s) goto _L4; else goto _L5
_L5:
        if (!W) goto _L7; else goto _L6
_L6:
        float f1;
        D.a(true);
        f1 = f2 / l;
        if (f1 < 0.0F) goto _L2; else goto _L8
_L8:
        float f3;
        float f4;
        float f5;
        float f6;
        f3 = Math.min(1.0F, Math.abs(f1));
        f4 = ((float)Math.max((double)f3 - 0.40000000000000002D, 0.0D) * 5F) / 3F;
        f5 = Math.abs(f2);
        f6 = l;
        if (!T) goto _L10; else goto _L9
_L9:
        f1 = O - (float)c;
_L15:
        f5 = Math.max(0.0F, Math.min(f5 - f6, f1 * 2.0F) / f1);
        f5 = (float)((double)(f5 / 4F) - Math.pow(f5 / 4F, 2D)) * 2.0F;
        i1 = c;
        int j1 = (int)(f1 * f3 + f1 * f5 * 2.0F);
        if (i) goto _L12; else goto _L11
_L11:
        if (z.getVisibility() != 0)
        {
            z.setVisibility(0);
        }
        if (!u)
        {
            ViewCompat.setScaleX(z, 1.0F);
            ViewCompat.setScaleY(z, 1.0F);
        }
        if (f2 >= l) goto _L14; else goto _L13
_L13:
        if (u)
        {
            a(f2 / l);
        }
        if (D.b() > 76 && !a(I))
        {
            I = b(D.b(), 76);
        }
        D.b(Math.min(0.8F, 0.8F * f4));
        D.a(Math.min(1.0F, f4));
_L17:
        D.c((-0.25F + 0.4F * f4 + f5 * 2.0F) * 0.5F);
_L18:
        a((j1 + i1) - n, true);
          goto _L4
_L10:
        f1 = O;
          goto _L15
_L14:
        if (D.b() >= 255 || a(K)) goto _L17; else goto _L16
_L16:
        K = b(D.b(), 255);
          goto _L17
_L12:
        if (z.getVisibility() != 0)
        {
            z.setVisibility(0);
        }
        if (!u)
        {
            ViewCompat.setScaleX(z, 1.0F);
            ViewCompat.setScaleY(z, 1.0F);
        }
          goto _L18
_L7:
        if (!aa) goto _L4; else goto _L19
_L19:
        E.a(true);
        f2 = -f2;
        f1 = f2 / l;
        if (f1 < 0.0F) goto _L2; else goto _L20
_L20:
        f3 = Math.min(1.0F, Math.abs(f1));
        f4 = ((float)Math.max((double)f3 - 0.40000000000000002D, 0.0D) * 5F) / 3F;
        f5 = Math.abs(f2);
        f6 = l;
        if (!T) goto _L22; else goto _L21
_L21:
        f1 = O - (float)c;
_L27:
        f5 = Math.max(0.0F, Math.min(f5 - f6, f1 * 2.0F) / f1);
        f5 = (float)((double)(f5 / 4F) - Math.pow(f5 / 4F, 2D)) * 2.0F;
        i1 = d;
        j1 = (int)(f1 * f3 + f1 * f5 * 2.0F);
        if (j) goto _L24; else goto _L23
_L23:
        if (A.getVisibility() != 0)
        {
            A.setVisibility(0);
        }
        if (!u)
        {
            ViewCompat.setScaleX(A, 1.0F);
            ViewCompat.setScaleY(A, 1.0F);
        }
        if (f2 >= l) goto _L26; else goto _L25
_L25:
        if (u)
        {
            b(f2 / l);
        }
        if (E.b() > 76 && !a(J))
        {
            J = c(E.b(), 76);
        }
        E.b(Math.min(0.8F, 0.8F * f4));
        E.a(Math.min(1.0F, f4));
_L29:
        E.c((-0.25F + 0.4F * f4 + f5 * 2.0F) * 0.5F);
_L30:
        b(i1 - j1 - o, true);
          goto _L4
_L22:
        f1 = O;
          goto _L27
_L26:
        if (E.b() >= 255 || a(L)) goto _L29; else goto _L28
_L28:
        L = c(E.b(), 255);
          goto _L29
_L24:
        if (A.getVisibility() != 0)
        {
            A.setVisibility(0);
        }
        if (!u)
        {
            ViewCompat.setScaleX(A, 1.0F);
            ViewCompat.setScaleY(A, 1.0F);
        }
          goto _L30
_L60:
        t = MotionEventCompat.getPointerId(motionevent, MotionEventCompat.getActionIndex(motionevent));
          goto _L4
_L61:
        a(motionevent);
          goto _L4
_L58:
        if (t != -1) goto _L32; else goto _L31
_L31:
        if (i1 != 1) goto _L2; else goto _L33
_L33:
        Log.e(e, "Got ACTION_UP event but don't have an active pointer id.");
        return false;
_L32:
        f1 = (MotionEventCompat.getY(motionevent, MotionEventCompat.findPointerIndex(motionevent, t)) - q) * 0.5F;
        s = false;
        if (f1 <= l && f1 >= -l) goto _L35; else goto _L34
_L34:
        if (!W) goto _L37; else goto _L36
_L36:
        if (!i) goto _L39; else goto _L38
_L38:
        a(n, ((android.view.animation.Animation.AnimationListener) (null)));
_L40:
        W = false;
        aa = false;
        t = -1;
        return false;
_L39:
        a(true, true);
          goto _L40
_L37:
        if (!aa) goto _L40; else goto _L41
_L41:
        if (!j)
        {
            break MISSING_BLOCK_LABEL_1188;
        }
        b(o, ((android.view.animation.Animation.AnimationListener) (null)));
          goto _L40
        b(true, true);
          goto _L40
_L35:
        if (!W) goto _L43; else goto _L42
_L42:
        D.b(0.0F);
        motionevent = null;
        if (!u)
        {
            motionevent = new v(this);
        }
        i1 = n;
        if (!u) goto _L45; else goto _L44
_L44:
        a = i1;
        if (!e()) goto _L47; else goto _L46
_L46:
        C = D.b();
_L48:
        M = new n(this);
        M.setDuration(150L);
        if (motionevent == null)
        {
            break MISSING_BLOCK_LABEL_1301;
        }
        z.a(motionevent);
        z.clearAnimation();
        z.startAnimation(M);
_L49:
        D.a(false);
          goto _L40
_L47:
        C = ViewCompat.getScaleX(z);
          goto _L48
_L45:
        a = i1;
        af.reset();
        af.setDuration(200L);
        af.setInterpolator(w);
        if (motionevent == null)
        {
            break MISSING_BLOCK_LABEL_1390;
        }
        z.a(motionevent);
        z.clearAnimation();
        z.startAnimation(af);
          goto _L49
_L43:
        if (!aa) goto _L40; else goto _L50
_L50:
        E.b(0.0F);
        motionevent = null;
        if (!u)
        {
            motionevent = new i(this);
        }
        i1 = o;
        if (!u) goto _L52; else goto _L51
_L51:
        b = i1;
        if (!e()) goto _L54; else goto _L53
_L53:
        C = E.b();
_L55:
        N = new o(this);
        N.setDuration(150L);
        if (motionevent == null)
        {
            break MISSING_BLOCK_LABEL_1515;
        }
        A.a(motionevent);
        A.clearAnimation();
        A.startAnimation(N);
_L56:
        E.a(false);
          goto _L40
_L54:
        C = ViewCompat.getScaleX(A);
          goto _L55
_L52:
        b = i1;
        ag.reset();
        ag.setDuration(200L);
        ag.setInterpolator(x);
        if (motionevent == null)
        {
            break MISSING_BLOCK_LABEL_1604;
        }
        A.a(motionevent);
        A.clearAnimation();
        A.startAnimation(ag);
          goto _L56
_L2:
        return false;
_L3:
        i1;
        JVM INSTR tableswitch 0 6: default 1672
    //                   0 61
    //                   1 1041
    //                   2 85
    //                   3 1041
    //                   4 1672
    //                   5 1018
    //                   6 1033;
           goto _L4 _L57 _L58 _L59 _L58 _L4 _L60 _L61
_L4:
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
    }

}
