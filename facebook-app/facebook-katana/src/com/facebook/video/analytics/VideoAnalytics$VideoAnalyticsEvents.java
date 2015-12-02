// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class value extends Enum
{

    private static final VIDEO_INVALID_EVENT $VALUES[];
    public static final VIDEO_INVALID_EVENT VIDEO_ALBUM_PERMALINK_ENTER;
    public static final VIDEO_INVALID_EVENT VIDEO_BUFFERED;
    public static final VIDEO_INVALID_EVENT VIDEO_CANCELLED_REQUESTED_PLAYING;
    public static final VIDEO_INVALID_EVENT VIDEO_CAROUSEL_CHANGE;
    public static final VIDEO_INVALID_EVENT VIDEO_CHANNEL_NO_RELATED_VIDEO;
    public static final VIDEO_INVALID_EVENT VIDEO_COMPLETE;
    public static final VIDEO_INVALID_EVENT VIDEO_DISPLAYED;
    public static final VIDEO_INVALID_EVENT VIDEO_ENTERED_HD;
    public static final VIDEO_INVALID_EVENT VIDEO_EXCEPTION;
    public static final VIDEO_INVALID_EVENT VIDEO_EXITED_HD;
    public static final VIDEO_INVALID_EVENT VIDEO_FULL_SCREEN_ONPAUSE;
    public static final VIDEO_INVALID_EVENT VIDEO_FULL_SCREEN_ONRESUME;
    public static final VIDEO_INVALID_EVENT VIDEO_GENERIC_SUBTITLE_ERROR;
    public static final VIDEO_INVALID_EVENT VIDEO_GRAPHICS_INFO;
    public static final VIDEO_INVALID_EVENT VIDEO_INLINE_CLICK_TO_PLAY;
    public static final VIDEO_INVALID_EVENT VIDEO_INVALID_EVENT;
    public static final VIDEO_INVALID_EVENT VIDEO_MONETIZATION;
    public static final VIDEO_INVALID_EVENT VIDEO_MUTED;
    public static final VIDEO_INVALID_EVENT VIDEO_NO_SURFACE_UPDATE;
    public static final VIDEO_INVALID_EVENT VIDEO_PAUSE;
    public static final VIDEO_INVALID_EVENT VIDEO_PLAYER_FORMAT_CHANGED;
    public static final VIDEO_INVALID_EVENT VIDEO_PLAYER_PAUSE;
    public static final VIDEO_INVALID_EVENT VIDEO_PLAYER_STOP;
    public static final VIDEO_INVALID_EVENT VIDEO_PLAYER_UNPAUSE;
    public static final VIDEO_INVALID_EVENT VIDEO_REPLAYED;
    public static final VIDEO_INVALID_EVENT VIDEO_REPRESENTATION_ENDED;
    public static final VIDEO_INVALID_EVENT VIDEO_REQUESTED_PLAYING;
    public static final VIDEO_INVALID_EVENT VIDEO_SCRUBBED;
    public static final VIDEO_INVALID_EVENT VIDEO_SEEK;
    public static final VIDEO_INVALID_EVENT VIDEO_SELECT_ALBUM_PERMALINK;
    public static final VIDEO_INVALID_EVENT VIDEO_SKIP_AD;
    public static final VIDEO_INVALID_EVENT VIDEO_SOUNDWAVE_CLICK;
    public static final VIDEO_INVALID_EVENT VIDEO_START;
    public static final VIDEO_INVALID_EVENT VIDEO_SUBTITLE_PARSE_ERROR;
    public static final VIDEO_INVALID_EVENT VIDEO_SURFACE_UPDATED;
    public static final VIDEO_INVALID_EVENT VIDEO_TAP_TO_FULLSCREEN;
    public static final VIDEO_INVALID_EVENT VIDEO_TEXTUREVIEW_INFO;
    public static final VIDEO_INVALID_EVENT VIDEO_UNMUTED;
    public static final VIDEO_INVALID_EVENT VIDEO_UNPAUSED;
    public static final VIDEO_INVALID_EVENT VIDEO_VOLUME_DECREASE;
    public static final VIDEO_INVALID_EVENT VIDEO_VOLUME_INCREASE;
    public static final VIDEO_INVALID_EVENT VIDEO_VR_CAST_CLICK;
    public final String value;

    public static value asEvent(String s)
    {
        value avalue[] = values();
        int j = avalue.length;
        for (int i = 0; i < j; i++)
        {
            value value1 = avalue[i];
            if (s.equals(value1.value))
            {
                return value1;
            }
        }

        return VIDEO_INVALID_EVENT;
    }

    public static VIDEO_INVALID_EVENT valueOf(String s)
    {
        return (VIDEO_INVALID_EVENT)Enum.valueOf(com/facebook/video/analytics/VideoAnalytics$VideoAnalyticsEvents, s);
    }

    public static VIDEO_INVALID_EVENT[] values()
    {
        return (VIDEO_INVALID_EVENT[])$VALUES.clone();
    }

    static 
    {
        VIDEO_REQUESTED_PLAYING = new <init>("VIDEO_REQUESTED_PLAYING", 0, "requested_playing");
        VIDEO_CANCELLED_REQUESTED_PLAYING = new <init>("VIDEO_CANCELLED_REQUESTED_PLAYING", 1, "cancelled_requested_playing");
        VIDEO_START = new <init>("VIDEO_START", 2, "started_playing");
        VIDEO_PAUSE = new <init>("VIDEO_PAUSE", 3, "paused");
        VIDEO_UNPAUSED = new <init>("VIDEO_UNPAUSED", 4, "unpaused");
        VIDEO_REPLAYED = new <init>("VIDEO_REPLAYED", 5, "replayed");
        VIDEO_COMPLETE = new <init>("VIDEO_COMPLETE", 6, "finished_playing");
        VIDEO_MUTED = new <init>("VIDEO_MUTED", 7, "muted");
        VIDEO_UNMUTED = new <init>("VIDEO_UNMUTED", 8, "unmuted");
        VIDEO_SEEK = new <init>("VIDEO_SEEK", 9, "seek");
        VIDEO_SCRUBBED = new <init>("VIDEO_SCRUBBED", 10, "scrubbed");
        VIDEO_VOLUME_INCREASE = new <init>("VIDEO_VOLUME_INCREASE", 11, "volume_increase");
        VIDEO_VOLUME_DECREASE = new <init>("VIDEO_VOLUME_DECREASE", 12, "volume_decrease");
        VIDEO_CAROUSEL_CHANGE = new <init>("VIDEO_CAROUSEL_CHANGE", 13, "carousel_change");
        VIDEO_EXCEPTION = new <init>("VIDEO_EXCEPTION", 14, "failed_playing");
        VIDEO_BUFFERED = new <init>("VIDEO_BUFFERED", 15, "buffered");
        VIDEO_SUBTITLE_PARSE_ERROR = new <init>("VIDEO_SUBTITLE_PARSE_ERROR", 16, "subtitle_parse_error");
        VIDEO_FULL_SCREEN_ONRESUME = new <init>("VIDEO_FULL_SCREEN_ONRESUME", 17, "full_screen_onresume");
        VIDEO_FULL_SCREEN_ONPAUSE = new <init>("VIDEO_FULL_SCREEN_ONPAUSE", 18, "full_screen_onpause");
        VIDEO_TAP_TO_FULLSCREEN = new <init>("VIDEO_TAP_TO_FULLSCREEN", 19, "video_handle_tap");
        VIDEO_GRAPHICS_INFO = new <init>("VIDEO_GRAPHICS_INFO", 20, "video_graphics_info");
        VIDEO_GENERIC_SUBTITLE_ERROR = new <init>("VIDEO_GENERIC_SUBTITLE_ERROR", 21, "subtitle_error");
        VIDEO_TEXTUREVIEW_INFO = new <init>("VIDEO_TEXTUREVIEW_INFO", 22, "video_texview_info");
        VIDEO_PLAYER_STOP = new <init>("VIDEO_PLAYER_STOP", 23, "video_player_stop");
        VIDEO_PLAYER_PAUSE = new <init>("VIDEO_PLAYER_PAUSE", 24, "video_player_pause");
        VIDEO_PLAYER_UNPAUSE = new <init>("VIDEO_PLAYER_UNPAUSE", 25, "video_player_unpause");
        VIDEO_PLAYER_FORMAT_CHANGED = new <init>("VIDEO_PLAYER_FORMAT_CHANGED", 26, "player_format_changed");
        VIDEO_DISPLAYED = new <init>("VIDEO_DISPLAYED", 27, "displayed");
        VIDEO_ALBUM_PERMALINK_ENTER = new <init>("VIDEO_ALBUM_PERMALINK_ENTER", 28, "video_album_permalink_enter");
        VIDEO_SELECT_ALBUM_PERMALINK = new <init>("VIDEO_SELECT_ALBUM_PERMALINK", 29, "video_select_album_permalink");
        VIDEO_SOUNDWAVE_CLICK = new <init>("VIDEO_SOUNDWAVE_CLICK", 30, "video_soundwave_click");
        VIDEO_SKIP_AD = new <init>("VIDEO_SKIP_AD", 31, "video_skip_ad");
        VIDEO_CHANNEL_NO_RELATED_VIDEO = new <init>("VIDEO_CHANNEL_NO_RELATED_VIDEO", 32, "video_channel_no_related_video");
        VIDEO_ENTERED_HD = new <init>("VIDEO_ENTERED_HD", 33, "entered_hd");
        VIDEO_EXITED_HD = new <init>("VIDEO_EXITED_HD", 34, "exited_hd");
        VIDEO_MONETIZATION = new <init>("VIDEO_MONETIZATION", 35, "video_monetization");
        VIDEO_INLINE_CLICK_TO_PLAY = new <init>("VIDEO_INLINE_CLICK_TO_PLAY", 36, "inline_click_to_play");
        VIDEO_VR_CAST_CLICK = new <init>("VIDEO_VR_CAST_CLICK", 37, "vr_cast_button_click");
        VIDEO_SURFACE_UPDATED = new <init>("VIDEO_SURFACE_UPDATED", 38, "surface_updated");
        VIDEO_NO_SURFACE_UPDATE = new <init>("VIDEO_NO_SURFACE_UPDATE", 39, "no_surface_update");
        VIDEO_REPRESENTATION_ENDED = new <init>("VIDEO_REPRESENTATION_ENDED", 40, "representation_ended");
        VIDEO_INVALID_EVENT = new <init>("VIDEO_INVALID_EVENT", 41, "");
        $VALUES = (new .VALUES[] {
            VIDEO_REQUESTED_PLAYING, VIDEO_CANCELLED_REQUESTED_PLAYING, VIDEO_START, VIDEO_PAUSE, VIDEO_UNPAUSED, VIDEO_REPLAYED, VIDEO_COMPLETE, VIDEO_MUTED, VIDEO_UNMUTED, VIDEO_SEEK, 
            VIDEO_SCRUBBED, VIDEO_VOLUME_INCREASE, VIDEO_VOLUME_DECREASE, VIDEO_CAROUSEL_CHANGE, VIDEO_EXCEPTION, VIDEO_BUFFERED, VIDEO_SUBTITLE_PARSE_ERROR, VIDEO_FULL_SCREEN_ONRESUME, VIDEO_FULL_SCREEN_ONPAUSE, VIDEO_TAP_TO_FULLSCREEN, 
            VIDEO_GRAPHICS_INFO, VIDEO_GENERIC_SUBTITLE_ERROR, VIDEO_TEXTUREVIEW_INFO, VIDEO_PLAYER_STOP, VIDEO_PLAYER_PAUSE, VIDEO_PLAYER_UNPAUSE, VIDEO_PLAYER_FORMAT_CHANGED, VIDEO_DISPLAYED, VIDEO_ALBUM_PERMALINK_ENTER, VIDEO_SELECT_ALBUM_PERMALINK, 
            VIDEO_SOUNDWAVE_CLICK, VIDEO_SKIP_AD, VIDEO_CHANNEL_NO_RELATED_VIDEO, VIDEO_ENTERED_HD, VIDEO_EXITED_HD, VIDEO_MONETIZATION, VIDEO_INLINE_CLICK_TO_PLAY, VIDEO_VR_CAST_CLICK, VIDEO_SURFACE_UPDATED, VIDEO_NO_SURFACE_UPDATE, 
            VIDEO_REPRESENTATION_ENDED, VIDEO_INVALID_EVENT
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
