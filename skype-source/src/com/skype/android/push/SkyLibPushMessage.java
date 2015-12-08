// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.content.Intent;
import android.os.SystemClock;
import com.skype.SkyLib;
import com.skype.android.config.SkypeLogFormatter;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.push:
//            a, PushEventType, b, PushServiceType, 
//            DisplayResult, OnMessageConsumedListener

public abstract class SkyLibPushMessage extends a
{

    static final Logger log = Logger.getLogger("SkyLibPushMessage");
    private long handlingStartedTimestamp;
    private b onStampedListener;

    SkyLibPushMessage(PushServiceType pushservicetype, PushEventType pusheventtype, Intent intent)
    {
        super(pushservicetype, pusheventtype, intent);
    }

    private long currentTime()
    {
        return SystemClock.elapsedRealtime();
    }

    public long getElapsedHandlingTime()
    {
        return currentTime() - getHandlingStartedTimestamp();
    }

    public volatile PushEventType getEventType()
    {
        return super.getEventType();
    }

    public int getEventTypeIdForLib()
    {
        return getEventType().value();
    }

    public abstract byte[] getGenericNotificationPayload();

    public long getHandlingStartedTimestamp()
    {
        return handlingStartedTimestamp;
    }

    public volatile Intent getIntent()
    {
        return super.getIntent();
    }

    public volatile Object getMessage()
    {
        return super.getMessage();
    }

    public abstract byte[] getNodeSpecificNotificationPayload();

    public volatile int getRawPayloadSize()
    {
        return super.getRawPayloadSize();
    }

    public volatile long getReceivedTimestamp()
    {
        return super.getReceivedTimestamp();
    }

    protected String getServicePayload()
    {
        return "";
    }

    public volatile String getServiceToken()
    {
        return super.getServiceToken();
    }

    public volatile PushServiceType getServiceType()
    {
        return super.getServiceType();
    }

    public final int handleInSkyLib(SkyLib skylib)
    {
        handlingStartedTimestamp = currentTime();
        int i = skylib.handlePushNotification(getEventTypeIdForLib(), getNodeSpecificNotificationPayload(), getGenericNotificationPayload(), getServicePayload());
        log.info(String.format("handling push message %d", new Object[] {
            Integer.valueOf(i)
        }));
        log.info((new StringBuilder("Node specific payload: ")).append(SkypeLogFormatter.toHexString(getNodeSpecificNotificationPayload())).toString());
        log.info((new StringBuilder("Generic notification payload: ")).append(SkypeLogFormatter.toHexString(getGenericNotificationPayload())).toString());
        skylib = onStampedListener;
        if (skylib != null)
        {
            skylib.onStamped(i, this);
        }
        return i;
    }

    public volatile void onMessageConsumed(DisplayResult displayresult)
    {
        super.onMessageConsumed(displayresult);
    }

    public volatile void setMessage(Object obj)
    {
        super.setMessage(obj);
    }

    public volatile void setOnMessageConsumedListener(OnMessageConsumedListener onmessageconsumedlistener)
    {
        super.setOnMessageConsumedListener(onmessageconsumedlistener);
    }

    public void setOnStampedListener(b b1)
    {
        onStampedListener = b1;
    }

    public volatile void setReceivedTimestamp(long l)
    {
        super.setReceivedTimestamp(l);
    }

    public volatile void setServiceToken(String s)
    {
        super.setServiceToken(s);
    }

}
