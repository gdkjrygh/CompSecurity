// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.analytics.av;
import com.facebook.common.e.h;
import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.facebook.device_id.l;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.http.protocol.aq;
import com.facebook.push.a.e;
import com.facebook.push.a.f;
import com.google.common.a.ik;
import com.google.common.d.a.i;
import java.util.Map;
import javax.inject.a;

// Referenced classes of package com.facebook.push.c2dm:
//            y, x, UnregisterPushTokenParams, RegisterPushTokenResult, 
//            v, RegisterPushTokenParams, r, t, 
//            z, u, ae

public class FacebookPushServerRegistrar
{

    private static Class a = com/facebook/push/c2dm/FacebookPushServerRegistrar;
    private final Context b;
    private final k c;
    private final aq d;
    private final ae e;
    private final a f;
    private final l g;
    private final com.facebook.common.hardware.k h;
    private final y i;
    private final av j;
    private final AlarmManager k;
    private final com.facebook.common.l.h l;
    private final h m;

    public FacebookPushServerRegistrar(Context context, k k1, aq aq1, ae ae, a a1, l l1, com.facebook.common.hardware.k k2, 
            y y1, av av1, AlarmManager alarmmanager, com.facebook.common.l.h h1, h h2)
    {
        b = context;
        c = k1;
        d = aq1;
        e = ae;
        f = a1;
        g = l1;
        h = k2;
        i = y1;
        j = av1;
        k = alarmmanager;
        l = h1;
        m = h2;
    }

    static void a(FacebookPushServerRegistrar facebookpushserverregistrar)
    {
        facebookpushserverregistrar.d();
    }

    private void c()
    {
        long l1 = System.currentTimeMillis();
        k.set(1, l1 + 0xa4cb80L, e());
    }

    private void d()
    {
        k.cancel(e());
    }

    private PendingIntent e()
    {
        Intent intent = new Intent(b, com/facebook/push/c2dm/FacebookPushServerRegistrar$LocalBroadcastReceiver);
        intent.setAction("com.facebook.orca.push.ACTION_ALARM");
        return PendingIntent.getBroadcast(b, -1, intent, 0);
    }

    private x f()
    {
        if (!i.k())
        {
            return x.NONE;
        }
        if (!i.i().equals(f.b()))
        {
            return x.WRONG_USER;
        }
        long l1 = i.o();
        if (System.currentTimeMillis() - l1 > 0x5265c00L)
        {
            return x.EXPIRED;
        }
        if (i.d())
        {
            return x.EXPIRED;
        } else
        {
            return x.CURRENT;
        }
    }

    public void a()
    {
        if (i.a() == null)
        {
            return;
        }
        b("attempt");
        i.n();
        try
        {
            UnregisterPushTokenParams unregisterpushtokenparams = new UnregisterPushTokenParams(i.a());
            d.a(e, unregisterpushtokenparams);
            b("success");
            return;
        }
        catch (Exception exception)
        {
            b("failed");
        }
    }

    void a(OperationResult operationresult, v v1)
    {
        d();
        operationresult = (RegisterPushTokenResult)operationresult.i();
        if (!operationresult.a())
        {
            a("server_failed");
            return;
        }
        if (operationresult.b())
        {
            v1.a();
            a("invalid_token");
            return;
        } else
        {
            i.m();
            a("success");
            return;
        }
    }

    public void a(v v1)
    {
        Object obj = (String)f.b();
        if (obj == null)
        {
            com.facebook.debug.log.b.c(a, "no user, cancel push token registration");
            a("auth_no_user");
            return;
        }
        if (n.a(i.a()))
        {
            com.facebook.debug.log.b.c(a, "registration id is empty, should not register with facebook");
            a("no_token");
            m.a(a.getSimpleName(), "Trying to register token when registration id is empty");
            return;
        }
        Object obj1;
        String s;
        String s1;
        byte byte0;
        boolean flag;
        if ("true".equals(l.a("com.facebook.vi")))
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        obj1 = i.f();
        s = i.a();
        s1 = g.b();
        if (!i.k() || !((String) (obj)).equals(i.i()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = new RegisterPushTokenParams(((z) (obj1)), s, s1, flag, i.e(), byte0);
        obj1 = new Bundle();
        ((Bundle) (obj1)).putParcelable("registerPushTokenParams", ((android.os.Parcelable) (obj)));
        com.google.common.d.a.i.a(c.a(com.facebook.push.c2dm.r.a, ((Bundle) (obj1))).a(), new t(this, v1));
        c();
        a("attempt");
    }

    public void a(x x1)
    {
        x1 = com.facebook.push.a.f.a(x1, i.a());
        j.b(x1);
    }

    public void a(String s)
    {
        s = com.facebook.push.a.e.a(s, i.a(), b());
        j.b(s);
    }

    public Map b()
    {
        java.util.HashMap hashmap = ik.a();
        hashmap.put("service_type", i.b().toString());
        return hashmap;
    }

    public void b(v v1)
    {
        x x1 = f();
        a(x1);
        switch (com.facebook.push.c2dm.u.a[x1.ordinal()])
        {
        default:
            com.facebook.debug.log.b.d(a, (new StringBuilder()).append("unexpected facebook registration status: ").append(x1).toString());
            return;

        case 1: // '\001'
            com.facebook.debug.log.b.a(a, "facebook registration is up to date");
            return;

        case 2: // '\002'
            if (h.b())
            {
                com.facebook.debug.log.b.a(a, "facebook registration has expired and network is connected -- trying to register");
                a(v1);
                return;
            } else
            {
                com.facebook.debug.log.b.a(a, "facebook registration has expired but network is not connected -- skipping registration");
                return;
            }

        case 3: // '\003'
            com.facebook.debug.log.b.d(a, "push token registered with different user. claiming token with facebook");
            a("wrong_user");
            a(v1);
            return;

        case 4: // '\004'
            com.facebook.debug.log.b.a(a, "Not registered with facebook server. registering");
            a(v1);
            return;
        }
    }

    public void b(String s)
    {
        s = com.facebook.push.a.h.a(s, i.a());
        j.b(s);
    }

}
