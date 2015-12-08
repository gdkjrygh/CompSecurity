// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.net.InetSocketAddress;
import java.net.Proxy;

// Referenced classes of package com.squareup.okhttp:
//            Address

public final class Route
{

    final Address address;
    final InetSocketAddress inetSocketAddress;
    final Proxy proxy;

    public Route(Address address1, Proxy proxy1, InetSocketAddress inetsocketaddress)
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
        } else
        {
            address = address1;
            proxy = proxy1;
            inetSocketAddress = inetsocketaddress;
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
                        flag = true;
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

    public InetSocketAddress getSocketAddress()
    {
        return inetSocketAddress;
    }

    public int hashCode()
    {
        return ((address.hashCode() + 527) * 31 + proxy.hashCode()) * 31 + inetSocketAddress.hashCode();
    }

    public boolean requiresTunnel()
    {
        return address.sslSocketFactory != null && proxy.type() == java.net.Proxy.Type.HTTP;
    }
}
