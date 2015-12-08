// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client;

import com.github.nkzawa.engineio.client.a.a;
import com.github.nkzawa.engineio.parser.b;
import java.util.logging.Logger;

// Referenced classes of package com.github.nkzawa.engineio.client:
//            Socket, Transport, EngineIOException

final class a
    implements Runnable
{

    final a a;

    public final void run()
    {
        while (a.a.a[0] || ate.d == Socket.d(a.a.a)) 
        {
            return;
        }
        Socket.d().fine("changing transport and sending upgrade packet");
        a.a.a[0].run();
        com.github.nkzawa.engineio.client.Socket.a(a.a.a, a.a.a[0]);
        b b1 = new b("upgrade");
        a.a.a[0].a(new b[] {
            b1
        });
        a.a.a.a("upgrade", new Object[] {
            a.a.a[0]
        });
        a.a.a[0] = null;
        com.github.nkzawa.engineio.client.Socket.a(a.a.a, false);
        Socket.e(a.a.a);
    }

    ion(ion ion)
    {
        a = ion;
        super();
    }

    // Unreferenced inner class com/github/nkzawa/engineio/client/Socket$19

/* anonymous class */
    final class Socket._cls19
        implements com.github.nkzawa.b.a.a
    {

        final boolean a[];
        final String b;
        final Transport c[];
        final Socket d;
        final Runnable e[];
        final Socket f;

        public final transient void a(Object aobj[])
        {
            if (a[0])
            {
                return;
            } else
            {
                Socket.d().fine(String.format("probe transport '%s' opened", new Object[] {
                    b
                }));
                aobj = new b("ping", "probe");
                c[0].a(new b[] {
                    aobj
                });
                c[0].b("packet", new Socket._cls19._cls1(this));
                return;
            }
        }

            
            {
                f = socket;
                a = aflag;
                b = s;
                c = atransport;
                d = socket1;
                e = arunnable;
                super();
            }
    }


    // Unreferenced inner class com/github/nkzawa/engineio/client/Socket$19$1

/* anonymous class */
    final class Socket._cls19._cls1
        implements com.github.nkzawa.b.a.a
    {

        final Socket._cls19 a;

        public final transient void a(Object aobj[])
        {
            if (!a.a[0])
            {
                aobj = (b)aobj[0];
                if ("pong".equals(((b) (aobj)).a) && "probe".equals(((b) (aobj)).b))
                {
                    Socket.d().fine(String.format("probe transport '%s' pong", new Object[] {
                        a.b
                    }));
                    com.github.nkzawa.engineio.client.Socket.a(a.d, true);
                    a.d.a("upgrading", new Object[] {
                        a.c[0]
                    });
                    if (a.c[0] != null)
                    {
                        com.github.nkzawa.engineio.client.Socket.a("websocket".equals(a.c[0].d));
                        Socket.d().fine(String.format("pausing current transport '%s'", new Object[] {
                            a.d.e.d
                        }));
                        com.github.nkzawa.f.a.a(new com.github.nkzawa.engineio.client.a.a._cls1((a)a.d.e, new Socket._cls19._cls1._cls1(this)));
                        return;
                    }
                } else
                {
                    Socket.d().fine(String.format("probe transport '%s' failed", new Object[] {
                        a.b
                    }));
                    aobj = new EngineIOException("probe error");
                    aobj.a = a.c[0].d;
                    a.d.a("upgradeError", new Object[] {
                        aobj
                    });
                    return;
                }
            }
        }

            
            {
                a = _pcls19;
                super();
            }
    }

}
