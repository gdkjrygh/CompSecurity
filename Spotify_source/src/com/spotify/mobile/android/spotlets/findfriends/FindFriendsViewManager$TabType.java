// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.findfriends;


public final class mResId extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];
    public final int mResId;
    b mState;

    public static mResId valueOf(String s)
    {
        return (mResId)Enum.valueOf(com/spotify/mobile/android/spotlets/findfriends/FindFriendsViewManager$TabType, s);
    }

    public static mResId[] values()
    {
        return (mResId[])c.clone();
    }

    static 
    {
        a = new <init>("FRIENDS", 0, <init>, 0x7f11033e);
        b = new <init>("FEATURED", 1, <init>, 0x7f11033f);
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i,  , int j)
    {
        super(s, i);
        mState = ;
        mResId = j;
    }
}
