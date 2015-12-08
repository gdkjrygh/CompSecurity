// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.drive.DriveId;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEvent, ProgressEventCreator

public final class ProgressEvent
    implements DriveEvent
{

    public static final android.os.Parcelable.Creator CREATOR = new ProgressEventCreator();
    final long mBytesTransferred;
    final DriveId mDriveId;
    final int mStatus;
    final long mTotalBytes;
    final int mType;
    final int mVersionCode;

    ProgressEvent(int i, DriveId driveid, int j, long l, long l1, 
            int k)
    {
        mVersionCode = i;
        mDriveId = driveid;
        mStatus = j;
        mBytesTransferred = l;
        mTotalBytes = l1;
        mType = k;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj != null && obj.getClass() == getClass()) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == this) goto _L4; else goto _L3
_L3:
        obj = (ProgressEvent)obj;
        if (!Objects.equal(mDriveId, ((ProgressEvent) (obj)).mDriveId) || mStatus != ((ProgressEvent) (obj)).mStatus || mBytesTransferred != ((ProgressEvent) (obj)).mBytesTransferred)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (mTotalBytes == ((ProgressEvent) (obj)).mTotalBytes) goto _L4; else goto _L5
_L5:
        return false;
    }

    public final int getType()
    {
        return mType;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mDriveId, Integer.valueOf(mStatus), Long.valueOf(mBytesTransferred), Long.valueOf(mTotalBytes)
        });
    }

    public final String toString()
    {
        return String.format("ProgressEvent[DriveId: %s, status: %d, bytes transferred: %d, total bytes: %d]", new Object[] {
            mDriveId, Integer.valueOf(mStatus), Long.valueOf(mBytesTransferred), Long.valueOf(mTotalBytes)
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ProgressEventCreator.writeToParcel(this, parcel, i);
    }

}
