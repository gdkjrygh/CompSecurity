// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.net.ssdp;

import com.samsung.multiscreen.net.b;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.samsung.multiscreen.net.ssdp:
//            b, c, e, a, 
//            f, d

public class SSDPSearch
{

    private static final Logger a;
    private String b;
    private boolean c;
    private int d;
    private int e;
    private ScheduledExecutorService f;
    private ExecutorService g;
    private List h;
    private List i;
    private e j;

    public SSDPSearch(String s)
    {
        d = 500;
        e = 3000;
        a.info((new StringBuilder("new SSDPSearch() searchTarget: ")).append(s).toString());
        b = s;
        c = false;
        f = Executors.newScheduledThreadPool(3);
        g = Executors.newCachedThreadPool();
        h = new ArrayList();
        i = new ArrayList();
    }

    static List a(SSDPSearch ssdpsearch)
    {
        return ssdpsearch.i;
    }

    private void a(int k, int l, e e1)
    {
        a.info((new StringBuilder("start() running: ")).append(c).append(", timeout: ").append(k).append(", retryInterval: ").append(l).toString());
        if (c)
        {
            return;
        }
        c = true;
        j = e1;
        e1 = com.samsung.multiscreen.net.b.a().iterator();
        l = 1900;
_L2:
        Object obj;
        if (!e1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (InetAddress)e1.next();
        l++;
        String s;
        s = b;
        String s1 = (new StringBuilder()).append("M-SEARCH * HTTP/1.1\r\n").append("HOST: 239.255.255.250:1900\r\n").toString();
        s1 = (new StringBuilder()).append(s1).append("MAN: \"ssdp:discover\"\r\n").toString();
        s = (new StringBuilder()).append(s1).append("ST: ").append(s).append("\r\n").toString();
        s = (new StringBuilder()).append(s).append("MX: 3\r\n").toString();
        s = (new StringBuilder()).append(s).append("\r\n").toString();
        obj = new DatagramSocket(new InetSocketAddress(InetAddress.getByName(((InetAddress) (obj)).getHostAddress()), l));
        h.add(obj);
        f.scheduleAtFixedRate(new com.samsung.multiscreen.net.ssdp.b(this, s, ((DatagramSocket) (obj))), 0L, d, TimeUnit.MILLISECONDS);
        g.execute(new c(this, ((DatagramSocket) (obj))));
        continue; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        try
        {
            a.info((new StringBuilder("Error opening MulticastSocket: ")).append(((IOException) (obj1)).getLocalizedMessage()).toString());
            j.a(i);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        continue; /* Loop/switch isn't completed */
        obj1;
        a.info((new StringBuilder("Error: ")).append(((Exception) (obj1)).getLocalizedMessage()).toString());
        if (true) goto _L2; else goto _L1
_L1:
        f.schedule(new a(this), k, TimeUnit.MILLISECONDS);
        return;
    }

    static void a(List list)
    {
        f f1;
        for (list = list.iterator(); list.hasNext(); a.info((new StringBuilder("------------------------------------------------\n")).append(f1).toString()))
        {
            f1 = (f)list.next();
        }

    }

    static e b(SSDPSearch ssdpsearch)
    {
        return ssdpsearch.j;
    }

    static Logger b()
    {
        return a;
    }

    public static void main(String args[])
    {
        args = new SSDPSearch("urn:samsung.com:service:multi-screen-service:1");
        d d1 = new d();
        args.a(((SSDPSearch) (args)).e, ((SSDPSearch) (args)).d, d1);
    }

    public final void a()
    {
        a.info((new StringBuilder("stop() running: ")).append(c).toString());
        if (c)
        {
            c = false;
            try
            {
                g.shutdownNow();
                f.shutdownNow();
                for (Iterator iterator = h.iterator(); iterator.hasNext(); ((DatagramSocket)iterator.next()).close()) { }
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
            if (j != null)
            {
                try
                {
                    j.a(i);
                }
                catch (Exception exception1)
                {
                    exception1.printStackTrace();
                }
                j = null;
                return;
            }
        }
    }

    public final void a(int k, e e1)
    {
        a(k, d, e1);
    }

    static 
    {
        Logger logger = Logger.getLogger(com/samsung/multiscreen/net/ssdp/SSDPSearch.getName());
        a = logger;
        logger.setLevel(Level.OFF);
    }
}
