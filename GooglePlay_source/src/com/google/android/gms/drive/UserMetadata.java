// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive:
//            UserMetadataCreator

public class UserMetadata
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new UserMetadataCreator();
    final String mDisplayName;
    final String mEmailAddress;
    final boolean mIsAuthenticatedUser;
    final String mPermissionId;
    final String mPictureUrl;
    final int mVersionCode;

    UserMetadata(int i, String s, String s1, String s2, boolean flag, String s3)
    {
        mVersionCode = i;
        mPermissionId = s;
        mDisplayName = s1;
        mPictureUrl = s2;
        mIsAuthenticatedUser = flag;
        mEmailAddress = s3;
    }

    public UserMetadata(String s, String s1, String s2, boolean flag, String s3)
    {
        this(1, s, s1, s2, flag, s3);
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return String.format("Permission ID: '%s', Display Name: '%s', Picture URL: '%s', Authenticated User: %b, Email: '%s'", new Object[] {
            mPermissionId, mDisplayName, mPictureUrl, Boolean.valueOf(mIsAuthenticatedUser), mEmailAddress
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        UserMetadataCreator.writeToParcel$59960347(this, parcel);
    }

}
