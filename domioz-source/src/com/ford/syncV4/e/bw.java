// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.a.b;
import com.ford.syncV4.d.a.f;
import com.ford.syncV4.d.e;
import com.ford.syncV4.e.c.a.r;
import com.ford.syncV4.g.a;
import com.ford.syncV4.g.d;
import com.ford.syncV4.util.c;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class bw
    implements a
{

    final j a;

    private bw(j j1)
    {
        a = j1;
        super();
    }

    bw(j j1, byte byte0)
    {
        this(j1);
    }

    public final void a(byte byte0)
    {
        c.c("Heartbeat timeout");
        android.content.Intent intent = com.ford.syncV4.e.j.a(a);
        com.ford.syncV4.e.j.a(intent, "FUNCTION_NAME", "onHeartbeatTimedOut");
        com.ford.syncV4.e.j.a(intent, "COMMENT1", (new StringBuilder("Heartbeat timeout for SessionID: ")).append(byte0).toString());
        com.ford.syncV4.e.j.a(a, intent);
        a.a("Heartbeat timeout", new com.ford.syncV4.a.a("Heartbeat timeout", b.d), r.o);
    }

    public final void a(f f1, byte byte0, byte byte1, String s)
    {
        s = com.ford.syncV4.e.j.a(a);
        com.ford.syncV4.e.j.a(s, "FUNCTION_NAME", "onProtocolSessionStarted");
        com.ford.syncV4.e.j.a(s, "COMMENT1", (new StringBuilder("SessionID: ")).append(byte0).toString());
        com.ford.syncV4.e.j.a(s, "COMMENT2", (new StringBuilder(" SessionType: ")).append(f1.b()).toString());
        com.ford.syncV4.e.j.a(a, s);
        com.ford.syncV4.e.j.a(a, byte1);
        if (com.ford.syncV4.e.j.b(a).d() != 0x7fffffff && byte1 > 2)
        {
            s = new com.ford.syncV4.d.b.a();
            s.a(com.ford.syncV4.e.j.b(a).d());
            com.ford.syncV4.e.j.c(a).a(s);
        }
        if (f1.a(f.c))
        {
            com.ford.syncV4.e.j.d(a);
        } else
        if (a.E > 1)
        {
            com.ford.syncV4.e.j.d(a);
            return;
        }
    }

    public final void a(f f1, byte byte0, String s)
    {
    }

    public final void a(e e1)
    {
        if (e1.c() != null && e1.c().length > 0 || e1.d() != null && e1.d().length > 0)
        {
            com.ford.syncV4.e.j.a(a, e1);
        }
    }

    public final void a(String s)
    {
        if (!a.c.booleanValue())
        {
            a.a(s, new com.ford.syncV4.a.a("Transport disconnected.", b.o), r.n);
        }
    }

    public final void a(String s, Exception exception)
    {
        c.a((new StringBuilder("Transport failure: ")).append(s).toString(), exception);
        if (a.c.booleanValue())
        {
            a.a(r.k);
            return;
        } else
        {
            a.a(s, exception, r.k);
            return;
        }
    }

    public final void b(String s, Exception exception)
    {
        com.ford.syncV4.e.j.a(a, s, exception);
    }
}
