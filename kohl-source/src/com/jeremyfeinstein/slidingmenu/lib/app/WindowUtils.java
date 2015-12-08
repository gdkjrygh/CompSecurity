// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jeremyfeinstein.slidingmenu.lib.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;

public class WindowUtils
{

    public WindowUtils()
    {
    }

    public static int dip2px(Context context, float f)
    {
        return (int)(f * context.getResources().getDisplayMetrics().density + 0.5F);
    }

    public static int getActionBarHeight(Activity activity)
    {
        int i;
        try
        {
            i = activity.getActionBar().getHeight();
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            return 0;
        }
        return i;
    }

    public static DisplayMetrics getDisplayMetrics(Context context)
    {
        return context.getResources().getDisplayMetrics();
    }

    public static Rect getRootViewVisibleDisplayFrame(Activity activity)
    {
        Rect rect = getWindowVisibleDisplayFrame(activity);
        rect.top = rect.top + getActionBarHeight(activity);
        return rect;
    }

    public static int getScreenHeight(Context context)
    {
        return getDisplayMetrics(context).heightPixels;
    }

    public static int getScreenWidth(Context context)
    {
        return getDisplayMetrics(context).widthPixels;
    }

    public static int getStatusBarHeight(Activity activity)
    {
        return getWindowVisibleDisplayFrame(activity).top;
    }

    public static Rect getWindowVisibleDisplayFrame(Activity activity)
    {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    public static boolean isLandscape(Context context)
    {
        return context.getResources().getConfiguration().orientation == 2;
    }
}
