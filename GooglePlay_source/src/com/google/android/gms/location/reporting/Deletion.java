// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.reporting:
//            DeletionCreator

public final class Deletion
    implements SafeParcelable
{

    public static final DeletionCreator CREATOR = new DeletionCreator();
    final Account mAccount;
    final long mEndTimeMs;
    final long mStartTimeMs;
    final long mTimestampMs;
    final int mVersionCode;

    Deletion(int i, Account account, Long long1, Long long2, Long long3)
    {
        mVersionCode = i;
        mAccount = account;
        mStartTimeMs = long1.longValue();
        mEndTimeMs = long2.longValue();
        mTimestampMs = long3.longValue();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Deletion))
            {
                return false;
            }
            obj = (Deletion)obj;
            if (mStartTimeMs != ((Deletion) (obj)).mStartTimeMs || mEndTimeMs != ((Deletion) (obj)).mEndTimeMs || mTimestampMs != ((Deletion) (obj)).mTimestampMs || !Objects.equal(mAccount, ((Deletion) (obj)).mAccount))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mAccount, Long.valueOf(mStartTimeMs), Long.valueOf(mEndTimeMs), Long.valueOf(mTimestampMs)
        });
    }

    public final String toString()
    {
        return (new StringBuilder("Deletion{mAccount=")).append(mAccount).append(", mStartTimeMs=").append(mStartTimeMs).append(", mEndTimeMs=").append(mEndTimeMs).append(", mTimestampMs=").append(mTimestampMs).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        DeletionCreator.writeToParcel(this, parcel, i);
    }

}
