// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CreateFolderRequestCreator

public class CreateFolderRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new CreateFolderRequestCreator();
    final MetadataBundle mMetadata;
    final DriveId mParentDriveId;
    final int mVersionCode;

    CreateFolderRequest(int i, DriveId driveid, MetadataBundle metadatabundle)
    {
        mVersionCode = i;
        mParentDriveId = (DriveId)Preconditions.checkNotNull(driveid);
        mMetadata = (MetadataBundle)Preconditions.checkNotNull(metadatabundle);
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
        CreateFolderRequestCreator.writeToParcel(this, parcel, i);
    }

}
