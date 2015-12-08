// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration.volley;

import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.configuration.ConfigurationAgentWebCallback;
import com.netflix.mediaclient.service.configuration.ConfigurationWebClient;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClient;

// Referenced classes of package com.netflix.mediaclient.service.configuration.volley:
//            FetchConfigDataRequest

public class ConfigurationVolleyWebClient
    implements ConfigurationWebClient
{

    private final NetflixService service;
    private final FalcorVolleyWebClient webclient;

    public ConfigurationVolleyWebClient(NetflixService netflixservice, FalcorVolleyWebClient falcorvolleywebclient)
    {
        webclient = falcorvolleywebclient;
        service = netflixservice;
    }

    public void fetchConfigData(ConfigurationAgentWebCallback configurationagentwebcallback)
    {
        configurationagentwebcallback = new FetchConfigDataRequest(service.getApplicationContext(), service.getConfiguration(), configurationagentwebcallback);
        webclient.sendConfigRequest(configurationagentwebcallback);
    }

    public boolean isSynchronous()
    {
        return webclient.isSynchronous();
    }
}
