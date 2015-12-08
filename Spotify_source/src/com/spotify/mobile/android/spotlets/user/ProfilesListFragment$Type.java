// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.user;


public final class mTitleResource extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];
    final String mHermesUrlTemplate;
    final int mTitleResource;

    public static mTitleResource valueOf(String s)
    {
        return (mTitleResource)Enum.valueOf(com/spotify/mobile/android/spotlets/user/ProfilesListFragment$Type, s);
    }

    public static mTitleResource[] values()
    {
        return (mTitleResource[])e.clone();
    }

    static 
    {
        a = new <init>("FOLLOWERS", 0, "hm://user-profile-view/v2/android/profile/%s/followers", 0x7f080425);
        b = new <init>("FOLLOWING", 1, "hm://user-profile-view/v2/android/profile/%s/following", 0x7f080426);
        c = new <init>("FOLLOW_FACEBOOK", 2, "hm://follow-suggestions-view/v1/android/suggestions/%s/people/facebook_friends", 0x7f0802f7);
        d = new <init>("FOLLOW_ARTISTS", 3, "hm://follow-suggestions-view/v1/android/suggestions/%s/people/most_played_artists", 0x7f0802f6);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i, String s1, int j)
    {
        super(s, i);
        mHermesUrlTemplate = s1;
        mTitleResource = j;
    }
}
