// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnDriveIdResponseCreator

public class OnDriveIdResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new OnDriveIdResponseCreator();
    DriveId mId;
    final int mVersionCode;

    OnDriveIdResponse(int i, DriveId driveid)
    {
        mVersionCode = i;
        mId = driveid;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        OnDriveIdResponseCreator.writeToParcel(this, parcel, i);
    }

}
