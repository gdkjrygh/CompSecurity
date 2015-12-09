// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.a.a;
import com.android.slyce.a.a.d;
import com.android.slyce.a.b.b;
import com.android.slyce.a.r;
import java.net.InetAddress;
import java.net.InetSocketAddress;

// Referenced classes of package com.android.slyce.a.c:
//            aj, l, u, ai, 
//            a, am

class al
    implements d
{

    final String a;
    final InetAddress b;
    final aj c;

    al(aj aj1, String s, InetAddress inetaddress)
    {
        c = aj1;
        a = s;
        b = inetaddress;
        super();
    }

    public void a(b b1, a a1)
    {
        c.b.j.b((new StringBuilder()).append("attempting connection to ").append(a).toString());
        c.n.h.b().a(new InetSocketAddress(b, c.m), c.n.a(c.b, c.c, c.m, false, new am(this, a1)));
    }
}
