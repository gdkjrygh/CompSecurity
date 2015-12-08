// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.session;

import com.dropbox.client2.RESTUtility;
import java.util.Map;
import org.apache.http.client.methods.HttpPost;

// Referenced classes of package com.dropbox.client2.session:
//            AbstractSession, AppKeyPair

public class WebOAuth2Session extends AbstractSession
{

    public WebOAuth2Session(AppKeyPair appkeypair)
    {
        super(appkeypair);
    }

    public WebOAuth2Session(AppKeyPair appkeypair, String s)
    {
        super(appkeypair, s);
    }

    public String getAuthorizeURL()
    {
        return getAuthorizeURL(null, null);
    }

    public String getAuthorizeURL(String s, String s1)
    {
        String s2 = getAppKeyPair().key;
        return RESTUtility.buildURL(getWebServer(), 1, "/oauth2/authorize", new String[] {
            "response_type", "code", "client_id", s2, "redirect_uri", s, "state", s1
        });
    }

    public String retrieveWebAccessToken(String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("'code' must not be null");
        } else
        {
            String s2 = getAppKeyPair().key;
            String s3 = getAppKeyPair().secret;
            s = (String)((Map)RESTUtility.parseAsJSON(RESTUtility.execute(this, new HttpPost(RESTUtility.buildURL(getAPIServer(), 1, "/oauth2/token", new String[] {
                "grant_type", "authorization_code", "code", s, "client_id", s2, "client_secret", s3, "redirect_uri", s1
            }))))).get("access_token");
            setOAuth2AccessToken(s);
            return s;
        }
    }
}
