// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.core.upnp.ssdp;

import java.net.DatagramPacket;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class SSDP
{
    public static class ParsedDatagram
    {

        public Map data;
        public DatagramPacket dp;
        public String type;

        public ParsedDatagram(DatagramPacket datagrampacket)
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


    public static final String ADDRESS = "239.255.255.250";
    public static final String APPLICATION_URL = "Application-URL";
    public static final String DEVICE_MEDIA_SERVER_1 = "urn:schemas-upnp-org:device:MediaServer:1";
    public static final String LOCATION = "LOCATION";
    public static final String NEWLINE = "\r\n";
    public static final String NT = "NT";
    public static final String NTS = "NTS";
    public static final String NTS_ALIVE = "ssdp:alive";
    public static final String NTS_BYEBYE = "ssdp:byebye";
    public static final String NTS_UPDATE = "ssdp:update";
    public static final int PORT = 1900;
    public static final String SL_MSEARCH = "M-SEARCH * HTTP/1.1";
    public static final String SL_NOTIFY = "NOTIFY * HTTP/1.1";
    public static final String SL_OK = "HTTP/1.1 200 OK";
    public static final int SOURCE_PORT = 1901;
    public static final String ST = "ST";
    public static final String ST_DIAL = "ST: urn:dial-multiscreen-org:service:dial:1";
    public static final String ST_SSAP = "ST: urn:lge-com:service:webos-second-screen:1";
    public static final String URN = "URN";
    public static final String USN = "USN";

    public SSDP()
    {
    }

    public static ParsedDatagram convertDatagram(DatagramPacket datagrampacket)
    {
        return new ParsedDatagram(datagrampacket);
    }
}
