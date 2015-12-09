// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.kyc.api.KycStatusPublisher;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecordListItemBinder;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            WalletBalancePendingTransactionFragment

public final class gment extends Binding
    implements MembersInjector, Provider
{

    private Binding eventBus;
    private Binding featureManager;
    private Binding kycStatusPublisher;
    private Binding listItemBinder;
    private com.google.android.apps.wallet.base.fragment.wallet_storedvalue_WalletBalancePendingTransactionFragment nextInjectableAncestor;

    public final void attach(Linker linker)
    {
        nextInjectableAncestor.attach(linker);
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/storedvalue/WalletBalancePendingTransactionFragment, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/storedvalue/WalletBalancePendingTransactionFragment, getClass().getClassLoader());
        listItemBinder = linker.requestBinding("com.google.android.apps.wallet.purchaserecord.PurchaseRecordListItemBinder", com/google/android/apps/wallet/storedvalue/WalletBalancePendingTransactionFragment, getClass().getClassLoader());
        kycStatusPublisher = linker.requestBinding("com.google.android.apps.wallet.kyc.api.KycStatusPublisher", com/google/android/apps/wallet/storedvalue/WalletBalancePendingTransactionFragment, getClass().getClassLoader());
    }

    public final WalletBalancePendingTransactionFragment get()
    {
        WalletBalancePendingTransactionFragment walletbalancependingtransactionfragment = new WalletBalancePendingTransactionFragment();
        injectMembers(walletbalancependingtransactionfragment);
        return walletbalancependingtransactionfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(eventBus);
        set1.add(featureManager);
        set1.add(listItemBinder);
        set1.add(kycStatusPublisher);
        nextInjectableAncestor.getDependencies(null, set1);
    }

    public final void injectMembers(WalletBalancePendingTransactionFragment walletbalancependingtransactionfragment)
    {
        walletbalancependingtransactionfragment.eventBus = (EventBus)eventBus.get();
        walletbalancependingtransactionfragment.featureManager = (FeatureManager)featureManager.get();
        walletbalancependingtransactionfragment.listItemBinder = (PurchaseRecordListItemBinder)listItemBinder.get();
        walletbalancependingtransactionfragment.kycStatusPublisher = (KycStatusPublisher)kycStatusPublisher.get();
        nextInjectableAncestor.injectMembers(walletbalancependingtransactionfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((WalletBalancePendingTransactionFragment)obj);
    }

    public s_wallet_storedvalue_WalletBalancePendingTransactionFragment()
    {
        super("com.google.android.apps.wallet.storedvalue.WalletBalancePendingTransactionFragment", "members/com.google.android.apps.wallet.storedvalue.WalletBalancePendingTransactionFragment", false, com/google/android/apps/wallet/storedvalue/WalletBalancePendingTransactionFragment);
        nextInjectableAncestor = new com.google.android.apps.wallet.base.fragment.wallet_storedvalue_WalletBalancePendingTransactionFragment();
    }
}
