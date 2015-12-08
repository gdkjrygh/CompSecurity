// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;

public class MetricsUtils
{

    final Context context;

    public MetricsUtils(Context context1)
    {
        context = context1;
    }

    public static MetricsUtils fromContext(Context context1)
    {
        return new MetricsUtils(context1);
    }

    public static MetricsUtils fromView(View view)
    {
        return fromContext(view.getContext());
    }

    public int dpToPixels(float f)
    {
        return (int)(context.getResources().getDisplayMetrics().density * f + 0.5F);
    }

    public float pixelsToDp(float f)
    {
        return f / context.getResources().getDisplayMetrics().density;
    }
}
