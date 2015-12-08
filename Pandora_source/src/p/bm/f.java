// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bm;

import p.ax.a;
import p.bk.e;
import p.bl.b;
import p.bn.d;

// Referenced classes of package p.bm:
//            d, e, i

public abstract class f
{

    private Boolean a;
    private String b;
    private p.bm.d c;

    protected f(p.bm.d d1)
    {
        a = Boolean.valueOf(false);
        b = "lock";
        c = null;
        if (d1 == null)
        {
            throw new IllegalArgumentException("Provided transport listener interface reference is null");
        } else
        {
            c = d1;
            return;
        }
    }

    public abstract void a()
        throws a;

    protected void a(String s)
    {
        a = Boolean.valueOf(false);
        try
        {
            p.bk.e.a((new StringBuilder()).append("Transport.disconnect: ").append(s).toString(), null, b.a, null, 0, "42baba60-eb57-11df-98cf-0800200c9a66");
            c.a(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            p.bn.d.a((new StringBuilder()).append("Failure propagating onTransportDisconnected: ").append(s.toString()).toString(), s);
        }
    }

    protected void a(String s, Exception exception)
    {
        a = Boolean.valueOf(false);
        c.b(s, exception);
    }

    protected void a(byte abyte0[], int i)
    {
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        p.bm.e.b(abyte0, 0, i);
        p.bk.e.a("", null, b.b, abyte0, i, "42baba60-eb57-11df-98cf-0800200c9a66");
        c.a(abyte0, i);
        return;
        abyte0;
        p.bn.d.a((new StringBuilder()).append("Failure propagating handleBytesFromTransport: ").append(abyte0.toString()).toString(), abyte0);
        a("Failure propagating ", ((Exception) (abyte0)));
        return;
    }

    protected abstract boolean a(byte abyte0[], int i, int j);

    public abstract void b();

    public boolean b(byte abyte0[], int i, int j)
    {
        boolean flag;
        synchronized (b)
        {
            flag = a(abyte0, i, j);
        }
        p.bm.e.a(abyte0, i, j);
        p.bk.e.a("", null, b.a, abyte0, i, j, "42baba60-eb57-11df-98cf-0800200c9a66");
        return flag;
        abyte0;
        s;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public abstract i c();

    public abstract String d();

    public Boolean e()
    {
        return a;
    }

    protected void f()
    {
        a = Boolean.valueOf(true);
        try
        {
            p.bk.e.a("Transport.connected", null, b.b, null, 0, "42baba60-eb57-11df-98cf-0800200c9a66");
            c.e();
            return;
        }
        catch (Exception exception)
        {
            p.bn.d.a((new StringBuilder()).append("Failure propagating onTransportConnected: ").append(exception.toString()).toString(), exception);
            a("Failure propagating onTransportConnected", exception);
            return;
        }
    }
}
