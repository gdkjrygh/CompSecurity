// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.skype.android.push:
//            PushHandlingService

public class PushHandlingHelper
{

    private Context context;
    private final long pushHandlingTimeMilliseconds;
    private final AtomicLong syntheticId = new AtomicLong(0x80000000L);

    public PushHandlingHelper(Application application)
    {
        context = application;
        pushHandlingTimeMilliseconds = PushHandlingService.DEFAULT_PUSH_PROCESSING_TIME;
    }

    private void startServiceWithAction(Context context1, long l, String s)
    {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context1.getPackageName(), com/skype/android/push/PushHandlingService.getName()));
        intent.setAction(s);
        intent.putExtra("pushId", l);
        intent.putExtra("pushHandlingLifetime", pushHandlingTimeMilliseconds);
        WakefulBroadcastReceiver.startWakefulService(context1, intent);
    }

    public long startPushHandling()
    {
        long l = syntheticId.getAndIncrement();
        startPushHandling(l);
        return l;
    }

    public void startPushHandling(long l)
    {
        startServiceWithAction(context, l, "com.skype.android.push.StartPushHandling");
    }

    public void stopPushHandling(long l)
    {
        startServiceWithAction(context, l, "com.skype.android.push.StopPushHandling");
    }
}
