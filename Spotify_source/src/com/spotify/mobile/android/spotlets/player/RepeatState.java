// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.player;


public final class RepeatState extends Enum
{

    public static final RepeatState a;
    public static final RepeatState b;
    public static final RepeatState c;
    private static final RepeatState d[];
    public final boolean mRepeatContext;
    public final boolean mRepeatTrack;

    private RepeatState(String s, int i, boolean flag, boolean flag1)
    {
        super(s, i);
        mRepeatContext = flag;
        mRepeatTrack = flag1;
    }

    public static RepeatState valueOf(String s)
    {
        return (RepeatState)Enum.valueOf(com/spotify/mobile/android/spotlets/player/RepeatState, s);
    }

    public static RepeatState[] values()
    {
        return (RepeatState[])d.clone();
    }

    static 
    {
        a = new RepeatState("NONE", 0, false, false);
        b = new RepeatState("CONTEXT", 1, true, false);
        c = new RepeatState("TRACK", 2, false, true);
        d = (new RepeatState[] {
            a, b, c
        });
    }
}
