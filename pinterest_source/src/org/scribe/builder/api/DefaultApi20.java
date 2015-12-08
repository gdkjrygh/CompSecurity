// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.scribe.builder.api;

import org.scribe.extractors.AccessTokenExtractor;
import org.scribe.extractors.TokenExtractor20Impl;
import org.scribe.model.OAuthConfig;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuth20ServiceImpl;
import org.scribe.oauth.OAuthService;

// Referenced classes of package org.scribe.builder.api:
//            Api

public abstract class DefaultApi20
    implements Api
{

    public DefaultApi20()
    {
    }

    public OAuthService createService(OAuthConfig oauthconfig)
    {
        return new OAuth20ServiceImpl(this, oauthconfig);
    }

    public abstract String getAccessTokenEndpoint();

    public AccessTokenExtractor getAccessTokenExtractor()
    {
        return new TokenExtractor20Impl();
    }

    public Verb getAccessTokenVerb()
    {
        return Verb.GET;
    }

    public abstract String getAuthorizationUrl(OAuthConfig oauthconfig);
}
