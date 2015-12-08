// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.notifications:
//            C2dmNotificationIntentProcessor, NotificationClient, NotificationProcessor, NotificationPersistenceManager

public final class a extends Binding
    implements Provider
{

    private Binding appControl;
    private Binding notificationClient;
    private Binding notificationPersistenceManager;
    private Binding notificationProcessor;
    private Binding userEventLogger;

    public final void attach(Linker linker)
    {
        notificationClient = linker.requestBinding("com.google.android.apps.wallet.notifications.NotificationClient", com/google/android/apps/wallet/notifications/C2dmNotificationIntentProcessor, getClass().getClassLoader());
        notificationProcessor = linker.requestBinding("com.google.android.apps.wallet.notifications.NotificationProcessor", com/google/android/apps/wallet/notifications/C2dmNotificationIntentProcessor, getClass().getClassLoader());
        appControl = linker.requestBinding("com.google.android.apps.wallet.config.appcontrol.AppControl", com/google/android/apps/wallet/notifications/C2dmNotificationIntentProcessor, getClass().getClassLoader());
        userEventLogger = linker.requestBinding("com.google.android.apps.wallet.userevents.UserEventLogger", com/google/android/apps/wallet/notifications/C2dmNotificationIntentProcessor, getClass().getClassLoader());
        notificationPersistenceManager = linker.requestBinding("com.google.android.apps.wallet.notifications.NotificationPersistenceManager", com/google/android/apps/wallet/notifications/C2dmNotificationIntentProcessor, getClass().getClassLoader());
    }

    public final C2dmNotificationIntentProcessor get()
    {
        return new C2dmNotificationIntentProcessor((NotificationClient)notificationClient.get(), (NotificationProcessor)notificationProcessor.get(), (AppControl)appControl.get(), (UserEventLogger)userEventLogger.get(), (NotificationPersistenceManager)notificationPersistenceManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(notificationClient);
        set.add(notificationProcessor);
        set.add(appControl);
        set.add(userEventLogger);
        set.add(notificationPersistenceManager);
    }

    public a()
    {
        super("com.google.android.apps.wallet.notifications.C2dmNotificationIntentProcessor", "members/com.google.android.apps.wallet.notifications.C2dmNotificationIntentProcessor", false, com/google/android/apps/wallet/notifications/C2dmNotificationIntentProcessor);
    }
}
