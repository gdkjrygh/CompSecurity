// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.google.b.f;
import com.google.b.g;
import org.json.JSONException;

public class PicUser
    implements Parcelable
{
    public static class Creator
        implements android.os.Parcelable.Creator
    {

        public PicUser createFromParcel(Parcel parcel)
        {
            return new PicUser(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public PicUser[] newArray(int i)
        {
            return new PicUser[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public Creator()
        {
        }
    }

    public static final class PicPrivateMode extends Enum
    {

        private static final PicPrivateMode $VALUES[];
        public static final PicPrivateMode EVERYONE;
        public static final PicPrivateMode MYSELF;
        public static final PicPrivateMode ONLY_ME;

        public static PicPrivateMode valueOf(String s)
        {
            return (PicPrivateMode)Enum.valueOf(com/cardinalblue/android/piccollage/model/gson/PicUser$PicPrivateMode, s);
        }

        public static PicPrivateMode[] values()
        {
            return (PicPrivateMode[])$VALUES.clone();
        }

        static 
        {
            ONLY_ME = new PicPrivateMode("ONLY_ME", 0);
            EVERYONE = new PicPrivateMode("EVERYONE", 1);
            MYSELF = new PicPrivateMode("MYSELF", 2);
            $VALUES = (new PicPrivateMode[] {
                ONLY_ME, EVERYONE, MYSELF
            });
        }

        private PicPrivateMode(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class PicRelation extends Enum
    {

        private static final PicRelation $VALUES[];
        public static final PicRelation FOLLOWING;
        public static final PicRelation ME;
        public static final PicRelation UNFOLLOW;

        public static PicRelation valueOf(String s)
        {
            return (PicRelation)Enum.valueOf(com/cardinalblue/android/piccollage/model/gson/PicUser$PicRelation, s);
        }

        public static PicRelation[] values()
        {
            return (PicRelation[])$VALUES.clone();
        }

        static 
        {
            ME = new PicRelation("ME", 0);
            FOLLOWING = new PicRelation("FOLLOWING", 1);
            UNFOLLOW = new PicRelation("UNFOLLOW", 2);
            $VALUES = (new PicRelation[] {
                ME, FOLLOWING, UNFOLLOW
            });
        }

        private PicRelation(String s, int i)
        {
            super(s, i);
        }
    }

    public static class PicUserDataChangedEvent
    {

        public PicUserDataChangedEvent()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new Creator();
    private static final String EMPTY_ID = "";
    private static final String JSON_KEY_COLLAGES_COUNT = "collages_count";
    private static final String JSON_KEY_FOLLOWERS_COUNT = "followers_count";
    private static final String JSON_KEY_FOLLOWING_COUNT = "followed_users_count";
    private static final String JSON_KEY_IS_BLOCKED = "is_blocked";
    private static final String JSON_KEY_IS_FOLLOWING = "is_following";
    private static final String JSON_KEY_LIKED_COLLAGES_COUNT = "liked_collages_count";
    private static final String JSON_KEY_PRIVACY_MODE = "privacy_mode";
    private static final String JSON_KEY_USER_EMAIL = "email";
    private static final String JSON_KEY_USER_ID = "id";
    private static final String JSON_KEY_USER_NAME = "name";
    private static final String JSON_KEY_USER_PROFILE_IMAGE_URL = "profile_image_url";
    private static final String JSON_KEY_USER_USERNAME = "username";
    private int mCollagesCount;
    private String mEmail;
    private int mFollowersCount;
    private int mFollowingCount;
    private String mId;
    private boolean mIsBlocked;
    private Boolean mIsFollowing;
    private int mLikedCollagesCount;
    private String mName;
    private String mPrivateMode;
    private String mProfileImageUrl;
    private String mUsername;

    public PicUser()
    {
        mIsBlocked = false;
        mId = "";
        mUsername = "";
        mName = "";
        mEmail = "";
        mProfileImageUrl = "";
        mIsFollowing = Boolean.valueOf(false);
        mFollowersCount = 0;
        mFollowingCount = 0;
        mCollagesCount = 0;
        mLikedCollagesCount = 0;
    }

    public PicUser(Parcel parcel)
    {
        mIsBlocked = false;
        readFromParcel(parcel);
    }

    public static PicUser fromJson(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return new PicUser();
        }
        try
        {
            s = (PicUser)k.b(s, com/cardinalblue/android/piccollage/model/gson/PicUser);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return new PicUser();
        }
        return s;
    }

    private void readFromParcel(Parcel parcel)
    {
        boolean flag = true;
        mId = parcel.readString();
        mUsername = parcel.readString();
        mName = parcel.readString();
        mEmail = parcel.readString();
        mProfileImageUrl = parcel.readString();
        if (parcel.readByte() != 1)
        {
            flag = false;
        }
        mIsFollowing = Boolean.valueOf(flag);
        mFollowersCount = parcel.readInt();
        mFollowingCount = parcel.readInt();
        mCollagesCount = parcel.readInt();
        mLikedCollagesCount = parcel.readInt();
        mPrivateMode = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        } else
        {
            return ((PicUser)obj).getId().equals(getId());
        }
    }

    public int getCollagesCount()
    {
        return mCollagesCount;
    }

    public String getDisplayName()
    {
        if (!TextUtils.isEmpty(mUsername))
        {
            return mUsername;
        } else
        {
            return mName;
        }
    }

    public String getEmail()
    {
        if (mEmail == null)
        {
            return "";
        } else
        {
            return mEmail;
        }
    }

    public int getFollowersCount()
    {
        return mFollowersCount;
    }

    public int getFollowingCount()
    {
        return mFollowingCount;
    }

    public String getId()
    {
        if (mId == null)
        {
            return "";
        } else
        {
            return mId;
        }
    }

    public int getLikedCollagesCount()
    {
        return mLikedCollagesCount;
    }

    public String getName()
    {
        if (mName == null)
        {
            return "";
        } else
        {
            return mName;
        }
    }

    public PicPrivateMode getPicPrivateMode()
    {
        if (mPrivateMode == null)
        {
            return PicPrivateMode.MYSELF;
        }
        if (mPrivateMode.equals("only_me"))
        {
            return PicPrivateMode.ONLY_ME;
        } else
        {
            return PicPrivateMode.EVERYONE;
        }
    }

    public String getProfileImageUrl()
    {
        if (mProfileImageUrl == null)
        {
            return "";
        } else
        {
            return mProfileImageUrl;
        }
    }

    public String getUsername()
    {
        if (mUsername == null)
        {
            return "";
        } else
        {
            return mUsername;
        }
    }

    public boolean isBlocked()
    {
        return mIsBlocked;
    }

    public Boolean isFollowing()
    {
        return mIsFollowing;
    }

    public boolean isMe()
    {
        return isValid() && PicAuth.h().i().equals(this);
    }

    public boolean isPrivate()
    {
        return getPicPrivateMode() == PicPrivateMode.ONLY_ME;
    }

    public boolean isValid()
    {
        return !TextUtils.isEmpty(mId);
    }

    public void setBlocked(boolean flag)
    {
        mIsBlocked = flag;
    }

    public void setFollowersCount(int i)
    {
        mFollowersCount = i;
    }

    public void setIsFollowing(boolean flag)
    {
        mIsFollowing = Boolean.valueOf(flag);
    }

    public String toJSONString()
    {
        return (new g()).a().b(this, com/cardinalblue/android/piccollage/model/gson/PicUser).toString();
    }

    public void toggleFollowing()
    {
        boolean flag;
        if (!mIsFollowing.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsFollowing = Boolean.valueOf(flag);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(getId());
        parcel.writeString(getUsername());
        parcel.writeString(getName());
        parcel.writeString(getEmail());
        parcel.writeString(getProfileImageUrl());
        if (isFollowing().booleanValue())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
        parcel.writeInt(getFollowersCount());
        parcel.writeInt(getFollowingCount());
        parcel.writeInt(getCollagesCount());
        parcel.writeInt(getLikedCollagesCount());
        parcel.writeString(mPrivateMode);
    }

}
