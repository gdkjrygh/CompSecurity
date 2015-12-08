// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            FriendTable

public static final class c extends Enum
    implements tt
{

    private static final IS_RECOMMENDED $VALUES[];
    public static final IS_RECOMMENDED ADDED_ME_TIMESTAMP;
    public static final IS_RECOMMENDED ADDED_THEM_TIMESTAMP;
    public static final IS_RECOMMENDED ADD_SOURCE;
    public static final IS_RECOMMENDED ADD_SOURCE_TYPE;
    public static final IS_RECOMMENDED BEST_FRIEND_INDEX;
    public static final IS_RECOMMENDED CAN_SEE_CUSTOM_STORIES;
    public static final IS_RECOMMENDED CASH_ELIGIBILITY;
    public static final IS_RECOMMENDED CUSTOM_DESCRIPTION;
    public static final IS_RECOMMENDED CUSTOM_TITLE;
    public static final IS_RECOMMENDED DIRECTION;
    public static final IS_RECOMMENDED DISPLAY_NAME;
    public static final IS_RECOMMENDED FRIENDMOJI_SYMBOLS;
    public static final IS_RECOMMENDED HAS_PROFILE_IMAGES;
    public static final IS_RECOMMENDED IS_ADDED_AS_FRIEND;
    public static final IS_RECOMMENDED IS_BLOCKED;
    public static final IS_RECOMMENDED IS_DUPLICATE_DISPLAY_NAME;
    public static final IS_RECOMMENDED IS_FOLLOWING;
    public static final IS_RECOMMENDED IS_HIDDEN;
    public static final IS_RECOMMENDED IS_IGNORED;
    public static final IS_RECOMMENDED IS_LOCAL_STORY;
    public static final IS_RECOMMENDED IS_PENDING;
    public static final IS_RECOMMENDED IS_RECOMMENDED;
    public static final IS_RECOMMENDED IS_SHARED_STORY;
    public static final IS_RECOMMENDED NEEDS_LOVE;
    public static final IS_RECOMMENDED PHONE_NUMBER;
    public static final IS_RECOMMENDED PROFILE_IMAGES_LAST_FETCHED_TIMESTAMP;
    public static final IS_RECOMMENDED SHARED_STORY_ID;
    public static final IS_RECOMMENDED SHOULD_FETCH_CUSTOM_DESCRIPTION;
    public static final IS_RECOMMENDED SNAP_STREAK_COUNT;
    public static final IS_RECOMMENDED USERNAME;
    public static final IS_RECOMMENDED USER_ID;
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
        return (c)Enum.valueOf(com/snapchat/android/database/table/FriendTable$FriendSchema, s);
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
        USERNAME = new <init>("USERNAME", 0, 1, "Username", DataType.TEXT);
        DISPLAY_NAME = new <init>("DISPLAY_NAME", 1, 2, "DisplayName", DataType.TEXT);
        PHONE_NUMBER = new <init>("PHONE_NUMBER", 2, 3, "PhoneNumber", DataType.TEXT);
        BEST_FRIEND_INDEX = new <init>("BEST_FRIEND_INDEX", 3, 4, "BestFriendIndex", DataType.INTEGER);
        IS_BLOCKED = new <init>("IS_BLOCKED", 4, 5, "IsBlocked", DataType.BOOLEAN);
        IS_PENDING = new <init>("IS_PENDING", 5, 6, "IsPending", DataType.BOOLEAN);
        IS_DUPLICATE_DISPLAY_NAME = new <init>("IS_DUPLICATE_DISPLAY_NAME", 6, 7, "IsDuplicateDisplayName", DataType.BOOLEAN);
        IS_ADDED_AS_FRIEND = new <init>("IS_ADDED_AS_FRIEND", 7, 8, "isAddedAsFriend", DataType.BOOLEAN);
        ADDED_ME_TIMESTAMP = new <init>("ADDED_ME_TIMESTAMP", 8, 9, "AddedMeTimestamp", DataType.INTEGER);
        ADDED_THEM_TIMESTAMP = new <init>("ADDED_THEM_TIMESTAMP", 9, 10, "AddedThemTimestamp", DataType.INTEGER);
        IS_SHARED_STORY = new <init>("IS_SHARED_STORY", 10, 11, "IsSharedStory", DataType.BOOLEAN);
        SHARED_STORY_ID = new <init>("SHARED_STORY_ID", 11, 12, "SharedStoryId", DataType.TEXT);
        SHOULD_FETCH_CUSTOM_DESCRIPTION = new <init>("SHOULD_FETCH_CUSTOM_DESCRIPTION", 12, 13, "ShouldFetchCustomDescription", DataType.BOOLEAN);
        CUSTOM_TITLE = new <init>("CUSTOM_TITLE", 13, 14, "CustomTitle", DataType.TEXT);
        CUSTOM_DESCRIPTION = new <init>("CUSTOM_DESCRIPTION", 14, 15, "CustomDescription", DataType.TEXT);
        IS_LOCAL_STORY = new <init>("IS_LOCAL_STORY", 15, 16, "IsLocalStory", DataType.BOOLEAN);
        CASH_ELIGIBILITY = new <init>("CASH_ELIGIBILITY", 16, 17, "CashEligibility", DataType.INTEGER);
        IS_IGNORED = new <init>("IS_IGNORED", 17, 18, "IsIgnored", DataType.BOOLEAN);
        IS_HIDDEN = new <init>("IS_HIDDEN", 18, 19, "IsHidden", DataType.BOOLEAN);
        DIRECTION = new <init>("DIRECTION", 19, 20, "Direction", DataType.TEXT);
        ADD_SOURCE = new <init>("ADD_SOURCE", 20, 21, "AddSource", DataType.TEXT);
        ADD_SOURCE_TYPE = new <init>("ADD_SOURCE_TYPE", 21, 22, "AddSourceType", DataType.TEXT);
        NEEDS_LOVE = new <init>("NEEDS_LOVE", 22, 23, "NeedsLove", DataType.BOOLEAN);
        FRIENDMOJI_SYMBOLS = new <init>("FRIENDMOJI_SYMBOLS", 23, 24, "FriendmojiSymbols", DataType.TEXT);
        USER_ID = new <init>("USER_ID", 24, 25, "UserId", DataType.TEXT);
        IS_FOLLOWING = new <init>("IS_FOLLOWING", 25, 26, "IsFollowing", DataType.BOOLEAN);
        SNAP_STREAK_COUNT = new <init>("SNAP_STREAK_COUNT", 26, 27, "SnapStreakCount", DataType.INTEGER);
        PROFILE_IMAGES_LAST_FETCHED_TIMESTAMP = new <init>("PROFILE_IMAGES_LAST_FETCHED_TIMESTAMP", 27, 28, "ProfileImagesLastFetchedTimestamp", DataType.LONG);
        HAS_PROFILE_IMAGES = new <init>("HAS_PROFILE_IMAGES", 28, 29, "HasProfileImages", DataType.BOOLEAN);
        CAN_SEE_CUSTOM_STORIES = new <init>("CAN_SEE_CUSTOM_STORIES", 29, 30, "CanSeeCustomStories", DataType.BOOLEAN);
        IS_RECOMMENDED = new <init>("IS_RECOMMENDED", 30, 31, "IsRecommended", DataType.BOOLEAN);
        $VALUES = (new .VALUES[] {
            USERNAME, DISPLAY_NAME, PHONE_NUMBER, BEST_FRIEND_INDEX, IS_BLOCKED, IS_PENDING, IS_DUPLICATE_DISPLAY_NAME, IS_ADDED_AS_FRIEND, ADDED_ME_TIMESTAMP, ADDED_THEM_TIMESTAMP, 
            IS_SHARED_STORY, SHARED_STORY_ID, SHOULD_FETCH_CUSTOM_DESCRIPTION, CUSTOM_TITLE, CUSTOM_DESCRIPTION, IS_LOCAL_STORY, CASH_ELIGIBILITY, IS_IGNORED, IS_HIDDEN, DIRECTION, 
            ADD_SOURCE, ADD_SOURCE_TYPE, NEEDS_LOVE, FRIENDMOJI_SYMBOLS, USER_ID, IS_FOLLOWING, SNAP_STREAK_COUNT, PROFILE_IMAGES_LAST_FETCHED_TIMESTAMP, HAS_PROFILE_IMAGES, CAN_SEE_CUSTOM_STORIES, 
            IS_RECOMMENDED
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
