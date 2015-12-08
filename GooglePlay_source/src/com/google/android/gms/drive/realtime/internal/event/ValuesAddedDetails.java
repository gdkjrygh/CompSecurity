// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ValuesAddedDetailsCreator

public class ValuesAddedDetails
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ValuesAddedDetailsCreator();
    final int mIndex;
    final String mMovedFromId;
    final int mMovedFromIndex;
    final int mValueCount;
    final int mValueIndex;
    final int mVersionCode;

    ValuesAddedDetails(int i, int j, int k, int l, String s, int i1)
    {
        mVersionCode = i;
        mIndex = j;
        mValueIndex = k;
        mValueCount = l;
        mMovedFromId = s;
        mMovedFromIndex = i1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ValuesAddedDetailsCreator.writeToParcel$586ed70c(this, parcel);
    }

}
