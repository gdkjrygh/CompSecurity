// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.nfc;

import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.nfc:
//            NfcAdapterStateEventPublisher

public final class  extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding eventBus;
    private Binding featureManager;
    private Binding nfcAdapter;

    public final void attach(Linker linker)
    {
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/nfc/NfcAdapterStateEventPublisher, getClass().getClassLoader());
        nfcAdapter = linker.requestBinding("javax.inject.Provider<android.nfc.NfcAdapter>", com/google/android/apps/wallet/nfc/NfcAdapterStateEventPublisher, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/nfc/NfcAdapterStateEventPublisher, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/nfc/NfcAdapterStateEventPublisher, getClass().getClassLoader());
    }

    public final NfcAdapterStateEventPublisher get()
    {
        return new NfcAdapterStateEventPublisher((FeatureManager)featureManager.get(), (Provider)nfcAdapter.get(), (ActionExecutor)actionExecutor.get(), (EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(featureManager);
        set.add(nfcAdapter);
        set.add(actionExecutor);
        set.add(eventBus);
    }

    public ()
    {
        super("com.google.android.apps.wallet.nfc.NfcAdapterStateEventPublisher", "members/com.google.android.apps.wallet.nfc.NfcAdapterStateEventPublisher", true, com/google/android/apps/wallet/nfc/NfcAdapterStateEventPublisher);
    }
}
