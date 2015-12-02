// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.base.a.g;
import com.facebook.base.broadcast.q;
import com.facebook.base.c;
import com.facebook.common.v.a;
import com.facebook.common.v.d;
import com.facebook.debug.log.b;
import com.facebook.mqtt.messages.SubscribeTopic;
import com.google.common.a.ev;
import com.google.common.a.ew;
import com.google.common.a.fi;
import com.google.common.a.kl;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.push.mqtt:
//            cg, cb, cc, cd, 
//            cf, cj, v, ar, 
//            m, MqttPushService, i, ce

public class ca
    implements c
{

    public static final String a = (new StringBuilder()).append(com/facebook/push/mqtt/ca.getCanonicalName()).append(".ACTION_WAKEUP").toString();
    private static final Class b = com/facebook/push/mqtt/ca;
    private final Context c;
    private final com.facebook.common.time.a d;
    private final ScheduledExecutorService e;
    private final v f;
    private final a g;
    private final d h;
    private final javax.inject.a i;
    private final javax.inject.a j;
    private final Set k;
    private final Set l;
    private q m;
    private boolean n;
    private boolean o;
    private cg p;
    private cg q;
    private ScheduledFuture r;
    private ScheduledFuture s;
    private final Runnable t = new cb(this);
    private final Runnable u = new cc(this);
    private ScheduledFuture v;
    private final Runnable w = new cd(this);
    private HashSet x;

    public ca(Context context, com.facebook.common.time.a a1, ScheduledExecutorService scheduledexecutorservice, v v1, a a2, d d1, javax.inject.a a3, 
            javax.inject.a a4, Set set, Set set1)
    {
        p = cg.STOPPED;
        q = cg.STOPPED;
        x = kl.a();
        c = context;
        d = a1;
        e = scheduledexecutorservice;
        f = v1;
        g = a2;
        h = d1;
        i = a3;
        j = a4;
        k = set;
        l = set1;
    }

    static void a(ca ca1)
    {
        ca1.e();
    }

    static void a(ca ca1, cj cj1)
    {
        ca1.a(cj1);
    }

    private void a(cj cj1)
    {
        switch (com.facebook.push.mqtt.cf.a[cj1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            o = true;
            return;

        case 2: // '\002'
            o = false;
            break;
        }
    }

    private void a(Collection collection)
    {
        this;
        JVM INSTR monitorenter ;
        com.facebook.debug.log.b.a(b, "Subscribing to %s", new Object[] {
            collection
        });
        x.addAll(collection);
        f.a(collection);
        this;
        JVM INSTR monitorexit ;
        return;
        collection;
        throw collection;
    }

    private cg b()
    {
        if (g.c())
        {
            return cg.ACTIVE;
        }
        if (d.a() - g.e() < 0x1d4c0L)
        {
            return cg.PAUSED;
        } else
        {
            return cg.STOPPED;
        }
    }

    static void b(ca ca1)
    {
        ca1.p();
    }

    private void b(Collection collection)
    {
        this;
        JVM INSTR monitorenter ;
        com.facebook.debug.log.b.a(b, "Unsubscribing from %s", new Object[] {
            collection
        });
        x.removeAll(collection);
        f.b(collection);
        this;
        JVM INSTR monitorexit ;
        return;
        collection;
        throw collection;
    }

    private cg c()
    {
        if (h.b())
        {
            return cg.ACTIVE;
        }
        if (d.a() - h.a() < 0x1d4c0L)
        {
            return cg.PAUSED;
        } else
        {
            return cg.STOPPED;
        }
    }

    static void c(ca ca1)
    {
        ca1.d();
    }

    private void d()
    {
        if (o && !s())
        {
            q();
        } else
        if (s())
        {
            if (!o)
            {
                n();
                return;
            } else
            {
                o();
                return;
            }
        }
    }

    private void e()
    {
        boolean flag1 = true;
        cg cg1 = p;
        cg cg2 = q;
        p = b();
        q = c();
        if (p == cg.ACTIVE)
        {
            q = cg.ACTIVE;
        }
        if (q == cg.PAUSED && p == cg.ACTIVE)
        {
            p = cg.PAUSED;
        }
        if (q == cg.STOPPED)
        {
            p = cg.STOPPED;
        }
        boolean flag;
        if (p != cg1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (q == cg2)
        {
            flag1 = false;
        }
        if (flag || flag1)
        {
            if (q == cg.ACTIVE && flag1)
            {
                f();
            }
            if (p == cg.ACTIVE && flag)
            {
                g();
            }
            if (p == cg.PAUSED && flag)
            {
                h();
            }
            if (q == cg.PAUSED && flag1)
            {
                i();
            }
            if (p == cg.STOPPED && flag)
            {
                j();
            }
            if (q == cg.STOPPED && flag1)
            {
                k();
                return;
            }
        }
    }

    private void f()
    {
        com.facebook.debug.log.b.a(b, "Device is now active");
        if (s != null)
        {
            s.cancel(false);
            s = null;
        }
        if (!o && s())
        {
            n();
        }
        l();
    }

    private void g()
    {
        com.facebook.debug.log.b.a(b, "App is now active");
        if (r != null)
        {
            r.cancel(false);
            r = null;
        }
        if (!o && s())
        {
            n();
        }
        l();
    }

    private void h()
    {
        com.facebook.debug.log.b.a(b, "App is now paused");
        if (r == null)
        {
            r = e.schedule(t, 0x1d4c0L, TimeUnit.MILLISECONDS);
        }
    }

    private void i()
    {
        com.facebook.debug.log.b.a(b, "Device is now paused");
        if (s == null)
        {
            s = e.schedule(u, 0x1d4c0L, TimeUnit.MILLISECONDS);
        }
    }

    private void j()
    {
        com.facebook.debug.log.b.a(b, "App is now stopped");
        r = null;
        l();
        if (o && !s())
        {
            q();
        }
    }

    private void k()
    {
        com.facebook.debug.log.b.a(b, "Device is now stopped");
        s = null;
        l();
        if (o && !s())
        {
            q();
        }
    }

    private void l()
    {
        this;
        JVM INSTR monitorenter ;
        HashSet hashset;
        HashSet hashset1;
        Object obj1;
        hashset = kl.a();
        hashset1 = kl.a(x);
        obj1 = m();
        if (p == cg.STOPPED) goto _L2; else goto _L1
_L1:
        Object obj = ar.APP_USE;
_L9:
        com.facebook.debug.log.b.a(b, "Minimum persistence needed for topics to be subscribed: %s", new Object[] {
            obj
        });
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj1 = ((ev) (obj1)).a().iterator();
_L8:
        if (!((Iterator) (obj1)).hasNext()) goto _L4; else goto _L5
_L5:
        java.util.Map.Entry entry;
        SubscribeTopic subscribetopic;
        entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
        subscribetopic = (SubscribeTopic)entry.getKey();
        if (!com.facebook.common.w.b.a((ar)entry.getValue(), ((Comparable) (obj)))) goto _L7; else goto _L6
_L6:
        hashset1.remove(subscribetopic);
        if (!x.contains(subscribetopic))
        {
            hashset.add(subscribetopic);
        }
          goto _L8
        obj;
        throw obj;
_L2:
label0:
        {
            if (q == cg.STOPPED)
            {
                break label0;
            }
            obj = ar.DEVICE_USE;
        }
          goto _L9
        if (!n)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        obj = ar.ALWAYS;
          goto _L9
_L7:
        if (!x.contains(subscribetopic)) goto _L8; else goto _L10
_L10:
        hashset1.add(subscribetopic);
          goto _L8
_L4:
        b(hashset1);
        a(hashset);
        this;
        JVM INSTR monitorexit ;
        return;
        obj = null;
          goto _L9
    }

    private ev m()
    {
        HashSet hashset = kl.a();
        ew ew1 = ev.k();
        for (Iterator iterator = k.iterator(); iterator.hasNext();)
        {
            ev ev1 = ((m)iterator.next()).a();
            Iterator iterator1 = ev1.i_().iterator();
            while (iterator1.hasNext()) 
            {
                SubscribeTopic subscribetopic = (SubscribeTopic)iterator1.next();
                if (hashset.contains(subscribetopic.a()))
                {
                    throw new IllegalStateException("Duplicate topics not allowed at this time");
                }
                hashset.add(subscribetopic.a());
                ew1.b(subscribetopic, ev1.get(subscribetopic));
            }
        }

        return ew1.b();
    }

    private void n()
    {
        com.facebook.debug.log.b.a(b, "Ensuring service started");
        Intent intent = new Intent(c, com/facebook/push/mqtt/MqttPushService);
        intent.setAction("Orca.START");
        c.startService(intent);
        r();
    }

    private void o()
    {
        com.facebook.debug.log.b.a(b, "Ensure mqtt connection active");
        Intent intent = new Intent(c, com/facebook/push/mqtt/MqttPushService);
        intent.setAction("Orca.PERSISTENT_KICK");
        c.startService(intent);
    }

    private void p()
    {
        com.facebook.debug.log.b.a(b, "Stopping service cleanly");
        if (o)
        {
            Intent intent = new Intent(c, com/facebook/push/mqtt/MqttPushService);
            intent.setAction("Orca.STOP");
            c.startService(intent);
            return;
        } else
        {
            Intent intent1 = new Intent(c, com/facebook/push/mqtt/MqttPushService);
            c.stopService(intent1);
            return;
        }
    }

    private void q()
    {
        com.facebook.debug.log.b.a(b, "Stopping service in %d sec", new Object[] {
            Long.valueOf(480L)
        });
        r();
        v = e.schedule(w, 0x75300L, TimeUnit.MILLISECONDS);
    }

    private void r()
    {
        if (v != null)
        {
            v.cancel(false);
            v = null;
        }
    }

    private boolean s()
    {
        boolean flag = true;
        com.facebook.debug.log.b.a(b, "Checking if push service should run");
        if (!n)
        {
            return false;
        }
        com.facebook.debug.log.b.a(b, "Service enabled");
        if (j.b() == null)
        {
            com.facebook.debug.log.b.a(b, "Not logged in");
            return false;
        }
        for (Iterator iterator = l.iterator(); iterator.hasNext();)
        {
            i i1 = (i)iterator.next();
            if (i1.a())
            {
                com.facebook.debug.log.b.a(b, "Active client prevented mqtt from shutting down: %s", new Object[] {
                    i1.getClass()
                });
                return true;
            }
        }

        ar ar1 = (ar)i.b();
        com.facebook.debug.log.b.a(b, "Required persistence: %s", new Object[] {
            ar1
        });
        switch (com.facebook.push.mqtt.cf.b[ar1.ordinal()])
        {
        default:
            com.facebook.debug.log.b.d(b, "Invalid value from HighestMqttPersistenceProvider: %s", new Object[] {
                ar1
            });
            return false;

        case 1: // '\001'
            return true;

        case 2: // '\002'
            com.facebook.debug.log.b.a(b, "Device activity status: %s", new Object[] {
                q
            });
            if (q != cg.STOPPED)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return flag;

        case 3: // '\003'
            com.facebook.debug.log.b.a(b, "App activity status: %s", new Object[] {
                p
            });
            break;
        }
        if (p == cg.STOPPED)
        {
            flag = false;
        }
        return flag;
    }

    public void a()
    {
        com.facebook.base.a.g.a(c);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction(a);
        fi fi1 = fi.a(a.b, d.b, a.c, d.c);
        for (Iterator iterator = fi1.iterator(); iterator.hasNext(); intentfilter.addAction((String)iterator.next())) { }
        intentfilter.addAction("com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED");
        m = new ce(this, c, intentfilter, fi1);
        m.a();
        e();
    }

    public void a(boolean flag)
    {
        if (n != flag)
        {
            n = flag;
            l();
        }
        if (o && !s())
        {
            p();
        } else
        if (!o && s())
        {
            n();
            return;
        }
    }

}
