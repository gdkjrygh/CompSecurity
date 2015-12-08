// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            AuthorizeAccessRequestCreator

public class AuthorizeAccessRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new AuthorizeAccessRequestCreator();
    final DriveId mDriveId;
    final long mProjectNumber;
    final int mVersionCode;

    AuthorizeAccessRequest(int i, long l, DriveId driveid)
    {
        mVersionCode = i;
        mProjectNumber = l;
        mDriveId = driveid;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AuthorizeAccessRequestCreator.writeToParcel(this, parcel, i);
    }

}
