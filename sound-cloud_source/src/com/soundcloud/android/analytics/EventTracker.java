// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.soundcloud.android.analytics:
//            TrackingHandlerFactory, TrackingHandler, TrackingRecord

public class EventTracker
{

    private static final long FINISH_DELAY_MILLIS;
    static final String TAG = com/soundcloud/android/analytics/EventTracker.getSimpleName();
    private TrackingHandler handler;
    private final TrackingHandlerFactory handlerFactory;

    public EventTracker(TrackingHandlerFactory trackinghandlerfactory)
    {
        handlerFactory = trackinghandlerfactory;
    }

    private void createHandlerIfNecessary()
    {
        if (isHandlerDead())
        {
            HandlerThread handlerthread = new HandlerThread(TAG, 19);
            handlerthread.start();
            handler = handlerFactory.create(handlerthread.getLooper());
        }
    }

    private boolean isHandlerDead()
    {
        return handler == null || handler.getLooper().getThread().getState() == Thread.State.TERMINATED;
    }

    public void flush(String s)
    {
        createHandlerIfNecessary();
        handler.obtainMessage(1, s).sendToTarget();
    }

    public void trackEvent(TrackingRecord trackingrecord)
    {
        (new StringBuilder("New tracking event: ")).append(trackingrecord.toString());
        createHandlerIfNecessary();
        handler.removeMessages(0xdeadbeef);
        trackingrecord = handler.obtainMessage(0, trackingrecord);
        handler.sendMessage(trackingrecord);
        trackingrecord = handler.obtainMessage(0xdeadbeef);
        handler.sendMessageDelayed(trackingrecord, FINISH_DELAY_MILLIS);
    }

    static 
    {
        FINISH_DELAY_MILLIS = TimeUnit.SECONDS.toMillis(30L);
    }
}
