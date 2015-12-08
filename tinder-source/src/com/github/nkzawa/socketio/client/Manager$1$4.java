// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.socketio.client;

import com.github.nkzawa.engineio.client.Socket;
import com.github.nkzawa.f.a;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;

// Referenced classes of package com.github.nkzawa.socketio.client:
//            Manager, c, SocketIOException

final class d extends TimerTask
{

    final long a;
    final a b;
    final Socket c;
    final Manager d;
    final a e;

    public final void run()
    {
        com.github.nkzawa.f.a.a(new Runnable() {

            final Manager._cls1._cls4 a;

            public final void run()
            {
                Manager.c().fine(String.format("connect attempt timed out after %d", new Object[] {
                    Long.valueOf(a.a)
                }));
                a.b.a();
                a.c.b();
                a.c.a("error", new Object[] {
                    new SocketIOException("timeout")
                });
                com.github.nkzawa.socketio.client.Manager.a(a.d, "connect_timeout", new Object[] {
                    Long.valueOf(a.a)
                });
            }

            
            {
                a = Manager._cls1._cls4.this;
                super();
            }
        });
    }

    a(a a1, long l, a a2, Socket socket, Manager manager)
    {
        e = a1;
        a = l;
        b = a2;
        c = socket;
        d = manager;
        super();
    }

    // Unreferenced inner class com/github/nkzawa/socketio/client/Manager$1

/* anonymous class */
    final class Manager._cls1
        implements Runnable
    {

        final Manager.b a;
        final Manager b;

        public final void run()
        {
            Manager.c().fine(String.format("readyState %s", new Object[] {
                b.d
            }));
            if (b.d == Manager.ReadyState.c || b.d == Manager.ReadyState.b)
            {
                return;
            }
            Manager.c().fine(String.format("opening %s", new Object[] {
                com.github.nkzawa.socketio.client.Manager.a(b)
            }));
            b.h = new Manager.a(com.github.nkzawa.socketio.client.Manager.a(b), Manager.b(b));
            Socket socket = b.h;
            Manager manager = b;
            b.d = Manager.ReadyState.b;
            Manager.c(b);
            socket.a("transport", new Manager._cls1._cls1(manager));
            c.a a1 = com.github.nkzawa.socketio.client.c.a(socket, "open", new Manager._cls1._cls2(manager));
            c.a a2 = com.github.nkzawa.socketio.client.c.a(socket, "error", new Manager._cls1._cls3(manager));
            if (Manager.g(b) >= 0L)
            {
                long l = Manager.g(b);
                Manager.c().fine(String.format("connection attempt will timeout after %d", new Object[] {
                    Long.valueOf(l)
                }));
                Timer timer = new Timer();
                timer.schedule(new Manager._cls1._cls4(this, l, a1, socket, manager), l);
                Manager.h(b).add(new Manager._cls1._cls5(timer));
            }
            Manager.h(b).add(a1);
            Manager.h(b).add(a2);
            com.github.nkzawa.f.a.a(new com.github.nkzawa.engineio.client.Socket._cls12(b.h));
        }

            
            {
                b = manager;
                a = b1;
                super();
            }

        // Unreferenced inner class com/github/nkzawa/socketio/client/Manager$1$1

/* anonymous class */
        final class Manager._cls1._cls1
            implements com.github.nkzawa.b.a.a
        {

            final Manager a;
            final Manager._cls1 b;

            public final transient void a(Object aobj[])
            {
                a.a("transport", aobj);
            }

                    
                    {
                        b = Manager._cls1.this;
                        a = manager;
                        super();
                    }
        }


        // Unreferenced inner class com/github/nkzawa/socketio/client/Manager$1$2

/* anonymous class */
        final class Manager._cls1._cls2
            implements com.github.nkzawa.b.a.a
        {

            final Manager a;
            final Manager._cls1 b;

            public final transient void a(Object aobj[])
            {
                Manager.d(a);
                if (b.a != null)
                {
                    b.a.a(null);
                }
            }

                    
                    {
                        b = Manager._cls1.this;
                        a = manager;
                        super();
                    }
        }


        // Unreferenced inner class com/github/nkzawa/socketio/client/Manager$1$3

/* anonymous class */
        final class Manager._cls1._cls3
            implements com.github.nkzawa.b.a.a
        {

            final Manager a;
            final Manager._cls1 b;

            public final transient void a(Object aobj[])
            {
                if (aobj.length > 0)
                {
                    aobj = ((Object []) (aobj[0]));
                } else
                {
                    aobj = null;
                }
                Manager.c().fine("connect_error");
                Manager.e(a);
                a.d = com.github.nkzawa.socketio.client.Manager.ReadyState.a;
                com.github.nkzawa.socketio.client.Manager.a(a, "connect_error", new Object[] {
                    aobj
                });
                if (b.a != null)
                {
                    if (aobj instanceof Exception)
                    {
                        aobj = (Exception)aobj;
                    } else
                    {
                        aobj = null;
                    }
                    aobj = new SocketIOException("Connection error", ((Throwable) (aobj)));
                    b.a.a(((Exception) (aobj)));
                    return;
                } else
                {
                    Manager.f(a);
                    return;
                }
            }

                    
                    {
                        b = Manager._cls1.this;
                        a = manager;
                        super();
                    }
        }


        // Unreferenced inner class com/github/nkzawa/socketio/client/Manager$1$5

/* anonymous class */
        final class Manager._cls1._cls5
            implements c.a
        {

            final Timer a;
            final Manager._cls1 b;

            public final void a()
            {
                a.cancel();
            }

                    
                    {
                        b = Manager._cls1.this;
                        a = timer;
                        super();
                    }
        }

    }

}
