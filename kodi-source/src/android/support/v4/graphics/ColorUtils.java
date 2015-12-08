// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics;

import android.graphics.Color;

public class ColorUtils
{

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
