// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            ParcelableIndexReferenceCreator

public class ParcelableIndexReference
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ParcelableIndexReferenceCreator();
    final int mDeleteMode;
    final int mIndex;
    final boolean mLegacyCanBeDeleted;
    final String mObjectId;
    final int mVersionCode;

    ParcelableIndexReference(int i, String s, int j, boolean flag, int k)
    {
        mVersionCode = i;
        mObjectId = s;
        mIndex = j;
        mLegacyCanBeDeleted = flag;
        mDeleteMode = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ParcelableIndexReferenceCreator.writeToParcel$e4d1b7(this, parcel);
    }

}
