// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import android.app.Application;
import android.app.NotificationManager;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.settings.UserSettingsPublisher;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.notifications:
//            LegacyNotificationProcessor, LegacyNotificationProtoManager

public final class  extends Binding
    implements Provider
{

    private Binding analyticsUtil;
    private Binding context;
    private Binding notificationBuilderProvider;
    private Binding notificationManager;
    private Binding notificationProtoManager;
    private Binding userSettingsPublisher;

    public final void attach(Linker linker)
    {
        context = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/notifications/LegacyNotificationProcessor, getClass().getClassLoader());
        notificationManager = linker.requestBinding("android.app.NotificationManager", com/google/android/apps/wallet/notifications/LegacyNotificationProcessor, getClass().getClassLoader());
        notificationProtoManager = linker.requestBinding("com.google.android.apps.wallet.notifications.LegacyNotificationProtoManager", com/google/android/apps/wallet/notifications/LegacyNotificationProcessor, getClass().getClassLoader());
        userSettingsPublisher = linker.requestBinding("com.google.android.apps.wallet.settings.UserSettingsPublisher", com/google/android/apps/wallet/notifications/LegacyNotificationProcessor, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/notifications/LegacyNotificationProcessor, getClass().getClassLoader());
        notificationBuilderProvider = linker.requestBinding("javax.inject.Provider<android.support.v4.app.NotificationCompat$Builder>", com/google/android/apps/wallet/notifications/LegacyNotificationProcessor, getClass().getClassLoader());
    }

    public final LegacyNotificationProcessor get()
    {
        return new LegacyNotificationProcessor((Application)context.get(), (NotificationManager)notificationManager.get(), (LegacyNotificationProtoManager)notificationProtoManager.get(), (UserSettingsPublisher)userSettingsPublisher.get(), (AnalyticsUtil)analyticsUtil.get(), (Provider)notificationBuilderProvider.get());
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
        set.add(analyticsUtil);
        set.add(notificationBuilderProvider);
    }

    public ()
    {
        super("com.google.android.apps.wallet.notifications.LegacyNotificationProcessor", "members/com.google.android.apps.wallet.notifications.LegacyNotificationProcessor", false, com/google/android/apps/wallet/notifications/LegacyNotificationProcessor);
    }
}
