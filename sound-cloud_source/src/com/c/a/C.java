// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import java.net.InetSocketAddress;
import java.net.Proxy;

// Referenced classes of package com.c.a:
//            a, l

public final class C
{

    public final a a;
    public final Proxy b;
    final InetSocketAddress c;
    final l d;
    final boolean e;

    public C(a a1, Proxy proxy, InetSocketAddress inetsocketaddress, l l1, boolean flag)
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
        }
        if (l1 == null)
        {
            throw new NullPointerException("connectionConfiguration == null");
        } else
        {
            a = a1;
            b = proxy;
            c = inetsocketaddress;
            d = l1;
            e = flag;
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof C)
        {
            obj = (C)obj;
            flag = flag1;
            if (a.equals(((C) (obj)).a))
            {
                flag = flag1;
                if (b.equals(((C) (obj)).b))
                {
                    flag = flag1;
                    if (c.equals(((C) (obj)).c))
                    {
                        flag = flag1;
                        if (d.equals(((C) (obj)).d))
                        {
                            flag = flag1;
                            if (e == ((C) (obj)).e)
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

    public final int hashCode()
    {
        int j = a.hashCode();
        int k = b.hashCode();
        int i1 = c.hashCode();
        int j1 = d.hashCode();
        int i;
        if (e)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + ((((j + 527) * 31 + k) * 31 + i1) * 31 + j1) * 31;
    }
}
