// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.logging.WLog;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.hce.setup:
//            NfcPaymentSetupService

public class SetupHceOnBootTask
    implements Callable
{

    private static final String TAG = com/google/android/apps/wallet/hce/setup/SetupHceOnBootTask.getSimpleName();
    private final Application application;
    private final SharedPreferences sharedPreferences;

    SetupHceOnBootTask(Application application1, SharedPreferences sharedpreferences)
    {
        application = application1;
        sharedPreferences = sharedpreferences;
    }

    private Void call()
    {
        if (isHceHandledByGmsCore())
        {
            SharedPreference.HCE_HANDLED_BY_GMS_CORE.put(sharedPreferences, Boolean.valueOf(true));
            WLog.d(TAG, "HCE is handled by Gms Core");
            NfcPaymentSetupService.requestDisableHce(application);
        } else
        {
            SharedPreference.HCE_HANDLED_BY_GMS_CORE.put(sharedPreferences, Boolean.valueOf(false));
            WLog.d(TAG, "Hce is not handled by Gms Core");
            NfcPaymentSetupService.requestHceSetupOnBoot(application);
        }
        return null;
    }

    private boolean isHceHandledByGmsCore()
    {
        boolean flag = false;
        if (application.getPackageManager().queryBroadcastReceivers(new Intent("com.google.android.gms.tapandpay.UPGRADE_NFC_WALLET"), 0).size() > 0)
        {
            flag = true;
        }
        return flag;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

}
