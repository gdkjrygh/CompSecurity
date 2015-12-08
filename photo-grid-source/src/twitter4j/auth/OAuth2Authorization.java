// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.auth;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.BASE64Encoder;
import twitter4j.internal.http.HttpClientWrapper;
import twitter4j.internal.http.HttpParameter;
import twitter4j.internal.http.HttpRequest;
import twitter4j.internal.http.HttpResponse;

// Referenced classes of package twitter4j.auth:
//            Authorization, OAuth2Support, OAuth2Token

public class OAuth2Authorization
    implements Serializable, Authorization, OAuth2Support
{

    private static final long serialVersionUID = 0x3b5315c6f22864f1L;
    private final Configuration conf;
    private String consumerKey;
    private String consumerSecret;
    private HttpClientWrapper http;
    private OAuth2Token token;

    public OAuth2Authorization(Configuration configuration)
    {
        conf = configuration;
        setOAuthConsumer(configuration.getOAuthConsumerKey(), configuration.getOAuthConsumerSecret());
        http = new HttpClientWrapper(configuration);
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof OAuth2Authorization)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        obj = (OAuth2Authorization)obj;
        if (consumerKey == null) goto _L4; else goto _L3
_L3:
        if (!consumerKey.equals(((OAuth2Authorization) (obj)).consumerKey)) goto _L1; else goto _L5
_L5:
        if (consumerSecret == null) goto _L7; else goto _L6
_L6:
        if (!consumerSecret.equals(((OAuth2Authorization) (obj)).consumerSecret)) goto _L1; else goto _L8
_L8:
        if (token == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        if (!token.equals(((OAuth2Authorization) (obj)).token)) goto _L1; else goto _L9
_L9:
        return true;
_L4:
        if (((OAuth2Authorization) (obj)).consumerKey != null)
        {
            return false;
        }
          goto _L5
_L7:
        if (((OAuth2Authorization) (obj)).consumerSecret != null)
        {
            return false;
        }
          goto _L8
        if (((OAuth2Authorization) (obj)).token != null)
        {
            return false;
        }
          goto _L9
    }

    public String getAuthorizationHeader(HttpRequest httprequest)
    {
        if (token != null) goto _L2; else goto _L1
_L1:
        httprequest = "";
        String s = (new StringBuilder()).append(URLEncoder.encode(consumerKey, "UTF-8")).append(":").append(URLEncoder.encode(consumerSecret, "UTF-8")).toString();
        httprequest = s;
_L4:
        return (new StringBuilder("Basic ")).append(BASE64Encoder.encode(httprequest.getBytes())).toString();
_L2:
        return token.generateAuthorizationHeader();
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public OAuth2Token getOAuth2Token()
    {
        if (token != null)
        {
            throw new IllegalStateException("OAuth 2 Bearer Token is already available.");
        }
        Object obj = new HttpParameter("grant_type", "client_credentials");
        obj = http.post(conf.getOAuth2TokenURL(), new HttpParameter[] {
            obj
        }, this);
        if (((HttpResponse) (obj)).getStatusCode() != 200)
        {
            throw new TwitterException("Obtaining OAuth 2 Bearer Token failed.", ((HttpResponse) (obj)));
        } else
        {
            token = new OAuth2Token(((HttpResponse) (obj)));
            return token;
        }
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (consumerKey != null)
        {
            i = consumerKey.hashCode();
        } else
        {
            i = 0;
        }
        if (consumerSecret != null)
        {
            j = consumerSecret.hashCode();
        } else
        {
            j = 0;
        }
        if (token != null)
        {
            k = token.hashCode();
        }
        return (j + i * 31) * 31 + k;
    }

    public void invalidateOAuth2Token()
    {
        OAuth2Token oauth2token;
        Object obj;
        if (token == null)
        {
            throw new IllegalStateException("OAuth 2 Bearer Token is not available.");
        }
        obj = new HttpParameter("access_token", token.getAccessToken());
        oauth2token = token;
        token = null;
        obj = http.post(conf.getOAuth2InvalidateTokenURL(), new HttpParameter[] {
            obj
        }, this);
        if (((HttpResponse) (obj)).getStatusCode() != 200)
        {
            throw new TwitterException("Invalidating OAuth 2 Bearer Token failed.", ((HttpResponse) (obj)));
        }
        break MISSING_BLOCK_LABEL_99;
        Exception exception;
        exception;
        token = oauth2token;
        throw exception;
    }

    public boolean isEnabled()
    {
        return token != null;
    }

    public void setOAuth2Token(OAuth2Token oauth2token)
    {
        token = oauth2token;
    }

    public void setOAuthConsumer(String s, String s1)
    {
        if (s == null)
        {
            s = "";
        }
        consumerKey = s;
        if (s1 == null)
        {
            s1 = "";
        }
        consumerSecret = s1;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("OAuth2Authorization{consumerKey='")).append(consumerKey).append('\'').append(", consumerSecret='******************************************', token=");
        String s;
        if (token == null)
        {
            s = "null";
        } else
        {
            s = token.toString();
        }
        return stringbuilder.append(s).append('}').toString();
    }
}
