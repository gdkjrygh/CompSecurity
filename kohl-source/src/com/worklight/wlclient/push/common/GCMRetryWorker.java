// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.push.common;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.worklight.common.Logger;
import com.worklight.nativeandroid.common.WLUtils;
import java.util.Random;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.worklight.wlclient.push.common:
//            GCMRetryListener

public class GCMRetryWorker
{

    public static final int DEFAULT_BACK_OFF = 3000;
    private static final String EXTRA_TOKEN = "token";
    private static final int MAX_BACKOFF_MS;
    public static final String RETRY_CONNECTION_INTENT_SUFFIX = "retryconnection";
    public static final String SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    private static final String TOKEN;
    private static final Random sRandom;
    private AlarmManager am;
    private int backoff;
    private GCMRetryListener gcmRetryListener;
    private Logger logger;
    private PendingIntent retryPendingIntent;

    public GCMRetryWorker(GCMRetryListener gcmretrylistener)
    {
        logger = Logger.getInstance("GCMRetryWorker");
        backoff = 3000;
        gcmRetryListener = gcmretrylistener;
    }

    public boolean isErrorRetriable(String s)
    {
        return gcmRetryListener.getErrorCode("SERVICE_NOT_AVAILABLE").equals(s);
    }

    public void resetBackOff()
    {
        backoff = 3000;
        if (am != null && retryPendingIntent != null)
        {
            am.cancel(retryPendingIntent);
        }
    }

    public void scheduleRetry()
    {
        int i = backoff / 2 + sRandom.nextInt(backoff);
        logger.debug((new StringBuilder()).append("Scheduling registration retry, backoff = ").append(i).append(" (").append(backoff).append(")").toString());
        if (am != null && retryPendingIntent != null)
        {
            am.cancel(retryPendingIntent);
        }
        Intent intent = new Intent((new StringBuilder()).append(WLUtils.getFullAppName(gcmRetryListener.getContext())).append("retryconnection").toString());
        intent.putExtra("token", TOKEN);
        retryPendingIntent = PendingIntent.getBroadcast(gcmRetryListener.getContext(), 0, intent, 0x8000000);
        am = (AlarmManager)gcmRetryListener.getContext().getSystemService("alarm");
        am.set(3, SystemClock.elapsedRealtime() + (long)i, retryPendingIntent);
        if (backoff < MAX_BACKOFF_MS)
        {
            backoff = backoff * 2;
        }
    }

    public boolean validateIntent(Intent intent)
    {
        intent = intent.getStringExtra("token");
        if (!TOKEN.equals(intent))
        {
            logger.error((new StringBuilder()).append("Received invalid token: ").append(intent).append(" Expected ").append(TOKEN).toString());
            return false;
        } else
        {
            return true;
        }
    }

    static 
    {
        MAX_BACKOFF_MS = (int)TimeUnit.SECONDS.toMillis(3600L);
        sRandom = new Random();
        TOKEN = Integer.toBinaryString(sRandom.nextInt(0x7ffffffe) + 1);
    }
}
