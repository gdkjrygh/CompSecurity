// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ValuesSetDetailsCreator

public class ValuesSetDetails
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ValuesSetDetailsCreator();
    final int mIndex;
    final int mValueCount;
    final int mValueIndex;
    final int mVersionCode;

    ValuesSetDetails(int i, int j, int k, int l)
    {
        mVersionCode = i;
        mIndex = j;
        mValueIndex = k;
        mValueCount = l;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ValuesSetDetailsCreator.writeToParcel$2cd816ee(this, parcel);
    }

}
