// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import android.app.Activity;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            BalanceHeader

public final class Dialog extends Binding
    implements Provider
{

    private Binding activity;
    private Binding analyticsUtil;
    private Binding dialog;
    private Binding eventBus;
    private Binding featureManager;
    private Binding networkAccessChecker;
    private Binding uriRegistry;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/storedvalue/BalanceHeader, getClass().getClassLoader());
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/storedvalue/BalanceHeader, getClass().getClassLoader());
        dialog = linker.requestBinding("com.google.android.apps.wallet.storedvalue.BalanceHeader$GooglePlusPhotoDialog", com/google/android/apps/wallet/storedvalue/BalanceHeader, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/storedvalue/BalanceHeader, getClass().getClassLoader());
        networkAccessChecker = linker.requestBinding("com.google.android.apps.wallet.network.ui.NetworkAccessChecker", com/google/android/apps/wallet/storedvalue/BalanceHeader, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/storedvalue/BalanceHeader, getClass().getClassLoader());
        uriRegistry = linker.requestBinding("com.google.android.apps.wallet.api.UriRegistry", com/google/android/apps/wallet/storedvalue/BalanceHeader, getClass().getClassLoader());
    }

    public final BalanceHeader get()
    {
        return new BalanceHeader((Activity)activity.get(), (EventBus)eventBus.get(), (Dialog)dialog.get(), (FeatureManager)featureManager.get(), (NetworkAccessChecker)networkAccessChecker.get(), (AnalyticsUtil)analyticsUtil.get(), (UriRegistry)uriRegistry.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(eventBus);
        set.add(dialog);
        set.add(featureManager);
        set.add(networkAccessChecker);
        set.add(analyticsUtil);
        set.add(uriRegistry);
    }

    public Dialog()
    {
        super("com.google.android.apps.wallet.storedvalue.BalanceHeader", "members/com.google.android.apps.wallet.storedvalue.BalanceHeader", false, com/google/android/apps/wallet/storedvalue/BalanceHeader);
    }
}
