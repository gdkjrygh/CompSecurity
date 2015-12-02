// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import com.facebook.common.w.e;
import com.facebook.debug.b.a;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.a.ev;
import com.google.common.a.ew;
import com.google.common.a.ik;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

// Referenced classes of package com.facebook.prefs.shared:
//            ae, af

public class ah
{

    static final ev a = ev.k().b("/app_info", g).b("//gk", g).b();
    static final ev b = ev.k().b("/auth/", "/auth/user_data/").b("/orca/auth_machine_id", "/auth/auth_machine_id").b("/orca/me_user_version", "/auth/me_user_version").b("/orca/app_info", "/config/app_info").b("/orca/gk/", "/config/gk/").b("/orca/gk_version", "/config/gk/version").b("/orca/rollout/", "/config/rollout").b("/orca/rollout_version", "/config/rollout/version").b("/orca/device_id/", "/shared/device_id").b("/orca/c2dm/", "/messenger/c2dm/").b("/orca/first_install_time", "/messenger/first_install_time").b("/orca/nux_completed", "/messenger/nux_completed").b("/orca/login_reminder_trigger_state", "/messenger/login_reminder_trigger_state").b("/orca/phone_confirm", "/messenger/phone_confirm").b("/orca/sms", "/messages/sms").b("/orca/ui_counters", "/messages/ui_counters").b("/orca/notifications/recent_threads", "/messages/notifications/recent_threads").b("/preferences/notifications/location_services", "/settings/messages/location_services").b("/preferences/notifications", "/settings/messages/notifications").b("/preferences/threads", "/settings/messages/threads").b("/orca/internal/debug_logs", "/settings/logging/debug_logs").b("/orca/internal/logging_level", "/settings/logging/logging_level").b("/orca/internal/php_profiling", "/settings/http/php_profiling").b("/orca/internal/wirehog_profiling", "/settings/http/wirehog_profiling").b("/orca/internal/force_fb4a_look_and_feel", "/settings/messenger/force_fb4a_look_and_feel").b("/orca/internal/web", "/settings/sandbox/web").b("/orca/internal/mqtt", "/settings/sandbox/mqtt").b("/orca/device_id", "/shared/device_id").b("/orca/mqtt", "/mqtt").b("/orca/top_last_active_sync_time", g).b();
    static final ae c = new ae("/fb_android/bookmarks/newsfeed_filter_type_key");
    static final ev d = ev.k().b(Integer.valueOf(0), "most_recent").b(Integer.valueOf(1), "top_stories").b();
    static final ae e = new ae("/orca/pref_version");
    static final ae f = new ae("/_meta_/prefs_version");
    private static final String g = new String();
    private final ObjectMapper h;

    public ah(ObjectMapper objectmapper)
    {
        h = objectmapper;
    }

    private void a(ae ae1, ae ae2, SortedMap sortedmap, SortedMap sortedmap1)
    {
        sortedmap = com.facebook.prefs.shared.af.a(sortedmap, ae1);
        Iterator iterator = sortedmap.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (ae2 != null)
            {
                sortedmap1.put((ae)ae2.c(((ae)entry.getKey()).b(ae1)), entry.getValue());
            }
        } while (true);
        sortedmap.clear();
    }

    private int b(Map map)
    {
        if (map.containsKey(f))
        {
            return ((Integer)map.get(f)).intValue();
        }
        return !map.containsKey(e) ? 0 : 1;
    }

    private SortedMap b(SortedMap sortedmap)
    {
        Object obj = new ae("/auth/user_data/fb_me_user");
        ae ae1 = new ae("/auth/user_data/fb_uid");
        obj = (String)sortedmap.get(obj);
        if (obj == null)
        {
            return sortedmap;
        }
        try
        {
            sortedmap.put(ae1, com.facebook.common.w.e.a(h.readTree(((String) (obj))).get("uid"), null));
        }
        catch (IOException ioexception)
        {
            return sortedmap;
        }
        return sortedmap;
    }

    private SortedMap c(SortedMap sortedmap)
    {
        Object obj = sortedmap.remove(c);
        if (obj instanceof String)
        {
            sortedmap.put(c, obj);
        } else
        if (obj instanceof Integer)
        {
            obj = (Integer)obj;
            obj = (String)d.get(obj);
            if (obj != null)
            {
                sortedmap.put(c, obj);
                return sortedmap;
            }
        }
        return sortedmap;
    }

    public SortedMap a(SortedMap sortedmap)
    {
        sortedmap = a(sortedmap, 4);
        com.facebook.debug.b.a.a(4, b(sortedmap));
        return sortedmap;
    }

    SortedMap a(SortedMap sortedmap, int i)
    {
        Object obj = ik.a(sortedmap);
        int k = b(((Map) (obj)));
        sortedmap = ((SortedMap) (obj));
        int j = k;
        if (k == 0)
        {
            sortedmap = a(((SortedMap) (obj)), ((Map) (a)));
            j = 1;
        }
        obj = sortedmap;
        k = j;
        if (j == 1)
        {
            obj = sortedmap;
            k = j;
            if (j < i)
            {
                sortedmap.remove(e);
                obj = a(sortedmap, ((Map) (b)));
                ((SortedMap) (obj)).put(f, Integer.valueOf(2));
                k = 2;
            }
        }
        sortedmap = ((SortedMap) (obj));
        j = k;
        if (k == 2)
        {
            sortedmap = ((SortedMap) (obj));
            j = k;
            if (k < i)
            {
                sortedmap = b(((SortedMap) (obj)));
                sortedmap.put(f, Integer.valueOf(3));
                j = 3;
            }
        }
        if (j == 3 && j < i)
        {
            c(sortedmap);
            sortedmap.put(f, Integer.valueOf(4));
        }
        return sortedmap;
    }

    SortedMap a(SortedMap sortedmap, Map map)
    {
        java.util.TreeMap treemap = ik.d();
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) 
        {
            map = (java.util.Map.Entry)iterator.next();
            ae ae1 = new ae((String)map.getKey());
            if (map.getValue() != g)
            {
                map = new ae((String)map.getValue());
            } else
            {
                map = null;
            }
            a(ae1, ((ae) (map)), sortedmap, ((SortedMap) (treemap)));
        }
        return treemap;
    }

    public boolean a(Map map)
    {
        return b(map) != 4;
    }

}
