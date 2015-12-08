// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            GetDriveIdFromUniqueIdentifierRequestCreator

public class GetDriveIdFromUniqueIdentifierRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new GetDriveIdFromUniqueIdentifierRequestCreator();
    final boolean mIsInAppFolder;
    final String mUniqueIdentifier;
    final int mVersionCode;

    GetDriveIdFromUniqueIdentifierRequest(int i, String s, boolean flag)
    {
        mVersionCode = i;
        mUniqueIdentifier = s;
        mIsInAppFolder = flag;
    }

    public GetDriveIdFromUniqueIdentifierRequest(String s, boolean flag)
    {
        this(1, s, flag);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GetDriveIdFromUniqueIdentifierRequestCreator.writeToParcel$52f68197(this, parcel);
    }

}
