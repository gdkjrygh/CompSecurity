// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.net.InetSocketAddress;
import java.net.Proxy;

// Referenced classes of package com.squareup.okhttp:
//            Address, ConnectionSpec

public final class Route
{

    final Address address;
    final ConnectionSpec connectionSpec;
    final InetSocketAddress inetSocketAddress;
    final Proxy proxy;
    final boolean shouldSendTlsFallbackIndicator;

    public Route(Address address1, Proxy proxy1, InetSocketAddress inetsocketaddress, ConnectionSpec connectionspec, boolean flag)
    {
        if (address1 == null)
        {
            throw new NullPointerException("address == null");
        }
        if (proxy1 == null)
        {
            throw new NullPointerException("proxy == null");
        }
        if (inetsocketaddress == null)
        {
            throw new NullPointerException("inetSocketAddress == null");
        }
        if (connectionspec == null)
        {
            throw new NullPointerException("connectionConfiguration == null");
        } else
        {
            address = address1;
            proxy = proxy1;
            inetSocketAddress = inetsocketaddress;
            connectionSpec = connectionspec;
            shouldSendTlsFallbackIndicator = flag;
            return;
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof Route)
        {
            obj = (Route)obj;
            flag = flag1;
            if (address.equals(((Route) (obj)).address))
            {
                flag = flag1;
                if (proxy.equals(((Route) (obj)).proxy))
                {
                    flag = flag1;
                    if (inetSocketAddress.equals(((Route) (obj)).inetSocketAddress))
                    {
                        flag = flag1;
                        if (connectionSpec.equals(((Route) (obj)).connectionSpec))
                        {
                            flag = flag1;
                            if (shouldSendTlsFallbackIndicator == ((Route) (obj)).shouldSendTlsFallbackIndicator)
                            {
                                flag = true;
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public Address getAddress()
    {
        return address;
    }

    public Proxy getProxy()
    {
        return proxy;
    }

    public int hashCode()
    {
        int j = address.hashCode();
        int k = proxy.hashCode();
        int l = inetSocketAddress.hashCode();
        int i1 = connectionSpec.hashCode();
        int i;
        if (shouldSendTlsFallbackIndicator)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return ((((j + 527) * 31 + k) * 31 + l) * 31 + i1) * 31 + i;
    }

    public boolean requiresTunnel()
    {
        return address.sslSocketFactory != null && proxy.type() == java.net.Proxy.Type.HTTP;
    }
}
