// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.auth;

import twitter4j.conf.Configuration;

// Referenced classes of package twitter4j.auth:
//            OAuthAuthorization, AccessToken, NullAuthorization, BasicAuthorization, 
//            Authorization

public final class AuthorizationFactory
{

    public AuthorizationFactory()
    {
    }

    public static Authorization getInstance(Configuration configuration)
    {
        Object obj;
        String s;
        String s3;
        obj = null;
        s = configuration.getOAuthConsumerKey();
        s3 = configuration.getOAuthConsumerSecret();
        if (s == null || s3 == null) goto _L2; else goto _L1
_L1:
        obj = new OAuthAuthorization(configuration);
        String s1 = configuration.getOAuthAccessToken();
        configuration = configuration.getOAuthAccessTokenSecret();
        if (s1 != null && configuration != null)
        {
            ((OAuthAuthorization) (obj)).setOAuthAccessToken(new AccessToken(s1, configuration));
        }
        configuration = ((Configuration) (obj));
_L4:
        obj = configuration;
        if (configuration == null)
        {
            obj = NullAuthorization.getInstance();
        }
        return ((Authorization) (obj));
_L2:
        String s2 = configuration.getUser();
        String s4 = configuration.getPassword();
        configuration = ((Configuration) (obj));
        if (s2 != null)
        {
            configuration = ((Configuration) (obj));
            if (s4 != null)
            {
                configuration = new BasicAuthorization(s2, s4);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
