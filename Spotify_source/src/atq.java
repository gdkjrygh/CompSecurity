// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.exception.SyncException;
import com.ford.syncV4.exception.SyncExceptionCause;
import com.ford.syncV4.proxy.rpc.enums.SyncDisconnectedReason;

final class atq
    implements awz
{

    private atp a;

    private atq(atp atp1)
    {
        a = atp1;
        super();
    }

    atq(atp atp1, byte byte0)
    {
        this(atp1);
    }

    public final void a(byte byte0)
    {
        axt.c("Heartbeat timeout");
        Object obj = atp.a(a);
        atp.a(((android.content.Intent) (obj)), "FUNCTION_NAME", "onHeartbeatTimedOut");
        atp.a(((android.content.Intent) (obj)), "COMMENT1", (new StringBuilder("Heartbeat timeout for SessionID: ")).append(byte0).toString());
        atp.a(a, ((android.content.Intent) (obj)));
        obj = a;
        SyncException syncexception = new SyncException("Heartbeat timeout", SyncExceptionCause.d);
        SyncDisconnectedReason syncdisconnectedreason = SyncDisconnectedReason.d;
        ((atp) (obj)).a(syncexception);
    }

    public final void a(asw asw1)
    {
        if (asw1.h != null && asw1.h.length > 0 || asw1.i != null && asw1.i.length > 0)
        {
            atp.a(a, asw1);
        }
    }

    public final void a(atc atc1, byte byte0, byte byte1, String s)
    {
        s = atp.a(a);
        atp.a(s, "FUNCTION_NAME", "onProtocolSessionStarted");
        atp.a(s, "COMMENT1", (new StringBuilder("SessionID: ")).append(byte0).toString());
        atp.a(s, "COMMENT2", (new StringBuilder(" SessionType: ")).append(((axs) (atc1)).i).toString());
        atp.a(a, s);
        atp.a(a, byte1);
        if (atp.b(a).c != 0x7fffffff && byte1 > 2)
        {
            s = new atd();
            s.a = atp.b(a).c;
            axc axc1 = atp.c(a);
            axc1.e = s;
            axc1.e.a(axc1);
        }
        if (atc1.a(atc.b))
        {
            atp.d(a);
        } else
        if (a.k > 1)
        {
            atp.d(a);
            return;
        }
    }

    public final void a(atc atc1, byte byte0, String s)
    {
    }

    public final void a(String s)
    {
        if (!a.d.booleanValue())
        {
            s = a;
            SyncException syncexception = new SyncException("Transport disconnected.", SyncExceptionCause.m);
            SyncDisconnectedReason syncdisconnectedreason = SyncDisconnectedReason.c;
            s.a(syncexception);
        }
    }

    public final void a(String s, Exception exception)
    {
        axt.a((new StringBuilder("Transport failure: ")).append(s).toString(), exception);
        if (a.d.booleanValue())
        {
            s = a;
            exception = SyncDisconnectedReason.a;
            s.g();
            return;
        } else
        {
            s = a;
            SyncDisconnectedReason syncdisconnectedreason = SyncDisconnectedReason.a;
            s.a(exception);
            return;
        }
    }

    public final void b(String s, Exception exception)
    {
        atp.e(a);
    }
}
