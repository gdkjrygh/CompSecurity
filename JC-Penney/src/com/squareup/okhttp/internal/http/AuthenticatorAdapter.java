// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Authenticator;
import com.squareup.okhttp.Challenge;
import com.squareup.okhttp.Credentials;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.List;

public final class AuthenticatorAdapter
    implements Authenticator
{

    public static final Authenticator INSTANCE = new AuthenticatorAdapter();

    public AuthenticatorAdapter()
    {
    }

    private InetAddress getConnectToInetAddress(Proxy proxy, HttpUrl httpurl)
    {
        if (proxy != null && proxy.type() != java.net.Proxy.Type.DIRECT)
        {
            return ((InetSocketAddress)proxy.address()).getAddress();
        } else
        {
            return InetAddress.getByName(httpurl.host());
        }
    }

    public Request authenticate(Proxy proxy, Response response)
    {
        List list;
        HttpUrl httpurl;
        int i;
        int j;
        list = response.challenges();
        response = response.request();
        httpurl = response.httpUrl();
        j = list.size();
        i = 0;
_L2:
        Object obj;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        obj = (Challenge)list.get(i);
        if ("Basic".equalsIgnoreCase(((Challenge) (obj)).getScheme()))
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if ((obj = java.net.Authenticator.requestPasswordAuthentication(httpurl.host(), getConnectToInetAddress(proxy, httpurl), httpurl.port(), httpurl.scheme(), ((Challenge) (obj)).getRealm(), ((Challenge) (obj)).getScheme(), httpurl.url(), java.net.Authenticator.RequestorType.SERVER)) == null) goto _L4; else goto _L3
_L3:
        proxy = Credentials.basic(((PasswordAuthentication) (obj)).getUserName(), new String(((PasswordAuthentication) (obj)).getPassword()));
        return response.newBuilder().header("Authorization", proxy).build();
        return null;
    }

    public Request authenticateProxy(Proxy proxy, Response response)
    {
        List list;
        HttpUrl httpurl;
        int i;
        int j;
        list = response.challenges();
        response = response.request();
        httpurl = response.httpUrl();
        j = list.size();
        i = 0;
_L2:
        Object obj;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        obj = (Challenge)list.get(i);
        if ("Basic".equalsIgnoreCase(((Challenge) (obj)).getScheme()))
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        InetSocketAddress inetsocketaddress = (InetSocketAddress)proxy.address();
        obj = java.net.Authenticator.requestPasswordAuthentication(inetsocketaddress.getHostName(), getConnectToInetAddress(proxy, httpurl), inetsocketaddress.getPort(), httpurl.scheme(), ((Challenge) (obj)).getRealm(), ((Challenge) (obj)).getScheme(), httpurl.url(), java.net.Authenticator.RequestorType.PROXY);
        if (obj == null) goto _L4; else goto _L3
_L3:
        proxy = Credentials.basic(((PasswordAuthentication) (obj)).getUserName(), new String(((PasswordAuthentication) (obj)).getPassword()));
        return response.newBuilder().header("Proxy-Authorization", proxy).build();
        return null;
    }

}
