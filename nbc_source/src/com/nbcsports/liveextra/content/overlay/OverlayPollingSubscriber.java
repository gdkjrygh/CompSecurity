// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.overlay;

import com.google.gson.Gson;
import com.nbcsports.liveextra.library.core.PollingSubscriber;
import com.squareup.okhttp.OkHttpClient;
import rx.functions.Action0;

public abstract class OverlayPollingSubscriber extends PollingSubscriber
{

    protected boolean suppressPoll;
    private Class type;

    public OverlayPollingSubscriber(OkHttpClient okhttpclient, Gson gson, Class class1)
    {
        super(okhttpclient, gson);
        type = class1;
    }

    protected Action0 getAction()
    {
        if (shouldUseCache())
        {
            return new Action0() {

                final OverlayPollingSubscriber this$0;

                public void call()
                {
                    sendCachedResult();
                }

            
            {
                this$0 = OverlayPollingSubscriber.this;
                super();
            }
            };
        } else
        {
            return super.getAction();
        }
    }

    public void setListener(com.nbcsports.liveextra.library.core.PollingSubscriber.PollingCallback pollingcallback)
    {
        super.setListener(pollingcallback, type);
    }

    protected boolean shouldUseCache()
    {
        return responseBody != null && suppressPoll;
    }

    protected boolean suppressFailureRetry()
    {
        return true;
    }

    public void suppressPoll(boolean flag)
    {
        suppressPoll = flag;
    }

}
