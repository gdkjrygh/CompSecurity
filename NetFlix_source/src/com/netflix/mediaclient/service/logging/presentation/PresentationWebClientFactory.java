// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.presentation;

import com.netflix.mediaclient.service.logging.presentation.volley.PresentationVolleyWebClient;
import com.netflix.mediaclient.service.webclient.WebClient;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClient;

// Referenced classes of package com.netflix.mediaclient.service.logging.presentation:
//            PresentationWebClient

public class PresentationWebClientFactory
{

    private PresentationWebClientFactory()
    {
    }

    public static final PresentationWebClient create(WebClient webclient)
    {
        return new PresentationVolleyWebClient((FalcorVolleyWebClient)webclient);
    }
}
