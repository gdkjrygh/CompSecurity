// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import android.graphics.Color;
import com.pinterest.kit.application.Resources;
import java.util.Random;

public class Colors
{

    public static final int BG_GRID = Resources.color(0x7f0e0015);
    public static final int BG_GRID_DARK = Resources.color(0x7f0e0016);
    public static final int BG_TOUCH = Resources.color(0x7f0e001f);
    public static final int BG_TOUCH_IMAGE = Resources.color(0x7f0e001f);
    public static final int BLACK = Resources.color(0x7f0e0024);
    public static final int GRAY_DARK_SOLID = Resources.color(0x7f0e0070);
    public static final int GRAY_SOLID = Resources.color(0x7f0e006d);
    public static final int LIGHTEST_GRAY_SOLID = Resources.color(0x7f0e0078);
    public static final int LIGHT_GRAY = Resources.color(0x7f0e0076);
    public static final int LIGHT_GRAY_SOLID = Resources.color(0x7f0e0074);
    public static final int MAX_HUE = 360;
    public static final int RED = Resources.color(0x7f0e009c);
    public static final int TEXT_DARK = Resources.color(0x7f0e00a9);
    public static final int TEXT_LIGHT = Resources.color(0x7f0e00aa);
    public static final int TEXT_MEDIUM = Resources.color(0x7f0e00ac);
    public static final int TEXT_PLAIN_BUTTON = Resources.color(0x7f0e00a9);
    public static final int TRANSPARENT = Resources.color(0x106000d);
    public static final int WHITE = Resources.color(0x7f0e00bf);

    public Colors()
    {
    }

    public static int darker(int i, double d)
    {
        int k = 0;
        int j = (int)Math.round((double)Color.red(i) * (1.0D - d));
        int i1 = (int)Math.round((double)Color.green(i) * (1.0D - d));
        int l = (int)Math.round((double)Color.blue(i) * (1.0D - d));
        if (j < 0)
        {
            i = 0;
        } else
        {
            i = j;
            if (j > 255)
            {
                i = 255;
            }
        }
        if (i1 < 0)
        {
            j = 0;
        } else
        {
            j = i1;
            if (i1 > 255)
            {
                j = 255;
            }
        }
        if (l >= 0)
        {
            if (l > 255)
            {
                k = 255;
            } else
            {
                k = l;
            }
        }
        return Color.rgb(i, j, k);
    }

    public static int flattenColor(int i, int j)
    {
        int k = Color.red(j);
        int l = Color.green(j);
        j = Color.blue(j);
        float f = (float)Color.alpha(i) / 255F;
        if (f == 1.0F)
        {
            return i;
        } else
        {
            int i1 = (int)((float)Color.red(i) * f);
            int j1 = (int)((float)Color.green(i) * f);
            i = (int)(f * (float)Color.blue(i));
            return Color.argb(255, (k + i1) / 2, (l + j1) / 2, (j + i) / 2);
        }
    }

    public static Integer from(String s)
    {
        return from(s, 0);
    }

    public static Integer from(String s, int i)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        String as[] = s.split(",");
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        if (as.length == 3)
        {
            return Integer.valueOf(Color.argb(255, Integer.parseInt(as[0]), Integer.parseInt(as[1]), Integer.parseInt(as[2])));
        }
        int j = Color.parseColor(s);
        return Integer.valueOf(j);
        s;
        return Integer.valueOf(i);
    }

    public static int getRandomColorFromSeed(String s)
    {
        int i = 360;
        s = new Random(s.hashCode());
        double d = s.nextInt(360);
        double d2 = s.nextDouble();
        double d3 = 0.40000000000000002D + s.nextDouble() * 0.59999999999999998D;
        double d1;
        int j;
        if (d3 >= 0.90000000000000002D)
        {
            i = 210;
            j = 30;
        } else
        if (d3 >= 0.80000000000000004D)
        {
            i = 80;
            j = 60;
        } else
        if (d3 >= 0.69999999999999996D)
        {
            i = 70;
            j = 60;
        } else
        {
            j = 360;
        }
        i = (360 - i) + j;
        d1 = ((double)i / 360D) * d;
        d = d1;
        if (d1 >= (double)j)
        {
            d = d1 + (double)(360 - i);
        }
        return Color.HSVToColor(new float[] {
            (float)d, (float)(d2 * 0.43000000000000005D + 0.56999999999999995D), (float)d3
        });
    }

    public static int getSimilarColor(int i, String s)
    {
        int j = 10 - (new Random(s.hashCode())).nextInt(10) - 5;
        double d = j;
        double d1 = j;
        double d2 = j;
        s = new float[3];
        Color.colorToHSV(i, s);
        s[0] = (float)(0.01D * d + (double)s[0]);
        s[1] = (float)(0.02D * d1 + (double)s[1]);
        s[2] = (float)(d2 * 0.050000000000000003D + (double)s[2]);
        return Color.HSVToColor(s);
    }

    public static boolean isBright(int i)
    {
        int j = Color.red(i);
        int k = Color.green(i);
        i = Color.blue(i);
        double d = j * j;
        return (int)Math.sqrt((double)(k * k) * 0.69099999999999995D + d * 0.24099999999999999D + (double)(i * i) * 0.068000000000000005D) > 200;
    }

    public static int setAlpha(int i, float f)
    {
        return Color.argb(Math.round(255F * f), Color.red(i), Color.green(i), Color.blue(i));
    }

}
