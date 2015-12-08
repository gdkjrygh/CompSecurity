// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics;

import android.graphics.Color;

public class ColorUtils
{

    private static final int MIN_ALPHA_SEARCH_MAX_ITERATIONS = 10;
    private static final int MIN_ALPHA_SEARCH_PRECISION = 10;

    private ColorUtils()
    {
    }

    public static int HSLToColor(float af[])
    {
        float f;
        float f1;
        float f2;
        float f3;
        f = af[0];
        f1 = af[1];
        f2 = af[2];
        f1 = (1.0F - Math.abs(2.0F * f2 - 1.0F)) * f1;
        f2 -= 0.5F * f1;
        f3 = f1 * (1.0F - Math.abs((f / 60F) % 2.0F - 1.0F));
        (int)f / 60;
        JVM INSTR tableswitch 0 6: default 96
    //                   0 136
    //                   1 171
    //                   2 206
    //                   3 241
    //                   4 276
    //                   5 311
    //                   6 311;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L7
_L1:
        int i;
        int j;
        int k;
        i = 0;
        j = 0;
        k = 0;
_L9:
        return Color.rgb(constrain(k, 0, 255), constrain(j, 0, 255), constrain(i, 0, 255));
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

    public static void RGBToHSL(int i, int j, int k, float af[])
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
        af[0] = constrain(f1, 0.0F, 360F);
        af[1] = constrain(f, 0.0F, 1.0F);
        af[2] = constrain(f3, 0.0F, 1.0F);
        return;
_L2:
        if (f5 != f)
        {
            break; /* Loop/switch isn't completed */
        }
        f = ((f2 - f4) / f1) % 6F;
_L5:
        f2 = f1 / (1.0F - Math.abs(2.0F * f3 - 1.0F));
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

    public static double calculateContrast(int i, int j)
    {
        if (Color.alpha(j) != 255)
        {
            throw new IllegalArgumentException("background can not be translucent");
        }
        int k = i;
        if (Color.alpha(i) < 255)
        {
            k = compositeColors(i, j);
        }
        double d = calculateLuminance(k) + 0.050000000000000003D;
        double d1 = calculateLuminance(j) + 0.050000000000000003D;
        return Math.max(d, d1) / Math.min(d, d1);
    }

    public static double calculateLuminance(int i)
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

    public static int calculateMinimumAlpha(int i, int j, float f)
    {
        int k;
        int l;
        l = 0;
        k = 255;
        if (Color.alpha(j) != 255)
        {
            throw new IllegalArgumentException("background can not be translucent");
        }
        if (calculateContrast(setAlphaComponent(i, 255), j) >= (double)f) goto _L2; else goto _L1
_L1:
        char c = '\uFFFF';
_L4:
        return c;
_L2:
        int i1 = 0;
_L6:
        c = k;
        if (i1 > 10) goto _L4; else goto _L3
_L3:
        c = k;
        if (k - l <= 10) goto _L4; else goto _L5
_L5:
        int j1 = (l + k) / 2;
        if (calculateContrast(setAlphaComponent(i, j1), j) < (double)f)
        {
            l = j1;
        } else
        {
            k = j1;
        }
        i1++;
          goto _L6
    }

    public static void colorToHSL(int i, float af[])
    {
        RGBToHSL(Color.red(i), Color.green(i), Color.blue(i), af);
    }

    private static int compositeAlpha(int i, int j)
    {
        return 255 - ((255 - j) * (255 - i)) / 255;
    }

    public static int compositeColors(int i, int j)
    {
        int k = Color.alpha(j);
        int l = Color.alpha(i);
        int i1 = compositeAlpha(l, k);
        return Color.argb(i1, compositeComponent(Color.red(i), l, Color.red(j), k, i1), compositeComponent(Color.green(i), l, Color.green(j), k, i1), compositeComponent(Color.blue(i), l, Color.blue(j), k, i1));
    }

    private static int compositeComponent(int i, int j, int k, int l, int i1)
    {
        if (i1 == 0)
        {
            return 0;
        } else
        {
            return (i * 255 * j + k * l * (255 - j)) / (i1 * 255);
        }
    }

    private static float constrain(float f, float f1, float f2)
    {
        if (f < f1)
        {
            return f1;
        }
        if (f > f2)
        {
            return f2;
        } else
        {
            return f;
        }
    }

    private static int constrain(int i, int j, int k)
    {
        if (i < j)
        {
            return j;
        }
        if (i > k)
        {
            return k;
        } else
        {
            return i;
        }
    }

    public static int setAlphaComponent(int i, int j)
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
