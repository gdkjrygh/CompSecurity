// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.util.ArrayMap;
import com.ubercab.analytics.model.AnalyticsLocation;
import com.ubercab.analytics.model.Device;
import com.ubercab.analytics.monitoring.model.MonitoringEvent;
import com.ubercab.analytics.network.AnalyticsApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class cig
{

    private final AnalyticsApi a;
    private final chu b;
    private final List c = Collections.synchronizedList(new LinkedList());
    private final Device d;
    private final boolean e = false;
    private boolean f;
    private cij g;

    public cig(AnalyticsApi analyticsapi, chu chu, Device device)
    {
        f = false;
        a = analyticsapi;
        b = chu;
        d = device;
    }

    static boolean a(cig cig1)
    {
        return cig1.e;
    }

    private Map b(MonitoringEvent monitoringevent)
    {
        HashMap hashmap = new HashMap();
        if (g != null)
        {
            Map map = g.a();
            String s;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); hashmap.put(s, map.get(s)))
            {
                s = (String)iterator.next();
            }

        }
        hashmap.put("epoch_ms", Long.valueOf(System.currentTimeMillis()));
        hashmap.put("location", AnalyticsLocation.create(b));
        hashmap.put("device", d);
        if (monitoringevent != null)
        {
            hashmap.put("method", monitoringevent.getMethod());
            hashmap.put("hostname", monitoringevent.getHostname());
            hashmap.put("path", monitoringevent.getPath());
            hashmap.put("message_type", monitoringevent.getMessageType());
            hashmap.put("api_command_path", monitoringevent.getApiCommandPath());
            hashmap.put("status_code", Integer.valueOf(monitoringevent.getStatusCode()));
            hashmap.put("response_type", monitoringevent.getResponseType());
            hashmap.put("roundtrip_time_ms", Long.valueOf(monitoringevent.getRoundtripTimeMs()));
        }
        return hashmap;
    }

    public final void a()
    {
        if (c.isEmpty())
        {
            return;
        } else
        {
            ArrayMap arraymap = new ArrayMap(1);
            arraymap.put("events", new ArrayList(c));
            a.sendMonitoring(arraymap, new _cls1());
            c.clear();
            return;
        }
    }

    public final void a(cij cij1)
    {
        g = cij1;
    }

    public final void a(MonitoringEvent monitoringevent)
    {
        if (f)
        {
            c.add(b(monitoringevent));
        }
    }

    public final void a(boolean flag)
    {
        f = flag;
    }

    /* member class not found */
    class _cls1 {}

}
