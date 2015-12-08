// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.destination;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2;
import me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui.passenger.v2.destination:
//            SetDestinationModule, SetDestinationPresenter

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding displayManager;
    private Binding geoService;
    private Binding locationService;
    private final SetDestinationModule module;
    private Binding passengerRequestRidePresenter;
    private Binding passengerRequestRidePresenterV2;
    private Binding rideMap;
    private Binding rideRequestSession;

    public void attach(Linker linker)
    {
        passengerRequestRidePresenter = linker.requestBinding("me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2", me/lyft/android/ui/passenger/v2/destination/SetDestinationModule, getClass().getClassLoader());
        rideMap = linker.requestBinding("me.lyft.android.ui.ride.RideMap", me/lyft/android/ui/passenger/v2/destination/SetDestinationModule, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/ui/passenger/v2/destination/SetDestinationModule, getClass().getClassLoader());
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/ui/passenger/v2/destination/SetDestinationModule, getClass().getClassLoader());
        geoService = linker.requestBinding("me.lyft.android.application.geo.IGeoService", me/lyft/android/ui/passenger/v2/destination/SetDestinationModule, getClass().getClassLoader());
        displayManager = linker.requestBinding("me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter", me/lyft/android/ui/passenger/v2/destination/SetDestinationModule, getClass().getClassLoader());
        passengerRequestRidePresenterV2 = linker.requestBinding("me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2", me/lyft/android/ui/passenger/v2/destination/SetDestinationModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public SetDestinationPresenter get()
    {
        return module.provideSetDestinationPresenter((PassengerRequestRidePresenterV2)passengerRequestRidePresenter.get(), (RideMap)rideMap.get(), (ILocationService)locationService.get(), (IRideRequestSession)rideRequestSession.get(), (IGeoService)geoService.get(), (PassengerRequestRideRouter)displayManager.get(), (PassengerRequestRidePresenterV2)passengerRequestRidePresenterV2.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(passengerRequestRidePresenter);
        set.add(rideMap);
        set.add(locationService);
        set.add(rideRequestSession);
        set.add(geoService);
        set.add(displayManager);
        set.add(passengerRequestRidePresenterV2);
    }

    public (SetDestinationModule setdestinationmodule)
    {
        super("me.lyft.android.ui.passenger.v2.destination.SetDestinationPresenter", true, "me.lyft.android.ui.passenger.v2.destination.SetDestinationModule", "provideSetDestinationPresenter");
        module = setdestinationmodule;
        setLibrary(false);
    }
}
