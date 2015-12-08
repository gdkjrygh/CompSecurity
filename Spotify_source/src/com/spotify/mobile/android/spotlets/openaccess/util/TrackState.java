// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.openaccess.util;


public final class TrackState extends Enum
{

    public static final TrackState a;
    public static final TrackState b;
    public static final TrackState c;
    public static final TrackState d;
    private static final TrackState e[];

    private TrackState(String s, int i)
    {
        super(s, i);
    }

    public static TrackState valueOf(String s)
    {
        return (TrackState)Enum.valueOf(com/spotify/mobile/android/spotlets/openaccess/util/TrackState, s);
    }

    public static TrackState[] values()
    {
        return (TrackState[])e.clone();
    }

    static 
    {
        a = new TrackState("STOPPED", 0);
        b = new TrackState("PLAYING", 1);
        c = new TrackState("PAUSED", 2);
        d = new TrackState("LOADING", 3);
        e = (new TrackState[] {
            a, b, c, d
        });
    }
}
