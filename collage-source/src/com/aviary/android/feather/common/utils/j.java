// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;

public class j
{

    public j()
    {
    }

    public static double a(Context context)
    {
        context = context.getResources().getDisplayMetrics();
        double d1 = (double)((DisplayMetrics) (context)).widthPixels / (double)((DisplayMetrics) (context)).densityDpi;
        double d = (double)((DisplayMetrics) (context)).heightPixels / (double)((DisplayMetrics) (context)).densityDpi;
        d1 = Math.pow(d1, 2D);
        return Math.sqrt(Math.pow(d, 2D) + d1);
    }

    public static boolean b(Context context)
    {
        double d = a(context);
        Log.d("screen-utils", (new StringBuilder()).append("screen size: ").append(d).toString());
        return d >= 6.5D;
    }
}
