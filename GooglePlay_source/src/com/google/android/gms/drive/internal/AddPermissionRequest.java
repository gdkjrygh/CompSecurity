// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Permission;

// Referenced classes of package com.google.android.gms.drive.internal:
//            AddPermissionRequestCreator

public class AddPermissionRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new AddPermissionRequestCreator();
    final DriveId mDriveId;
    final String mEmailMessage;
    final Permission mPermission;
    final boolean mSendEventOnCompletion;
    final boolean mSendNotificationEmail;
    final String mTrackingTag;
    final int mVersionCode;

    AddPermissionRequest(int i, DriveId driveid, Permission permission, boolean flag, String s, boolean flag1, String s1)
    {
        mVersionCode = i;
        mDriveId = driveid;
        mPermission = permission;
        mSendNotificationEmail = flag;
        mEmailMessage = s;
        mSendEventOnCompletion = flag1;
        mTrackingTag = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AddPermissionRequestCreator.writeToParcel(this, parcel, i);
    }

}
