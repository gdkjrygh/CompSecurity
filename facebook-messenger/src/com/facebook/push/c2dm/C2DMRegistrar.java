// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.facebook.analytics.av;
import com.facebook.common.hardware.k;
import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.facebook.push.a.a;
import com.google.common.a.ik;
import java.util.Map;

// Referenced classes of package com.facebook.push.c2dm:
//            n, c, y, q, 
//            z, FacebookPushServerRegistrar, o, v

public class C2DMRegistrar
{

    private static final Class b = com/facebook/push/c2dm/C2DMRegistrar;
    final v a = new com.facebook.push.c2dm.n(this);
    private final Context c;
    private final d d;
    private final av e;
    private final boolean f;
    private final k g;
    private final FacebookPushServerRegistrar h;
    private final y i;
    private final AlarmManager j;

    public C2DMRegistrar(Context context, d d1, av av1, boolean flag, k k1, FacebookPushServerRegistrar facebookpushserverregistrar, y y1, 
            AlarmManager alarmmanager)
    {
        c = context;
        d = d1;
        e = av1;
        f = flag;
        g = k1;
        h = facebookpushserverregistrar;
        i = y1;
        j = alarmmanager;
    }

    private void a(long l)
    {
        long l1 = l;
        if (l > 0x1b7740L)
        {
            l1 = 0x1b7740L;
        }
        e e1 = d.b();
        e1.a(c.f, l1);
        e1.a();
    }

    static void a(C2DMRegistrar c2dmregistrar)
    {
        c2dmregistrar.h();
    }

    private q d()
    {
        if (n.a(i.a()))
        {
            return q.NONE;
        }
        long l = System.currentTimeMillis();
        long l1 = i.l();
        long l2 = d.a(c.g, 0L);
        if (l - l1 > 0x240c8400L && l - l2 > 0xa4cb800L)
        {
            return q.EXPIRED;
        }
        if (i.g() != f)
        {
            return q.WRONG_TYPE;
        } else
        {
            return q.CURRENT;
        }
    }

    private void e()
    {
        long l = System.currentTimeMillis();
        j.set(1, l + 0xa4cb80L, g());
    }

    private void f()
    {
        j.cancel(g());
    }

    private PendingIntent g()
    {
        Intent intent = new Intent(c, com/facebook/push/c2dm/C2DMRegistrar$LocalBroadcastReceiver);
        intent.setAction("com.facebook.orca.push.ACTION_ALARM");
        return PendingIntent.getBroadcast(c, -1, intent, 0);
    }

    private void h()
    {
        a("invalid_token");
        if (System.currentTimeMillis() - i.l() < 0x5265c00L)
        {
            return;
        } else
        {
            i.h();
            a();
            return;
        }
    }

    private long i()
    {
        return d.a(c.f, 30000L);
    }

    public void a()
    {
        a("attempt");
        e();
        Object obj = new Intent("com.google.android.c2dm.intent.REGISTER");
        ((Intent) (obj)).putExtra("app", PendingIntent.getBroadcast(c, 0, new Intent(), 0));
        z z1 = i.b();
        if (z1 == z.GCM)
        {
            ((Intent) (obj)).putExtra("sender", "15057814354");
        } else
        {
            ((Intent) (obj)).putExtra("sender", "facebook.android@gmail.com");
        }
        d.b().a(c.h, z1.toString()).a();
        obj = c.startService(((Intent) (obj)));
        com.facebook.debug.log.b.b(b, (new StringBuilder()).append("startService=").append(obj).toString());
    }

    public void a(q q1)
    {
        q1 = com.facebook.push.a.b.a(q1, i.a());
        e.b(q1);
    }

    public void a(String s)
    {
        s = com.facebook.push.a.a.a(s, i.a(), c());
        e.b(s);
    }

    void a(String s, String s1, boolean flag)
    {
        if (flag)
        {
            i.h();
            b("success");
            return;
        }
        f();
        if (s1 != null)
        {
            i.h();
            com.facebook.debug.log.b.e(b, (new StringBuilder()).append("Registration error ").append(s1).toString());
            if ("SERVICE_NOT_AVAILABLE".equals(s1))
            {
                long l = i();
                com.facebook.debug.log.b.b(b, (new StringBuilder()).append("Scheduling registration retry, backoff = ").append(l).toString());
                s = new Intent("com.google.android.c2dm.intent.RETRY");
                s = PendingIntent.getBroadcast(c, 0, s, 0);
                ((AlarmManager)c.getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + l, s);
                a(2L * l);
            }
            a(s1.toLowerCase());
            return;
        } else
        {
            i.a(s, i.c());
            a("success");
            h.a(a);
            return;
        }
    }

    public void a(boolean flag)
    {
        com.facebook.debug.log.b.b(b, (new StringBuilder()).append("checking push registration status, forceFacebookServerRegistration=").append(flag).toString());
        q q1 = d();
        com.facebook.debug.log.b.b(b, (new StringBuilder()).append("registrationStatus=").append(q1.toString()).toString());
        a(q1);
        switch (com.facebook.push.c2dm.o.a[q1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            com.facebook.debug.log.b.b(b, "GCM/C2DM registration is current, checking facebook server registration");
            if (flag)
            {
                h.a(a);
                return;
            } else
            {
                h.b(a);
                return;
            }

        case 2: // '\002'
            com.facebook.debug.log.b.b(b, "GCM/C2DM preference inconsistency. Reregistering with google server");
            b();
            a();
            return;

        case 3: // '\003'
            if (g.b())
            {
                com.facebook.debug.log.b.b(b, "Regid has expired and network is connected  -- trying to register with google server");
                a();
                return;
            } else
            {
                com.facebook.debug.log.b.b(b, "Regid has expired but network is not connected  -- skipping registration with google server");
                return;
            }

        case 4: // '\004'
            com.facebook.debug.log.b.b(b, "Has no regid -- trying to register with google server");
            a();
            return;
        }
    }

    public void b()
    {
        b("attempt");
        Intent intent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
        intent.putExtra("app", PendingIntent.getBroadcast(c, 0, new Intent(), 0));
        c.startService(intent);
        h.a();
        i.h();
    }

    public void b(String s)
    {
        s = com.facebook.push.a.d.a(s, i.a());
        e.b(s);
    }

    public Map c()
    {
        java.util.HashMap hashmap = ik.a();
        hashmap.put("backoff", String.valueOf(i()));
        hashmap.put("service_type", i.b().toString());
        return hashmap;
    }

}
