// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.api;

import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.transfer.api:
//            FundsTransferInfoPublisher, FundsTransferClient

public final class  extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding eventBus;
    private Binding featureManager;
    private Binding fundsTransferClient;

    public final void attach(Linker linker)
    {
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/transfer/api/FundsTransferInfoPublisher, getClass().getClassLoader());
        fundsTransferClient = linker.requestBinding("com.google.android.apps.wallet.transfer.api.FundsTransferClient", com/google/android/apps/wallet/transfer/api/FundsTransferInfoPublisher, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/transfer/api/FundsTransferInfoPublisher, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/transfer/api/FundsTransferInfoPublisher, getClass().getClassLoader());
    }

    public final FundsTransferInfoPublisher get()
    {
        return new FundsTransferInfoPublisher((EventBus)eventBus.get(), (FundsTransferClient)fundsTransferClient.get(), (ActionExecutor)actionExecutor.get(), (FeatureManager)featureManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(fundsTransferClient);
        set.add(actionExecutor);
        set.add(featureManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.transfer.api.FundsTransferInfoPublisher", "members/com.google.android.apps.wallet.transfer.api.FundsTransferInfoPublisher", true, com/google/android/apps/wallet/transfer/api/FundsTransferInfoPublisher);
    }
}
