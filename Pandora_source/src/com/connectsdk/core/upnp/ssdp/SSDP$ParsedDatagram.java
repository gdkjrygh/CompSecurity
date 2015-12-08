// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.core.upnp.ssdp;

import java.net.DatagramPacket;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

// Referenced classes of package com.connectsdk.core.upnp.ssdp:
//            SSDP

public static class data
{

    public Map data;
    public DatagramPacket dp;
    public String type;

    public (DatagramPacket datagrampacket)
    {
        data = new HashMap();
        dp = datagrampacket;
        datagrampacket = new Scanner(new String(dp.getData()));
        type = datagrampacket.nextLine();
        do
        {
            if (!datagrampacket.hasNextLine())
            {
                break;
            }
            String s = datagrampacket.nextLine();
            int i = s.indexOf(':');
            if (i != -1)
            {
                data.put(s.substring(0, i).toUpperCase(Locale.US), s.substring(i + 1).trim());
            }
        } while (true);
    }
}
