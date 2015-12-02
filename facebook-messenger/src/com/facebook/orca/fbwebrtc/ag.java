// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.content.Intent;
import android.telephony.TelephonyManager;
import com.facebook.base.c;
import com.facebook.breakpad.BreakpadManager;
import com.facebook.common.w.e;
import com.facebook.debug.log.b;
import com.facebook.push.mqtt.ca;
import com.facebook.push.mqtt.v;
import com.facebook.webrtc.WebrtcEngine;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.a.hq;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            f, az, bb, g, 
//            ae, ah, n

public class ag
    implements c
{

    private static final Class a = com/facebook/orca/fbwebrtc/ag;
    private final Queue b = hq.b();
    private final f c = new f();
    private final a d;
    private final a e;
    private final TelephonyManager f;
    private final android.support.v4.a.e g;
    private final ScheduledExecutorService h;
    private final BreakpadManager i;
    private final v j;
    private final az k;
    private final bb l;
    private final n m;
    private final ae n;
    private final com.facebook.e.c o;
    private final ObjectMapper p;
    private volatile WebrtcEngine q;

    public ag(TelephonyManager telephonymanager, android.support.v4.a.e e1, ScheduledExecutorService scheduledexecutorservice, BreakpadManager breakpadmanager, v v1, a a1, a a2, 
            az az1, bb bb1, n n1, ae ae1, com.facebook.e.c c1, ObjectMapper objectmapper)
    {
        f = telephonymanager;
        g = e1;
        h = scheduledexecutorservice;
        i = breakpadmanager;
        j = v1;
        d = a1;
        e = a2;
        k = az1;
        l = bb1;
        m = n1;
        n = ae1;
        o = c1;
        p = objectmapper;
        k.a(this);
        l.a(this);
    }

    private void a(long l1, String s, boolean flag)
    {
        if (!j())
        {
            return;
        }
        String s1;
        Object obj;
        boolean flag1;
        long l2;
        long l3;
        boolean flag2;
        try
        {
            obj = p.readTree(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.facebook.debug.log.b.e(a, "Failed to parse peer message", s);
            return;
        }
        s1 = com.facebook.common.w.e.b(((JsonNode) (obj)).get("type"));
        l2 = com.facebook.common.w.e.c(((JsonNode) (obj)).get("call_id"));
        l3 = com.facebook.common.w.e.c(((JsonNode) (obj)).get("msg_id"));
        obj = new g(l1, l2, l3, s);
        flag2 = "offer".equals(s1);
        if ("hang_up".equals(s1) || "other_dismiss".equals(s1))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag2)
        {
            boolean flag3 = a(l1, l2, l3);
            boolean flag4 = j.d();
            boolean flag5 = o.b();
            ae ae1 = n;
            String s2;
            if (flag)
            {
                s2 = "gcm";
            } else
            {
                s2 = "mqtt";
            }
            ae1.a(l2, l3, l1, s2, flag3, flag4, flag5);
            if (flag3)
            {
                com.facebook.debug.log.b.a(a, "duplicate message from peer %d: %s", new Object[] {
                    Long.valueOf(l1), s
                });
                return;
            }
            if (((Boolean)e.b()).booleanValue() && !flag5)
            {
                com.facebook.debug.log.b.d(a, "incoming call ignored because voip is only allowed on wifi network.");
                return;
            }
            l.j();
            if (!flag4)
            {
                com.facebook.debug.log.b.d(a, "mqtt is not connected");
                l();
            }
        }
        if (flag1)
        {
            c.a(l1, l2);
        }
        if (j.d() || flag1)
        {
            k();
            a(((g) (obj)));
            return;
        }
        if (flag2)
        {
            c.a(((g) (obj)));
            com.facebook.debug.log.b.a(a, "delaying offer message from peer: %d: %s", new Object[] {
                Long.valueOf(l1), s
            });
            h.schedule(new ah(this), 2000L, TimeUnit.MILLISECONDS);
            return;
        }
        if (c.b(((g) (obj))))
        {
            com.facebook.debug.log.b.a(a, "delaying other message from peer: %d: %s", new Object[] {
                Long.valueOf(l1), s
            });
            return;
        } else
        {
            a(((g) (obj)));
            return;
        }
    }

    static void a(ag ag1)
    {
        ag1.k();
    }

    private void a(g g1)
    {
        com.facebook.debug.log.b.a(a, "message from peer %d: %s", new Object[] {
            Long.valueOf(g1.a), g1.d
        });
        q.a(g1.a, g1.d);
    }

    private boolean a(long l1, long l2, long l3)
    {
        String s;
label0:
        {
            s = (new StringBuilder()).append(l2).append(":").append(l3).toString();
            synchronized (b)
            {
                if (!b.contains(s))
                {
                    break label0;
                }
            }
            return true;
        }
        if (b.size() >= 10)
        {
            b.remove();
        }
        b.add(s);
        queue;
        JVM INSTR monitorexit ;
        return false;
        exception;
        queue;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean j()
    {
        if (!f())
        {
            return false;
        }
        if (q != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (q == null)
        {
            com.facebook.debug.log.b.c(a, "webrtc is initializing");
            q = new WebrtcEngine(k, l, m, n);
            com.facebook.debug.log.b.c(a, "webrtc is initialized");
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return q.a();
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void k()
    {
        g ag1[] = c.a();
        int j1 = ag1.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            g g1 = ag1[i1];
            com.facebook.debug.log.b.a(a, "process pending message from peer: %d: callId=%d, msgId=%s", new Object[] {
                Long.valueOf(g1.a), Long.valueOf(g1.b), Long.valueOf(g1.c)
            });
            q.a(g1.a, g1.d);
        }

    }

    private void l()
    {
        Intent intent = new Intent();
        intent.setAction(ca.a);
        g.a(intent);
    }

    public void a()
    {
        i.a();
    }

    public void a(long l1)
    {
        if (!j())
        {
            return;
        } else
        {
            l.a(l1, true);
            q.a(l1);
            return;
        }
    }

    public void a(long l1, String s)
    {
        a(l1, s, false);
    }

    public void a(long l1, String s, int i1, String s1)
    {
        if (!j())
        {
            return;
        }
        if (i1 == 0)
        {
            q.b(l1);
            return;
        } else
        {
            q.a(l1, i1, s1, s);
            return;
        }
    }

    public void a(com.facebook.webrtc.a a1)
    {
        if (!j())
        {
            return;
        } else
        {
            q.a(a1.ordinal());
            return;
        }
    }

    public void a(JsonNode jsonnode)
    {
        String s = com.facebook.common.w.e.b(jsonnode.get("payload"));
        if (s == null)
        {
            com.facebook.debug.log.b.e(a, "No valid 'payload' in Webrtc offer from native push.");
            return;
        }
        long l1 = com.facebook.common.w.e.c(jsonnode.get("uid"));
        if (l1 == 0L)
        {
            com.facebook.debug.log.b.e(a, "No valid 'uid' in Webrtc offer from native push.");
            return;
        } else
        {
            a(l1, s, true);
            return;
        }
    }

    public void a(boolean flag)
    {
        if (!j())
        {
            return;
        } else
        {
            q.a(flag);
            return;
        }
    }

    public int b()
    {
        if (l == null)
        {
            return 0;
        } else
        {
            return l.c();
        }
    }

    public long c()
    {
        if (d())
        {
            return l.a();
        } else
        {
            return 0L;
        }
    }

    public boolean d()
    {
        return b() != 0;
    }

    public boolean e()
    {
        return b() != 0 || f.getCallState() != 0;
    }

    public boolean f()
    {
        return ((Boolean)d.b()).booleanValue();
    }

    public void g()
    {
        WebrtcEngine webrtcengine = null;
        this;
        JVM INSTR monitorenter ;
        if (q != null)
        {
            webrtcengine = q;
            q = null;
        }
        this;
        JVM INSTR monitorexit ;
        if (webrtcengine != null)
        {
            webrtcengine.b();
        }
        l.k();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void h()
    {
        if (!j())
        {
            return;
        } else
        {
            q.c();
            return;
        }
    }

    public void i()
    {
        if (!j())
        {
            return;
        } else
        {
            q.d();
            return;
        }
    }

}
