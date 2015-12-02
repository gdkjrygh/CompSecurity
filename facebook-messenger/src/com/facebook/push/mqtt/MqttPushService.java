// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.support.v4.a.e;
import com.facebook.analytics.cn;
import com.facebook.auth.credentials.UserTokenCredentials;
import com.facebook.base.a.g;
import com.facebook.common.hardware.k;
import com.facebook.common.time.a;
import com.facebook.debug.log.b;
import com.facebook.inject.ab;
import com.facebook.mqtt.t;
import com.facebook.mqtt.x;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.f;
import com.facebook.push.annotations.HighestMqttPersistence;
import com.facebook.push.annotations.MqttEndpointCapability;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

// Referenced classes of package com.facebook.push.mqtt:
//            bs, bt, bu, ci, 
//            cj, bq, br, v, 
//            o, ar, bv

public class MqttPushService extends Service
{

    public static final Class a = com/facebook/push/mqtt/MqttPushService;
    private bv b;
    private v c;
    private d d;
    private javax.inject.a e;
    private k f;
    private javax.inject.a g;
    private f h;
    private ci i;
    private javax.inject.a j;
    private cn k;
    private AlarmManager l;
    private a m;
    private o n;
    private ar o;
    private BroadcastReceiver p;
    private boolean q;
    private bu r;
    private long s;
    private long t;
    private t u;
    private long v;
    private int w;
    private final Runnable x = new bs(this);

    public MqttPushService()
    {
    }

    private PendingIntent a(String s1)
    {
        Intent intent = new Intent();
        intent.setClass(this, com/facebook/push/mqtt/MqttPushService);
        intent.setAction(s1);
        return PendingIntent.getService(this, 0, intent, 0);
    }

    private void a(Intent intent)
    {
        if ("com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED".equals(intent.getAction()))
        {
            boolean flag = f.b();
            com.facebook.debug.log.b.a(a, "Network Connectivity Changed. isConnected:%b", new Object[] {
                Boolean.valueOf(flag)
            });
            t = m.a();
            if (flag)
            {
                g();
            }
        } else
        if ("com.facebook.mqtt.ACTION_MQTT_CONFIG_CHANGED".equals(intent.getAction()))
        {
            com.facebook.debug.log.b.a(a, "Config changed, reset connection.");
            g();
            return;
        }
    }

    static void a(MqttPushService mqttpushservice, Intent intent)
    {
        mqttpushservice.a(intent);
    }

