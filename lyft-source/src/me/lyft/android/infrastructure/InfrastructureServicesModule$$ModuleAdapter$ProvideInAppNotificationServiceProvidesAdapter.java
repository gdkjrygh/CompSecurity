// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.notifications.InAppNotificationService;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding bus;
    private Binding dialogFlow;
    private Binding lyftApi;
    private Binding lyftPreferences;
    private final InfrastructureServicesModule module;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public InAppNotificationService get()
    {
        return module.provideInAppNotificationService((ILyftApi)lyftApi.get(), (IUserProvider)userProvider.get(), (MessageBus)bus.get(), (ILyftPreferences)lyftPreferences.get(), (DialogFlow)dialogFlow.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(lyftApi);
        set.add(userProvider);
        set.add(bus);
        set.add(lyftPreferences);
        set.add(dialogFlow);
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.notifications.InAppNotificationService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideInAppNotificationService");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
