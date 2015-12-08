// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.volley;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.client.ClientLoggingWebCallback;
import com.netflix.mediaclient.service.logging.client.ClientLoggingWebClient;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClient;

// Referenced classes of package com.netflix.mediaclient.service.logging.client.volley:
//            LoggingEventsRequest

public class ClientLoggingVolleyWebClient
    implements ClientLoggingWebClient
{

    private static final String TAG = "nf_log";
    private final FalcorVolleyWebClient mWebClient;

    public ClientLoggingVolleyWebClient(FalcorVolleyWebClient falcorvolleywebclient)
    {
        mWebClient = falcorvolleywebclient;
    }

    public boolean isSynchronous()
    {
        return mWebClient.isSynchronous();
    }

    public void sendLoggingEvents(String s, String s1, ClientLoggingWebCallback clientloggingwebcallback)
    {
        Log.d("nf_log", "sendLoggingEvents starts...");
        s = new LoggingEventsRequest(s, s1, clientloggingwebcallback);
        mWebClient.sendLoggingRequest(s);
        Log.d("nf_log", "sendLoggingEvents done.");
    }
}
