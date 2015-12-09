// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing;

import android.app.Application;
import android.app.NotificationManager;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.geofencing.api.GeofencingNotificationServiceClient;
import com.google.android.apps.wallet.geofencing.api.GeofencingServiceDebugInfo;
import com.google.android.apps.wallet.notifications.LegacyNotificationProtoManager;
import com.google.android.apps.wallet.settings.UserSettingsPublisher;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.geofencing:
//            GeofencingNotificationSavedWobHandler

public final class  extends Binding
    implements Provider
{

    private Binding analyticsUtil;
    private Binding context;
    private Binding geofencingNotificationServiceClient;
    private Binding geofencingServiceDebugInfo;
    private Binding notificationBuilderProvider;
    private Binding notificationManager;
    private Binding notificationProtoManager;
    private Binding userEventLogger;
    private Binding userSettingsPublisher;

    public final void attach(Linker linker)
    {
        context = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/geofencing/GeofencingNotificationSavedWobHandler, getClass().getClassLoader());
        notificationManager = linker.requestBinding("android.app.NotificationManager", com/google/android/apps/wallet/geofencing/GeofencingNotificationSavedWobHandler, getClass().getClassLoader());
        notificationProtoManager = linker.requestBinding("com.google.android.apps.wallet.notifications.LegacyNotificationProtoManager", com/google/android/apps/wallet/geofencing/GeofencingNotificationSavedWobHandler, getClass().getClassLoader());
        userSettingsPublisher = linker.requestBinding("com.google.android.apps.wallet.settings.UserSettingsPublisher", com/google/android/apps/wallet/geofencing/GeofencingNotificationSavedWobHandler, getClass().getClassLoader());
        userEventLogger = linker.requestBinding("com.google.android.apps.wallet.userevents.UserEventLogger", com/google/android/apps/wallet/geofencing/GeofencingNotificationSavedWobHandler, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/geofencing/GeofencingNotificationSavedWobHandler, getClass().getClassLoader());
        geofencingServiceDebugInfo = linker.requestBinding("com.google.android.apps.wallet.geofencing.api.GeofencingServiceDebugInfo", com/google/android/apps/wallet/geofencing/GeofencingNotificationSavedWobHandler, getClass().getClassLoader());
        notificationBuilderProvider = linker.requestBinding("javax.inject.Provider<android.support.v4.app.NotificationCompat$Builder>", com/google/android/apps/wallet/geofencing/GeofencingNotificationSavedWobHandler, getClass().getClassLoader());
        geofencingNotificationServiceClient = linker.requestBinding("com.google.android.apps.wallet.geofencing.api.GeofencingNotificationServiceClient", com/google/android/apps/wallet/geofencing/GeofencingNotificationSavedWobHandler, getClass().getClassLoader());
    }

    public final GeofencingNotificationSavedWobHandler get()
    {
        return new GeofencingNotificationSavedWobHandler((Application)context.get(), (NotificationManager)notificationManager.get(), (LegacyNotificationProtoManager)notificationProtoManager.get(), (UserSettingsPublisher)userSettingsPublisher.get(), (UserEventLogger)userEventLogger.get(), (AnalyticsUtil)analyticsUtil.get(), (GeofencingServiceDebugInfo)geofencingServiceDebugInfo.get(), (Provider)notificationBuilderProvider.get(), (GeofencingNotificationServiceClient)geofencingNotificationServiceClient.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(notificationManager);
        set.add(notificationProtoManager);
        set.add(userSettingsPublisher);
        set.add(userEventLogger);
        set.add(analyticsUtil);
        set.add(geofencingServiceDebugInfo);
        set.add(notificationBuilderProvider);
        set.add(geofencingNotificationServiceClient);
    }

    public ()
    {
        super("com.google.android.apps.wallet.geofencing.GeofencingNotificationSavedWobHandler", "members/com.google.android.apps.wallet.geofencing.GeofencingNotificationSavedWobHandler", false, com/google/android/apps/wallet/geofencing/GeofencingNotificationSavedWobHandler);
    }
}
