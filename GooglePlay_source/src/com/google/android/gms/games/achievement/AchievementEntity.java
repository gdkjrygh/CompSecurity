// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.achievement:
//            Achievement, AchievementEntityCreator

public final class AchievementEntity
    implements SafeParcelable, Achievement
{

    public static final android.os.Parcelable.Creator CREATOR = new AchievementEntityCreator();
    final String mAchievementId;
    final int mCurrentSteps;
    final String mDescription;
    final String mFormattedCurrentSteps;
    final String mFormattedTotalSteps;
    final long mLastUpdatedTimestamp;
    final String mName;
    final PlayerEntity mPlayer;
    final Uri mRevealedImageUri;
    final String mRevealedImageUrl;
    final int mState;
    final int mTotalSteps;
    final int mType;
    final Uri mUnlockedImageUri;
    final String mUnlockedImageUrl;
    final int mVersionCode;
    final long mXpValue;

    AchievementEntity(int i, String s, int j, String s1, String s2, Uri uri, String s3, 
            Uri uri1, String s4, int k, String s5, PlayerEntity playerentity, int l, int i1, 
            String s6, long l1, long l2)
    {
        mVersionCode = i;
        mAchievementId = s;
        mType = j;
        mName = s1;
        mDescription = s2;
        mUnlockedImageUri = uri;
        mUnlockedImageUrl = s3;
        mRevealedImageUri = uri1;
        mRevealedImageUrl = s4;
        mTotalSteps = k;
        mFormattedTotalSteps = s5;
        mPlayer = playerentity;
        mState = l;
        mCurrentSteps = i1;
        mFormattedCurrentSteps = s6;
        mLastUpdatedTimestamp = l1;
        mXpValue = l2;
    }

    public AchievementEntity(Achievement achievement)
    {
        mVersionCode = 1;
        mAchievementId = achievement.getAchievementId();
        mType = achievement.getType();
        mName = achievement.getName();
        mDescription = achievement.getDescription();
        mUnlockedImageUri = achievement.getUnlockedImageUri();
        mUnlockedImageUrl = achievement.getUnlockedImageUrl();
        mRevealedImageUri = achievement.getRevealedImageUri();
        mRevealedImageUrl = achievement.getRevealedImageUrl();
        mPlayer = (PlayerEntity)achievement.getPlayer().freeze();
        mState = achievement.getState();
        mLastUpdatedTimestamp = achievement.getLastUpdatedTimestamp();
        mXpValue = achievement.getXpValue();
        if (achievement.getType() == 1)
        {
            mTotalSteps = achievement.getTotalSteps();
            mFormattedTotalSteps = achievement.getFormattedTotalSteps();
            mCurrentSteps = achievement.getCurrentSteps();
            mFormattedCurrentSteps = achievement.getFormattedCurrentSteps();
        } else
        {
            mTotalSteps = 0;
            mFormattedTotalSteps = null;
            mCurrentSteps = 0;
            mFormattedCurrentSteps = null;
        }
        Asserts.checkNotNull(mAchievementId);
        Asserts.checkNotNull(mDescription);
    }

    static String toString(Achievement achievement)
    {
        com.google.android.gms.common.internal.Objects.ToStringHelper tostringhelper = Objects.toStringHelper(achievement).add("Id", achievement.getAchievementId()).add("Type", Integer.valueOf(achievement.getType())).add("Name", achievement.getName()).add("Description", achievement.getDescription()).add("Player", achievement.getPlayer()).add("State", Integer.valueOf(achievement.getState()));
        if (achievement.getType() == 1)
        {
            tostringhelper.add("CurrentSteps", Integer.valueOf(achievement.getCurrentSteps()));
            tostringhelper.add("TotalSteps", Integer.valueOf(achievement.getTotalSteps()));
        }
        return tostringhelper.toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof Achievement)) goto _L2; else goto _L1
