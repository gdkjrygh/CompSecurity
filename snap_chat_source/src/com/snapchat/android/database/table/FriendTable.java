// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import Br;
import Jc;
import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.snapchat.android.database.DataType;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import tA;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            DbTable

public class FriendTable extends DbTable
{
    public static final class FriendSchema extends Enum
        implements tt
    {

        private static final FriendSchema $VALUES[];
        public static final FriendSchema ADDED_ME_TIMESTAMP;
        public static final FriendSchema ADDED_THEM_TIMESTAMP;
        public static final FriendSchema ADD_SOURCE;
        public static final FriendSchema ADD_SOURCE_TYPE;
        public static final FriendSchema BEST_FRIEND_INDEX;
        public static final FriendSchema CAN_SEE_CUSTOM_STORIES;
        public static final FriendSchema CASH_ELIGIBILITY;
        public static final FriendSchema CUSTOM_DESCRIPTION;
        public static final FriendSchema CUSTOM_TITLE;
        public static final FriendSchema DIRECTION;
        public static final FriendSchema DISPLAY_NAME;
        public static final FriendSchema FRIENDMOJI_SYMBOLS;
        public static final FriendSchema HAS_PROFILE_IMAGES;
        public static final FriendSchema IS_ADDED_AS_FRIEND;
        public static final FriendSchema IS_BLOCKED;
        public static final FriendSchema IS_DUPLICATE_DISPLAY_NAME;
        public static final FriendSchema IS_FOLLOWING;
        public static final FriendSchema IS_HIDDEN;
        public static final FriendSchema IS_IGNORED;
        public static final FriendSchema IS_LOCAL_STORY;
        public static final FriendSchema IS_PENDING;
        public static final FriendSchema IS_RECOMMENDED;
        public static final FriendSchema IS_SHARED_STORY;
        public static final FriendSchema NEEDS_LOVE;
        public static final FriendSchema PHONE_NUMBER;
        public static final FriendSchema PROFILE_IMAGES_LAST_FETCHED_TIMESTAMP;
        public static final FriendSchema SHARED_STORY_ID;
        public static final FriendSchema SHOULD_FETCH_CUSTOM_DESCRIPTION;
        public static final FriendSchema SNAP_STREAK_COUNT;
        public static final FriendSchema USERNAME;
        public static final FriendSchema USER_ID;
        private int a;
        private String b;
        private DataType c;

        static String a(FriendSchema friendschema)
        {
            return friendschema.b;
        }

        static DataType b(FriendSchema friendschema)
        {
            return friendschema.c;
        }

        public static FriendSchema valueOf(String s)
        {
            return (FriendSchema)Enum.valueOf(com/snapchat/android/database/table/FriendTable$FriendSchema, s);
        }

        public static FriendSchema[] values()
        {
            return (FriendSchema[])$VALUES.clone();
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
            USERNAME = new FriendSchema("USERNAME", 0, 1, "Username", DataType.TEXT);
            DISPLAY_NAME = new FriendSchema("DISPLAY_NAME", 1, 2, "DisplayName", DataType.TEXT);
            PHONE_NUMBER = new FriendSchema("PHONE_NUMBER", 2, 3, "PhoneNumber", DataType.TEXT);
            BEST_FRIEND_INDEX = new FriendSchema("BEST_FRIEND_INDEX", 3, 4, "BestFriendIndex", DataType.INTEGER);
            IS_BLOCKED = new FriendSchema("IS_BLOCKED", 4, 5, "IsBlocked", DataType.BOOLEAN);
            IS_PENDING = new FriendSchema("IS_PENDING", 5, 6, "IsPending", DataType.BOOLEAN);
            IS_DUPLICATE_DISPLAY_NAME = new FriendSchema("IS_DUPLICATE_DISPLAY_NAME", 6, 7, "IsDuplicateDisplayName", DataType.BOOLEAN);
            IS_ADDED_AS_FRIEND = new FriendSchema("IS_ADDED_AS_FRIEND", 7, 8, "isAddedAsFriend", DataType.BOOLEAN);
            ADDED_ME_TIMESTAMP = new FriendSchema("ADDED_ME_TIMESTAMP", 8, 9, "AddedMeTimestamp", DataType.INTEGER);
            ADDED_THEM_TIMESTAMP = new FriendSchema("ADDED_THEM_TIMESTAMP", 9, 10, "AddedThemTimestamp", DataType.INTEGER);
            IS_SHARED_STORY = new FriendSchema("IS_SHARED_STORY", 10, 11, "IsSharedStory", DataType.BOOLEAN);
            SHARED_STORY_ID = new FriendSchema("SHARED_STORY_ID", 11, 12, "SharedStoryId", DataType.TEXT);
            SHOULD_FETCH_CUSTOM_DESCRIPTION = new FriendSchema("SHOULD_FETCH_CUSTOM_DESCRIPTION", 12, 13, "ShouldFetchCustomDescription", DataType.BOOLEAN);
            CUSTOM_TITLE = new FriendSchema("CUSTOM_TITLE", 13, 14, "CustomTitle", DataType.TEXT);
            CUSTOM_DESCRIPTION = new FriendSchema("CUSTOM_DESCRIPTION", 14, 15, "CustomDescription", DataType.TEXT);
            IS_LOCAL_STORY = new FriendSchema("IS_LOCAL_STORY", 15, 16, "IsLocalStory", DataType.BOOLEAN);
            CASH_ELIGIBILITY = new FriendSchema("CASH_ELIGIBILITY", 16, 17, "CashEligibility", DataType.INTEGER);
            IS_IGNORED = new FriendSchema("IS_IGNORED", 17, 18, "IsIgnored", DataType.BOOLEAN);
            IS_HIDDEN = new FriendSchema("IS_HIDDEN", 18, 19, "IsHidden", DataType.BOOLEAN);
            DIRECTION = new FriendSchema("DIRECTION", 19, 20, "Direction", DataType.TEXT);
            ADD_SOURCE = new FriendSchema("ADD_SOURCE", 20, 21, "AddSource", DataType.TEXT);
            ADD_SOURCE_TYPE = new FriendSchema("ADD_SOURCE_TYPE", 21, 22, "AddSourceType", DataType.TEXT);
            NEEDS_LOVE = new FriendSchema("NEEDS_LOVE", 22, 23, "NeedsLove", DataType.BOOLEAN);
            FRIENDMOJI_SYMBOLS = new FriendSchema("FRIENDMOJI_SYMBOLS", 23, 24, "FriendmojiSymbols", DataType.TEXT);
            USER_ID = new FriendSchema("USER_ID", 24, 25, "UserId", DataType.TEXT);
            IS_FOLLOWING = new FriendSchema("IS_FOLLOWING", 25, 26, "IsFollowing", DataType.BOOLEAN);
            SNAP_STREAK_COUNT = new FriendSchema("SNAP_STREAK_COUNT", 26, 27, "SnapStreakCount", DataType.INTEGER);
            PROFILE_IMAGES_LAST_FETCHED_TIMESTAMP = new FriendSchema("PROFILE_IMAGES_LAST_FETCHED_TIMESTAMP", 27, 28, "ProfileImagesLastFetchedTimestamp", DataType.LONG);
            HAS_PROFILE_IMAGES = new FriendSchema("HAS_PROFILE_IMAGES", 28, 29, "HasProfileImages", DataType.BOOLEAN);
            CAN_SEE_CUSTOM_STORIES = new FriendSchema("CAN_SEE_CUSTOM_STORIES", 29, 30, "CanSeeCustomStories", DataType.BOOLEAN);
            IS_RECOMMENDED = new FriendSchema("IS_RECOMMENDED", 30, 31, "IsRecommended", DataType.BOOLEAN);
            $VALUES = (new FriendSchema[] {
                USERNAME, DISPLAY_NAME, PHONE_NUMBER, BEST_FRIEND_INDEX, IS_BLOCKED, IS_PENDING, IS_DUPLICATE_DISPLAY_NAME, IS_ADDED_AS_FRIEND, ADDED_ME_TIMESTAMP, ADDED_THEM_TIMESTAMP, 
                IS_SHARED_STORY, SHARED_STORY_ID, SHOULD_FETCH_CUSTOM_DESCRIPTION, CUSTOM_TITLE, CUSTOM_DESCRIPTION, IS_LOCAL_STORY, CASH_ELIGIBILITY, IS_IGNORED, IS_HIDDEN, DIRECTION, 
                ADD_SOURCE, ADD_SOURCE_TYPE, NEEDS_LOVE, FRIENDMOJI_SYMBOLS, USER_ID, IS_FOLLOWING, SNAP_STREAK_COUNT, PROFILE_IMAGES_LAST_FETCHED_TIMESTAMP, HAS_PROFILE_IMAGES, CAN_SEE_CUSTOM_STORIES, 
                IS_RECOMMENDED
            });
        }

        private FriendSchema(String s, int i, int j, String s1, DataType datatype)
        {
            super(s, i);
            a = j;
            b = s1;
            c = datatype;
        }
    }


