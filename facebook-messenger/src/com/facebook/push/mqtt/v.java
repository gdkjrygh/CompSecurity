// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.os.Handler;
import com.facebook.analytics.cj;
import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.facebook.mqtt.messages.SubscribeTopic;
import com.facebook.mqtt.messages.j;
import com.facebook.mqtt.messages.k;
import com.facebook.mqtt.messages.l;
import com.facebook.mqtt.u;
import com.facebook.mqtt.x;
import com.facebook.push.mqtt.abtest.a;
import com.facebook.push.mqtt.abtest.e;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ik;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.d.a.s;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.facebook.push.mqtt:
//            w, x, d, ap, 
//            z, ag, MqttPushService, y, 
//            ao, u, aa, bu

public class v
{

    private static final Class a = com/facebook/push/mqtt/v;
    private final com.facebook.analytics.a b;
    private final Handler c = new Handler();
    private final com.facebook.push.mqtt.u d;
    private final d e;
    private final ap f;
    private final a g;
    private final cj h;
    private final com.facebook.common.time.a i;
    private com.facebook.mqtt.b j;
    private MqttPushService k;
    private boolean l;
    private long m;
    private long n;
    private final Map o = ik.a();
    private final Runnable p = new w(this);
    private final Runnable q = new com.facebook.push.mqtt.x(this);
    private int r;
    private e s;

    public v(com.facebook.analytics.a a1, com.facebook.push.mqtt.u u1, d d1, ap ap1, a a2, cj cj1, com.facebook.common.time.a a3)
    {
        b = a1;
        d = u1;
        g = a2;
        h = cj1;
        i = a3;
        e = d1;
        e.a(q);
        f = ap1;
        s = g.a();
        r = 900;
    }

    private int a(boolean flag, boolean flag1)
    {
        if (s == null)
        {
            s = g.a();
        }
        int i1;
        if (flag)
        {
            i1 = s.i();
        } else
        if (flag1)
        {
            i1 = s.j();
        } else
        {
            i1 = s.k();
        }
        com.facebook.debug.log.b.b(a, "Asking keepalive cycle of %d seconds. isForeground:%b, isPersistent:%b", new Object[] {
            Integer.valueOf(i1), Boolean.valueOf(flag), Boolean.valueOf(flag1)
        });
        return i1;
    }

    private void a(com.facebook.mqtt.b b1)
    {
        if (b1 != null)
        {
            b.a("mqtt_bytes_sent", b1.f());
            b.a("mqtt_bytes_received", b1.g());
        }
    }

    private void a(l l1)
    {
        for (Optional optional = b(l1); !optional.isPresent() || f.a(((Integer)optional.get()).intValue()) || l1.e() != k.PUBACK;)
        {
            return;
        }

        h.a();
    }

    private void a(ag ag1)
    {
        com.facebook.mqtt.b b1 = j;
        if (b1 != null)
        {
            j = null;
            a(b1);
            b1.a(null);
            b1.e();
            n = System.currentTimeMillis();
        }
        a(ag1, ((String) (null)));
    }

    private void a(ag ag1, String s1)
    {
        com.facebook.debug.log.b.c(a, "Connection lost with reason %s", new Object[] {
            ag1
        });
        f.a(new u((new StringBuilder()).append("Connection lost ").append(ag1).toString(), null));
        com.facebook.push.mqtt.z.a[ag1.ordinal()];
        JVM INSTR tableswitch 1 2: default 80
    //                   1 104
    //                   2 115;
           goto _L1 _L2 _L3
_L1:
        com.facebook.debug.log.b.a(a, "No more reconnect attempt for %s", new Object[] {
            ag1
        });
_L5:
        k.c();
        return;
_L2:
        e.b();
        continue; /* Loop/switch isn't completed */
_L3:
        e.a();
        if (true) goto _L5; else goto _L4
_L4:
    }

    static void a(v v1)
    {
        v1.k();
    }

    static void a(v v1, l l1)
    {
        v1.a(l1);
    }

    static void a(v v1, ag ag1, String s1)
    {
        v1.a(ag1, s1);
    }

    static void a(v v1, es es1)
    {
        v1.a(es1);
    }

