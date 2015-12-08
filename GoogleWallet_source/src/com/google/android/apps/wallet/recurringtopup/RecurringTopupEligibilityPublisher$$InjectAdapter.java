// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.common.cache.Cache;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            RecurringTopupEligibilityPublisher, TopupScheduleClient

public final class  extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding cache;
    private Binding eventBus;
    private Binding featureManager;
    private Binding topupScheduleClient;

    public final void attach(Linker linker)
    {
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/recurringtopup/RecurringTopupEligibilityPublisher, getClass().getClassLoader());
        topupScheduleClient = linker.requestBinding("com.google.android.apps.wallet.recurringtopup.TopupScheduleClient", com/google/android/apps/wallet/recurringtopup/RecurringTopupEligibilityPublisher, getClass().getClassLoader());
        cache = linker.requestBinding("com.google.common.cache.Cache<java.lang.Object, com.google.android.apps.wallet.recurringtopup.RecurringTopupEligibilityEvent>", com/google/android/apps/wallet/recurringtopup/RecurringTopupEligibilityPublisher, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/recurringtopup/RecurringTopupEligibilityPublisher, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/recurringtopup/RecurringTopupEligibilityPublisher, getClass().getClassLoader());
    }

    public final RecurringTopupEligibilityPublisher get()
    {
        return new RecurringTopupEligibilityPublisher((FeatureManager)featureManager.get(), (TopupScheduleClient)topupScheduleClient.get(), (Cache)cache.get(), (ActionExecutor)actionExecutor.get(), (EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(featureManager);
        set.add(topupScheduleClient);
        set.add(cache);
        set.add(actionExecutor);
        set.add(eventBus);
    }

    public ()
    {
        super("com.google.android.apps.wallet.recurringtopup.RecurringTopupEligibilityPublisher", "members/com.google.android.apps.wallet.recurringtopup.RecurringTopupEligibilityPublisher", true, com/google/android/apps/wallet/recurringtopup/RecurringTopupEligibilityPublisher);
    }
}
