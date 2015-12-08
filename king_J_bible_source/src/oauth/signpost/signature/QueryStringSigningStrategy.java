// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.signature;

import oauth.signpost.OAuth;
import oauth.signpost.http.HttpParameters;
import oauth.signpost.http.HttpRequest;

// Referenced classes of package oauth.signpost.signature:
//            SigningStrategy

public class QueryStringSigningStrategy
    implements SigningStrategy
{

    private static final long serialVersionUID = 1L;

    public QueryStringSigningStrategy()
    {
    }

    public String writeSignature(String s, HttpRequest httprequest, HttpParameters httpparameters)
    {
        s = new StringBuilder(OAuth.addQueryParameters(httprequest.getRequestUrl(), new String[] {
            "oauth_signature", s
        }));
        if (httpparameters.containsKey("oauth_token"))
        {
            s.append("&");
            s.append(httpparameters.getAsQueryString("oauth_token"));
        }
        if (httpparameters.containsKey("oauth_callback"))
        {
            s.append("&");
            s.append(httpparameters.getAsQueryString("oauth_callback"));
        }
        if (httpparameters.containsKey("oauth_verifier"))
        {
            s.append("&");
            s.append(httpparameters.getAsQueryString("oauth_verifier"));
        }
        s.append("&");
        s.append(httpparameters.getAsQueryString("oauth_consumer_key"));
        s.append("&");
        s.append(httpparameters.getAsQueryString("oauth_version"));
        s.append("&");
        s.append(httpparameters.getAsQueryString("oauth_signature_method"));
        s.append("&");
        s.append(httpparameters.getAsQueryString("oauth_timestamp"));
        s.append("&");
        s.append(httpparameters.getAsQueryString("oauth_nonce"));
        s = s.toString();
        httprequest.setRequestUrl(s);
        return s;
    }
}
