// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.scribe.builder.api;

import org.scribe.extractors.AccessTokenExtractor;
import org.scribe.extractors.BaseStringExtractor;
import org.scribe.extractors.BaseStringExtractorImpl;
import org.scribe.extractors.HeaderExtractor;
import org.scribe.extractors.HeaderExtractorImpl;
import org.scribe.extractors.RequestTokenExtractor;
import org.scribe.extractors.TokenExtractorImpl;
import org.scribe.model.OAuthConfig;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuth10aServiceImpl;
import org.scribe.oauth.OAuthService;
import org.scribe.services.HMACSha1SignatureService;
import org.scribe.services.SignatureService;
import org.scribe.services.TimestampService;
import org.scribe.services.TimestampServiceImpl;

// Referenced classes of package org.scribe.builder.api:
//            Api

public abstract class DefaultApi10a
    implements Api
{

    public DefaultApi10a()
    {
    }

    public OAuthService createService(OAuthConfig oauthconfig)
    {
        return new OAuth10aServiceImpl(this, oauthconfig);
    }

    public abstract String getAccessTokenEndpoint();

    public AccessTokenExtractor getAccessTokenExtractor()
    {
        return new TokenExtractorImpl();
    }

    public Verb getAccessTokenVerb()
    {
        return Verb.POST;
    }

    public abstract String getAuthorizationUrl(Token token);

    public BaseStringExtractor getBaseStringExtractor()
    {
        return new BaseStringExtractorImpl();
    }

    public HeaderExtractor getHeaderExtractor()
    {
        return new HeaderExtractorImpl();
    }

    public abstract String getRequestTokenEndpoint();

    public RequestTokenExtractor getRequestTokenExtractor()
    {
        return new TokenExtractorImpl();
    }

    public Verb getRequestTokenVerb()
    {
        return Verb.POST;
    }

    public SignatureService getSignatureService()
    {
        return new HMACSha1SignatureService();
    }

    public TimestampService getTimestampService()
    {
        return new TimestampServiceImpl();
    }
}
