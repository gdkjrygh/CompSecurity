// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecordManager;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            WalletBalancePendingTransactionPublisher

public final class  extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding eventBus;
    private Binding featureManager;
    private Binding purchaseRecordManager;
    private Binding threadChecker;

    public final void attach(Linker linker)
    {
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/storedvalue/WalletBalancePendingTransactionPublisher, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/storedvalue/WalletBalancePendingTransactionPublisher, getClass().getClassLoader());
        purchaseRecordManager = linker.requestBinding("com.google.android.apps.wallet.purchaserecord.PurchaseRecordManager", com/google/android/apps/wallet/storedvalue/WalletBalancePendingTransactionPublisher, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/storedvalue/WalletBalancePendingTransactionPublisher, getClass().getClassLoader());
        threadChecker = linker.requestBinding("com.google.android.apps.wallet.util.async.ThreadChecker", com/google/android/apps/wallet/storedvalue/WalletBalancePendingTransactionPublisher, getClass().getClassLoader());
    }

    public final WalletBalancePendingTransactionPublisher get()
    {
        return new WalletBalancePendingTransactionPublisher((EventBus)eventBus.get(), (ActionExecutor)actionExecutor.get(), (PurchaseRecordManager)purchaseRecordManager.get(), (FeatureManager)featureManager.get(), (ThreadChecker)threadChecker.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(actionExecutor);
        set.add(purchaseRecordManager);
        set.add(featureManager);
        set.add(threadChecker);
    }

    public ()
    {
        super("com.google.android.apps.wallet.storedvalue.WalletBalancePendingTransactionPublisher", "members/com.google.android.apps.wallet.storedvalue.WalletBalancePendingTransactionPublisher", true, com/google/android/apps/wallet/storedvalue/WalletBalancePendingTransactionPublisher);
    }
}
