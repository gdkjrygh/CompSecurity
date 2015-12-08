// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive:
//            DriveFileRangeCreator

public class DriveFileRange
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new DriveFileRangeCreator();
    final long mFromByte;
    final long mToByte;
    final int mVersionCode;

    DriveFileRange(int i, long l, long l1)
    {
        mVersionCode = i;
        mFromByte = l;
        mToByte = l1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        DriveFileRangeCreator.writeToParcel$11ed83c(this, parcel);
    }

}
