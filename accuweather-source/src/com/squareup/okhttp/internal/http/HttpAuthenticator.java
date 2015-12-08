// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.OkAuthenticator;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            RawHeaders, HeaderParser

public final class HttpAuthenticator
{

    public static final OkAuthenticator SYSTEM_DEFAULT = new OkAuthenticator() {

        private InetAddress getConnectToInetAddress(Proxy proxy, URL url)
            throws IOException
        {
            if (proxy != null && proxy.type() != java.net.Proxy.Type.DIRECT)
            {
                return ((InetSocketAddress)proxy.address()).getAddress();
            } else
            {
                return InetAddress.getByName(url.getHost());
            }
        }

        public com.squareup.okhttp.OkAuthenticator.Credential authenticate(Proxy proxy, URL url, List list)
            throws IOException
        {
            for (list = list.iterator(); list.hasNext();)
            {
                Object obj = (com.squareup.okhttp.OkAuthenticator.Challenge)list.next();
                obj = Authenticator.requestPasswordAuthentication(url.getHost(), getConnectToInetAddress(proxy, url), url.getPort(), url.getProtocol(), ((com.squareup.okhttp.OkAuthenticator.Challenge) (obj)).getRealm(), ((com.squareup.okhttp.OkAuthenticator.Challenge) (obj)).getScheme(), url, java.net.Authenticator.RequestorType.SERVER);
                if (obj != null)
                {
                    return com.squareup.okhttp.OkAuthenticator.Credential.basic(((PasswordAuthentication) (obj)).getUserName(), new String(((PasswordAuthentication) (obj)).getPassword()));
                }
            }

            return null;
        }

        public com.squareup.okhttp.OkAuthenticator.Credential authenticateProxy(Proxy proxy, URL url, List list)
            throws IOException
        {
            for (list = list.iterator(); list.hasNext();)
            {
                Object obj = (com.squareup.okhttp.OkAuthenticator.Challenge)list.next();
                InetSocketAddress inetsocketaddress = (InetSocketAddress)proxy.address();
                obj = Authenticator.requestPasswordAuthentication(inetsocketaddress.getHostName(), getConnectToInetAddress(proxy, url), inetsocketaddress.getPort(), url.getProtocol(), ((com.squareup.okhttp.OkAuthenticator.Challenge) (obj)).getRealm(), ((com.squareup.okhttp.OkAuthenticator.Challenge) (obj)).getScheme(), url, java.net.Authenticator.RequestorType.PROXY);
                if (obj != null)
                {
                    return com.squareup.okhttp.OkAuthenticator.Credential.basic(((PasswordAuthentication) (obj)).getUserName(), new String(((PasswordAuthentication) (obj)).getPassword()));
                }
            }

            return null;
        }

    };

    private HttpAuthenticator()
    {
    }

    private static List parseChallenges(RawHeaders rawheaders, String s)
    {
        ArrayList arraylist;
        int i;
        arraylist = new ArrayList();
        i = 0;
_L2:
        if (i >= rawheaders.length())
        {
            break MISSING_BLOCK_LABEL_178;
        }
        if (s.equalsIgnoreCase(rawheaders.getFieldName(i)))
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        String s1;
        int j;
        s1 = rawheaders.getValue(i);
        j = 0;
_L6:
        if (j >= s1.length()) goto _L4; else goto _L3
_L3:
        String s2;
        int k = HeaderParser.skipUntil(s1, j, " ");
        s2 = s1.substring(j, k).trim();
        j = HeaderParser.skipWhitespace(s1, k);
        if (!s1.regionMatches(j, "realm=\"", 0, "realm=\"".length())) goto _L4; else goto _L5
_L5:
        j += "realm=\"".length();
        int l = HeaderParser.skipUntil(s1, j, "\"");
        String s3 = s1.substring(j, l);
        j = HeaderParser.skipWhitespace(s1, HeaderParser.skipUntil(s1, l + 1, ",") + 1);
        arraylist.add(new com.squareup.okhttp.OkAuthenticator.Challenge(s2, s3));
          goto _L6
        return arraylist;
    }

    public static boolean processAuthHeader(OkAuthenticator okauthenticator, int i, RawHeaders rawheaders, RawHeaders rawheaders1, Proxy proxy, URL url)
        throws IOException
    {
        String s;
        Object obj;
        if (i == 401)
        {
            obj = "WWW-Authenticate";
            s = "Authorization";
        } else
        if (i == 407)
        {
            obj = "Proxy-Authenticate";
            s = "Proxy-Authorization";
        } else
        {
            throw new IllegalArgumentException();
        }
        obj = parseChallenges(rawheaders, ((String) (obj)));
        if (!((List) (obj)).isEmpty())
        {
            if (rawheaders.getResponseCode() == 407)
            {
                okauthenticator = okauthenticator.authenticateProxy(proxy, url, ((List) (obj)));
            } else
            {
                okauthenticator = okauthenticator.authenticate(proxy, url, ((List) (obj)));
            }
            if (okauthenticator != null)
            {
                rawheaders1.set(s, okauthenticator.getHeaderValue());
                return true;
            }
        }
        return false;
    }

}
