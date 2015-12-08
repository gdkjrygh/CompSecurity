// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.infrastructure.paypal.IPayPalService;

// Referenced classes of package me.lyft.android.infrastructure:
//            InfrastructureServicesModule

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding chargeAccountsProvider;
    private final InfrastructureServicesModule module;
    private Binding passengerRideProvider;
    private Binding rideRequestSession;

    public void attach(Linker linker)
    {
        chargeAccountsProvider = linker.requestBinding("me.lyft.android.application.payment.IChargeAccountsProvider", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/infrastructure/InfrastructureServicesModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public IPayPalService get()
    {
        return module.provideIPayPalService((IChargeAccountsProvider)chargeAccountsProvider.get(), (IRideRequestSession)rideRequestSession.get(), (IPassengerRideProvider)passengerRideProvider.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(chargeAccountsProvider);
        set.add(rideRequestSession);
        set.add(passengerRideProvider);
    }

    public (InfrastructureServicesModule infrastructureservicesmodule)
    {
        super("me.lyft.android.infrastructure.paypal.IPayPalService", true, "me.lyft.android.infrastructure.InfrastructureServicesModule", "provideIPayPalService");
        module = infrastructureservicesmodule;
        setLibrary(true);
    }
}
