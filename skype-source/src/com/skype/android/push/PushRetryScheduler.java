// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.push:
//            RegisterReceiver

public class PushRetryScheduler
{

    public static final String EXTRA_BACKOFF = "backoff";
    public static final long INITIAL_RETRY_TIME;
    public static final long MAX_RETRY_INTERVAL;
    private static final Logger log = Logger.getLogger("PushRetryScheduler");
    private static long retryDelay;
    private Context context;

    public PushRetryScheduler(Context context1)
    {
        context = context1;
        retryDelay = INITIAL_RETRY_TIME;
    }

    public static void setBackOff(long l)
    {
        retryDelay = l;
    }

    public void scheduleRetry()
    {
        if (retryDelay > MAX_RETRY_INTERVAL)
        {
            log.info("Unable to connect to GCM, give up");
            return;
        } else
        {
            log.info((new StringBuilder("schedule retry in: ")).append(retryDelay).append(" ms").toString());
            AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
            Object obj = new Intent(context, com/skype/android/push/RegisterReceiver);
            ((Intent) (obj)).putExtra("backoff", retryDelay * 2L);
            ((Intent) (obj)).setAction("com.skype.android.push.REGISTER");
            obj = PendingIntent.getBroadcast(context, 2, ((Intent) (obj)), 0x10000000);
            alarmmanager.set(0, System.currentTimeMillis() + retryDelay, ((PendingIntent) (obj)));
            retryDelay *= 2L;
            return;
        }
    }

    static 
    {
        INITIAL_RETRY_TIME = TimeUnit.SECONDS.toMillis(3L);
        MAX_RETRY_INTERVAL = TimeUnit.MINUTES.toMillis(30L);
        retryDelay = INITIAL_RETRY_TIME;
    }
}
