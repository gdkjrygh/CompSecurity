// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IExpenseNoteSession;
import me.lyft.android.application.ride.IPassengerRideService;
import me.lyft.android.application.ride.IRatingSession;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.ILyftApi;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding checkoutSession;
    private Binding expenseNoteSession;
    private Binding locationService;
    private Binding lyftApi;
    private final ApplicationServicesModule module;
    private Binding passengerRideProvider;
    private Binding ratingSession;
    private Binding rideRequestSession;

    public void attach(Linker linker)
    {
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        checkoutSession = linker.requestBinding("me.lyft.android.application.checkout.ICheckoutSession", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        ratingSession = linker.requestBinding("me.lyft.android.application.ride.IRatingSession", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        expenseNoteSession = linker.requestBinding("me.lyft.android.application.ride.IExpenseNoteSession", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IPassengerRideService get()
    {
        return module.providePassengerRideService((ILyftApi)lyftApi.get(), (IPassengerRideProvider)passengerRideProvider.get(), (ICheckoutSession)checkoutSession.get(), (ILocationService)locationService.get(), (IRideRequestSession)rideRequestSession.get(), (IRatingSession)ratingSession.get(), (IExpenseNoteSession)expenseNoteSession.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(lyftApi);
        set.add(passengerRideProvider);
        set.add(checkoutSession);
        set.add(locationService);
        set.add(rideRequestSession);
        set.add(ratingSession);
        set.add(expenseNoteSession);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.ride.IPassengerRideService", true, "me.lyft.android.application.ApplicationServicesModule", "providePassengerRideService");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
