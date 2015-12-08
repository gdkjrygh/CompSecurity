// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.content.Intent;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.push:
//            OnMessageConsumedListener, PushMessage, DisplayResult, PushServiceType, 
//            PushEventType

abstract class a
    implements OnMessageConsumedListener, PushMessage
{

    static final Logger logger = Logger.getLogger("AbstractPushMessage");
    private PushEventType eventType;
    private Intent intent;
    private Object message;
    private OnMessageConsumedListener onMessageConsumedListener;
    private int rawPayloadSize;
    private long receivedTimestamp;
    private String serviceToken;
    private PushServiceType serviceType;

    a(PushServiceType pushservicetype, PushEventType pusheventtype, Intent intent1)
    {
        serviceType = pushservicetype;
        eventType = pusheventtype;
        intent = intent1;
        rawPayloadSize = determinePayloadSize(intent1);
    }

    protected int determinePayloadSize(Intent intent1)
    {
        return 0;
    }

    protected void finalize()
        throws Throwable
    {
        if (onMessageConsumedListener != null)
        {
            onMessageConsumedListener.onMessageConsumed(DisplayResult.MESSAGE_LOST);
            logger.warning((new StringBuilder("Message display event or hide reason unreported for ")).append(getClass().getSimpleName()).append("/").append(serviceType.name()).append("/").append(serviceToken).toString());
        }
        super.finalize();
    }

    public PushEventType getEventType()
    {
        return eventType;
    }

    public Intent getIntent()
    {
        return intent;
    }

    public Object getMessage()
    {
        return message;
    }

    public int getRawPayloadSize()
    {
        return rawPayloadSize;
    }

    public long getReceivedTimestamp()
    {
        return receivedTimestamp;
    }

    public String getServiceToken()
    {
        return serviceToken;
    }

    public PushServiceType getServiceType()
    {
        return serviceType;
    }

    public void onMessageConsumed(DisplayResult displayresult)
    {
        if (onMessageConsumedListener != null)
        {
            onMessageConsumedListener.onMessageConsumed(displayresult);
            onMessageConsumedListener = null;
        }
    }

    public void setMessage(Object obj)
    {
        message = obj;
    }

    public void setOnMessageConsumedListener(OnMessageConsumedListener onmessageconsumedlistener)
    {
        onMessageConsumedListener = onmessageconsumedlistener;
    }

    public void setReceivedTimestamp(long l)
    {
        receivedTimestamp = l;
    }

    public void setServiceToken(String s)
    {
        serviceToken = s;
    }

}
