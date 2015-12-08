// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;

// Referenced classes of package com.paypal.android.sdk:
//            aL, bg, aY, aG

final class bb extends aL
{

    private final bg a;
    private aY b;

    private bb(aY ay, bg bg1)
    {
        b = ay;
        super();
        a = bg1;
    }

    bb(aY ay, bg bg1, byte byte0)
    {
        this(ay, bg1);
    }

    public final void a(String s, String s1)
    {
        a.b(s);
        aY.c();
        (new StringBuilder()).append(a.o()).append(" success");
    }

    public final void a(Throwable throwable, String s)
    {
        a.b(s);
        if (throwable instanceof NoHttpResponseException)
        {
            aY.e(b).a().getConnectionManager().closeExpiredConnections();
            b.b(a);
            return;
        } else
        {
            aY.c();
            (new StringBuilder()).append(a.o()).append(" failure: ").append(throwable.getMessage());
            return;
        }
    }
}
