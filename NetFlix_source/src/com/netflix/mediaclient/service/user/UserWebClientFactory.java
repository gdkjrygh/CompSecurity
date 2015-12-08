// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.user.volley.UserVolleyWebClient;
import com.netflix.mediaclient.service.webclient.WebClient;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClient;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            UserWebClient

public class UserWebClientFactory
{

    private UserWebClientFactory()
    {
    }

    public static final UserWebClient create(NetflixService netflixservice, WebClient webclient)
    {
        return new UserVolleyWebClient(netflixservice, (FalcorVolleyWebClient)webclient);
    }
}
