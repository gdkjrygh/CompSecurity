// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.badge;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.pinterest.kit.log.PLog;

// Referenced classes of package com.pinterest.ui.badge:
//            AppBadge

public class AppBadgeBase
    implements AppBadge
{

    public AppBadgeBase()
    {
    }

    protected static String getLaunchActivityName(Context context)
    {
        String s = getPackageName(context);
        context = context.getPackageManager().getLaunchIntentForPackage(s).getComponent();
        if (context != null)
        {
            return context.getClassName();
        } else
        {
            return "";
        }
    }

    protected static String getPackageName(Context context)
    {
        return context.getPackageName();
    }

    public boolean isSupported(Context context)
    {
        return true;
    }

    public void updateBadge(Context context, int i)
    {
        PLog.warn("Default AppBadgeBase::updateBadge implementation is invoked, check the Badge implementation", new Object[0]);
    }
}
