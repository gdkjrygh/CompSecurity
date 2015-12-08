// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising;


public final class AdPolicyMode extends Enum
{

    private static final AdPolicyMode $VALUES[];
    public static final AdPolicyMode PLAY;
    public static final AdPolicyMode SEEK;
    public static final AdPolicyMode TRICK_PLAY;
    private String _action;

    private AdPolicyMode(String s, int i, String s1)
    {
        super(s, i);
        _action = s1;
    }

    public static AdPolicyMode valueOf(String s)
    {
        return (AdPolicyMode)Enum.valueOf(com/adobe/mediacore/timeline/advertising/AdPolicyMode, s);
    }

    public static AdPolicyMode[] values()
    {
        return (AdPolicyMode[])$VALUES.clone();
    }

    public String getAction()
    {
        return _action;
    }

    static 
    {
        PLAY = new AdPolicyMode("PLAY", 0, "play");
        SEEK = new AdPolicyMode("SEEK", 1, "seek");
        TRICK_PLAY = new AdPolicyMode("TRICK_PLAY", 2, "trick_play");
        $VALUES = (new AdPolicyMode[] {
            PLAY, SEEK, TRICK_PLAY
        });
    }
}
