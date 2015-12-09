// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.account;

import android.app.AlarmManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.fragment.Fragments;
import com.google.android.apps.wallet.geofencing.api.GeofencingClient;
import com.google.android.apps.wallet.globalresources.GlobalResourcesSyncManager;
import com.google.android.apps.wallet.hce.setup.PaymentBundleRefreshService;
import com.google.android.apps.wallet.hce.setup.PaymentBundleRefresher;
import com.google.android.apps.wallet.hce.tap.WalletHceContext;
import com.google.android.apps.wallet.init.InitializerTaskManager;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.ThreadPreconditions;
import com.google.android.apps.wallet.util.async.activity.WalletTaskFragment;
import com.google.android.gms.gcm.GcmNetworkManager;
import java.util.concurrent.Callable;
import javax.inject.Provider;

public class AccountChanger
{

    private static final String TAG = com/google/android/apps/wallet/account/AccountChanger.getSimpleName();
    private final ActionExecutor actionExecutor;
    private final FragmentActivity activity;
    private final AlarmManager alarmManager;
    private final AnalyticsUtil analyticsUtil;
    private final Provider gcmNetworkManager;
    private final GeofencingClient geofencingClient;
    private final SharedPreferences globalPrefs;
    private final GlobalResourcesSyncManager globalResourcesSyncManager;
    private final WalletHceContext hceContext;
    private final InitializerTaskManager initializerTaskManager;
    private final NetworkAccessChecker networkAccessChecker;

    AccountChanger(FragmentActivity fragmentactivity, ActionExecutor actionexecutor, SharedPreferences sharedpreferences, NetworkAccessChecker networkaccesschecker, GeofencingClient geofencingclient, Provider provider, GlobalResourcesSyncManager globalresourcessyncmanager, 
            WalletHceContext wallethcecontext, InitializerTaskManager initializertaskmanager, AnalyticsUtil analyticsutil, AlarmManager alarmmanager)
    {
        activity = fragmentactivity;
        actionExecutor = actionexecutor;
        globalPrefs = sharedpreferences;
        geofencingClient = geofencingclient;
        gcmNetworkManager = provider;
        globalResourcesSyncManager = globalresourcessyncmanager;
        hceContext = wallethcecontext;
        networkAccessChecker = networkaccesschecker;
        initializerTaskManager = initializertaskmanager;
        analyticsUtil = analyticsutil;
        alarmManager = alarmmanager;
    }

    private void checkNetworkAndReset(Callable callable)
    {
        String s;
        FragmentManager fragmentmanager;
label0:
        {
            if (networkAccessChecker.check())
            {
                s = Fragments.getTransactionTag(com/google/android/apps/wallet/util/async/activity/WalletTaskFragment);
                fragmentmanager = activity.getSupportFragmentManager();
                if ((WalletTaskFragment)fragmentmanager.findFragmentByTag(s) == null)
                {
                    break label0;
                }
                WLog.w(TAG, "Ignoring redundant click");
            }
            return;
        }
        WalletTaskFragment wallettaskfragment = new WalletTaskFragment();
        wallettaskfragment.setActionExecutor(actionExecutor);
        fragmentmanager.beginTransaction().add(wallettaskfragment, s).commit();
        wallettaskfragment.executeAction(com/google/android/apps/wallet/account/AccountChanger.getName(), "RESET", callable);
    }

    private void clearWebViewCache()
    {
        (new WebView(activity)).clearCache(true);
        CookieManager.getInstance().removeAllCookie();
        CookieSyncManager.createInstance(activity);
        CookieSyncManager.getInstance().sync();
    }

    private void restart(String s, Uri uri)
    {
        String s1 = TAG;
        Object obj = String.valueOf(s);
        if (((String) (obj)).length() != 0)
        {
            obj = "Restarting wallet with account: ".concat(((String) (obj)));
        } else
        {
            obj = new String("Restarting wallet with account: ");
        }
        WLog.d(s1, ((String) (obj)));
        obj = uri;
        if (uri == null)
        {
            obj = UriRegistry.getUri(1, new Object[0]);
        }
        uri = UriIntents.create(activity, ((Uri) (obj))).addFlags(0x10008000);
        globalPrefs.edit().putString(SharedPreference.ACCOUNT_NAME.getKey(), s).putBoolean(SharedPreference.CHANGED_USER.getKey(), true).commit();
        activity.startActivity(uri);
        activity.finish();
    }

    public final void changeAccount(String s)
    {
        changeAccount(s, null);
    }

    public final void changeAccount(final String nextAccountName, final Uri uri)
    {
        ThreadPreconditions.checkOnUiThread();
        SharedPreference.START_TIME_SWITCH_USER.putAndCommit(globalPrefs, Long.valueOf(SystemClock.elapsedRealtime()));
        clearWebViewCache();
        checkNetworkAndReset(new Callable() {

            final AccountChanger this$0;
            final String val$nextAccountName;
            final Uri val$uri;

            private Void call()
                throws Exception
            {
                geofencingClient.stop(activity);
                hceContext.quiesce();
                initializerTaskManager.clearSuccessfulTasks();
                ((GcmNetworkManager)gcmNetworkManager.get()).cancelAllTasks(com/google/android/apps/wallet/hce/setup/PaymentBundleRefreshService);
                alarmManager.cancel(PaymentBundleRefresher.backupBundleRefreshIntent(activity));
                globalResourcesSyncManager.disablePeriodicSync();
                analyticsUtil.startNewGaSession();
                restart(nextAccountName, uri);
                return null;
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = AccountChanger.this;
                nextAccountName = s;
                uri = uri1;
                super();
            }
        });
    }










}
