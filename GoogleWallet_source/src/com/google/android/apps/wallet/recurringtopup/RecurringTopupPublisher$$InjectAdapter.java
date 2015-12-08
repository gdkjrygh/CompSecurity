// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import android.os.Handler;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            RecurringTopupPublisher, RecurringTopupRpcCache, TopupScheduleClient

public final class  extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding eventBus;
    private Binding featureManager;
    private Binding mainThreadHandler;
    private Binding rpcCache;
    private Binding threadChecker;
    private Binding topupScheduleClient;

    public final void attach(Linker linker)
    {
        rpcCache = linker.requestBinding("com.google.android.apps.wallet.recurringtopup.RecurringTopupRpcCache", com/google/android/apps/wallet/recurringtopup/RecurringTopupPublisher, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/recurringtopup/RecurringTopupPublisher, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/recurringtopup/RecurringTopupPublisher, getClass().getClassLoader());
        threadChecker = linker.requestBinding("com.google.android.apps.wallet.util.async.ThreadChecker", com/google/android/apps/wallet/recurringtopup/RecurringTopupPublisher, getClass().getClassLoader());
        topupScheduleClient = linker.requestBinding("com.google.android.apps.wallet.recurringtopup.TopupScheduleClient", com/google/android/apps/wallet/recurringtopup/RecurringTopupPublisher, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/recurringtopup/RecurringTopupPublisher, getClass().getClassLoader());
        mainThreadHandler = linker.requestBinding("@com.google.android.apps.wallet.inject.BindingAnnotations$MainThreadHandler()/android.os.Handler", com/google/android/apps/wallet/recurringtopup/RecurringTopupPublisher, getClass().getClassLoader());
    }

    public final RecurringTopupPublisher get()
    {
        return new RecurringTopupPublisher((RecurringTopupRpcCache)rpcCache.get(), (EventBus)eventBus.get(), (ActionExecutor)actionExecutor.get(), (ThreadChecker)threadChecker.get(), (TopupScheduleClient)topupScheduleClient.get(), (FeatureManager)featureManager.get(), (Handler)mainThreadHandler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(rpcCache);
        set.add(eventBus);
        set.add(actionExecutor);
        set.add(threadChecker);
        set.add(topupScheduleClient);
        set.add(featureManager);
        set.add(mainThreadHandler);
    }

    public ()
    {
        super("com.google.android.apps.wallet.recurringtopup.RecurringTopupPublisher", "members/com.google.android.apps.wallet.recurringtopup.RecurringTopupPublisher", true, com/google/android/apps/wallet/recurringtopup/RecurringTopupPublisher);
    }
}
