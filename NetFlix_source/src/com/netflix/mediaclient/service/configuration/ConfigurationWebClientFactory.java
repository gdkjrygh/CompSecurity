// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;

import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.configuration.volley.ConfigurationVolleyWebClient;
import com.netflix.mediaclient.service.webclient.WebClient;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClient;

// Referenced classes of package com.netflix.mediaclient.service.configuration:
//            ConfigurationWebClient

public class ConfigurationWebClientFactory
{

    private ConfigurationWebClientFactory()
    {
    }

    public static final ConfigurationWebClient create(NetflixService netflixservice, WebClient webclient)
    {
        return new ConfigurationVolleyWebClient(netflixservice, (FalcorVolleyWebClient)webclient);
    }
}
