// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.n;
import android.support.v4.view.t;
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
//            a, h

public class SwipeRefreshLayout extends ViewGroup
{
    public static interface a
    {

        public abstract void a();
    }


    private static final String c = android/support/v4/widget/SwipeRefreshLayout.getSimpleName();
    private static final int s[] = {
        0x101000e
    };
    private Animation A;
    private Animation B;
    private float C;
    private boolean D;
    private int E;
    private int F;
    private boolean G;
    private android.view.animation.Animation.AnimationListener H = new android.view.animation.Animation.AnimationListener() {

        final SwipeRefreshLayout a;

        public void onAnimationEnd(Animation animation)
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
                SwipeRefreshLayout.a(a, 255);
                if (SwipeRefreshLayout.f(a))
                {
                    SwipeRefreshLayout.a(a, 0.0F);
                } else
                {
                    SwipeRefreshLayout.a(a, a.b - SwipeRefreshLayout.g(a), true);
                }
            }
            SwipeRefreshLayout.b(a, SwipeRefreshLayout.e(a).getTop());
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
    };
    private final Animation I;
    private final Animation J;
    protected int a;
    protected int b;
    private View d;
    private a e;
    private boolean f;
    private int g;
    private float h;
    private int i;
    private int j;
    private boolean k;
    private float l;
    private float m;
    private boolean n;
    private int o;
    private boolean p;
    private boolean q;
    private final DecelerateInterpolator r;
    private android.support.v4.widget.a t;
    private int u;
    private float v;
    private h w;
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
        k = false;
        o = -1;
        u = -1;
        I = new Animation() {

            final SwipeRefreshLayout a;

            public void applyTransformation(float f1, Transformation transformation)
            {
                int i1;
                int j1;
                int k1;
                if (!SwipeRefreshLayout.h(a))
                {
                    i1 = (int)(SwipeRefreshLayout.i(a) - (float)Math.abs(a.b));
                } else
                {
                    i1 = (int)SwipeRefreshLayout.i(a);
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
        J = new Animation() {

            final SwipeRefreshLayout a;

            public void applyTransformation(float f1, Transformation transformation)
            {
                SwipeRefreshLayout.b(a, f1);
            }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
        };
        g = ViewConfiguration.get(context).getScaledTouchSlop();
        i = getResources().getInteger(0x10e0001);
        setWillNotDraw(false);
        r = new DecelerateInterpolator(2.0F);
        context = context.obtainStyledAttributes(attributeset, s);
        setEnabled(context.getBoolean(0, true));
        context.recycle();
        context = getResources().getDisplayMetrics();
        E = (int)(((DisplayMetrics) (context)).density * 40F);
        F = (int)(((DisplayMetrics) (context)).density * 40F);
        b();
        android.support.v4.view.t.a(this, true);
        C = ((DisplayMetrics) (context)).density * 64F;
        h = C;
    }

    private float a(MotionEvent motionevent, int i1)
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

    private Animation a(int i1, int j1)
    {
        if (p && c())
        {
            return null;
        } else
        {
            Animation animation = new Animation(i1, j1) {

                final int a;
                final int b;
                final SwipeRefreshLayout c;

                public void applyTransformation(float f1, Transformation transformation)
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
            t.a(null);
            t.clearAnimation();
            t.startAnimation(animation);
            return animation;
        }
    }

    private void a(float f1)
    {
        a((a + (int)((float)(b - a) * f1)) - t.getTop(), false);
    }

    private void a(int i1, android.view.animation.Animation.AnimationListener animationlistener)
    {
        a = i1;
        I.reset();
        I.setDuration(200L);
        I.setInterpolator(r);
        if (animationlistener != null)
        {
            t.a(animationlistener);
        }
        t.clearAnimation();
        t.startAnimation(I);
    }

    private void a(int i1, boolean flag)
    {
        t.bringToFront();
        t.offsetTopAndBottom(i1);
        j = t.getTop();
        if (flag && android.os.Build.VERSION.SDK_INT < 11)
        {
            invalidate();
        }
    }

    static void a(SwipeRefreshLayout swiperefreshlayout, float f1)
    {
        swiperefreshlayout.setAnimationProgress(f1);
    }

    static void a(SwipeRefreshLayout swiperefreshlayout, int i1)
    {
        swiperefreshlayout.setColorViewAlpha(i1);
    }

    static void a(SwipeRefreshLayout swiperefreshlayout, int i1, boolean flag)
    {
        swiperefreshlayout.a(i1, flag);
    }

    static void a(SwipeRefreshLayout swiperefreshlayout, android.view.animation.Animation.AnimationListener animationlistener)
    {
        swiperefreshlayout.b(animationlistener);
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = android.support.v4.view.n.b(motionevent);
        if (android.support.v4.view.n.b(motionevent, i1) == o)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            o = android.support.v4.view.n.b(motionevent, i1);
        }
    }

    private void a(android.view.animation.Animation.AnimationListener animationlistener)
    {
        t.setVisibility(0);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            w.setAlpha(255);
        }
        x = new Animation() {

            final SwipeRefreshLayout a;

            public void applyTransformation(float f1, Transformation transformation)
            {
                SwipeRefreshLayout.a(a, f1);
            }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
        };
        x.setDuration(i);
        if (animationlistener != null)
        {
            t.a(animationlistener);
        }
        t.clearAnimation();
        t.startAnimation(x);
    }

    private void a(boolean flag, boolean flag1)
    {
label0:
        {
            if (f != flag)
            {
                D = flag1;
                f();
                f = flag;
                if (!f)
                {
                    break label0;
                }
                a(j, H);
            }
            return;
        }
        b(H);
    }

    static boolean a(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.f;
    }

    private boolean a(Animation animation)
    {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    static int b(SwipeRefreshLayout swiperefreshlayout, int i1)
    {
        swiperefreshlayout.j = i1;
        return i1;
    }

    static h b(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.w;
    }

    private void b()
    {
        t = new android.support.v4.widget.a(getContext(), 0xfffafafa, 20F);
        w = new h(getContext(), this);
        w.b(0xfffafafa);
        t.setImageDrawable(w);
        t.setVisibility(8);
        addView(t);
    }

    private void b(int i1, android.view.animation.Animation.AnimationListener animationlistener)
    {
        if (p)
        {
            c(i1, animationlistener);
            return;
        }
        a = i1;
        J.reset();
        J.setDuration(200L);
        J.setInterpolator(r);
        if (animationlistener != null)
        {
            t.a(animationlistener);
        }
        t.clearAnimation();
        t.startAnimation(J);
    }

    static void b(SwipeRefreshLayout swiperefreshlayout, float f1)
    {
        swiperefreshlayout.a(f1);
    }

    private void b(android.view.animation.Animation.AnimationListener animationlistener)
    {
        y = new Animation() {

            final SwipeRefreshLayout a;

            public void applyTransformation(float f1, Transformation transformation)
            {
                SwipeRefreshLayout.a(a, 1.0F - f1);
            }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
        };
        y.setDuration(150L);
        t.a(animationlistener);
        t.clearAnimation();
        t.startAnimation(y);
    }

    private void c(int i1, android.view.animation.Animation.AnimationListener animationlistener)
    {
        a = i1;
        if (c())
        {
            v = w.getAlpha();
        } else
        {
            v = android.support.v4.view.t.h(t);
        }
        B = new Animation() {

            final SwipeRefreshLayout a;

            public void applyTransformation(float f1, Transformation transformation)
            {
                float f2 = SwipeRefreshLayout.j(a);
                float f3 = -SwipeRefreshLayout.j(a);
                SwipeRefreshLayout.a(a, f2 + f3 * f1);
                SwipeRefreshLayout.b(a, f1);
            }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
        };
        B.setDuration(150L);
        if (animationlistener != null)
        {
            t.a(animationlistener);
        }
        t.clearAnimation();
        t.startAnimation(B);
    }

    private boolean c()
    {
        return android.os.Build.VERSION.SDK_INT < 11;
    }

    static boolean c(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.D;
    }

    static a d(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.e;
    }

    private void d()
    {
        z = a(w.getAlpha(), 76);
    }

    static android.support.v4.widget.a e(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.t;
    }

    private void e()
    {
        A = a(w.getAlpha(), 255);
    }

    private void f()
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L7:
        if (i1 >= getChildCount()) goto _L2; else goto _L3
_L3:
        View view = getChildAt(i1);
        if (view.equals(t)) goto _L5; else goto _L4
_L4:
        d = view;
_L2:
        return;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static boolean f(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.p;
    }

    static int g(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.j;
    }

    static boolean h(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.G;
    }

    static float i(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.C;
    }

    static float j(SwipeRefreshLayout swiperefreshlayout)
    {
        return swiperefreshlayout.v;
    }

    private void setAnimationProgress(float f1)
    {
        if (c())
        {
            setColorViewAlpha((int)(255F * f1));
            return;
        } else
        {
            android.support.v4.view.t.a(t, f1);
            android.support.v4.view.t.b(t, f1);
            return;
        }
    }

    private void setColorViewAlpha(int i1)
    {
        t.getBackground().setAlpha(i1);
        w.setAlpha(i1);
    }

    public boolean a()
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            if (d instanceof AbsListView)
            {
                AbsListView abslistview = (AbsListView)d;
                return abslistview.getChildCount() > 0 && (abslistview.getFirstVisiblePosition() > 0 || abslistview.getChildAt(0).getTop() < abslistview.getPaddingTop());
            }
            if (d.getScrollY() <= 0)
            {
                flag = false;
            }
            return flag;
        } else
        {
            return android.support.v4.view.t.b(d, -1);
        }
    }

    protected int getChildDrawingOrder(int i1, int j1)
    {
        if (u >= 0)
        {
            if (j1 == i1 - 1)
            {
                return u;
            }
            if (j1 >= u)
            {
                return j1 + 1;
            }
        }
        return j1;
    }

    public int getProgressCircleDiameter()
    {
        if (t != null)
        {
            return t.getMeasuredHeight();
        } else
        {
            return 0;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        f();
        i1 = android.support.v4.view.n.a(motionevent);
        if (q && i1 == 0)
        {
            q = false;
        }
        if (isEnabled() && !q && !a() && !f) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        i1;
        JVM INSTR tableswitch 0 6: default 100
    //                   0 105
    //                   1 259
    //                   2 161
    //                   3 259
    //                   4 100
    //                   5 100
    //                   6 251;
           goto _L3 _L4 _L5 _L6 _L5 _L3 _L3 _L7
_L3:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_259;
_L9:
        return n;
_L4:
        float f1;
        a(b - t.getTop(), true);
        o = android.support.v4.view.n.b(motionevent, 0);
        n = false;
        f1 = a(motionevent, o);
        if (f1 == -1F) goto _L1; else goto _L8
_L8:
        m = f1;
          goto _L9
_L6:
        if (o == -1)
        {
            Log.e(c, "Got ACTION_MOVE event but don't have an active pointer id.");
            return false;
        }
        f1 = a(motionevent, o);
        if (f1 == -1F) goto _L1; else goto _L10
_L10:
        if (f1 - m > (float)g && !n)
        {
            l = m + (float)g;
            n = true;
            w.setAlpha(76);
        }
          goto _L9
_L7:
        a(motionevent);
          goto _L9
        n = false;
        o = -1;
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
                f();
            }
            if (d != null)
            {
                View view = d;
                k1 = getPaddingLeft();
                l1 = getPaddingTop();
                view.layout(k1, l1, (i1 - getPaddingLeft() - getPaddingRight()) + k1, (j1 - getPaddingTop() - getPaddingBottom()) + l1);
                j1 = t.getMeasuredWidth();
                k1 = t.getMeasuredHeight();
                t.layout(i1 / 2 - j1 / 2, j, i1 / 2 + j1 / 2, j + k1);
                return;
            }
        }
    }

    public void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        if (d == null)
        {
            f();
        }
        if (d != null)
        {
            d.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 0x40000000));
            t.measure(android.view.View.MeasureSpec.makeMeasureSpec(E, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(F, 0x40000000));
            if (!G && !k)
            {
                k = true;
                i1 = -t.getMeasuredHeight();
                b = i1;
                j = i1;
            }
            u = -1;
            i1 = 0;
            while (i1 < getChildCount()) 
            {
                if (getChildAt(i1) == t)
                {
                    u = i1;
                    return;
                }
                i1++;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        i1 = android.support.v4.view.n.a(motionevent);
        if (q && i1 == 0)
        {
            q = false;
        }
        if (!isEnabled() || q || a())
        {
            return false;
        }
        i1;
        JVM INSTR tableswitch 0 6: default 92
    //                   0 94
    //                   1 544
    //                   2 111
    //                   3 544
    //                   4 92
    //                   5 521
    //                   6 536;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L5 _L6
_L1:
        return true;
_L2:
        o = android.support.v4.view.n.b(motionevent, 0);
        n = false;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = android.support.v4.view.n.a(motionevent, o);
        if (i1 < 0)
        {
            Log.e(c, "Got ACTION_MOVE event but have an invalid active pointer id.");
            return false;
        }
        float f3 = 0.5F * (android.support.v4.view.n.d(motionevent, i1) - l);
        if (!n)
        {
            continue; /* Loop/switch isn't completed */
        }
        w.a(true);
        float f1 = f3 / h;
        if (f1 < 0.0F)
        {
            return false;
        }
        float f5 = Math.min(1.0F, Math.abs(f1));
        float f6 = ((float)Math.max((double)f5 - 0.40000000000000002D, 0.0D) * 5F) / 3F;
        float f7 = Math.abs(f3);
        float f8 = h;
        int j1;
        if (G)
        {
            f1 = C - (float)b;
        } else
        {
            f1 = C;
        }
        f7 = Math.max(0.0F, Math.min(f7 - f8, 2.0F * f1) / f1);
        f7 = (float)((double)(f7 / 4F) - Math.pow(f7 / 4F, 2D)) * 2.0F;
        i1 = b;
        j1 = (int)(f1 * f5 + f1 * f7 * 2.0F);
        if (t.getVisibility() != 0)
        {
            t.setVisibility(0);
        }
        if (!p)
        {
            android.support.v4.view.t.a(t, 1.0F);
            android.support.v4.view.t.b(t, 1.0F);
        }
        if (f3 >= h) goto _L8; else goto _L7
_L7:
        if (p)
        {
            setAnimationProgress(f3 / h);
        }
        if (w.getAlpha() > 76 && !a(z))
        {
            d();
        }
        w.a(0.0F, Math.min(0.8F, 0.8F * f6));
        w.a(Math.min(1.0F, f6));
_L9:
        w.b((-0.25F + 0.4F * f6 + 2.0F * f7) * 0.5F);
        a((j1 + i1) - j, true);
        continue; /* Loop/switch isn't completed */
_L8:
        if (w.getAlpha() < 255 && !a(A))
        {
            e();
        }
        if (true) goto _L9; else goto _L5
_L5:
        o = android.support.v4.view.n.b(motionevent, android.support.v4.view.n.b(motionevent));
        continue; /* Loop/switch isn't completed */
_L6:
        a(motionevent);
        if (true) goto _L1; else goto _L3
_L3:
        if (o == -1)
        {
            if (i1 == 1)
            {
                Log.e(c, "Got ACTION_UP event but don't have an active pointer id.");
            }
            return false;
        }
        float f2 = android.support.v4.view.n.d(motionevent, android.support.v4.view.n.a(motionevent, o));
        float f4 = l;
        n = false;
        if ((f2 - f4) * 0.5F > h)
        {
            a(true, true);
        } else
        {
            f = false;
            w.a(0.0F, 0.0F);
            motionevent = null;
            if (!p)
            {
                motionevent = new android.view.animation.Animation.AnimationListener() {

                    final SwipeRefreshLayout a;

                    public void onAnimationEnd(Animation animation)
                    {
                        if (!SwipeRefreshLayout.f(a))
                        {
                            SwipeRefreshLayout.a(a, null);
                        }
                    }

                    public void onAnimationRepeat(Animation animation)
                    {
                    }

                    public void onAnimationStart(Animation animation)
                    {
                    }

            
            {
                a = SwipeRefreshLayout.this;
                super();
            }
                };
            }
            b(j, motionevent);
            w.a(false);
        }
        o = -1;
        return false;
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
        f();
        w.a(ai);
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
        t.setBackgroundColor(i1);
        w.b(i1);
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
            int i1;
            if (!G)
            {
                i1 = (int)(C + (float)b);
            } else
            {
                i1 = (int)C;
            }
            a(i1 - j, true);
            D = false;
            a(H);
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
            E = j1;
            F = j1;
        } else
        {
            int k1 = (int)(displaymetrics.density * 40F);
            E = k1;
            F = k1;
        }
        t.setImageDrawable(null);
        w.a(i1);
        t.setImageDrawable(w);
    }

}