    private void a(bu bu1)
    {
        if (bu1 == r)
        {
            return;
        }
        com.facebook.debug.log.b.a(a, "MQTT state transition from %s to %s", new Object[] {
            r, bu1
        });
        r = bu1;
        com.facebook.push.mqtt.bt.a[bu1.ordinal()];
        JVM INSTR tableswitch 1 3: default 72
    //                   1 98
    //                   2 108
    //                   3 118;
           goto _L1 _L2 _L3 _L4
_L1:
        String s1;
        bu1 = null;
        s1 = null;
_L6:
        i.a(bu1);
        k.a("mqtt_connection", s1, null, null, null);
        return;
_L2:
        s1 = "connecting";
        bu1 = cj.CHANNEL_CONNECTING;
        continue; /* Loop/switch isn't completed */
_L3:
        s1 = "connected";
        bu1 = cj.CHANNEL_CONNECTED;
        continue; /* Loop/switch isn't completed */
_L4:
        s1 = "disconnected";
        bu1 = cj.CHANNEL_DISCONNECTED;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static boolean a(MqttPushService mqttpushservice)
    {
        return mqttpushservice.j();
    }

    static v b(MqttPushService mqttpushservice)
    {
        return mqttpushservice.c;
    }

    static bu c(MqttPushService mqttpushservice)
    {
        return mqttpushservice.r;
    }

    private void e()
    {
        com.facebook.debug.log.b.c(a, "Starting service...");
        if (q)
        {
            com.facebook.debug.log.b.d(a, "Attempt to start service that is already started");
            g();
            return;
        } else
        {
            q = true;
            i.a(cj.SERVICE_STARTED);
            p = new bq(this);
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED");
            intentfilter.addAction("com.facebook.mqtt.ACTION_MQTT_CONFIG_CHANGED");
            android.support.v4.a.e.a(this).a(p, intentfilter);
            h = new br(this);
            d.a(h);
            g();
            return;
        }
    }

    private void f()
    {
        if (!q)
        {
            com.facebook.debug.log.b.d(a, "Attempt to stop connection not active.");
        }
        q = false;
        i.a(cj.SERVICE_STOPPED);
        e e1 = android.support.v4.a.e.a(this);
        if (p != null)
        {
            e1.a(p);
            p = null;
        }
        if (h != null)
        {
            d.b(h);
            h = null;
        }
        h();
    }

    private void g()
    {
        com.facebook.debug.log.b.a(a, "In kickConnection");
        if (i()) goto _L2; else goto _L1
_L1:
        com.facebook.debug.log.b.a(a, "Shouldn't be connected");
        h();
_L5:
        return;
_L2:
        if (e.b() != u)
        {
            com.facebook.debug.log.b.a(a, "Mqtt config changed -- disconnecting");
            h();
        }
        u = (t)e.b();
        if (r != bu.CONNECTED)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        if (t <= s) goto _L4; else goto _L3
_L3:
        com.facebook.debug.log.b.a(a, "Will reconnect because network changed");
_L6:
        a(bu.CONNECTING);
        c.a();
        return;
_L4:
        com.facebook.debug.log.b.a(a, "Already connected");
        if (v != ((Long)j.b()).longValue())
        {
            com.facebook.debug.log.b.c(a, "Endpoint capability changed.");
            m();
            return;
        }
          goto _L5
        if (r == bu.CONNECTING)
        {
            com.facebook.debug.log.b.a(a, "Already connecting");
            return;
        }
          goto _L6
    }

    private void h()
    {
        a(bu.DISCONNECTED);
        c.b();
        l();
    }

    private boolean i()
    {
        if (!q)
        {
            com.facebook.debug.log.b.a(a, "Service not started");
            return false;
        }
        if (!f.b())
        {
            com.facebook.debug.log.b.a(a, "Not connected to network");
            return false;
        }
        if (g.b() == null)
        {
            com.facebook.debug.log.b.a(a, "Not logged in");
            return false;
        } else
        {
            return true;
        }
    }

    private boolean j()
    {
        com.facebook.debug.log.b.b(a, "trySendKeepAliveOrDisconnect");
        if (i())
        {
            c.c();
            return true;
        } else
        {
            h();
            return false;
        }
    }

    private void k()
    {
        long l1 = (long)w * 1000L;
        if (d() && n.a(l1))
        {
            com.facebook.debug.log.b.c(a, "Scheduling inexact repeating keepalive with %d seconds", new Object[] {
                Integer.valueOf(w)
            });
            n.a(x, l1);
            return;
        } else
        {
            com.facebook.debug.log.b.c(a, "Scheduling exact repeating keepalive with %d seconds", new Object[] {
                Integer.valueOf(w)
            });
            l.set(0, l1 + m.a(), a("Orca.KEEP_ALIVE"));
            return;
        }
    }

    private void l()
    {
        n.a(x);
        l.cancel(a("Orca.KEEP_ALIVE"));
    }

    private void m()
    {
        if (r == bu.CONNECTED)
        {
            ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
            v = ((Long)j.b()).longValue();
            objectnode.put("endpoint_capabilities", v);
            c.a("/send_endpoint_capabilities", objectnode, x.FIRE_AND_FORGET);
            com.facebook.debug.log.b.a(a, "updateEndpointCapability: capability = %d", new Object[] {
                Long.valueOf(v)
            });
        }
    }

    public bu a()
    {
        return r;
    }

    void a(int i1)
    {
        w = i1;
        com.facebook.debug.log.b.b(a, "Reset keepalive interval to %d", new Object[] {
            Integer.valueOf(i1)
        });
        if (n == null || l == null)
        {
            return;
        } else
        {
            l();
            k();
            return;
        }
    }

    void a(String s1, byte abyte0[])
    {
        i.a(s1, abyte0);
    }

    void b()
    {
        com.facebook.debug.log.b.c(a, "Connection established");
        k();
        a(bu.CONNECTED);
        s = m.a();
        m();
    }

    void b(int i1)
    {
        if (d())
        {
            return;
        } else
        {
            l();
            k();
            return;
        }
    }

    void c()
    {
        com.facebook.debug.log.b.c(a, "Connection lost, Changing from %s to DISCONNECTED.", new Object[] {
            r
        });
        a(bu.DISCONNECTED);
        l();
    }

    boolean d()
    {
        return o == ar.ALWAYS;
    }

    public IBinder onBind(Intent intent)
    {
        return b;
    }

    public void onCreate()
    {
        super.onCreate();
        com.facebook.debug.log.b.c(a, "Creating service");
        com.facebook.base.a.g.a(this);
        com.facebook.inject.t t1 = com.facebook.inject.t.a(this);
        b = new bv(this, null);
        c = (v)t1.a(com/facebook/push/mqtt/v);
        d = (d)t1.a(com/facebook/prefs/shared/d);
        e = t1.b(com/facebook/mqtt/t);
        f = (k)t1.a(com/facebook/common/hardware/k);
        g = t1.b(com/facebook/auth/credentials/UserTokenCredentials);
        i = (ci)t1.a(com/facebook/push/mqtt/ci);
        j = t1.b(java/lang/Long, com/facebook/push/annotations/MqttEndpointCapability);
        m = (a)t1.a(com/facebook/common/time/a);
        u = (t)e.b();
        k = (cn)t1.a(com/facebook/analytics/cn);
        l = (AlarmManager)t1.e().a(android/app/AlarmManager);
        n = (o)t1.a(com/facebook/push/mqtt/o);
        o = (ar)t1.a(com/facebook/push/mqtt/ar, com/facebook/push/annotations/HighestMqttPersistence);
        c.a(this);
        w = 300;
    }

    public void onDestroy()
    {
        com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Service destroyed (started=").append(q).append(")").toString());
        if (q)
        {
            f();
        }
        c.b();
    }

    public void onStart(Intent intent, int i1)
    {
        super.onStart(intent, i1);
        com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Service started with intent=").append(intent).toString());
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        intent = intent.getAction();
        if ("Orca.STOP".equals(intent))
        {
            f();
            stopSelf();
            return;
        }
        if ("Orca.START".equals(intent))
        {
            e();
            return;
        }
        if (!"Orca.KEEP_ALIVE".equals(intent))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!j()) goto _L1; else goto _L3
_L3:
        k();
        return;
        if (!"Orca.PERSISTENT_KICK".equals(intent) || !d()) goto _L1; else goto _L4
_L4:
        g();
        return;
    }

}
