// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.extension.google.wallet;

import android.app.Activity;
import android.util.Log;
import com.dominos.android.sdk.app.ApplicationService;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.ConfigProvider;
import com.dominos.android.sdk.common.Manager;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.wallet.f;
import com.google.android.gms.wallet.i;

public class GoogleWalletManager extends Manager
{

    public static final String GW_STATE_APP_AUTHORIZED = "app_authorized";
    public static final String GW_STATE_NOT_AUTHORIZED = "not_authorized";
    public static final String GW_STATE_SESSION_AUTHORIZED = "session_authorized";
    private static final String TAG = com/dominos/android/sdk/extension/google/wallet/GoogleWalletManager.getSimpleName();
    ApplicationService appService;
    private boolean isInitialized;
    ConfigProvider mConfigProvider;
    private ConfigurationManager mConfigurationManager;
    DominosPrefs_ prefs;
    private int walletEnvironment;

    public GoogleWalletManager()
    {
    }

    public String getName()
    {
        return "google_wallet_manager";
    }

    public l getWalletClient(Activity activity, n n, o o)
    {
        return (new m(activity)).a(n).a(o).a().a(f.a, (new i()).a(walletEnvironment).a().b()).c();
    }

    public boolean isGoogleWalletAvailable(StoreProfile storeprofile)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (mConfigurationManager.getApplicationConfiguration().isGoogleWalletEnabled())
        {
            flag = flag1;
            if (storeprofile != null)
            {
                flag = flag1;
                if (storeprofile.isGoogleWalletAvailable())
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    protected void onSessionSet()
    {
        mConfigurationManager = (ConfigurationManager)getSession().getManager("configuration_manager");
    }

    public void setWalletEnvironment(int j)
    {
        if (!isInitialized)
        {
            isInitialized = true;
            if (appService.isDebugMode())
            {
                Log.d(TAG, "walletEnvironment has been initialized for the first time");
            }
        }
        if (appService.isDebugMode())
        {
            Log.d(TAG, (new StringBuilder("walletEnvironment = ")).append(j).toString());
        }
        walletEnvironment = j;
    }

    public void setup()
    {
        if (!isInitialized)
        {
            setWalletEnvironment(mConfigProvider.getGoogleWalletEnvironment());
        }
    }

}
