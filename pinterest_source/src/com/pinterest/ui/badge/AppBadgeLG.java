// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.badge;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.pinterest.ui.badge:
//            AppBadgeBase

public class AppBadgeLG extends AppBadgeBase
{

    private static final String INTENT_ACTION = "android.intent.action.BADGE_COUNT_UPDATE";
    private static final String INTENT_EXTRA_ACTIVITY_NAME = "badge_count_class_name";
    private static final String INTENT_EXTRA_BADGE_COUNT = "badge_count";
    private static final String INTENT_EXTRA_PACKAGE_NAME = "badge_count_package_name";
    public static final String LAUNCHERS[] = {
        "com.lge.launcher", "com.lge.launcher2"
    };

    public AppBadgeLG()
    {
    }

    public void updateBadge(Context context, int i)
    {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", getPackageName(context));
        intent.putExtra("badge_count_class_name", getLaunchActivityName(context));
        context.sendBroadcast(intent);
    }

}
