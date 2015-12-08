// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client;

import com.github.nkzawa.engineio.parser.b;

// Referenced classes of package com.github.nkzawa.engineio.client:
//            Transport

final class a
    implements Runnable
{

    final b a[];
    final Transport b;

    public final void run()
    {
        if (b.o == com.github.nkzawa.engineio.client.adyState.b)
        {
            b.b(a);
            return;
        } else
        {
            throw new RuntimeException("Transport not open");
        }
    }

    adyState(Transport transport, b ab[])
    {
        b = transport;
        a = ab;
        super();
    }
}
