// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import com.vungle.publisher.aa;
import com.vungle.publisher.event.EventBus;
import com.vungle.publisher.net.http.HttpResponse;
import com.vungle.publisher.net.http.HttpTransaction;
import com.vungle.publisher.net.http.MaxRetryAgeHttpResponseHandler;
import com.vungle.publisher.protocol.message.RequestStreamingAdResponse;
import com.vungle.publisher.r;
import java.io.IOException;
import org.json.JSONException;

public class RequestStreamingAdHttpResponseHandler extends MaxRetryAgeHttpResponseHandler
{

    EventBus a;
    com.vungle.publisher.protocol.message.RequestStreamingAdResponse.Factory b;

    RequestStreamingAdHttpResponseHandler()
    {
        super.i = 1;
        super.h = 1;
    }

    protected final void a(HttpTransaction httptransaction, HttpResponse httpresponse)
        throws IOException, JSONException
    {
        httptransaction = a(httpresponse.a);
        httptransaction = (RequestStreamingAdResponse)b.a(httptransaction);
        a.a(new aa(httptransaction));
    }

    protected final void b(HttpTransaction httptransaction, HttpResponse httpresponse)
    {
        a.a(new r());
    }
}
