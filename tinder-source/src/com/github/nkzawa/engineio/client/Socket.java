// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client;

import com.github.nkzawa.b.a;
import com.github.nkzawa.engineio.client.a.b;
import com.github.nkzawa.engineio.client.a.c;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import org.json.JSONException;

// Referenced classes of package com.github.nkzawa.engineio.client:
//            Transport, a, EngineIOException

public class Socket extends com.github.nkzawa.b.a
{
    private static final class ReadyState extends Enum
    {

        public static final ReadyState a;
        public static final ReadyState b;
        public static final ReadyState c;
        public static final ReadyState d;
        private static final ReadyState e[];

        public static ReadyState valueOf(String s1)
        {
            return (ReadyState)Enum.valueOf(com/github/nkzawa/engineio/client/Socket$ReadyState, s1);
        }

        public static ReadyState[] values()
        {
            return (ReadyState[])e.clone();
        }

        public final String toString()
        {
            return super.toString().toLowerCase();
        }

        static 
        {
            a = new ReadyState("OPENING", 0);
            b = new ReadyState("OPEN", 1);
            c = new ReadyState("CLOSING", 2);
            d = new ReadyState("CLOSED", 3);
            e = (new ReadyState[] {
                a, b, c, d
            });
        }

        private ReadyState(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static class a extends Transport.a
    {

        public String a[];
        public boolean b;
        public boolean c;
        public String d;
        public String e;

        public a()
        {
            b = true;
        }
    }


    private static final Logger f = Logger.getLogger(com/github/nkzawa/engineio/client/Socket.getName());
    private static final Runnable g = new Runnable() {

        public final void run()
        {
        }

    };
    private static boolean h = false;
    private static SSLContext i;
    private static HostnameVerifier j;
    private Future A;
    private Future B;
    private SSLContext C;
    private HostnameVerifier D;
    private ReadyState E;
    private ScheduledExecutorService F;
    private final com.github.nkzawa.b.a.a G;
    int b;
    public String c;
    LinkedList d;
    Transport e;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private long r;
    private long s;
    private String t;
    private String u;
    private String v;
    private List w;
    private List x;
    private Map y;
    private LinkedList z;

    public Socket()
    {
        this(new a());
    }

    private Socket(a a1)
    {
        byte byte0;
        byte0 = 80;
        super();
        d = new LinkedList();
        z = new LinkedList();
        G = new com.github.nkzawa.b.a.a() {

            final Socket a;

            public final transient void a(Object aobj[])
            {
                Socket socket = a;
                long l1;
                if (aobj.length > 0)
                {
                    l1 = ((Long)aobj[0]).longValue();
                } else
                {
                    l1 = 0L;
                }
                com.github.nkzawa.engineio.client.Socket.a(socket, l1);
            }

            
            {
                a = Socket.this;
                super();
            }
        };
        if (a1.d == null) goto _L2; else goto _L1
_L1:
        Object obj;
        int i1;
        StringBuilder stringbuilder;
        boolean flag;
        if (a1.d.indexOf(']') != -1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            obj = a1.d.split("]:");
        } else
        {
            obj = a1.d.split(":");
        }
        if (obj.length > 2 || a1.d.indexOf("::") == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        a1.f = a1.d;
_L2:
        k = a1.i;
        if (a1.n != null)
        {
            obj = a1.n;
        } else
        {
            obj = i;
        }
        C = ((SSLContext) (obj));
        if (a1.f != null)
        {
            obj = a1.f;
        } else
        {
            obj = "localhost";
        }
        t = ((String) (obj));
        if (a1.k != 0)
        {
            i1 = a1.k;
        } else
        {
            i1 = byte0;
            if (k)
            {
                i1 = 443;
            }
        }
        b = i1;
        if (a1.e != null)
        {
            obj = com.github.nkzawa.e.a.a(a1.e);
        } else
        {
            obj = new HashMap();
        }
        y = ((Map) (obj));
        l = a1.b;
        stringbuilder = new StringBuilder();
        if (a1.g != null)
        {
            obj = a1.g;
        } else
        {
            obj = "/engine.io";
        }
        u = stringbuilder.append(((String) (obj)).replaceAll("/$", "")).append("/").toString();
        if (a1.h != null)
        {
            obj = a1.h;
        } else
        {
            obj = "t";
        }
        v = ((String) (obj));
        m = a1.j;
        if (a1.a != null)
        {
            obj = a1.a;
        } else
        {
            obj = new String[2];
            obj[0] = "polling";
            obj[1] = "websocket";
        }
        w = new ArrayList(Arrays.asList(((Object []) (obj))));
        if (a1.l != 0)
        {
            i1 = a1.l;
        } else
        {
            i1 = 843;
        }
        p = i1;
        o = a1.c;
        if (a1.o != null)
        {
            a1 = a1.o;
        } else
        {
            a1 = j;
        }
        D = a1;
        return;
_L4:
        a1.f = obj[0];
        if (i1 != 0)
        {
            a1.f = a1.f.substring(1);
        }
        if (obj.length <= 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = Integer.parseInt(obj[obj.length - 1]);
_L6:
        a1.k = i1;
          goto _L2
        if (a1.k != -1) goto _L2; else goto _L5
_L5:
        if (k)
        {
            i1 = 443;
        } else
        {
            i1 = 80;
        }
          goto _L6
    }

    public Socket(URI uri, a a1)
    {
        a a3 = a1;
        if (uri != null)
        {
            a a2 = a1;
            if (a1 == null)
            {
                a2 = new a();
            }
            a2.d = uri.getHost();
            boolean flag;
            if ("https".equals(uri.getScheme()) || "wss".equals(uri.getScheme()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a2.i = flag;
            a2.k = uri.getPort();
            uri = uri.getRawQuery();
            a3 = a2;
            if (uri != null)
            {
                a2.e = uri;
                a3 = a2;
            }
        }
        this(a3);
    }

    static ReadyState a(Socket socket, ReadyState readystate)
    {
        socket.E = readystate;
        return readystate;
    }

    static Transport a(Socket socket, String s1)
    {
        return socket.a(s1);
    }

    private Transport a(String s1)
    {
        f.fine(String.format("creating transport '%s'", new Object[] {
            s1
        }));
        HashMap hashmap = new HashMap(y);
        hashmap.put("EIO", "3");
        hashmap.put("transport", s1);
        if (c != null)
        {
            hashmap.put("sid", c);
        }
        Transport.a a1 = new Transport.a();
        a1.n = C;
        a1.f = t;
        a1.k = b;
        a1.i = k;
        a1.g = u;
        a1.m = hashmap;
        a1.j = m;
        a1.h = v;
        a1.l = p;
        a1.p = this;
        a1.o = D;
        if ("websocket".equals(s1))
        {
            s1 = new c(a1);
        } else
        if ("polling".equals(s1))
        {
            s1 = new b(a1);
        } else
        {
            throw new RuntimeException();
        }
        a("transport", new Object[] {
            s1
        });
        return s1;
    }

    static void a(Socket socket, long l1)
    {
        if (socket.A != null)
        {
            socket.A.cancel(false);
        }
        long l2 = l1;
        if (l1 <= 0L)
        {
            l2 = socket.r + socket.s;
        }
        socket.A = socket.h().schedule(socket. new Runnable(socket) {

            final Socket a;
            final Socket b;

            public final void run()
            {
                com.github.nkzawa.f.a.a(new Runnable(this) {

                    final _cls7 a;

                    public final void run()
                    {
                        if (Socket.d(a.a) == ReadyState.d)
                        {
                            return;
                        } else
                        {
                            com.github.nkzawa.engineio.client.Socket.b(a.a, "ping timeout");
                            return;
                        }
                    }

            
            {
                a = _pcls7;
                super();
            }
                });
            }

            
            {
                b = Socket.this;
                a = socket1;
                super();
            }
        }, l2, TimeUnit.MILLISECONDS);
    }

    static void a(Socket socket, Transport transport)
    {
        f.fine(String.format("setting transport %s", new Object[] {
            transport.d
        }));
        if (socket.e != null)
        {
            f.fine(String.format("clearing existing transport %s", new Object[] {
                socket.e.d
            }));
            socket.e.a();
        }
        socket.e = transport;
        transport.a("drain", socket. new com.github.nkzawa.b.a.a(socket) {

            final Socket a;
            final Socket b;

            public final transient void a(Object aobj[])
            {
                com.github.nkzawa.engineio.client.Socket.c(a);
            }

            
            {
                b = Socket.this;
                a = socket1;
                super();
            }
        }).a("packet", socket. new com.github.nkzawa.b.a.a(socket) {

            final Socket a;
            final Socket b;

            public final transient void a(Object aobj[])
            {
                Socket socket1 = a;
                if (aobj.length > 0)
                {
                    aobj = (com.github.nkzawa.engineio.parser.b)aobj[0];
                } else
                {
                    aobj = null;
                }
                com.github.nkzawa.engineio.client.Socket.a(socket1, ((com.github.nkzawa.engineio.parser.b) (aobj)));
            }

            
            {
                b = Socket.this;
                a = socket1;
                super();
            }
        }).a("error", socket. new com.github.nkzawa.b.a.a(socket) {

            final Socket a;
            final Socket b;

            public final transient void a(Object aobj[])
            {
                Socket socket1 = a;
                if (aobj.length > 0)
                {
                    aobj = (Exception)aobj[0];
                } else
                {
                    aobj = null;
                }
                com.github.nkzawa.engineio.client.Socket.a(socket1, ((Exception) (aobj)));
            }

            
            {
                b = Socket.this;
                a = socket1;
                super();
            }
        }).a("close", socket. new com.github.nkzawa.b.a.a(socket) {

            final Socket a;
            final Socket b;

            public final transient void a(Object aobj[])
            {
                com.github.nkzawa.engineio.client.Socket.b(a, "transport close");
            }

            
            {
                b = Socket.this;
                a = socket1;
                super();
            }
        });
    }

    static void a(Socket socket, com.github.nkzawa.engineio.parser.b b1)
    {
        if (socket.E != com.github.nkzawa.engineio.client.ReadyState.a && socket.E != com.github.nkzawa.engineio.client.ReadyState.b)
        {
            break MISSING_BLOCK_LABEL_427;
        }
        f.fine(String.format("socket received: type '%s', data '%s'", new Object[] {
            b1.a, b1.b
        }));
        socket.a("packet", new Object[] {
            b1
        });
        socket.a("heartbeat", new Object[0]);
        if (!"open".equals(b1.a)) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        b1 = new com.github.nkzawa.engineio.client.a((String)b1.b);
        socket.a("handshake", new Object[] {
            b1
        });
        socket.c = ((com.github.nkzawa.engineio.client.a) (b1)).a;
        socket.e.e.put("sid", ((com.github.nkzawa.engineio.client.a) (b1)).a);
        Object obj = Arrays.asList(((com.github.nkzawa.engineio.client.a) (b1)).b);
        arraylist = new ArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s1 = (String)((Iterator) (obj)).next();
            if (socket.w.contains(s1))
            {
                arraylist.add(s1);
            }
        } while (true);
          goto _L3
        b1;
        socket.a("error", new Object[] {
            new EngineIOException(b1)
        });
_L5:
        return;
_L3:
        socket.x = arraylist;
        socket.r = ((com.github.nkzawa.engineio.client.a) (b1)).c;
        socket.s = ((com.github.nkzawa.engineio.client.a) (b1)).d;
        socket.e();
        if (ReadyState.d == socket.E) goto _L5; else goto _L4
_L4:
        socket.f();
        socket.c("heartbeat", socket.G);
        socket.a("heartbeat", socket.G);
        return;
_L2:
        if ("pong".equals(b1.a))
        {
            socket.f();
            return;
        }
        if ("error".equals(b1.a))
        {
            EngineIOException engineioexception = new EngineIOException("server error");
            engineioexception.b = b1.b;
            socket.a("error", new Object[] {
                engineioexception
            });
            return;
        }
        if (!"message".equals(b1.a)) goto _L5; else goto _L6
_L6:
        socket.a("data", new Object[] {
            b1.b
        });
        socket.a("message", new Object[] {
            b1.b
        });
        return;
        f.fine(String.format("packet received with socket readyState '%s'", new Object[] {
            socket.E
        }));
        return;
    }

    static void a(Socket socket, Exception exception)
    {
        f.fine(String.format("socket error %s", new Object[] {
            exception
        }));
        h = false;
        socket.a("error", new Object[] {
            exception
        });
        socket.a("transport error", exception);
    }

    static void a(Socket socket, String s1, String s2, Runnable runnable)
    {
        socket.a(new com.github.nkzawa.engineio.parser.b(s1, s2), runnable);
    }

    static void a(Socket socket, String s1, byte abyte0[], Runnable runnable)
    {
        socket.a(new com.github.nkzawa.engineio.parser.b(s1, abyte0), runnable);
    }

    private void a(com.github.nkzawa.engineio.parser.b b1, Runnable runnable)
    {
        if (com.github.nkzawa.engineio.client.ReadyState.c == E || ReadyState.d == E)
        {
            return;
        }
        Runnable runnable1 = runnable;
        if (runnable == null)
        {
            runnable1 = g;
        }
        a("packetCreate", new Object[] {
            b1
        });
        d.offer(b1);
        z.offer(runnable1);
        g();
    }

    private void a(String s1, Exception exception)
    {
        if (com.github.nkzawa.engineio.client.ReadyState.a == E || com.github.nkzawa.engineio.client.ReadyState.b == E || com.github.nkzawa.engineio.client.ReadyState.c == E)
        {
            f.fine(String.format("socket close with reason: %s", new Object[] {
                s1
            }));
            if (B != null)
            {
                B.cancel(false);
            }
            if (A != null)
            {
                A.cancel(false);
            }
            if (F != null)
            {
                F.shutdown();
            }
            com.github.nkzawa.f.a.b(new Runnable(this) {

                final Socket a;
                final Socket b;

                public final void run()
                {
                    a.d.clear();
                    Socket.h(a).clear();
                    Socket.i(a);
                }

            
            {
                b = Socket.this;
                a = socket1;
                super();
            }
            });
            ((com.github.nkzawa.b.a) (e)).a.remove("close");
            e.c();
            e.a();
            E = ReadyState.d;
            c = null;
            a("close", new Object[] {
                s1, exception
            });
        }
    }

    static boolean a(Socket socket)
    {
        return socket.o;
    }

    static boolean a(Socket socket, boolean flag)
    {
        socket.n = flag;
        return flag;
    }

    static boolean a(boolean flag)
    {
        h = flag;
        return flag;
    }

    static List b(Socket socket)
    {
        return socket.w;
    }

    static void b(Socket socket, String s1)
    {
        socket.a(s1, ((Exception) (null)));
    }

    static void c(Socket socket)
    {
        for (int i1 = 0; i1 < socket.q; i1++)
        {
            Runnable runnable = (Runnable)socket.z.get(i1);
            if (runnable != null)
            {
                runnable.run();
            }
        }

        for (int j1 = 0; j1 < socket.q; j1++)
        {
            socket.d.poll();
            socket.z.poll();
        }

        socket.q = 0;
        if (socket.d.size() == 0)
        {
            socket.a("drain", new Object[0]);
            return;
        } else
        {
            socket.g();
            return;
        }
    }

    static void c(Socket socket, String s1)
    {
        socket.a(new com.github.nkzawa.engineio.parser.b(s1), ((Runnable) (null)));
    }

    static boolean c()
    {
        return h;
    }

    static ReadyState d(Socket socket)
    {
        return socket.E;
    }

    static Logger d()
    {
        return f;
    }

    private void e()
    {
        f.fine("socket open");
        E = com.github.nkzawa.engineio.client.ReadyState.b;
        h = "websocket".equals(e.d);
        a("open", new Object[0]);
        g();
        if (E == com.github.nkzawa.engineio.client.ReadyState.b && l && (e instanceof com.github.nkzawa.engineio.client.a.a))
        {
            f.fine("starting upgrade probes");
            Transport atransport[];
            for (Iterator iterator = x.iterator(); iterator.hasNext(); atransport[0].b())
            {
                Object obj = (String)iterator.next();
                f.fine(String.format("probing transport '%s'", new Object[] {
                    obj
                }));
                atransport = new Transport[1];
                atransport[0] = a(((String) (obj)));
                boolean aflag[] = new boolean[1];
                aflag[0] = false;
                h = false;
                Runnable arunnable[] = new Runnable[1];
                com.github.nkzawa.b.a.a a1 = new com.github.nkzawa.b.a.a(aflag, ((String) (obj)), atransport, this, arunnable) {

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
                            aobj = new com.github.nkzawa.engineio.parser.b("ping", "probe");
                            c[0].a(new com.github.nkzawa.engineio.parser.b[] {
                                aobj
                            });
                            c[0].b("packet", new com.github.nkzawa.b.a.a(this) {

                                final _cls19 a;

                                public final transient void a(Object aobj[])
                                {
                                    if (!a.a[0])
                                    {
                                        aobj = (com.github.nkzawa.engineio.parser.b)aobj[0];
                                        if ("pong".equals(((com.github.nkzawa.engineio.parser.b) (aobj)).a) && "probe".equals(((com.github.nkzawa.engineio.parser.b) (aobj)).b))
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
                                                com.github.nkzawa.f.a.a(new com.github.nkzawa.engineio.client.a.a._cls1((com.github.nkzawa.engineio.client.a.a)a.d.e, new Runnable(this) {

                                                    final _cls1 a;

                                                    public final void run()
                                                    {
                                                        while (a.a.a[0] || ReadyState.d == Socket.d(a.a.d)) 
                                                        {
                                                            return;
                                                        }
                                                        Socket.d().fine("changing transport and sending upgrade packet");
                                                        a.a.e[0].run();
                                                        com.github.nkzawa.engineio.client.Socket.a(a.a.d, a.a.c[0]);
                                                        com.github.nkzawa.engineio.parser.b b1 = new com.github.nkzawa.engineio.parser.b("upgrade");
                                                        a.a.c[0].a(new com.github.nkzawa.engineio.parser.b[] {
                                                            b1
                                                        });
                                                        a.a.d.a("upgrade", new Object[] {
                                                            a.a.c[0]
                                                        });
                                                        a.a.c[0] = null;
                                                        com.github.nkzawa.engineio.client.Socket.a(a.a.d, false);
                                                        Socket.e(a.a.d);
                                                    }

            
            {
                a = _pcls1;
                super();
            }
                                                }));
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
                            });
                            return;
                        }
                    }

            
            {
                f = Socket.this;
                a = aflag;
                b = s1;
                c = atransport;
                d = socket1;
                e = arunnable;
                super();
            }
                };
                com.github.nkzawa.b.a.a a2 = new com.github.nkzawa.b.a.a(aflag, arunnable, atransport) {

                    final boolean a[];
                    final Runnable b[];
                    final Transport c[];
                    final Socket d;

                    public final transient void a(Object aobj[])
                    {
                        if (a[0])
                        {
                            return;
                        } else
                        {
                            a[0] = true;
                            b[0].run();
                            c[0].c();
                            c[0] = null;
                            return;
                        }
                    }

            
            {
                d = Socket.this;
                a = aflag;
                b = arunnable;
                c = atransport;
                super();
            }
                };
                obj = new com.github.nkzawa.b.a.a(atransport, a2, ((String) (obj)), this) {

                    final Transport a[];
                    final com.github.nkzawa.b.a.a b;
                    final String c;
                    final Socket d;
                    final Socket e;

                    public final transient void a(Object aobj[])
                    {
                        Object obj1 = aobj[0];
                        if (obj1 instanceof Exception)
                        {
                            aobj = new EngineIOException("probe error", (Exception)obj1);
                        } else
                        if (obj1 instanceof String)
                        {
                            aobj = new EngineIOException((new StringBuilder("probe error: ")).append((String)obj1).toString());
                        } else
                        {
                            aobj = new EngineIOException("probe error");
                        }
                        aobj.a = a[0].d;
                        b.a(new Object[0]);
                        Socket.d().fine(String.format("probe transport \"%s\" failed because of error: %s", new Object[] {
                            c, obj1
                        }));
                        d.a("upgradeError", new Object[] {
                            aobj
                        });
                    }

            
            {
                e = Socket.this;
                a = atransport;
                b = a1;
                c = s1;
                d = socket1;
                super();
            }
                };
                com.github.nkzawa.b.a.a a3 = new com.github.nkzawa.b.a.a(((com.github.nkzawa.b.a.a) (obj))) {

                    final com.github.nkzawa.b.a.a a;
                    final Socket b;

                    public final transient void a(Object aobj[])
                    {
                        a.a(new Object[] {
                            "transport closed"
                        });
                    }

            
            {
                b = Socket.this;
                a = a1;
                super();
            }
                };
                com.github.nkzawa.b.a.a a4 = new com.github.nkzawa.b.a.a(((com.github.nkzawa.b.a.a) (obj))) {

                    final com.github.nkzawa.b.a.a a;
                    final Socket b;

                    public final transient void a(Object aobj[])
                    {
                        a.a(new Object[] {
                            "socket closed"
                        });
                    }

            
            {
                b = Socket.this;
                a = a1;
                super();
            }
                };
                a2 = new com.github.nkzawa.b.a.a(atransport, a2) {

                    final Transport a[];
                    final com.github.nkzawa.b.a.a b;
                    final Socket c;

                    public final transient void a(Object aobj[])
                    {
                        aobj = (Transport)aobj[0];
                        if (a[0] != null && !((Transport) (aobj)).d.equals(a[0].d))
                        {
                            Socket.d().fine(String.format("'%s' works - aborting '%s'", new Object[] {
                                ((Transport) (aobj)).d, a[0].d
                            }));
                            b.a(new Object[0]);
                        }
                    }

            
            {
                c = Socket.this;
                a = atransport;
                b = a1;
                super();
            }
                };
                arunnable[0] = new Runnable(atransport, a1, ((com.github.nkzawa.b.a.a) (obj)), a3, this, a4, a2) {

                    final Transport a[];
                    final com.github.nkzawa.b.a.a b;
                    final com.github.nkzawa.b.a.a c;
                    final com.github.nkzawa.b.a.a d;
                    final Socket e;
                    final com.github.nkzawa.b.a.a f;
                    final com.github.nkzawa.b.a.a g;
                    final Socket h;

                    public final void run()
                    {
                        a[0].c("open", b);
                        a[0].c("error", c);
                        a[0].c("close", d);
                        e.c("close", f);
                        e.c("upgrading", g);
                    }

            
            {
                h = Socket.this;
                a = atransport;
                b = a1;
                c = a2;
                d = a3;
                e = socket1;
                f = a4;
                g = a5;
                super();
            }
                };
                atransport[0].b("open", a1);
                atransport[0].b("error", ((com.github.nkzawa.b.a.a) (obj)));
                atransport[0].b("close", a3);
                b("close", a4);
                b("upgrading", a2);
            }

        }
    }

    static void e(Socket socket)
    {
        socket.g();
    }

    static long f(Socket socket)
    {
        return socket.s;
    }

    private void f()
    {
        if (B != null)
        {
            B.cancel(false);
        }
        B = h().schedule(new Runnable(this) {

            final Socket a;
            final Socket b;

            public final void run()
            {
                com.github.nkzawa.f.a.a(new Runnable(this) {

                    final _cls8 a;

                    public final void run()
                    {
                        Socket.d().fine(String.format("writing ping packet - expecting pong within %sms", new Object[] {
                            Long.valueOf(Socket.f(a.a))
                        }));
                        com.github.nkzawa.f.a.a(a.a. new Runnable() {

                            final Socket a;

                            public final void run()
                            {
                                com.github.nkzawa.engineio.client.Socket.c(a, "ping");
                            }

            
            {
                a = Socket.this;
                super();
            }
                        });
                        com.github.nkzawa.engineio.client.Socket.a(a.a, Socket.f(a.a));
                    }

            
            {
                a = _pcls8;
                super();
            }
                });
            }

            
            {
                b = Socket.this;
                a = socket1;
                super();
            }
        }, r, TimeUnit.MILLISECONDS);
    }

    private void g()
    {
        if (E != ReadyState.d && e.c && !n && d.size() != 0)
        {
            f.fine(String.format("flushing %d packets in socket", new Object[] {
                Integer.valueOf(d.size())
            }));
            q = d.size();
            e.a((com.github.nkzawa.engineio.parser.b[])d.toArray(new com.github.nkzawa.engineio.parser.b[d.size()]));
            a("flush", new Object[0]);
        }
    }

    static boolean g(Socket socket)
    {
        return socket.n;
    }

    static LinkedList h(Socket socket)
    {
        return socket.z;
    }

    private ScheduledExecutorService h()
    {
        if (F == null || F.isShutdown())
        {
            F = Executors.newSingleThreadScheduledExecutor();
        }
        return F;
    }

    static int i(Socket socket)
    {
        socket.q = 0;
        return 0;
    }

    public final Socket b()
    {
        com.github.nkzawa.f.a.a(new Runnable() {

            final Socket a;

            public final void run()
            {
                Runnable runnable;
                Object obj;
label0:
                {
                    if (Socket.d(a) == com.github.nkzawa.engineio.client.ReadyState.a || Socket.d(a) == com.github.nkzawa.engineio.client.ReadyState.b)
                    {
                        com.github.nkzawa.engineio.client.Socket.a(a, com.github.nkzawa.engineio.client.ReadyState.c);
                        obj = a;
                        runnable = new Runnable(this, ((Socket) (obj))) {

                            final Socket a;
                            final _cls13 b;

                            public final void run()
                            {
                                com.github.nkzawa.engineio.client.Socket.b(a, "forced close");
                                Socket.d().fine("socket closing - telling transport to close");
                                a.e.c();
                            }

            
            {
                b = _pcls13;
                a = socket;
                super();
            }
                        };
                        com.github.nkzawa.b.a.a aa[] = new com.github.nkzawa.b.a.a[1];
                        aa[0] = new com.github.nkzawa.b.a.a(this, ((Socket) (obj)), aa, runnable) {

                            final Socket a;
                            final com.github.nkzawa.b.a.a b[];
                            final Runnable c;
                            final _cls13 d;

                            public final transient void a(Object aobj[])
                            {
                                a.c("upgrade", b[0]);
                                a.c("upgradeError", b[0]);
                                c.run();
                            }

            
            {
                d = _pcls13;
                a = socket;
                b = aa;
                c = runnable;
                super();
            }
                        };
                        obj = new Runnable(this, ((Socket) (obj)), aa) {

                            final Socket a;
                            final com.github.nkzawa.b.a.a b[];
                            final _cls13 c;

                            public final void run()
                            {
                                a.b("upgrade", b[0]);
                                a.b("upgradeError", b[0]);
                            }

            
            {
                c = _pcls13;
                a = socket;
                b = aa;
                super();
            }
                        };
                        if (a.d.size() <= 0)
                        {
                            break label0;
                        }
                        a.b("drain", new com.github.nkzawa.b.a.a(this, ((Runnable) (obj)), runnable) {

                            final Runnable a;
                            final Runnable b;
                            final _cls13 c;

                            public final transient void a(Object aobj[])
                            {
                                if (Socket.g(c.a))
                                {
                                    a.run();
                                    return;
                                } else
                                {
                                    b.run();
                                    return;
                                }
                            }

            
            {
                c = _pcls13;
                a = runnable;
                b = runnable1;
                super();
            }
                        });
                    }
                    return;
                }
                if (Socket.g(a))
                {
                    ((Runnable) (obj)).run();
                    return;
                } else
                {
                    runnable.run();
                    return;
                }
            }

            
            {
                a = Socket.this;
                super();
            }
        });
        return this;
    }


    // Unreferenced inner class com/github/nkzawa/engineio/client/Socket$10

/* anonymous class */
    public final class _cls10
        implements Runnable
    {

        final String a;
        final Runnable b = null;
        final Socket c;

        public final void run()
        {
            com.github.nkzawa.engineio.client.Socket.a(c, "message", a, b);
        }

            public 
            {
                c = Socket.this;
                a = s1;
                super();
            }
    }


    // Unreferenced inner class com/github/nkzawa/engineio/client/Socket$11

/* anonymous class */
    public final class _cls11
        implements Runnable
    {

        final byte a[];
        final Runnable b = null;
        final Socket c;

        public final void run()
        {
            com.github.nkzawa.engineio.client.Socket.a(c, "message", a, b);
        }

            public 
            {
                c = Socket.this;
                a = abyte0;
                super();
            }
    }


    // Unreferenced inner class com/github/nkzawa/engineio/client/Socket$12

/* anonymous class */
    public final class _cls12
        implements Runnable
    {

        final Socket a;

        public final void run()
        {
            Object obj;
            if (com.github.nkzawa.engineio.client.Socket.a(a) && com.github.nkzawa.engineio.client.Socket.c() && com.github.nkzawa.engineio.client.Socket.b(a).contains("websocket"))
            {
                obj = "websocket";
            } else
            {
                if (com.github.nkzawa.engineio.client.Socket.b(a).size() == 0)
                {
                    com.github.nkzawa.f.a.b(new Runnable(this, a) {

                        final Socket a;
                        final _cls12 b;

                        public final void run()
                        {
                            a.a("error", new Object[] {
                                new EngineIOException("No transports available")
                            });
                        }

            
            {
                b = _pcls12;
                a = socket;
                super();
            }
                    });
                    return;
                }
                obj = (String)com.github.nkzawa.engineio.client.Socket.b(a).get(0);
            }
            com.github.nkzawa.engineio.client.Socket.a(a, com.github.nkzawa.engineio.client.ReadyState.a);
            obj = com.github.nkzawa.engineio.client.Socket.a(a, ((String) (obj)));
            com.github.nkzawa.engineio.client.Socket.a(a, ((Transport) (obj)));
            ((Transport) (obj)).b();
        }

            public 
            {
                a = Socket.this;
                super();
            }
    }

}
