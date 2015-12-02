// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.w;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class j
{

    public j()
    {
    }

    public static int a(Context context, float f)
    {
        return (int)(context.getResources().getDisplayMetrics().density * f + 0.5F);
    }

    public static int a(Resources resources, float f)
    {
        return (int)(resources.getDisplayMetrics().density * f + 0.5F);
    }

    public static int b(Context context, float f)
    {
        return (int)(context.getResources().getDisplayMetrics().scaledDensity * f + 0.5F);
    }

    public static int b(Resources resources, float f)
    {
        return (int)(resources.getDisplayMetrics().scaledDensity * f + 0.5F);
    }
}
