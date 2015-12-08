// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.location.Criteria;

// Referenced classes of package com.flurry.sdk:
//            dq

public class dp
{

    public static final Integer a = Integer.valueOf(172);
    public static final Integer b = Integer.valueOf(4);
    public static final Integer c = Integer.valueOf(2);
    public static final Integer d = Integer.valueOf(0);
    public static final String e = null;
    public static final Boolean f = Boolean.valueOf(true);
    public static final Boolean g = Boolean.valueOf(true);
    public static final String h = null;
    public static final Boolean i = Boolean.valueOf(true);
    public static final Criteria j = null;
    public static final Long k = Long.valueOf(10000L);
    public static final Boolean l = Boolean.valueOf(true);
    public static final Long m = Long.valueOf(0L);
    public static final Byte n = Byte.valueOf((byte)-1);
    private static dq o;

    public static dq a()
    {
        com/flurry/sdk/dp;
        JVM INSTR monitorenter ;
        dq dq1;
        if (o == null)
        {
            o = new dq();
            b();
        }
        dq1 = o;
        com/flurry/sdk/dp;
        JVM INSTR monitorexit ;
        return dq1;
        Exception exception;
        exception;
        throw exception;
    }

    private static void b()
    {
        if (o == null)
        {
            o = new dq();
        }
        o.a("AgentVersion", a);
        o.a("ReleaseMajorVersion", b);
        o.a("ReleaseMinorVersion", c);
        o.a("ReleasePatchVersion", d);
        o.a("ReleaseBetaVersion", "");
        o.a("VersionName", e);
        o.a("CaptureUncaughtExceptions", f);
        o.a("UseHttps", g);
        o.a("ReportUrl", h);
        o.a("ReportLocation", i);
        o.a("LocationCriteria", j);
        o.a("ContinueSessionMillis", k);
        o.a("LogEvents", l);
        o.a("Age", m);
        o.a("Gender", n);
        o.a("UserId", "");
    }

}
