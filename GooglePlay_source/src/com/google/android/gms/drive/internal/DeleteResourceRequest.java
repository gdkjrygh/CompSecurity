// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            DeleteResourceRequestCreator

public class DeleteResourceRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new DeleteResourceRequestCreator();
    final DriveId mId;
    final int mVersionCode;

    DeleteResourceRequest(int i, DriveId driveid)
    {
        mVersionCode = i;
        mId = driveid;
    }

    public DeleteResourceRequest(DriveId driveid)
    {
        this(1, driveid);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        DeleteResourceRequestCreator.writeToParcel(this, parcel, i);
    }

}
