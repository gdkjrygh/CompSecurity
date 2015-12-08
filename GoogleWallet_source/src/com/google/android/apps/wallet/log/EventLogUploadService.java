// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.log;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.userscope.UserInjector;
import com.google.android.gms.gcm.GcmTaskService;
import com.google.android.gms.gcm.TaskParams;

// Referenced classes of package com.google.android.apps.wallet.log:
//            EventLogDispatcher

public class EventLogUploadService extends GcmTaskService
{

    private static final String TAG = com/google/android/apps/wallet/log/EventLogUploadService.getSimpleName();
    ConnectivityManager connectivityManager;
    EventLogDispatcher dispatcher;

    public EventLogUploadService()
    {
    }

    public final int onRunTask(TaskParams taskparams)
    {
        WLog.d(TAG, "EventLogUploadService woke up");
        if (taskparams.getTag().equals("uploadEventLogs"))
        {
            UserInjector.inject(this, this);
            taskparams = connectivityManager.getActiveNetworkInfo();
            if (taskparams == null || !taskparams.isConnectedOrConnecting())
            {
                return 1;
            }
            if (!dispatcher.dispatchAll())
            {
                return 1;
            }
        }
        return 0;
    }

}
