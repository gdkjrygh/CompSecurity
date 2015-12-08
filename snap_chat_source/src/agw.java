// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.FloatMath;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public final class agw
{

    private static float p = (float)(Math.log(0.75D) / Math.log(0.90000000000000002D));
    private static float q = 800F;
    private static float r;
    private static float s;
    private static final float t[];
    private static float w = 8F;
    private static float x = 1.0F;
    public int a;
    public int b;
    public int c;
    public boolean d;
    private int e;
    private int f;
    private int g;
    private int h;
    private long i;
    private int j;
    private float k;
    private float l;
    private Interpolator m;
    private boolean n;
    private float o;
    private float u;
    private final float v;

    public agw(Context context, Interpolator interpolator)
    {
        this(context, interpolator, (byte)0);
    }

    public agw(Context context, Interpolator interpolator, byte byte0)
    {
        d = true;
        m = interpolator;
        v = context.getResources().getDisplayMetrics().density * 160F;
        u = ViewConfiguration.getScrollFriction() * (386.0878F * v);
        n = true;
    }

    private static float a(float f1)
    {
        f1 = w * f1;
        if (f1 < 1.0F)
        {
            f1 -= 1.0F - (float)Math.exp(-f1);
        } else
        {
            f1 = (1.0F - (float)Math.exp(1.0F - f1)) * 0.6321205F + 0.3678795F;
        }
        return f1 * x;
    }

    public final void a(int i1, int j1)
    {
        e = 0;
        d = false;
        j = j1;
        i = AnimationUtils.currentAnimationTimeMillis();
        a = 0;
        f = 0;
        b = i1;
        l = i1;
        k = 1.0F / (float)j;
    }

    public final void a(int i1, int j1, int k1)
    {
        int i2 = j1;
        int l1 = k1;
        if (n)
        {
            i2 = j1;
            l1 = k1;
            if (!d)
            {
                float f1 = o - (u * (float)(int)(AnimationUtils.currentAnimationTimeMillis() - i)) / 2000F;
                float f6 = f;
                float f3 = b - a;
                float f5 = FloatMath.sqrt(f6 * f6 + f3 * f3);
                f6 /= f5;
                f3 /= f5;
                f5 = f6 * f1;
                f1 *= f3;
                i2 = j1;
                l1 = k1;
                if (Math.signum(0.0F) == Math.signum(f5))
                {
                    i2 = j1;
                    l1 = k1;
                    if (Math.signum(k1) == Math.signum(f1))
                    {
                        i2 = (int)(f5 + 0.0F);
                        l1 = (int)(f1 + (float)k1);
                    }
                }
            }
        }
        e = 1;
        d = false;
        float f4 = FloatMath.sqrt(i2 * i2 + l1 * l1);
        o = f4;
        double d1 = Math.log((r * f4) / q);
        j = (int)(1000D * Math.exp(d1 / ((double)p - 1.0D)));
        i = AnimationUtils.currentAnimationTimeMillis();
        a = i1;
        float f2;
        if (f4 == 0.0F)
        {
            f2 = 1.0F;
        } else
        {
            f2 = (float)i2 / f4;
        }
        if (f4 == 0.0F)
        {
            f4 = 1.0F;
        } else
        {
            f4 = (float)l1 / f4;
        }
        j1 = (int)((double)q * Math.exp(d1 * ((double)p / ((double)p - 1.0D))));
        g = 0x7fffffff;
        f = Math.round(f2 * (float)j1) + 0;
        f = Math.min(f, 0);
        f = Math.max(f, 0);
        b = Math.round(f4 * (float)j1) + i1;
        b = Math.min(b, g);
        b = Math.max(b, 0);
    }

    public final boolean a()
    {
        int i1;
        if (d)
        {
            return false;
        }
        i1 = (int)(AnimationUtils.currentAnimationTimeMillis() - i);
        if (i1 >= j) goto _L2; else goto _L1
_L1:
        e;
        JVM INSTR tableswitch 0 1: default 56
    //                   0 58
    //                   1 130;
           goto _L3 _L4 _L5
_L3:
        return true;
_L4:
        float f1 = (float)i1 * k;
        if (m == null)
        {
            f1 = a(f1);
        } else
        {
            f1 = m.getInterpolation(f1);
        }
        h = Math.round(0.0F * f1) + 0;
        i1 = a;
        c = Math.round(f1 * l) + i1;
        continue; /* Loop/switch isn't completed */
_L5:
        float f2 = (float)i1 / (float)j;
        i1 = (int)(100F * f2);
        float f3 = (float)i1 / 100F;
        float f4 = (float)(i1 + 1) / 100F;
        float f5 = t[i1];
        float f6 = t[i1 + 1];
        f2 = ((f2 - f3) / (f4 - f3)) * (f6 - f5) + f5;
        h = Math.round((float)f * f2) + 0;
        h = Math.min(h, 0);
        h = Math.max(h, 0);
        i1 = a;
        c = Math.round(f2 * (float)(b - a)) + i1;
        c = Math.min(c, g);
        c = Math.max(c, 0);
        if (h == f && c == b)
        {
            d = true;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        h = f;
        c = b;
        d = true;
        if (true) goto _L3; else goto _L6
_L6:
    }

    static 
    {
        r = 0.4F;
        s = 1.0F - r;
        t = new float[101];
        float f1 = 0.0F;
        for (int i1 = 0; i1 <= 100; i1++)
        {
            float f4 = (float)i1 / 100F;
            float f2 = 1.0F;
            float f3;
            float f5;
            do
            {
                f3 = (f2 - f1) / 2.0F + f1;
                f5 = 3F * f3 * (1.0F - f3);
                float f6 = ((1.0F - f3) * r + s * f3) * f5 + f3 * f3 * f3;
                if ((double)Math.abs(f6 - f4) < 1.0000000000000001E-05D)
                {
                    break;
                }
                if (f6 > f4)
                {
                    f2 = f3;
                } else
                {
                    f1 = f3;
                }
            } while (true);
            t[i1] = f3 * f3 * f3 + f5;
        }

        t[100] = 1.0F;
        x = 1.0F / a(1.0F);
    }
}
