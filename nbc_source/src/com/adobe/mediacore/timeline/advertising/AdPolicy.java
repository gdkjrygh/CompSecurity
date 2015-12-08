// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising;


public final class AdPolicy extends Enum
{

    private static final AdPolicy $VALUES[];
    public static final AdPolicy PLAY;
    public static final AdPolicy PLAY_FROM_AD_BEGIN;
    public static final AdPolicy PLAY_FROM_AD_BREAK_BEGIN;
    public static final AdPolicy SKIP_AD_BREAK;
    public static final AdPolicy SKIP_TO_NEXT_AD_IN_BREAK;
    private String _action;

    private AdPolicy(String s, int i, String s1)
    {
        super(s, i);
        _action = s1;
    }

    public static AdPolicy valueOf(String s)
    {
        return (AdPolicy)Enum.valueOf(com/adobe/mediacore/timeline/advertising/AdPolicy, s);
    }

    public static AdPolicy[] values()
    {
        return (AdPolicy[])$VALUES.clone();
    }

    public String getAction()
    {
        return _action;
    }

    static 
    {
        PLAY = new AdPolicy("PLAY", 0, "play");
        PLAY_FROM_AD_BEGIN = new AdPolicy("PLAY_FROM_AD_BEGIN", 1, "play_from_ad_begin");
        PLAY_FROM_AD_BREAK_BEGIN = new AdPolicy("PLAY_FROM_AD_BREAK_BEGIN", 2, "play_from_ad_break_begin");
        SKIP_TO_NEXT_AD_IN_BREAK = new AdPolicy("SKIP_TO_NEXT_AD_IN_BREAK", 3, "skip_to_next_ad_in_break");
        SKIP_AD_BREAK = new AdPolicy("SKIP_AD_BREAK", 4, "skip_ad_break");
        $VALUES = (new AdPolicy[] {
            PLAY, PLAY_FROM_AD_BEGIN, PLAY_FROM_AD_BREAK_BEGIN, SKIP_TO_NEXT_AD_IN_BREAK, SKIP_AD_BREAK
        });
    }
}
