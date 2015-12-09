// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.radio.model;


public final class ThumbState extends Enum
{

    public static final ThumbState a;
    public static final ThumbState b;
    public static final ThumbState c;
    private static final ThumbState d[];
    private final String mPlayerValue;

    private ThumbState(String s, int i, String s1)
    {
        super(s, i);
        mPlayerValue = s1;
    }

    public static ThumbState a(String s)
    {
        if (b.mPlayerValue.equals(s))
        {
            return b;
        }
        if (c.mPlayerValue.equals(s))
        {
            return c;
        } else
        {
            return a;
        }
    }

    public static ThumbState valueOf(String s)
    {
        return (ThumbState)Enum.valueOf(com/spotify/music/spotlets/radio/model/ThumbState, s);
    }

    public static ThumbState[] values()
    {
        return (ThumbState[])d.clone();
    }

    static 
    {
        a = new ThumbState("NONE", 0, "none");
        b = new ThumbState("UP", 1, "up");
        c = new ThumbState("DOWN", 2, "down");
        d = (new ThumbState[] {
            a, b, c
        });
    }
}
