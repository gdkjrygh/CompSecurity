// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class ChannelEligibility extends Enum
{

    private static final ChannelEligibility $VALUES[];
    public static final ChannelEligibility AVAILABLE;
    public static final ChannelEligibility CALL_TO_ACTION_VIDEO;
    public static final ChannelEligibility CHANNEL_DISABLED;
    public static final ChannelEligibility CONDITION_FAILED;
    public static final ChannelEligibility LOADED;
    public static final ChannelEligibility NO_INFO;
    public static final ChannelEligibility NO_RELATED;
    public static final ChannelEligibility NO_STORYCACHEID;
    public static final ChannelEligibility SPONSORED_VIDEO;
    public static final ChannelEligibility WRONG_STORY_TYPE;
    public final String eligibility;
    public final String value;

    private ChannelEligibility(String s, int i, String s1)
    {
        this(s, i, s1, s1);
    }

    private ChannelEligibility(String s, int i, String s1, String s2)
    {
        super(s, i);
        value = s1;
        eligibility = s2;
    }

    public static ChannelEligibility valueOf(String s)
    {
        return (ChannelEligibility)Enum.valueOf(com/facebook/video/analytics/ChannelEligibility, s);
    }

    public static ChannelEligibility[] values()
    {
        return (ChannelEligibility[])$VALUES.clone();
    }

    public final String toString()
    {
        return value;
    }

    static 
    {
        AVAILABLE = new ChannelEligibility("AVAILABLE", 0, "available", "eligible");
        LOADED = new ChannelEligibility("LOADED", 1, "loaded", "eligible");
        CHANNEL_DISABLED = new ChannelEligibility("CHANNEL_DISABLED", 2, "channel_disabled");
        CONDITION_FAILED = new ChannelEligibility("CONDITION_FAILED", 3, "condition_failed");
        NO_RELATED = new ChannelEligibility("NO_RELATED", 4, "no_related");
        NO_STORYCACHEID = new ChannelEligibility("NO_STORYCACHEID", 5, "no_storycacheid");
        NO_INFO = new ChannelEligibility("NO_INFO", 6, "no_info", "no_related");
        SPONSORED_VIDEO = new ChannelEligibility("SPONSORED_VIDEO", 7, "sponsored_video");
        CALL_TO_ACTION_VIDEO = new ChannelEligibility("CALL_TO_ACTION_VIDEO", 8, "call_to_action_video");
        WRONG_STORY_TYPE = new ChannelEligibility("WRONG_STORY_TYPE", 9, "wrong_story_type");
        $VALUES = (new ChannelEligibility[] {
            AVAILABLE, LOADED, CHANNEL_DISABLED, CONDITION_FAILED, NO_RELATED, NO_STORYCACHEID, NO_INFO, SPONSORED_VIDEO, CALL_TO_ACTION_VIDEO, WRONG_STORY_TYPE
        });
    }
}
