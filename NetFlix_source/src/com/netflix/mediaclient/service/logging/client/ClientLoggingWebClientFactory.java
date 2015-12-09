// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client;

import com.netflix.mediaclient.service.logging.client.volley.ClientLoggingVolleyWebClient;
import com.netflix.mediaclient.service.webclient.WebClient;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClient;

// Referenced classes of package com.netflix.mediaclient.service.logging.client:
//            ClientLoggingWebClient

public class ClientLoggingWebClientFactory
{

    private ClientLoggingWebClientFactory()
    {
    }

    public static final ClientLoggingWebClient create(WebClient webclient)
    {
        return new ClientLoggingVolleyWebClient((FalcorVolleyWebClient)webclient);
    }
}
