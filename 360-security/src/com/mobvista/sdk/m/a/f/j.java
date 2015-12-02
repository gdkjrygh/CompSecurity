// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.f;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public final class j
{

    public static int a = 1;

    public static float a(Context context)
    {
        return (float)context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int a()
    {
        int i = a;
        a = i + 1;
        return i;
    }

    public static int a(Context context, float f)
    {
        return (int)(context.getResources().getDisplayMetrics().density * f + 0.5F);
    }

    public static boolean a(String s)
    {
        return s == null || s.length() == 0;
    }

    public static boolean b(String s)
    {
        return s != null && s.length() > 0;
    }

}
