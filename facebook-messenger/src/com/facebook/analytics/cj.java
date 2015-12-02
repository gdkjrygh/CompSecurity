// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.common.hardware.k;
import com.facebook.common.time.a;
import com.facebook.common.w.m;
import com.facebook.debug.log.b;
import com.google.common.a.ik;
import com.google.common.base.Optional;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.analytics:
//            cn, cb, av

public class cj extends cn
{

    private static final Class b = com/facebook/analytics/cj;

    public cj(av av1, a a1, javax.inject.a a2, k k)
    {
        super(av1, a1, a2, k);
    }

    private void a(String s, Map map)
    {
        cb cb1 = new cb(m.a(s));
        cb1.e("mqtt_client");
        if (map != null)
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); cb1.b((String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            a(map);
        }
        com.facebook.debug.log.b.b(b, "Event name: %s, Event parameters:\n %s", new Object[] {
            s, map
        });
        a.a(cb1);
    }

    public void a()
    {
        a("mqtt_publish_acknowledged_no_listener", ((Map) (null)));
    }

    public void a(int i, int j)
    {
        a("mqtt_connection_retries", a(new String[] {
            "retry_count", String.valueOf(i), "retry_duration_s", String.valueOf(j)
        }));
    }

    public void a(long l, int i, Optional optional)
    {
        Map map = a(new String[] {
            "timespan_ms", String.valueOf(l), "port", String.valueOf(i)
        });
        if (optional.isPresent())
        {
            map.put("error_message", ((Throwable)optional.get()).toString());
        }
        a("mqtt_socket_connect", map);
    }

    public void a(Optional optional, Optional optional1, Optional optional2, Optional optional3, Optional optional4, Optional optional5)
    {
        java.util.HashMap hashmap = ik.a();
        if (optional.isPresent())
        {
            hashmap.put("connected_duration_s", ((Integer)optional.get()).toString());
        }
        if (optional1.isPresent())
        {
            hashmap.put("last_ping_s_ago", ((Integer)optional1.get()).toString());
        }
        if (optional2.isPresent())
        {
            hashmap.put("last_sent_s_ago", ((Integer)optional2.get()).toString());
        }
        if (optional3.isPresent())
        {
            hashmap.put("last_received_s_ago", ((Integer)optional3.get()).toString());
        }
        if (optional4.isPresent())
        {
            hashmap.put("operation", optional4.get());
        }
        if (optional5.isPresent())
        {
            hashmap.put("error_message", ((Throwable)optional5.get()).toString());
        }
        a("mqtt_disconnection_on_failure", ((Map) (hashmap)));
    }

    public void a(String s, int i)
    {
        a(s, a(new String[] {
            "msg_id", String.valueOf(i)
        }));
    }

    public void a(String s, int i, long l)
    {
        a("mqtt_operation_timeout", a(new String[] {
            "operation", s, "msg_id", Integer.toString(i), "timespan_ms", Long.toString(l)
        }));
    }

    public void a(String s, long l)
    {
        a(s, a(new String[] {
            "timespan_ms", String.valueOf(l)
        }));
    }

    public void a(boolean flag, long l, Optional optional, Optional optional1, Optional optional2)
    {
        Map map = a(new String[] {
            "connect_result", String.valueOf(flag), "connect_duration_ms", String.valueOf(l)
        });
        if (optional.isPresent())
        {
            map.put("failure_reason", optional.get());
        }
        if (optional1.isPresent())
        {
            map.put("error_message", ((Exception)optional1.get()).toString());
        }
        if (optional2.isPresent())
        {
            map.put("conack_rc", ((Byte)optional2.get()).toString());
        }
        a("mqtt_connect_attempt", map);
    }

    public void b(String s, long l)
    {
        a("mqtt_response_time", a(new String[] {
            "operation", s, "timespan_ms", String.valueOf(l)
        }));
    }

}
