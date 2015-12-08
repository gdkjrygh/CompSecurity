// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CreateFileIntentSenderRequestCreator

public class CreateFileIntentSenderRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new CreateFileIntentSenderRequestCreator();
    final Integer mFileType;
    final MetadataBundle mMetadata;
    final int mRequestId;
    final DriveId mStartFolder;
    final String mTitle;
    final int mVersionCode;

    CreateFileIntentSenderRequest(int i, MetadataBundle metadatabundle, int j, String s, DriveId driveid, Integer integer)
    {
        mVersionCode = i;
        mMetadata = metadatabundle;
        mRequestId = j;
        mTitle = s;
        mStartFolder = driveid;
        mFileType = integer;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        CreateFileIntentSenderRequestCreator.writeToParcel(this, parcel, i);
    }

}
