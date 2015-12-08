// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.application.ride.IDriverRouteService;
import me.lyft.android.application.ride.IRatingSession;
import me.lyft.android.infrastructure.googleplaces.IGooglePlaceService;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.ILyftApi;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule, IUserProvider

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding googlePlaceService;
    private Binding locationService;
    private Binding lyftApi;
    private final ApplicationServicesModule module;
    private Binding ratingSession;
    private Binding routeProvider;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        routeProvider = linker.requestBinding("me.lyft.android.application.ride.IDriverRideProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        googlePlaceService = linker.requestBinding("me.lyft.android.infrastructure.googleplaces.IGooglePlaceService", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        ratingSession = linker.requestBinding("me.lyft.android.application.ride.IRatingSession", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IDriverRouteService get()
    {
        return module.provideRouteService((ILyftApi)lyftApi.get(), (IDriverRideProvider)routeProvider.get(), (ILocationService)locationService.get(), (IUserProvider)userProvider.get(), (IGooglePlaceService)googlePlaceService.get(), (IRatingSession)ratingSession.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(lyftApi);
        set.add(routeProvider);
        set.add(locationService);
        set.add(userProvider);
        set.add(googlePlaceService);
        set.add(ratingSession);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.ride.IDriverRouteService", true, "me.lyft.android.application.ApplicationServicesModule", "provideRouteService");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
