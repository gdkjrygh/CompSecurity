// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class value extends Enum
{

    private static final BY_USER $VALUES[];
    public static final BY_USER BY_ANDROID;
    public static final BY_USER BY_AUTOPLAY;
    public static final BY_USER BY_BOOKMARK;
    public static final BY_USER BY_CHANNEL_AUTOPLAY;
    public static final BY_USER BY_CHANNEL_VIEW_COUNT_DOWN_TAP;
    public static final BY_USER BY_CHANNEL_VIEW_TAP;
    public static final BY_USER BY_CHROME_CAST;
    public static final BY_USER BY_DEBUG_SILENT;
    public static final BY_USER BY_DIALOG;
    public static final BY_USER BY_DIVEBAR;
    public static final BY_USER BY_FLYOUT;
    public static final BY_USER BY_INLINE_CHANNEL_FEED_TRANSITION;
    public static final BY_USER BY_INLINE_FULLSCREEN_TRANSITION;
    public static final BY_USER BY_JEWEL;
    public static final BY_USER BY_MANAGER;
    public static final BY_USER BY_MEDIA_TRAY_DISMISS;
    public static final BY_USER BY_NEWSFEED_OCCLUSION;
    public static final BY_USER BY_NEWSFEED_ONPAUSE;
    public static final BY_USER BY_PAGE_VIDEOLIST_STORY;
    public static final BY_USER BY_PLAYER;
    public static final BY_USER BY_PLAYER_INTERNAL_ERROR;
    public static final BY_USER BY_PREPARER;
    public static final BY_USER BY_SEEKBAR_CONTROLLER;
    public static final BY_USER BY_THREAD_VIEW_DISMISS;
    public static final BY_USER BY_USER;
    public static final BY_USER BY_VIDEO_CHAINING_TAP;
    public static final BY_USER UNSET;
    public final String value;

    public static value asEventTriggerType(String s)
    {
        value avalue[] = values();
        int j = avalue.length;
        for (int i = 0; i < j; i++)
        {
            value value1 = avalue[i];
            if (value1.value.equals(s))
            {
                return value1;
            }
        }

        throw new IllegalArgumentException();
    }

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/facebook/video/analytics/VideoAnalytics$EventTriggerType, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    static 
    {
        BY_USER = new <init>("BY_USER", 0, "user_initiated");
        BY_PLAYER = new <init>("BY_PLAYER", 1, "player_initiated");
        BY_MANAGER = new <init>("BY_MANAGER", 2, "manager_initiated");
        BY_AUTOPLAY = new <init>("BY_AUTOPLAY", 3, "autoplay_initiated");
        BY_ANDROID = new <init>("BY_ANDROID", 4, "android_initiated");
        BY_FLYOUT = new <init>("BY_FLYOUT", 5, "flyout");
        BY_DIVEBAR = new <init>("BY_DIVEBAR", 6, "divebar");
        BY_BOOKMARK = new <init>("BY_BOOKMARK", 7, "bookmark");
        BY_JEWEL = new <init>("BY_JEWEL", 8, "jewel");
        BY_DIALOG = new <init>("BY_DIALOG", 9, "dialog");
        BY_NEWSFEED_OCCLUSION = new <init>("BY_NEWSFEED_OCCLUSION", 10, "nf_occlusion");
        BY_NEWSFEED_ONPAUSE = new <init>("BY_NEWSFEED_ONPAUSE", 11, "nf_onpause");
        BY_VIDEO_CHAINING_TAP = new <init>("BY_VIDEO_CHAINING_TAP", 12, "video_chaining_tap");
        BY_INLINE_CHANNEL_FEED_TRANSITION = new <init>("BY_INLINE_CHANNEL_FEED_TRANSITION", 13, "inline_channel_feed_transition");
        BY_INLINE_FULLSCREEN_TRANSITION = new <init>("BY_INLINE_FULLSCREEN_TRANSITION", 14, "inline_fullscreen_transition");
        BY_THREAD_VIEW_DISMISS = new <init>("BY_THREAD_VIEW_DISMISS", 15, "thread_view_dismiss");
        BY_MEDIA_TRAY_DISMISS = new <init>("BY_MEDIA_TRAY_DISMISS", 16, "media_tray_dismiss");
        BY_SEEKBAR_CONTROLLER = new <init>("BY_SEEKBAR_CONTROLLER", 17, "seek_controller");
        BY_DEBUG_SILENT = new <init>("BY_DEBUG_SILENT", 18, "debug_silent");
        BY_CHANNEL_VIEW_TAP = new <init>("BY_CHANNEL_VIEW_TAP", 19, "channel_view_tap");
        BY_CHANNEL_AUTOPLAY = new <init>("BY_CHANNEL_AUTOPLAY", 20, "channel_autoplay");
        BY_PAGE_VIDEOLIST_STORY = new <init>("BY_PAGE_VIDEOLIST_STORY", 21, "page_videolist_story");
        BY_CHANNEL_VIEW_COUNT_DOWN_TAP = new <init>("BY_CHANNEL_VIEW_COUNT_DOWN_TAP", 22, "channel_view_count_down_tap");
        BY_PLAYER_INTERNAL_ERROR = new <init>("BY_PLAYER_INTERNAL_ERROR", 23, "player_internal_error");
        BY_PREPARER = new <init>("BY_PREPARER", 24, "video_prepare_controller");
        BY_CHROME_CAST = new <init>("BY_CHROME_CAST", 25, "chrome_cast");
        $VALUES = (new .VALUES[] {
            BY_USER, BY_PLAYER, BY_MANAGER, BY_AUTOPLAY, BY_ANDROID, BY_FLYOUT, BY_DIVEBAR, BY_BOOKMARK, BY_JEWEL, BY_DIALOG, 
            BY_NEWSFEED_OCCLUSION, BY_NEWSFEED_ONPAUSE, BY_VIDEO_CHAINING_TAP, BY_INLINE_CHANNEL_FEED_TRANSITION, BY_INLINE_FULLSCREEN_TRANSITION, BY_THREAD_VIEW_DISMISS, BY_MEDIA_TRAY_DISMISS, BY_SEEKBAR_CONTROLLER, BY_DEBUG_SILENT, BY_CHANNEL_VIEW_TAP, 
            BY_CHANNEL_AUTOPLAY, BY_PAGE_VIDEOLIST_STORY, BY_CHANNEL_VIEW_COUNT_DOWN_TAP, BY_PLAYER_INTERNAL_ERROR, BY_PREPARER, BY_CHROME_CAST
        });
        UNSET = BY_USER;
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
