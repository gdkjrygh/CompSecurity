// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.IUserSession;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.application.ride.IPreRideInfoRepository;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PaymentWidgetContainerView

public final class  extends Binding
    implements MembersInjector
{

    private Binding bus;
    private Binding chargeAccountsProvider;
    private Binding constantsProvider;
    private Binding preRideInfoRepository;
    private Binding rideRequestSession;
    private Binding userSession;

    public void attach(Linker linker)
    {
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/passenger/PaymentWidgetContainerView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/passenger/PaymentWidgetContainerView, getClass().getClassLoader());
        rideRequestSession = linker.requestBinding("me.lyft.android.application.ride.IRideRequestSession", me/lyft/android/ui/passenger/PaymentWidgetContainerView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/passenger/PaymentWidgetContainerView, getClass().getClassLoader());
        chargeAccountsProvider = linker.requestBinding("me.lyft.android.application.payment.IChargeAccountsProvider", me/lyft/android/ui/passenger/PaymentWidgetContainerView, getClass().getClassLoader());
        preRideInfoRepository = linker.requestBinding("me.lyft.android.application.ride.IPreRideInfoRepository", me/lyft/android/ui/passenger/PaymentWidgetContainerView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(userSession);
        set1.add(constantsProvider);
        set1.add(rideRequestSession);
        set1.add(bus);
        set1.add(chargeAccountsProvider);
        set1.add(preRideInfoRepository);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PaymentWidgetContainerView)obj);
    }

    public void injectMembers(PaymentWidgetContainerView paymentwidgetcontainerview)
    {
        paymentwidgetcontainerview.userSession = (IUserSession)userSession.get();
        paymentwidgetcontainerview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        paymentwidgetcontainerview.rideRequestSession = (IRideRequestSession)rideRequestSession.get();
        paymentwidgetcontainerview.bus = (MessageBus)bus.get();
        paymentwidgetcontainerview.chargeAccountsProvider = (IChargeAccountsProvider)chargeAccountsProvider.get();
        paymentwidgetcontainerview.preRideInfoRepository = (IPreRideInfoRepository)preRideInfoRepository.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.PaymentWidgetContainerView", false, me/lyft/android/ui/passenger/PaymentWidgetContainerView);
    }
}
