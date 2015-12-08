// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.service;

import android.app.IntentService;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.restrictioncheck.WalletRestrictionChecker;
import com.google.android.apps.wallet.userscope.UserInjector;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.base.service:
//            WalletContextParameter

public abstract class WalletIntentService extends IntentService
{

    private static final String TAG = com/google/android/apps/wallet/base/service/WalletIntentService.getSimpleName();
    private final Set parameters;
    WalletRestrictionChecker restrictionChecker;
    SharedPreferences sharedPreferences;

    public WalletIntentService(String s, Set set)
    {
        super(s);
        parameters = set;
    }

    private boolean shouldHandleIntent(Intent intent)
    {
        if (parameters.contains(WalletContextParameter.SETUP_COMPLETE) && !((Boolean)SharedPreference.SETUP_COMPLETE.get(sharedPreferences)).booleanValue())
        {
            WLog.d(TAG, "Ignoring intent because wallet is not initialized.");
            return false;
        }
        if (parameters.contains(WalletContextParameter.RESTRICTIONS_SATISFIED) && !restrictionChecker.checkAllRestrictionsSatisfied())
        {
            stopSelf();
            return false;
        } else
        {
            return true;
        }
    }

    protected abstract void doOnHandleIntent(Intent intent);

    protected void onHandleIntent(Intent intent)
    {
        UserInjector.inject(this, this);
        if (shouldHandleIntent(intent))
        {
            doOnHandleIntent(intent);
        }
    }

}
