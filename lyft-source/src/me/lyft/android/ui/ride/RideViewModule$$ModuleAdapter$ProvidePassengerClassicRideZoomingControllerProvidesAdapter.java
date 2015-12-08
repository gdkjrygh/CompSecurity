// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ride;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.ui.passenger.PassengerActiveRideZoomingController;

// Referenced classes of package me.lyft.android.ui.ride:
//            RideViewModule, RideMap

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding locationService;
    private final RideViewModule module;
    private Binding passengerRideProvider;
    private Binding rideMap;

    public void attach(Linker linker)
    {
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/ui/ride/RideViewModule, getClass().getClassLoader());
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/ride/RideViewModule, getClass().getClassLoader());
        rideMap = linker.requestBinding("me.lyft.android.ui.ride.RideMap", me/lyft/android/ui/ride/RideViewModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public PassengerActiveRideZoomingController get()
    {
        return module.providePassengerClassicRideZoomingController((ILocationService)locationService.get(), (IPassengerRideProvider)passengerRideProvider.get(), (RideMap)rideMap.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(locationService);
        set.add(passengerRideProvider);
        set.add(rideMap);
    }

    public (RideViewModule rideviewmodule)
    {
        super("me.lyft.android.ui.passenger.PassengerActiveRideZoomingController", false, "me.lyft.android.ui.ride.RideViewModule", "providePassengerClassicRideZoomingController");
        module = rideviewmodule;
        setLibrary(true);
    }
}
