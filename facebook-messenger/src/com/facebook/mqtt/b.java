// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.facebook.analytics.cj;
import com.facebook.common.m.d;
import com.facebook.common.time.a;
import com.facebook.mqtt.a.f;
import com.facebook.mqtt.messages.c;
import com.facebook.mqtt.messages.e;
import com.facebook.mqtt.messages.g;
import com.facebook.mqtt.messages.h;
import com.facebook.mqtt.messages.i;
import com.facebook.mqtt.messages.j;
import com.facebook.mqtt.messages.k;
import com.facebook.mqtt.messages.l;
import com.facebook.mqtt.messages.m;
import com.facebook.mqtt.messages.n;
import com.facebook.mqtt.messages.o;
import com.facebook.mqtt.messages.r;
import com.facebook.mqtt.messages.s;
import com.facebook.mqtt.messages.v;
import com.facebook.mqtt.messages.w;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.base.Optional;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.SocketFactory;

// Referenced classes of package com.facebook.mqtt:
//            k, n, y, w, 
//            i, o, m, l, 
//            a, j, x, t, 
//            u, v, f, d, 
//            c, e, g, h

public class b
{

    private static final Class a = com/facebook/mqtt/b;
    private static final EnumSet b;
    private final ConnectivityManager c;
    private final y d;
    private final cj e;
    private final com.facebook.k.a f;
    private final com.facebook.mqtt.w g;
    private final a h;
    private long i;
    private long j;
    private long k;
    private long l;
    private long m;
    private long n;
    private Socket o;
    private com.facebook.mqtt.a.a p;
    private f q;
    private Thread r;
    private AtomicInteger s;
    private volatile com.facebook.mqtt.n t;
    private volatile com.facebook.mqtt.o u;
    private com.google.common.b.d v;
    private com.google.common.b.e w;

    public b(ConnectivityManager connectivitymanager, y y1, cj cj1, com.facebook.k.a a1, com.facebook.mqtt.w w1, a a2)
    {
        k = 0x7fffffffffffffffL;
        l = 0x7fffffffffffffffL;
        m = 0x7fffffffffffffffL;
        n = 0x7fffffffffffffffL;
        s = new AtomicInteger(1);
        t = n.INIT;
        c = connectivitymanager;
        d = y1;
        e = cj1;
        f = a1;
        g = w1;
        h = a2;
    }

    private Socket a(boolean flag)
    {
        if (flag)
        {
            return d.a().createSocket();
        } else
        {
            return new Socket();
        }
    }

