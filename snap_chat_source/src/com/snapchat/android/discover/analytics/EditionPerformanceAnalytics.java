// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.analytics;

import Cl;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.discover.model.DSnapPage;
import com.snapchat.android.discover.model.MediaState;
import eB;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import uy;

public final class EditionPerformanceAnalytics
{
    public static final class WaitTimeMetricState extends Enum
    {

        private static final WaitTimeMetricState $VALUES[];
        public static final WaitTimeMetricState NOT_STARTED;
        public static final WaitTimeMetricState REPORTED;
        public static final WaitTimeMetricState TIMING;

        public static WaitTimeMetricState valueOf(String s)
        {
            return (WaitTimeMetricState)Enum.valueOf(com/snapchat/android/discover/analytics/EditionPerformanceAnalytics$WaitTimeMetricState, s);
        }

        public static WaitTimeMetricState[] values()
        {
            return (WaitTimeMetricState[])$VALUES.clone();
        }

        static 
        {
            NOT_STARTED = new WaitTimeMetricState("NOT_STARTED", 0);
            TIMING = new WaitTimeMetricState("TIMING", 1);
            REPORTED = new WaitTimeMetricState("REPORTED", 2);
            $VALUES = (new WaitTimeMetricState[] {
                NOT_STARTED, TIMING, REPORTED
            });
        }

        private WaitTimeMetricState(String s, int i)
        {
            super(s, i);
        }
    }


    public final uy a;
    public final Set b;
    public final Map c;
    public final String d;
    public final MediaOpenOrigin e;
    public int f;

    public EditionPerformanceAnalytics(MediaOpenOrigin mediaopenorigin)
    {
        this(uy.a(), UUID.randomUUID().toString(), mediaopenorigin);
    }

    private EditionPerformanceAnalytics(uy uy1, String s, MediaOpenOrigin mediaopenorigin)
    {
        b = eB.a();
        c = new ConcurrentHashMap();
        a = uy1;
        d = s;
        e = mediaopenorigin;
    }

    public final void a(List list)
    {
        f = list.size() + 1;
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            DSnapPage dsnappage = (DSnapPage)iterator.next();
            list = (WaitTimeMetricState)c.get(dsnappage.a);
            if (list != null && list == WaitTimeMetricState.TIMING && !dsnappage.c().isLoading())
            {
                uy uy1 = a;
                Object obj = dsnappage.a;
                list = dsnappage.c();
                obj = uy1.a("DISCOVER_DSNAP_WAIT_TIME", ((String) (obj)));
                if (obj != null)
                {
                    if (list.isLoading())
                    {
                        list = "loading";
                    } else
                    {
                        list = list.toString().toLowerCase(Locale.ENGLISH);
                    }
                    ((EasyMetric) (obj)).a("type", list).a("reachability", uy1.a.f()).b(false);
                }
                c.put(dsnappage.a, WaitTimeMetricState.REPORTED);
            }
        } while (true);
    }
}
