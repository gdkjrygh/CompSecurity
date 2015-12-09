// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user.volley;

import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.user.UserAgentWebCallback;
import com.netflix.mediaclient.service.user.UserWebClient;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClient;

// Referenced classes of package com.netflix.mediaclient.service.user.volley:
//            FetchConnectWithFacebookRequest, FetchDummyWebRequest, FetchAccountDataRequest, FetchProfileDataRequest, 
//            SwitchUserProfileRequest, VerifyPinRequest

public final class UserVolleyWebClient
    implements UserWebClient
{

    private final NetflixService service;
    private final FalcorVolleyWebClient webclient;

    public UserVolleyWebClient(NetflixService netflixservice, FalcorVolleyWebClient falcorvolleywebclient)
    {
        webclient = falcorvolleywebclient;
        service = netflixservice;
    }

    public void connectWithFacebook(String s, UserAgentWebCallback useragentwebcallback)
    {
        s = new FetchConnectWithFacebookRequest(service.getApplicationContext(), service.getConfiguration(), s, useragentwebcallback);
        webclient.sendRequest(s);
    }

    public void disconnectFromFacebook(UserAgentWebCallback useragentwebcallback)
    {
        useragentwebcallback.onDisconnectWithFacebook(-10, "error : not implemented");
    }

    public void doDummyWebCall(UserAgentWebCallback useragentwebcallback)
    {
        useragentwebcallback = new FetchDummyWebRequest(service.getApplicationContext(), service.getConfiguration(), useragentwebcallback);
        webclient.sendRequest(useragentwebcallback);
    }

    public void fetchAccountData(UserAgentWebCallback useragentwebcallback)
    {
        useragentwebcallback = new FetchAccountDataRequest(service.getApplicationContext(), service.getConfiguration(), useragentwebcallback);
        webclient.sendRequest(useragentwebcallback);
    }

    public void fetchProfileData(String s, UserAgentWebCallback useragentwebcallback)
    {
        s = new FetchProfileDataRequest(service.getApplicationContext(), service.getConfiguration(), s, useragentwebcallback);
        webclient.sendRequest(s);
    }

    public final boolean isSynchronous()
    {
        return webclient.isSynchronous();
    }

    public void switchWebUserProfile(String s, UserAgentWebCallback useragentwebcallback)
    {
        s = new SwitchUserProfileRequest(service.getApplicationContext(), service.getConfiguration(), s, useragentwebcallback);
        webclient.sendRequest(s);
    }

    public void verifyPin(String s, UserAgentWebCallback useragentwebcallback)
    {
        s = new VerifyPinRequest(service.getApplicationContext(), service.getConfiguration(), s, useragentwebcallback);
        webclient.sendRequest(s);
    }
}
