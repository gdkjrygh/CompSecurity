// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.communicator;


// Referenced classes of package kik.android.net.communicator:
//            CommunicatorService

final class f
    implements kik.a.e.b
{

    final long a;
    final CommunicatorService b;

    f(CommunicatorService communicatorservice, long l)
    {
        b = communicatorservice;
        a = l;
        super();
    }

    public final void a()
    {
        boolean flag = false;
        CommunicatorService.a(b, false);
        if (CommunicatorService.a(b) > 20000L)
        {
            flag = true;
        }
        CommunicatorService.a(b, a, flag, "Successful connection");
        CommunicatorService.c(b, System.currentTimeMillis());
        CommunicatorService.b(b, true);
    }

    public final void a(int i)
    {
        (new StringBuilder("Connection limiter going into effect. Server requesting a backoff of ")).append(i).append(" seconds");
        CommunicatorService.a(b, System.currentTimeMillis() + (long)i * 1000L, a);
    }

    public final void a(long l)
    {
        l = Math.min(l, 10000L);
        CommunicatorService.a(b, a, "Failed connection", l);
    }
}
