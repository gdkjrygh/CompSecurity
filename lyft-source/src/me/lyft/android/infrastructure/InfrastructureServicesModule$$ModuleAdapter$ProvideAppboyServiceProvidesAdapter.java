// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.appboy.IAppboyService;
import me.lyft.android.infrastructure.gcm.IGcmIdService;
import me.lyft.android.infrastructure.notifications.InAppNotificationService;
import me.lyft.android.managers.ImageLoader;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding dialogFlow;
    private Binding gcmIdService;
    private Binding imageLoader;
    private Binding inAppNotificationService;
    private final InfrastructureServicesModule module;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        gcmIdService = linker.requestBinding("me.lyft.android.infrastructure.gcm.IGcmIdService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        inAppNotificationService = linker.requestBinding("me.lyft.android.infrastructure.notifications.InAppNotificationService", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IAppboyService get()
    {
        return module.provideAppboyService((IUserProvider)userProvider.get(), (IGcmIdService)gcmIdService.get(), (DialogFlow)dialogFlow.get(), (ImageLoader)imageLoader.get(), (InAppNotificationService)inAppNotificationService.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(userProvider);
        set.add(gcmIdService);
        set.add(dialogFlow);
        set.add(imageLoader);
        set.add(inAppNotificationService);
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.appboy.IAppboyService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideAppboyService");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
