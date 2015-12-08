// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import android.graphics.Color;

public class Colors
{

    public Colors()
    {
    }

    public static int getAlpha(int i)
    {
        return Color.alpha(i);
    }

    public static int reduceAlpha(int i, float f)
    {
        if (f >= 1.0F || f <= 0.0F)
        {
            f = 1.0F;
        }
        return setAlpha(i, (int)((float)getAlpha(i) * f));
    }

    public static int setAlpha(int i, int j)
    {
        return Color.argb(j, Color.red(i), Color.green(i), Color.blue(i));
    }
}
