// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Window;

public class SizeUtil
{

    private static boolean a = false;
    public static int dp10 = 0;
    public static int dp100 = 0;
    public static int dp14 = 0;
    public static int dp16 = 0;
    public static int dp18 = 0;
    public static int dp2 = 0;
    public static int dp20 = 0;
    public static int dp200 = 0;
    public static int dp250 = 0;
    public static int dp30 = 0;
    public static int dp5 = 0;
    public static int dp50 = 0;
    public static int dp7 = 0;
    public static final int textSize0 = 20;
    public static final int textSize0_1 = 18;
    public static final int textSize0_2 = 16;
    public static final int textSize1 = 22;
    public static final int textSize2 = 24;

    public SizeUtil()
    {
    }

    public static int dpToPx(Context context, int i)
    {
        init(context);
        context = context.getResources().getDisplayMetrics();
        float f = i;
        return Math.round((((DisplayMetrics) (context)).xdpi / 160F) * f);
    }

    public static int getStatusBarHeight(Activity activity)
    {
        init(activity);
        int i;
        if ((activity.getWindow().getAttributes().flags & 0x400) == 1024)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!i)
        {
            if ((i = activity.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0)
            {
                return activity.getResources().getDimensionPixelSize(i);
            }
        }
        return 0;
    }

    public static void init(Context context)
    {
        if (a)
        {
            return;
        } else
        {
            a = true;
            dp30 = dpToPx(context, 30);
            dp5 = dpToPx(context, 5);
            dp20 = dpToPx(context, 20);
            dp10 = dpToPx(context, 10);
            dp7 = dpToPx(context, 7);
            dp18 = dpToPx(context, 18);
            dp16 = dpToPx(context, 16);
            dp14 = dpToPx(context, 14);
            dp100 = dpToPx(context, 100);
            dp200 = dpToPx(context, 200);
            dp250 = dpToPx(context, 250);
            dp2 = dpToPx(context, 2);
            dp50 = dpToPx(context, 50);
            return;
        }
    }

    public static int pxToDp(Context context, int i)
    {
        init(context);
        context = context.getResources().getDisplayMetrics();
        return Math.round((float)i / (((DisplayMetrics) (context)).xdpi / 160F));
    }

    public static int pxToSp(Context context, int i)
    {
        init(context);
        context = context.getResources().getDisplayMetrics();
        return (int)((float)i / ((DisplayMetrics) (context)).scaledDensity);
    }

    public static int spToPx(Context context, int i)
    {
        init(context);
        context = context.getResources().getDisplayMetrics();
        float f = i;
        return (int)(((DisplayMetrics) (context)).scaledDensity * f);
    }

    static 
    {
        a = false;
    }
}
