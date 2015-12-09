// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.account;

import android.app.AlarmManager;
import android.content.SharedPreferences;
import android.support.v4.app.FragmentActivity;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.geofencing.api.GeofencingClient;
import com.google.android.apps.wallet.globalresources.GlobalResourcesSyncManager;
import com.google.android.apps.wallet.hce.tap.WalletHceContext;
import com.google.android.apps.wallet.init.InitializerTaskManager;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.account:
//            AccountChanger

public final class ager extends Binding
    implements Provider
{

    private Binding actionExecutor;
    private Binding activity;
    private Binding alarmManager;
    private Binding analyticsUtil;
    private Binding gcmNetworkManager;
    private Binding geofencingClient;
    private Binding globalPrefs;
    private Binding globalResourcesSyncManager;
    private Binding hceContext;
    private Binding initializerTaskManager;
    private Binding networkAccessChecker;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.support.v4.app.FragmentActivity", com/google/android/apps/wallet/account/AccountChanger, getClass().getClassLoader());
        actionExecutor = linker.requestBinding("com.google.android.apps.wallet.util.async.ActionExecutor", com/google/android/apps/wallet/account/AccountChanger, getClass().getClassLoader());
        globalPrefs = linker.requestBinding("@com.google.android.apps.wallet.config.sharedpreferences.BindingAnnotations$Global()/android.content.SharedPreferences", com/google/android/apps/wallet/account/AccountChanger, getClass().getClassLoader());
        networkAccessChecker = linker.requestBinding("com.google.android.apps.wallet.network.ui.NetworkAccessChecker", com/google/android/apps/wallet/account/AccountChanger, getClass().getClassLoader());
        geofencingClient = linker.requestBinding("com.google.android.apps.wallet.geofencing.api.GeofencingClient", com/google/android/apps/wallet/account/AccountChanger, getClass().getClassLoader());
        gcmNetworkManager = linker.requestBinding("javax.inject.Provider<com.google.android.gms.gcm.GcmNetworkManager>", com/google/android/apps/wallet/account/AccountChanger, getClass().getClassLoader());
        globalResourcesSyncManager = linker.requestBinding("com.google.android.apps.wallet.globalresources.GlobalResourcesSyncManager", com/google/android/apps/wallet/account/AccountChanger, getClass().getClassLoader());
        hceContext = linker.requestBinding("com.google.android.apps.wallet.hce.tap.WalletHceContext", com/google/android/apps/wallet/account/AccountChanger, getClass().getClassLoader());
        initializerTaskManager = linker.requestBinding("com.google.android.apps.wallet.init.InitializerTaskManager", com/google/android/apps/wallet/account/AccountChanger, getClass().getClassLoader());
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/account/AccountChanger, getClass().getClassLoader());
        alarmManager = linker.requestBinding("android.app.AlarmManager", com/google/android/apps/wallet/account/AccountChanger, getClass().getClassLoader());
    }

    public final AccountChanger get()
    {
        return new AccountChanger((FragmentActivity)activity.get(), (ActionExecutor)actionExecutor.get(), (SharedPreferences)globalPrefs.get(), (NetworkAccessChecker)networkAccessChecker.get(), (GeofencingClient)geofencingClient.get(), (Provider)gcmNetworkManager.get(), (GlobalResourcesSyncManager)globalResourcesSyncManager.get(), (WalletHceContext)hceContext.get(), (InitializerTaskManager)initializerTaskManager.get(), (AnalyticsUtil)analyticsUtil.get(), (AlarmManager)alarmManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(actionExecutor);
        set.add(globalPrefs);
        set.add(networkAccessChecker);
        set.add(geofencingClient);
        set.add(gcmNetworkManager);
        set.add(globalResourcesSyncManager);
        set.add(hceContext);
        set.add(initializerTaskManager);
        set.add(analyticsUtil);
        set.add(alarmManager);
    }

    public ager()
    {
        super("com.google.android.apps.wallet.account.AccountChanger", "members/com.google.android.apps.wallet.account.AccountChanger", false, com/google/android/apps/wallet/account/AccountChanger);
    }
}
