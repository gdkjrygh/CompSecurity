// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import android.app.Application;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.notifications:
//            NotificationsModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding application;
    private final NotificationsModule module;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/notifications/NotificationsModule, getClass().getClassLoader());
    }

    public final android.support.v4.app.uilderProvidesAdapter get()
    {
        NotificationsModule notificationsmodule = module;
        return NotificationsModule.provideNotificationBuilder((Application)application.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
    }

    public (NotificationsModule notificationsmodule)
    {
        super("android.support.v4.app.NotificationCompat$Builder", false, "com.google.android.apps.wallet.notifications.NotificationsModule", "provideNotificationBuilder");
        module = notificationsmodule;
        setLibrary(true);
    }
}
