// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.internal.ef;
import com.google.android.gms.internal.em;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            ae, r, w, ac, 
//            u, c, h, ab, 
//            z

public final class j extends ae
{

    static final String a;
    private Boolean b;

    j(ac ac)
    {
        super(ac);
    }

    public static long B()
    {
        return ((Long)r.o.a()).longValue();
    }

    public static long C()
    {
        return ((Long)r.k.a()).longValue();
    }

    public static long D()
    {
        return 20L;
    }

    public static long E()
    {
        return Math.max(0L, ((Long)r.e.a()).longValue());
    }

    public static int F()
    {
        return ((Integer)com.google.android.gms.measurement.internal.r.f.a()).intValue();
    }

    public static int G()
    {
        return Math.max(0, ((Integer)r.g.a()).intValue());
    }

    public static String H()
    {
        return (String)r.h.a();
    }

    public static long I()
    {
        return Math.max(0L, ((Long)r.i.a()).longValue());
    }

    public static long J()
    {
        return Math.max(0L, ((Long)r.j.a()).longValue());
    }

    public static long K()
    {
        return Math.max(0L, ((Long)r.l.a()).longValue());
    }

    public static long L()
    {
        return Math.max(0L, ((Long)r.m.a()).longValue());
    }

    public static int M()
    {
        return Math.min(20, Math.max(0, ((Integer)r.n.a()).intValue()));
    }

    static String a()
    {
        return (String)r.c.a();
    }

    public static int b()
    {
        return 24;
    }

    static int o()
    {
        return 36;
    }

    static int p()
    {
        return 36;
    }

    static int q()
    {
        return 20;
    }

    static long r()
    {
        return 0x36ee80L;
    }

    static long s()
    {
        return 60000L;
    }

    static long t()
    {
        return 61000L;
    }

    static long u()
    {
        return ((Long)r.d.a()).longValue();
    }

    static long v()
    {
        return ((Long)r.p.a()).longValue();
    }

    public static String w()
    {
        return "google_app_measurement.db";
    }

    public static String x()
    {
        return "google_app_measurement2.db";
    }

    public static long y()
    {
        return (long)(b.a / 1000);
    }

    public static boolean z()
    {
        return f.a;
    }

    public final boolean A()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (b != null) goto _L4; else goto _L3
_L3:
        String s1;
        Object obj;
        obj = super.i().getApplicationInfo();
        s1 = em.a(super.i(), Process.myPid());
        if (obj == null) goto _L6; else goto _L5
_L5:
        obj = ((ApplicationInfo) (obj)).processName;
        if (obj == null) goto _L8; else goto _L7
_L7:
        if (!((String) (obj)).equals(s1)) goto _L8; else goto _L9
_L9:
        boolean flag = true;
_L11:
        b = Boolean.valueOf(flag);
_L6:
        if (b == null)
        {
            b = Boolean.TRUE;
            super.l().a.a("My process not in the list of running processes");
        }
_L4:
        this;
        JVM INSTR monitorexit ;
_L2:
        return b.booleanValue();
_L8:
        flag = false;
        if (true) goto _L11; else goto _L10
_L10:
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final volatile void c()
    {
        super.c();
    }

    public final volatile void d()
    {
        super.d();
    }

    public final volatile void e()
    {
        super.e();
    }

    public final volatile u f()
    {
        return super.f();
    }

    public final volatile c g()
    {
        return super.g();
    }

    public final volatile ef h()
    {
        return super.h();
    }

    public final volatile Context i()
    {
        return super.i();
    }

    public final volatile h j()
    {
        return super.j();
    }

    public final volatile ab k()
    {
        return super.k();
    }

    public final volatile w l()
    {
        return super.l();
    }

    public final volatile z m()
    {
        return super.m();
    }

    public final volatile j n()
    {
        return super.n();
    }

    static 
    {
        a = String.valueOf(b.a / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
    }
}
