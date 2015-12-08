// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.device.a;

import com.samsung.multiscreen.device.f;
import com.samsung.multiscreen.net.ssdp.SSDPSearch;
import com.samsung.multiscreen.net.ssdp.e;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.samsung.multiscreen.device.a:
//            b, e

public class a
    implements e, Runnable
{

    private static final Logger a;
    private List b;
    private List c;
    private f d;
    private SSDPSearch e;
    private int f;
    private String g;

    public a(String s, f f1)
    {
        b = new ArrayList();
        c = new ArrayList();
        f = 3000;
        g = s;
        d = f1;
    }

    static Logger a()
    {
        return a;
    }

    public final void a(com.samsung.multiscreen.net.ssdp.f f1)
    {
    }

    public final void a(List list)
    {
        a.info((new StringBuilder("Results() size: ")).append(list.size()).toString());
        if (list.size() != 0) goto _L2; else goto _L1
_L1:
        d.onResult(b);
_L4:
        return;
_L2:
        a.info((new StringBuilder("DIAL ssdpSearchResultsSize: ")).append(list.size()).toString());
        Object obj = new com.samsung.multiscreen.device.a.a.a(Collections.synchronizedList(new ArrayList()), Collections.synchronizedList(new ArrayList()), list.size(), d);
        try
        {
            obj = new b(this, ((com.samsung.multiscreen.device.a.a.a) (obj)));
            list = list.iterator();
            while (list.hasNext()) 
            {
                com.samsung.multiscreen.net.ssdp.f f1 = (com.samsung.multiscreen.net.ssdp.f)list.next();
                a.info((new StringBuilder("DIAL search result: ")).append(f1).toString());
                (new com.samsung.multiscreen.device.a.e(URI.create(f1.a()), g, ((com.samsung.multiscreen.net.a) (obj)))).run();
            }
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            a.info((new StringBuilder("FindLocalDialDevicesRequest FAILED: ")).append(list).toString());
            list.printStackTrace();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void run()
    {
        e = new SSDPSearch("urn:dial-multiscreen-org:service:dial:1");
        e.a(f, this);
    }

    static 
    {
        Logger logger = Logger.getLogger(com/samsung/multiscreen/device/a/a.getName());
        a = logger;
        logger.setLevel(Level.OFF);
    }
}
