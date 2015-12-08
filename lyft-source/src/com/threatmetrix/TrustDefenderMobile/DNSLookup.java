// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.util.Log;
import java.net.InetAddress;
import java.net.UnknownHostException;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            StringUtils

class DNSLookup
    implements Runnable
{

    private static final String c = StringUtils.a(com/threatmetrix/TrustDefenderMobile/DNSLookup);
    private final String a;
    private InetAddress b;

    public DNSLookup(String s)
    {
        a = s;
    }

    void a(InetAddress inetaddress)
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
        try
        {
            Log.d(c, "Starting DNS lookup");
            InetAddress inetaddress = InetAddress.getByName(a);
            Log.d(c, "DNS lookup complete");
            a(inetaddress);
            return;
        }
        catch (UnknownHostException unknownhostexception)
        {
            Log.d(c, "Failed DNS lookup");
        }
    }

}
