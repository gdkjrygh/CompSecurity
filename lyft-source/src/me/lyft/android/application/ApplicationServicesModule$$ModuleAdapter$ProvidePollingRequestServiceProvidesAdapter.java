// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.IUserSession;
import me.lyft.android.application.geo.IEtaAnalyticService;
import me.lyft.android.application.polling.ILocationUpdateService;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.ILyftApi;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule, IConstantsProvider

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding appForegroundDetector;
    private Binding constantsProvider;
    private Binding device;
    private Binding etaAnalyticService;
    private Binding locationService;
    private Binding lyftApi;
    private final ApplicationServicesModule module;
    private Binding rideRequestSession;
    private Binding userSession;

    public void attach(Linker linker)
    {
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        appForegroundDetector = linker.requestBinding("me.lyft.android.infrastructure.foreground.IAppForegroundDetector", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        etaAnalyticService = linker.requestBinding("me.lyft.android.application.geo.IEtaAnalyticService", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public ILocationUpdateService get()
    {
        return module.providePollingRequestService((ILocationService)locationService.get(), (IUserSession)userSession.get(), (IAppForegroundDetector)appForegroundDetector.get(), (IRideRequestSession)rideRequestSession.get(), (IEtaAnalyticService)etaAnalyticService.get(), (ILyftApi)lyftApi.get(), (IConstantsProvider)constantsProvider.get(), (IDevice)device.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(locationService);
        set.add(userSession);
        set.add(appForegroundDetector);
        set.add(rideRequestSession);
        set.add(etaAnalyticService);
        set.add(lyftApi);
        set.add(constantsProvider);
        set.add(device);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.polling.ILocationUpdateService", true, "me.lyft.android.application.ApplicationServicesModule", "providePollingRequestService");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
