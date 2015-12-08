// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.b;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class i
{

    private static float a = 1.0F;

    public i(Context context)
    {
        a(context);
    }

    public static int a(float f)
    {
        return (int)(a * f + 0.5F);
    }

    public static void a(Context context)
    {
        a = context.getResources().getDisplayMetrics().density;
    }

    public static int b(float f)
    {
        return (int)(f / a + 0.5F);
    }

    public static int c(float f)
    {
        return (int)(a * f + 0.5F);
    }

    public static int d(float f)
    {
        return (int)(f / a + 0.5F);
    }

}
