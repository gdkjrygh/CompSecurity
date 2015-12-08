// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bd;

import p.ax.b;
import p.ba.f;
import p.bb.e;
import p.bh.w;
import p.bj.a;
import p.bm.c;
import p.bn.d;

// Referenced classes of package p.bd:
//            j

private class <init>
    implements a
{

    final j a;

    public void a(byte byte0)
    {
        d.c("Heartbeat timeout");
        android.content.Intent intent = p.bd.j.a(a);
        p.bd.j.a(a, intent, "FUNCTION_NAME", "onHeartbeatTimedOut");
        p.bd.j.a(a, intent, "COMMENT1", (new StringBuilder()).append("Heartbeat timeout for SessionID: ").append(byte0).toString());
        p.bd.j.a(a, intent);
        a.a("Heartbeat timeout", new p.ax.a("Heartbeat timeout", b.d), w.o);
    }

    public void a(String s)
    {
        if (a.c.booleanValue())
        {
            return;
        } else
        {
            a.a(s, new p.ax.a("Transport disconnected.", b.o), w.n);
            return;
        }
    }

    public void a(String s, Exception exception)
    {
        d.a((new StringBuilder()).append("Transport failure: ").append(s).toString(), exception);
        if (a.c.booleanValue())
        {
            a.a(w.k);
            return;
        } else
        {
            a.a(s, exception, w.k);
            return;
        }
    }

    public void a(f f1)
    {
        if (f1.c() != null && f1.c().length > 0 || f1.d() != null && f1.d().length > 0)
        {
            p.bd.j.a(a, f1);
        }
    }

    public void a(e e1, byte byte0, byte byte1, String s)
    {
        android.content.Intent intent = p.bd.j.a(a);
        p.bd.j.a(a, intent, "FUNCTION_NAME", "onProtocolSessionStarted");
        p.bd.j.a(a, intent, "COMMENT1", (new StringBuilder()).append("SessionID: ").append(byte0).toString());
        p.bd.j.a(a, intent, "COMMENT2", (new StringBuilder()).append(" SessionType: ").append(e1.b()).toString());
        p.bd.j.a(a, intent);
        p.bd.j.a(a, byte1);
        if (p.bd.j.b(a).d() != 0x7fffffff && byte1 > 2)
        {
            p.bc.a a1 = new p.bc.a();
            a1.a(p.bd.j.b(a).d());
            p.bd.j.c(a).c(a1);
        }
        if (e1.b(e.c))
        {
            p.bd.j.a(a, byte0, s);
        } else
        if (a.F > 1)
        {
            p.bd.j.a(a, byte0, s);
            return;
        }
    }

    public void a(e e1, byte byte0, String s)
    {
    }

    public void b(String s, Exception exception)
    {
        p.bd.j.a(a, s, exception);
    }

    private n(j j1)
    {
        a = j1;
        super();
    }

    .Object(j j1, .Object obj)
    {
        this(j1);
    }
}
