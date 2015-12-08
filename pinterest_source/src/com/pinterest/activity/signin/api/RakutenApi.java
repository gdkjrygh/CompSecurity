// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.api;

import org.scribe.builder.api.DefaultApi20;
import org.scribe.extractors.AccessTokenExtractor;
import org.scribe.extractors.JsonTokenExtractor;
import org.scribe.model.OAuthConfig;
import org.scribe.model.Verb;
import org.scribe.utils.OAuthEncoder;
import org.scribe.utils.Preconditions;

public class RakutenApi extends DefaultApi20
{

    private static final String AUTHORIZE_URL = "https://app.rakuten.co.jp/engine/authorize?client_id=%s&response_type=code&redirect_uri=%s";
    private static final String SCOPED_AUTHORIZE_URL = "https://app.rakuten.co.jp/engine/authorize?client_id=%s&response_type=code&redirect_uri=%s&scope=%s";

    public RakutenApi()
    {
    }

    public String getAccessTokenEndpoint()
    {
        return "https://app.rakuten.co.jp/engine/token?grant_type=authorization_code";
    }

    public AccessTokenExtractor getAccessTokenExtractor()
    {
        return new JsonTokenExtractor();
    }

    public Verb getAccessTokenVerb()
    {
        return Verb.POST;
    }

    public String getAuthorizationUrl(OAuthConfig oauthconfig)
    {
        Preconditions.checkValidUrl(oauthconfig.getCallback(), "Must provide a valid url as callback.");
        if (oauthconfig.hasScope())
        {
            return String.format("https://app.rakuten.co.jp/engine/authorize?client_id=%s&response_type=code&redirect_uri=%s&scope=%s", new Object[] {
                oauthconfig.getApiKey(), OAuthEncoder.encode(oauthconfig.getCallback()), OAuthEncoder.encode(oauthconfig.getScope())
            });
        } else
        {
            return String.format("https://app.rakuten.co.jp/engine/authorize?client_id=%s&response_type=code&redirect_uri=%s", new Object[] {
                oauthconfig.getApiKey(), OAuthEncoder.encode(oauthconfig.getCallback())
            });
        }
    }
}
