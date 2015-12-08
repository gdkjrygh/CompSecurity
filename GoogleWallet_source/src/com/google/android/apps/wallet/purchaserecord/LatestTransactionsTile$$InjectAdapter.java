// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.app.Activity;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.network.NetworkConnectivityReturnChecker;
import dagger.Lazy;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            LatestTransactionsTile, PurchaseRecordListItemBinder

public final class Y extends Binding
    implements Provider
{

    private Binding activity;
    private Binding analyticsUtil;
    private Binding eventBus;
    private Binding featureManager;
    private Binding listItemBinder;
    private Binding networkConnectivityReturnChecker;
    private Binding purchaseRecordPublisher;
    private Binding uriRegistry;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/purchaserecord/LatestTransactionsTile, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/purchaserecord/LatestTransactionsTile, getClass().getClassLoader());
        listItemBinder = linker.requestBinding("com.google.android.apps.wallet.purchaserecord.PurchaseRecordListItemBinder", com/google/android/apps/wallet/purchaserecord/LatestTransactionsTile, getClass().getClassLoader());
        purchaseRecordPublisher = linker.requestBinding("dagger.Lazy<com.google.android.apps.wallet.purchaserecord.PurchaseRecordPublisher>", com/google/android/apps/wallet/purchaserecord/LatestTransactionsTile, getClass().getClassLoader());
        networkConnectivityReturnChecker = linker.requestBinding("com.google.android.apps.wallet.network.NetworkConnectivityReturnChecker", com/google/android/apps/wallet/purchaserecord/LatestTransactionsTile, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/purchaserecord/LatestTransactionsTile, getClass().getClassLoader());
        uriRegistry = linker.requestBinding("com.google.android.apps.wallet.api.UriRegistry", com/google/android/apps/wallet/purchaserecord/LatestTransactionsTile, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/purchaserecord/LatestTransactionsTile, getClass().getClassLoader());
    }

    public final LatestTransactionsTile get()
    {
        return new LatestTransactionsTile((Activity)activity.get(), (EventBus)eventBus.get(), (PurchaseRecordListItemBinder)listItemBinder.get(), (Lazy)purchaseRecordPublisher.get(), (NetworkConnectivityReturnChecker)networkConnectivityReturnChecker.get(), (FeatureManager)featureManager.get(), (UriRegistry)uriRegistry.get(), (AnalyticsUtil)analyticsUtil.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(eventBus);
        set.add(listItemBinder);
        set.add(purchaseRecordPublisher);
        set.add(networkConnectivityReturnChecker);
        set.add(featureManager);
        set.add(uriRegistry);
        set.add(analyticsUtil);
    }

    public Y()
    {
        super("com.google.android.apps.wallet.purchaserecord.LatestTransactionsTile", "members/com.google.android.apps.wallet.purchaserecord.LatestTransactionsTile", false, com/google/android/apps/wallet/purchaserecord/LatestTransactionsTile);
    }
}
