// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client.a;

import com.github.nkzawa.engineio.client.Transport;
import com.github.nkzawa.engineio.parser.b;
import com.github.nkzawa.f.a;
import com.squareup.okhttp.m;
import com.squareup.okhttp.o;
import com.squareup.okhttp.s;
import com.squareup.okhttp.v;
import com.squareup.okhttp.ws.WebSocket;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import okio.e;

// Referenced classes of package com.github.nkzawa.engineio.client.a:
//            b

public final class c extends Transport
{

    private static final Logger p = Logger.getLogger(com/github/nkzawa/engineio/client/a/b.getName());
    private WebSocket q;
    private com.squareup.okhttp.ws.a r;

    public c(com.github.nkzawa.engineio.client.Transport.a a1)
    {
        super(a1);
        d = "websocket";
    }

    static Transport a(c c1, String s1, Exception exception)
    {
        return c1.a(s1, exception);
    }

    static WebSocket a(c c1, WebSocket websocket)
    {
        c1.q = websocket;
        return websocket;
    }

    static void a(c c1)
    {
        c1.d();
    }

    static void a(c c1, String s1)
    {
        c1.a(s1);
    }

    static void a(c c1, byte abyte0[])
    {
        c1.a(abyte0);
    }

    static Transport b(c c1, String s1, Exception exception)
    {
        return c1.a(s1, exception);
    }

    static WebSocket b(c c1)
    {
        return c1.q;
    }

    static Logger h()
    {
        return p;
    }

