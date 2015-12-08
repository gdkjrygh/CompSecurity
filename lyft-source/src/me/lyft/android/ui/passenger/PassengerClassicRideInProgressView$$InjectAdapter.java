// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerClassicRideInProgressView, PassengerActiveRideZoomingController

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding bus;
    private Binding dialogFlow;
    private Binding geoService;
    private Binding passengerActiveRideZoomingController;
    private Binding passengerRideProvider;
    private Binding rideMap;
    private Binding slideMenuController;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/passenger/PassengerClassicRideInProgressView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/PassengerClassicRideInProgressView, getClass().getClassLoader());
        rideMap = linker.requestBinding("me.lyft.android.ui.ride.RideMap", me/lyft/android/ui/passenger/PassengerClassicRideInProgressView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/passenger/PassengerClassicRideInProgressView, getClass().getClassLoader());
        geoService = linker.requestBinding("me.lyft.android.application.geo.IGeoService", me/lyft/android/ui/passenger/PassengerClassicRideInProgressView, getClass().getClassLoader());
        slideMenuController = linker.requestBinding("me.lyft.android.ui.SlideMenuController", me/lyft/android/ui/passenger/PassengerClassicRideInProgressView, getClass().getClassLoader());
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/passenger/PassengerClassicRideInProgressView, getClass().getClassLoader());
        passengerActiveRideZoomingController = linker.requestBinding("me.lyft.android.ui.passenger.PassengerActiveRideZoomingController", me/lyft/android/ui/passenger/PassengerClassicRideInProgressView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(rideMap);
        set1.add(bus);
        set1.add(geoService);
        set1.add(slideMenuController);
        set1.add(passengerRideProvider);
        set1.add(passengerActiveRideZoomingController);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerClassicRideInProgressView)obj);
    }

    public void injectMembers(PassengerClassicRideInProgressView passengerclassicrideinprogressview)
    {
        passengerclassicrideinprogressview.appFlow = (AppFlow)appFlow.get();
        passengerclassicrideinprogressview.dialogFlow = (DialogFlow)dialogFlow.get();
        passengerclassicrideinprogressview.rideMap = (RideMap)rideMap.get();
        passengerclassicrideinprogressview.bus = (MessageBus)bus.get();
        passengerclassicrideinprogressview.geoService = (IGeoService)geoService.get();
        passengerclassicrideinprogressview.slideMenuController = (SlideMenuController)slideMenuController.get();
        passengerclassicrideinprogressview.passengerRideProvider = (IPassengerRideProvider)passengerRideProvider.get();
        passengerclassicrideinprogressview.passengerActiveRideZoomingController = (PassengerActiveRideZoomingController)passengerActiveRideZoomingController.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.PassengerClassicRideInProgressView", false, me/lyft/android/ui/passenger/PassengerClassicRideInProgressView);
    }
}
