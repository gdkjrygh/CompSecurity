// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.content.Intent;

// Referenced classes of package com.skype.android.push:
//            a, PushServiceType, PushEventType, DisplayResult, 
//            OnMessageConsumedListener

public class ConciergePushMessage extends a
{

    private static final String EXTRA_MSG = "msg";
    private static final String EXTRA_TITLE = "title";
    private final String msg;
    private final String title;

    public ConciergePushMessage(PushServiceType pushservicetype, PushEventType pusheventtype, Intent intent)
    {
        super(pushservicetype, pusheventtype, intent);
        msg = intent.getStringExtra("msg");
        title = intent.getStringExtra("title");
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
        return getMessage();
    }

    public String getMessage()
    {
        return msg;
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

    public String getTitle()
    {
        return title;
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
