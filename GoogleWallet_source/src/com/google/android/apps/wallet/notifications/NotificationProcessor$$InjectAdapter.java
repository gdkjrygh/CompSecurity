// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import android.app.Application;
import android.app.NotificationManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.settings.UserSettingsPublisher;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.notifications:
//            NotificationProcessor

public final class  extends Binding
    implements Provider
{

    private Binding context;
    private Binding eventBus;
    private Binding notificationBuilderProvider;
    private Binding notificationManager;
    private Binding userSettingsPublisher;

    public final void attach(Linker linker)
    {
        context = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/notifications/NotificationProcessor, getClass().getClassLoader());
        notificationManager = linker.requestBinding("android.app.NotificationManager", com/google/android/apps/wallet/notifications/NotificationProcessor, getClass().getClassLoader());
        notificationBuilderProvider = linker.requestBinding("javax.inject.Provider<android.support.v4.app.NotificationCompat$Builder>", com/google/android/apps/wallet/notifications/NotificationProcessor, getClass().getClassLoader());
        userSettingsPublisher = linker.requestBinding("com.google.android.apps.wallet.settings.UserSettingsPublisher", com/google/android/apps/wallet/notifications/NotificationProcessor, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/notifications/NotificationProcessor, getClass().getClassLoader());
    }

    public final NotificationProcessor get()
    {
        return new NotificationProcessor((Application)context.get(), (NotificationManager)notificationManager.get(), (Provider)notificationBuilderProvider.get(), (UserSettingsPublisher)userSettingsPublisher.get(), (EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(notificationManager);
        set.add(notificationBuilderProvider);
        set.add(userSettingsPublisher);
        set.add(eventBus);
    }

    public ()
    {
        super("com.google.android.apps.wallet.notifications.NotificationProcessor", "members/com.google.android.apps.wallet.notifications.NotificationProcessor", false, com/google/android/apps/wallet/notifications/NotificationProcessor);
    }
}
