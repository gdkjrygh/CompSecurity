// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            ai

public class OnDriveIdResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ai();
    DriveId Iu;
    final int xM;

    OnDriveIdResponse(int i, DriveId driveid)
    {
        xM = i;
        Iu = driveid;
    }

    public int describeContents()
    {
        return 0;
    }

    public DriveId getDriveId()
    {
        return Iu;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ai.a(this, parcel, i);
    }

}
