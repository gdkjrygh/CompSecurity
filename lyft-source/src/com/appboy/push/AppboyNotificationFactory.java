// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.push;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import com.appboy.Constants;
import com.appboy.IAppboyNotificationFactory;
import com.appboy.configuration.XmlAppConfigurationProvider;

// Referenced classes of package com.appboy.push:
//            AppboyNotificationUtils, AppboyNotificationRemoteViewsUtils, AppboyNotificationActionUtils, AppboyWearableNotificationUtils

public class AppboyNotificationFactory
    implements IAppboyNotificationFactory
{

    private static final String TAG;
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
        android.support.v4.app.NotificationCompat.Builder builder = (new android.support.v4.app.NotificationCompat.Builder(context)).setAutoCancel(true);
        AppboyNotificationUtils.setTitleIfPresent(builder, bundle);
        AppboyNotificationUtils.setContentIfPresent(builder, bundle);
        AppboyNotificationUtils.setTickerIfPresent(builder, bundle);
        AppboyNotificationUtils.setContentIntentIfPresent(context, builder, bundle);
        int i = AppboyNotificationUtils.setSmallIcon(xmlappconfigurationprovider, builder);
        AppboyNotificationUtils.setLargeIconIfPresentAndSupported(context, xmlappconfigurationprovider, builder);
        AppboyNotificationUtils.setSoundIfPresentAndSupported(builder, bundle);
        if (android.os.Build.VERSION.SDK_INT >= 11 && android.os.Build.VERSION.SDK_INT < 16)
        {
            android.widget.RemoteViews remoteviews = AppboyNotificationRemoteViewsUtils.createMultiLineContentNotificationView(context, bundle, i);
            if (remoteviews != null)
            {
                builder.setContent(remoteviews);
                return builder.build();
            }
        }
        AppboyNotificationUtils.setSummaryTextIfPresentAndSupported(builder, bundle);
        AppboyNotificationUtils.setPriorityIfPresentAndSupported(builder, bundle);
        AppboyNotificationUtils.setStyleIfSupported(context, builder, bundle, bundle1);
        AppboyNotificationActionUtils.addNotificationActions(context, builder, bundle);
        AppboyNotificationUtils.setAccentColorIfPresentAndSupported(xmlappconfigurationprovider, builder, bundle);
        AppboyNotificationUtils.setCategoryIfPresentAndSupported(builder, bundle);
        AppboyNotificationUtils.setVisibilityIfPresentAndSupported(builder, bundle);
        AppboyNotificationUtils.setPublicVersionIfPresentAndSupported(context, xmlappconfigurationprovider, builder, bundle);
        AppboyWearableNotificationUtils.setWearableNotificationFeaturesIfPresentAndSupported(context, builder, bundle);
        return builder.build();
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/push/AppboyNotificationFactory.getName()
        });
    }
}
