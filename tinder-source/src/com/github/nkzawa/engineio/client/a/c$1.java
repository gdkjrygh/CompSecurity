// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client.a;

import com.github.nkzawa.f.a;
import com.squareup.okhttp.o;
import com.squareup.okhttp.v;
import com.squareup.okhttp.ws.WebSocket;
import com.squareup.okhttp.ws.b;
import java.io.IOException;
import java.util.Map;
import okio.e;

// Referenced classes of package com.github.nkzawa.engineio.client.a:
//            c

final class a
    implements b
{

    final c a;
    final c b;

    public final void a()
    {
        com.github.nkzawa.f.a.a(new Runnable() {

            final c._cls1 a;

            public final void run()
            {
                a.a.e();
            }

            
            {
                a = c._cls1.this;
                super();
            }
        });
    }

    public final void a(WebSocket websocket, v v1)
    {
        com.github.nkzawa.engineio.client.a.c.a(b, websocket);
        com.github.nkzawa.f.a.a(new Runnable(v1.c().b()) {

            final Map a;
            final c._cls1 b;

            public final void run()
            {
                b.a.a("responseHeaders", new Object[] {
                    a
                });
                com.github.nkzawa.engineio.client.a.c.a(b.a);
            }

            
            {
                b = c._cls1.this;
                a = map;
                super();
            }
        });
    }

    public final void a(IOException ioexception)
    {
        com.github.nkzawa.f.a.a(new Runnable(ioexception) {

            final IOException a;
            final c._cls1 b;

            public final void run()
            {
                com.github.nkzawa.engineio.client.a.c.b(b.a, "websocket error", a);
            }

            
            {
                b = c._cls1.this;
                a = ioexception;
                super();
            }
        });
    }

    public final void a(e e1, com.squareup.okhttp.ws.ocket.PayloadType payloadtype)
        throws IOException
    {
        Object obj = null;
        com.github.nkzawa.engineio.client.a.a[payloadtype.ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 65
    //                   2 75;
           goto _L1 _L2 _L3
_L1:
        com.github.nkzawa.f.a.a(new Runnable(payloadtype) {

            final com.squareup.okhttp.ws.WebSocket.PayloadType a;
            final c._cls1 b;

            public final void run()
            {
                com.github.nkzawa.engineio.client.a.c.a(b.a, (new StringBuilder("Unknown payload type: ")).append(a).toString(), new IllegalStateException());
            }

            
            {
                b = c._cls1.this;
                a = payloadtype;
                super();
            }
        });
        payloadtype = obj;
_L5:
        e1.close();
        com.github.nkzawa.f.a.a(new Runnable(payloadtype) {

            final Object a;
            final c._cls1 b;

            public final void run()
            {
                if (a == null)
                {
                    return;
                }
                if (a instanceof String)
                {
                    com.github.nkzawa.engineio.client.a.c.a(b.a, (String)a);
                    return;
                } else
                {
                    com.github.nkzawa.engineio.client.a.c.a(b.a, (byte[])(byte[])a);
                    return;
                }
            }

            
            {
                b = c._cls1.this;
                a = obj;
                super();
            }
        });
        return;
_L2:
        payloadtype = e1.o();
        continue; /* Loop/switch isn't completed */
_L3:
        payloadtype = e1.q();
        if (true) goto _L5; else goto _L4
_L4:
    }

    _cls5.a(c c1, c c2)
    {
        b = c1;
        a = c2;
        super();
    }
}
