// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.content.Intent;

// Referenced classes of package com.skype.android.push:
//            a, PushServiceType, PushEventType, DisplayResult, 
//            OnMessageConsumedListener

public class PushToMobileMessage extends a
{

    private static final String EXTRA_PAYLOAD = "payload";
    private static final String EXTRA_PHONE_NUMBER = "phoneNumber";
    private static final String EXTRA_SKYPE_ID = "skypeId";
    private String payload;
    private String phoneNumber;
    private String skypeId;

    public PushToMobileMessage(PushServiceType pushservicetype, PushEventType pusheventtype, Intent intent)
    {
        super(pushservicetype, pusheventtype, intent);
        phoneNumber = intent.getStringExtra("phoneNumber");
        payload = intent.getStringExtra("payload");
        skypeId = intent.getStringExtra("skypeId");
    }

    public volatile PushEventType getEventType()
    {
        return super.getEventType();
    }

    public volatile Intent getIntent()
    {
        return super.getIntent();
    }

    public volatile Object getMessage()
    {
        return super.getMessage();
    }

    public String getPayload()
    {
        return payload;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public volatile int getRawPayloadSize()
    {
        return super.getRawPayloadSize();
    }

    public volatile long getReceivedTimestamp()
    {
        return super.getReceivedTimestamp();
    }

    public volatile String getServiceToken()
    {
        return super.getServiceToken();
    }

    public volatile PushServiceType getServiceType()
    {
        return super.getServiceType();
    }

    public String getSkypeId()
    {
        return skypeId;
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

    public volatile void setReceivedTimestamp(long l)
    {
        super.setReceivedTimestamp(l);
    }

    public volatile void setServiceToken(String s)
    {
        super.setServiceToken(s);
    }
}
