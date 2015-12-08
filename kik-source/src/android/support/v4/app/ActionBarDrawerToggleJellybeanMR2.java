// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

class ActionBarDrawerToggleJellybeanMR2
{

    private static final String TAG = "ActionBarDrawerToggleImplJellybeanMR2";
    private static final int THEME_ATTRS[] = {
        0x101030b
    };

    ActionBarDrawerToggleJellybeanMR2()
    {
    }

    public static Drawable getThemeUpIndicator(Activity activity)
    {
        Object obj = activity.getActionBar();
        if (obj != null)
        {
            activity = ((ActionBar) (obj)).getThemedContext();
        }
        activity = activity.obtainStyledAttributes(null, THEME_ATTRS, 0x10102ce, 0);
        obj = activity.getDrawable(0);
        activity.recycle();
        return ((Drawable) (obj));
    }

    public static Object setActionBarDescription(Object obj, Activity activity, int i)
    {
        activity = activity.getActionBar();
        if (activity != null)
        {
            activity.setHomeActionContentDescription(i);
        }
        return obj;
    }

    public static Object setActionBarUpIndicator(Object obj, Activity activity, Drawable drawable, int i)
    {
        activity = activity.getActionBar();
        if (activity != null)
        {
            activity.setHomeAsUpIndicator(drawable);
            activity.setHomeActionContentDescription(i);
        }
        return obj;
    }

}