    protected final void b(b ab[])
    {
        int i = 0;
        c = false;
        for (int j = ab.length; i < j; i++)
        {
            com.github.nkzawa.engineio.parser.c.a(ab[i], new com.github.nkzawa.engineio.parser.b(this) {

                final c a;
                final c b;

                public final void a(Object obj)
                {
                    if (obj instanceof String)
                    {
                        com.github.nkzawa.engineio.client.a.c.b(a).a(com.squareup.okhttp.ws.WebSocket.PayloadType.a, (new okio.c()).a((String)obj));
                        return;
                    }
                    try
                    {
                        if (obj instanceof byte[])
                        {
                            com.github.nkzawa.engineio.client.a.c.b(a).a(com.squareup.okhttp.ws.WebSocket.PayloadType.b, (new okio.c()).b((byte[])(byte[])obj));
                            return;
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        c.h().fine("websocket closed before onclose event");
                    }
                    return;
                }

            
            {
                b = c.this;
                a = c2;
                super();
            }
            });
        }

        com.github.nkzawa.f.a.b(new Runnable(this) {

            final c a;
            final c b;

            public final void run()
            {
                a.c = true;
                a.a("drain", new Object[0]);
            }

            
            {
                b = c.this;
                a = c2;
                super();
            }
        });
    }

    protected final void e()
    {
        super.e();
    }

    protected final void f()
    {
        Object obj;
        s s1;
label0:
        {
            Object obj4 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            a("requestHeaders", new Object[] {
                obj4
            });
            s1 = new s();
            if (l != null)
            {
                s1.a(l.getSocketFactory());
            }
            if (n != null)
            {
                s1.a(n);
            }
            com.squareup.okhttp.t.a a1 = new com.squareup.okhttp.t.a();
            Object obj1 = e;
            obj = obj1;
            if (obj1 == null)
            {
                obj = new HashMap();
            }
            Object obj2;
            Object obj3;
            if (f)
            {
                obj1 = "wss";
            } else
            {
                obj1 = "ws";
            }
            obj3 = "";
            obj2 = obj3;
            if (h <= 0)
            {
                break label0;
            }
            if (!"wss".equals(obj1) || h == 443)
            {
                obj2 = obj3;
                if (!"ws".equals(obj1))
                {
                    break label0;
                }
                obj2 = obj3;
                if (h == 80)
                {
                    break label0;
                }
            }
            obj2 = (new StringBuilder(":")).append(h).toString();
        }
        if (g)
        {
            ((Map) (obj)).put(k, String.valueOf((new Date()).getTime()));
        }
        obj3 = com.github.nkzawa.e.a.a(((Map) (obj)));
        obj = obj3;
        if (((String) (obj3)).length() > 0)
        {
            obj = (new StringBuilder("?")).append(((String) (obj3))).toString();
        }
        obj = a1.a((new StringBuilder()).append(((String) (obj1))).append("://").append(j).append(((String) (obj2))).append(i).append(((String) (obj))).toString());
        for (obj1 = ((Map) (obj4)).entrySet().iterator(); ((Iterator) (obj1)).hasNext();)
        {
            obj2 = (java.util.Map.Entry)((Iterator) (obj1)).next();
            obj3 = ((List)((java.util.Map.Entry) (obj2)).getValue()).iterator();
            while (((Iterator) (obj3)).hasNext()) 
            {
                obj4 = (String)((Iterator) (obj3)).next();
                ((com.squareup.okhttp.t.a) (obj)).b((String)((java.util.Map.Entry) (obj2)).getKey(), ((String) (obj4)));
            }
        }

        r = com.squareup.okhttp.ws.a.a(s1, ((com.squareup.okhttp.t.a) (obj)).a());
        r.a(new com.squareup.okhttp.ws.b(this) {

            final c a;
            final c b;

            public final void a()
            {
                com.github.nkzawa.f.a.a(new Runnable(this) {

                    final _cls1 a;

                    public final void run()
                    {
                        a.a.e();
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
            }

            public final void a(WebSocket websocket, v v1)
            {
                com.github.nkzawa.engineio.client.a.c.a(b, websocket);
                com.github.nkzawa.f.a.a(new Runnable(this, v1.c().b()) {

                    final Map a;
                    final _cls1 b;

                    public final void run()
                    {
                        b.a.a("responseHeaders", new Object[] {
                            a
                        });
                        com.github.nkzawa.engineio.client.a.c.a(b.a);
                    }

            
            {
                b = _pcls1;
                a = map;
                super();
            }
                });
            }

            public final void a(IOException ioexception)
            {
                com.github.nkzawa.f.a.a(new Runnable(this, ioexception) {

                    final IOException a;
                    final _cls1 b;

                    public final void run()
                    {
                        com.github.nkzawa.engineio.client.a.c.b(b.a, "websocket error", a);
                    }

            
            {
                b = _pcls1;
                a = ioexception;
                super();
            }
                });
            }

            public final void a(e e1, com.squareup.okhttp.ws.WebSocket.PayloadType payloadtype)
                throws IOException
            {
                Object obj5 = null;
                static final class _cls4
                {

                    static final int a[];

                    static 
                    {
                        a = new int[com.squareup.okhttp.ws.WebSocket.PayloadType.values().length];
                        try
                        {
                            a[com.squareup.okhttp.ws.WebSocket.PayloadType.a.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[com.squareup.okhttp.ws.WebSocket.PayloadType.b.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                com.github.nkzawa.engineio.client.a._cls4.a[payloadtype.ordinal()];
                JVM INSTR tableswitch 1 2: default 32
            //                           1 65
            //                           2 75;
                   goto _L1 _L2 _L3
_L1:
                com.github.nkzawa.f.a.a(new Runnable(this, payloadtype) {

                    final com.squareup.okhttp.ws.WebSocket.PayloadType a;
                    final _cls1 b;

                    public final void run()
                    {
                        com.github.nkzawa.engineio.client.a.c.a(b.a, (new StringBuilder("Unknown payload type: ")).append(a).toString(), new IllegalStateException());
                    }

            
            {
                b = _pcls1;
                a = payloadtype;
                super();
            }
                });
                payloadtype = obj5;
_L5:
                e1.close();
                com.github.nkzawa.f.a.a(new Runnable(this, payloadtype) {

                    final Object a;
                    final _cls1 b;

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
                b = _pcls1;
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

            
            {
                b = c.this;
                a = c2;
                super();
            }
        });
        s1.a().a().shutdown();
    }

    protected final void g()
    {
        if (r != null)
        {
            r.a();
        }
        if (q == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        q.a("");
        return;
        Object obj;
        obj;
        return;
        obj;
    }

}
