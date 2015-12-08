// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.auth;

import java.io.Serializable;
import javax.crypto.spec.SecretKeySpec;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.util.z_T4JInternalStringUtil;

abstract class OAuthToken
    implements Serializable
{

    private static final long serialVersionUID = 0x360015b20d4eec7eL;
    String responseStr[];
    private transient SecretKeySpec secretKeySpec;
    private String token;
    private String tokenSecret;

    OAuthToken(String s)
    {
        responseStr = null;
        responseStr = z_T4JInternalStringUtil.split(s, "&");
        tokenSecret = getParameter("oauth_token_secret");
        token = getParameter("oauth_token");
    }

    public OAuthToken(String s, String s1)
    {
        responseStr = null;
        token = s;
        tokenSecret = s1;
    }

    OAuthToken(HttpResponse httpresponse)
    {
        this(httpresponse.asString());
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof OAuthToken))
            {
                return false;
            }
            obj = (OAuthToken)obj;
            if (!token.equals(((OAuthToken) (obj)).token))
            {
                return false;
            }
            if (!tokenSecret.equals(((OAuthToken) (obj)).tokenSecret))
            {
                return false;
            }
        }
        return true;
    }

    public String getParameter(String s)
    {
        Object obj = null;
        String as[] = responseStr;
        int j = as.length;
        int i = 0;
        do
        {
label0:
            {
                String s1 = obj;
                if (i < j)
                {
                    s1 = as[i];
                    if (!s1.startsWith((new StringBuilder()).append(s).append('=').toString()))
                    {
                        break label0;
                    }
                    s1 = z_T4JInternalStringUtil.split(s1, "=")[1].trim();
                }
                return s1;
            }
            i++;
        } while (true);
    }

    SecretKeySpec getSecretKeySpec()
    {
        return secretKeySpec;
    }

    public String getToken()
    {
        return token;
    }

    public String getTokenSecret()
    {
        return tokenSecret;
    }

    public int hashCode()
    {
        return token.hashCode() * 31 + tokenSecret.hashCode();
    }

    void setSecretKeySpec(SecretKeySpec secretkeyspec)
    {
        secretKeySpec = secretkeyspec;
    }

    public String toString()
    {
        return (new StringBuilder("OAuthToken{token='")).append(token).append('\'').append(", tokenSecret='").append(tokenSecret).append('\'').append(", secretKeySpec=").append(secretKeySpec).append('}').toString();
    }
}
