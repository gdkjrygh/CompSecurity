// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import java.util.logging.Logger;

// Referenced classes of package com.skype.android.util:
//            StopWatch

public class PerformanceLog
{

    public static final PerformanceLog a = new PerformanceLog("app ready");
    public static final PerformanceLog b = new PerformanceLog("login");
    public static final PerformanceLog c = new PerformanceLog("logout");
    public static final PerformanceLog d = new PerformanceLog("call");
    public static final PerformanceLog e = new PerformanceLog("startup");
    public static final PerformanceLog f = new PerformanceLog("MNV Profile Services");
    public static final PerformanceLog g = new PerformanceLog("first phase login");
    private static final Logger h = Logger.getLogger("SkypePerf");
    private String i;
    private StopWatch j;
    private boolean k;

    private PerformanceLog(String s)
    {
        i = s;
        if (i == null)
        {
            i = "undefined";
        }
        j = new StopWatch();
    }

    public final long a(String s)
    {
        long l = j.c();
        s = String.format("%s: '%s' checkpoint at %s %s", new Object[] {
            i, s, Long.valueOf(l), "ms"
        });
        h.info(s);
        return l;
    }

    public final void a()
    {
        j.a();
    }

    public final void b()
    {
        k = false;
        h.info((new StringBuilder()).append(i).append(" start").toString());
        j.a();
    }

    public final void c()
    {
        if (!k)
        {
            String s = String.format("%s: took %s %s", new Object[] {
                i, Long.valueOf(j.c()), "ms"
            });
            h.info(s);
        }
        k = true;
    }

}
