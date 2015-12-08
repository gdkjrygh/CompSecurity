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
import me.lyft.android.application.ride.IPreRideInfoRepository;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.infrastructure.location.ILocationService;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule, IConstantsProvider

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding constantsProvider;
    private Binding locationService;
    private final ApplicationServicesModule module;
    private Binding preRideInfoRepository;
    private Binding preferences;
    private Binding requestRideTypeProvider;

    public void attach(Linker linker)
    {
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        requestRideTypeProvider = linker.requestBinding("me.lyft.android.application.ride.IRequestRideTypeProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        preRideInfoRepository = linker.requestBinding("me.lyft.android.application.ride.IPreRideInfoRepository", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IRideRequestSession get()
    {
        return module.provideRideRequestSession((ILyftPreferences)preferences.get(), (ILocationService)locationService.get(), (IRequestRideTypeProvider)requestRideTypeProvider.get(), (IPreRideInfoRepository)preRideInfoRepository.get(), (IConstantsProvider)constantsProvider.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(preferences);
        set.add(locationService);
        set.add(requestRideTypeProvider);
        set.add(preRideInfoRepository);
        set.add(constantsProvider);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.ride.IRideRequestSession", true, "me.lyft.android.application.ApplicationServicesModule", "provideRideRequestSession");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
