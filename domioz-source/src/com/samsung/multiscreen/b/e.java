// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.b;

import com.samsung.multiscreen.net.b.b;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.samsung.multiscreen.b:
//            g, a, f

class e
    implements com.samsung.multiscreen.b.a.e
{

    public static final Logger a;
    private a b;
    private g c;

    e(a a1)
    {
        b = a1;
        c = new g(a1);
    }

    public final void a()
    {
        a.info("ChannelConnectionListener.onConnect()");
    }

    public final void a(f f)
    {
        a.info("ChannelConnectionListener.onConnectError()");
        b.a(f);
    }

    public final void a(b b1)
    {
        a.info((new StringBuilder("ChannelConnectionListener.onMessage() rpcMessage: ")).append(b1).toString());
        c.a(b1);
    }

    public final void b()
    {
        a.info("ChannelConnectionListener.onDisconnect()");
        b.d();
    }

    public final void b(f f)
    {
        a.info("ChannelConnectionListener.onDisconnectError()");
        b.b(f);
    }

    static 
    {
        Logger logger = Logger.getLogger(com/samsung/multiscreen/b/e.getName());
        a = logger;
        logger.setLevel(Level.OFF);
    }
}
