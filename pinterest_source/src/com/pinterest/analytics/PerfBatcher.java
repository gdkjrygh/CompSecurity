// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.analytics;

import com.pinterest.api.ApiHttpClient;
import com.pinterest.api.RequestParams;

// Referenced classes of package com.pinterest.analytics:
//            PerfBatch, PerfIntervalCallback, PerfEvent

public class PerfBatcher
{

    private static int a = 2500;
    private static int b = 5;
    private static String c = ApiHttpClient.getAbsoluteLoggingApiUrl("batch/");
    private static PerfBatcher d;
    private PerfIntervalCallback e;
    private PerfBatch f;

    public PerfBatcher()
    {
        this(new PerfBatch(a, b));
    }

    private PerfBatcher(PerfBatch perfbatch)
    {
        this(perfbatch, new PerfIntervalCallback("PerfBatcher", c, perfbatch));
    }

    private PerfBatcher(PerfBatch perfbatch, PerfIntervalCallback perfintervalcallback)
    {
        f = perfbatch;
        e = perfintervalcallback;
    }

    public static PerfBatcher a()
    {
        if (d == null)
        {
            PerfBatcher perfbatcher = new PerfBatcher();
            d = perfbatcher;
            perfbatcher.e.a();
        }
        return d;
    }

    public final void a(String s, RequestParams requestparams)
    {
        requestparams = new PerfEvent(s, requestparams);
        synchronized (f)
        {
            f.a(requestparams);
        }
        return;
        requestparams;
        s;
        JVM INSTR monitorexit ;
        throw requestparams;
    }

}
