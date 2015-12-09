// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.view.ba;
import android.support.v4.view.bq;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v4.widget:
//            c, d

public abstract class a
    implements android.view.View.OnTouchListener
{

    private static final int r = ViewConfiguration.getTapTimeout();
    private final c a = new c();
    private final Interpolator b = new AccelerateInterpolator();
    private final View c;
    private Runnable d;
    private float e[] = {
        0.0F, 0.0F
    };
    private float f[] = {
        3.402823E+38F, 3.402823E+38F
    };
    private int g;
    private int h;
    private float i[] = {
        0.0F, 0.0F
    };
    private float j[] = {
        0.0F, 0.0F
    };
    private float k[] = {
        3.402823E+38F, 3.402823E+38F
    };
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;

    public a(View view)
    {
        c = view;
        view = Resources.getSystem().getDisplayMetrics();
        int i1 = (int)(1575F * ((DisplayMetrics) (view)).density + 0.5F);
        int j1 = (int)(((DisplayMetrics) (view)).density * 315F + 0.5F);
        a(i1, i1);
        b(j1, j1);
        a(1);
        e(3.402823E+38F, 3.402823E+38F);
        d(0.2F, 0.2F);
        c(1.0F, 1.0F);
        b(r);
        c(500);
        d(500);
    }

    static float a(float f1, float f2, float f3)
    {
        return b(f1, f2, f3);
    }

    private float a(float f1, float f2, float f3, float f4)
    {
        float f5;
        f5 = 0.0F;
        f1 = b(f1 * f2, 0.0F, f3);
        f3 = f(f4, f1);
        f2 = f(f2 - f4, f1) - f3;
        if (f2 >= 0.0F) goto _L2; else goto _L1
_L1:
        f1 = -b.getInterpolation(-f2);
_L6:
        f1 = b(f1, -1F, 1.0F);
_L4:
        return f1;
_L2:
        f1 = f5;
        if (f2 <= 0.0F) goto _L4; else goto _L3
_L3:
        f1 = b.getInterpolation(f2);
        if (true) goto _L6; else goto _L5
_L5:
    }

    private float a(int i1, float f1, float f2, float f3)
    {
        f1 = a(e[i1], f2, f[i1], f1);
        if (f1 == 0.0F)
        {
            return 0.0F;
        }
        float f5 = i[i1];
        f2 = j[i1];
        float f4 = k[i1];
        f3 = f5 * f3;
        if (f1 > 0.0F)
        {
            return b(f1 * f3, f2, f4);
        } else
        {
            return -b(-f1 * f3, f2, f4);
        }
    }

    static int a(int i1, int j1, int k1)
    {
        return b(i1, j1, k1);
    }

    private boolean a()
    {
        c c1 = a;
        int i1 = c1.f();
        int j1 = c1.e();
        return i1 != 0 && f(i1) || j1 != 0 && e(j1);
    }

    static boolean a(a a1)
    {
        return a1.o;
    }

    static boolean a(a a1, boolean flag)
    {
        a1.m = flag;
        return flag;
    }

    private static float b(float f1, float f2, float f3)
    {
        if (f1 > f3)
        {
            return f3;
        }
        if (f1 < f2)
        {
            return f2;
        } else
        {
            return f1;
        }
    }

    private static int b(int i1, int j1, int k1)
    {
        if (i1 > k1)
        {
            return k1;
        }
        if (i1 < j1)
        {
            return j1;
        } else
        {
            return i1;
        }
    }

    private void b()
    {
        if (d == null)
        {
            d = new d(this, null);
        }
        o = true;
        m = true;
        if (!l && h > 0)
        {
            bq.a(c, d, h);
        } else
        {
            d.run();
        }
        l = true;
    }

    static boolean b(a a1)
    {
        return a1.m;
    }

    static boolean b(a a1, boolean flag)
    {
        a1.o = flag;
        return flag;
    }

    static c c(a a1)
    {
        return a1.a;
    }

    private void c()
    {
        if (m)
        {
            o = false;
            return;
        } else
        {
            a.b();
            return;
        }
    }

    static boolean c(a a1, boolean flag)
    {
        a1.n = flag;
        return flag;
    }

    private void d()
    {
        long l1 = SystemClock.uptimeMillis();
        MotionEvent motionevent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
        c.onTouchEvent(motionevent);
        motionevent.recycle();
    }

    static boolean d(a a1)
    {
        return a1.a();
    }

    static boolean e(a a1)
    {
        return a1.n;
    }

    private float f(float f1, float f2)
    {
        if (f2 != 0.0F) goto _L2; else goto _L1
_L1:
        return 0.0F;
_L2:
        g;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 42
    //                   1 42
    //                   2 77;
           goto _L3 _L4 _L4 _L5
_L5:
        continue; /* Loop/switch isn't completed */
_L3:
        return 0.0F;
_L4:
        if (f1 >= f2) goto _L1; else goto _L6
_L6:
        if (f1 >= 0.0F)
        {
            return 1.0F - f1 / f2;
        }
        if (!o || g != 1) goto _L1; else goto _L7
_L7:
        return 1.0F;
        if (f1 >= 0.0F) goto _L1; else goto _L8
_L8:
        return f1 / -f2;
    }

    static void f(a a1)
    {
        a1.d();
    }

    static View g(a a1)
    {
        return a1.c;
    }

    public a a(float f1, float f2)
    {
        k[0] = f1 / 1000F;
        k[1] = f2 / 1000F;
        return this;
    }

    public a a(int i1)
    {
        g = i1;
        return this;
    }

    public a a(boolean flag)
    {
        if (p && !flag)
        {
            c();
        }
        p = flag;
        return this;
    }

    public abstract void a(int i1, int j1);

    public a b(float f1, float f2)
    {
        j[0] = f1 / 1000F;
        j[1] = f2 / 1000F;
        return this;
    }

    public a b(int i1)
    {
        h = i1;
        return this;
    }

    public a c(float f1, float f2)
    {
        i[0] = f1 / 1000F;
        i[1] = f2 / 1000F;
        return this;
    }

    public a c(int i1)
    {
        a.a(i1);
        return this;
    }

    public a d(float f1, float f2)
    {
        e[0] = f1;
        e[1] = f2;
        return this;
    }

    public a d(int i1)
    {
        a.b(i1);
        return this;
    }

    public a e(float f1, float f2)
    {
        f[0] = f1;
        f[1] = f2;
        return this;
    }

    public abstract boolean e(int i1);

    public abstract boolean f(int i1);

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag;
        flag = true;
        if (!p)
        {
            return false;
        }
        ba.a(motionevent);
        JVM INSTR tableswitch 0 3: default 48
    //                   0 65
    //                   1 153
    //                   2 75
    //                   3 153;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_153;
_L5:
        float f1;
        float f2;
        if (!q || !o)
        {
            flag = false;
        }
        return flag;
_L2:
        n = true;
        l = false;
_L4:
        f1 = a(0, motionevent.getX(), view.getWidth(), c.getWidth());
        f2 = a(1, motionevent.getY(), view.getHeight(), c.getHeight());
        a.a(f1, f2);
        if (!o && a())
        {
            b();
        }
          goto _L5
        c();
          goto _L5
    }

}
