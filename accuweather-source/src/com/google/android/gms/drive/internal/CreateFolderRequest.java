// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.hn;

// Referenced classes of package com.google.android.gms.drive.internal:
//            k

public class CreateFolderRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new k();
    final MetadataBundle IA;
    final DriveId IC;
    final int xJ;

    CreateFolderRequest(int i, DriveId driveid, MetadataBundle metadatabundle)
    {
        xJ = i;
        IC = (DriveId)hn.f(driveid);
        IA = (MetadataBundle)hn.f(metadatabundle);
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
