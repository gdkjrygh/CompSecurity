// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart.model;


public final class mResId extends Enum
{

    public static final g a;
    private static g b;
    private static g c;
    private static g d;
    private static g e;
    private static g f;
    private static g g;
    private static final g h[];
    public int mResId;

    public static mResId valueOf(String s)
    {
        return (mResId)Enum.valueOf(com/spotify/mobile/android/spotlets/momentsstart/model/Moment$Background, s);
    }

    public static mResId[] values()
    {
        return (mResId[])h.clone();
    }

    static 
    {
        a = new <init>("AMBIENCE_0", 0, 0x7f02005f);
        b = new <init>("AMBIENCE_1", 1, 0x7f020060);
        c = new <init>("AMBIENCE_2", 2, 0x7f020061);
        d = new <init>("AMBIENCE_3", 3, 0x7f020062);
        e = new <init>("AMBIENCE_4", 4, 0x7f020063);
        f = new <init>("AMBIENCE_5", 5, 0x7f020064);
        g = new <init>("AMBIENCE_6", 6, 0x7f020065);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        mResId = j;
    }
}
