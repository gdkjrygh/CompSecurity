// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CreateFileRequestCreator

public class CreateFileRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new CreateFileRequestCreator();
    final Contents mContentsReference;
    final int mCreateStrategy;
    final Integer mFileType;
    final MetadataBundle mMetadata;
    final int mOpenContentsRequestId;
    final DriveId mParentDriveId;
    final boolean mSendEventOnCompletion;
    final String mTrackingTag;
    final int mVersionCode;

    CreateFileRequest(int i, DriveId driveid, MetadataBundle metadatabundle, Contents contents, Integer integer, boolean flag, String s, 
            int j, int k)
    {
        if (contents != null && k != 0)
        {
            boolean flag1;
            if (contents.mRequestId == k)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkArgument(flag1, "inconsistent contents reference");
        }
        if ((integer == null || integer.intValue() == 0) && contents == null && k == 0)
        {
            throw new IllegalArgumentException("Need a valid contents");
        } else
        {
            mVersionCode = i;
            mParentDriveId = (DriveId)Preconditions.checkNotNull(driveid);
            mMetadata = (MetadataBundle)Preconditions.checkNotNull(metadatabundle);
            mContentsReference = contents;
            mFileType = integer;
            mTrackingTag = s;
            mCreateStrategy = j;
            mSendEventOnCompletion = flag;
            mOpenContentsRequestId = k;
            return;
        }
    }

    public CreateFileRequest(DriveId driveid, MetadataBundle metadatabundle, int i, int j, ExecutionOptions executionoptions)
    {
        this(2, driveid, metadatabundle, null, Integer.valueOf(j), executionoptions.mNotifyOnCompletion, executionoptions.mTrackingTag, executionoptions.mConflictStrategy, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        CreateFileRequestCreator.writeToParcel(this, parcel, i);
    }

}
