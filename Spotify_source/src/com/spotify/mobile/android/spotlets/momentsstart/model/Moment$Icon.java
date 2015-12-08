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
        return (mResId)Enum.valueOf(com/spotify/mobile/android/spotlets/momentsstart/model/Moment$Icon, s);
    }

    public static mResId[] values()
    {
        return (mResId[])h.clone();
    }

    static 
    {
        a = new <init>("MOMENT_ICON_0", 0, 0x7f0201fe);
        b = new <init>("MOMENT_ICON_1", 1, 0x7f0201ff);
        c = new <init>("MOMENT_ICON_2", 2, 0x7f020200);
        d = new <init>("MOMENT_ICON_3", 3, 0x7f0201ff);
        e = new <init>("MOMENT_ICON_4", 4, 0x7f0201fe);
        f = new <init>("MOMENT_ICON_5", 5, 0x7f020201);
        g = new <init>("MOMENT_ICON_6", 6, 0x7f020202);
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
