// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.pickup;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2;
import me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter;

// Referenced classes of package me.lyft.android.ui.passenger.v2.pickup:
//            SetPickupModule, RideTypeSwitcherPresenter

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding constantsProvider;
    private Binding displayManager;
    private final SetPickupModule module;
    private Binding passengerRequestRidePresenter;
    private Binding preferences;
    private Binding requestRideTypeProvider;
    private Binding rideRequestSession;

    public void attach(Linker linker)
    {
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/ui/passenger/v2/pickup/SetPickupModule, getClass().getClassLoader());
        requestRideTypeProvider = linker.requestBinding("me.lyft.android.application.ride.IRequestRideTypeProvider", me/lyft/android/ui/passenger/v2/pickup/SetPickupModule, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/passenger/v2/pickup/SetPickupModule, getClass().getClassLoader());
        passengerRequestRidePresenter = linker.requestBinding("me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2", me/lyft/android/ui/passenger/v2/pickup/SetPickupModule, getClass().getClassLoader());
        preferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/passenger/v2/pickup/SetPickupModule, getClass().getClassLoader());
        displayManager = linker.requestBinding("me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter", me/lyft/android/ui/passenger/v2/pickup/SetPickupModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public RideTypeSwitcherPresenter get()
    {
        return module.provideRideTypeSwitcherPresenter((IRideRequestSession)rideRequestSession.get(), (IRequestRideTypeProvider)requestRideTypeProvider.get(), (IConstantsProvider)constantsProvider.get(), (PassengerRequestRidePresenterV2)passengerRequestRidePresenter.get(), (ILyftPreferences)preferences.get(), (PassengerRequestRideRouter)displayManager.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(rideRequestSession);
        set.add(requestRideTypeProvider);
        set.add(constantsProvider);
        set.add(passengerRequestRidePresenter);
        set.add(preferences);
        set.add(displayManager);
    }

    public (SetPickupModule setpickupmodule)
    {
        super("me.lyft.android.ui.passenger.v2.pickup.RideTypeSwitcherPresenter", true, "me.lyft.android.ui.passenger.v2.pickup.SetPickupModule", "provideRideTypeSwitcherPresenter");
        module = setpickupmodule;
        setLibrary(false);
    }
}
