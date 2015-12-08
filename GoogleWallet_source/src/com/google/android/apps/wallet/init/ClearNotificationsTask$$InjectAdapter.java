// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import android.app.Application;
import com.google.android.apps.wallet.notifications.LegacyNotificationProtoManager;
import com.google.android.apps.wallet.notifications.NotificationPersistenceManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.init:
//            ClearNotificationsTask

public final class r extends Binding
    implements Provider
{

    private Binding application;
    private Binding notificationPersistenceManager;
    private Binding notificationProtoManager;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/init/ClearNotificationsTask, getClass().getClassLoader());
        notificationProtoManager = linker.requestBinding("com.google.android.apps.wallet.notifications.LegacyNotificationProtoManager", com/google/android/apps/wallet/init/ClearNotificationsTask, getClass().getClassLoader());
        notificationPersistenceManager = linker.requestBinding("com.google.android.apps.wallet.notifications.NotificationPersistenceManager", com/google/android/apps/wallet/init/ClearNotificationsTask, getClass().getClassLoader());
    }

    public final ClearNotificationsTask get()
    {
        return new ClearNotificationsTask((Application)application.get(), (LegacyNotificationProtoManager)notificationProtoManager.get(), (NotificationPersistenceManager)notificationPersistenceManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
        set.add(notificationProtoManager);
        set.add(notificationPersistenceManager);
    }

    public r()
    {
        super("com.google.android.apps.wallet.init.ClearNotificationsTask", "members/com.google.android.apps.wallet.init.ClearNotificationsTask", false, com/google/android/apps/wallet/init/ClearNotificationsTask);
    }
}
