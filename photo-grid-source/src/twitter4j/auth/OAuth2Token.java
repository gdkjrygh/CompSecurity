// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.auth;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.json.z_T4JInternalParseUtil;

public class OAuth2Token
    implements Serializable
{

    private static final long serialVersionUID = 0x4f8a998e0d8edd2L;
    private String accessToken;
    private String tokenType;

    public OAuth2Token(String s, String s1)
    {
        tokenType = s;
        accessToken = s1;
    }

    OAuth2Token(HttpResponse httpresponse)
    {
        httpresponse = httpresponse.asJSONObject();
        tokenType = z_T4JInternalParseUtil.getRawString("token_type", httpresponse);
        try
        {
            accessToken = URLDecoder.decode(z_T4JInternalParseUtil.getRawString("access_token", httpresponse), "UTF-8");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            return;
        }
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof OAuth2Token)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        obj = (OAuth2Token)obj;
        if (tokenType == null) goto _L4; else goto _L3
_L3:
        if (!tokenType.equals(((OAuth2Token) (obj)).tokenType)) goto _L1; else goto _L5
_L5:
        if (accessToken == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        if (!accessToken.equals(((OAuth2Token) (obj)).accessToken)) goto _L1; else goto _L6
_L6:
        return true;
_L4:
        if (((OAuth2Token) (obj)).tokenType != null)
        {
            return false;
        }
          goto _L5
        if (((OAuth2Token) (obj)).accessToken != null)
        {
            return false;
        }
          goto _L6
    }

    String generateAuthorizationHeader()
    {
        String s = "";
        String s1 = URLEncoder.encode(accessToken, "UTF-8");
        s = s1;
_L2:
        return (new StringBuilder("Bearer ")).append(s).toString();
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public String getAccessToken()
    {
        return accessToken;
    }

    public String getTokenType()
    {
        return tokenType;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (tokenType != null)
        {
            i = tokenType.hashCode();
        } else
        {
            i = 0;
        }
        if (accessToken != null)
        {
            j = accessToken.hashCode();
        }
        return i * 31 + j;
    }

    public String toString()
    {
        return (new StringBuilder("OAuth2Token{tokenType='")).append(tokenType).append('\'').append(", accessToken='").append(accessToken).append('\'').append('}').toString();
    }
}
