// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.net.Proxy;
import java.net.UnknownHostException;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package com.squareup.okhttp:
//            OkAuthenticator

public final class Address
{

    final OkAuthenticator authenticator;
    final HostnameVerifier hostnameVerifier;
    final Proxy proxy;
    final SSLSocketFactory sslSocketFactory;
    final List transports;
    final String uriHost;
    final int uriPort;

    public Address(String s, int i, SSLSocketFactory sslsocketfactory, HostnameVerifier hostnameverifier, OkAuthenticator okauthenticator, Proxy proxy1, List list)
        throws UnknownHostException
    {
        if (s == null)
        {
            throw new NullPointerException("uriHost == null");
        }
        if (i <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("uriPort <= 0: ").append(i).toString());
        }
        if (okauthenticator == null)
        {
            throw new IllegalArgumentException("authenticator == null");
        }
        if (list == null)
        {
            throw new IllegalArgumentException("transports == null");
        } else
        {
            proxy = proxy1;
            uriHost = s;
            uriPort = i;
            sslSocketFactory = sslsocketfactory;
            hostnameVerifier = hostnameverifier;
            authenticator = okauthenticator;
            transports = Util.immutableList(list);
            return;
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof Address)
        {
            obj = (Address)obj;
            flag = flag1;
            if (Util.equal(proxy, ((Address) (obj)).proxy))
            {
                flag = flag1;
                if (uriHost.equals(((Address) (obj)).uriHost))
                {
                    flag = flag1;
                    if (uriPort == ((Address) (obj)).uriPort)
                    {
                        flag = flag1;
                        if (Util.equal(sslSocketFactory, ((Address) (obj)).sslSocketFactory))
                        {
                            flag = flag1;
                            if (Util.equal(hostnameVerifier, ((Address) (obj)).hostnameVerifier))
                            {
                                flag = flag1;
                                if (Util.equal(authenticator, ((Address) (obj)).authenticator))
                                {
                                    flag = flag1;
                                    if (Util.equal(transports, ((Address) (obj)).transports))
                                    {
                                        flag = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public OkAuthenticator getAuthenticator()
    {
        return authenticator;
    }

    public HostnameVerifier getHostnameVerifier()
    {
        return hostnameVerifier;
    }

    public Proxy getProxy()
    {
        return proxy;
    }

    public SSLSocketFactory getSslSocketFactory()
    {
        return sslSocketFactory;
    }

    public List getTransports()
    {
        return transports;
    }

    public String getUriHost()
    {
        return uriHost;
    }

    public int getUriPort()
    {
        return uriPort;
    }

    public int hashCode()
    {
        int l = 0;
        int i1 = uriHost.hashCode();
        int j1 = uriPort;
        int i;
        int j;
        int k;
        if (sslSocketFactory != null)
        {
            i = sslSocketFactory.hashCode();
        } else
        {
            i = 0;
        }
        if (hostnameVerifier != null)
        {
            j = hostnameVerifier.hashCode();
        } else
        {
            j = 0;
        }
        if (authenticator != null)
        {
            k = authenticator.hashCode();
        } else
        {
            k = 0;
        }
        if (proxy != null)
        {
            l = proxy.hashCode();
        }
        return ((((((i1 + 527) * 31 + j1) * 31 + i) * 31 + j) * 31 + k) * 31 + l) * 31 + transports.hashCode();
    }
}
