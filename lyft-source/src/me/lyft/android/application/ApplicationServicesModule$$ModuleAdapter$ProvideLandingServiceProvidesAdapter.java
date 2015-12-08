// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.landing.ILandingService;
import me.lyft.android.infrastructure.facebook.IFacebookService;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.persistence.landing.ISignUpUserRepository;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule, IUserProvider

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding facebookService;
    private Binding locationService;
    private Binding lyftApi;
    private final ApplicationServicesModule module;
    private Binding preferences;
    private Binding singUpUserRepository;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        singUpUserRepository = linker.requestBinding("me.lyft.android.persistence.landing.ISignUpUserRepository", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        facebookService = linker.requestBinding("me.lyft.android.infrastructure.facebook.IFacebookService", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ILandingService get()
    {
        return module.provideLandingService((ISignUpUserRepository)singUpUserRepository.get(), (IUserProvider)userProvider.get(), (ILyftApi)lyftApi.get(), (ILocationService)locationService.get(), (IFacebookService)facebookService.get(), (ILyftPreferences)preferences.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(singUpUserRepository);
        set.add(userProvider);
        set.add(lyftApi);
        set.add(locationService);
        set.add(facebookService);
        set.add(preferences);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.landing.ILandingService", true, "me.lyft.android.application.ApplicationServicesModule", "provideLandingService");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
