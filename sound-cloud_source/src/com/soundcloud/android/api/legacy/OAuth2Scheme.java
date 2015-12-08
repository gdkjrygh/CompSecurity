// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import com.soundcloud.android.api.oauth.OAuth;
import com.soundcloud.android.api.oauth.Token;
import java.io.IOException;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.message.BasicHeaderValueParser;
import org.apache.http.message.HeaderValueParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package com.soundcloud.android.api.legacy:
//            PublicApi

public class OAuth2Scheme
    implements AuthScheme
{
    public static class EmptyCredentials
        implements Credentials
    {

        public static final Credentials INSTANCE = new EmptyCredentials();

        public String getPassword()
        {
            return null;
        }

        public Principal getUserPrincipal()
        {
            return null;
        }


        public EmptyCredentials()
        {
        }
    }

    public static class Factory
        implements AuthSchemeFactory
    {

        private final PublicApi api;

        public AuthScheme newInstance(HttpParams httpparams)
        {
            return new OAuth2Scheme(api, httpparams);
        }

        public Factory(PublicApi publicapi)
        {
            api = publicapi;
        }
    }


    public static Pattern AUTHORIZATION_HEADER_PATTERN = Pattern.compile("^OAuth (\\w+)$");
    private final PublicApi api;
    public HttpParams httpParams;
    public Map params;

    public OAuth2Scheme(PublicApi publicapi, HttpParams httpparams)
    {
        api = publicapi;
        httpParams = httpparams;
        params = new HashMap();
    }

    static String extractToken(Header header)
    {
        if (header != null && header.getValue() != null && "Authorization".equalsIgnoreCase(header.getName()))
        {
            header = AUTHORIZATION_HEADER_PATTERN.matcher(header.getValue());
            if (header.matches())
            {
                return header.group(1);
            }
        }
        return null;
    }

    static String extractToken(HttpRequest httprequest)
    {
        if (httprequest == null)
        {
            return null;
        } else
        {
            return extractToken(httprequest.getFirstHeader("Authorization"));
        }
    }

    public Header authenticate(Credentials credentials, HttpRequest httprequest)
        throws AuthenticationException
    {
        credentials = extractToken(httprequest);
        com/soundcloud/android/api/legacy/OAuth2Scheme;
        JVM INSTR monitorenter ;
        httprequest = api.getToken();
        if (httprequest == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        if (httprequest.getAccessToken() != null && !httprequest.getAccessToken().equals(credentials))
        {
            break MISSING_BLOCK_LABEL_58;
        }
        credentials = api.invalidateToken();
        if (credentials != null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        api.refreshToken();
        credentials = OAuth.createOAuthHeader(api.getToken());
        com/soundcloud/android/api/legacy/OAuth2Scheme;
        JVM INSTR monitorexit ;
        return credentials;
_L2:
        throw new AuthenticationException("Error refreshing token", credentials);
        credentials;
        com/soundcloud/android/api/legacy/OAuth2Scheme;
        JVM INSTR monitorexit ;
        throw credentials;
        credentials;
        continue; /* Loop/switch isn't completed */
        credentials;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public String getParameter(String s)
    {
        return (String)params.get(s);
    }

    public String getRealm()
    {
        return getParameter("realm");
    }

    public String getSchemeName()
    {
        return "oauth";
    }

    public boolean isComplete()
    {
        return true;
    }

    public boolean isConnectionBased()
    {
        return false;
    }

    public void processChallenge(Header header)
        throws MalformedChallengeException
    {
        boolean flag = false;
        if (header == null)
        {
            throw new IllegalArgumentException("Header may not be null");
        }
        Object obj = header.getName();
        if (!((String) (obj)).equalsIgnoreCase("WWW-Authenticate"))
        {
            throw new MalformedChallengeException((new StringBuilder("Unexpected header name: ")).append(((String) (obj))).toString());
        }
        int i;
        if (header instanceof FormattedHeader)
        {
            obj = ((FormattedHeader)header).getBuffer();
            i = ((FormattedHeader)header).getValuePos();
        } else
        {
            obj = header.getValue();
            if (obj == null)
            {
                throw new MalformedChallengeException("Header value is null");
            }
            header = new CharArrayBuffer(((String) (obj)).length());
            header.append(((String) (obj)));
            i = 0;
        }
        for (header = ((Header) (obj)); i < header.length() && HTTP.isWhitespace(header.charAt(i)); i++) { }
        int k;
        for (k = i; k < header.length() && !HTTP.isWhitespace(header.charAt(k)); k++) { }
        obj = header.substring(i, k);
        if (!((String) (obj)).equalsIgnoreCase(getSchemeName()))
        {
            throw new MalformedChallengeException((new StringBuilder("Invalid scheme identifier: ")).append(((String) (obj))).toString());
        }
        header = BasicHeaderValueParser.DEFAULT.parseElements(header, new ParserCursor(k, header.length()));
        if (header.length == 0)
        {
            throw new MalformedChallengeException("Authentication challenge is empty");
        }
        k = header.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            HeaderElement headerelement = header[j];
            params.put(headerelement.getName(), headerelement.getValue());
        }

    }

}