    private void a(es es1)
    {
        com.facebook.mqtt.b b1;
        com.facebook.debug.log.b.a(a, (new StringBuilder()).append("New topics: ").append(es1).toString());
        b1 = j;
        if (!c(b1) || es1.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        int i1 = b1.a(es1);
        f.a(b1, k.SUBACK, i1);
        return;
        u u1;
        u1;
        Class class1 = a;
        StringBuilder stringbuilder = (new StringBuilder()).append("MqttException: ");
        if (u1.getMessage() != null)
        {
            es1 = u1.getMessage();
        } else
        {
            es1 = "NULL";
        }
        com.facebook.debug.log.b.c(class1, stringbuilder.append(es1).toString(), u1);
        a(ag.CONNECTION_LOST);
        return;
    }

    private void a(Runnable runnable)
    {
        Semaphore semaphore = new Semaphore(0);
        c.post(new y(this, runnable, semaphore));
        semaphore.acquire();
    }

    static com.facebook.mqtt.b b(v v1)
    {
        return v1.j;
    }

    private Optional b(l l1)
    {
        Optional optional = Optional.absent();
        switch (com.facebook.push.mqtt.z.b[l1.e().ordinal()])
        {
        default:
            return optional;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return Optional.of(Integer.valueOf(((j)l1.b()).a()));

        case 4: // '\004'
            return Optional.of(Integer.valueOf(-1));
        }
    }

    private Optional b(String s1, byte abyte0[], x x1)
    {
        boolean flag = false;
        if (x1.getValue() < x.ASSURED_DELIVERY.getValue())
        {
            flag = true;
        }
        Preconditions.checkArgument(flag);
        com.facebook.mqtt.b b1 = j;
        if (b1 == null || !b1.b())
        {
            return Optional.absent();
        }
        try
        {
            int i1 = b1.a(s1, abyte0, x1, false);
            a(b1);
            if (x1 == x.ACKNOWLEDGED_DELIVERY)
            {
                s1 = f.a(b1, k.PUBACK, i1);
            } else
            {
                s1 = new ao(j, k.PUBACK, i1, 0L);
                s1.f();
            }
            return Optional.of(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.facebook.debug.log.b.c(a, "MqttException caught on publish.", s1);
        }
        a(ag.CONNECTION_LOST);
        return Optional.absent();
    }

    private boolean b(com.facebook.mqtt.b b1)
    {
        return b1 != null && b1.b();
    }

    static Map c(v v1)
    {
        return v1.o;
    }

    private boolean c(com.facebook.mqtt.b b1)
    {
        return b1 != null && b1.c();
    }

    static void d(v v1)
    {
        v1.j();
    }

    static Handler e(v v1)
    {
        return v1.c;
    }

    static MqttPushService f(v v1)
    {
        return v1.k;
    }

    static Class i()
    {
        return a;
    }

    private void j()
    {
        e.c();
        k.b();
        long l1 = (i.a() - e.e()) / 1000L;
        h.a(e.d(), (int)l1);
    }

    private void k()
    {
        if (j != null) goto _L2; else goto _L1
_L1:
        m();
_L4:
        com.facebook.debug.log.b.c(a, "kick called when connection exists: %s", new Object[] {
            Boolean.valueOf(j.b())
        });
        return;
_L2:
        if (!j.b())
        {
            l();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void l()
    {
        com.facebook.debug.log.b.c(a, "Reconnecting...");
        a(ag.BY_REQUEST);
        m();
    }

    private void m()
    {
        j = d.a(r);
        if (j == null)
        {
            return;
        } else
        {
            com.facebook.debug.log.b.a(a, (new StringBuilder()).append("Created mqtt client: ").append(j).toString());
            j.a(new aa(this, j));
            j.a();
            m = System.currentTimeMillis();
            return;
        }
    }

    private void n()
    {
        try
        {
            com.facebook.mqtt.b b1 = j;
            if (c(b1))
            {
                b1.d();
                f.a(b1, k.PINGRESP, -1);
                a(b1);
            }
            return;
        }
        catch (u u1)
        {
            Class class1 = a;
            StringBuilder stringbuilder = (new StringBuilder()).append("MqttException: ");
            String s1;
            if (u1.getMessage() != null)
            {
                s1 = u1.getMessage();
            } else
            {
                s1 = "NULL";
            }
            com.facebook.debug.log.b.e(class1, stringbuilder.append(s1).toString(), u1);
            a(ag.CONNECTION_LOST);
            return;
        }
    }

    public int a(String s1, JsonNode jsonnode, x x1)
    {
        return a(s1, com.facebook.common.w.n.c(jsonnode.toString()), x1);
    }

    public int a(String s1, byte abyte0[], x x1)
    {
        s1 = b(s1, abyte0, x1);
        if (!s1.isPresent())
        {
            return -1;
        } else
        {
            return ((ao)s1.get()).c();
        }
    }

    void a()
    {
        s = g.a();
        e.a();
    }

    void a(int i1)
    {
        com.facebook.debug.log.b.b(a, "Update keepalive interval to %d", new Object[] {
            Integer.valueOf(i1)
        });
        r = i1;
        k.a(i1);
    }

    void a(MqttPushService mqttpushservice)
    {
        k = mqttpushservice;
        mqttpushservice.a(r);
    }

    public void a(Collection collection)
    {
        et et1;
        com.facebook.debug.log.b.a(a, (new StringBuilder()).append("Subscribing to ").append(collection).toString());
        et1 = es.e();
        Map map = o;
        map;
        JVM INSTR monitorenter ;
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            SubscribeTopic subscribetopic = (SubscribeTopic)collection.next();
            String s1 = subscribetopic.a();
            if (!o.containsKey(s1))
            {
                o.put(s1, subscribetopic);
                et1.b(subscribetopic);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_114;
        collection;
        map;
        JVM INSTR monitorexit ;
        throw collection;
        map;
        JVM INSTR monitorexit ;
        a(et1.b());
        return;
    }

    public boolean a(long l1)
    {
        com.facebook.mqtt.b b1;
        boolean flag;
        try
        {
            b1 = j;
        }
        catch (InterruptedException interruptedexception)
        {
            com.facebook.debug.log.b.d(a, "Interrupted while waiting for connection establishment.");
            Thread.currentThread().interrupt();
            return false;
        }
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        if (b1.b())
        {
            break MISSING_BLOCK_LABEL_24;
        }
        a(p);
        b1 = j;
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        com.facebook.debug.log.b.e(a, "Failed to initialize client.");
        return false;
        if (b1.c())
        {
            return true;
        }
        b1.a(l1);
        flag = b1.c();
        return flag;
    }

    public boolean a(String s1, JsonNode jsonnode, long l1)
    {
        return a(s1, com.facebook.common.w.n.c(jsonnode.toString()), l1);
    }

    public boolean a(String s1, byte abyte0[], long l1)
    {
        com.facebook.debug.log.b.a(a, "publishAndWait");
        abyte0 = b(s1, abyte0, x.ACKNOWLEDGED_DELIVERY);
        if (!abyte0.isPresent())
        {
            return false;
        }
        try
        {
            ((ao)abyte0.get()).d().get(l1, TimeUnit.MILLISECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Publish failed for ").append(s1).toString(), abyte0.getCause());
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return false;
        }
        return true;
    }

    boolean a(boolean flag)
    {
        if (l == flag)
        {
            return false;
        } else
        {
            l = flag;
            return true;
        }
    }

    int b(boolean flag)
    {
        boolean flag1;
        if (k == null)
        {
            flag1 = false;
        } else
        {
            flag1 = k.d();
        }
        return a(flag, flag1);
    }

    void b()
    {
        e.c();
        a(ag.BY_REQUEST);
    }

    public void b(Collection collection)
    {
        et et1;
        boolean flag;
        flag = false;
        et1 = es.e();
        Map map = o;
        map;
        JVM INSTR monitorenter ;
        collection = collection.iterator();
_L1:
        String s1;
        do
        {
            if (!collection.hasNext())
            {
                break MISSING_BLOCK_LABEL_83;
            }
            s1 = ((SubscribeTopic)collection.next()).a();
        } while (!o.containsKey(s1));
        o.remove(s1);
        et1.b(s1);
        flag = true;
          goto _L1
        map;
        JVM INSTR monitorexit ;
        collection = j;
        if (!c(collection) || !flag)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        int i1 = collection.b(et1.b());
        f.a(collection, k.UNSUBACK, i1);
        return;
        collection;
        map;
        JVM INSTR monitorexit ;
        throw collection;
        collection;
        com.facebook.debug.log.b.c(a, "MqttException when unsubscribing", collection);
        a(ag.CONNECTION_LOST);
        return;
    }

    void c()
    {
        com.facebook.debug.log.b.c(a, "sendKeepAlive");
        n();
    }

    public boolean d()
    {
        return b(j);
    }

    public boolean e()
    {
        return c(j);
    }

    public bu f()
    {
        if (k == null)
        {
            return bu.DISCONNECTED;
        } else
        {
            return k.a();
        }
    }

    public long g()
    {
        return n;
    }

    public long h()
    {
        return m;
    }

}
