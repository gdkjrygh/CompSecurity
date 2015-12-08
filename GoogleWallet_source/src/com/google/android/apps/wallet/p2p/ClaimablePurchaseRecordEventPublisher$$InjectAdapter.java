// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecordManager;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.common.cache.Cache;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            ClaimablePurchaseRecordEventPublisher

public final class  extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding cache;
    private Binding eventBus;
    private Binding featureManager;
    private Binding purchaseRecordManager;

    public final void attach(Linker linker)
    {
        purchaseRecordManager = linker.requestBinding("com.google.android.apps.wallet.purchaserecord.PurchaseRecordManager", com/google/android/apps/wallet/p2p/ClaimablePurchaseRecordEventPublisher, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/p2p/ClaimablePurchaseRecordEventPublisher, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/p2p/ClaimablePurchaseRecordEventPublisher, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/p2p/ClaimablePurchaseRecordEventPublisher, getClass().getClassLoader());
        cache = linker.requestBinding("com.google.common.cache.Cache<java.lang.Object, com.google.android.apps.wallet.p2p.ClaimablePurchaseRecordEvent>", com/google/android/apps/wallet/p2p/ClaimablePurchaseRecordEventPublisher, getClass().getClassLoader());
    }

    public final ClaimablePurchaseRecordEventPublisher get()
    {
        return new ClaimablePurchaseRecordEventPublisher((PurchaseRecordManager)purchaseRecordManager.get(), (FeatureManager)featureManager.get(), (ActionExecutor)actionExecutor.get(), (EventBus)eventBus.get(), (Cache)cache.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(purchaseRecordManager);
        set.add(featureManager);
        set.add(actionExecutor);
        set.add(eventBus);
        set.add(cache);
    }

    public ()
    {
        super("com.google.android.apps.wallet.p2p.ClaimablePurchaseRecordEventPublisher", "members/com.google.android.apps.wallet.p2p.ClaimablePurchaseRecordEventPublisher", true, com/google/android/apps/wallet/p2p/ClaimablePurchaseRecordEventPublisher);
    }
}
