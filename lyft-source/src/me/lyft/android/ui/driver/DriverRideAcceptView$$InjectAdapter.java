// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.geo.IEtaAnalyticService;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.application.ride.IDriverRouteService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.services.TimerManager;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.ride.RideMap;
import me.lyft.android.utils.SoundManager;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideAcceptView

public final class  extends Binding
    implements MembersInjector
{

    private Binding bus;
    private Binding defaultErrorHandler;
    private Binding dialogFlow;
    private Binding driverRouteService;
    private Binding etaAnalyticService;
    private Binding geoService;
    private Binding locationService;
    private Binding progressController;
    private Binding rideMap;
    private Binding routeProvider;
    private Binding soundManager;
    private Binding timerManager;

    public void attach(Linker linker)
    {
        timerManager = linker.requestBinding("me.lyft.android.services.TimerManager", me/lyft/android/ui/driver/DriverRideAcceptView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/driver/DriverRideAcceptView, getClass().getClassLoader());
        rideMap = linker.requestBinding("me.lyft.android.ui.ride.RideMap", me/lyft/android/ui/driver/DriverRideAcceptView, getClass().getClassLoader());
        geoService = linker.requestBinding("me.lyft.android.application.geo.IGeoService", me/lyft/android/ui/driver/DriverRideAcceptView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/driver/DriverRideAcceptView, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/ui/driver/DriverRideAcceptView, getClass().getClassLoader());
        soundManager = linker.requestBinding("me.lyft.android.utils.SoundManager", me/lyft/android/ui/driver/DriverRideAcceptView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/DriverRideAcceptView, getClass().getClassLoader());
        defaultErrorHandler = linker.requestBinding("me.lyft.android.errorhandling.IDefaultErrorHandler", me/lyft/android/ui/driver/DriverRideAcceptView, getClass().getClassLoader());
        routeProvider = linker.requestBinding("me.lyft.android.application.ride.IDriverRideProvider", me/lyft/android/ui/driver/DriverRideAcceptView, getClass().getClassLoader());
        driverRouteService = linker.requestBinding("me.lyft.android.application.ride.IDriverRouteService", me/lyft/android/ui/driver/DriverRideAcceptView, getClass().getClassLoader());
        etaAnalyticService = linker.requestBinding("me.lyft.android.application.geo.IEtaAnalyticService", me/lyft/android/ui/driver/DriverRideAcceptView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(timerManager);
        set1.add(progressController);
        set1.add(rideMap);
        set1.add(geoService);
        set1.add(bus);
        set1.add(locationService);
        set1.add(soundManager);
        set1.add(dialogFlow);
        set1.add(defaultErrorHandler);
        set1.add(routeProvider);
        set1.add(driverRouteService);
        set1.add(etaAnalyticService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DriverRideAcceptView)obj);
    }

    public void injectMembers(DriverRideAcceptView driverrideacceptview)
    {
        driverrideacceptview.timerManager = (TimerManager)timerManager.get();
        driverrideacceptview.progressController = (IProgressController)progressController.get();
        driverrideacceptview.rideMap = (RideMap)rideMap.get();
        driverrideacceptview.geoService = (IGeoService)geoService.get();
        driverrideacceptview.bus = (MessageBus)bus.get();
        driverrideacceptview.locationService = (ILocationService)locationService.get();
        driverrideacceptview.soundManager = (SoundManager)soundManager.get();
        driverrideacceptview.dialogFlow = (DialogFlow)dialogFlow.get();
        driverrideacceptview.defaultErrorHandler = (IDefaultErrorHandler)defaultErrorHandler.get();
        driverrideacceptview.routeProvider = (IDriverRideProvider)routeProvider.get();
        driverrideacceptview.driverRouteService = (IDriverRouteService)driverRouteService.get();
        driverrideacceptview.etaAnalyticService = (IEtaAnalyticService)etaAnalyticService.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.DriverRideAcceptView", false, me/lyft/android/ui/driver/DriverRideAcceptView);
    }
}
