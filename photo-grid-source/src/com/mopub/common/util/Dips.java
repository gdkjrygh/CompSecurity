// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.mopub.common.Preconditions;

public class Dips
{

    public Dips()
    {
    }

    private static float a(Context context)
    {
        return context.getResources().getDisplayMetrics().density;
    }

    public static float asFloatPixels(float f, Context context)
    {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static int asIntPixels(float f, Context context)
    {
        return (int)(asFloatPixels(f, context) + 0.5F);
    }

    public static float dipsToFloatPixels(float f, Context context)
    {
        return a(context) * f;
    }

    public static int dipsToIntPixels(float f, Context context)
    {
        return (int)(dipsToFloatPixels(f, context) + 0.5F);
    }

    public static float pixelsToFloatDips(float f, Context context)
    {
        return f / a(context);
    }

    public static int pixelsToIntDips(float f, Context context)
    {
        return (int)(pixelsToFloatDips(f, context) + 0.5F);
    }

    public static int screenHeightAsIntDips(Context context)
    {
        Preconditions.checkNotNull(context);
        return pixelsToIntDips(context.getResources().getDisplayMetrics().heightPixels, context);
    }

    public static int screenWidthAsIntDips(Context context)
    {
        Preconditions.checkNotNull(context);
        return pixelsToIntDips(context.getResources().getDisplayMetrics().widthPixels, context);
    }
}
