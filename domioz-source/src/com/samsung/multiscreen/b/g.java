// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.b;

import com.samsung.multiscreen.net.b.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.samsung.multiscreen.b:
//            c, a, d, h

class g
{

    private static final Logger a;
    private a b;

    g(a a1)
    {
        b = a1;
    }

    private void b(b b1)
    {
        a.info("ChannelMessageHandler.handleConnect()");
        String s = (String)b1.c().get(b.f);
        a.info((new StringBuilder("ChannelMessageHandler.handleConnect() clientId: ")).append(s).toString());
        ArrayList arraylist = new ArrayList();
        Map map;
        for (b1 = ((List)b1.c().get(b.g)).iterator(); b1.hasNext(); arraylist.add(new c(b, map)))
        {
            map = (Map)b1.next();
        }

        b.a(s, arraylist);
    }

    protected final void a(b b1)
    {
        if (b1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        s = b1.b();
        a.info((new StringBuilder("ChannelMessageHandler.handleMessage() method: ")).append(s).toString());
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        a.info("CHANNEL_CONNECT: ms.channel.onConnect");
        if (s.equals("ms.channel.onConnect"))
        {
            b(b1);
            return;
        }
        if (!s.equals("ms.channel.onClientConnect"))
        {
            break; /* Loop/switch isn't completed */
        }
        b1 = new c(b, b1.c());
        b.b().a(b1);
        if (b.a() != null)
        {
            b.a().onClientConnected(b1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!s.equals("ms.channel.onClientDisconnect"))
        {
            break; /* Loop/switch isn't completed */
        }
        b1 = (String)b1.c().get(b.a);
        b1 = b.b().a(b1);
        if (b1 != null)
        {
            b.b().b(b1);
            if (b.a() != null)
            {
                b.a().onClientDisconnected(b1);
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (s.equals("ms.channel.onClientMessage"))
        {
            Object obj = (String)b1.c().get(b.c);
            obj = b.b().a(((String) (obj)));
            if (obj != null)
            {
                b1 = (String)b1.c().get(b.d);
                if (b.a() != null)
                {
                    b.a().onClientMessage(((c) (obj)), b1);
                    return;
                }
            }
        } else
        {
            a.info("ChannelMessageHandler.handleMessage() NO HANDLER");
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    static 
    {
        Logger logger = Logger.getLogger(com/samsung/multiscreen/b/g.getName());
        a = logger;
        logger.setLevel(Level.OFF);
    }
}
