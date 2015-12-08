// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart.view;


final class mShift extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];
    int mShift;

    public static mShift valueOf(String s)
    {
        return (mShift)Enum.valueOf(com/spotify/mobile/android/spotlets/momentsstart/view/MomentVerticalLayoutManager$LayoutDirections, s);
    }

    public static mShift[] values()
    {
        return (mShift[])d.clone();
    }

    static 
    {
        a = new <init>("NONE", 0, 0);
        b = new <init>("START", 1, -1);
        c = new <init>("END", 2, 1);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        mShift = j;
    }
}
