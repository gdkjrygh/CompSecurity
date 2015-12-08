// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CloseContentsAndUpdateMetadataRequestCreator

public class CloseContentsAndUpdateMetadataRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new CloseContentsAndUpdateMetadataRequestCreator();
    final int mCommitStrategy;
    final Contents mContentsReference;
    final int mContentsRequestId;
    final DriveId mId;
    final boolean mIsContentsValidForConflictDetection;
    final MetadataBundle mMetadataChangeSet;
    final boolean mNotifyOnCompletion;
    final String mTrackingTag;
    final int mVersionCode;

    CloseContentsAndUpdateMetadataRequest(int i, DriveId driveid, MetadataBundle metadatabundle, Contents contents, boolean flag, String s, int j, 
            int k, boolean flag1)
    {
        mVersionCode = i;
        mId = driveid;
        mMetadataChangeSet = metadatabundle;
        mContentsReference = contents;
        mNotifyOnCompletion = flag;
        mTrackingTag = s;
        mCommitStrategy = j;
        mContentsRequestId = k;
        mIsContentsValidForConflictDetection = flag1;
    }

    public CloseContentsAndUpdateMetadataRequest(DriveId driveid, MetadataBundle metadatabundle, int i, boolean flag, ExecutionOptions executionoptions)
    {
        this(1, driveid, metadatabundle, null, executionoptions.mNotifyOnCompletion, executionoptions.mTrackingTag, executionoptions.mConflictStrategy, i, flag);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        CloseContentsAndUpdateMetadataRequestCreator.writeToParcel(this, parcel, i);
    }

}
