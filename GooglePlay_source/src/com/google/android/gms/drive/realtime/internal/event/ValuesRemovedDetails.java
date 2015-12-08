// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ValuesRemovedDetailsCreator

public class ValuesRemovedDetails
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ValuesRemovedDetailsCreator();
    final int mIndex;
    final String mMovedToId;
    final int mMovedToIndex;
    final int mValueCount;
    final int mValueIndex;
    final int mVersionCode;

    ValuesRemovedDetails(int i, int j, int k, int l, String s, int i1)
    {
        mVersionCode = i;
        mIndex = j;
        mValueIndex = k;
        mValueCount = l;
        mMovedToId = s;
        mMovedToIndex = i1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ValuesRemovedDetailsCreator.writeToParcel$14651594(this, parcel);
    }

}
