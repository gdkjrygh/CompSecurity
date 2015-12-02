// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class value extends Enum
{

    private static final DISABLED_BY_360_AUTOPLAY_SENSOR_REQUIREMENT $VALUES[];
    public static final DISABLED_BY_360_AUTOPLAY_SENSOR_REQUIREMENT DISABLED_BY_360_AUTOPLAY_SENSOR_REQUIREMENT;
    public static final DISABLED_BY_360_AUTOPLAY_SENSOR_REQUIREMENT DISABLED_BY_360_AUTOPLAY_WIFI_REQUIREMENT;
    public static final DISABLED_BY_360_AUTOPLAY_SENSOR_REQUIREMENT DISABLED_BY_ALREADY_SEEN;
    public static final DISABLED_BY_360_AUTOPLAY_SENSOR_REQUIREMENT DISABLED_BY_AUTOPLAY_SETTING;
    public static final DISABLED_BY_360_AUTOPLAY_SENSOR_REQUIREMENT DISABLED_BY_CACHE_NOT_READY;
    public static final DISABLED_BY_360_AUTOPLAY_SENSOR_REQUIREMENT DISABLED_BY_CONNECTION;
    public static final DISABLED_BY_360_AUTOPLAY_SENSOR_REQUIREMENT DISABLED_BY_LOW_BATTERY;
    public static final DISABLED_BY_360_AUTOPLAY_SENSOR_REQUIREMENT DISABLED_BY_METERED_NETWORK;
    public static final DISABLED_BY_360_AUTOPLAY_SENSOR_REQUIREMENT DISABLED_BY_POWER_SAVING;
    public static final DISABLED_BY_360_AUTOPLAY_SENSOR_REQUIREMENT DISABLED_BY_SERVER;
    public static final DISABLED_BY_360_AUTOPLAY_SENSOR_REQUIREMENT DISABLED_BY_UNKNOWN_AUTOPLAY_SETTINGS;
    public static final DISABLED_BY_360_AUTOPLAY_SENSOR_REQUIREMENT DISABLED_BY_ZERORATING;
    public final String value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/facebook/video/analytics/VideoDisplayedInfo$AutoPlayFailureReason, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    static 
    {
        DISABLED_BY_SERVER = new <init>("DISABLED_BY_SERVER", 0, "server_blocked");
        DISABLED_BY_AUTOPLAY_SETTING = new <init>("DISABLED_BY_AUTOPLAY_SETTING", 1, "user_setting_off");
        DISABLED_BY_CONNECTION = new <init>("DISABLED_BY_CONNECTION", 2, "network_connectivity_low");
        DISABLED_BY_ALREADY_SEEN = new <init>("DISABLED_BY_ALREADY_SEEN", 3, "video_already_seen");
        DISABLED_BY_UNKNOWN_AUTOPLAY_SETTINGS = new <init>("DISABLED_BY_UNKNOWN_AUTOPLAY_SETTINGS", 4, "disabled_by_unknown_settings");
        DISABLED_BY_ZERORATING = new <init>("DISABLED_BY_ZERORATING", 5, "zerorating_enabled");
        DISABLED_BY_METERED_NETWORK = new <init>("DISABLED_BY_METERED_NETWORK", 6, "user_network_metered");
        DISABLED_BY_LOW_BATTERY = new <init>("DISABLED_BY_LOW_BATTERY", 7, "low_battery_level");
        DISABLED_BY_POWER_SAVING = new <init>("DISABLED_BY_POWER_SAVING", 8, "power_saving_enabled");
        DISABLED_BY_CACHE_NOT_READY = new <init>("DISABLED_BY_CACHE_NOT_READY", 9, "cache_not_ready");
        DISABLED_BY_360_AUTOPLAY_WIFI_REQUIREMENT = new <init>("DISABLED_BY_360_AUTOPLAY_WIFI_REQUIREMENT", 10, "user_setting_failed_360_wifi_requirement");
        DISABLED_BY_360_AUTOPLAY_SENSOR_REQUIREMENT = new <init>("DISABLED_BY_360_AUTOPLAY_SENSOR_REQUIREMENT", 11, "user_setting_failed_360_sensor_requirement");
        $VALUES = (new .VALUES[] {
            DISABLED_BY_SERVER, DISABLED_BY_AUTOPLAY_SETTING, DISABLED_BY_CONNECTION, DISABLED_BY_ALREADY_SEEN, DISABLED_BY_UNKNOWN_AUTOPLAY_SETTINGS, DISABLED_BY_ZERORATING, DISABLED_BY_METERED_NETWORK, DISABLED_BY_LOW_BATTERY, DISABLED_BY_POWER_SAVING, DISABLED_BY_CACHE_NOT_READY, 
            DISABLED_BY_360_AUTOPLAY_WIFI_REQUIREMENT, DISABLED_BY_360_AUTOPLAY_SENSOR_REQUIREMENT
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
