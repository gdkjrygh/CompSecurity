// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import com.facebook.common.util.TriState;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

public class VideoDisplayedInfo
{

    private boolean a;
    private final Set b = new HashSet();
    private String c;
    private String d;
    private TriState e;
    private boolean f;

    public VideoDisplayedInfo()
    {
        a = true;
        e = TriState.UNSET;
    }

    private static JSONArray a(Set set)
    {
        return new JSONArray(set);
    }

    public final TriState a()
    {
        return e;
    }

    public final void a(String s)
    {
        d = s;
    }

    public final void a(Set set, String s)
    {
        if (set != null)
        {
            AutoPlayFailureReason autoplayfailurereason;
            for (set = set.iterator(); set.hasNext(); b.add(autoplayfailurereason.value))
            {
                autoplayfailurereason = (AutoPlayFailureReason)set.next();
            }

        }
        c = s;
    }

    public final void a(boolean flag)
    {
        e = TriState.valueOf(flag);
    }

    public final void b(boolean flag)
    {
        f = flag;
        if (flag)
        {
            a = false;
        }
    }

    public final boolean b()
    {
        return f;
    }

    public final Map c()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("initial_event", Boolean.toString(a));
        hashmap.put("autoplay_failure_reasons", a(b).toString());
        hashmap.put("autoplay_setting", c);
        if (d != null)
        {
            hashmap.put("projection", d);
        }
        return hashmap;
    }

    private class AutoPlayFailureReason extends Enum
    {

        private static final AutoPlayFailureReason $VALUES[];
        public static final AutoPlayFailureReason DISABLED_BY_360_AUTOPLAY_SENSOR_REQUIREMENT;
        public static final AutoPlayFailureReason DISABLED_BY_360_AUTOPLAY_WIFI_REQUIREMENT;
        public static final AutoPlayFailureReason DISABLED_BY_ALREADY_SEEN;
        public static final AutoPlayFailureReason DISABLED_BY_AUTOPLAY_SETTING;
        public static final AutoPlayFailureReason DISABLED_BY_CACHE_NOT_READY;
        public static final AutoPlayFailureReason DISABLED_BY_CONNECTION;
        public static final AutoPlayFailureReason DISABLED_BY_LOW_BATTERY;
        public static final AutoPlayFailureReason DISABLED_BY_METERED_NETWORK;
        public static final AutoPlayFailureReason DISABLED_BY_POWER_SAVING;
        public static final AutoPlayFailureReason DISABLED_BY_SERVER;
        public static final AutoPlayFailureReason DISABLED_BY_UNKNOWN_AUTOPLAY_SETTINGS;
        public static final AutoPlayFailureReason DISABLED_BY_ZERORATING;
        public final String value;

        public static AutoPlayFailureReason valueOf(String s)
        {
            return (AutoPlayFailureReason)Enum.valueOf(com/facebook/video/analytics/VideoDisplayedInfo$AutoPlayFailureReason, s);
        }

        public static AutoPlayFailureReason[] values()
        {
            return (AutoPlayFailureReason[])$VALUES.clone();
        }

        static 
        {
            DISABLED_BY_SERVER = new AutoPlayFailureReason("DISABLED_BY_SERVER", 0, "server_blocked");
            DISABLED_BY_AUTOPLAY_SETTING = new AutoPlayFailureReason("DISABLED_BY_AUTOPLAY_SETTING", 1, "user_setting_off");
            DISABLED_BY_CONNECTION = new AutoPlayFailureReason("DISABLED_BY_CONNECTION", 2, "network_connectivity_low");
            DISABLED_BY_ALREADY_SEEN = new AutoPlayFailureReason("DISABLED_BY_ALREADY_SEEN", 3, "video_already_seen");
            DISABLED_BY_UNKNOWN_AUTOPLAY_SETTINGS = new AutoPlayFailureReason("DISABLED_BY_UNKNOWN_AUTOPLAY_SETTINGS", 4, "disabled_by_unknown_settings");
            DISABLED_BY_ZERORATING = new AutoPlayFailureReason("DISABLED_BY_ZERORATING", 5, "zerorating_enabled");
            DISABLED_BY_METERED_NETWORK = new AutoPlayFailureReason("DISABLED_BY_METERED_NETWORK", 6, "user_network_metered");
            DISABLED_BY_LOW_BATTERY = new AutoPlayFailureReason("DISABLED_BY_LOW_BATTERY", 7, "low_battery_level");
            DISABLED_BY_POWER_SAVING = new AutoPlayFailureReason("DISABLED_BY_POWER_SAVING", 8, "power_saving_enabled");
            DISABLED_BY_CACHE_NOT_READY = new AutoPlayFailureReason("DISABLED_BY_CACHE_NOT_READY", 9, "cache_not_ready");
            DISABLED_BY_360_AUTOPLAY_WIFI_REQUIREMENT = new AutoPlayFailureReason("DISABLED_BY_360_AUTOPLAY_WIFI_REQUIREMENT", 10, "user_setting_failed_360_wifi_requirement");
            DISABLED_BY_360_AUTOPLAY_SENSOR_REQUIREMENT = new AutoPlayFailureReason("DISABLED_BY_360_AUTOPLAY_SENSOR_REQUIREMENT", 11, "user_setting_failed_360_sensor_requirement");
            $VALUES = (new AutoPlayFailureReason[] {
                DISABLED_BY_SERVER, DISABLED_BY_AUTOPLAY_SETTING, DISABLED_BY_CONNECTION, DISABLED_BY_ALREADY_SEEN, DISABLED_BY_UNKNOWN_AUTOPLAY_SETTINGS, DISABLED_BY_ZERORATING, DISABLED_BY_METERED_NETWORK, DISABLED_BY_LOW_BATTERY, DISABLED_BY_POWER_SAVING, DISABLED_BY_CACHE_NOT_READY, 
                DISABLED_BY_360_AUTOPLAY_WIFI_REQUIREMENT, DISABLED_BY_360_AUTOPLAY_SENSOR_REQUIREMENT
            });
        }

        private AutoPlayFailureReason(String s, int i, String s1)
        {
            super(s, i);
            value = s1;
        }
    }

}
