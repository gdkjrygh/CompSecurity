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
        if (!configuration.isApplicationOnlyAuthEnabled()) goto _L4; else goto _L3
_L3:
        obj = new OAuth2Authorization(configuration);
        String s1 = configuration.getOAuth2TokenType();
        String s5 = configuration.getOAuth2AccessToken();
        configuration = ((Configuration) (obj));
        if (s1 != null)
        {
            configuration = ((Configuration) (obj));
            if (s5 != null)
            {
                ((OAuth2Authorization) (obj)).setOAuth2Token(new OAuth2Token(s1, s5));
                configuration = ((Configuration) (obj));
            }
        }
_L6:
        obj = configuration;
        if (configuration == null)
        {
            obj = NullAuthorization.getInstance();
        }
        return ((Authorization) (obj));
_L4:
        obj = new OAuthAuthorization(configuration);
        String s2 = configuration.getOAuthAccessToken();
        String s6 = configuration.getOAuthAccessTokenSecret();
        configuration = ((Configuration) (obj));
        if (s2 != null)
        {
            configuration = ((Configuration) (obj));
            if (s6 != null)
            {
                ((OAuthAuthorization) (obj)).setOAuthAccessToken(new AccessToken(s2, s6));
                configuration = ((Configuration) (obj));
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        String s3 = configuration.getUser();
        String s7 = configuration.getPassword();
        configuration = ((Configuration) (obj));
        if (s3 != null)
        {
            configuration = ((Configuration) (obj));
            if (s7 != null)
            {
                configuration = new BasicAuthorization(s3, s7);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
