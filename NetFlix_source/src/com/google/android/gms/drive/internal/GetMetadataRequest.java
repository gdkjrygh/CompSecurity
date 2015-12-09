// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            t

public class GetMetadataRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new t();
    final DriveId EV;
    final int xH;

    GetMetadataRequest(int i, DriveId driveid)
    {
        xH = i;
        EV = driveid;
    }

    public GetMetadataRequest(DriveId driveid)
    {
        this(1, driveid);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        t.a(this, parcel, i);
    }

}
