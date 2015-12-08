// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.analytics.scrollperf;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.kit.log.PLog;

// Referenced classes of package com.pinterest.analytics.scrollperf:
//            ScrollPerfTrackerListener, ScrollPerfTracker

public class ScrollPerfCollector
    implements ScrollPerfTrackerListener
{

    ScrollPerfTracker a;
    private long b;
    private double c;
    private double d;
    private boolean e;

    ScrollPerfCollector()
    {
    }

    public static void a(ScrollPerfCollector scrollperfcollector)
    {
        if (scrollperfcollector != null)
        {
            if (!scrollperfcollector.e)
            {
                scrollperfcollector.e = true;
                double d1 = 1.0D - 1.0D / ((double)scrollperfcollector.b / scrollperfcollector.c);
                double d2 = (double)scrollperfcollector.b / scrollperfcollector.c;
                double d3 = (double)scrollperfcollector.b / scrollperfcollector.d;
                JsonObject jsonobject = new JsonObject();
                jsonobject.add("p60fps", new JsonPrimitive(new Double(d1)));
                jsonobject.add("ms_per_small_drop", new JsonPrimitive(new Double(d2)));
                jsonobject.add("ms_per_large_drop", new JsonPrimitive(new Double(d3)));
                AnalyticsApi.a("scroll_perf", scrollperfcollector.b, false, jsonobject.toString());
                PLog.info((new StringBuilder("scroll_perf p60fps:")).append(d1).append(" ms_per_small_drop:").append(d2).append(" ms_per_large_drop:").append(d3).toString(), new Object[0]);
            }
            scrollperfcollector.a.b();
            scrollperfcollector.a = null;
        }
    }

    public void updateDurationAndDropEvents(long l, double d1, double d2)
    {
        b = b + l;
        c = c + d1;
        d = d + d2;
    }

    public void updateStackTrace(String s)
    {
    }
}
