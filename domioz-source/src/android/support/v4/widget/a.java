// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.view.ay;
import android.support.v4.view.bp;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v4.widget:
//            b, c

public abstract class a
    implements android.view.View.OnTouchListener
{

    private static final int r = ViewConfiguration.getTapTimeout();
    private final b a = new b();
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
        float f1 = i1;
        k[0] = f1 / 1000F;
        k[1] = f1 / 1000F;
        f1 = j1;
        j[0] = f1 / 1000F;
        j[1] = f1 / 1000F;
        g = 1;
        f[0] = 3.402823E+38F;
        f[1] = 3.402823E+38F;
        e[0] = 0.2F;
        e[1] = 0.2F;
        i[0] = 0.001F;
        i[1] = 0.001F;
        h = r;
        a.a();
        a.b();
    }

    static float a(float f1)
    {
        return a(f1, 0.0F, 1.0F);
    }

    private float a(float f1, float f2)
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

    private static float a(float f1, float f2, float f3)
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

    private float a(int i1, float f1, float f2, float f3)
    {
        float f4 = a(e[i1] * f2, 0.0F, f[i1]);
        float f6 = a(f1, f4);
        f1 = a(f2 - f1, f4) - f6;
        if (f1 >= 0.0F) goto _L2; else goto _L1
_L1:
        f1 = -b.getInterpolation(-f1);
_L6:
        f1 = a(f1, -1F, 1.0F);
_L4:
        if (f1 == 0.0F)
        {
            return 0.0F;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (f1 > 0.0F)
        {
            f1 = b.getInterpolation(f1);
            continue; /* Loop/switch isn't completed */
        }
        f1 = 0.0F;
        if (true) goto _L4; else goto _L3
_L3:
        float f7 = i[i1];
        f2 = j[i1];
        float f5 = k[i1];
        f3 = f7 * f3;
        if (f1 > 0.0F)
        {
            return a(f1 * f3, f2, f5);
        }
        return -a(-f1 * f3, f2, f5);
        if (true) goto _L6; else goto _L5
_L5:
    }

    static int a(int i1, int j1)
    {
        if (i1 > j1)
        {
            return j1;
        }
        if (i1 < 0)
        {
            return 0;
        } else
        {
            return i1;
        }
    }

    private boolean a()
    {
        b b1 = a;
        int i1 = b1.h();
        int j1 = b1.g();
        if (i1 == 0 || !b(i1))
        {
            if (j1 == 0);
            return false;
        } else
        {
            return true;
        }
    }

    static boolean a(a a1)
    {
        return a1.o;
    }

    private void b()
    {
        if (m)
        {
            o = false;
            return;
        } else
        {
            a.d();
            return;
        }
    }

    static boolean b(a a1)
    {
        return a1.m;
    }

    static boolean c(a a1)
    {
        a1.m = false;
        return false;
    }

    static b d(a a1)
    {
        return a1.a;
    }

    static boolean e(a a1)
    {
        return a1.a();
    }

    static boolean f(a a1)
    {
        a1.o = false;
        return false;
    }

    static boolean g(a a1)
    {
        return a1.n;
    }

    static boolean h(a a1)
    {
        a1.n = false;
        return false;
    }

    static void i(a a1)
    {
        long l1 = SystemClock.uptimeMillis();
        MotionEvent motionevent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
        a1.c.onTouchEvent(motionevent);
        motionevent.recycle();
    }

    static View j(a a1)
    {
        return a1.c;
    }

    public final a a(boolean flag)
    {
        if (p && !flag)
        {
            b();
        }
        p = flag;
        return this;
    }

    public abstract void a(int i1);

    public abstract boolean b(int i1);

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (p) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        ay.a(motionevent);
        JVM INSTR tableswitch 0 3: default 44
    //                   0 60
    //                   1 221
    //                   2 70
    //                   3 221;
           goto _L3 _L4 _L5 _L6 _L5
_L5:
        break MISSING_BLOCK_LABEL_221;
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L8:
        if (q && o)
        {
            return true;
        }
        if (true) goto _L1; else goto _L7
_L7:
        n = true;
        l = false;
_L6:
        float f1 = a(0, motionevent.getX(), view.getWidth(), c.getWidth());
        float f2 = a(1, motionevent.getY(), view.getHeight(), c.getHeight());
        a.a(f1, f2);
        if (!o && a())
        {
            if (d == null)
            {
                d = new c(this, (byte)0);
            }
            o = true;
            m = true;
            if (!l && h > 0)
            {
                bp.a(c, d, h);
            } else
            {
                d.run();
            }
            l = true;
        }
          goto _L8
        b();
          goto _L8
    }

}
