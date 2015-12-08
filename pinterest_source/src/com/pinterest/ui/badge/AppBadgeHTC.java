// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.badge;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.pinterest.ui.badge:
//            AppBadgeBase

public class AppBadgeHTC extends AppBadgeBase
{

    private static final String INTENT_EXTRA_COMPONENT = "com.htc.launcher.extra.COMPONENT";
    private static final String INTENT_EXTRA_COUNT = "com.htc.launcher.extra.COUNT";
    private static final String INTENT_EXTRA_COUNT_1 = "count";
    private static final String INTENT_EXTRA_PACKAGE_NAME = "packagename";
    private static final String INTENT_SET_NOTIFICATION = "com.htc.launcher.action.SET_NOTIFICATION";
    private static final String INTENT_UPDATE_SHORTCUT = "com.htc.launcher.action.UPDATE_SHORTCUT";
    public static final String LAUNCHERS[] = {
        "com.htc.launcher"
    };

    public AppBadgeHTC()
    {
    }

    public void updateBadge(Context context, int i)
    {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", getLaunchActivityName(context));
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        context.sendBroadcast(intent);
        intent = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent.putExtra("packagename", getPackageName(context));
        intent.putExtra("count", i);
        context.sendBroadcast(intent);
    }

}
