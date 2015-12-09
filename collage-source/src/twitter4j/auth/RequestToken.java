// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.auth;

import java.io.Serializable;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationContext;
import twitter4j.internal.http.HttpResponse;

// Referenced classes of package twitter4j.auth:
//            OAuthToken, OAuthSupport

public final class RequestToken extends OAuthToken
    implements Serializable
{

    private static final long serialVersionUID = 0x8e00b5c8fdac7e00L;
    private final Configuration conf;
    private OAuthSupport oauth;

    public RequestToken(String s, String s1)
    {
        super(s, s1);
        conf = ConfigurationContext.getInstance();
    }

    RequestToken(String s, String s1, OAuthSupport oauthsupport)
    {
        super(s, s1);
        conf = ConfigurationContext.getInstance();
        oauth = oauthsupport;
    }

    RequestToken(HttpResponse httpresponse, OAuthSupport oauthsupport)
        throws TwitterException
    {
        super(httpresponse);
        conf = ConfigurationContext.getInstance();
        oauth = oauthsupport;
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public String getAuthenticationURL()
    {
        return (new StringBuilder()).append(conf.getOAuthAuthenticationURL()).append("?oauth_token=").append(getToken()).toString();
    }

    public String getAuthorizationURL()
    {
        return (new StringBuilder()).append(conf.getOAuthAuthorizationURL()).append("?oauth_token=").append(getToken()).toString();
    }

    public volatile String getParameter(String s)
    {
        return super.getParameter(s);
    }

    public volatile String getToken()
    {
        return super.getToken();
    }

    public volatile String getTokenSecret()
    {
        return super.getTokenSecret();
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public volatile String toString()
    {
        return super.toString();
    }
}
