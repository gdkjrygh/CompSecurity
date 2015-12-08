// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.application.ride.IDriverRouteService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.flows.ProfileFlow;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.services.TimerManager;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverCourierPickupView

public final class  extends Binding
    implements MembersInjector
{

    private Binding bus;
    private Binding constantsProvider;
    private Binding dialogFlow;
    private Binding locationService;
    private Binding lyftPreferences;
    private Binding profileFlow;
    private Binding progressController;
    private Binding rideMap;
    private Binding routeProvider;
    private Binding routeService;
    private Binding timerManager;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        routeProvider = linker.requestBinding("me.lyft.android.application.ride.IDriverRideProvider", me/lyft/android/ui/driver/DriverCourierPickupView, getClass().getClassLoader());
        routeService = linker.requestBinding("me.lyft.android.application.ride.IDriverRouteService", me/lyft/android/ui/driver/DriverCourierPickupView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/driver/DriverCourierPickupView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/driver/DriverCourierPickupView, getClass().getClassLoader());
        profileFlow = linker.requestBinding("me.lyft.android.flows.ProfileFlow", me/lyft/android/ui/driver/DriverCourierPickupView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/driver/DriverCourierPickupView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/driver/DriverCourierPickupView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/driver/DriverCourierPickupView, getClass().getClassLoader());
        rideMap = linker.requestBinding("me.lyft.android.ui.ride.RideMap", me/lyft/android/ui/driver/DriverCourierPickupView, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/driver/DriverCourierPickupView, getClass().getClassLoader());
        timerManager = linker.requestBinding("me.lyft.android.services.TimerManager", me/lyft/android/ui/driver/DriverCourierPickupView, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/ui/driver/DriverCourierPickupView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(routeProvider);
        set1.add(routeService);
        set1.add(constantsProvider);
        set1.add(bus);
        set1.add(profileFlow);
        set1.add(dialogFlow);
        set1.add(progressController);
        set1.add(viewErrorHandler);
        set1.add(rideMap);
        set1.add(lyftPreferences);
        set1.add(timerManager);
        set1.add(locationService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DriverCourierPickupView)obj);
    }

    public void injectMembers(DriverCourierPickupView drivercourierpickupview)
    {
        drivercourierpickupview.routeProvider = (IDriverRideProvider)routeProvider.get();
        drivercourierpickupview.routeService = (IDriverRouteService)routeService.get();
        drivercourierpickupview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        drivercourierpickupview.bus = (MessageBus)bus.get();
        drivercourierpickupview.profileFlow = (ProfileFlow)profileFlow.get();
        drivercourierpickupview.dialogFlow = (DialogFlow)dialogFlow.get();
        drivercourierpickupview.progressController = (IProgressController)progressController.get();
        drivercourierpickupview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        drivercourierpickupview.rideMap = (RideMap)rideMap.get();
        drivercourierpickupview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        drivercourierpickupview.timerManager = (TimerManager)timerManager.get();
        drivercourierpickupview.locationService = (ILocationService)locationService.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.driver.DriverCourierPickupView", false, me/lyft/android/ui/driver/DriverCourierPickupView);
    }
}
