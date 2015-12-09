// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Color;

public final class dl
{

    private static double a(int i)
    {
        double d = (double)Color.red(i) / 255D;
        double d1;
        double d2;
        if (d < 0.039280000000000002D)
        {
            d /= 12.92D;
        } else
        {
            d = Math.pow((d + 0.055D) / 1.0549999999999999D, 2.3999999999999999D);
        }
        d1 = (double)Color.green(i) / 255D;
        if (d1 < 0.039280000000000002D)
        {
            d1 /= 12.92D;
        } else
        {
            d1 = Math.pow((d1 + 0.055D) / 1.0549999999999999D, 2.3999999999999999D);
        }
        d2 = (double)Color.blue(i) / 255D;
        if (d2 < 0.039280000000000002D)
        {
            d2 /= 12.92D;
        } else
        {
            d2 = Math.pow((d2 + 0.055D) / 1.0549999999999999D, 2.3999999999999999D);
        }
        return d * 0.21260000000000001D + d1 * 0.71519999999999995D + 0.0722D * d2;
    }

    private static float a(float f, float f1)
    {
        float f2;
        if (f < 0.0F)
        {
            f2 = 0.0F;
        } else
        {
            f2 = f1;
            if (f <= f1)
            {
                return f;
            }
        }
        return f2;
    }

    public static int a(int i, int j)
    {
        int k = Color.alpha(j);
        int l = Color.alpha(i);
        int i1 = 255 - ((255 - k) * (255 - l)) / 255;
        return Color.argb(i1, a(Color.red(i), l, Color.red(j), k, i1), a(Color.green(i), l, Color.green(j), k, i1), a(Color.blue(i), l, Color.blue(j), k, i1));
    }

    public static int a(int i, int j, float f)
    {
        int k;
        int l;
        l = 0;
        k = 255;
        if (Color.alpha(j) != 255)
        {
            throw new IllegalArgumentException((new StringBuilder("background can not be translucent: #")).append(Integer.toHexString(j)).toString());
        }
        if (b(c(i, 255), j) >= (double)f) goto _L2; else goto _L1
_L1:
        char c1 = '\uFFFF';
_L4:
        return c1;
_L2:
        int i1 = 0;
_L6:
        c1 = k;
        if (i1 > 10) goto _L4; else goto _L3
_L3:
        c1 = k;
        if (k - l <= 1) goto _L4; else goto _L5
_L5:
        int j1 = (l + k) / 2;
        if (b(c(i, j1), j) < (double)f)
        {
            l = j1;
        } else
        {
            k = j1;
        }
        i1++;
          goto _L6
    }

    private static int a(int i, int j, int k, int l, int i1)
    {
        if (i1 == 0)
        {
            return 0;
        } else
        {
            return (i * 255 * j + k * l * (255 - j)) / (i1 * 255);
        }
    }

    public static int a(float af[])
    {
        float f;
        float f1;
        float f2;
        float f3;
        int i;
        i = 0;
        f = af[0];
        f1 = af[1];
        f2 = af[2];
        f1 = (1.0F - Math.abs(f2 * 2.0F - 1.0F)) * f1;
        f2 -= 0.5F * f1;
        f3 = f1 * (1.0F - Math.abs((f / 60F) % 2.0F - 1.0F));
        (int)f / 60;
        JVM INSTR tableswitch 0 6: default 100
    //                   0 125
    //                   1 160
    //                   2 195
    //                   3 230
    //                   4 265
    //                   5 300
    //                   6 300;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L7
_L1:
        int j;
        int k;
        j = 0;
        k = 0;
_L9:
        return Color.rgb(b(k), b(j), b(i));
_L2:
        k = Math.round((f1 + f2) * 255F);
        j = Math.round((f3 + f2) * 255F);
        i = Math.round(255F * f2);
        continue; /* Loop/switch isn't completed */
_L3:
        k = Math.round((f3 + f2) * 255F);
        j = Math.round((f1 + f2) * 255F);
        i = Math.round(255F * f2);
        continue; /* Loop/switch isn't completed */
_L4:
        k = Math.round(255F * f2);
        j = Math.round((f1 + f2) * 255F);
        i = Math.round((f3 + f2) * 255F);
        continue; /* Loop/switch isn't completed */
_L5:
        k = Math.round(255F * f2);
        j = Math.round((f3 + f2) * 255F);
        i = Math.round((f1 + f2) * 255F);
        continue; /* Loop/switch isn't completed */
_L6:
        k = Math.round((f3 + f2) * 255F);
        j = Math.round(255F * f2);
        i = Math.round((f1 + f2) * 255F);
        continue; /* Loop/switch isn't completed */
_L7:
        k = Math.round((f1 + f2) * 255F);
        j = Math.round(255F * f2);
        i = Math.round((f3 + f2) * 255F);
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static void a(int i, int j, int k, float af[])
    {
        float f;
        float f1;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        f = (float)i / 255F;
        f2 = (float)j / 255F;
        f4 = (float)k / 255F;
        f5 = Math.max(f, Math.max(f2, f4));
        f6 = Math.min(f, Math.min(f2, f4));
        f1 = f5 - f6;
        f3 = (f5 + f6) / 2.0F;
        if (f5 != f6) goto _L2; else goto _L1
_L1:
        f = 0.0F;
        f1 = 0.0F;
_L4:
        f2 = (f1 * 60F) % 360F;
        f1 = f2;
        if (f2 < 0.0F)
        {
            f1 = f2 + 360F;
        }
        af[0] = a(f1, 360F);
        af[1] = a(f, 1.0F);
        af[2] = a(f3, 1.0F);
        return;
_L2:
        if (f5 != f)
        {
            break; /* Loop/switch isn't completed */
        }
        f = ((f2 - f4) / f1) % 6F;
_L5:
        f2 = f1 / (1.0F - Math.abs(f3 * 2.0F - 1.0F));
        f1 = f;
        f = f2;
        if (true) goto _L4; else goto _L3
_L3:
        if (f5 == f2)
        {
            f = (f4 - f) / f1 + 2.0F;
        } else
        {
            f = (f - f2) / f1 + 4F;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public static double b(int i, int j)
    {
        if (Color.alpha(j) != 255)
        {
            throw new IllegalArgumentException((new StringBuilder("background can not be translucent: #")).append(Integer.toHexString(j)).toString());
        }
        int k = i;
        if (Color.alpha(i) < 255)
        {
            k = a(i, j);
        }
        double d = a(k) + 0.050000000000000003D;
        double d1 = a(j) + 0.050000000000000003D;
        return Math.max(d, d1) / Math.min(d, d1);
    }

    private static int b(int i)
    {
        int j;
        if (i < 0)
        {
            j = 0;
        } else
        {
            j = i;
            if (i > 255)
            {
                return 255;
            }
        }
        return j;
    }

    public static int c(int i, int j)
    {
        if (j < 0 || j > 255)
        {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        } else
        {
            return 0xffffff & i | j << 24;
        }
    }
}
