// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tune.crosspromo;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class TuneAdSize
{

    public static final TuneAdSize a = new TuneAdSize(320, 50);
    public static final TuneAdSize b = new TuneAdSize(-1, -2);
    private final int c;
    private final int d;

    public TuneAdSize(int i, int j)
    {
        if (i < 0 && i != -1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid width for MATAdSize: ").append(i).toString());
        }
        if (j < 0 && j != -2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid height for MATAdSize: ").append(j).toString());
        } else
        {
            c = i;
            d = j;
            return;
        }
    }

    private int a(Context context, int i)
    {
        i = (int)((float)i / context.getResources().getDisplayMetrics().density);
        if (i <= 400)
        {
            return (int)(32F * context.getResources().getDisplayMetrics().density);
        }
        if (i <= 720)
        {
            return (int)(50F * context.getResources().getDisplayMetrics().density);
        } else
        {
            return (int)(90F * context.getResources().getDisplayMetrics().density);
        }
    }

    public int a(Context context)
    {
        if (c == -1)
        {
            return context.getResources().getDisplayMetrics().widthPixels;
        } else
        {
            return (int)((float)c * context.getResources().getDisplayMetrics().density);
        }
    }

    public int b(Context context)
    {
        if (d == -2)
        {
            return a(context, context.getResources().getDisplayMetrics().heightPixels);
        } else
        {
            return (int)((float)d * context.getResources().getDisplayMetrics().density);
        }
    }

}
