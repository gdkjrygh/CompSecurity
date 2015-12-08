// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.kyc.SplashScreenDisplay;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            OrderPlasticCardCongratulationsActivity

public final class ivity extends Binding
    implements MembersInjector, Provider
{

    private Binding display;
    private Binding eventBus;
    private Binding fullScreenProgressSpinnerManager;
    private com.google.android.apps.wallet.base.activity.wallet_plastic_OrderPlasticCardCongratulationsActivity nextInjectableAncestor;
    private Binding uriRegistry;

    public final void attach(Linker linker)
    {
        nextInjectableAncestor.attach(linker);
        display = linker.requestBinding("com.google.android.apps.wallet.kyc.SplashScreenDisplay", com/google/android/apps/wallet/plastic/OrderPlasticCardCongratulationsActivity, getClass().getClassLoader());
        fullScreenProgressSpinnerManager = linker.requestBinding("com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager", com/google/android/apps/wallet/plastic/OrderPlasticCardCongratulationsActivity, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/plastic/OrderPlasticCardCongratulationsActivity, getClass().getClassLoader());
        uriRegistry = linker.requestBinding("com.google.android.apps.wallet.api.UriRegistry", com/google/android/apps/wallet/plastic/OrderPlasticCardCongratulationsActivity, getClass().getClassLoader());
    }

    public final OrderPlasticCardCongratulationsActivity get()
    {
        OrderPlasticCardCongratulationsActivity orderplasticcardcongratulationsactivity = new OrderPlasticCardCongratulationsActivity();
        injectMembers(orderplasticcardcongratulationsactivity);
        return orderplasticcardcongratulationsactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(display);
        set1.add(fullScreenProgressSpinnerManager);
        set1.add(eventBus);
        set1.add(uriRegistry);
        nextInjectableAncestor.getDependencies(null, set1);
    }

    public final void injectMembers(OrderPlasticCardCongratulationsActivity orderplasticcardcongratulationsactivity)
    {
        orderplasticcardcongratulationsactivity.display = (SplashScreenDisplay)display.get();
        orderplasticcardcongratulationsactivity.fullScreenProgressSpinnerManager = (FullScreenProgressSpinnerManager)fullScreenProgressSpinnerManager.get();
        orderplasticcardcongratulationsactivity.eventBus = (EventBus)eventBus.get();
        orderplasticcardcongratulationsactivity.uriRegistry = (UriRegistry)uriRegistry.get();
        nextInjectableAncestor.injectMembers(orderplasticcardcongratulationsactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((OrderPlasticCardCongratulationsActivity)obj);
    }

    public _apps_wallet_plastic_OrderPlasticCardCongratulationsActivity()
    {
        super("com.google.android.apps.wallet.plastic.OrderPlasticCardCongratulationsActivity", "members/com.google.android.apps.wallet.plastic.OrderPlasticCardCongratulationsActivity", false, com/google/android/apps/wallet/plastic/OrderPlasticCardCongratulationsActivity);
        nextInjectableAncestor = new com.google.android.apps.wallet.base.activity.wallet_plastic_OrderPlasticCardCongratulationsActivity();
    }
}
