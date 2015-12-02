// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import com.facebook.common.stringformat.StringFormatUtil;

public final class subOrigin extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN CHANNEL_VIEW;
    public static final UNKNOWN COLLAGE_MIXED_MEDIA;
    public static final UNKNOWN EVENT;
    public static final UNKNOWN FEED;
    public static final UNKNOWN GROUP;
    public static final UNKNOWN INSTANT_ARTICLES;
    public static final UNKNOWN INSTANT_SHOPPING;
    public static final UNKNOWN MEDIA_PICKER;
    public static final UNKNOWN MESSENGER_THREAD;
    public static final UNKNOWN PAGE_TIMELINE;
    public static final UNKNOWN PAGE_VIDEO_CARD;
    public static final UNKNOWN PAGE_VIDEO_HUB;
    public static final UNKNOWN PAGE_VIDEO_LIST_PERMALINK;
    public static final UNKNOWN PAGE_VIDEO_LIST_STORY;
    public static final UNKNOWN PERMALINK;
    public static final UNKNOWN PROFILE_VIDEO;
    public static final UNKNOWN REACTION_OVERLAY;
    public static final UNKNOWN RESULTS_PAGE_MIXED_MEDIA;
    public static final UNKNOWN SAVED_DASHBOARD;
    public static final UNKNOWN SAVED_REMINDER;
    public static final UNKNOWN SOUVENIR;
    public static final UNKNOWN UNKNOWN;
    public static final UNKNOWN USER_TIMELINE;
    public static final UNKNOWN VERVE;
    public static final UNKNOWN VIDEO_ALBUM_PERMALINK;
    public static final UNKNOWN VIDEO_CHAINING_INLINE;
    public final String origin;
    public final String subOrigin;

    public static subOrigin asPlayerOrigin(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        subOrigin suborigin = UNKNOWN;
_L4:
        return suborigin;
_L2:
        subOrigin asuborigin[] = values();
        int j = asuborigin.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                subOrigin suborigin1 = asuborigin[i];
                suborigin = suborigin1;
                if (s.equals(suborigin1.asString()))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return UNKNOWN;
    }

    public static UNKNOWN valueOf(String s)
    {
        return (UNKNOWN)Enum.valueOf(com/facebook/video/analytics/VideoAnalytics$PlayerOrigin, s);
    }

    public static UNKNOWN[] values()
    {
        return (UNKNOWN[])$VALUES.clone();
    }

    public final String asString()
    {
        return StringFormatUtil.a("%s::%s", origin, subOrigin);
    }

    static 
    {
        FEED = new <init>("FEED", 0, "newsfeed", "unknown");
        USER_TIMELINE = new <init>("USER_TIMELINE", 1, "user_timeline", "unknown");
        PROFILE_VIDEO = new <init>("PROFILE_VIDEO", 2, "user_timeline", "profile_video");
        PAGE_TIMELINE = new <init>("PAGE_TIMELINE", 3, "page_timeline", "unknown");
        PAGE_VIDEO_CARD = new <init>("PAGE_VIDEO_CARD", 4, "page_timeline", "page_video_card");
        PAGE_VIDEO_HUB = new <init>("PAGE_VIDEO_HUB", 5, "page_timeline", "page_video_hub");
        PAGE_VIDEO_LIST_PERMALINK = new <init>("PAGE_VIDEO_LIST_PERMALINK", 6, "page_timeline", "page_video_list_permalink");
        PAGE_VIDEO_LIST_STORY = new <init>("PAGE_VIDEO_LIST_STORY", 7, "newsfeed", "page_video_list_story");
        EVENT = new <init>("EVENT", 8, "other", "event");
        GROUP = new <init>("GROUP", 9, "group", "unknown");
        PERMALINK = new <init>("PERMALINK", 10, "permalink", "unknown");
        MESSENGER_THREAD = new <init>("MESSENGER_THREAD", 11, "fbmessenger", "messenger_thread");
        CHANNEL_VIEW = new <init>("CHANNEL_VIEW", 12, "newsfeed", "channel_view");
        VIDEO_CHAINING_INLINE = new <init>("VIDEO_CHAINING_INLINE", 13, "newsfeed", "video_chaining_inline");
        MEDIA_PICKER = new <init>("MEDIA_PICKER", 14, "other", "media_picker");
        REACTION_OVERLAY = new <init>("REACTION_OVERLAY", 15, "other", "reaction_overlay");
        VIDEO_ALBUM_PERMALINK = new <init>("VIDEO_ALBUM_PERMALINK", 16, "other", "video_album_permalink");
        COLLAGE_MIXED_MEDIA = new <init>("COLLAGE_MIXED_MEDIA", 17, "newsfeed", "collage_mixed_media");
        RESULTS_PAGE_MIXED_MEDIA = new <init>("RESULTS_PAGE_MIXED_MEDIA", 18, "search", "results_page_mixed_media");
        VERVE = new <init>("VERVE", 19, "other", "verve");
        SAVED_DASHBOARD = new <init>("SAVED_DASHBOARD", 20, "other", "saved_dashboard");
        SAVED_REMINDER = new <init>("SAVED_REMINDER", 21, "other", "saved_reminder");
        SOUVENIR = new <init>("SOUVENIR", 22, "other", "souvenir");
        INSTANT_ARTICLES = new <init>("INSTANT_ARTICLES", 23, "instant_articles", "instant_articles");
        INSTANT_SHOPPING = new <init>("INSTANT_SHOPPING", 24, "instant_shopping", "instant_shopping");
        UNKNOWN = new <init>("UNKNOWN", 25, "unknown", "unknown");
        $VALUES = (new .VALUES[] {
            FEED, USER_TIMELINE, PROFILE_VIDEO, PAGE_TIMELINE, PAGE_VIDEO_CARD, PAGE_VIDEO_HUB, PAGE_VIDEO_LIST_PERMALINK, PAGE_VIDEO_LIST_STORY, EVENT, GROUP, 
            PERMALINK, MESSENGER_THREAD, CHANNEL_VIEW, VIDEO_CHAINING_INLINE, MEDIA_PICKER, REACTION_OVERLAY, VIDEO_ALBUM_PERMALINK, COLLAGE_MIXED_MEDIA, RESULTS_PAGE_MIXED_MEDIA, VERVE, 
            SAVED_DASHBOARD, SAVED_REMINDER, SOUVENIR, INSTANT_ARTICLES, INSTANT_SHOPPING, UNKNOWN
        });
    }

    private (String s, int i, String s1, String s2)
    {
        super(s, i);
        origin = s1;
        subOrigin = s2;
    }
}
