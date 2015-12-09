// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.tap;

import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.hce.database.HceLibraryDatabase;
import com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupManager;
import com.google.android.apps.wallet.hce.tap.event.HceEventMessageProcessor;
import com.google.android.apps.wallet.pin.CloudPinManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce.tap:
//            WalletHceContext, TapListener

public final class ger extends Binding
    implements Provider
{

    private Binding cloudPinManager;
    private Binding featureManager;
    private Binding hceEventMessageProcessor;
    private Binding libraryDatabase;
    private Binding nfcSetupStateManager;
    private Binding system;
    private Binding tapListener;

    public final void attach(Linker linker)
    {
        tapListener = linker.requestBinding("com.google.android.apps.wallet.hce.tap.TapListener", com/google/android/apps/wallet/hce/tap/WalletHceContext, getClass().getClassLoader());
        libraryDatabase = linker.requestBinding("com.google.android.apps.wallet.hce.database.HceLibraryDatabase", com/google/android/apps/wallet/hce/tap/WalletHceContext, getClass().getClassLoader());
        hceEventMessageProcessor = linker.requestBinding("com.google.android.apps.wallet.hce.tap.event.HceEventMessageProcessor", com/google/android/apps/wallet/hce/tap/WalletHceContext, getClass().getClassLoader());
        system = linker.requestBinding("com.google.android.apps.wallet.base.java.System", com/google/android/apps/wallet/hce/tap/WalletHceContext, getClass().getClassLoader());
        cloudPinManager = linker.requestBinding("com.google.android.apps.wallet.pin.CloudPinManager", com/google/android/apps/wallet/hce/tap/WalletHceContext, getClass().getClassLoader());
        nfcSetupStateManager = linker.requestBinding("com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupManager", com/google/android/apps/wallet/hce/tap/WalletHceContext, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/hce/tap/WalletHceContext, getClass().getClassLoader());
    }

    public final WalletHceContext get()
    {
        return new WalletHceContext((TapListener)tapListener.get(), (HceLibraryDatabase)libraryDatabase.get(), (HceEventMessageProcessor)hceEventMessageProcessor.get(), (System)system.get(), (CloudPinManager)cloudPinManager.get(), (NfcPaymentSetupManager)nfcSetupStateManager.get(), (FeatureManager)featureManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(tapListener);
        set.add(libraryDatabase);
        set.add(hceEventMessageProcessor);
        set.add(system);
        set.add(cloudPinManager);
        set.add(nfcSetupStateManager);
        set.add(featureManager);
    }

    public ger()
    {
        super("com.google.android.apps.wallet.hce.tap.WalletHceContext", "members/com.google.android.apps.wallet.hce.tap.WalletHceContext", true, com/google/android/apps/wallet/hce/tap/WalletHceContext);
    }
}
