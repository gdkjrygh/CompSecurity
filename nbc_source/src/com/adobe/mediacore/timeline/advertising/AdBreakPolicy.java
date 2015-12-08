// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising;


public final class AdBreakPolicy extends Enum
{

    private static final AdBreakPolicy $VALUES[];
    public static final AdBreakPolicy PLAY;
    public static final AdBreakPolicy REMOVE;
    public static final AdBreakPolicy REMOVE_AFTER_PLAY;
    public static final AdBreakPolicy SKIP;
    private String _action;

    private AdBreakPolicy(String s, int i, String s1)
    {
        super(s, i);
        _action = s1;
    }

    public static AdBreakPolicy valueOf(String s)
    {
        return (AdBreakPolicy)Enum.valueOf(com/adobe/mediacore/timeline/advertising/AdBreakPolicy, s);
    }

    public static AdBreakPolicy[] values()
    {
        return (AdBreakPolicy[])$VALUES.clone();
    }

    public String getAction()
    {
        return _action;
    }

    static 
    {
        SKIP = new AdBreakPolicy("SKIP", 0, "skip");
        PLAY = new AdBreakPolicy("PLAY", 1, "play");
        REMOVE = new AdBreakPolicy("REMOVE", 2, "remove");
        REMOVE_AFTER_PLAY = new AdBreakPolicy("REMOVE_AFTER_PLAY", 3, "remove_after_play");
        $VALUES = (new AdBreakPolicy[] {
            SKIP, PLAY, REMOVE, REMOVE_AFTER_PLAY
        });
    }
}
