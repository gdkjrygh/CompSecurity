// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.metadata;


public final class DefaultMetadataKeys extends Enum
{

    private static final DefaultMetadataKeys $VALUES[];
    public static final DefaultMetadataKeys ADVERTISING_METADATA;
    public static final DefaultMetadataKeys AD_BREAK_AS_WATCHED_KEY;
    public static final DefaultMetadataKeys AD_SIGNALING_MODE_KEY;
    public static final DefaultMetadataKeys AUDITUDE_METADATA_KEY;
    public static final DefaultMetadataKeys BLACKOUT_METADATA_KEY;
    public static final DefaultMetadataKeys CUSTOM_AD_MARKERS_METADATA_KEY;
    public static final DefaultMetadataKeys CUSTOM_PARAMETERS;
    public static final DefaultMetadataKeys DISABLE_CONTENT_CACHING;
    public static final DefaultMetadataKeys DRM_ERROR_STRING;
    public static final DefaultMetadataKeys ENABLE_LIVE_PRE_ROLL;
    public static final DefaultMetadataKeys JSON_METADATA_KEY;
    public static final DefaultMetadataKeys MARKER_CONTENT_DURATION_KEY;
    public static final DefaultMetadataKeys MARKER_CONTENT_ID_KEY;
    public static final DefaultMetadataKeys MARKER_KEY;
    public static final DefaultMetadataKeys METADATA_KEY_ADJUST_SEEK_ENABLED;
    public static final DefaultMetadataKeys METADATA_KEY_TYPE;
    public static final DefaultMetadataKeys NATIVE_SUBERROR_CODE;
    public static final DefaultMetadataKeys NETWORK_CONFIGURATION;
    public static final DefaultMetadataKeys NIELSEN_TRACKING_METADATA_KEY;
    public static final DefaultMetadataKeys TIME_RANGES_METADATA_KEY;
    public static final DefaultMetadataKeys VIDEO_ANALYTICS_METADATA_KEY;
    private final String _value;

    private DefaultMetadataKeys(String s, int i, String s1)
    {
        super(s, i);
        _value = s1;
    }

    public static DefaultMetadataKeys valueOf(String s)
    {
        return (DefaultMetadataKeys)Enum.valueOf(com/adobe/mediacore/metadata/DefaultMetadataKeys, s);
    }

    public static DefaultMetadataKeys[] values()
    {
        return (DefaultMetadataKeys[])$VALUES.clone();
    }

    public String getValue()
    {
        return _value;
    }

    static 
    {
        ADVERTISING_METADATA = new DefaultMetadataKeys("ADVERTISING_METADATA", 0, "advertising_metadata");
        AUDITUDE_METADATA_KEY = new DefaultMetadataKeys("AUDITUDE_METADATA_KEY", 1, "auditude_metadata");
        JSON_METADATA_KEY = new DefaultMetadataKeys("JSON_METADATA_KEY", 2, "json_metadata");
        VIDEO_ANALYTICS_METADATA_KEY = new DefaultMetadataKeys("VIDEO_ANALYTICS_METADATA_KEY", 3, "video_analytics_metadata_key");
        CUSTOM_AD_MARKERS_METADATA_KEY = new DefaultMetadataKeys("CUSTOM_AD_MARKERS_METADATA_KEY", 4, "custom_ad_markers_metadata_key");
        BLACKOUT_METADATA_KEY = new DefaultMetadataKeys("BLACKOUT_METADATA_KEY", 5, "blackout_metadata_key");
        TIME_RANGES_METADATA_KEY = new DefaultMetadataKeys("TIME_RANGES_METADATA_KEY", 6, "time_ranges_metadata_key");
        ENABLE_LIVE_PRE_ROLL = new DefaultMetadataKeys("ENABLE_LIVE_PRE_ROLL", 7, "enable_live_pre_roll");
        METADATA_KEY_TYPE = new DefaultMetadataKeys("METADATA_KEY_TYPE", 8, "type");
        METADATA_KEY_ADJUST_SEEK_ENABLED = new DefaultMetadataKeys("METADATA_KEY_ADJUST_SEEK_ENABLED", 9, "adjust-seek-enabled");
        CUSTOM_PARAMETERS = new DefaultMetadataKeys("CUSTOM_PARAMETERS", 10, "custom_parameters");
        MARKER_KEY = new DefaultMetadataKeys("MARKER_KEY", 11, "marker_key");
        MARKER_CONTENT_ID_KEY = new DefaultMetadataKeys("MARKER_CONTENT_ID_KEY", 12, "content_id_key");
        MARKER_CONTENT_DURATION_KEY = new DefaultMetadataKeys("MARKER_CONTENT_DURATION_KEY", 13, "content_duration_key");
        AD_SIGNALING_MODE_KEY = new DefaultMetadataKeys("AD_SIGNALING_MODE_KEY", 14, "ad_signaling_mode");
        AD_BREAK_AS_WATCHED_KEY = new DefaultMetadataKeys("AD_BREAK_AS_WATCHED_KEY", 15, "ad_break_as_watched");
        DISABLE_CONTENT_CACHING = new DefaultMetadataKeys("DISABLE_CONTENT_CACHING", 16, "disable_content_caching");
        NETWORK_CONFIGURATION = new DefaultMetadataKeys("NETWORK_CONFIGURATION", 17, "network-configuration");
        NIELSEN_TRACKING_METADATA_KEY = new DefaultMetadataKeys("NIELSEN_TRACKING_METADATA_KEY", 18, "nielsen_tracking_metadata_key");
        NATIVE_SUBERROR_CODE = new DefaultMetadataKeys("NATIVE_SUBERROR_CODE", 19, "NATIVE_SUBERROR_CODE");
        DRM_ERROR_STRING = new DefaultMetadataKeys("DRM_ERROR_STRING", 20, "DRM_ERROR_STRING");
        $VALUES = (new DefaultMetadataKeys[] {
            ADVERTISING_METADATA, AUDITUDE_METADATA_KEY, JSON_METADATA_KEY, VIDEO_ANALYTICS_METADATA_KEY, CUSTOM_AD_MARKERS_METADATA_KEY, BLACKOUT_METADATA_KEY, TIME_RANGES_METADATA_KEY, ENABLE_LIVE_PRE_ROLL, METADATA_KEY_TYPE, METADATA_KEY_ADJUST_SEEK_ENABLED, 
            CUSTOM_PARAMETERS, MARKER_KEY, MARKER_CONTENT_ID_KEY, MARKER_CONTENT_DURATION_KEY, AD_SIGNALING_MODE_KEY, AD_BREAK_AS_WATCHED_KEY, DISABLE_CONTENT_CACHING, NETWORK_CONFIGURATION, NIELSEN_TRACKING_METADATA_KEY, NATIVE_SUBERROR_CODE, 
            DRM_ERROR_STRING
        });
    }
}
