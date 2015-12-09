// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue.api;

import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.storedvalue.api:
//            StoredValuePublisher, StoredValueRpcCache

public final class  extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding eventBus;
    private Binding featureManager;
    private Binding rpcCache;
    private Binding threadChecker;

    public final void attach(Linker linker)
    {
        rpcCache = linker.requestBinding("com.google.android.apps.wallet.storedvalue.api.StoredValueRpcCache", com/google/android/apps/wallet/storedvalue/api/StoredValuePublisher, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/storedvalue/api/StoredValuePublisher, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/storedvalue/api/StoredValuePublisher, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/storedvalue/api/StoredValuePublisher, getClass().getClassLoader());
        threadChecker = linker.requestBinding("com.google.android.apps.wallet.util.async.ThreadChecker", com/google/android/apps/wallet/storedvalue/api/StoredValuePublisher, getClass().getClassLoader());
    }

    public final StoredValuePublisher get()
    {
        return new StoredValuePublisher((StoredValueRpcCache)rpcCache.get(), (FeatureManager)featureManager.get(), (ActionExecutor)actionExecutor.get(), (EventBus)eventBus.get(), (ThreadChecker)threadChecker.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(rpcCache);
        set.add(featureManager);
        set.add(actionExecutor);
        set.add(eventBus);
        set.add(threadChecker);
    }

    public ()
    {
        super("com.google.android.apps.wallet.storedvalue.api.StoredValuePublisher", "members/com.google.android.apps.wallet.storedvalue.api.StoredValuePublisher", true, com/google/android/apps/wallet/storedvalue/api/StoredValuePublisher);
    }
}
