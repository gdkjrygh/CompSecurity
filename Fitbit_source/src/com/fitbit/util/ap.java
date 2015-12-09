// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.fitbit.FitBitApplication;

public class ap
{

    public ap()
    {
    }

    public static float a(float f)
    {
        return TypedValue.applyDimension(2, f, FitBitApplication.a().getResources().getDisplayMetrics());
    }

    public static int a(Context context, float f)
    {
        return Math.round(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
    }

    public static float b(float f)
    {
        return TypedValue.applyDimension(1, f, FitBitApplication.a().getResources().getDisplayMetrics());
    }
}
