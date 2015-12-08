// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.analytics.f;
import com.google.android.gms.analytics.g;
import com.google.android.gms.analytics.h;
import com.google.android.gms.b.V;
import com.google.android.gms.b.W;
import com.google.android.gms.b.aj;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            x, g, u, j, 
//            m, n, b, E, 
//            V, w, L, W, 
//            f, F, Z, t, 
//            R

public class v
{

    private static v k;
    final Context a;
    final Context b;
    public final V c = W.c();
    final R d = x.b(this);
    final com.google.android.gms.analytics.internal.g e;
    final com.google.android.gms.analytics.internal.W f;
    final j g;
    public final b h;
    public final E i;
    public final com.google.android.gms.analytics.internal.V j;
    private final aj l;
    private final n m;
    private final m n;
    private final f o;
    private final L p;

    private v(x x1)
    {
        Object obj = x1.a;
        zzx.zzb(obj, "Application context can't be null");
        zzx.zzb(obj instanceof Application, "getApplicationContext didn't return the application");
        Object obj1 = x1.b;
        zzx.zzv(obj1);
        a = ((Context) (obj));
        b = ((Context) (obj1));
        obj1 = new com.google.android.gms.analytics.internal.g(this);
        ((com.google.android.gms.analytics.internal.g) (obj1)).p();
        e = ((com.google.android.gms.analytics.internal.g) (obj1));
        b b1;
        E e1;
        com.google.android.gms.analytics.internal.V v1;
        if (zzd.zzacF)
        {
            a().d((new StringBuilder("Google Analytics ")).append(u.a).append(" is starting up.").toString());
        } else
        {
            a().d((new StringBuilder("Google Analytics ")).append(u.a).append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4").toString());
        }
        obj1 = com.google.android.gms.analytics.internal.x.f(this);
        ((j) (obj1)).p();
        g = ((j) (obj1));
        obj1 = new m(this);
        ((m) (obj1)).p();
        n = ((m) (obj1));
        x1 = new n(this, x1);
        obj1 = x.a(this);
        b1 = new b(this);
        e1 = new E(this);
        v1 = new com.google.android.gms.analytics.internal.V(this);
        obj = aj.a(((Context) (obj)));
        obj.c = new w(this);
        l = ((aj) (obj));
        obj = new f(this);
        ((L) (obj1)).p();
        p = ((L) (obj1));
        b1.p();
        h = b1;
        e1.p();
        i = e1;
        v1.p();
        j = v1;
        obj1 = x.e(this);
        ((com.google.android.gms.analytics.internal.W) (obj1)).p();
        f = ((com.google.android.gms.analytics.internal.W) (obj1));
        x1.p();
        m = x1;
        if (zzd.zzacF)
        {
            a().b("Device AnalyticsService version", u.a);
        }
        obj1 = ((h) (obj)).e.e();
        if (((m) (obj1)).d())
        {
            com.google.android.gms.analytics.internal.f.a().a(((m) (obj1)).e());
        }
        if (((m) (obj1)).h())
        {
            obj.c = ((m) (obj1)).i();
        }
        if (((m) (obj1)).d())
        {
            g g1 = com.google.android.gms.analytics.internal.f.a();
            if (g1 != null)
            {
                g1.a(((m) (obj1)).e());
            }
        }
        obj.a = true;
        o = ((f) (obj));
        ((n) (x1)).a.b();
    }

    public static v a(Context context)
    {
        zzx.zzv(context);
        if (k != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/analytics/internal/v;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        if (k != null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        V v1 = W.c();
        l1 = v1.b();
        context = new v(new x(context.getApplicationContext()));
        k = context;
        com.google.android.gms.analytics.f.a();
        l1 = v1.b() - l1;
        l2 = ((Long)Z.Q.a()).longValue();
        if (l1 <= l2)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        context.a().c("Slow initialization (ms)", Long.valueOf(l1), Long.valueOf(l2));
        com/google/android/gms/analytics/internal/v;
        JVM INSTR monitorexit ;
_L2:
        return k;
        context;
        com/google/android/gms/analytics/internal/v;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static void a(t t1)
    {
        zzx.zzb(t1, "Analytics service not created/initialized");
        zzx.zzb(t1.n(), "Analytics service not initialized");
    }

    public static void g()
    {
        aj.b();
    }

    public final com.google.android.gms.analytics.internal.g a()
    {
        a(((t) (e)));
        return e;
    }

    public final aj b()
    {
        zzx.zzv(l);
        return l;
    }

    public final n c()
    {
        a(m);
        return m;
    }

    public final f d()
    {
        zzx.zzv(o);
        f f1 = o;
        boolean flag;
        if (f1.a && !f1.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "Analytics instance not initialized");
        return o;
    }

    public final m e()
    {
        a(n);
        return n;
    }

    public final L f()
    {
        a(p);
        return p;
    }
}
