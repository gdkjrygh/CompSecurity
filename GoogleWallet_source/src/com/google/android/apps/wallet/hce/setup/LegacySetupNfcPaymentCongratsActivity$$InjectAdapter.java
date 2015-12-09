// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup;

import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.pin.CloudPinManager;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce.setup:
//            LegacySetupNfcPaymentCongratsActivity

public final class ctivity extends Binding
    implements MembersInjector, Provider
{

    private Binding actionExecutor;
    private Binding cloudPinManager;
    private Binding fullScreenProgressSpinnerManager;
    private com.google.android.apps.wallet.base.activity.s_wallet_hce_setup_LegacySetupNfcPaymentCongratsActivity nextInjectableAncestor;
    private Binding uriRegistry;

    public final void attach(Linker linker)
    {
        nextInjectableAncestor.attach(linker);
        fullScreenProgressSpinnerManager = linker.requestBinding("com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager", com/google/android/apps/wallet/hce/setup/LegacySetupNfcPaymentCongratsActivity, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/hce/setup/LegacySetupNfcPaymentCongratsActivity, getClass().getClassLoader());
        cloudPinManager = linker.requestBinding("com.google.android.apps.wallet.pin.CloudPinManager", com/google/android/apps/wallet/hce/setup/LegacySetupNfcPaymentCongratsActivity, getClass().getClassLoader());
        uriRegistry = linker.requestBinding("com.google.android.apps.wallet.api.UriRegistry", com/google/android/apps/wallet/hce/setup/LegacySetupNfcPaymentCongratsActivity, getClass().getClassLoader());
    }

    public final LegacySetupNfcPaymentCongratsActivity get()
    {
        LegacySetupNfcPaymentCongratsActivity legacysetupnfcpaymentcongratsactivity = new LegacySetupNfcPaymentCongratsActivity();
        injectMembers(legacysetupnfcpaymentcongratsactivity);
        return legacysetupnfcpaymentcongratsactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(fullScreenProgressSpinnerManager);
        set1.add(actionExecutor);
        set1.add(cloudPinManager);
        set1.add(uriRegistry);
        nextInjectableAncestor.getDependencies(null, set1);
    }

    public final void injectMembers(LegacySetupNfcPaymentCongratsActivity legacysetupnfcpaymentcongratsactivity)
    {
        legacysetupnfcpaymentcongratsactivity.fullScreenProgressSpinnerManager = (FullScreenProgressSpinnerManager)fullScreenProgressSpinnerManager.get();
        legacysetupnfcpaymentcongratsactivity.actionExecutor = (ActionExecutor)actionExecutor.get();
        legacysetupnfcpaymentcongratsactivity.cloudPinManager = (CloudPinManager)cloudPinManager.get();
        legacysetupnfcpaymentcongratsactivity.uriRegistry = (UriRegistry)uriRegistry.get();
        nextInjectableAncestor.injectMembers(legacysetupnfcpaymentcongratsactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((LegacySetupNfcPaymentCongratsActivity)obj);
    }

    public _apps_wallet_hce_setup_LegacySetupNfcPaymentCongratsActivity()
    {
        super("com.google.android.apps.wallet.hce.setup.LegacySetupNfcPaymentCongratsActivity", "members/com.google.android.apps.wallet.hce.setup.LegacySetupNfcPaymentCongratsActivity", false, com/google/android/apps/wallet/hce/setup/LegacySetupNfcPaymentCongratsActivity);
        nextInjectableAncestor = new com.google.android.apps.wallet.base.activity.s_wallet_hce_setup_LegacySetupNfcPaymentCongratsActivity();
    }
}