_L1:
        if (this != obj) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        obj = (Achievement)obj;
        boolean flag;
        boolean flag1;
        if (getType() == 1)
        {
            flag1 = Objects.equal(Integer.valueOf(((Achievement) (obj)).getCurrentSteps()), Integer.valueOf(getCurrentSteps()));
            flag = Objects.equal(Integer.valueOf(((Achievement) (obj)).getTotalSteps()), Integer.valueOf(getTotalSteps()));
        } else
        {
            flag = true;
            flag1 = true;
        }
        if (Objects.equal(((Achievement) (obj)).getAchievementId(), getAchievementId()) && Objects.equal(((Achievement) (obj)).getName(), getName()) && Objects.equal(Integer.valueOf(((Achievement) (obj)).getType()), Integer.valueOf(getType())) && Objects.equal(((Achievement) (obj)).getDescription(), getDescription()) && Objects.equal(Long.valueOf(((Achievement) (obj)).getXpValue()), Long.valueOf(getXpValue())) && Objects.equal(Integer.valueOf(((Achievement) (obj)).getState()), Integer.valueOf(getState())) && Objects.equal(Long.valueOf(((Achievement) (obj)).getLastUpdatedTimestamp()), Long.valueOf(getLastUpdatedTimestamp())) && Objects.equal(((Achievement) (obj)).getPlayer(), getPlayer()) && flag1 && flag) goto _L3; else goto _L2
_L2:
        return false;
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final String getAchievementId()
    {
        return mAchievementId;
    }

    public final int getCurrentSteps()
    {
        boolean flag = true;
        if (mType != 1)
        {
            flag = false;
        }
        Asserts.checkState(flag);
        return mCurrentSteps;
    }

    public final String getDescription()
    {
        return mDescription;
    }

    public final void getDescription(CharArrayBuffer chararraybuffer)
    {
        DataUtils.copyStringToBuffer(mDescription, chararraybuffer);
    }

    public final String getFormattedCurrentSteps()
    {
        boolean flag = true;
        if (mType != 1)
        {
            flag = false;
        }
        Asserts.checkState(flag);
        return mFormattedCurrentSteps;
    }

    public final String getFormattedTotalSteps()
    {
        boolean flag = true;
        if (mType != 1)
        {
            flag = false;
        }
        Asserts.checkState(flag);
        return mFormattedTotalSteps;
    }

    public final long getLastUpdatedTimestamp()
    {
        return mLastUpdatedTimestamp;
    }

    public final String getName()
    {
        return mName;
    }

    public final void getName(CharArrayBuffer chararraybuffer)
    {
        DataUtils.copyStringToBuffer(mName, chararraybuffer);
    }

    public final Player getPlayer()
    {
        return mPlayer;
    }

    public final Uri getRevealedImageUri()
    {
        return mRevealedImageUri;
    }

    public final String getRevealedImageUrl()
    {
        return mRevealedImageUrl;
    }

    public final int getState()
    {
        return mState;
    }

    public final int getTotalSteps()
    {
        boolean flag = true;
        if (mType != 1)
        {
            flag = false;
        }
        Asserts.checkState(flag);
        return mTotalSteps;
    }

    public final int getType()
    {
        return mType;
    }

    public final Uri getUnlockedImageUri()
    {
        return mUnlockedImageUri;
    }

    public final String getUnlockedImageUrl()
    {
        return mUnlockedImageUrl;
    }

    public final long getXpValue()
    {
        return mXpValue;
    }

    public final int hashCode()
    {
        int i;
        int j;
        if (getType() == 1)
        {
            j = getCurrentSteps();
            i = getTotalSteps();
        } else
        {
            i = 0;
            j = 0;
        }
        return Arrays.hashCode(new Object[] {
            getAchievementId(), getName(), Integer.valueOf(getType()), getDescription(), Long.valueOf(getXpValue()), Integer.valueOf(getState()), Long.valueOf(getLastUpdatedTimestamp()), getPlayer(), Integer.valueOf(j), Integer.valueOf(i)
        });
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final String toString()
    {
        return toString(((Achievement) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        AchievementEntityCreator.writeToParcel(this, parcel, i);
    }

}
