// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.net.ssdp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

// Referenced classes of package com.samsung.multiscreen.net.ssdp:
//            SSDPSearch

final class b
    implements Runnable
{

    final String a;
    final DatagramSocket b;
    final SSDPSearch c;

    b(SSDPSearch ssdpsearch, String s, DatagramSocket datagramsocket)
    {
        c = ssdpsearch;
        a = s;
        b = datagramsocket;
        super();
    }

    public final void run()
    {
        try
        {
            DatagramPacket datagrampacket = new DatagramPacket(a.getBytes("UTF-8"), a.length(), InetAddress.getByName("239.255.255.250"), 1900);
            b.send(datagrampacket);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            runtimeexception.printStackTrace();
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
