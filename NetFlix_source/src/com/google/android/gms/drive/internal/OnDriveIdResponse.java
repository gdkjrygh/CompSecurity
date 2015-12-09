// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            ab

public class OnDriveIdResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ab();
    DriveId EV;
    final int xH;

    OnDriveIdResponse(int i, DriveId driveid)
    {
        xH = i;
        EV = driveid;
    }

    public int describeContents()
    {
        return 0;
    }

    public DriveId getDriveId()
    {
        return EV;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ab.a(this, parcel, i);
    }

}
