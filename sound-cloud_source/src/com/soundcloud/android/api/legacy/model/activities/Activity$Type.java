// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model.activities;

import android.database.Cursor;
import java.lang.reflect.Constructor;
import java.util.EnumSet;

// Referenced classes of package com.soundcloud.android.api.legacy.model.activities:
//            Activity, TrackLikeActivity, TrackRepostActivity, PlaylistLikeActivity, 
//            PlaylistRepostActivity, CommentActivity, UserMentionActivity, AffiliationActivity

public static final class activityClass extends Enum
{

    private static final PLAYLIST_REPOST $VALUES[];
    public static final PLAYLIST_REPOST AFFILIATION;
    public static final PLAYLIST_REPOST COMMENT;
    public static final PLAYLIST_REPOST PLAYLIST_LIKE;
    public static final PLAYLIST_REPOST PLAYLIST_REPOST;
    public static final EnumSet PLAYLIST_TYPES;
    public static final PLAYLIST_REPOST TRACK_LIKE;
    public static final PLAYLIST_REPOST TRACK_REPOST;
    public static final PLAYLIST_REPOST USER_MENTION;
    public final Class activityClass;
    public final String type;

    public static activityClass fromString(String s)
    {
        activityClass aactivityclass[] = values();
        int j = aactivityclass.length;
        for (int i = 0; i < j; i++)
        {
            activityClass activityclass = aactivityclass[i];
            if (activityclass.type.equals(s))
            {
                return activityclass;
            }
        }

        throw new IllegalStateException((new StringBuilder("unknown type:")).append(s).toString());
    }

    public static type valueOf(String s)
    {
        return (type)Enum.valueOf(com/soundcloud/android/api/legacy/model/activities/Activity$Type, s);
    }

    public static type[] values()
    {
        return (type[])$VALUES.clone();
    }

    public final Activity fromCursor(Cursor cursor)
    {
        try
        {
            cursor = (Activity)activityClass.getConstructor(new Class[] {
                android/database/Cursor
            }).newInstance(new Object[] {
                cursor
            });
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            throw new RuntimeException(cursor);
        }
        return cursor;
    }

    public final boolean isPlaylistActivity()
    {
        return PLAYLIST_TYPES.contains(this);
    }

    public final String toString()
    {
        return type;
    }

    static 
    {
        TRACK_LIKE = new <init>("TRACK_LIKE", 0, "track-like", com/soundcloud/android/api/legacy/model/activities/TrackLikeActivity);
        TRACK_REPOST = new <init>("TRACK_REPOST", 1, "track-repost", com/soundcloud/android/api/legacy/model/activities/TrackRepostActivity);
        PLAYLIST_LIKE = new <init>("PLAYLIST_LIKE", 2, "playlist-like", com/soundcloud/android/api/legacy/model/activities/PlaylistLikeActivity);
        PLAYLIST_REPOST = new <init>("PLAYLIST_REPOST", 3, "playlist-repost", com/soundcloud/android/api/legacy/model/activities/PlaylistRepostActivity);
        COMMENT = new <init>("COMMENT", 4, "comment", com/soundcloud/android/api/legacy/model/activities/CommentActivity);
        USER_MENTION = new <init>("USER_MENTION", 5, "user-mention", com/soundcloud/android/api/legacy/model/activities/UserMentionActivity);
        AFFILIATION = new <init>("AFFILIATION", 6, "affiliation", com/soundcloud/android/api/legacy/model/activities/AffiliationActivity);
        $VALUES = (new .VALUES[] {
            TRACK_LIKE, TRACK_REPOST, PLAYLIST_LIKE, PLAYLIST_REPOST, COMMENT, USER_MENTION, AFFILIATION
        });
        PLAYLIST_TYPES = EnumSet.of(PLAYLIST_LIKE, PLAYLIST_REPOST);
    }

    private ivity(String s, int i, String s1, Class class1)
    {
        super(s, i);
        type = s1;
        activityClass = class1;
    }
}
