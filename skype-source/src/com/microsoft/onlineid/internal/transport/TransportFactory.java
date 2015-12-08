// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.transport;

import android.content.Context;
import com.microsoft.onlineid.sts.n;

// Referenced classes of package com.microsoft.onlineid.internal.transport:
//            b

public class TransportFactory
{

    private final Context _applicationContext;

    public TransportFactory(Context context)
    {
        _applicationContext = context;
    }

    protected void configureTransport(b b1)
    {
        n n1 = getServerConfig();
        b1.a(n1.a(com.microsoft.onlineid.sts.n.c.a));
        b1.b(n1.a(com.microsoft.onlineid.sts.n.c.c));
        b1.a(b.a(_applicationContext));
    }

    public b createTransport()
    {
        b b1 = new b();
        configureTransport(b1);
        return b1;
    }

    n getServerConfig()
    {
        return new n(_applicationContext);
    }
}
