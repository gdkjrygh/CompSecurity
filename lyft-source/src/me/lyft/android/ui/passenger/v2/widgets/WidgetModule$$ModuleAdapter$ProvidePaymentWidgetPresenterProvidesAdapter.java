// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.widgets;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter;

// Referenced classes of package me.lyft.android.ui.passenger.v2.widgets:
//            WidgetModule, PaymentWidgetPresenter

public final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding chargeAccountsProvider;
    private final WidgetModule module;
    private Binding router;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        chargeAccountsProvider = linker.requestBinding("me.lyft.android.application.payment.IChargeAccountsProvider", me/lyft/android/ui/passenger/v2/widgets/WidgetModule, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/passenger/v2/widgets/WidgetModule, getClass().getClassLoader());
        router = linker.requestBinding("me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter", me/lyft/android/ui/passenger/v2/widgets/WidgetModule, getClass().getClassLoader());
    }

    public volatile Object get()
    {
        return get();
    }

    public PaymentWidgetPresenter get()
    {
        return module.providePaymentWidgetPresenter((IChargeAccountsProvider)chargeAccountsProvider.get(), (IUserProvider)userProvider.get(), (PassengerRequestRideRouter)router.get());
    }

    public void getDependencies(Set set, Set set1)
    {
        set.add(chargeAccountsProvider);
        set.add(userProvider);
        set.add(router);
    }

    public (WidgetModule widgetmodule)
    {
        super("me.lyft.android.ui.passenger.v2.widgets.PaymentWidgetPresenter", true, "me.lyft.android.ui.passenger.v2.widgets.WidgetModule", "providePaymentWidgetPresenter");
        module = widgetmodule;
        setLibrary(false);
    }
}