    private Socket a(boolean flag, InetAddress inetaddress, int i1)
    {
        long l1 = h.a();
        Object obj = a(flag);
        com.facebook.debug.log.b.b(a, "Connecting on port %d", new Object[] {
            Integer.valueOf(i1)
        });
        ((Socket) (obj)).connect(new InetSocketAddress(inetaddress, i1), g.i() * 1000);
        ((Socket) (obj)).setTcpNoDelay(true);
        ((Socket) (obj)).setSoTimeout(0);
        ((Socket) (obj)).setKeepAlive(false);
        e.a(h.a() - l1, i1, Optional.fromNullable(null));
        return ((Socket) (obj));
        obj;
        inetaddress = null;
_L2:
        a(((Socket) (inetaddress)));
        e.a(h.a() - l1, i1, Optional.fromNullable(obj));
        return null;
        inetaddress;
        e.a(h.a() - l1, i1, Optional.fromNullable(null));
        throw inetaddress;
        IOException ioexception;
        ioexception;
        inetaddress = ((InetAddress) (obj));
        obj = ioexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void a(int i1)
    {
        com.facebook.debug.log.b.c(a, "Acknowledging %d", new Object[] {
            Integer.valueOf(i1)
        });
        (new com.facebook.common.a.a(new com.facebook.mqtt.i(this, i1))).a();
    }

    private void a(f f1)
    {
        a(f1, new l(com.facebook.mqtt.messages.h.newBuilder().a(k.PINGREQ).b(0).f(), null, null));
    }

    private void a(f f1, int i1)
    {
        a(f1, ((l) (new m(com.facebook.mqtt.messages.h.newBuilder().a(k.PUBACK).f(), new j(i1)))));
        if (u != null)
        {
            u.b(i1);
        }
    }

    private void a(f f1, l l1)
    {
        f1.a(l1);
        m = h.a();
        f.a();
    }

    private void a(f f1, com.facebook.mqtt.w w1)
    {
        com.facebook.debug.log.b.c(a, "Sending connect message with keepalive interval at %d seconds", new Object[] {
            Integer.valueOf(w1.g())
        });
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("uid", w1.d());
        objectnode.put("agent", w1.f());
        objectnode.put("capabilities", n());
        objectnode.putAll(w1.k());
        com.facebook.debug.log.b.a(a, "Connecting with %s", new Object[] {
            objectnode
        });
        a(f1, ((l) (new c(com.facebook.mqtt.messages.h.newBuilder().a(k.CONNECT).f(), (new g()).a(3).a(true).b(true).c(w1.g()).e(w1.b()).i(), (new e()).a(w1.c()).d(objectnode.toString()).e(w1.e()).f()))));
    }

    private void a(f f1, String s1, byte abyte0[], int i1, int j1)
    {
        a(f1, ((l) (new n(com.facebook.mqtt.messages.h.newBuilder().a(k.PUBLISH).a(i1).f(), new o(s1, j1), abyte0))));
        if (u != null)
        {
            u.b(j1);
        }
    }

    private void a(f f1, List list, int i1)
    {
        a(f1, ((l) (new r(com.facebook.mqtt.messages.h.newBuilder().a(k.SUBSCRIBE).f(), new j(i1), new s(list)))));
        if (u != null)
        {
            u.b(i1);
        }
    }

    static void a(b b1)
    {
        b1.h();
    }

    static void a(b b1, int i1)
    {
        b1.b(i1);
    }

    static void a(b b1, com.facebook.mqtt.m m1, Throwable throwable)
    {
        b1.a(m1, throwable);
    }

    static void a(b b1, String s1, byte abyte0[], int i1, boolean flag, int j1)
    {
        b1.a(s1, abyte0, i1, flag, j1);
    }

    static void a(b b1, List list, int i1)
    {
        b1.a(list, i1);
    }

    private void a(com.facebook.mqtt.m m1, Throwable throwable)
    {
        com.facebook.debug.log.b.c(a, "Disconnecting %s", new Object[] {
            m1
        });
        this;
        JVM INSTR monitorenter ;
        if (t == n.CONNECTED || t == n.CONNECTING)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Socket socket;
        com.facebook.mqtt.o o1;
        socket = o;
        o1 = u;
        o = null;
        v = null;
        w = null;
        r = null;
        p = null;
        q = null;
        t = n.DISCONNECTED;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        a(socket);
        if (o1 != null)
        {
            o1.a(m1.toString());
        }
        if (throwable != null)
        {
            e.a(b(k), b(l), b(m), b(n), Optional.of(m1.toString()), Optional.of(throwable));
        }
        k = 0x7fffffffffffffffL;
        l = 0x7fffffffffffffffL;
        m = 0x7fffffffffffffffL;
        n = 0x7fffffffffffffffL;
        return;
        m1;
        this;
        JVM INSTR monitorexit ;
        throw m1;
    }

    private void a(String s1, byte abyte0[], int i1, boolean flag, int j1)
    {
        l();
        if (!b())
        {
            return;
        }
        try
        {
            a(q, s1, abyte0, i1, j1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.facebook.debug.log.b.d(a, "Caught exception trying to publish", s1);
        }
        a(m.PUBLISH, ((Throwable) (s1)));
        return;
    }

    private void a(Socket socket)
    {
        if (socket == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        socket.close();
        return;
        socket;
    }

    private void a(List list, int i1)
    {
        l();
        if (!b())
        {
            return;
        }
        try
        {
            a(q, list, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            com.facebook.debug.log.b.d(a, "Caught exception trying to subscribe", list);
        }
        a(m.SUBSCRIBE, ((Throwable) (list)));
        return;
    }

    private Optional b(long l1)
    {
        long l2 = h.a();
        if (l1 > l2)
        {
            return Optional.absent();
        } else
        {
            return Optional.of(Integer.valueOf((int)((l2 - k) / 1000L)));
        }
    }

    private void b(int i1)
    {
        try
        {
            if (!b())
            {
                return;
            }
        }
        catch (Throwable throwable)
        {
            com.facebook.debug.log.b.d(a, "Caught exception trying to send PUBACK", throwable);
            a(m.PUBACK, throwable);
            return;
        }
        a(q, i1);
        e.a("mqtt_acknowledged_delivery_sent", i1);
        return;
    }

    private void b(f f1, List list, int i1)
    {
        a(f1, new v(com.facebook.mqtt.messages.h.newBuilder().a(k.UNSUBSCRIBE).f(), new j(i1), new w(list)));
        if (u != null)
        {
            u.b(i1);
        }
    }

    static void b(b b1)
    {
        b1.k();
    }

    static void b(b b1, List list, int i1)
    {
        b1.b(list, i1);
    }

    private void b(List list, int i1)
    {
        l();
        if (!b())
        {
            return;
        }
        try
        {
            b(q, list, i1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            com.facebook.debug.log.b.d(a, "Caught exception trying to unsubscribe", list);
        }
        a(m.UNSUBSCRIBE, list);
        return;
    }

    private void h()
    {
        long l2 = h.a();
        com.facebook.mqtt.l l1 = i();
        cj cj1 = e;
        boolean flag = l1.a;
        long l3 = h.a();
        Optional optional;
        if (l1.b.isPresent())
        {
            optional = Optional.of(l1.b.toString());
        } else
        {
            optional = Optional.absent();
        }
        cj1.a(flag, l3 - l2, optional, l1.c, l1.d);
        if (l1.a)
        {
            k = h.a();
        }
        if (u != null)
        {
            if (l1.a)
            {
                u.a();
            } else
            {
                t = n.DISCONNECTED;
                u.a((com.facebook.mqtt.a)l1.b.get());
            }
        }
_L6:
        this;
        JVM INSTR monitorenter ;
        if (t == n.CONNECTED) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
_L7:
        t = n.DISCONNECTED;
        com.facebook.debug.log.b.c(a, "MQTT network thread exiting");
        return;
_L2:
        Object obj = p;
        this;
        JVM INSTR monitorexit ;
        obj = ((com.facebook.mqtt.a.a) (obj)).a();
        com.facebook.mqtt.o o1;
        k k1;
        o1 = u;
        k1 = ((l) (obj)).e();
        com.facebook.mqtt.j.a[k1.ordinal()];
        JVM INSTR tableswitch 1 2: default 240
    //                   1 328
    //                   2 461;
           goto _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_461;
_L3:
        com.facebook.debug.log.b.a(a, "MQTT Packet received: %s", new Object[] {
            k1
        });
_L8:
        n = h.a();
        if (o1 != null)
        {
            o1.a(((l) (obj)));
            f.a();
        }
          goto _L6
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        if (t != n.DISCONNECTED)
        {
            com.facebook.debug.log.b.d(a, "Error in network loop: ", ((Throwable) (obj)));
            a(m.NETWORK_THREAD_LOOP, ((Throwable) (obj)));
        }
          goto _L7
_L4:
        n n1 = (n)obj;
        String s1 = n1.a().a();
        int i1 = n1.a().b();
        int j1 = n1.f().c();
        com.facebook.debug.log.b.a(a, "MQTT Packet received: %s id:%d qos:%d topic:%s", new Object[] {
            k1, Integer.valueOf(i1), Integer.valueOf(j1), s1
        });
        if (o1 != null)
        {
            o1.a(s1, n1.c(), j1, n1.f().d());
        }
        if (j1 == x.ACKNOWLEDGED_DELIVERY.getValue())
        {
            a(i1);
            e.a("mqtt_acknowledged_delivery_recv", i1);
        }
          goto _L8
        m m1 = (m)obj;
        com.facebook.debug.log.b.a(a, "MQTT Packet received: %s id:%d", new Object[] {
            k1, Integer.valueOf(m1.a().a())
        });
        if (o1 != null)
        {
            o1.a(m1.a().a());
        }
          goto _L8
    }

    private com.facebook.mqtt.l i()
    {
        Object obj;
        Object obj1 = null;
        com.facebook.debug.log.b.c(a, "Connecting");
        t t1 = g.a();
        long l2 = h.a();
        InetAddress inetaddress;
        int i1;
        int j1;
        try
        {
            inetaddress = com.facebook.common.m.a.a(t1.a(), (long)g.j() * 1000L);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.facebook.debug.log.b.d(a, (new StringBuilder()).append("DNS Unresolved ").append(((d) (obj)).a()).toString(), ((Throwable) (obj)));
            return new com.facebook.mqtt.l(this, a.FAILED_DNS_UNRESOLVED, ((Exception) (obj)));
        }
        e.a("mqtt_dns_lookup_duration", h.a() - l2);
        i1 = t1.c();
        j1 = t1.b();
        obj = obj1;
        if (j())
        {
            obj = obj1;
            if (j1 != i1)
            {
                obj = obj1;
                if (i1 > 0)
                {
                    obj = a(t1.d(), inetaddress, i1);
                }
            }
        }
        if (obj == null)
        {
            obj = a(t1.d(), inetaddress, j1);
        }
        if (obj == null)
        {
            com.facebook.debug.log.b.d(a, "Socket Connection Failed.");
            return new com.facebook.mqtt.l(this, a.FAILED_SOCKET_CONNECT_ERROR);
        }
        Object obj2;
        f f1;
        obj2 = new com.facebook.mqtt.a.a(new com.facebook.mqtt.a.h());
        f1 = new f();
        com.google.common.b.d d1;
        com.google.common.b.e e1;
        d1 = new com.google.common.b.d(((Socket) (obj)).getInputStream());
        ((com.facebook.mqtt.a.a) (obj2)).a(new DataInputStream(d1));
        e1 = new com.google.common.b.e(((Socket) (obj)).getOutputStream());
        f1.a(new DataOutputStream(e1));
        long l3 = h.a();
        l l1;
        a(f1, g);
        l1 = ((com.facebook.mqtt.a.a) (obj2)).a();
        if (l1.e() == k.CONNACK)
        {
            break MISSING_BLOCK_LABEL_633;
        }
        com.facebook.debug.log.b.d(a, (new StringBuilder()).append("Received unexpected message type ").append(l1.e()).toString());
        obj2 = new com.facebook.mqtt.l(this, a.FAILED_INVALID_CONACK);
        com.facebook.debug.log.b.c(a, "Cleaning up connection failure.");
        a(((Socket) (obj)));
        this;
        JVM INSTR monitorenter ;
        o = null;
        q = null;
        p = null;
        j = 0L;
        v = null;
        i = 0L;
        w = null;
        t = n.DISCONNECTED;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return ((com.facebook.mqtt.l) (obj2));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj2;
        com.facebook.debug.log.b.d(a, "Failed to create IO stream", ((Throwable) (obj2)));
        obj2 = new com.facebook.mqtt.l(this, a.FAILED_CREATE_IOSTREAM, ((Exception) (obj2)));
        com.facebook.debug.log.b.c(a, "Cleaning up connection failure.");
        a(((Socket) (obj)));
        this;
        JVM INSTR monitorenter ;
        o = null;
        q = null;
        p = null;
        j = 0L;
        v = null;
        i = 0L;
        w = null;
        t = n.DISCONNECTED;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return ((com.facebook.mqtt.l) (obj2));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj2;
        com.facebook.debug.log.b.d(a, "Failed to send connect message", ((Throwable) (obj2)));
        obj2 = new com.facebook.mqtt.l(this, a.FAILED_CONNECT_MESSAGE, ((Exception) (obj2)));
        com.facebook.debug.log.b.c(a, "Cleaning up connection failure.");
        a(((Socket) (obj)));
        this;
        JVM INSTR monitorenter ;
        o = null;
        q = null;
        p = null;
        j = 0L;
        v = null;
        i = 0L;
        w = null;
        t = n.DISCONNECTED;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return ((com.facebook.mqtt.l) (obj2));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        byte byte0;
        e.b(k.CONNECT.toString(), h.a() - l3);
        byte0 = ((com.facebook.mqtt.messages.a)l1).a().a();
        if (byte0 == 0)
        {
            break MISSING_BLOCK_LABEL_784;
        }
        com.facebook.debug.log.b.d(a, (new StringBuilder()).append("MQTT Connection refused: ").append(byte0).toString());
        obj2 = new com.facebook.mqtt.l(this, a.FAILED_CONNECTION_REFUSED, byte0);
        com.facebook.debug.log.b.c(a, "Cleaning up connection failure.");
        a(((Socket) (obj)));
        this;
        JVM INSTR monitorenter ;
        o = null;
        q = null;
        p = null;
        j = 0L;
        v = null;
        i = 0L;
        w = null;
        t = n.DISCONNECTED;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return ((com.facebook.mqtt.l) (obj2));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        this;
        JVM INSTR monitorenter ;
        if (t != n.DISCONNECTED)
        {
            break MISSING_BLOCK_LABEL_890;
        }
        com.facebook.debug.log.b.d(a, "Client is disconnected when setting up the connection");
        obj2 = new com.facebook.mqtt.l(this, a.FAILED_UNEXPECTED_DISCONNECT);
        this;
        JVM INSTR monitorexit ;
        com.facebook.debug.log.b.c(a, "Cleaning up connection failure.");
        a(((Socket) (obj)));
        this;
        JVM INSTR monitorenter ;
        o = null;
        q = null;
        p = null;
        j = 0L;
        v = null;
        i = 0L;
        w = null;
        t = n.DISCONNECTED;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return ((com.facebook.mqtt.l) (obj2));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        o = ((Socket) (obj));
        q = f1;
        p = ((com.facebook.mqtt.a.a) (obj2));
        j = 0L;
        v = d1;
        i = 0L;
        w = e1;
        t = n.CONNECTED;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return new com.facebook.mqtt.l(this);
        Exception exception1;
        exception1;
        this;
        JVM INSTR monitorexit ;
        throw exception1;
        exception1;
        com.facebook.debug.log.b.c(a, "Cleaning up connection failure.");
        a(((Socket) (obj)));
        this;
        JVM INSTR monitorenter ;
        o = null;
        q = null;
        p = null;
        j = 0L;
        v = null;
        i = 0L;
        w = null;
        t = n.DISCONNECTED;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean j()
    {
        NetworkInfo networkinfo = c.getActiveNetworkInfo();
        if (networkinfo != null)
        {
            return networkinfo.getType() == 1;
        } else
        {
            return false;
        }
    }

    private void k()
    {
        try
        {
            if (!c())
            {
                com.facebook.debug.log.b.c(a, "Client not connected, not sending PINGREQ.");
                return;
            }
        }
        catch (Throwable throwable)
        {
            com.facebook.debug.log.b.d(a, "Caught exception trying to send PINGREQ", throwable);
            a(m.PING, throwable);
            return;
        }
        a(q);
        l = h.a();
        return;
    }

    private void l()
    {
        a((long)g.h() * 1000L);
    }

    private int m()
    {
        return s.incrementAndGet() & 0xffff;
    }

    private long n()
    {
        Iterator iterator = b.iterator();
        long l1;
        for (l1 = 0L; iterator.hasNext(); l1 |= 1 << ((com.facebook.mqtt.k)iterator.next()).getPosition()) { }
        return l1;
    }

    public int a(String s1, byte abyte0[], x x1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!b())
        {
            throw new u(v.NOT_CONNECTED);
        }
        break MISSING_BLOCK_LABEL_25;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
        int i1;
        com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Publishing on topic ").append(s1).toString());
        i1 = m();
        (new com.facebook.common.a.a(new com.facebook.mqtt.f(this, s1, abyte0, x1, flag, i1))).a();
        this;
        JVM INSTR monitorexit ;
        return i1;
    }

    public int a(List list)
    {
        this;
        JVM INSTR monitorenter ;
        if (!b())
        {
            throw new u(v.NOT_CONNECTED);
        }
        break MISSING_BLOCK_LABEL_25;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        int i1;
        i1 = m();
        (new com.facebook.common.a.a(new com.facebook.mqtt.d(this, list, i1))).a();
        this;
        JVM INSTR monitorexit ;
        return i1;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (t != n.INIT)
        {
            throw new IllegalStateException("Tried to connect on used client");
        }
        break MISSING_BLOCK_LABEL_28;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        t = n.CONNECTING;
        r = new Thread(new com.facebook.mqtt.c(this), "MqttClient Network Thread");
        r.start();
        this;
        JVM INSTR monitorexit ;
    }

    public void a(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        while (t == n.CONNECTING) 
        {
            wait(l1);
        }
        break MISSING_BLOCK_LABEL_25;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public void a(com.facebook.mqtt.o o1)
    {
        u = o1;
    }

    public int b(List list)
    {
        this;
        JVM INSTR monitorenter ;
        if (!b())
        {
            throw new u(v.NOT_CONNECTED);
        }
        break MISSING_BLOCK_LABEL_25;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        int i1;
        i1 = m();
        (new com.facebook.common.a.a(new com.facebook.mqtt.e(this, list, i1))).a();
        this;
        JVM INSTR monitorexit ;
        return i1;
    }

    public boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        if (t == n.CONNECTING) goto _L2; else goto _L1
_L1:
        com.facebook.mqtt.n n1;
        com.facebook.mqtt.n n2;
        n1 = t;
        n2 = n.CONNECTED;
        if (n1 != n2) goto _L3; else goto _L2
_L2:
        boolean flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        com.facebook.mqtt.n n1;
        com.facebook.mqtt.n n2;
        n1 = t;
        n2 = n.CONNECTED;
        boolean flag;
        if (n1 == n2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        if (!c())
        {
            throw new u(v.NOT_CONNECTED);
        }
        break MISSING_BLOCK_LABEL_25;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        com.facebook.debug.log.b.c(a, "Sending ping request...");
        (new com.facebook.common.a.a(new com.facebook.mqtt.g(this))).a();
        this;
        JVM INSTR monitorexit ;
    }

    public void e()
    {
        this;
        JVM INSTR monitorenter ;
        if (b())
        {
            (new com.facebook.common.a.a(new com.facebook.mqtt.h(this))).a();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public long f()
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        if (w == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        l1 = i;
        i = w.a();
        l2 = i;
        return l2 - l1;
        this;
        JVM INSTR monitorexit ;
        return 0L;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public long g()
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        if (v == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        l1 = j;
        j = v.a();
        l2 = j;
        return l2 - l1;
        this;
        JVM INSTR monitorexit ;
        return 0L;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[MqttClient (");
        t t1 = g.a();
        stringbuilder.append(t1.a());
        stringbuilder.append(":");
        stringbuilder.append(t1.b());
        if (t1.d())
        {
            stringbuilder.append(" +ssl");
        }
        stringbuilder.append(") ");
        stringbuilder.append(t);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    static 
    {
        b = EnumSet.of(k.ACKNOWLEDGED_DELIVERY);
    }
}
