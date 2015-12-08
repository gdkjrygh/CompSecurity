// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;

import java.net.InetSocketAddress;
import java.net.Proxy;

public class ProxyUtils
{

    private static final String INVALID_PORT_NUMBER = "-1";
    private static final String PROXY_HOST_PROPERTY = "http.proxyHost";
    private static final String PROXY_PORT_PROPERTY = "http.proxyPort";

    public ProxyUtils()
    {
    }

    public Proxy getSystemProxy()
    {
        Proxy proxy1 = Proxy.NO_PROXY;
        String s = getSystemProxyHost();
        int i = getSystemProxyPort();
        Proxy proxy = proxy1;
        if (s != null)
        {
            proxy = proxy1;
            if (!s.isEmpty())
            {
                proxy = proxy1;
                if (i > 0)
                {
                    proxy = new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress(s, i));
                }
            }
        }
        return proxy;
    }

    public String getSystemProxyHost()
    {
        return System.getProperty("http.proxyHost");
    }

    public int getSystemProxyPort()
    {
        String s = System.getProperty("http.proxyPort");
        if (s == null)
        {
            s = "-1";
        }
        try
        {
            return Integer.parseInt(s);
        }
        catch (NumberFormatException numberformatexception)
        {
            return -1;
        }
    }

    public String systemProxyToString()
    {
        String s = getSystemProxyHost();
        int i = getSystemProxyPort();
        if (s != null && !s.isEmpty() && i > 0)
        {
            return (new StringBuilder()).append(s).append(":").append(i).toString();
        } else
        {
            return "";
        }
    }
}
