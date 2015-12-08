// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.ads.volley;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.ads.AdvertiserIdLoggingCallback;
import com.netflix.mediaclient.service.logging.ads.AdvertiserIdLoggingWebClient;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClient;

// Referenced classes of package com.netflix.mediaclient.service.logging.ads.volley:
//            AdvertiserIdLoggingVolleyWebClientRequest

public final class AdvertiserIdLoggingVolleyWebClient
    implements AdvertiserIdLoggingWebClient
{

    private static final String TAG = "nf_log";
    private final FalcorVolleyWebClient mWebClient;

    public AdvertiserIdLoggingVolleyWebClient(FalcorVolleyWebClient falcorvolleywebclient)
    {
        mWebClient = falcorvolleywebclient;
    }

    public boolean isSynchronous()
    {
        return mWebClient.isSynchronous();
    }

    public void sendLoggingEvent(String s, AdvertiserIdLoggingCallback advertiseridloggingcallback)
    {
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("send Advertising ID event send starts: ").append(s).toString());
        }
        s = new AdvertiserIdLoggingVolleyWebClientRequest(s, advertiseridloggingcallback);
        mWebClient.sendLoggingRequest(s);
        Log.d("nf_log", "send Advertising ID event send done.");
    }
}
