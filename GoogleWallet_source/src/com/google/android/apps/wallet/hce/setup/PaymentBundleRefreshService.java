// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.userscope.UserInjector;
import com.google.android.gms.gcm.GcmTaskService;
import com.google.android.gms.gcm.TaskParams;

// Referenced classes of package com.google.android.apps.wallet.hce.setup:
//            PaymentBundleRefresher

public class PaymentBundleRefreshService extends GcmTaskService
{

    private static final String TAG = com/google/android/apps/wallet/hce/setup/PaymentBundleRefreshService.getSimpleName();
    ConnectivityManager connectivityManager;
    PaymentBundleRefresher paymentBundleRefresher;

    public PaymentBundleRefreshService()
    {
    }

    public final int onRunTask(TaskParams taskparams)
    {
        WLog.d(TAG, "PaymentBundleRefreshService woke up");
        int i = Integer.valueOf(taskparams.getTag()).intValue();
        UserInjector.inject(this, this);
        taskparams = connectivityManager.getActiveNetworkInfo();
        if (taskparams == null || !taskparams.isConnectedOrConnecting())
        {
            WLog.d(TAG, "No connectivity, asking gcm to reschedule");
        } else
        if (paymentBundleRefresher.refreshBundle(i))
        {
            return 0;
        }
        return 1;
    }

}
