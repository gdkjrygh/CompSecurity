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
//            PlayerLevelCreator

public final class PlayerLevel
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new PlayerLevelCreator();
    public final int mLevelNumber;
    public final long mMaxXp;
    public final long mMinXp;
    final int mVersionCode;

    PlayerLevel(int i, int j, long l, long l1)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Min XP must be positive!");
        if (l1 > l)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Max XP must be more than min XP!");
        mVersionCode = i;
        mLevelNumber = j;
        mMinXp = l;
        mMaxXp = l1;
    }

    public PlayerLevel(int i, long l, long l1)
    {
        this(1, i, l, l1);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof PlayerLevel)
        {
            if (this == obj)
            {
                return true;
            }
            obj = (PlayerLevel)obj;
            if (Objects.equal(Integer.valueOf(((PlayerLevel) (obj)).mLevelNumber), Integer.valueOf(mLevelNumber)) && Objects.equal(Long.valueOf(((PlayerLevel) (obj)).mMinXp), Long.valueOf(mMinXp)) && Objects.equal(Long.valueOf(((PlayerLevel) (obj)).mMaxXp), Long.valueOf(mMaxXp)))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(mLevelNumber), Long.valueOf(mMinXp), Long.valueOf(mMaxXp)
        });
    }

    public final String toString()
    {
        return Objects.toStringHelper(this).add("LevelNumber", Integer.valueOf(mLevelNumber)).add("MinXp", Long.valueOf(mMinXp)).add("MaxXp", Long.valueOf(mMaxXp)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        PlayerLevelCreator.writeToParcel$6fcc3d2f(this, parcel);
    }

}
