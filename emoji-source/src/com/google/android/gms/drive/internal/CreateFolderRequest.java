// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.hm;

// Referenced classes of package com.google.android.gms.drive.internal:
//            k

public class CreateFolderRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new k();
    final MetadataBundle IE;
    final DriveId IG;
    final int xM;

    CreateFolderRequest(int i, DriveId driveid, MetadataBundle metadatabundle)
    {
        xM = i;
        IG = (DriveId)hm.f(driveid);
        IE = (MetadataBundle)hm.f(metadatabundle);
    }

    public CreateFolderRequest(DriveId driveid, MetadataBundle metadatabundle)
    {
        this(1, driveid, metadatabundle);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel, i);
    }

}
