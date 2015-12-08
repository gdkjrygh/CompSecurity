// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            LargeAssetQueueEntryParcelableCreator

public final class LargeAssetQueueEntryParcelable
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new LargeAssetQueueEntryParcelableCreator();
    final boolean mAllowedOverMetered;
    final boolean mAllowedWithLowBattery;
    final boolean mAppend;
    final Uri mDestinationUri;
    final String mNodeId;
    final String mPath;
    final int mRefuseErrorCode;
    final int mState;
    final long mTransferId;
    final int mVersionCode;

    LargeAssetQueueEntryParcelable(int i, long l, int j, String s, String s1, Uri uri, 
            int k, boolean flag, boolean flag1, boolean flag2)
    {
        mVersionCode = i;
        mTransferId = l;
        mState = j;
        mPath = (String)Preconditions.checkNotNull(s, "path");
        mNodeId = (String)Preconditions.checkNotNull(s1, "nodeId");
        mDestinationUri = (Uri)Preconditions.checkNotNull(uri, "destinationUri");
        mRefuseErrorCode = k;
        mAppend = flag;
        mAllowedOverMetered = flag1;
        mAllowedWithLowBattery = flag2;
    }

    public LargeAssetQueueEntryParcelable(long l, int i, String s, String s1, Uri uri, int j, 
            boolean flag, boolean flag1, boolean flag2)
    {
        this(1, l, i, s, s1, uri, j, flag, flag1, flag2);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LargeAssetQueueEntryParcelable))
            {
                return false;
            }
            obj = (LargeAssetQueueEntryParcelable)obj;
            if (mVersionCode != ((LargeAssetQueueEntryParcelable) (obj)).mVersionCode || mTransferId != ((LargeAssetQueueEntryParcelable) (obj)).mTransferId || mState != ((LargeAssetQueueEntryParcelable) (obj)).mState || !mPath.equals(((LargeAssetQueueEntryParcelable) (obj)).mPath) || !mNodeId.equals(((LargeAssetQueueEntryParcelable) (obj)).mNodeId) || !mDestinationUri.equals(((LargeAssetQueueEntryParcelable) (obj)).mDestinationUri) || mAppend != ((LargeAssetQueueEntryParcelable) (obj)).mAppend || mAllowedOverMetered != ((LargeAssetQueueEntryParcelable) (obj)).mAllowedOverMetered || mAllowedWithLowBattery != ((LargeAssetQueueEntryParcelable) (obj)).mAllowedWithLowBattery || mRefuseErrorCode != ((LargeAssetQueueEntryParcelable) (obj)).mRefuseErrorCode)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int k = 1;
        int l = mVersionCode;
        int i1 = (int)(mTransferId ^ mTransferId >>> 32);
        int j1 = mState;
        int k1 = mPath.hashCode();
        int l1 = mNodeId.hashCode();
        int i2 = mDestinationUri.hashCode();
        int i;
        int j;
        if (mAppend)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (mAllowedOverMetered)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (!mAllowedWithLowBattery)
        {
            k = 0;
        }
        return ((((((((l * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + i) * 31 + j) * 31 + k) * 31 + mRefuseErrorCode;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("QueueEntry{versionCode=")).append(mVersionCode).append(", transferId=").append(mTransferId).append(", state=").append(mState).append(", path='").append(mPath).append("', nodeId='").append(mNodeId).append("', destinationUri='").append(mDestinationUri).append("'");
        String s;
        if (mAppend)
        {
            s = ", append=true";
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s);
        if (mAllowedOverMetered)
        {
            s = ", allowedOverMetered=true";
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s);
        if (mAllowedWithLowBattery)
        {
            s = ", allowedWithLowBattery=true";
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).append(", refuseErrorCode=").append(mRefuseErrorCode).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        LargeAssetQueueEntryParcelableCreator.writeToParcel(this, parcel, i);
    }

}
