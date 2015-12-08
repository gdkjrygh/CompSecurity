// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.auth;

import twitter4j.conf.Configuration;

// Referenced classes of package twitter4j.auth:
//            OAuth2Authorization, OAuth2Token, NullAuthorization, OAuthAuthorization, 
//            AccessToken, BasicAuthorization, Authorization

public final class AuthorizationFactory
{

    public AuthorizationFactory()
    {
    }

    public static Authorization getInstance(Configuration configuration)
    {
        Object obj;
        String s;
        String s4;
        obj = null;
        s = configuration.getOAuthConsumerKey();
        s4 = configuration.getOAuthConsumerSecret();
        if (s == null || s4 == null) goto _L2; else goto _L1
_L1:
        if (configuration.isApplicationOnlyAuthEnabled())
        {
            obj = new OAuth2Authorization(configuration);
            String s1 = configuration.getOAuth2TokenType();
            configuration = configuration.getOAuth2AccessToken();
            if (s1 != null && configuration != null)
            {
                ((OAuth2Authorization) (obj)).setOAuth2Token(new OAuth2Token(s1, configuration));
            }
            configuration = ((Configuration) (obj));
        } else
        {
            obj = new OAuthAuthorization(configuration);
            String s2 = configuration.getOAuthAccessToken();
            configuration = configuration.getOAuthAccessTokenSecret();
            if (s2 != null && configuration != null)
            {
                ((OAuthAuthorization) (obj)).setOAuthAccessToken(new AccessToken(s2, configuration));
            }
            configuration = ((Configuration) (obj));
        }
_L4:
        obj = configuration;
        if (configuration == null)
        {
            obj = NullAuthorization.getInstance();
        }
        return ((Authorization) (obj));
_L2:
        String s3 = configuration.getUser();
        String s5 = configuration.getPassword();
        configuration = ((Configuration) (obj));
        if (s3 != null)
        {
            configuration = ((Configuration) (obj));
            if (s5 != null)
            {
                configuration = new BasicAuthorization(s3, s5);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
