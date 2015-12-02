// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.m;

import java.net.InetAddress;
import java.net.UnknownHostException;

// Referenced classes of package com.facebook.common.m:
//            c

class b
    implements Runnable
{

    private String a;
    private InetAddress b;
    private c c;

    public b(String s)
    {
        a = s;
    }

    private void a(c c1)
    {
        this;
        JVM INSTR monitorenter ;
        c = c1;
        this;
        JVM INSTR monitorexit ;
        return;
        c1;
        throw c1;
    }

    private void a(InetAddress inetaddress)
    {
        this;
        JVM INSTR monitorenter ;
        b = inetaddress;
        this;
        JVM INSTR monitorexit ;
        return;
        inetaddress;
        throw inetaddress;
    }

    public InetAddress a()
    {
        this;
        JVM INSTR monitorenter ;
        InetAddress inetaddress = b;
        this;
        JVM INSTR monitorexit ;
        return inetaddress;
        Exception exception;
        exception;
        throw exception;
    }

    public c b()
    {
        this;
        JVM INSTR monitorenter ;
        c c1 = c;
        this;
        JVM INSTR monitorexit ;
        return c1;
        Exception exception;
        exception;
        throw exception;
    }

    public void run()
    {
        a(c.TimedOut);
        try
        {
            a(InetAddress.getByName(a));
        }
        catch (UnknownHostException unknownhostexception)
        {
            a(c.UnknownHost);
        }
        catch (SecurityException securityexception)
        {
            a(c.SecurityException);
        }
        a(c.Success);
    }
}
