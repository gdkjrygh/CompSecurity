// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.af;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;
import java.net.InetAddress;

final class am extends af
{

    am()
    {
    }

    public InetAddress a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        } else
        {
            return InetAddress.getByName(a1.h());
        }
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (InetAddress)obj);
    }

    public void a(d d1, InetAddress inetaddress)
    {
        if (inetaddress == null)
        {
            inetaddress = null;
        } else
        {
            inetaddress = inetaddress.getHostAddress();
        }
        d1.b(inetaddress);
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
