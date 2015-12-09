// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.net.ssdp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.samsung.multiscreen.net.ssdp:
//            f, SSDPSearch, e

final class c
    implements Runnable
{

    final DatagramSocket a;
    final SSDPSearch b;

    c(SSDPSearch ssdpsearch, DatagramSocket datagramsocket)
    {
        b = ssdpsearch;
        a = datagramsocket;
        super();
    }

    public final void run()
    {
_L2:
        Object obj = new DatagramPacket(new byte[1024], 1024);
        a.receive(((DatagramPacket) (obj)));
        obj = f.a(new String(((DatagramPacket) (obj)).getData(), "UTF-8"));
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        e e1;
        if (SSDPSearch.a(b).contains(obj))
        {
            continue; /* Loop/switch isn't completed */
        }
        SSDPSearch.a(b).add(obj);
        e1 = SSDPSearch.b(b);
        if (e1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        SSDPSearch.b(b).a(((f) (obj)));
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        try
        {
            exception.printStackTrace();
        }
        catch (IOException ioexception)
        {
            SSDPSearch.b().info((new StringBuilder("Error reading from socket: ")).append(ioexception.getLocalizedMessage()).toString());
            return;
        }
        catch (Exception exception1)
        {
            SSDPSearch.b().info((new StringBuilder("Error: ")).append(exception1.getLocalizedMessage()).toString());
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
