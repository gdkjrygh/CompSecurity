// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.i;

import com.ford.syncV4.h.a.b;
import com.ford.syncV4.h.e;
import com.ford.syncV4.util.c;

// Referenced classes of package com.ford.syncV4.i:
//            g, h

public abstract class l
{

    private Boolean a;
    private String b;
    private g c;

    protected l(g g1)
    {
        a = Boolean.valueOf(false);
        b = "lock";
        c = null;
        if (g1 == null)
        {
            throw new IllegalArgumentException("Provided transport listener interface reference is null");
        } else
        {
            c = g1;
            return;
        }
    }

    public abstract void a();

    protected final void a(String s)
    {
        a = Boolean.valueOf(false);
        try
        {
            com.ford.syncV4.h.e.a((new StringBuilder("Transport.disconnect: ")).append(s).toString(), null, b.a, null, 0, "42baba60-eb57-11df-98cf-0800200c9a66");
            c.a(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.ford.syncV4.util.c.a((new StringBuilder("Failure propagating onTransportDisconnected: ")).append(s.toString()).toString(), s);
        }
    }

    protected final void a(String s, Exception exception)
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
        h.a(abyte0, i);
        com.ford.syncV4.h.e.a("", null, b.b, abyte0, i, "42baba60-eb57-11df-98cf-0800200c9a66");
        c.a(abyte0, i);
        return;
        abyte0;
        com.ford.syncV4.util.c.a((new StringBuilder("Failure propagating handleBytesFromTransport: ")).append(abyte0.toString()).toString(), abyte0);
        a("Failure propagating ", ((Exception) (abyte0)));
        return;
    }

    protected abstract boolean a(byte abyte0[], int i, int j);

    public abstract void b();

    public final boolean b(byte abyte0[], int i, int j)
    {
        boolean flag;
        synchronized (b)
        {
            flag = a(abyte0, i, j);
        }
        h.a(abyte0, i, j);
        com.ford.syncV4.h.e.a("", null, b.a, abyte0, i, j, "42baba60-eb57-11df-98cf-0800200c9a66");
        return flag;
        abyte0;
        s;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public abstract int c();

    public abstract String d();

    public final Boolean e()
    {
        return a;
    }

    protected final void f()
    {
        a = Boolean.valueOf(true);
        try
        {
            com.ford.syncV4.h.e.a("Transport.connected", null, b.b, null, 0, "42baba60-eb57-11df-98cf-0800200c9a66");
            c.b();
            return;
        }
        catch (Exception exception)
        {
            com.ford.syncV4.util.c.a((new StringBuilder("Failure propagating onTransportConnected: ")).append(exception.toString()).toString(), exception);
            a("Failure propagating onTransportConnected", exception);
            return;
        }
    }
}
