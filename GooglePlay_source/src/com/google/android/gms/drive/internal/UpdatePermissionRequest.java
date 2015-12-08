// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            UpdatePermissionRequestCreator

public class UpdatePermissionRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new UpdatePermissionRequestCreator();
    final String mAccountIdentifier;
    final DriveId mDriveId;
    final int mNewRole;
    final boolean mSendEventOnCompletion;
    final String mTrackingTag;
    final int mVersionCode;

    UpdatePermissionRequest(int i, DriveId driveid, String s, int j, boolean flag, String s1)
    {
        mVersionCode = i;
        mDriveId = driveid;
        mAccountIdentifier = s;
        mNewRole = j;
        mSendEventOnCompletion = flag;
        mTrackingTag = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        UpdatePermissionRequestCreator.writeToParcel(this, parcel, i);
    }

}
