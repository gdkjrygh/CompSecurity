// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import android.app.IntentService;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.userscope.UserInjector;

// Referenced classes of package com.google.android.apps.wallet.init:
//            OnBootOrUpgradeReceiver, InitializerTaskManager

public class OnBootOrUpgradeService extends IntentService
{

    private static final String TAG = com/google/android/apps/wallet/init/OnBootOrUpgradeService.getSimpleName();
    InitializerTaskManager initializerTaskManager;
    SharedPreferences sharedPreferences;

    public OnBootOrUpgradeService()
    {
        super(TAG);
    }

    private boolean isSetupComplete()
    {
        return ((Boolean)SharedPreference.SETUP_COMPLETE.get(sharedPreferences)).booleanValue();
    }

    public void onCreate()
    {
        super.onCreate();
        setIntentRedelivery(true);
    }

    protected void onHandleIntent(Intent intent)
    {
        boolean flag;
        UserInjector.inject(this, this);
        flag = isSetupComplete();
        if (!flag)
        {
            OnBootOrUpgradeReceiver.completeWakefulIntent(intent);
            return;
        }
        initializerTaskManager.runTasks();
_L2:
        OnBootOrUpgradeReceiver.completeWakefulIntent(intent);
        return;
        Object obj;
        obj;
        WLog.e(TAG, "Swallowing exception from initializer task", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        OnBootOrUpgradeReceiver.completeWakefulIntent(intent);
        throw obj;
    }

}
