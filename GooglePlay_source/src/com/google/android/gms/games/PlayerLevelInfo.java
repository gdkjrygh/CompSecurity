// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games:
//            PlayerLevelInfoCreator, PlayerLevel

public final class PlayerLevelInfo
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new PlayerLevelInfoCreator();
    public final PlayerLevel mCurrentLevel;
    public final long mCurrentXpTotal;
    public final long mLastLevelUpTimestamp;
    public final PlayerLevel mNextLevel;
    final int mVersionCode;

    PlayerLevelInfo(int i, long l, long l1, PlayerLevel playerlevel, PlayerLevel playerlevel1)
    {
        boolean flag;
        if (l != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        Preconditions.checkNotNull(playerlevel);
        Preconditions.checkNotNull(playerlevel1);
        mVersionCode = i;
        mCurrentXpTotal = l;
        mLastLevelUpTimestamp = l1;
        mCurrentLevel = playerlevel;
        mNextLevel = playerlevel1;
    }

    public PlayerLevelInfo(long l, long l1, PlayerLevel playerlevel, PlayerLevel playerlevel1)
    {
        this(1, l, l1, playerlevel, playerlevel1);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof PlayerLevelInfo)
        {
            if (obj == this)
            {
                return true;
            }
            obj = (PlayerLevelInfo)obj;
            if (Objects.equal(Long.valueOf(mCurrentXpTotal), Long.valueOf(((PlayerLevelInfo) (obj)).mCurrentXpTotal)) && Objects.equal(Long.valueOf(mLastLevelUpTimestamp), Long.valueOf(((PlayerLevelInfo) (obj)).mLastLevelUpTimestamp)) && Objects.equal(mCurrentLevel, ((PlayerLevelInfo) (obj)).mCurrentLevel) && Objects.equal(mNextLevel, ((PlayerLevelInfo) (obj)).mNextLevel))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Long.valueOf(mCurrentXpTotal), Long.valueOf(mLastLevelUpTimestamp), mCurrentLevel, mNextLevel
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        PlayerLevelInfoCreator.writeToParcel(this, parcel, i);
    }

}
