// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class value extends Enum
{

    private static final FB_BANDWIDTH_ESTIMATE $VALUES[];
    public static final FB_BANDWIDTH_ESTIMATE API_CONFIG;
    public static final FB_BANDWIDTH_ESTIMATE BOARD;
    public static final FB_BANDWIDTH_ESTIMATE BRAND;
    public static final FB_BANDWIDTH_ESTIMATE CHANNEL_ELIGIBILITY;
    public static final FB_BANDWIDTH_ESTIMATE CURRENT_VOLUME;
    public static final FB_BANDWIDTH_ESTIMATE DEVICE;
    public static final FB_BANDWIDTH_ESTIMATE FB_BANDWIDTH_ESTIMATE;
    public static final FB_BANDWIDTH_ESTIMATE IS_LONG_CLICK;
    public static final FB_BANDWIDTH_ESTIMATE LAST_START_POSITION_PARAM;
    public static final FB_BANDWIDTH_ESTIMATE MANUFACTURER;
    public static final FB_BANDWIDTH_ESTIMATE MODEL;
    public static final FB_BANDWIDTH_ESTIMATE MONETIZATION_IDS;
    public static final FB_BANDWIDTH_ESTIMATE PERCENT_BUFFERED;
    public static final FB_BANDWIDTH_ESTIMATE PLAYER_ALLOCATED;
    public static final FB_BANDWIDTH_ESTIMATE PLAYER_ORIGIN;
    public static final FB_BANDWIDTH_ESTIMATE PLAYER_SUBORIGIN;
    public static final FB_BANDWIDTH_ESTIMATE PREVIOUS_VIDEO_ID;
    public static final FB_BANDWIDTH_ESTIMATE PRODUCT;
    public static final FB_BANDWIDTH_ESTIMATE RELEASE_FROM;
    public static final FB_BANDWIDTH_ESTIMATE REQUESTED_STATE;
    public static final FB_BANDWIDTH_ESTIMATE SEEK_SOURCE_POSITION_PARAM;
    public static final FB_BANDWIDTH_ESTIMATE SEQUENCE_NUMBER;
    public static final FB_BANDWIDTH_ESTIMATE SKIP_AD_REASON;
    public static final FB_BANDWIDTH_ESTIMATE SOURCE_INDEX;
    public static final FB_BANDWIDTH_ESTIMATE STALL_COUNT;
    public static final FB_BANDWIDTH_ESTIMATE STALL_TIME;
    public static final FB_BANDWIDTH_ESTIMATE STREAMING_FORMAT;
    public static final FB_BANDWIDTH_ESTIMATE STREAM_BITRATE;
    public static final FB_BANDWIDTH_ESTIMATE STREAM_MIME_TYPE;
    public static final FB_BANDWIDTH_ESTIMATE STREAM_REPRESENTATION_EVENT_SOURCE;
    public static final FB_BANDWIDTH_ESTIMATE STREAM_REPRESENTATION_ID;
    public static final FB_BANDWIDTH_ESTIMATE STREAM_TYPE;
    public static final FB_BANDWIDTH_ESTIMATE STREAM_VIDEO_HEIGHT;
    public static final FB_BANDWIDTH_ESTIMATE STREAM_VIDEO_WIDTH;
    public static final FB_BANDWIDTH_ESTIMATE SUBTITLE_ERROR;
    public static final FB_BANDWIDTH_ESTIMATE TARGET_INDEX;
    public static final FB_BANDWIDTH_ESTIMATE TEXTUREVIEW_ALLOCREASON;
    public static final FB_BANDWIDTH_ESTIMATE TEXTURE_ALLOCATED;
    public static final FB_BANDWIDTH_ESTIMATE TRACKING_PARAM;
    public static final FB_BANDWIDTH_ESTIMATE URL;
    public static final FB_BANDWIDTH_ESTIMATE VIDEOSTATE_METADATA;
    public static final FB_BANDWIDTH_ESTIMATE VIDEO_BANDWIDTH_ESTIMATE;
    public static final FB_BANDWIDTH_ESTIMATE VIDEO_CHANGE_REASON;
    public static final FB_BANDWIDTH_ESTIMATE VIDEO_ENCODE;
    public static final FB_BANDWIDTH_ESTIMATE VIDEO_EXCEPTION_TAG;
    public static final FB_BANDWIDTH_ESTIMATE VIDEO_ID;
    public static final FB_BANDWIDTH_ESTIMATE VIDEO_PLAYER_TYPE;
    public static final FB_BANDWIDTH_ESTIMATE VIDEO_PLAY_REASON;
    public static final FB_BANDWIDTH_ESTIMATE VIDEO_TIME_POSITION_PARAM;
    public static final FB_BANDWIDTH_ESTIMATE VR_CAST_BUTTON_DISPLAYED;
    public final String value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/facebook/video/analytics/VideoAnalytics$VideoAnalyticsAttributes, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    static 
    {
        REQUESTED_STATE = new <init>("REQUESTED_STATE", 0, "state");
        API_CONFIG = new <init>("API_CONFIG", 1, "api_config");
        STALL_TIME = new <init>("STALL_TIME", 2, "stall_time");
        STALL_COUNT = new <init>("STALL_COUNT", 3, "stall_count");
        VIDEO_PLAYER_TYPE = new <init>("VIDEO_PLAYER_TYPE", 4, "player");
        PRODUCT = new <init>("PRODUCT", 5, "product");
        DEVICE = new <init>("DEVICE", 6, "device");
        BOARD = new <init>("BOARD", 7, "board");
        MANUFACTURER = new <init>("MANUFACTURER", 8, "manufacturer");
        BRAND = new <init>("BRAND", 9, "brand");
        MODEL = new <init>("MODEL", 10, "model");
        STREAM_TYPE = new <init>("STREAM_TYPE", 11, "stream_type");
        STREAMING_FORMAT = new <init>("STREAMING_FORMAT", 12, "streaming_format");
        VIDEO_ID = new <init>("VIDEO_ID", 13, "video_id");
        VIDEO_ENCODE = new <init>("VIDEO_ENCODE", 14, "vencode");
        SUBTITLE_ERROR = new <init>("SUBTITLE_ERROR", 15, "subt_err");
        CURRENT_VOLUME = new <init>("CURRENT_VOLUME", 16, "current_volume");
        URL = new <init>("URL", 17, "url");
        PERCENT_BUFFERED = new <init>("PERCENT_BUFFERED", 18, "percent_buffered");
        PLAYER_ALLOCATED = new <init>("PLAYER_ALLOCATED", 19, "player_allocated");
        RELEASE_FROM = new <init>("RELEASE_FROM", 20, "release_from");
        SOURCE_INDEX = new <init>("SOURCE_INDEX", 21, "source_index");
        TARGET_INDEX = new <init>("TARGET_INDEX", 22, "target_index");
        TEXTUREVIEW_ALLOCREASON = new <init>("TEXTUREVIEW_ALLOCREASON", 23, "alloc_reason");
        TEXTURE_ALLOCATED = new <init>("TEXTURE_ALLOCATED", 24, "tex_allocated");
        VIDEOSTATE_METADATA = new <init>("VIDEOSTATE_METADATA", 25, "vid_state_metadata");
        VIDEO_EXCEPTION_TAG = new <init>("VIDEO_EXCEPTION_TAG", 26, "reason");
        TRACKING_PARAM = new <init>("TRACKING_PARAM", 27, "tracking");
        VIDEO_TIME_POSITION_PARAM = new <init>("VIDEO_TIME_POSITION_PARAM", 28, "video_time_position");
        SEEK_SOURCE_POSITION_PARAM = new <init>("SEEK_SOURCE_POSITION_PARAM", 29, "video_seek_source_time_position");
        LAST_START_POSITION_PARAM = new <init>("LAST_START_POSITION_PARAM", 30, "video_last_start_time_position");
        VIDEO_CHANGE_REASON = new <init>("VIDEO_CHANGE_REASON", 31, "debug_reason");
        PLAYER_ORIGIN = new <init>("PLAYER_ORIGIN", 32, "player_origin");
        PLAYER_SUBORIGIN = new <init>("PLAYER_SUBORIGIN", 33, "player_suborigin");
        PREVIOUS_VIDEO_ID = new <init>("PREVIOUS_VIDEO_ID", 34, "video_chaining_previous_video");
        VIDEO_PLAY_REASON = new <init>("VIDEO_PLAY_REASON", 35, "video_play_reason");
        IS_LONG_CLICK = new <init>("IS_LONG_CLICK", 36, "long_click_on_video");
        SKIP_AD_REASON = new <init>("SKIP_AD_REASON", 37, "skip_ad_reason");
        CHANNEL_ELIGIBILITY = new <init>("CHANNEL_ELIGIBILITY", 38, "channel_eligibility");
        SEQUENCE_NUMBER = new <init>("SEQUENCE_NUMBER", 39, "seq_num");
        MONETIZATION_IDS = new <init>("MONETIZATION_IDS", 40, "monetization_ids");
        VR_CAST_BUTTON_DISPLAYED = new <init>("VR_CAST_BUTTON_DISPLAYED", 41, "vr_cast_button_displayed");
        STREAM_REPRESENTATION_ID = new <init>("STREAM_REPRESENTATION_ID", 42, "representation_id");
        STREAM_VIDEO_WIDTH = new <init>("STREAM_VIDEO_WIDTH", 43, "video_width");
        STREAM_VIDEO_HEIGHT = new <init>("STREAM_VIDEO_HEIGHT", 44, "video_height");
        STREAM_BITRATE = new <init>("STREAM_BITRATE", 45, "bitrate");
        STREAM_MIME_TYPE = new <init>("STREAM_MIME_TYPE", 46, "mime");
        STREAM_REPRESENTATION_EVENT_SOURCE = new <init>("STREAM_REPRESENTATION_EVENT_SOURCE", 47, "representation_event_source");
        VIDEO_BANDWIDTH_ESTIMATE = new <init>("VIDEO_BANDWIDTH_ESTIMATE", 48, "video_bandwidth");
        FB_BANDWIDTH_ESTIMATE = new <init>("FB_BANDWIDTH_ESTIMATE", 49, "fb_bandwidth");
        $VALUES = (new .VALUES[] {
            REQUESTED_STATE, API_CONFIG, STALL_TIME, STALL_COUNT, VIDEO_PLAYER_TYPE, PRODUCT, DEVICE, BOARD, MANUFACTURER, BRAND, 
            MODEL, STREAM_TYPE, STREAMING_FORMAT, VIDEO_ID, VIDEO_ENCODE, SUBTITLE_ERROR, CURRENT_VOLUME, URL, PERCENT_BUFFERED, PLAYER_ALLOCATED, 
            RELEASE_FROM, SOURCE_INDEX, TARGET_INDEX, TEXTUREVIEW_ALLOCREASON, TEXTURE_ALLOCATED, VIDEOSTATE_METADATA, VIDEO_EXCEPTION_TAG, TRACKING_PARAM, VIDEO_TIME_POSITION_PARAM, SEEK_SOURCE_POSITION_PARAM, 
            LAST_START_POSITION_PARAM, VIDEO_CHANGE_REASON, PLAYER_ORIGIN, PLAYER_SUBORIGIN, PREVIOUS_VIDEO_ID, VIDEO_PLAY_REASON, IS_LONG_CLICK, SKIP_AD_REASON, CHANNEL_ELIGIBILITY, SEQUENCE_NUMBER, 
            MONETIZATION_IDS, VR_CAST_BUTTON_DISPLAYED, STREAM_REPRESENTATION_ID, STREAM_VIDEO_WIDTH, STREAM_VIDEO_HEIGHT, STREAM_BITRATE, STREAM_MIME_TYPE, STREAM_REPRESENTATION_EVENT_SOURCE, VIDEO_BANDWIDTH_ESTIMATE, FB_BANDWIDTH_ESTIMATE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
