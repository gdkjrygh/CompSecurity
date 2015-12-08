// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;


// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            Association

public static final class collectionType extends Enum
{

    private static final FOLLOWER $VALUES[];
    public static final FOLLOWER FOLLOWER;
    public static final FOLLOWER FOLLOWING;
    public static final FOLLOWER PLAYLIST;
    public static final FOLLOWER PLAYLIST_LIKE;
    public static final FOLLOWER PLAYLIST_REPOST;
    public static final FOLLOWER TRACK;
    public static final FOLLOWER TRACK_LIKE;
    public static final FOLLOWER TRACK_REPOST;
    public final int collectionType;

    public static collectionType valueOf(String s)
    {
        return (collectionType)Enum.valueOf(com/soundcloud/android/api/legacy/model/Association$Type, s);
    }

    public static collectionType[] values()
    {
        return (collectionType[])$VALUES.clone();
    }

    static 
    {
        TRACK = new <init>("TRACK", 0, 0);
        TRACK_REPOST = new <init>("TRACK_REPOST", 1, 7);
        TRACK_LIKE = new <init>("TRACK_LIKE", 2, 1);
        PLAYLIST = new <init>("PLAYLIST", 3, 8);
        PLAYLIST_REPOST = new <init>("PLAYLIST_REPOST", 4, 7);
        PLAYLIST_LIKE = new <init>("PLAYLIST_LIKE", 5, 1);
        FOLLOWING = new <init>("FOLLOWING", 6, 2);
        FOLLOWER = new <init>("FOLLOWER", 7, 3);
        $VALUES = (new .VALUES[] {
            TRACK, TRACK_REPOST, TRACK_LIKE, PLAYLIST, PLAYLIST_REPOST, PLAYLIST_LIKE, FOLLOWING, FOLLOWER
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        collectionType = j;
    }
}