    private static FriendTable a;
    private final FriendManager b = FriendManager.e();

    public FriendTable()
    {
    }

    public static FriendTable f()
    {
        com/snapchat/android/database/table/FriendTable;
        JVM INSTR monitorenter ;
        FriendTable friendtable;
        if (a == null)
        {
            a = new FriendTable();
        }
        friendtable = a;
        com/snapchat/android/database/table/FriendTable;
        JVM INSTR monitorexit ;
        return friendtable;
        Exception exception;
        exception;
        throw exception;
    }

    public static String g()
    {
        return (new StringBuilder()).append(FriendSchema.IS_BLOCKED.getColumnName()).append(", (CASE WHEN length(").append(FriendSchema.DISPLAY_NAME.getColumnName()).append(") = 0 THEN ").append(FriendSchema.USERNAME.getColumnName()).append(" ELSE ").append(FriendSchema.DISPLAY_NAME.getColumnName()).append(" END) COLLATE NOCASE").toString();
    }

    protected final ContentValues a(Object obj)
    {
        boolean flag = true;
        obj = (Friend)obj;
        if (obj == null)
        {
            return null;
        }
        tA ta = new tA();
        ta.a(FriendSchema.USERNAME, ((Friend) (obj)).g());
        ta.a(FriendSchema.USER_ID, ((Friend) (obj)).mUserId);
        ta.a(FriendSchema.DISPLAY_NAME, ((Friend) (obj)).mDisplayName);
        ta.a(FriendSchema.PHONE_NUMBER, ((Friend) (obj)).mPhoneNumber);
        ta.a(FriendSchema.BEST_FRIEND_INDEX, ((Friend) (obj)).mBestFriendIndex);
        FriendSchema friendschema = FriendSchema.IS_BLOCKED;
        int i;
        if (((Friend) (obj)).mIsBlocked)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(friendschema, i);
        friendschema = FriendSchema.IS_PENDING;
        if (((Friend) (obj)).mIsPending)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(friendschema, i);
        friendschema = FriendSchema.IS_FOLLOWING;
        if (((Friend) (obj)).mIsFollowing)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(friendschema, i);
        friendschema = FriendSchema.IS_ADDED_AS_FRIEND;
        if (((Friend) (obj)).mHasBeenAddedAsFriend)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(friendschema, i);
        ta.a(FriendSchema.ADDED_ME_TIMESTAMP, ((Friend) (obj)).mTheyAddedMeTimestamp);
        ta.a(FriendSchema.ADDED_THEM_TIMESTAMP, ((Friend) (obj)).mIAddedThemTimestamp);
        friendschema = FriendSchema.IS_SHARED_STORY;
        if (((Friend) (obj)).mIsSharedStory)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(friendschema, i);
        ta.a(FriendSchema.SHARED_STORY_ID, ((Friend) (obj)).mSharedStoryId);
        friendschema = FriendSchema.SHOULD_FETCH_CUSTOM_DESCRIPTION;
        if (((Friend) (obj)).mShouldFetchCustomDescription)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(friendschema, i);
        ta.a(FriendSchema.CUSTOM_TITLE, ((Friend) (obj)).mCustomTitle);
        ta.a(FriendSchema.CUSTOM_DESCRIPTION, ((Friend) (obj)).mCustomDescription);
        friendschema = FriendSchema.IS_LOCAL_STORY;
        if (((Friend) (obj)).mIsLocalStory)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(friendschema, i);
        ta.a(FriendSchema.CASH_ELIGIBILITY, ((Friend) (obj)).o().ordinal());
        friendschema = FriendSchema.IS_IGNORED;
        if (((Friend) (obj)).mIsIgnored)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(friendschema, i);
        friendschema = FriendSchema.IS_HIDDEN;
        if (((Friend) (obj)).mIsHidden)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(friendschema, i);
        ta.a(FriendSchema.DIRECTION, ((Friend) (obj)).mDirection.name());
        ta.a(FriendSchema.ADD_SOURCE, ((Friend) (obj)).mAddSource);
        ta.a(FriendSchema.ADD_SOURCE_TYPE, ((Friend) (obj)).mAddSourceType.name());
        friendschema = FriendSchema.NEEDS_LOVE;
        if (((Friend) (obj)).mCandidateForNeedsLove)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(friendschema, i);
        ta.a(FriendSchema.FRIENDMOJI_SYMBOLS, TextUtils.join(" ", ((Friend) (obj)).r()));
        ta.a(FriendSchema.SNAP_STREAK_COUNT, ((Friend) (obj)).mSnapStreakCount);
        ta.a(FriendSchema.PROFILE_IMAGES_LAST_FETCHED_TIMESTAMP, ((Friend) (obj)).mProfileImagesLastFetchedTimestamp);
        friendschema = FriendSchema.HAS_PROFILE_IMAGES;
        if (((Friend) (obj)).mHasProfileImages)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(friendschema, i);
        friendschema = FriendSchema.CAN_SEE_CUSTOM_STORIES;
        if (((Friend) (obj)).mCanSeeCustomStories)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ta.a(friendschema, i);
        friendschema = FriendSchema.IS_RECOMMENDED;
        if (((Friend) (obj)).mIsRecommended)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        ta.a(friendschema, i);
        return ta.a;
    }

