// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.device;

import com.samsung.multiscreen.c.e;
import com.samsung.multiscreen.device.a.a;
import com.samsung.multiscreen.device.a.d;
import com.samsung.multiscreen.device.a.g;
import com.samsung.multiscreen.net.dial.DialClient;
import java.net.URI;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.samsung.multiscreen.device:
//            c, a, f

public class Device
{

    private static final Logger a;
    private Map b;

    protected Device(Map map)
    {
        b = map;
    }

    private String a(String s)
    {
        if (b != null)
        {
            return (String)b.get(s);
        } else
        {
            return "";
        }
    }

    public static void a(f f)
    {
        f = new a("samsung:multiscreen:1", f);
        com.samsung.multiscreen.c.e.a().b().execute(f);
    }

    static Logger c()
    {
        return a;
    }

    private URI d()
    {
        String s = a("ServiceURI");
        if (s == null)
        {
            return URI.create("");
        } else
        {
            return URI.create(s);
        }
    }

    private URI e()
    {
        String s = a("DialURI");
        if (s == null)
        {
            return URI.create("");
        } else
        {
            return URI.create(s);
        }
    }

    public static void main(String args[])
    {
        args = new d(URI.create("http://192.168.43.194:8001/ms/1.0/"), new c());
        com.samsung.multiscreen.c.e.a().b().execute(args);
    }

    public final String a()
    {
        return a("DeviceName");
    }

    public final void a(String s, f f)
    {
        DialClient dialclient = new DialClient(e().toString());
        s = new com.samsung.multiscreen.a.a.a(s, e(), this, dialclient, f);
        com.samsung.multiscreen.c.e.a().b().execute(s);
    }

    public final void a(String s, Map map, f f)
    {
        map = new com.samsung.multiscreen.device.a(this, f, map);
        s = new g(d(), s, map);
        com.samsung.multiscreen.c.e.a().b().execute(s);
    }

    public final String b()
    {
        return a("IP");
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[Device]\nid: ").append(a("UDN")).append("\nname: ").append(a("DeviceName")).append("\nnetworkType: ").append(a("NetworkType")).append("\nssid: ").append(a("SSID")).append("\nipAddress: ").append(a("IP")).append("\nserviceURI: ").append(d());
        return stringbuilder.toString();
    }

    static 
    {
        Logger logger = Logger.getLogger(com/samsung/multiscreen/device/Device.getName());
        a = logger;
        logger.setLevel(Level.OFF);
    }
}
