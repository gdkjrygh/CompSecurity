// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt.abtest;

import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.google.common.a.ev;
import com.google.common.a.fi;
import com.google.common.a.ik;
import com.google.common.base.Optional;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.facebook.push.mqtt.abtest:
//            a, e, b

class c
    implements com.facebook.abtest.qe.d.c
{

    private c()
    {
    }

    c(b b1)
    {
        this();
    }

    public Object a(QuickExperimentInfo quickexperimentinfo)
    {
        return b(quickexperimentinfo);
    }

    public e b(QuickExperimentInfo quickexperimentinfo)
    {
        if (quickexperimentinfo == null || !quickexperimentinfo.c())
        {
            return a.b;
        }
        java.util.HashMap hashmap = ik.a(a.c);
        Iterator iterator = a.c.i_().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (quickexperimentinfo.a(s).isPresent())
            {
                int i = Integer.valueOf((String)quickexperimentinfo.a(s).get()).intValue();
                if (i >= 0)
                {
                    hashmap.put(s, Integer.valueOf(i));
                }
            }
        } while (true);
        return new e(((Integer)hashmap.get("dns_timeout_sec")).intValue(), ((Integer)hashmap.get("tcp_connect_timeout_sec")).intValue(), ((Integer)hashmap.get("mqtt_connect_timeout_sec")).intValue(), ((Integer)hashmap.get("mqtt_response_timeout_sec")).intValue(), ((Integer)hashmap.get("back_to_back_retry_attempts")).intValue(), ((Integer)hashmap.get("back_to_back_retry_interval_sec")).intValue(), ((Integer)hashmap.get("back_off_initial_retry_interval_sec")).intValue(), ((Integer)hashmap.get("back_off_max_retry_interval_sec")).intValue(), ((Integer)hashmap.get("foreground_keepalive_interval_sec")).intValue(), ((Integer)hashmap.get("background_keepalive_interval_persistent_sec")).intValue(), ((Integer)hashmap.get("background_keepalive_interval_transient_sec")).intValue(), ((Integer)hashmap.get("mqtt_reconnect_for_operations")).intValue());
    }
}
