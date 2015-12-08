// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.location.Criteria;
import android.location.Location;

// Referenced classes of package com.flurry.sdk:
//            hh

public class hg extends hh
{

    public static final Integer a = Integer.valueOf(195);
    public static final Integer b = Integer.valueOf(5);
    public static final Integer c = Integer.valueOf(3);
    public static final Integer d = Integer.valueOf(0);
    public static final String e = null;
    public static final Boolean f = Boolean.valueOf(true);
    public static final Boolean g = Boolean.valueOf(true);
    public static final String h = null;
    public static final Boolean i = Boolean.valueOf(true);
    public static final Criteria j = null;
    public static final Location k = null;
    public static final Long l = Long.valueOf(10000L);
    public static final Boolean m = Boolean.valueOf(true);
    public static final Long n = null;
    public static final Byte o = Byte.valueOf((byte)-1);
    private static hg p;

    private hg()
    {
        c();
    }

    public static hg a()
    {
        com/flurry/sdk/hg;
        JVM INSTR monitorenter ;
        hg hg1;
        if (p == null)
        {
            p = new hg();
        }
        hg1 = p;
        com/flurry/sdk/hg;
        JVM INSTR monitorexit ;
        return hg1;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b()
    {
        com/flurry/sdk/hg;
        JVM INSTR monitorenter ;
        if (p != null)
        {
            p.d();
        }
        p = null;
        com/flurry/sdk/hg;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void c()
    {
        a("AgentVersion", a);
        a("ReleaseMajorVersion", b);
        a("ReleaseMinorVersion", c);
        a("ReleasePatchVersion", d);
        a("ReleaseBetaVersion", "");
        a("VersionName", e);
        a("CaptureUncaughtExceptions", f);
        a("UseHttps", g);
        a("ReportUrl", h);
        a("ReportLocation", i);
        a("ExplicitLocation", k);
        a("ContinueSessionMillis", l);
        a("LogEvents", m);
        a("Age", n);
        a("Gender", o);
        a("UserId", "");
    }

}
