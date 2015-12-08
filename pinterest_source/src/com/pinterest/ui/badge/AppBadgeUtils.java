// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.badge;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.log.PLog;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.ui.badge:
//            AppBadgeBase, AppBadgeSamsung, AppBadgeSony, AppBadgeHTC, 
//            AppBadgeLG, AppBadgeAsus, AppBadgeGeneric

public class AppBadgeUtils
{

    private static final int BADGING_NOT_CHECKED = -1;
    private static final int BADGING_NOT_SUPPORTED = 0;
    private static final int BADGING_SUPPORTED = 1;

    public AppBadgeUtils()
    {
    }

    private static boolean contains(String as[], String s)
    {
        boolean flag1 = false;
        int j = as.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!as[i].equals(s))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public static boolean isBadgingSupported(Context context)
    {
        PreferencesManager preferencesmanager;
        int i;
        preferencesmanager = Preferences.persisted();
        i = preferencesmanager.getInt("isBadgingSupported", -1);
        if (i != -1) goto _L2; else goto _L1
_L1:
        AppBadgeBase appbadgebase = obtainAppBadge(context);
        if (appbadgebase == null || !appbadgebase.isSupported(context)) goto _L4; else goto _L3
_L3:
        preferencesmanager.set("isBadgingSupported", 1);
_L6:
        return true;
_L4:
        preferencesmanager.set("isBadgingSupported", 0);
        return false;
_L2:
        if (i != 1)
        {
            return false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static AppBadgeBase obtainAppBadge(Context context)
    {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        context = context.getPackageManager().resolveActivity(intent, 0x10000);
        if (context != null)
        {
            context = ((ResolveInfo) (context)).activityInfo.packageName;
            if (contains(AppBadgeSamsung.LAUNCHERS, context))
            {
                return new AppBadgeSamsung();
            }
            if (contains(AppBadgeSony.LAUNCHERS, context))
            {
                return new AppBadgeSony();
            }
            if (contains(AppBadgeHTC.LAUNCHERS, context))
            {
                return new AppBadgeHTC();
            }
            if (contains(AppBadgeLG.LAUNCHERS, context))
            {
                return new AppBadgeLG();
            }
            if (contains(AppBadgeAsus.LAUNCHERS, context))
            {
                return new AppBadgeAsus();
            }
            if (contains(AppBadgeGeneric.LAUNCHERS, context))
            {
                return new AppBadgeGeneric();
            }
        }
        return null;
    }

    public static void removeBadge(Context context)
    {
        if (context == null)
        {
            throw new NullPointerException("the context cannot be null!");
        } else
        {
            updateBadge(context, 0);
            return;
        }
    }

    public static void updateBadge(Context context, int i)
    {
        if (context == null || i < 0)
        {
            PLog.warn((new StringBuilder("calling updateBadge with invalid parameters: context [")).append(context).append("] count [").append(i).append("]").toString(), new Object[0]);
        } else
        {
            AppBadgeBase appbadgebase = obtainAppBadge(context);
            if (appbadgebase != null)
            {
                try
                {
                    appbadgebase.updateBadge(context, i);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    PLog.warn(context.getMessage(), new Object[0]);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    CrashReporting.a(context);
                    return;
                }
                Pinalytics.a(EventType.MOBILE_BADGE_SHOWN, String.valueOf(i));
                return;
            }
        }
    }
}
