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
    implements Runnable
{

    final IOException a;
    final a b;

    public final void run()
    {
        com.github.nkzawa.engineio.client.a.c.b(b.b, "websocket error", a);
    }

    a(a a1, IOException ioexception)
    {
        b = a1;
        a = ioexception;
        super();
    }

    // Unreferenced inner class com/github/nkzawa/engineio/client/a/c$1

/* anonymous class */
    final class c._cls1
        implements b
    {

        final c a;
        final c b;

        public final void a()
        {
            com.github.nkzawa.f.a.a(new c._cls1._cls4());
        }

        public final void a(WebSocket websocket, v v1)
        {
            com.github.nkzawa.engineio.client.a.c.a(b, websocket);
            com.github.nkzawa.f.a.a(new c._cls1._cls1(v1.c().b()));
        }

        public final void a(IOException ioexception)
        {
            com.github.nkzawa.f.a.a(new c._cls1._cls5(this, ioexception));
        }

        public final void a(e e1, com.squareup.okhttp.ws.WebSocket.PayloadType payloadtype)
            throws IOException
        {
            Object obj = null;
            com.github.nkzawa.engineio.client.a.c._cls4.a[payloadtype.ordinal()];
            JVM INSTR tableswitch 1 2: default 32
        //                       1 65
        //                       2 75;
               goto _L1 _L2 _L3
_L1:
            com.github.nkzawa.f.a.a(new c._cls1._cls2(payloadtype));
            payloadtype = obj;
_L5:
            e1.close();
            com.github.nkzawa.f.a.a(new c._cls1._cls3(payloadtype));
            return;
_L2:
            payloadtype = e1.o();
            continue; /* Loop/switch isn't completed */
_L3:
            payloadtype = e1.q();
            if (true) goto _L5; else goto _L4
_L4:
        }

            
            {
                b = c1;
                a = c2;
                super();
            }

        // Unreferenced inner class com/github/nkzawa/engineio/client/a/c$1$1

/* anonymous class */
        final class c._cls1._cls1
            implements Runnable
        {

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
        }


        // Unreferenced inner class com/github/nkzawa/engineio/client/a/c$1$2

/* anonymous class */
        final class c._cls1._cls2
            implements Runnable
        {

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
        }


        // Unreferenced inner class com/github/nkzawa/engineio/client/a/c$1$3

/* anonymous class */
        final class c._cls1._cls3
            implements Runnable
        {

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
        }


        // Unreferenced inner class com/github/nkzawa/engineio/client/a/c$1$4

/* anonymous class */
        final class c._cls1._cls4
            implements Runnable
        {

            final c._cls1 a;

            public final void run()
            {
                a.a.e();
            }

                    
                    {
                        a = c._cls1.this;
                        super();
                    }
        }

    }

}
