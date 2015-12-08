// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.pickup;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.facades.UserModeSwitchFacade;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2;
import me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui.passenger.v2.pickup:
//            SetPickupModule, SetPickupPresenter

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding constantsProvider;
    private Binding displayManager;
    private Binding geoService;
    private Binding locationService;
    private final SetPickupModule module;
    private Binding requestRidePresenter;
    private Binding requestRideTypeProvider;
    private Binding rideMap;
    private Binding rideRequestSession;
    private Binding userModeSwitchFacade;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/ui/passenger/v2/pickup/SetPickupModule, getClass().getClassLoader());
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/ui/passenger/v2/pickup/SetPickupModule, getClass().getClassLoader());
        geoService = linker.requestBinding("me.lyft.android.application.geo.IGeoService", me/lyft/android/ui/passenger/v2/pickup/SetPickupModule, getClass().getClassLoader());
        requestRideTypeProvider = linker.requestBinding("me.lyft.android.application.ride.IRequestRideTypeProvider", me/lyft/android/ui/passenger/v2/pickup/SetPickupModule, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/passenger/v2/pickup/SetPickupModule, getClass().getClassLoader());
        rideMap = linker.requestBinding("me.lyft.android.ui.ride.RideMap", me/lyft/android/ui/passenger/v2/pickup/SetPickupModule, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/passenger/v2/pickup/SetPickupModule, getClass().getClassLoader());
        userModeSwitchFacade = linker.requestBinding("me.lyft.android.facades.UserModeSwitchFacade", me/lyft/android/ui/passenger/v2/pickup/SetPickupModule, getClass().getClassLoader());
        requestRidePresenter = linker.requestBinding("me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2", me/lyft/android/ui/passenger/v2/pickup/SetPickupModule, getClass().getClassLoader());
        displayManager = linker.requestBinding("me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter", me/lyft/android/ui/passenger/v2/pickup/SetPickupModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public SetPickupPresenter get()
    {
        return module.provideSetPickupPresenter((ILocationService)locationService.get(), (IRideRequestSession)rideRequestSession.get(), (IGeoService)geoService.get(), (IRequestRideTypeProvider)requestRideTypeProvider.get(), (IConstantsProvider)constantsProvider.get(), (RideMap)rideMap.get(), (IUserProvider)userProvider.get(), (UserModeSwitchFacade)userModeSwitchFacade.get(), (PassengerRequestRidePresenterV2)requestRidePresenter.get(), (PassengerRequestRideRouter)displayManager.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(locationService);
        set.add(rideRequestSession);
        set.add(geoService);
        set.add(requestRideTypeProvider);
        set.add(constantsProvider);
        set.add(rideMap);
        set.add(userProvider);
        set.add(userModeSwitchFacade);
        set.add(requestRidePresenter);
        set.add(displayManager);
    }

    public (SetPickupModule setpickupmodule)
    {
        super("me.lyft.android.ui.passenger.v2.pickup.SetPickupPresenter", true, "me.lyft.android.ui.passenger.v2.pickup.SetPickupModule", "provideSetPickupPresenter");
        module = setpickupmodule;
        setLibrary(false);
    }
}
