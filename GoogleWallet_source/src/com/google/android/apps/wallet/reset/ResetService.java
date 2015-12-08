// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.reset;

import android.accounts.Account;
import android.app.IntentService;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import com.google.android.apps.wallet.app.migration.WalletDatabaseChecker;
import com.google.android.apps.wallet.base.java.ProcessKiller;
import com.google.android.apps.wallet.geofencing.api.GeofencingClient;
import com.google.android.apps.wallet.globalresources.GlobalResourcesSyncManager;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.network.NetworkInformationProvider;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.userscope.UserScopedApplication;
import dagger.ObjectGraph;

public class ResetService extends IntentService
{

    private static final String TAG = com/google/android/apps/wallet/reset/ResetService.getSimpleName();
    Account currentAccount;
    WalletDatabaseChecker databaseChecker;
    GeofencingClient geofencingClient;
    GlobalResourcesSyncManager globalResourcesSyncManager;
    ProcessKiller killer;
    NetworkInformationProvider networkInformationProvider;
    NotificationManager notificationManager;
    RpcCaller rpcCaller;
    SharedPreferences userPrefs;

    public ResetService()
    {
        super(TAG);
    }

    private void clearWebViewState()
    {
        (new WebView(this)).clearCache(true);
        CookieManager.getInstance().removeAllCookie();
        CookieSyncManager.createInstance(this);
        CookieSyncManager.getInstance().sync();
    }

    protected void onHandleIntent(Intent intent)
    {
        UserScopedApplication userscopedapplication = (UserScopedApplication)getApplicationContext();
        intent = intent.getStringExtra("ACCOUNT_NAME");
        boolean flag = userscopedapplication.hasGraph(intent);
        userscopedapplication.getUserObjectGraph(intent).inject(this);
        if (flag && !networkInformationProvider.hasNetworkAccess())
        {
            WLog.e(TAG, "No network connection skipping reset");
        } else
        {
            try
            {
                rpcCaller.call("b/reset/notify", new com.google.wallet.proto.api.NanoWalletReset.ResetRequest(), new com.google.wallet.proto.api.NanoWalletReset.ResetResponse());
            }
            catch (RpcException rpcexception)
            {
                WLog.e(TAG, "Network error while performing reset");
            }
            if (flag)
            {
                geofencingClient.stop(this);
                notificationManager.cancelAll();
                globalResourcesSyncManager.disablePeriodicSync();
            }
            userPrefs.edit().clear().commit();
            databaseChecker.deleteUserFiles(intent);
            if (currentAccount.name.equals(intent))
            {
                clearWebViewState();
                intent = killer;
                ProcessKiller.kill();
                return;
            }
        }
    }

}
