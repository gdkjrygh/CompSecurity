// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.app.Activity;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.transfer.api.TransferApi;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            IncomingMoneyRequestsTile

public final class Q extends Binding
    implements Provider
{

    private Binding activity;
    private Binding analyticsUtil;
    private Binding eventBus;
    private Binding featureManager;
    private Binding transferApi;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/p2p/IncomingMoneyRequestsTile, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/p2p/IncomingMoneyRequestsTile, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/p2p/IncomingMoneyRequestsTile, getClass().getClassLoader());
        transferApi = linker.requestBinding("com.google.android.apps.wallet.transfer.api.TransferApi", com/google/android/apps/wallet/p2p/IncomingMoneyRequestsTile, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/p2p/IncomingMoneyRequestsTile, getClass().getClassLoader());
    }

    public final IncomingMoneyRequestsTile get()
    {
        return new IncomingMoneyRequestsTile((Activity)activity.get(), (EventBus)eventBus.get(), (FeatureManager)featureManager.get(), (TransferApi)transferApi.get(), (AnalyticsUtil)analyticsUtil.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(eventBus);
        set.add(featureManager);
        set.add(transferApi);
        set.add(analyticsUtil);
    }

    public Q()
    {
        super("com.google.android.apps.wallet.p2p.IncomingMoneyRequestsTile", "members/com.google.android.apps.wallet.p2p.IncomingMoneyRequestsTile", false, com/google/android/apps/wallet/p2p/IncomingMoneyRequestsTile);
    }
}
