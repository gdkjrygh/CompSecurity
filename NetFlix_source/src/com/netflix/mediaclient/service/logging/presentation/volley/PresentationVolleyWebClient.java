// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.presentation.volley;

import com.netflix.mediaclient.service.logging.presentation.PresentationRequest;
import com.netflix.mediaclient.service.logging.presentation.PresentationWebCallback;
import com.netflix.mediaclient.service.logging.presentation.PresentationWebClient;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClient;

// Referenced classes of package com.netflix.mediaclient.service.logging.presentation.volley:
//            PresentationEventRequest

public class PresentationVolleyWebClient
    implements PresentationWebClient
{

    private final FalcorVolleyWebClient mWebClient;

    public PresentationVolleyWebClient(FalcorVolleyWebClient falcorvolleywebclient)
    {
        mWebClient = falcorvolleywebclient;
    }

    public boolean isSynchronous()
    {
        return mWebClient.isSynchronous();
    }

    public void sendPresentationEvents(String s, PresentationRequest presentationrequest, PresentationWebCallback presentationwebcallback)
    {
        s = new PresentationEventRequest(s, presentationrequest, presentationwebcallback);
        mWebClient.sendPresentationRequest(s);
    }
}
