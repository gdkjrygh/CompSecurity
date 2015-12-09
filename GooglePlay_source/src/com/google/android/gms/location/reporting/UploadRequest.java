// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.reporting:
//            UploadRequestCreator

public class UploadRequest
    implements SafeParcelable
{

    public static final UploadRequestCreator CREATOR = new UploadRequestCreator();
    final Account mAccount;
    final String mAppSpecificKey;
    final long mDurationMillis;
    final long mMovingLatencyMillis;
    final String mReason;
    final long mStationaryLatencyMillis;
    final int mVersionCode;

    public UploadRequest(int i, Account account, String s, long l, long l1, 
            long l2, String s1)
    {
        mVersionCode = i;
        mAccount = account;
        mReason = s;
        mDurationMillis = l;
        mMovingLatencyMillis = l1;
        mStationaryLatencyMillis = l2;
        mAppSpecificKey = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof UploadRequest))
            {
                return false;
            }
            obj = (UploadRequest)obj;
            if (!mAccount.equals(((UploadRequest) (obj)).mAccount) || !mReason.equals(((UploadRequest) (obj)).mReason) || !Objects.equal(Long.valueOf(mDurationMillis), Long.valueOf(((UploadRequest) (obj)).mDurationMillis)) || mMovingLatencyMillis != ((UploadRequest) (obj)).mMovingLatencyMillis || mStationaryLatencyMillis != ((UploadRequest) (obj)).mStationaryLatencyMillis || !Objects.equal(mAppSpecificKey, ((UploadRequest) (obj)).mAppSpecificKey))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mAccount, mReason, Long.valueOf(mDurationMillis), Long.valueOf(mMovingLatencyMillis), Long.valueOf(mStationaryLatencyMillis), mAppSpecificKey
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("UploadRequest{mVersionCode=")).append(mVersionCode).append(", mAccount=");
        Object obj = mAccount;
        if (obj == null)
        {
            obj = "null";
        } else
        if (Log.isLoggable("GCoreUlr", 2))
        {
            obj = ((Account) (obj)).name;
        } else
        {
            obj = (new StringBuilder("account#")).append(((Account) (obj)).name.hashCode() % 20).append("#").toString();
        }
        return stringbuilder.append(((String) (obj))).append(", mReason='").append(mReason).append('\'').append(", mDurationMillis=").append(mDurationMillis).append(", mMovingLatencyMillis=").append(mMovingLatencyMillis).append(", mStationaryLatencyMillis=").append(mStationaryLatencyMillis).append(", mAppSpecificKey='").append(mAppSpecificKey).append('\'').append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        UploadRequestCreator.writeToParcel(this, parcel, i);
    }

}
