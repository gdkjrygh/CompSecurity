// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import com.google.android.apps.wallet.storedvalue.api.StoredValuePublisher;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            StoredValueModule, WalletBalancePendingTransactionPublisher

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final StoredValueModule module;
    private Binding storedValuePublisher;
    private Binding walletBalancePendingTransactionPublisher;

    public final void attach(Linker linker)
    {
        storedValuePublisher = linker.requestBinding("com.google.android.apps.wallet.storedvalue.api.StoredValuePublisher", com/google/android/apps/wallet/storedvalue/StoredValueModule, getClass().getClassLoader());
        walletBalancePendingTransactionPublisher = linker.requestBinding("com.google.android.apps.wallet.storedvalue.WalletBalancePendingTransactionPublisher", com/google/android/apps/wallet/storedvalue/StoredValueModule, getClass().getClassLoader());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final Set get()
    {
        StoredValueModule storedvaluemodule = module;
        return StoredValueModule.getInitializedEventPublishers((StoredValuePublisher)storedValuePublisher.get(), (WalletBalancePendingTransactionPublisher)walletBalancePendingTransactionPublisher.get());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(storedValuePublisher);
        set.add(walletBalancePendingTransactionPublisher);
    }

    public (StoredValueModule storedvaluemodule)
    {
        super("java.util.Set<com.google.android.apps.wallet.eventbus.InitializedEventPublisher>", false, "com.google.android.apps.wallet.storedvalue.StoredValueModule", "getInitializedEventPublishers");
        module = storedvaluemodule;
        setLibrary(true);
    }
}
