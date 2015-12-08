// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.entrypoint;

import android.content.SharedPreferences;
import com.google.android.apps.wallet.analytics.AppStartTimeLogger;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.filter.ActivityFilterPipeline;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.entrypoint:
//            WalletRootActivity

public final class Q extends Binding
    implements MembersInjector, Provider
{

    private Binding activityFilterPipeline;
    private Binding appStartTimeLogger;
    private Binding uriRegistry;
    private Binding userPrefs;

    public final void attach(Linker linker)
    {
        activityFilterPipeline = linker.requestBinding("com.google.android.apps.wallet.filter.ActivityFilterPipeline", com/google/android/apps/wallet/entrypoint/WalletRootActivity, getClass().getClassLoader());
        appStartTimeLogger = linker.requestBinding("com.google.android.apps.wallet.analytics.AppStartTimeLogger", com/google/android/apps/wallet/entrypoint/WalletRootActivity, getClass().getClassLoader());
        userPrefs = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/entrypoint/WalletRootActivity, getClass().getClassLoader());
        uriRegistry = linker.requestBinding("com.google.android.apps.wallet.api.UriRegistry", com/google/android/apps/wallet/entrypoint/WalletRootActivity, getClass().getClassLoader());
    }

    public final WalletRootActivity get()
    {
        WalletRootActivity walletrootactivity = new WalletRootActivity();
        injectMembers(walletrootactivity);
        return walletrootactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(activityFilterPipeline);
        set1.add(appStartTimeLogger);
        set1.add(userPrefs);
        set1.add(uriRegistry);
    }

    public final void injectMembers(WalletRootActivity walletrootactivity)
    {
        walletrootactivity.activityFilterPipeline = (ActivityFilterPipeline)activityFilterPipeline.get();
        walletrootactivity.appStartTimeLogger = (AppStartTimeLogger)appStartTimeLogger.get();
        walletrootactivity.userPrefs = (SharedPreferences)userPrefs.get();
        walletrootactivity.uriRegistry = (UriRegistry)uriRegistry.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((WalletRootActivity)obj);
    }

    public Q()
    {
        super("com.google.android.apps.wallet.entrypoint.WalletRootActivity", "members/com.google.android.apps.wallet.entrypoint.WalletRootActivity", false, com/google/android/apps/wallet/entrypoint/WalletRootActivity);
    }
}
