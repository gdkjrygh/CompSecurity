// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.activities;


public final class ActivityKind extends Enum
{

    private static final ActivityKind $VALUES[];
    public static final ActivityKind PLAYLIST_LIKE;
    public static final ActivityKind PLAYLIST_REPOST;
    public static final ActivityKind TRACK_COMMENT;
    public static final ActivityKind TRACK_LIKE;
    public static final ActivityKind TRACK_REPOST;
    public static final ActivityKind UNKNOWN;
    public static final ActivityKind USER_FOLLOW;
    private final String identifier;

    private ActivityKind(String s, int i, String s1)
    {
        super(s, i);
        identifier = s1;
    }

    public static ActivityKind fromIdentifier(String s)
    {
        ActivityKind aactivitykind[] = values();
        int j = aactivitykind.length;
        for (int i = 0; i < j; i++)
        {
            ActivityKind activitykind = aactivitykind[i];
            if (activitykind.identifier.equals(s))
            {
                return activitykind;
            }
        }

        return UNKNOWN;
    }

    public static ActivityKind valueOf(String s)
    {
        return (ActivityKind)Enum.valueOf(com/soundcloud/android/activities/ActivityKind, s);
    }

    public static ActivityKind[] values()
    {
        return (ActivityKind[])$VALUES.clone();
    }

    public final String identifier()
    {
        return identifier;
    }

    public final String toString()
    {
        return identifier;
    }

    static 
    {
        UNKNOWN = new ActivityKind("UNKNOWN", 0, "unknown");
        TRACK_LIKE = new ActivityKind("TRACK_LIKE", 1, "track_like");
        PLAYLIST_LIKE = new ActivityKind("PLAYLIST_LIKE", 2, "playlist_like");
        TRACK_REPOST = new ActivityKind("TRACK_REPOST", 3, "track_repost");
        PLAYLIST_REPOST = new ActivityKind("PLAYLIST_REPOST", 4, "playlist_repost");
        TRACK_COMMENT = new ActivityKind("TRACK_COMMENT", 5, "track_comment");
        USER_FOLLOW = new ActivityKind("USER_FOLLOW", 6, "user_follow");
        $VALUES = (new ActivityKind[] {
            UNKNOWN, TRACK_LIKE, PLAYLIST_LIKE, TRACK_REPOST, PLAYLIST_REPOST, TRACK_COMMENT, USER_FOLLOW
        });
    }
}
