// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.socketio.client;

import com.github.nkzawa.b.a;
import com.github.nkzawa.engineio.client.Socket;
import com.github.nkzawa.socketio.a.b;
import com.github.nkzawa.socketio.a.c;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;

// Referenced classes of package com.github.nkzawa.socketio.client:
//            d, c, SocketIOException

public class Manager extends com.github.nkzawa.b.a
{
    static final class ReadyState extends Enum
    {

        public static final ReadyState a;
        public static final ReadyState b;
        public static final ReadyState c;
        private static final ReadyState d[];

        public static ReadyState valueOf(String s1)
        {
            return (ReadyState)Enum.valueOf(com/github/nkzawa/socketio/client/Manager$ReadyState, s1);
        }

        public static ReadyState[] values()
        {
            return (ReadyState[])d.clone();
        }

        static 
        {
            a = new ReadyState("CLOSED", 0);
            b = new ReadyState("OPENING", 1);
            c = new ReadyState("OPEN", 2);
            d = (new ReadyState[] {
                a, b, c
            });
        }

        private ReadyState(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    private static final class a extends Socket
    {

        a(URI uri, com.github.nkzawa.engineio.client.Socket.a a1)
        {
            super(uri, a1);
        }
    }

    public static interface b
    {

        public abstract void a(Exception exception);
    }

    public static class c extends com.github.nkzawa.engineio.client.Socket.a
    {

        public boolean s;
        public int t;
        public long u;
        public long v;
        public double w;
        public long x;

        public c()
        {
            s = true;
            x = 20000L;
        }
    }


    static SSLContext b;
    static HostnameVerifier c;
    private static final Logger j = Logger.getLogger(com/github/nkzawa/socketio/client/Manager.getName());
    ReadyState d;
    boolean e;
    com.github.nkzawa.a.a f;
    Set g;
    Socket h;
    ConcurrentHashMap i;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private long o;
    private long p;
    private double q;
    private long r;
    private URI s;
    private List t;
    private Queue u;
    private c v;
    private com.github.nkzawa.socketio.a.c.c w;
    private com.github.nkzawa.socketio.a.c.b x;

    public Manager()
    {
        this(null, null);
    }

    public Manager(URI uri, c c1)
    {
        d = null;
        c c2 = c1;
        if (c1 == null)
        {
            c2 = new c();
        }
        if (c2.g == null)
        {
            c2.g = "/socket.io";
        }
        if (c2.n == null)
        {
            c2.n = b;
        }
        if (c2.o == null)
        {
            c2.o = c;
        }
        v = c2;
        i = new ConcurrentHashMap();
        u = new LinkedList();
        k = c2.s;
        double d1;
        int i1;
        long l1;
        if (c2.t != 0)
        {
            i1 = c2.t;
        } else
        {
            i1 = 0x7fffffff;
        }
        n = i1;
        if (c2.u != 0L)
        {
            l1 = c2.u;
        } else
        {
            l1 = 1000L;
        }
        o = l1;
        if (f != null)
        {
            f.a = l1;
        }
        if (c2.v != 0L)
        {
            l1 = c2.v;
        } else
        {
            l1 = 5000L;
        }
        p = l1;
        if (f != null)
        {
            f.b = l1;
        }
        if (c2.w != 0.0D)
        {
            d1 = c2.w;
        } else
        {
            d1 = 0.5D;
        }
        q = d1;
        if (f != null)
        {
            f.d = d1;
        }
        c1 = new com.github.nkzawa.a.a();
        c1.a = o;
        c1.b = p;
        c1.d = q;
        f = c1;
        r = c2.x;
        d = com.github.nkzawa.socketio.client.ReadyState.a;
        s = uri;
        g = new HashSet();
        m = false;
        t = new ArrayList();
        w = new com.github.nkzawa.socketio.a.c.c();
        x = new com.github.nkzawa.socketio.a.c.b();
    }

    static URI a(Manager manager)
    {
        return manager.s;
    }

    static void a(Manager manager, com.github.nkzawa.socketio.a.b b1)
    {
        manager.a("packet", new Object[] {
            b1
        });
    }

    static void a(Manager manager, Exception exception)
    {
        j.log(Level.FINE, "error", exception);
        manager.b("error", new Object[] {
            exception
        });
    }

    static void a(Manager manager, String s1)
    {
        manager = manager.x;
        s1 = com.github.nkzawa.socketio.a.c.b.a(s1);
        if (5 == ((com.github.nkzawa.socketio.a.b) (s1)).a || 6 == ((com.github.nkzawa.socketio.a.b) (s1)).a)
        {
            manager.c = new com.github.nkzawa.socketio.a.c.a(s1);
            if (((com.github.nkzawa.socketio.a.c.b) (manager)).c.a.e == 0)
            {
                manager.a(com.github.nkzawa.socketio.a.c.b.b, new Object[] {
                    s1
                });
            }
            return;
        } else
        {
            manager.a(com.github.nkzawa.socketio.a.c.b.b, new Object[] {
                s1
            });
            return;
        }
    }

    static void a(Manager manager, String s1, Object aobj[])
    {
        manager.b(s1, aobj);
    }

    static void a(Manager manager, byte abyte0[])
    {
        com.github.nkzawa.socketio.a.c.b b1 = manager.x;
        if (b1.c == null)
        {
            throw new RuntimeException("got binary data when not reconstructing a packet");
        }
        com.github.nkzawa.socketio.a.c.a a1 = b1.c;
        a1.b.add(abyte0);
        if (a1.b.size() == a1.a.e)
        {
            manager = a1.a;
            abyte0 = (byte[][])a1.b.toArray(new byte[a1.b.size()][]);
            manager.d = com.github.nkzawa.socketio.a.a.a(((com.github.nkzawa.socketio.a.b) (manager)).d, abyte0);
            manager.e = -1;
            a1.a = null;
            a1.b = new ArrayList();
        } else
        {
            manager = null;
        }
        if (manager != null)
        {
            b1.c = null;
            b1.a(com.github.nkzawa.socketio.a.c.b.b, new Object[] {
                manager
            });
        }
    }

    static c b(Manager manager)
    {
        return manager.v;
    }

    static void b(Manager manager, String s1)
    {
        j.fine("close");
        manager.b();
        manager.f.e = 0;
        manager.d = com.github.nkzawa.socketio.client.ReadyState.a;
        manager.a("close", new Object[] {
            s1
        });
        if (manager.k && !manager.e)
        {
            manager.d();
        }
    }

    private transient void b(String s1, Object aobj[])
    {
        a(s1, aobj);
        for (Iterator iterator = i.values().iterator(); iterator.hasNext(); ((d)iterator.next()).a(s1, aobj)) { }
    }

    static Logger c()
    {
        return j;
    }

    static boolean c(Manager manager)
    {
        manager.e = false;
        return false;
    }

    private void d()
    {
        if (l || e)
        {
            return;
        }
        if (f.e >= n)
        {
            j.fine("reconnect failed");
            f.e = 0;
            b("reconnect_failed", new Object[0]);
            l = false;
            return;
        }
        Object obj = f;
        long l1 = ((com.github.nkzawa.a.a) (obj)).a;
        double d1 = ((com.github.nkzawa.a.a) (obj)).c;
        int i1 = ((com.github.nkzawa.a.a) (obj)).e;
        obj.e = i1 + 1;
        long l2 = l1 * (long)Math.pow(d1, i1);
        l1 = l2;
        if (((com.github.nkzawa.a.a) (obj)).d != 0.0D)
        {
            double d2 = Math.random();
            int j1 = (int)Math.floor(((com.github.nkzawa.a.a) (obj)).d * d2 * (double)l2);
            if (((int)Math.floor(d2 * 10D) & 1) == 0)
            {
                l1 = l2 - (long)j1;
            } else
            {
                l1 = l2 + (long)j1;
            }
        }
        l2 = l1;
        if (l1 < ((com.github.nkzawa.a.a) (obj)).a)
        {
            l2 = 0x7fffffffffffffffL;
        }
        l1 = Math.min(l2, ((com.github.nkzawa.a.a) (obj)).b);
        j.fine(String.format("will wait %dms before reconnect attempt", new Object[] {
            Long.valueOf(l1)
        }));
        l = true;
        obj = new Timer();
        ((Timer) (obj)).schedule(new TimerTask(this) {

            final Manager a;
            final Manager b;

            public final void run()
            {
                com.github.nkzawa.f.a.a(new Runnable(this) {

                    final _cls8 a;

                    public final void run()
                    {
                        if (!Manager.l(a.a))
                        {
                            com.github.nkzawa.socketio.client.Manager.c().fine("attempting reconnect");
                            int i1 = Manager.m(a.a).e;
                            com.github.nkzawa.socketio.client.Manager.a(a.a, "reconnect_attempt", new Object[] {
                                Integer.valueOf(i1)
                            });
                            com.github.nkzawa.socketio.client.Manager.a(a.a, "reconnecting", new Object[] {
                                Integer.valueOf(i1)
                            });
                            if (!Manager.l(a.a))
                            {
                                a.a.a(new b(this) {

                                    final _cls1 a;

                                    public final void a(Exception exception)
                                    {
                                        if (exception != null)
                                        {
                                            com.github.nkzawa.socketio.client.Manager.c().fine("reconnect attempt error");
                                            Manager.n(a.a.a);
                                            Manager.o(a.a.a);
                                            com.github.nkzawa.socketio.client.Manager.a(a.a.a, "reconnect_error", new Object[] {
                                                exception
                                            });
                                            return;
                                        } else
                                        {
                                            com.github.nkzawa.socketio.client.Manager.c().fine("reconnect success");
                                            Manager.p(a.a.a);
                                            return;
                                        }
                                    }

            
            {
                a = _pcls1;
                super();
            }
                                });
                                return;
                            }
                        }
                    }

            
            {
                a = _pcls8;
                super();
            }
                });
            }

            
            {
                b = Manager.this;
                a = manager1;
                super();
            }
        }, l1);
        u.add(new c.a(((Timer) (obj))) {

            final Timer a;
            final Manager b;

            public final void a()
            {
                a.cancel();
            }

            
            {
                b = Manager.this;
                a = timer;
                super();
            }
        });
    }

    static void d(Manager manager)
    {
        j.fine("open");
        manager.b();
        manager.d = com.github.nkzawa.socketio.client.ReadyState.c;
        manager.a("open", new Object[0]);
        Socket socket = manager.h;
        manager.u.add(com.github.nkzawa.socketio.client.c.a(socket, "data", manager. new com.github.nkzawa.b.a.a() {

            final Manager a;

            public final transient void a(Object aobj[])
            {
                aobj = ((Object []) (aobj[0]));
                if (aobj instanceof String)
                {
                    com.github.nkzawa.socketio.client.Manager.a(a, (String)aobj);
                } else
                if (aobj instanceof byte[])
                {
                    com.github.nkzawa.socketio.client.Manager.a(a, (byte[])(byte[])aobj);
                    return;
                }
            }

            
            {
                a = Manager.this;
                super();
            }
        }));
        manager.u.add(com.github.nkzawa.socketio.client.c.a(manager.x, com.github.nkzawa.socketio.a.c.b.b, manager. new com.github.nkzawa.b.a.a() {

            final Manager a;

            public final transient void a(Object aobj[])
            {
                com.github.nkzawa.socketio.client.Manager.a(a, (com.github.nkzawa.socketio.a.b)aobj[0]);
            }

            
            {
                a = Manager.this;
                super();
            }
        }));
        manager.u.add(com.github.nkzawa.socketio.client.c.a(socket, "error", manager. new com.github.nkzawa.b.a.a() {

            final Manager a;

            public final transient void a(Object aobj[])
            {
                com.github.nkzawa.socketio.client.Manager.a(a, (Exception)aobj[0]);
            }

            
            {
                a = Manager.this;
                super();
            }
        }));
        manager.u.add(com.github.nkzawa.socketio.client.c.a(socket, "close", manager. new com.github.nkzawa.b.a.a() {

            final Manager a;

            public final transient void a(Object aobj[])
            {
                com.github.nkzawa.socketio.client.Manager.b(a, (String)aobj[0]);
            }

            
            {
                a = Manager.this;
                super();
            }
        }));
    }

    static void e(Manager manager)
    {
        manager.b();
    }

    static void f(Manager manager)
    {
        if (!manager.l && manager.k && manager.f.e == 0)
        {
            manager.d();
        }
    }

    static long g(Manager manager)
    {
        return manager.r;
    }

    static Queue h(Manager manager)
    {
        return manager.u;
    }

    static Set i(Manager manager)
    {
        return manager.g;
    }

    static boolean j(Manager manager)
    {
        manager.m = false;
        return false;
    }

    static void k(Manager manager)
    {
        if (manager.t.size() > 0 && !manager.m)
        {
            manager.a((com.github.nkzawa.socketio.a.b)manager.t.remove(0));
        }
    }

    static boolean l(Manager manager)
    {
        return manager.e;
    }

    static com.github.nkzawa.a.a m(Manager manager)
    {
        return manager.f;
    }

    static boolean n(Manager manager)
    {
        manager.l = false;
        return false;
    }

    static void o(Manager manager)
    {
        manager.d();
    }

    static void p(Manager manager)
    {
        int i1 = manager.f.e;
        manager.l = false;
        manager.f.e = 0;
        for (Iterator iterator = manager.i.values().iterator(); iterator.hasNext();)
        {
            ((d)iterator.next()).c = manager.h.c;
        }

        manager.b("reconnect", new Object[] {
            Integer.valueOf(i1)
        });
    }

    public final Manager a(b b1)
    {
        com.github.nkzawa.f.a.a(new Runnable(b1) {

            final b a;
            final Manager b;

            public final void run()
            {
                com.github.nkzawa.socketio.client.Manager.c().fine(String.format("readyState %s", new Object[] {
                    b.d
                }));
                if (b.d == com.github.nkzawa.socketio.client.ReadyState.c || b.d == com.github.nkzawa.socketio.client.ReadyState.b)
                {
                    return;
                }
                com.github.nkzawa.socketio.client.Manager.c().fine(String.format("opening %s", new Object[] {
                    com.github.nkzawa.socketio.client.Manager.a(b)
                }));
                b.h = new a(com.github.nkzawa.socketio.client.Manager.a(b), com.github.nkzawa.socketio.client.Manager.b(b));
                Socket socket = b.h;
                Manager manager = b;
                b.d = com.github.nkzawa.socketio.client.ReadyState.b;
                com.github.nkzawa.socketio.client.Manager.c(b);
                socket.a("transport", new com.github.nkzawa.b.a.a(this, manager) {

                    final Manager a;
                    final _cls1 b;

                    public final transient void a(Object aobj[])
                    {
                        a.a("transport", aobj);
                    }

            
            {
                b = _pcls1;
                a = manager;
                super();
            }
                });
                c.a a1 = com.github.nkzawa.socketio.client.c.a(socket, "open", new com.github.nkzawa.b.a.a(this, manager) {

                    final Manager a;
                    final _cls1 b;

                    public final transient void a(Object aobj[])
                    {
                        Manager.d(a);
                        if (b.a != null)
                        {
                            b.a.a(null);
                        }
                    }

            
            {
                b = _pcls1;
                a = manager;
                super();
            }
                });
                c.a a2 = com.github.nkzawa.socketio.client.c.a(socket, "error", new com.github.nkzawa.b.a.a(this, manager) {

                    final Manager a;
                    final _cls1 b;

                    public final transient void a(Object aobj[])
                    {
                        if (aobj.length > 0)
                        {
                            aobj = ((Object []) (aobj[0]));
                        } else
                        {
                            aobj = null;
                        }
                        com.github.nkzawa.socketio.client.Manager.c().fine("connect_error");
                        Manager.e(a);
                        a.d = com.github.nkzawa.socketio.client.ReadyState.a;
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
                b = _pcls1;
                a = manager;
                super();
            }
                });
                if (Manager.g(b) >= 0L)
                {
                    long l1 = Manager.g(b);
                    com.github.nkzawa.socketio.client.Manager.c().fine(String.format("connection attempt will timeout after %d", new Object[] {
                        Long.valueOf(l1)
                    }));
                    Timer timer = new Timer();
                    timer.schedule(new TimerTask(this, l1, a1, socket, manager) {

                        final long a;
                        final c.a b;
                        final Socket c;
                        final Manager d;
                        final _cls1 e;

                        public final void run()
                        {
                            com.github.nkzawa.f.a.a(new Runnable(this) {

                                final _cls4 a;

                                public final void run()
                                {
                                    com.github.nkzawa.socketio.client.Manager.c().fine(String.format("connect attempt timed out after %d", new Object[] {
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
                a = _pcls4;
                super();
            }
                            });
                        }

            
            {
                e = _pcls1;
                a = l1;
                b = a1;
                c = socket;
                d = manager;
                super();
            }
                    }, l1);
                    Manager.h(b).add(new c.a(this, timer) {

                        final Timer a;
                        final _cls1 b;

                        public final void a()
                        {
                            a.cancel();
                        }

            
            {
                b = _pcls1;
                a = timer;
                super();
            }
                    });
                }
                Manager.h(b).add(a1);
                Manager.h(b).add(a2);
                com.github.nkzawa.f.a.a(new com.github.nkzawa.engineio.client.Socket._cls12(b.h));
            }

            
            {
                b = Manager.this;
                a = b1;
                super();
            }
        });
        return this;
    }

    final void a(com.github.nkzawa.socketio.a.b b1)
    {
        j.fine(String.format("writing packet %s", new Object[] {
            b1
        }));
        if (!m)
        {
            m = true;
            com.github.nkzawa.socketio.a.c.c.a a1 = new com.github.nkzawa.socketio.a.c.c.a(this) {

                final Manager a;
                final Manager b;

                public final void a(Object aobj[])
                {
                    int j1 = aobj.length;
                    int i1 = 0;
                    while (i1 < j1) 
                    {
                        Object obj1 = aobj[i1];
                        if (obj1 instanceof String)
                        {
                            com.github.nkzawa.f.a.a(new com.github.nkzawa.engineio.client.Socket._cls10(a.h, (String)obj1));
                        } else
                        if (obj1 instanceof byte[])
                        {
                            com.github.nkzawa.f.a.a(new com.github.nkzawa.engineio.client.Socket._cls11(a.h, (byte[])(byte[])obj1));
                        }
                        i1++;
                    }
                    Manager.j(a);
                    Manager.k(a);
                }

            
            {
                b = Manager.this;
                a = manager1;
                super();
            }
            };
            com.github.nkzawa.socketio.a.c.a().fine(String.format("encoding packet %s", new Object[] {
                b1
            }));
            if (5 == b1.a || 6 == b1.a)
            {
                ArrayList arraylist = new ArrayList();
                b1.d = com.github.nkzawa.socketio.a.a.a(b1.d, arraylist);
                b1.e = arraylist.size();
                Object obj = new com.github.nkzawa.socketio.a.a.a();
                obj.a = b1;
                obj.b = (byte[][])arraylist.toArray(new byte[arraylist.size()][]);
                b1 = com.github.nkzawa.socketio.a.c.c.a(((com.github.nkzawa.socketio.a.a.a) (obj)).a);
                obj = new ArrayList(Arrays.asList(((com.github.nkzawa.socketio.a.a.a) (obj)).b));
                ((List) (obj)).add(0, b1);
                a1.a(((List) (obj)).toArray());
                return;
            } else
            {
                a1.a(new String[] {
                    com.github.nkzawa.socketio.a.c.c.a(b1)
                });
                return;
            }
        } else
        {
            t.add(b1);
            return;
        }
    }

    final void b()
    {
        do
        {
            c.a a1 = (c.a)u.poll();
            if (a1 != null)
            {
                a1.a();
            } else
            {
                return;
            }
        } while (true);
    }


    // Unreferenced inner class com/github/nkzawa/socketio/client/Manager$6

/* anonymous class */
    final class _cls6
        implements com.github.nkzawa.b.a.a
    {

        final d a;
        final Manager b;
        final Manager c;

        public final transient void a(Object aobj[])
        {
            a.c = b.h.c;
            Manager.i(b).add(a);
        }

            
            {
                c = Manager.this;
                a = d1;
                b = manager1;
                super();
            }
    }

}
