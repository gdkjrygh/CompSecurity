// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive:
//            ContentsCreator, DriveId

public class Contents
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ContentsCreator();
    public final DriveId mDriveId;
    public final int mMode;
    public final ParcelFileDescriptor mParcelFileDescriptor;
    public final int mRequestId;
    final String mSignature;
    public final boolean mValidForConflictDetection;
    final int mVersionCode;

    Contents(int i, ParcelFileDescriptor parcelfiledescriptor, int j, int k, DriveId driveid, boolean flag, String s)
    {
        mVersionCode = i;
        mParcelFileDescriptor = parcelfiledescriptor;
        mRequestId = j;
        mMode = k;
        mDriveId = driveid;
        mValidForConflictDetection = flag;
        mSignature = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ContentsCreator.writeToParcel(this, parcel, i);
    }

}
