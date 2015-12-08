// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client;

import com.github.nkzawa.f.a;
import java.util.List;

// Referenced classes of package com.github.nkzawa.engineio.client:
//            EngineIOException, Socket, Transport

final class a
    implements Runnable
{

    final Socket a;
    final ption b;

    public final void run()
    {
        a.a("error", new Object[] {
            new EngineIOException("No transports available")
        });
    }

    State(State state, Socket socket)
    {
        b = state;
        a = socket;
        super();
    }

    // Unreferenced inner class com/github/nkzawa/engineio/client/Socket$12

/* anonymous class */
    public final class Socket._cls12
        implements Runnable
    {

        final Socket a;

        public final void run()
        {
            Object obj;
            if (com.github.nkzawa.engineio.client.Socket.a(a) && Socket.c() && Socket.b(a).contains("websocket"))
            {
                obj = "websocket";
            } else
            {
                if (Socket.b(a).size() == 0)
                {
                    com.github.nkzawa.f.a.b(new Socket._cls12._cls1(this, a));
                    return;
                }
                obj = (String)Socket.b(a).get(0);
            }
            com.github.nkzawa.engineio.client.Socket.a(a, com.github.nkzawa.engineio.client.Socket.ReadyState.a);
            obj = com.github.nkzawa.engineio.client.Socket.a(a, ((String) (obj)));
            com.github.nkzawa.engineio.client.Socket.a(a, ((Transport) (obj)));
            ((Transport) (obj)).b();
        }

            public 
            {
                a = socket;
                super();
            }
    }

}
