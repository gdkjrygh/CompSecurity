// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics;

import android.graphics.Color;

public final class ColorUtils
{

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
            d = Math.pow((0.055D + d) / 1.0549999999999999D, 2.3999999999999999D);
        }
        d1 = (double)Color.green(i) / 255D;
        if (d1 < 0.039280000000000002D)
        {
            d1 /= 12.92D;
        } else
        {
            d1 = Math.pow((0.055D + d1) / 1.0549999999999999D, 2.3999999999999999D);
        }
        d2 = (double)Color.blue(i) / 255D;
        if (d2 < 0.039280000000000002D)
        {
            d2 /= 12.92D;
        } else
        {
            d2 = Math.pow((0.055D + d2) / 1.0549999999999999D, 2.3999999999999999D);
        }
        return 0.21260000000000001D * d + 0.71519999999999995D * d1 + 0.0722D * d2;
    }

    public static int compositeColors(int i, int j)
    {
        int k = Color.alpha(j);
        int l = Color.alpha(i);
        int i1 = 255 - ((255 - k) * (255 - l)) / 255;
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
}
