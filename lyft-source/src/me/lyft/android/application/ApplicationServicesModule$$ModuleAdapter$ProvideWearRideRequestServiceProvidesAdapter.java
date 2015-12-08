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
import me.lyft.android.application.ride.IWearRideRequestService;
import me.lyft.android.infrastructure.lyft.ILyftApi;

// Referenced classes of package me.lyft.android.application:
//            ApplicationServicesModule, IUserProvider

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding chargeAccountsProvider;
    private Binding checkoutSession;
    private Binding lyftApi;
    private final ApplicationServicesModule module;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        chargeAccountsProvider = linker.requestBinding("me.lyft.android.application.payment.IChargeAccountsProvider", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
        checkoutSession = linker.requestBinding("me.lyft.android.application.checkout.ICheckoutSession", me/lyft/android/application/ApplicationServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IWearRideRequestService get()
    {
        return module.provideWearRideRequestService((IUserProvider)userProvider.get(), (IChargeAccountsProvider)chargeAccountsProvider.get(), (ILyftApi)lyftApi.get(), (ICheckoutSession)checkoutSession.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(userProvider);
        set.add(chargeAccountsProvider);
        set.add(lyftApi);
        set.add(checkoutSession);
    }

    public (ApplicationServicesModule applicationservicesmodule)
    {
        super("me.lyft.android.application.ride.IWearRideRequestService", false, "me.lyft.android.application.ApplicationServicesModule", "provideWearRideRequestService");
        module = applicationservicesmodule;
        setLibrary(true);
    }
}
