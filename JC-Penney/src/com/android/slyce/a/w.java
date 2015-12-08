// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import com.android.slyce.a.a.c;
import com.android.slyce.a.b.g;
import com.android.slyce.a.b.l;
import java.net.InetAddress;
import java.net.InetSocketAddress;

// Referenced classes of package com.android.slyce.a:
//            r

class w
    implements g
{

    final c a;
    final l b;
    final InetSocketAddress c;
    final r d;

    w(r r1, c c1, l l1, InetSocketAddress inetsocketaddress)
    {
        d = r1;
        a = c1;
        b = l1;
        c = inetsocketaddress;
        super();
    }

    public volatile void a(Exception exception, Object obj)
    {
        a(exception, (InetAddress)obj);
    }

    public void a(Exception exception, InetAddress inetaddress)
    {
        if (exception != null)
        {
            a.a(exception, null);
            b.a(exception);
            return;
        } else
        {
            b.a(r.a(d, new InetSocketAddress(inetaddress, c.getPort()), a));
            return;
        }
    }
}
