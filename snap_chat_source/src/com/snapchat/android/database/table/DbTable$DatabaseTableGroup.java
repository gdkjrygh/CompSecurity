// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import ea;
import java.util.List;

// Referenced classes of package com.snapchat.android.database.table:
//            DbTable

public static final class b extends Enum
{

    private static final LENSES_GROUP $VALUES[];
    public static final LENSES_GROUP DISCOVER_GROUP;
    public static final LENSES_GROUP FRIEND_GROUP;
    public static final LENSES_GROUP GEOFILTER_GROUP;
    public static final LENSES_GROUP IDENTITY_GROUP;
    public static final LENSES_GROUP LENSES_GROUP;
    public static final LENSES_GROUP MISC_GROUPS;
    public static final LENSES_GROUP STORY_AND_CHAT_GROUP;
    private final List a;
    private final boolean b;

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/snapchat/android/database/table/DbTable$DatabaseTableGroup, s);
    }

    public static b[] values()
    {
        return (b[])$VALUES.clone();
    }

    public final List getDatabaseTables()
    {
        return a;
    }

    public final boolean isLateLoading()
    {
        return b;
    }

    static 
    {
        FRIEND_GROUP = new <init>("FRIEND_GROUP", 0, ea.a(CTS_ON_SNAPCHAT, CTS_NOT_ON_SNAPCHAT, DS_WHO_ADDED_ME, STED_FRIENDS, DS));
        STORY_AND_CHAT_GROUP = new <init>("STORY_AND_CHAT_GROUP", 1, ea.a(SNAPS, VED_SNAPS, VER_SHARE_FILES, MEDIA_FILES, VED_SNAP_IMAGE_FILES, VED_SNAP_VIDEO_FILES, _SNAP_IMAGE_FILES, VED_STORY_SNAP_THUMBNAIL_FILES, ORY_SNAP_THUMBNAIL_FILES, _SNAP_VIDEO_FILES, _MEDIA_FILES, _GROUPS, new _GROUPS[] {
            STED_STORYSNAPS, D_STORIES, _METADATA, _AD_STREAM_DATA_TABLE, AP_VIDEO_FILES, AP_IMAGE_FILES, D_POST_SNAPBRYOS, D_SEND_SNAPBRYOS, D_SEND_DSNAPBRYOS, D_CHAT_MEDIA_SNAPBRYOS, 
            EW_SNAP_VIDEO_FILE, NG_SNAPBRYOS, NG_SNAPBRYOS, NG_DSNAPBRYOS, RSATION, RSATION, ICATION, _FROM_LAST_HOUR, ED_CHAT_IDS, FEED_ITEM
        }));
        GEOFILTER_GROUP = new <init>("GEOFILTER_GROUP", 2, ea.a(LTER_FILES, LTER_METADATA, LTER_METADATA, EEN_OUR_STORY_DIALOG_TABLE, EEN_OUR_CAMPUS_STORY_DIALOG_TABLE, _SNAP_NOTE_TABLE, CONSUMPTION_RECORDS));
        IDENTITY_GROUP = new <init>("IDENTITY_GROUP", 3, ea.a(IED_DEVICE, LE_IMAGE_FILE_TABLE, D_PROFILE_IMAGE_FILE_TABLE, RIENDS_REQUEST_CACHE, DMOJI_EDITABLE_DICTIONARY, DMOJI_READONLY_DICTIONARY));
        DISCOVER_GROUP = new <init>("DISCOVER_GROUP", 4, ea.a(SHER_ICONS, _VIDEO_FILES, ON_CHUNK_FILES, ON_VIEW_STATE, EL_VIEW_STATE, _VIEW_STATE, EL_VIEW_DATES, EL_UPDATE_DATES));
        MISC_GROUPS = new <init>("MISC_GROUPS", 5, ea.a(NG_SESSIONS, TICS_EVENTS, METRICS), true);
        LENSES_GROUP = new <init>("LENSES_GROUP", 6, ea.a(ULED_LENSES_METADATA, ENSES_METADATA, _LENSES_METADATA, ASED_LENSES_METADATA, S_RESOURCES));
        $VALUES = (new .VALUES[] {
            FRIEND_GROUP, STORY_AND_CHAT_GROUP, GEOFILTER_GROUP, IDENTITY_GROUP, DISCOVER_GROUP, MISC_GROUPS, LENSES_GROUP
        });
    }

    private (String s, int i, ea ea1)
    {
        this(s, i, ea1, false);
    }

    private <init>(String s, int i, ea ea1, boolean flag)
    {
        super(s, i);
        a = ea1;
        b = flag;
    }
}
