// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.running.auto;


public final class MotionState extends Enum
{

    public static final MotionState a;
    public static final MotionState b;
    public static final MotionState c;
    public static final MotionState d;
    private static final MotionState e[];

    private MotionState(String s, int i)
    {
        super(s, i);
    }

    public static MotionState valueOf(String s)
    {
        return (MotionState)Enum.valueOf(com/spotify/mobile/android/spotlets/running/auto/MotionState, s);
    }

    public static MotionState[] values()
    {
        return (MotionState[])e.clone();
    }

    static 
    {
        a = new MotionState("INITIAL", 0);
        b = new MotionState("DETECTING", 1);
        c = new MotionState("DETECTED", 2);
        d = new MotionState("ERROR", 3);
        e = (new MotionState[] {
            a, b, c, d
        });
    }
}
