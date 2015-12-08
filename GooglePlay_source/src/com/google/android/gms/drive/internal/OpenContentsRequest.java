// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OpenContentsRequestCreator

public class OpenContentsRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new OpenContentsRequestCreator();
    final int mBaseRequestId;
    final DriveId mId;
    final int mMode;
    final int mVersionCode;

    OpenContentsRequest(int i, DriveId driveid, int j, int k)
    {
        mVersionCode = i;
        mId = driveid;
        mMode = j;
        mBaseRequestId = k;
    }

    public OpenContentsRequest(DriveId driveid, int i)
    {
        this(1, driveid, i, 0);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        OpenContentsRequestCreator.writeToParcel(this, parcel, i);
    }

}
