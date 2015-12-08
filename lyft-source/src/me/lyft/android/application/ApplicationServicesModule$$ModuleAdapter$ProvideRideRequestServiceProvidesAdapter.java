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
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.application.ride.IPreRideInfoRepository;
import me.lyft.android.application.ride.IRideRequestService;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.ILyftApi;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule, IUserProvider

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding chargeAccountsProvider;
    private Binding checkoutSession;
    private Binding locationService;
    private Binding lyftApi;
    private final ApplicationServicesModule module;
    private Binding preRideInfoRepository;
    private Binding rideRequestSession;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        chargeAccountsProvider = linker.requestBinding("me.lyft.android.application.payment.IChargeAccountsProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        locationService = linker.requestBinding("me.lyft.android.infrastructure.location.ILocationService", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        preRideInfoRepository = linker.requestBinding("me.lyft.android.application.ride.IPreRideInfoRepository", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        checkoutSession = linker.requestBinding("me.lyft.android.application.checkout.ICheckoutSession", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IRideRequestService get()
    {
        return module.provideRideRequestService((IUserProvider)userProvider.get(), (IChargeAccountsProvider)chargeAccountsProvider.get(), (ILocationService)locationService.get(), (IRideRequestSession)rideRequestSession.get(), (ILyftApi)lyftApi.get(), (IPreRideInfoRepository)preRideInfoRepository.get(), (ICheckoutSession)checkoutSession.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(userProvider);
        set.add(chargeAccountsProvider);
        set.add(locationService);
        set.add(rideRequestSession);
        set.add(lyftApi);
        set.add(preRideInfoRepository);
        set.add(checkoutSession);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.ride.IRideRequestService", true, "me.lyft.android.application.ApplicationServicesModule", "provideRideRequestService");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
