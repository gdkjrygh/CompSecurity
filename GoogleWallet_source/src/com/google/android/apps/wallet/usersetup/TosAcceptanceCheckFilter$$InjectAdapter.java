// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.support.v4.app.FragmentActivity;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.network.NetworkInformationProvider;
import com.google.android.apps.wallet.usersetup.service.SetupWalletServiceClient;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import dagger.Lazy;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            TosAcceptanceCheckFilter, NetworkAccessPrompter

public final class anager extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding activity;
    private Binding analyticsUtil;
    private Binding fullScreenProgressSpinnerManager;
    private Binding networkAccessPrompter;
    private Binding networkInformationProvider;
    private Binding setupWalletServiceClient;
    private Binding tosAcceptanceOracle;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.support.v4.app.FragmentActivity", com/google/android/apps/wallet/usersetup/TosAcceptanceCheckFilter, getClass().getClassLoader());
        tosAcceptanceOracle = linker.requestBinding("dagger.Lazy<com.google.android.apps.wallet.usersetup.TosAcceptanceOracle>", com/google/android/apps/wallet/usersetup/TosAcceptanceCheckFilter, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/usersetup/TosAcceptanceCheckFilter, getClass().getClassLoader());
        setupWalletServiceClient = linker.requestBinding("com.google.android.apps.wallet.usersetup.service.SetupWalletServiceClient", com/google/android/apps/wallet/usersetup/TosAcceptanceCheckFilter, getClass().getClassLoader());
        networkInformationProvider = linker.requestBinding("com.google.android.apps.wallet.network.NetworkInformationProvider", com/google/android/apps/wallet/usersetup/TosAcceptanceCheckFilter, getClass().getClassLoader());
        networkAccessPrompter = linker.requestBinding("com.google.android.apps.wallet.usersetup.NetworkAccessPrompter", com/google/android/apps/wallet/usersetup/TosAcceptanceCheckFilter, getClass().getClassLoader());
        fullScreenProgressSpinnerManager = linker.requestBinding("com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager", com/google/android/apps/wallet/usersetup/TosAcceptanceCheckFilter, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/usersetup/TosAcceptanceCheckFilter, getClass().getClassLoader());
    }

    public final TosAcceptanceCheckFilter get()
    {
        return new TosAcceptanceCheckFilter((FragmentActivity)activity.get(), (Lazy)tosAcceptanceOracle.get(), (ActionExecutor)actionExecutor.get(), (SetupWalletServiceClient)setupWalletServiceClient.get(), (NetworkInformationProvider)networkInformationProvider.get(), (NetworkAccessPrompter)networkAccessPrompter.get(), (FullScreenProgressSpinnerManager)fullScreenProgressSpinnerManager.get(), (AnalyticsUtil)analyticsUtil.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(tosAcceptanceOracle);
        set.add(actionExecutor);
        set.add(setupWalletServiceClient);
        set.add(networkInformationProvider);
        set.add(networkAccessPrompter);
        set.add(fullScreenProgressSpinnerManager);
        set.add(analyticsUtil);
    }

    public anager()
    {
        super("com.google.android.apps.wallet.usersetup.TosAcceptanceCheckFilter", "members/com.google.android.apps.wallet.usersetup.TosAcceptanceCheckFilter", false, com/google/android/apps/wallet/usersetup/TosAcceptanceCheckFilter);
    }
}
