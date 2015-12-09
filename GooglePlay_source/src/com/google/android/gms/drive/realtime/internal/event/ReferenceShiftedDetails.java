// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ReferenceShiftedDetailsCreator

public class ReferenceShiftedDetails
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ReferenceShiftedDetailsCreator();
    final int mNewIndex;
    final String mNewObjectId;
    final int mOldIndex;
    final String mOldObjectId;
    final int mVersionCode;

    ReferenceShiftedDetails(int i, String s, String s1, int j, int k)
    {
        mVersionCode = i;
        mOldObjectId = s;
        mNewObjectId = s1;
        mOldIndex = j;
        mNewIndex = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ReferenceShiftedDetailsCreator.writeToParcel$3006c340(this, parcel);
    }

}
