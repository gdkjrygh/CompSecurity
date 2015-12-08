// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            PartialDriveIdCreator

public class PartialDriveId
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new PartialDriveIdCreator();
    final String mResourceId;
    final int mResourceType;
    final long mSqlId;
    final int mVersionCode;

    PartialDriveId(int i, String s, long l, int j)
    {
        mVersionCode = i;
        mResourceId = s;
        mSqlId = l;
        mResourceType = j;
    }

    public PartialDriveId(String s, long l)
    {
        this(1, s, l, 1);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PartialDriveIdCreator.writeToParcel$5a64729d(this, parcel);
    }

}
