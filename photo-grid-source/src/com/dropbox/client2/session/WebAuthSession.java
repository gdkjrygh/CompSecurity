// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.session;

import com.dropbox.client2.RESTUtility;
import com.dropbox.client2.exception.DropboxParseException;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.dropbox.client2.session:
//            AbstractSession, AccessTokenPair, RequestTokenPair, AppKeyPair

public class WebAuthSession extends AbstractSession
{

    public WebAuthSession(AppKeyPair appkeypair)
    {
        super(appkeypair);
    }

    public WebAuthSession(AppKeyPair appkeypair, AccessTokenPair accesstokenpair)
    {
        super(appkeypair, accesstokenpair);
    }

    public WebAuthSession(AppKeyPair appkeypair, Session.AccessType accesstype)
    {
        super(appkeypair, accesstype);
    }

    public WebAuthSession(AppKeyPair appkeypair, Session.AccessType accesstype, AccessTokenPair accesstokenpair)
    {
        super(appkeypair, accesstype, accesstokenpair);
    }

    private Map setUpToken(String s)
    {
        s = RESTUtility.parseAsQueryString(RESTUtility.streamRequest(com.dropbox.client2.RESTUtility.RequestMethod.GET, getAPIServer(), s, 1, new String[] {
            "locale", getLocale().toString()
        }, this).response);
        if (!s.containsKey("oauth_token") || !s.containsKey("oauth_token_secret"))
        {
            throw new DropboxParseException("Did not get tokens from Dropbox");
        } else
        {
            setAccessTokenPair(new AccessTokenPair((String)s.get("oauth_token"), (String)s.get("oauth_token_secret")));
            return s;
        }
    }

    public WebAuthInfo getAuthInfo()
    {
        return getAuthInfo(null);
    }

    public WebAuthInfo getAuthInfo(String s)
    {
        setUpToken("/oauth/request_token");
        AccessTokenPair accesstokenpair = getAccessTokenPair();
        RequestTokenPair requesttokenpair = new RequestTokenPair(accesstokenpair.key, accesstokenpair.secret);
        if (s != null)
        {
            String as[] = new String[6];
            as[0] = "oauth_token";
            as[1] = requesttokenpair.key;
            as[2] = "oauth_callback";
            as[3] = s;
            as[4] = "locale";
            as[5] = getLocale().toString();
            s = as;
        } else
        {
            s = new String[4];
            s[0] = "oauth_token";
            s[1] = requesttokenpair.key;
            s[2] = "locale";
            s[3] = getLocale().toString();
        }
        return new WebAuthInfo(RESTUtility.buildURL(getWebServer(), 1, "/oauth/authorize", s), requesttokenpair, null);
    }

    public String retrieveWebAccessToken(RequestTokenPair requesttokenpair)
    {
        setAccessTokenPair(requesttokenpair);
        return (String)setUpToken("/oauth/access_token").get("uid");
    }

    private class WebAuthInfo
    {

        public final RequestTokenPair requestTokenPair;
        public final String url;

        private WebAuthInfo(String s, RequestTokenPair requesttokenpair)
        {
            url = s;
            requestTokenPair = requesttokenpair;
        }

        WebAuthInfo(String s, RequestTokenPair requesttokenpair, _cls1 _pcls1)
        {
            this(s, requesttokenpair);
        }
    }

}
