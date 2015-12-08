// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.communicator;

import kik.a.e.f;

// Referenced classes of package kik.android.net.communicator:
//            CommunicatorService

final class g
    implements kik.a.e.f.c
{

    final long a;
    final long b;
    final CommunicatorService c;

    g(CommunicatorService communicatorservice, long l, long l1)
    {
        c = communicatorservice;
        a = l;
        b = l1;
        super();
    }

    public final void a()
    {
        CommunicatorService.a(c, a, false, "ping succeeded");
        long l = System.currentTimeMillis();
        if ((l - CommunicatorService.b(c) > 0x1d4c0L || CommunicatorService.c(c)) && l - CommunicatorService.d(c) > 5000L)
        {
            CommunicatorService.b(c, false);
            CommunicatorService.d(c, l);
            c.a.f();
        }
    }

    public final void b()
    {
        CommunicatorService.a(c, b, false, "ping failed");
    }
}
