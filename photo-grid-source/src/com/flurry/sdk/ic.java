// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.location.Location;
import java.util.Map;

// Referenced classes of package com.flurry.sdk:
//            kh, kc, lp, jb, 
//            hj, jg, lg

public class ic extends kh
{

    private static final String a = com/flurry/sdk/ic.getSimpleName();

    public ic()
    {
    }

    private String a(String s, String s1, Map map)
    {
        if (a("timestamp_epoch_millis", s1))
        {
            map = String.valueOf(System.currentTimeMillis());
            kc.a(3, a, (new StringBuilder("Replacing param timestamp_epoch_millis with: ")).append(map).toString());
            return s.replace(s1, lp.c(map));
        }
        if (a("session_duration_millis", s1))
        {
            map = Long.toString(jb.a().f());
            kc.a(3, a, (new StringBuilder("Replacing param session_duration_millis with: ")).append(map).toString());
            return s.replace(s1, lp.c(map));
        }
        if (a("fg_timespent_millis", s1))
        {
            map = Long.toString(jb.a().f());
            kc.a(3, a, (new StringBuilder("Replacing param fg_timespent_millis with: ")).append(map).toString());
            return s.replace(s1, lp.c(map));
        }
        if (a("install_referrer", s1))
        {
            String s2 = (new hj()).b();
            map = s2;
            if (s2 == null)
            {
                map = "";
            }
            kc.a(3, a, (new StringBuilder("Replacing param install_referrer with: ")).append(map).toString());
            return s.replace(s1, lp.c(map));
        }
        if (a("geo_latitude", s1))
        {
            Location location = jg.a().e();
            map = "";
            if (location != null)
            {
                map = (new StringBuilder()).append("").append(lp.a(location.getLatitude(), 3)).toString();
            }
            kc.a(3, a, (new StringBuilder("Replacing param geo_latitude with: ")).append(map).toString());
            return s.replace(s1, lp.c(map));
        }
        if (a("geo_longitude", s1))
        {
            Location location1 = jg.a().e();
            map = "";
            if (location1 != null)
            {
                map = (new StringBuilder()).append("").append(lp.a(location1.getLongitude(), 3)).toString();
            }
            kc.a(3, a, (new StringBuilder("Replacing param geo_longitude with: ")).append(map).toString());
            return s.replace(s1, lp.c(map));
        }
        if (a("publisher_user_id", s1))
        {
            map = (String)lg.a().a("UserId");
            kc.a(3, a, (new StringBuilder("Replacing param publisher_user_id with: ")).append(map).toString());
            return s.replace(s1, lp.c(map));
        }
        if (a("event_name", s1))
        {
            if (map != null && map.containsKey("event_name"))
            {
                kc.a(3, a, (new StringBuilder("Replacing param event_name with: ")).append((String)map.get("event_name")).toString());
                return s.replace(s1, lp.c((String)map.get("event_name")));
            } else
            {
                kc.a(3, a, "Replacing param event_name with empty string");
                return s.replace(s1, "");
            }
        }
        if (a("event_time_millis", s1))
        {
            if (map != null && map.containsKey("event_time_millis"))
            {
                kc.a(3, a, (new StringBuilder("Replacing param event_time_millis with: ")).append((String)map.get("event_time_millis")).toString());
                return s.replace(s1, lp.c((String)map.get("event_time_millis")));
            } else
            {
                kc.a(3, a, "Replacing param event_time_millis with empty string");
                return s.replace(s1, "");
            }
        } else
        {
            kc.a(3, a, (new StringBuilder("Unknown param: ")).append(s1).toString());
            return s.replace(s1, "");
        }
    }

    public String a(String s, Map map)
    {
        String s2 = a(s);
        String s1 = s;
        for (s = s2; s != null; s = a(s1))
        {
            s1 = a(s1, s, map);
        }

        return s1;
    }

}
