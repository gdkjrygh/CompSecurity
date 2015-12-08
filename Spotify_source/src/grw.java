// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.InetSocketAddress;
import java.net.Proxy;

public final class grw
{

    public final gqk a;
    public final Proxy b;
    final InetSocketAddress c;

    public grw(gqk gqk1, Proxy proxy, InetSocketAddress inetsocketaddress)
    {
        if (gqk1 == null)
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
            a = gqk1;
            b = proxy;
            c = inetsocketaddress;
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof grw)
        {
            obj = (grw)obj;
            flag = flag1;
            if (a.equals(((grw) (obj)).a))
            {
                flag = flag1;
                if (b.equals(((grw) (obj)).b))
                {
                    flag = flag1;
                    if (c.equals(((grw) (obj)).c))
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
