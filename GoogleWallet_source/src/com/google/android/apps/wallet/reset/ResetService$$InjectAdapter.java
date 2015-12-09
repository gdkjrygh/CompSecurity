// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.reset;

import android.accounts.Account;
import android.app.NotificationManager;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.app.migration.WalletDatabaseChecker;
import com.google.android.apps.wallet.base.java.ProcessKiller;
import com.google.android.apps.wallet.geofencing.api.GeofencingClient;
import com.google.android.apps.wallet.globalresources.GlobalResourcesSyncManager;
import com.google.android.apps.wallet.network.NetworkInformationProvider;
import com.google.android.apps.wallet.rpc.RpcCaller;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.reset:
//            ResetService

public final class r extends Binding
    implements MembersInjector, Provider
{

    private Binding currentAccount;
    private Binding databaseChecker;
    private Binding geofencingClient;
    private Binding globalResourcesSyncManager;
    private Binding killer;
    private Binding networkInformationProvider;
    private Binding notificationManager;
    private Binding rpcCaller;
    private Binding userPrefs;

    public final void attach(Linker linker)
    {
        networkInformationProvider = linker.requestBinding("com.google.android.apps.wallet.network.NetworkInformationProvider", com/google/android/apps/wallet/reset/ResetService, getClass().getClassLoader());
        currentAccount = linker.requestBinding("@com.google.android.apps.wallet.account.api.BindingAnnotations$WalletGaiaAccount()/android.accounts.Account", com/google/android/apps/wallet/reset/ResetService, getClass().getClassLoader());
        rpcCaller = linker.requestBinding("com.google.android.apps.wallet.rpc.RpcCaller", com/google/android/apps/wallet/reset/ResetService, getClass().getClassLoader());
        geofencingClient = linker.requestBinding("com.google.android.apps.wallet.geofencing.api.GeofencingClient", com/google/android/apps/wallet/reset/ResetService, getClass().getClassLoader());
        globalResourcesSyncManager = linker.requestBinding("com.google.android.apps.wallet.globalresources.GlobalResourcesSyncManager", com/google/android/apps/wallet/reset/ResetService, getClass().getClassLoader());
        notificationManager = linker.requestBinding("android.app.NotificationManager", com/google/android/apps/wallet/reset/ResetService, getClass().getClassLoader());
        userPrefs = linker.requestBinding("android.content.SharedPreferences", com/google/android/apps/wallet/reset/ResetService, getClass().getClassLoader());
        databaseChecker = linker.requestBinding("com.google.android.apps.wallet.app.migration.WalletDatabaseChecker", com/google/android/apps/wallet/reset/ResetService, getClass().getClassLoader());
        killer = linker.requestBinding("com.google.android.apps.wallet.base.java.ProcessKiller", com/google/android/apps/wallet/reset/ResetService, getClass().getClassLoader());
    }

    public final ResetService get()
    {
        ResetService resetservice = new ResetService();
        injectMembers(resetservice);
        return resetservice;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(networkInformationProvider);
        set1.add(currentAccount);
        set1.add(rpcCaller);
        set1.add(geofencingClient);
        set1.add(globalResourcesSyncManager);
        set1.add(notificationManager);
        set1.add(userPrefs);
        set1.add(databaseChecker);
        set1.add(killer);
    }

    public final void injectMembers(ResetService resetservice)
    {
        resetservice.networkInformationProvider = (NetworkInformationProvider)networkInformationProvider.get();
        resetservice.currentAccount = (Account)currentAccount.get();
        resetservice.rpcCaller = (RpcCaller)rpcCaller.get();
        resetservice.geofencingClient = (GeofencingClient)geofencingClient.get();
        resetservice.globalResourcesSyncManager = (GlobalResourcesSyncManager)globalResourcesSyncManager.get();
        resetservice.notificationManager = (NotificationManager)notificationManager.get();
        resetservice.userPrefs = (SharedPreferences)userPrefs.get();
        resetservice.databaseChecker = (WalletDatabaseChecker)databaseChecker.get();
        resetservice.killer = (ProcessKiller)killer.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ResetService)obj);
    }

    public r()
    {
        super("com.google.android.apps.wallet.reset.ResetService", "members/com.google.android.apps.wallet.reset.ResetService", false, com/google/android/apps/wallet/reset/ResetService);
    }
}