    protected final Object a(Cursor cursor)
    {
        boolean flag1 = true;
        Friend friend = new Friend("", null);
        String s1 = cursor.getString(FriendSchema.USERNAME.getColumnNumber());
        String s = s1;
        if (s1 == null)
        {
            s = "";
        }
        friend.mUsername = s;
        friend.mUserId = cursor.getString(FriendSchema.USER_ID.getColumnNumber());
        friend.a(cursor.getString(FriendSchema.DISPLAY_NAME.getColumnNumber()));
        friend.mPhoneNumber = cursor.getString(FriendSchema.PHONE_NUMBER.getColumnNumber());
        friend.mBestFriendIndex = cursor.getInt(FriendSchema.BEST_FRIEND_INDEX.getColumnNumber());
        boolean flag;
        if (cursor.getInt(FriendSchema.IS_BLOCKED.getColumnNumber()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        friend.mIsBlocked = flag;
        if (cursor.getInt(FriendSchema.IS_PENDING.getColumnNumber()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        friend.mIsPending = flag;
        if (cursor.getInt(FriendSchema.IS_FOLLOWING.getColumnNumber()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        friend.mIsFollowing = flag;
        if (cursor.getInt(FriendSchema.IS_ADDED_AS_FRIEND.getColumnNumber()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        friend.mHasBeenAddedAsFriend = flag;
        friend.mTheyAddedMeTimestamp = cursor.getLong(FriendSchema.ADDED_ME_TIMESTAMP.getColumnNumber());
        friend.mIAddedThemTimestamp = cursor.getLong(FriendSchema.ADDED_THEM_TIMESTAMP.getColumnNumber());
        if (cursor.getInt(FriendSchema.IS_SHARED_STORY.getColumnNumber()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        friend.mIsSharedStory = flag;
        friend.mSharedStoryId = cursor.getString(FriendSchema.SHARED_STORY_ID.getColumnNumber());
        if (cursor.getInt(FriendSchema.SHOULD_FETCH_CUSTOM_DESCRIPTION.getColumnNumber()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        friend.mShouldFetchCustomDescription = flag;
        friend.mCustomTitle = cursor.getString(FriendSchema.CUSTOM_TITLE.getColumnNumber());
        friend.mCustomDescription = cursor.getString(FriendSchema.CUSTOM_DESCRIPTION.getColumnNumber());
        if (cursor.getInt(FriendSchema.IS_LOCAL_STORY.getColumnNumber()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        friend.mIsLocalStory = flag;
        friend.mCashEligibility = TD.a.values()[cursor.getInt(FriendSchema.CASH_ELIGIBILITY.getColumnNumber())];
        if (cursor.getInt(FriendSchema.IS_IGNORED.getColumnNumber()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        friend.mIsIgnored = flag;
        if (cursor.getInt(FriendSchema.IS_HIDDEN.getColumnNumber()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        friend.mIsHidden = flag;
        friend.mDirection = com.snapchat.android.model.Friend.Direction.fromValue(cursor.getString(FriendSchema.DIRECTION.getColumnNumber()));
        friend.mAddSource = cursor.getString(FriendSchema.ADD_SOURCE.getColumnNumber());
        friend.mAddSourceType = com.snapchat.android.model.Friend.AddSourceType.fromValue(cursor.getString(FriendSchema.ADD_SOURCE_TYPE.getColumnNumber()));
        if (cursor.getInt(FriendSchema.NEEDS_LOVE.getColumnNumber()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        friend.mCandidateForNeedsLove = flag;
        s = cursor.getString(FriendSchema.FRIENDMOJI_SYMBOLS.getColumnNumber());
        if (TextUtils.isEmpty(s))
        {
            friend.a(new ArrayList());
        } else
        {
            friend.a(Arrays.asList(TextUtils.split(s, " ")));
        }
        friend.a(cursor.getInt(FriendSchema.SNAP_STREAK_COUNT.getColumnNumber()));
        friend.mProfileImagesLastFetchedTimestamp = cursor.getLong(FriendSchema.PROFILE_IMAGES_LAST_FETCHED_TIMESTAMP.getColumnNumber());
        if (cursor.getInt(FriendSchema.HAS_PROFILE_IMAGES.getColumnNumber()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        friend.mHasProfileImages = flag;
        if (cursor.getInt(FriendSchema.CAN_SEE_CUSTOM_STORIES.getColumnNumber()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        friend.mCanSeeCustomStories = flag;
        if (cursor.getInt(FriendSchema.IS_RECOMMENDED.getColumnNumber()) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        friend.mIsRecommended = flag;
        return friend;
    }

    public Collection a(Br br)
    {
        return b.mOutgoingFriendsListMap.b();
    }

    public void b(Br br)
    {
        br = b;
        java.util.List list = a(null, g());
        ((FriendManager) (br)).mOutgoingFriendsListMap.a(list);
        br.h();
    }

    public final tt[] b()
    {
        return FriendSchema.values();
    }

    public String c()
    {
        return "Friends";
    }

    public final String d()
    {
        String s = "_id INTEGER PRIMARY KEY";
        FriendSchema afriendschema[] = FriendSchema.values();
        int j = afriendschema.length;
        for (int i = 0; i < j; i++)
        {
            FriendSchema friendschema = afriendschema[i];
            s = (new StringBuilder()).append(s).append(",").append(FriendSchema.a(friendschema)).append(" ").append(FriendSchema.b(friendschema).toString()).toString();
        }

        return s;
    }
}
