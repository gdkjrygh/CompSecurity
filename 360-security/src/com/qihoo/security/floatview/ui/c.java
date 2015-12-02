// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.floatview.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.qihoo360.mobilesafe.share.SharedPref;

public class c extends FrameLayout
    implements android.view.View.OnTouchListener
{
    public static interface a
    {

        public abstract void c();
    }

    public static interface b
    {

        public abstract void a(int i1, int j1);

        public abstract boolean a(int i1, int j1, boolean flag);

        public abstract void b(int i1, int j1);

        public abstract void c(int i1, int j1);
    }


    private final int A;
    private final Handler B = new Handler();
    private final Runnable C = new Runnable() {

        final c a;

        public void run()
        {
            int k1;
            boolean flag1;
            k1 = 0;
            flag1 = true;
            boolean flag2 = c.a(a).computeScrollOffset();
            flag1 = flag2;
_L1:
label0:
            {
                {
                    if (!flag1)
                    {
                        break label0;
                    }
                    int j1 = c.a(a).getCurrX();
                    int l1 = c.a(a).getCurrY();
                    int i1 = j1;
                    if (j1 >= a.i - a.getWidthOnSide())
                    {
                        i1 = a.i - a.getWidthOnSide();
                        c.a(a).abortAnimation();
                        c.a(a, false);
                        c.b(a);
                        c.c(a);
                    }
                    j1 = i1;
                    if (i1 <= 0)
                    {
                        c.a(a).abortAnimation();
                        c.a(a, false);
                        c.b(a);
                        c.c(a);
                        j1 = 0;
                    }
                    android.view.WindowManager.LayoutParams layoutparams;
                    ArrayIndexOutOfBoundsException arrayindexoutofboundsexception;
                    if (l1 < 0)
                    {
                        i1 = k1;
                    } else
                    {
                        i1 = l1;
                    }
                    k1 = i1;
                    if (i1 >= a.j - a.getHeight())
                    {
                        k1 = a.j - a.getHeight();
                    }
                    layoutparams = a.h;
                    a.k = j1;
                    layoutparams.x = j1;
                    layoutparams = a.h;
                    a.m = k1;
                    layoutparams.y = k1;
                    if (c.d(a) != null && a.k != a.l && a.m != a.n)
                    {
                        c.d(a).a(a.h.x, a.h.y);
                    }
                    if (a.h.x >= a.i / 2)
                    {
                        a.setSide(3);
                    } else
                    {
                        a.setSide(2);
                    }
                    if (a.isShown())
                    {
                        a.a(a.h);
                    }
                    a.l = a.k;
                    a.n = a.m;
                    c.e(a).postDelayed(this, 20L);
                }
                return;
            }
            if (c.f(a))
            {
                if (c.g(a) && a.h.x != a.i - a.getWidthOnSide() && a.h.x != 0)
                {
                    if (a.h.x >= a.i / 2)
                    {
                        c.a(a).startScroll(a.h.x, a.h.y, a.i - a.getWidthOnSide() - a.h.x, 0, Math.abs(a.i - a.getWidthOnSide() - a.h.x) / 2);
                    } else
                    {
                        c.a(a).startScroll(a.h.x, a.h.y, -a.h.x, 0, Math.abs(a.h.x) / 2);
                    }
                    c.e(a).post(this);
                    return;
                }
                c.a(a, false);
                if (c.g(a))
                {
                    c.b(a);
                }
                c.c(a);
                return;
            } else
            {
                break MISSING_BLOCK_LABEL_425;
            }
            arrayindexoutofboundsexception;
              goto _L1
        }

            
            {
                a = c.this;
                super();
            }
    };
    private b D;
    private int E;
    private boolean F;
    private boolean G;
    private final a a;
    public String b;
    public String c;
    public String d;
    public String e;
    Context f;
    protected WindowManager g;
    protected android.view.WindowManager.LayoutParams h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;
    protected int n;
    protected int o;
    protected int p;
    protected int q;
    protected int r;
    protected boolean s;
    private final boolean t;
    private int u;
    private int v;
    private Scroller w;
    private VelocityTracker x;
    private final int y;
    private final int z;

    public c(Context context, String s1, String s2, String s3, String s4, boolean flag, a a1)
    {
        super(context.getApplicationContext());
        v = 0;
        w = null;
        E = 0;
        l = -1;
        n = -1;
        p = -1;
        r = -1;
        G = false;
        f = context.getApplicationContext();
        a = a1;
        t = flag;
        b = s1;
        c = s2;
        d = s3;
        e = s4;
        g = (WindowManager)f.getSystemService("window");
        w = new Scroller(f, new LinearInterpolator());
        h = new android.view.WindowManager.LayoutParams(-2, -2, 2003, 8, -3);
        h.gravity = 51;
        context = f.getResources().getDisplayMetrics();
        i = ((DisplayMetrics) (context)).widthPixels;
        j = ((DisplayMetrics) (context)).heightPixels;
        context = ViewConfiguration.get(f);
        y = context.getScaledTouchSlop();
        z = context.getScaledMinimumFlingVelocity();
        A = context.getScaledMaximumFlingVelocity();
        context = getResources();
        u = context.getConfiguration().orientation;
        v = context.getDimensionPixelOffset(0x7f090061);
        c(u);
    }

    static Scroller a(c c1)
    {
        return c1.w;
    }

    private void a()
    {
        if (h.x >= i / 2)
        {
            h.x = i - getWidthOnSide();
            setSide(1);
        } else
        {
            h.x = 0;
            setSide(0);
        }
        if (isShown())
        {
            a(h);
        }
    }

    private void a(int i1, int j1, int k1)
    {
        if (s && isShown() && D != null)
        {
            D.a(h.x, h.y);
        }
        boolean flag;
        if (s && isShown())
        {
            int l1 = h.x;
            int i2 = h.y;
            boolean flag1;
            if (i1 == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag = a(l1, i2, flag);
        } else
        {
            flag = false;
        }
        flag1 = s;
        if (Math.abs(j1) > z || Math.abs(k1) > z)
        {
            w.fling(h.x, h.y, j1, k1, -i * 2, i * 2, -j * 2, j * 2);
            w.extendDuration((int)((double)w.getDuration() * 0.40000000000000002D));
            flag1 = true;
        }
        if (flag1)
        {
            if (!flag)
            {
                B.postDelayed(C, 20L);
                F = true;
                return;
            } else
            {
                F = false;
                return;
            }
        } else
        {
            j();
            return;
        }
    }

    static void a(c c1, int i1, int j1, int k1)
    {
        c1.a(i1, j1, k1);
    }

    static boolean a(c c1, boolean flag)
    {
        c1.F = flag;
        return flag;
    }

    private void b()
    {
        if (getResources().getConfiguration().orientation == 1)
        {
            SharedPref.a(f, b, h.x);
            SharedPref.a(f, c, h.y);
            return;
        } else
        {
            SharedPref.a(f, d, h.x);
            SharedPref.a(f, e, h.y);
            return;
        }
    }

    static void b(c c1)
    {
        c1.a();
    }

    static void c(c c1)
    {
        c1.b();
    }

    static b d(c c1)
    {
        return c1.D;
    }

    static Handler e(c c1)
    {
        return c1.B;
    }

    static boolean f(c c1)
    {
        return c1.F;
    }

    static boolean g(c c1)
    {
        return c1.t;
    }

    public void a(int i1)
    {
    }

    protected void a(int i1, int j1)
    {
        if (D != null)
        {
            D.b(i1, j1);
        }
    }

    public void a(Configuration configuration)
    {
        u = configuration.orientation;
        configuration = f.getResources().getDisplayMetrics();
        i = ((DisplayMetrics) (configuration)).widthPixels;
        j = ((DisplayMetrics) (configuration)).heightPixels;
        l();
    }

    protected void a(android.view.WindowManager.LayoutParams layoutparams)
    {
        g.updateViewLayout(this, layoutparams);
    }

    protected boolean a(int i1, int j1, boolean flag)
    {
        if (D != null)
        {
            return D.a(h.x, h.y, flag);
        } else
        {
            return false;
        }
    }

    protected void b(int i1, int j1)
    {
        if (D != null)
        {
            D.c(h.x, h.y);
        }
    }

    protected void c(int i1)
    {
        int j1;
        if (i1 != 2)
        {
            j1 = SharedPref.b(f, b, -1);
            i1 = SharedPref.b(f, c, -1);
        } else
        {
            j1 = SharedPref.b(f, d, -1);
            i1 = SharedPref.b(f, e, -1);
        }
        if (j1 != -1 && i1 != -1)
        {
            h.x = j1;
            h.y = i1;
        } else
        {
            h.x = i;
            h.y = j / 3;
        }
        if (h.x >= i / 2)
        {
            h.x = i - getWidthOnSide();
            setSide(1);
        } else
        {
            h.x = 0;
            setSide(0);
        }
        if (!isShown())
        {
            break MISSING_BLOCK_LABEL_139;
        }
        if (D != null)
        {
            D.a(h.x, h.y);
        }
        a(h);
        return;
        Exception exception;
        exception;
    }

    public boolean d()
    {
        return true;
    }

    public void e()
    {
    }

    public boolean f()
    {
        if (isShown())
        {
            return false;
        }
        try
        {
            g.addView(this, h);
        }
        catch (Exception exception)
        {
            return false;
        }
        return true;
    }

    public void g()
    {
        if (!isShown())
        {
            return;
        }
        try
        {
            g.removeView(this);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public int getOrientation()
    {
        return u;
    }

    protected int getSide()
    {
        return E;
    }

    public int getWidthOnSide()
    {
        return 0;
    }

    public android.view.WindowManager.LayoutParams getWindowLayoutParams()
    {
        return h;
    }

    public boolean h()
    {
        return s;
    }

    public void j()
    {
        playSoundEffect(0);
        if (a != null)
        {
            a.c();
        }
    }

    protected void k()
    {
        c(u);
    }

    public void l()
    {
        k();
        G = true;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        setOnTouchListener(this);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (isShown())
        {
            g();
        }
        setOnTouchListener(null);
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        int i1;
        i1 = motionevent.getAction();
        if (G && i1 != 0)
        {
            if (x != null)
            {
                x.recycle();
                x = null;
            }
            return false;
        }
        k = (int)motionevent.getRawX();
        m = (int)motionevent.getRawY();
        float f1 = motionevent.getX();
        float f2 = motionevent.getY();
        if (x == null)
        {
            x = VelocityTracker.obtain();
        }
        motionevent.setLocation(k, m);
        x.addMovement(motionevent);
        motionevent.setLocation(f1, f2);
        i1;
        JVM INSTR tableswitch 0 3: default 144
    //                   0 146
    //                   1 586
    //                   2 242
    //                   3 586;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        return true;
_L2:
        G = false;
        if (!w.isFinished())
        {
            w.abortAnimation();
            s = true;
        } else
        {
            s = false;
        }
        l = k;
        n = m;
        o = k;
        p = m;
        q = h.x;
        r = h.y;
        e();
        continue; /* Loop/switch isn't completed */
_L4:
        if (!s)
        {
            if (Math.abs(k - l) > y || Math.abs(m - n) > y)
            {
                h.x = k - getWidth() / 2;
                h.y = m - v - getHeight();
                if (h.x >= i / 2)
                {
                    setSide(3);
                } else
                {
                    setSide(2);
                }
                if (isShown())
                {
                    b(h.x, h.y);
                    if (D != null)
                    {
                        D.a(k, h.y);
                    }
                    a(h);
                }
                s = true;
                l = k;
                n = m;
            }
        } else
        {
            h.x = k - getWidth() / 2;
            h.y = m - v - getHeight();
            if (h.x >= i / 2)
            {
                setSide(3);
            } else
            {
                setSide(2);
            }
            if (isShown())
            {
                if (D != null)
                {
                    D.a(h.x, h.y);
                    a(k, h.y);
                }
                a(h);
            }
            l = k;
            n = m;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (!d())
        {
            h.x = k - getWidth() / 2;
            h.y = m - v - getHeight();
            g.updateViewLayout(this, h);
        }
        view = x;
        view.computeCurrentVelocity(1000, A);
        int k1 = (int)view.getXVelocity();
        int j1 = (int)view.getYVelocity();
        k1 /= 2;
        j1 /= 2;
        if (x != null)
        {
            x.recycle();
            x = null;
        }
        B.post(new Runnable(i1, k1, j1) {

            final int a;
            final int b;
            final int c;
            final c d;

            public void run()
            {
                c.a(d, a, b, c);
            }

            
            {
                d = c.this;
                a = i1;
                b = j1;
                c = k1;
                super();
            }
        });
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void setOnPositionChangeListener(b b1)
    {
        D = b1;
    }

    protected void setSide(int i1)
    {
        if (E != i1)
        {
            E = i1;
            a(i1);
        }
    }

    public void setWindowLayoutParams(android.view.WindowManager.LayoutParams layoutparams)
    {
        h = layoutparams;
    }
}
