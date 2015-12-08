// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            StorySnapTable

public static final class c extends Enum
    implements tt
{

    private static final STORY_UNLOCKABLES $VALUES[];
    public static final STORY_UNLOCKABLES AD_CAN_FOLLOW;
    public static final STORY_UNLOCKABLES CAPTION_TEXT;
    public static final STORY_UNLOCKABLES CLIENT_ID;
    public static final STORY_UNLOCKABLES DISPLAY_TIME;
    public static final STORY_UNLOCKABLES EXPIRATION_TIMESTAMP;
    public static final STORY_UNLOCKABLES FILTER_ID;
    public static final STORY_UNLOCKABLES IS_FAILED;
    public static final STORY_UNLOCKABLES IS_SCREENSHOTTED;
    public static final STORY_UNLOCKABLES IS_SHARED;
    public static final STORY_UNLOCKABLES IS_SPONSORED;
    public static final STORY_UNLOCKABLES IS_UPDATED;
    public static final STORY_UNLOCKABLES IS_VIEWED;
    public static final STORY_UNLOCKABLES IS_ZIPPED;
    public static final STORY_UNLOCKABLES MEDIA_ID;
    public static final STORY_UNLOCKABLES MEDIA_TYPE;
    public static final STORY_UNLOCKABLES MEDIA_URL;
    public static final STORY_UNLOCKABLES NEEDS_AUTH;
    public static final STORY_UNLOCKABLES SPONSORED_SLUG_POS_AND_TEXT;
    public static final STORY_UNLOCKABLES STATUS;
    public static final STORY_UNLOCKABLES STORY_FILTER_ID;
    public static final STORY_UNLOCKABLES STORY_ID;
    public static final STORY_UNLOCKABLES STORY_SNAP_ID;
    public static final STORY_UNLOCKABLES STORY_UNLOCKABLES;
    public static final STORY_UNLOCKABLES THUMBNAIL_URL;
    public static final STORY_UNLOCKABLES TIMESTAMP;
    public static final STORY_UNLOCKABLES USERNAME;
    public static final STORY_UNLOCKABLES VIEWED_TIMESTAMP;
    public static final STORY_UNLOCKABLES WAS_404_RESPONSE_RECEIVED;
    private int a;
    private String b;
    private DataType c;

    static String a(c c1)
    {
        return c1.b;
    }

    static DataType b(b b1)
    {
        return b1.c;
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/snapchat/android/database/table/StorySnapTable$StorySnapSchema, s);
    }

    public static c[] values()
    {
        return (c[])$VALUES.clone();
    }

    public final String getColumnName()
    {
        return b;
    }

    public final int getColumnNumber()
    {
        return a;
    }

    public final String getConstraints()
    {
        return null;
    }

    public final DataType getDataType()
    {
        return c;
    }

    static 
    {
        STORY_SNAP_ID = new <init>("STORY_SNAP_ID", 0, 1, "StorySnapId", DataType.TEXT);
        CLIENT_ID = new <init>("CLIENT_ID", 1, 2, "ClientId", DataType.TEXT);
        MEDIA_ID = new <init>("MEDIA_ID", 2, 3, "MediaId", DataType.TEXT);
        TIMESTAMP = new <init>("TIMESTAMP", 3, 4, "Timestamp", DataType.INTEGER);
        MEDIA_TYPE = new <init>("MEDIA_TYPE", 4, 5, "MediaType", DataType.INTEGER);
        MEDIA_URL = new <init>("MEDIA_URL", 5, 6, "MediaUrl", DataType.TEXT);
        THUMBNAIL_URL = new <init>("THUMBNAIL_URL", 6, 7, "ThumbnailUrl", DataType.TEXT);
        STATUS = new <init>("STATUS", 7, 8, "Status", DataType.TEXT);
        USERNAME = new <init>("USERNAME", 8, 9, "Username", DataType.TEXT);
        DISPLAY_TIME = new <init>("DISPLAY_TIME", 9, 10, "DisplayTime", DataType.INTEGER);
        CAPTION_TEXT = new <init>("CAPTION_TEXT", 10, 11, "CaptionText", DataType.TEXT);
        IS_VIEWED = new <init>("IS_VIEWED", 11, 12, "IsViewed", DataType.BOOLEAN);
        IS_SCREENSHOTTED = new <init>("IS_SCREENSHOTTED", 12, 13, "IsScreenshotted", DataType.BOOLEAN);
        VIEWED_TIMESTAMP = new <init>("VIEWED_TIMESTAMP", 13, 14, "ViewedTimestamp", DataType.INTEGER);
        IS_UPDATED = new <init>("IS_UPDATED", 14, 15, "IsUpdated", DataType.BOOLEAN);
        IS_FAILED = new <init>("IS_FAILED", 15, 16, "IsFailed", DataType.BOOLEAN);
        IS_ZIPPED = new <init>("IS_ZIPPED", 16, 17, "IsZipped", DataType.BOOLEAN);
        FILTER_ID = new <init>("FILTER_ID", 17, 18, "FilterId", DataType.TEXT);
        WAS_404_RESPONSE_RECEIVED = new <init>("WAS_404_RESPONSE_RECEIVED", 18, 19, "Was404ResponseReceived", DataType.BOOLEAN);
        STORY_ID = new <init>("STORY_ID", 19, 20, "StoryId", DataType.TEXT);
        IS_SHARED = new <init>("IS_SHARED", 20, 21, "IsShared", DataType.BOOLEAN);
        AD_CAN_FOLLOW = new <init>("AD_CAN_FOLLOW", 21, 22, "AdCanFollow", DataType.BOOLEAN);
        NEEDS_AUTH = new <init>("NEEDS_AUTH", 22, 23, "NeedsAuth", DataType.BOOLEAN);
        EXPIRATION_TIMESTAMP = new <init>("EXPIRATION_TIMESTAMP", 23, 24, "ExpirationTimestamp", DataType.INTEGER);
        STORY_FILTER_ID = new <init>("STORY_FILTER_ID", 24, 25, "StoryFilterId", DataType.TEXT);
        IS_SPONSORED = new <init>("IS_SPONSORED", 25, 26, "IsSponsored", DataType.BOOLEAN);
        SPONSORED_SLUG_POS_AND_TEXT = new <init>("SPONSORED_SLUG_POS_AND_TEXT", 26, 27, "SponsoredSlugPosAndText", DataType.TEXT);
        STORY_UNLOCKABLES = new <init>("STORY_UNLOCKABLES", 27, 28, "StoryUnlockables", DataType.TEXT);
        $VALUES = (new .VALUES[] {
            STORY_SNAP_ID, CLIENT_ID, MEDIA_ID, TIMESTAMP, MEDIA_TYPE, MEDIA_URL, THUMBNAIL_URL, STATUS, USERNAME, DISPLAY_TIME, 
            CAPTION_TEXT, IS_VIEWED, IS_SCREENSHOTTED, VIEWED_TIMESTAMP, IS_UPDATED, IS_FAILED, IS_ZIPPED, FILTER_ID, WAS_404_RESPONSE_RECEIVED, STORY_ID, 
            IS_SHARED, AD_CAN_FOLLOW, NEEDS_AUTH, EXPIRATION_TIMESTAMP, STORY_FILTER_ID, IS_SPONSORED, SPONSORED_SLUG_POS_AND_TEXT, STORY_UNLOCKABLES
        });
    }

    private (String s, int i, int j, String s1, DataType datatype)
    {
        super(s, i);
        a = j;
        b = s1;
        c = datatype;
    }
}
