// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.RawHeaders;

public final class TunnelRequest
{

    final String host;
    final int port;
    final String proxyAuthorization;
    final String userAgent;

    public TunnelRequest(String s, int i, String s1, String s2)
    {
        if (s == null)
        {
            throw new NullPointerException("host == null");
        }
        if (s1 == null)
        {
            throw new NullPointerException("userAgent == null");
        } else
        {
            host = s;
            port = i;
            userAgent = s1;
            proxyAuthorization = s2;
            return;
        }
    }

    RawHeaders getRequestHeaders()
    {
        RawHeaders rawheaders = new RawHeaders();
        rawheaders.setRequestLine((new StringBuilder()).append("CONNECT ").append(host).append(":").append(port).append(" HTTP/1.1").toString());
        String s;
        if (port == Util.getDefaultPort("https"))
        {
            s = host;
        } else
        {
            s = (new StringBuilder()).append(host).append(":").append(port).toString();
        }
        rawheaders.set("Host", s);
        rawheaders.set("User-Agent", userAgent);
        if (proxyAuthorization != null)
        {
            rawheaders.set("Proxy-Authorization", proxyAuthorization);
        }
        rawheaders.set("Proxy-Connection", "Keep-Alive");
        return rawheaders;
    }
}
