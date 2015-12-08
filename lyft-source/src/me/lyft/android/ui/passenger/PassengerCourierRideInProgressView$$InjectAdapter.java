// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IRideFareRepository;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerCourierRideInProgressView, PassengerActiveRideZoomingController

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding bus;
    private Binding dialogFlow;
    private Binding geoService;
    private Binding locationService;
    private Binding lyftPreferences;
    private Binding passengerActiveRideZoomingController;
    private Binding passengerRideProvider;
    private Binding rideFareRepository;
    private Binding rideMap;
    private Binding slideMenuController;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/passenger/PassengerCourierRideInProgressView, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/passenger/PassengerCourierRideInProgressView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/PassengerCourierRideInProgressView, getClass().getClassLoader());
        rideMap = linker.requestBinding("me.lyft.android.ui.ride.RideMap", me/lyft/android/ui/passenger/PassengerCourierRideInProgressView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/passenger/PassengerCourierRideInProgressView, getClass().getClassLoader());
        geoService = linker.requestBinding("me.lyft.android.application.geo.IGeoService", me/lyft/android/ui/passenger/PassengerCourierRideInProgressView, getClass().getClassLoader());
        slideMenuController = linker.requestBinding("me.lyft.android.ui.SlideMenuController", me/lyft/android/ui/passenger/PassengerCourierRideInProgressView, getClass().getClassLoader());
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/passenger/PassengerCourierRideInProgressView, getClass().getClassLoader());
        rideFareRepository = linker.requestBinding("me.lyft.android.application.ride.IRideFareRepository", me/lyft/android/ui/passenger/PassengerCourierRideInProgressView, getClass().getClassLoader());
        passengerActiveRideZoomingController = linker.requestBinding("me.lyft.android.ui.passenger.PassengerActiveRideZoomingController", me/lyft/android/ui/passenger/PassengerCourierRideInProgressView, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/ui/passenger/PassengerCourierRideInProgressView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(lyftPreferences);
        set1.add(dialogFlow);
        set1.add(rideMap);
        set1.add(bus);
        set1.add(geoService);
        set1.add(slideMenuController);
        set1.add(passengerRideProvider);
        set1.add(rideFareRepository);
        set1.add(passengerActiveRideZoomingController);
        set1.add(locationService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerCourierRideInProgressView)obj);
    }

    public void injectMembers(PassengerCourierRideInProgressView passengercourierrideinprogressview)
    {
        passengercourierrideinprogressview.appFlow = (AppFlow)appFlow.get();
        passengercourierrideinprogressview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        passengercourierrideinprogressview.dialogFlow = (DialogFlow)dialogFlow.get();
        passengercourierrideinprogressview.rideMap = (RideMap)rideMap.get();
        passengercourierrideinprogressview.bus = (MessageBus)bus.get();
        passengercourierrideinprogressview.geoService = (IGeoService)geoService.get();
        passengercourierrideinprogressview.slideMenuController = (SlideMenuController)slideMenuController.get();
        passengercourierrideinprogressview.passengerRideProvider = (IPassengerRideProvider)passengerRideProvider.get();
        passengercourierrideinprogressview.rideFareRepository = (IRideFareRepository)rideFareRepository.get();
        passengercourierrideinprogressview.passengerActiveRideZoomingController = (PassengerActiveRideZoomingController)passengerActiveRideZoomingController.get();
        passengercourierrideinprogressview.locationService = (ILocationService)locationService.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.PassengerCourierRideInProgressView", false, me/lyft/android/ui/passenger/PassengerCourierRideInProgressView);
    }
}
