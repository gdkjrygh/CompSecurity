// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.soundcloud.android.offline:
//            AlarmManagerReceiver, ResumeDownloadOnConnectedReceiver, DownloadOperations

public class OfflineContentScheduler
{

    static final int ALARM_TYPE = 0;
    static final int REQUEST_ID = 0x7f0f001c;
    private static final long RETRY_DELAY;
    private final AlarmManager alarmManager;
    private final Context context;
    private final DownloadOperations downloadOperations;
    private final ResumeDownloadOnConnectedReceiver resumeOnConnectedReceiver;

    public OfflineContentScheduler(Context context1, AlarmManager alarmmanager, ResumeDownloadOnConnectedReceiver resumedownloadonconnectedreceiver, DownloadOperations downloadoperations)
    {
        context = context1;
        alarmManager = alarmmanager;
        resumeOnConnectedReceiver = resumedownloadonconnectedreceiver;
        downloadOperations = downloadoperations;
    }

    private PendingIntent getPendingIntent(Context context1)
    {
        Intent intent = new Intent(context1, com/soundcloud/android/offline/AlarmManagerReceiver);
        intent.setAction("action_start_download");
        return PendingIntent.getBroadcast(context1, 0x7f0f001c, intent, 0x8000000);
    }

    public void cancelPendingRetries()
    {
        alarmManager.cancel(getPendingIntent(context));
        resumeOnConnectedReceiver.unregister();
    }

    void scheduleDelayedRetry(long l)
    {
        alarmManager.set(0, l, getPendingIntent(context));
    }

    public void scheduleRetry()
    {
        if (!downloadOperations.isValidNetwork())
        {
            resumeOnConnectedReceiver.register();
        }
        scheduleDelayedRetry(System.currentTimeMillis() + RETRY_DELAY);
    }

    static 
    {
        RETRY_DELAY = TimeUnit.MINUTES.toMillis(10L);
    }
}
