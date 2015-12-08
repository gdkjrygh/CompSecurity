// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;

final class ae
{

    private static float p = (float)(Math.log(0.78000000000000003D) / Math.log(0.90000000000000002D));
    private static final float q[];
    private static final float r[];
    private int a;
    private int b;
    private int c;
    private int d;
    private float e;
    private float f;
    private long g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private float m;
    private int n;
    private float o;

    ae(Context context)
    {
        m = ViewConfiguration.getScrollFriction();
        n = 0;
        k = true;
        o = context.getResources().getDisplayMetrics().density * 160F * 386.0878F * 0.84F;
    }

    private void a(int i1, int j1, int k1, int l1)
    {
        boolean flag1 = true;
        if (i1 > j1 && i1 < k1)
        {
            Log.e("OverScroller", "startAfterEdge called from a valid position");
            k = true;
            return;
        }
        boolean flag;
        int i2;
        int j2;
        if (i1 > k1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            i2 = k1;
        } else
        {
            i2 = j1;
        }
        j2 = i1 - i2;
        if (j2 * l1 < 0)
        {
            flag1 = false;
        }
        if (flag1)
        {
            float f1;
            float f2;
            if (l1 == 0)
            {
                j1 = i1 - i2;
            } else
            {
                j1 = l1;
            }
            f = b(j1);
            f1 = (float)(-l1) / f;
            f2 = (float)Math.sqrt((2D * (double)((float)(l1 * l1) / 2.0F / Math.abs(f) + (float)Math.abs(i2 - i1))) / (double)Math.abs(f));
            g = g - (long)(int)((f2 - f1) * 1000F);
            a = i2;
            d = (int)(-f * f2);
            d();
            return;
        }
        if (d(l1) > (double)Math.abs(j2))
        {
            if (!flag)
            {
                j1 = i1;
            }
            if (flag)
            {
                k1 = i1;
            }
            a(i1, l1, j1, k1, l);
            return;
        } else
        {
            b(i1, i2);
            return;
        }
    }

    static boolean a(ae ae1)
    {
        return ae1.k;
    }

    static boolean a(ae ae1, boolean flag)
    {
        ae1.k = flag;
        return flag;
    }

    private static float b(int i1)
    {
        return i1 <= 0 ? 2000F : -2000F;
    }

    static int b(ae ae1)
    {
        return ae1.b;
    }

    private void b(int i1, int j1)
    {
        k = false;
        n = 1;
        a = i1;
        c = j1;
        i1 -= j1;
        f = b(i1);
        d = -i1;
        l = Math.abs(i1);
        h = (int)(Math.sqrt(((double)i1 * -2D) / (double)f) * 1000D);
    }

    private void b(int i1, int j1, int k1)
    {
        float f1 = Math.abs((float)(k1 - i1) / (float)(j1 - i1));
        i1 = (int)(100F * f1);
        if (i1 < 100)
        {
            float f2 = (float)i1 / 100F;
            float f3 = (float)(i1 + 1) / 100F;
            float f4 = r[i1];
            float f5 = r[i1 + 1];
            h = (int)((((f1 - f2) / (f3 - f2)) * (f5 - f4) + f4) * (float)h);
        }
    }

    private double c(int i1)
    {
        return Math.log((0.35F * (float)Math.abs(i1)) / (m * o));
    }

    static float c(ae ae1)
    {
        return ae1.e;
    }

    private double d(int i1)
    {
        double d1 = c(i1);
        double d2 = p;
        double d3 = m * o;
        return Math.exp(d1 * ((double)p / (d2 - 1.0D))) * d3;
    }

    static int d(ae ae1)
    {
        return ae1.a;
    }

    private void d()
    {
        float f2 = (float)(d * d) / (Math.abs(f) * 2.0F);
        float f3 = Math.signum(d);
        float f1 = f2;
        if (f2 > (float)l)
        {
            f = (-f3 * (float)d * (float)d) / ((float)l * 2.0F);
            f1 = l;
        }
        l = (int)f1;
        n = 2;
        int i1 = a;
        if (d <= 0)
        {
            f1 = -f1;
        }
        c = (int)f1 + i1;
        h = -(int)((1000F * (float)d) / f);
    }

    static int e(ae ae1)
    {
        return ae1.c;
    }

    static int f(ae ae1)
    {
        return ae1.h;
    }

    static long g(ae ae1)
    {
        return ae1.g;
    }

    final void a()
    {
        b = c;
        k = true;
    }

    final void a(float f1)
    {
        b = a + Math.round((float)(c - a) * f1);
    }

    final void a(int i1, int j1)
    {
        if (n == 0)
        {
            l = j1;
            g = AnimationUtils.currentAnimationTimeMillis();
            a(i1, 0, 0, (int)e);
        }
    }

    final void a(int i1, int j1, int k1)
    {
        k = false;
        a = i1;
        c = i1 + j1;
        g = AnimationUtils.currentAnimationTimeMillis();
        h = k1;
        f = 0.0F;
        d = 0;
    }

