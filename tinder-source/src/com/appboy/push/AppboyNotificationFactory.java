// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.push;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import com.appboy.IAppboyNotificationFactory;
import com.appboy.configuration.XmlAppConfigurationProvider;

// Referenced classes of package com.appboy.push:
//            AppboyNotificationUtils, AppboyNotificationRemoteViewsUtils, AppboyNotificationActionUtils, AppboyWearableNotificationUtils

public class AppboyNotificationFactory
    implements IAppboyNotificationFactory
{

    private static volatile AppboyNotificationFactory sInstance = null;

    public AppboyNotificationFactory()
    {
    }

    public static AppboyNotificationFactory getInstance()
    {
        if (sInstance != null) goto _L2; else goto _L1
_L1:
        com/appboy/push/AppboyNotificationFactory;
        JVM INSTR monitorenter ;
        if (sInstance == null)
        {
            sInstance = new AppboyNotificationFactory();
        }
        com/appboy/push/AppboyNotificationFactory;
        JVM INSTR monitorexit ;
_L2:
        return sInstance;
        Exception exception;
        exception;
        com/appboy/push/AppboyNotificationFactory;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Notification createNotification(XmlAppConfigurationProvider xmlappconfigurationprovider, Context context, Bundle bundle, Bundle bundle1)
    {
        android.support.v4.app.aa.d d = (new android.support.v4.app.aa.d(context)).setAutoCancel(true);
        AppboyNotificationUtils.setTitleIfPresent(d, bundle);
        AppboyNotificationUtils.setContentIfPresent(d, bundle);
        AppboyNotificationUtils.setTickerIfPresent(d, bundle);
        AppboyNotificationUtils.setContentIntentIfPresent(context, d, bundle);
        int i = AppboyNotificationUtils.setSmallIcon(xmlappconfigurationprovider, d);
        AppboyNotificationUtils.setLargeIconIfPresentAndSupported(context, xmlappconfigurationprovider, d);
        AppboyNotificationUtils.setSoundIfPresentAndSupported(d, bundle);
        if (android.os.Build.VERSION.SDK_INT >= 11 && android.os.Build.VERSION.SDK_INT < 16)
        {
            android.widget.RemoteViews remoteviews = AppboyNotificationRemoteViewsUtils.createMultiLineContentNotificationView(context, bundle, i);
            if (remoteviews != null)
            {
                d.setContent(remoteviews);
                return d.build();
            }
        }
        AppboyNotificationUtils.setSummaryTextIfPresentAndSupported(d, bundle);
        AppboyNotificationUtils.setPriorityIfPresentAndSupported(d, bundle);
        AppboyNotificationUtils.setStyleIfSupported(context, d, bundle, bundle1);
        AppboyNotificationActionUtils.addNotificationActions(context, d, bundle);
        AppboyNotificationUtils.setAccentColorIfPresentAndSupported(xmlappconfigurationprovider, d, bundle);
        AppboyNotificationUtils.setCategoryIfPresentAndSupported(d, bundle);
        AppboyNotificationUtils.setVisibilityIfPresentAndSupported(d, bundle);
        AppboyNotificationUtils.setPublicVersionIfPresentAndSupported(context, xmlappconfigurationprovider, d, bundle);
        AppboyWearableNotificationUtils.setWearableNotificationFeaturesIfPresentAndSupported(context, d, bundle);
        return d.build();
    }

}
