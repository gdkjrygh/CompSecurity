// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.net.InetSocketAddress;
import java.net.Proxy;

// Referenced classes of package com.squareup.okhttp:
//            a

public final class x
{

    public final a a;
    public final Proxy b;
    final InetSocketAddress c;

    public x(a a1, Proxy proxy, InetSocketAddress inetsocketaddress)
    {
        if (a1 == null)
        {
            throw new NullPointerException("address == null");
        }
        if (proxy == null)
        {
            throw new NullPointerException("proxy == null");
        }
        if (inetsocketaddress == null)
        {
            throw new NullPointerException("inetSocketAddress == null");
        } else
        {
            a = a1;
            b = proxy;
            c = inetsocketaddress;
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof x)
        {
            obj = (x)obj;
            flag = flag1;
            if (a.equals(((x) (obj)).a))
            {
                flag = flag1;
                if (b.equals(((x) (obj)).b))
                {
                    flag = flag1;
                    if (c.equals(((x) (obj)).c))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return ((a.hashCode() + 527) * 31 + b.hashCode()) * 31 + c.hashCode();
    }
}