    final void a(int i1, int j1, int k1, int l1, int i2)
    {
        l = i2;
        k = false;
        d = j1;
        e = j1;
        i = 0;
        h = 0;
        g = AnimationUtils.currentAnimationTimeMillis();
        a = i1;
        b = i1;
        if (i1 > l1 || i1 < k1)
        {
            a(i1, k1, l1, j1);
        } else
        {
            n = 0;
            double d1 = 0.0D;
            if (j1 != 0)
            {
                i2 = (int)(Math.exp(c(j1) / ((double)p - 1.0D)) * 1000D);
                i = i2;
                h = i2;
                d1 = d(j1);
            }
            j = (int)(d1 * (double)Math.signum(j1));
            c = j + i1;
            if (c < k1)
            {
                b(a, c, k1);
                c = k1;
            }
            if (c > l1)
            {
                b(a, c, l1);
                c = l1;
                return;
            }
        }
    }

    final boolean a(int i1)
    {
        k = true;
        c = i1;
        a = i1;
        d = 0;
        g = AnimationUtils.currentAnimationTimeMillis();
        h = 0;
        if (i1 < 0)
        {
            b(i1, 0);
        } else
        if (i1 > 0)
        {
            b(i1, 0);
        }
        return !k;
    }

    final boolean b()
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        n;
        JVM INSTR tableswitch 0 2: default 36
    //                   0 45
    //                   1 43
    //                   2 107;
           goto _L1 _L2 _L3 _L4
_L1:
        c();
        flag = true;
_L3:
        return flag;
_L2:
        flag = flag1;
        if (h >= i) goto _L3; else goto _L5
_L5:
        a = c;
        d = (int)e;
        f = b(d);
        g = g + (long)h;
        d();
        continue; /* Loop/switch isn't completed */
_L4:
        g = g + (long)h;
        b(c, a);
        if (true) goto _L1; else goto _L6
_L6:
    }

    final boolean c()
    {
        double d1;
        long l1;
        l1 = AnimationUtils.currentAnimationTimeMillis() - g;
        if (l1 > (long)h)
        {
            return false;
        }
        d1 = 0.0D;
        n;
        JVM INSTR tableswitch 0 2: default 56
    //                   0 76
    //                   1 244
    //                   2 194;
           goto _L1 _L2 _L3 _L4
_L1:
        int i1 = a;
        b = (int)Math.round(d1) + i1;
        return true;
_L2:
        float f7 = (float)l1 / (float)i;
        int j1 = (int)(100F * f7);
        float f4 = 1.0F;
        float f1 = 0.0F;
        if (j1 < 100)
        {
            f4 = (float)j1 / 100F;
            f1 = (float)(j1 + 1) / 100F;
            float f9 = q[j1];
            f1 = (q[j1 + 1] - f9) / (f1 - f4);
            f4 = (f7 - f4) * f1 + f9;
        }
        d1 = f4 * (float)j;
        e = ((f1 * (float)j) / (float)i) * 1000F;
        continue; /* Loop/switch isn't completed */
_L4:
        float f2 = (float)l1 / 1000F;
        e = (float)d + f * f2;
        float f5 = d;
        d1 = (f2 * (f * f2)) / 2.0F + f5 * f2;
        continue; /* Loop/switch isn't completed */
_L3:
        float f3 = (float)l1 / (float)h;
        float f6 = f3 * f3;
        float f8 = Math.signum(d);
        d1 = (float)l * f8 * (3F * f6 - 2.0F * f3 * f6);
        float f10 = l;
        e = (-f3 + f6) * (f8 * f10 * 6F);
        if (true) goto _L1; else goto _L5
_L5:
    }

    static 
    {
        float f2 = 0.0F;
        q = new float[101];
        r = new float[101];
        int i1 = 0;
        float f1 = 0.0F;
        for (; i1 < 100; i1++)
        {
            float f5 = (float)i1 / 100F;
            float f3 = 1.0F;
            float f4;
            float f6;
            do
            {
                f4 = (f3 - f1) / 2.0F + f1;
                f6 = 3F * f4 * (1.0F - f4);
                float f7 = ((1.0F - f4) * 0.175F + 0.35F * f4) * f6 + f4 * f4 * f4;
                if ((double)Math.abs(f7 - f5) < 1.0000000000000001E-05D)
                {
                    break;
                }
                if (f7 > f5)
                {
                    f3 = f4;
                } else
                {
                    f1 = f4;
                }
            } while (true);
            q[i1] = f4 * (f4 * f4) + f6 * ((1.0F - f4) * 0.5F + f4);
            f3 = 1.0F;
            do
            {
                f4 = (f3 - f2) / 2.0F + f2;
                f6 = 3F * f4 * (1.0F - f4);
                float f8 = ((1.0F - f4) * 0.5F + f4) * f6 + f4 * f4 * f4;
                if ((double)Math.abs(f8 - f5) < 1.0000000000000001E-05D)
                {
                    break;
                }
                if (f8 > f5)
                {
                    f3 = f4;
                } else
                {
                    f2 = f4;
                }
            } while (true);
            r[i1] = f4 * (f4 * f4) + ((1.0F - f4) * 0.175F + 0.35F * f4) * f6;
        }

        float af[] = q;
        r[100] = 1.0F;
        af[100] = 1.0F;
    }
}
