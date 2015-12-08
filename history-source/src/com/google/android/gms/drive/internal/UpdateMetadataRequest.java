// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            bi

public class UpdateMetadataRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bi();
    final int CK;
    final DriveId Pp;
    final MetadataBundle Pq;

    UpdateMetadataRequest(int i, DriveId driveid, MetadataBundle metadatabundle)
    {
        CK = i;
        Pp = driveid;
        Pq = metadatabundle;
    }

    public UpdateMetadataRequest(DriveId driveid, MetadataBundle metadatabundle)
    {
        this(1, driveid, metadatabundle);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        bi.a(this, parcel, i);
    }

}
