// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.adjust.sdk.ActivityKind;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.ActivityState;
import com.adjust.sdk.AdjustAttribution;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

final class acx
{

    private static act i = acl.a();
    Map a;
    AdjustAttribution b;
    String c;
    String d;
    private acj e;
    private acq f;
    private ActivityState g;
    private long h;

    public acx(acj acj1, acq acq1, ActivityState activitystate, long l)
    {
        e = acj1;
        f = acq1;
        if (activitystate == null)
        {
            acj1 = null;
        } else
        {
            acj1 = activitystate.a();
        }
        g = acj1;
        h = l;
    }

    private void a(Map map)
    {
        a(map, "mac_sha1", f.a);
        a(map, "mac_md5", f.b);
        a(map, "android_id", f.c);
    }

    static void a(Map map, String s, long l)
    {
        if (l < 0L)
        {
            return;
        } else
        {
            a(map, s, adf.a(l));
            return;
        }
    }

    private static void a(Map map, String s, Boolean boolean1)
    {
        if (boolean1 == null)
        {
            return;
        }
        int j;
        if (boolean1.booleanValue())
        {
            j = 1;
        } else
        {
            j = 0;
        }
        b(map, s, j);
    }

    static void a(Map map, String s, String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return;
        } else
        {
            map.put(s, s1);
            return;
        }
    }

    static void a(Map map, String s, Map map1)
    {
        while (map1 == null || map1.size() == 0) 
        {
            return;
        }
        a(map, s, (new JSONObject(map1)).toString());
    }

    private void b(Map map)
    {
        a(map, "app_token", e.b);
        a(map, "environment", e.c);
        a(map, "device_known", ((Boolean) (null)));
        a(map, "needs_attribution_data", Boolean.valueOf(false));
        a(map, "gps_adid", ada.a(e.a));
        a(map, "tracking_enabled", ada.b(e.a));
    }

    private static void b(Map map, String s, long l)
    {
        if (l < 0L)
        {
            return;
        } else
        {
            a(map, s, Long.toString(l));
            return;
        }
    }

    private Map c()
    {
        HashMap hashmap = new HashMap();
        a(hashmap);
        a(hashmap, "fb_id", f.d);
        a(hashmap, "package_name", f.f);
        a(hashmap, "app_version", f.g);
        a(hashmap, "device_type", f.h);
        a(hashmap, "device_name", f.i);
        a(hashmap, "device_manufacturer", f.j);
        a(hashmap, "os_name", f.k);
        a(hashmap, "os_version", f.l);
        a(hashmap, "language", f.m);
        a(hashmap, "country", f.n);
        a(hashmap, "screen_size", f.o);
        a(hashmap, "screen_format", f.p);
        a(hashmap, "screen_density", f.q);
        a(hashmap, "display_width", f.r);
        a(hashmap, "display_height", f.s);
        e(hashmap);
        b(hashmap);
        a(hashmap, "android_uuid", g.uuid);
        b(hashmap, "session_count", g.sessionCount);
        b(hashmap, "subsession_count", g.subsessionCount);
        c(((Map) (hashmap)), "session_length", g.sessionLength);
        c(((Map) (hashmap)), "time_spent", g.timeSpent);
        c(((Map) (hashmap)));
        d(hashmap);
        return hashmap;
    }

    private void c(Map map)
    {
        a(map, "created_at", h);
    }

    private static void c(Map map, String s, long l)
    {
        if (l < 0L)
        {
            return;
        } else
        {
            b(map, s, (500L + l) / 1000L);
            return;
        }
    }

    private static void d(Map map)
    {
        if (!map.containsKey("mac_sha1") && !map.containsKey("mac_md5") && !map.containsKey("android_id") && !map.containsKey("gps_adid"))
        {
            i.e("Missing device id's. Please check if Proguard is correctly set with Adjust SDK", new Object[0]);
        }
    }

    private void e(Map map)
    {
        if (f.t != null)
        {
            Iterator iterator = f.t.entrySet().iterator();
            while (iterator.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                a(map, (String)entry.getKey(), (String)entry.getValue());
            }
        }
    }

    public final ActivityPackage a()
    {
        Map map = c();
        c(map, "last_interval", g.lastInterval);
        a(map, "default_tracker", ((String) (null)));
        ActivityPackage activitypackage = a(ActivityKind.b);
        activitypackage.path = "/session";
        activitypackage.suffix = "";
        activitypackage.parameters = map;
        return activitypackage;
    }

    public final ActivityPackage a(ack ack1)
    {
        Map map = c();
        b(map, "event_count", g.eventCount);
        a(map, "event_token", ack1.a);
        Object obj = ack1.b;
        a(map, "currency", ack1.c);
        a(map, "callback_params", ack1.d);
        a(map, "partner_params", ack1.e);
        obj = a(ActivityKind.c);
        obj.path = "/event";
        Double double1 = ack1.b;
        obj.suffix = String.format(Locale.US, "'%s'", new Object[] {
            ack1.a
        });
        obj.parameters = map;
        return ((ActivityPackage) (obj));
    }

    final ActivityPackage a(ActivityKind activitykind)
    {
        activitykind = new ActivityPackage(activitykind);
        activitykind.clientSdk = f.e;
        return activitykind;
    }

    final Map b()
    {
        HashMap hashmap = new HashMap();
        a(hashmap);
        b(((Map) (hashmap)));
        c(hashmap);
        d(hashmap);
        return hashmap;
    }

}
