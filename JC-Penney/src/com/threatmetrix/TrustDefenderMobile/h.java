// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class h
    implements Runnable
{

    private static final String c = com/threatmetrix/TrustDefenderMobile/h.getSimpleName();
    private String a;
    private InetAddress b;

    public h(String s)
    {
        a = s;
    }

    public void a(InetAddress inetaddress)
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

    public void run()
    {
        String s;
        try
        {
            Object obj = c;
            obj = InetAddress.getByName(a);
            String s1 = c;
            a(((InetAddress) (obj)));
            return;
        }
        catch (UnknownHostException unknownhostexception)
        {
            s = c;
        }
    }

}
