// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.os.Bundle;
import android.os.Handler;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.ops.n;
import com.facebook.orca.notify.NotificationSetting;
import com.facebook.orca.server.SetSettingsParams;
import com.facebook.orca.server.aq;
import com.facebook.orca.server.ay;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.facebook.prefs.shared.f;
import com.google.common.d.a.i;

// Referenced classes of package com.facebook.orca.prefs:
//            c, n, d, e

public class b
{

    private static Class a = com/facebook/orca/prefs/b;
    private static long b = 4000L;
    private static long c = 0x927c0L;
    private static long d = 5L;
    private final Handler e = new Handler();
    private final com.facebook.auth.b.b f;
    private final k g;
    private final d h;
    private final f i = new c(this);
    private n j;
    private ay k;
    private SetSettingsParams l;
    private long m;
    private int n;
    private volatile boolean o;

    public b(com.facebook.auth.b.b b1, d d1, k k1)
    {
        f = b1;
        h = d1;
        g = k1;
        d1.a(i);
    }

    private ay a()
    {
        if (k == null)
        {
            k = new ay();
            m = b;
            b();
        }
        return k;
    }

    static void a(b b1)
    {
        b1.c();
    }

    static void a(b b1, ae ae1)
    {
        b1.a(ae1);
    }

    private void a(ae ae1)
    {
        while (o || !n.o.equals(ae1) || !f.b()) 
        {
            return;
        }
        ae1 = NotificationSetting.b(h.a(n.o, 0L));
        this;
        JVM INSTR monitorenter ;
        ay ay1 = a();
        ay1.a(true);
        ay1.a(ae1);
        this;
        JVM INSTR monitorexit ;
        return;
        ae1;
        this;
        JVM INSTR monitorexit ;
        throw ae1;
    }

    private void b()
    {
        e.postDelayed(new com.facebook.orca.prefs.d(this), m);
    }

    static void b(b b1)
    {
        b1.d();
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        ay ay1 = k;
        if (ay1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (f.b() && j == null)
        {
            l = k.c();
            k = null;
            com.facebook.debug.log.b.b(a, "Starting update");
            Bundle bundle = new Bundle();
            bundle.putParcelable("setSettingsParams", l);
            j = g.a(aq.E, bundle).a();
            com.google.common.d.a.i.a(j, new com.facebook.orca.prefs.e(this));
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static void c(b b1)
    {
        b1.e();
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        j = null;
        l = null;
        m = b;
        n = 0;
        c();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        j = null;
        if (k == null)
        {
            k = new ay();
        }
        k.a(true);
        k.a(l.b());
        l = null;
        if ((long)n >= d) goto _L2; else goto _L1
_L1:
        n = n + 1;
        m = Math.min(2L * m, c);
        com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Failed to update thread notification settings. Retrying in ").append(m / 1000L).append(" seconds").toString());
        b();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        n = 0;
        m = b;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void a(NotificationSetting notificationsetting)
    {
        o = true;
        this;
        JVM INSTR monitorenter ;
        if (l == null && k == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        this;
        JVM INSTR monitorexit ;
        o = false;
        return;
        NotificationSetting notificationsetting1 = NotificationSetting.b(h.a(n.o, 0L));
        if (notificationsetting.d() != notificationsetting1.d())
        {
            e e1 = h.b();
            e1.a(n.o, notificationsetting.d());
            e1.a();
        }
        this;
        JVM INSTR monitorexit ;
        o = false;
        return;
        notificationsetting;
        this;
        JVM INSTR monitorexit ;
        throw notificationsetting;
        notificationsetting;
        o = false;
        throw notificationsetting;
    }

}
