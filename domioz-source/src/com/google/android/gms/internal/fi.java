// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;

public final class fi
{

    public static final Handler a = new Handler(Looper.getMainLooper());

    public fi()
    {
    }

    public static int a(Context context, int i)
    {
        return a(context.getResources().getDisplayMetrics(), i);
    }

    public static int a(DisplayMetrics displaymetrics, int i)
    {
        return (int)TypedValue.applyDimension(1, i, displaymetrics);
    }

    public static boolean a()
    {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static int b(Context context, int i)
    {
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        context.getMetrics(displaymetrics);
        return b(displaymetrics, i);
    }

    public static int b(DisplayMetrics displaymetrics, int i)
    {
        return Math.round((float)i / displaymetrics.density);
    }

}
