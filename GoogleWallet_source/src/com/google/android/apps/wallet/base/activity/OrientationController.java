// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.activity;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.Display;
import android.view.WindowManager;

public final class OrientationController
{

    public static void disableOrientationChanges(Activity activity)
    {
        disableOrientationChanges(activity, activity.getWindowManager().getDefaultDisplay().getRotation(), activity.getResources().getConfiguration().orientation);
    }

    private static void disableOrientationChanges(Activity activity, int i, int j)
    {
        switch (j)
        {
        default:
            return;

        case 1: // '\001'
            if (i == 0 || i == 3)
            {
                activity.setRequestedOrientation(1);
                return;
            } else
            {
                activity.setRequestedOrientation(9);
                return;
            }

        case 2: // '\002'
            break;
        }
        if (i == 0 || i == 1)
        {
            activity.setRequestedOrientation(0);
            return;
        } else
        {
            activity.setRequestedOrientation(8);
            return;
        }
    }

    public static void setRequestedOrientationIfAllowed(Activity activity)
    {
        if (activity.getResources().getBoolean(com.google.android.apps.walletnfcrel.R.bool.allow_landscape_mode))
        {
            activity.setRequestedOrientation(2);
        }
    }
}
