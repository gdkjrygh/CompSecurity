// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.trace.enums.InterfaceActivityDirection;
import com.ford.syncV4.transport.SiphonServer;
import com.ford.syncV4.transport.TransportType;

public abstract class axo
{

    public Boolean a;
    private String b;
    private axm c;

    public axo(axm axm1)
    {
        a = Boolean.valueOf(false);
        b = "lock";
        c = null;
        if (axm1 == null)
        {
            throw new IllegalArgumentException("Provided transport listener interface reference is null");
        } else
        {
            c = axm1;
            return;
        }
    }

    public abstract void a();

    public final void a(String s)
    {
        a = Boolean.valueOf(false);
        try
        {
            axg.a((new StringBuilder("Transport.disconnect: ")).append(s).toString(), null, InterfaceActivityDirection.a, null, 0, "42baba60-eb57-11df-98cf-0800200c9a66");
            c.a(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            axt.a((new StringBuilder("Failure propagating onTransportDisconnected: ")).append(s.toString()).toString(), s);
        }
    }

    public final void a(String s, Exception exception)
    {
        a = Boolean.valueOf(false);
        c.b(s, exception);
    }

    protected final void a(byte abyte0[], int i)
    {
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        SiphonServer.a(abyte0, i);
        axg.a("", null, InterfaceActivityDirection.b, abyte0, i, "42baba60-eb57-11df-98cf-0800200c9a66");
        c.a(abyte0, i);
        return;
        abyte0;
        axt.a((new StringBuilder("Failure propagating handleBytesFromTransport: ")).append(abyte0.toString()).toString(), abyte0);
        a("Failure propagating ", ((Exception) (abyte0)));
        return;
    }

    public abstract boolean a(byte abyte0[], int i, int j);

    public abstract void b();

    public final boolean b(byte abyte0[], int i, int j)
    {
        boolean flag;
        synchronized (b)
        {
            flag = a(abyte0, i, j);
        }
        SiphonServer.a(abyte0, i, j);
        axg.a("", null, InterfaceActivityDirection.a, abyte0, i, j, "42baba60-eb57-11df-98cf-0800200c9a66");
        return flag;
        abyte0;
        s;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public abstract TransportType c();

    public abstract String d();

    protected final void e()
    {
        a = Boolean.valueOf(true);
        try
        {
            axg.a("Transport.connected", null, InterfaceActivityDirection.b, null, 0, "42baba60-eb57-11df-98cf-0800200c9a66");
            c.c();
            return;
        }
        catch (Exception exception)
        {
            axt.a((new StringBuilder("Failure propagating onTransportConnected: ")).append(exception.toString()).toString(), exception);
            a("Failure propagating onTransportConnected", exception);
            return;
        }
    }
}
