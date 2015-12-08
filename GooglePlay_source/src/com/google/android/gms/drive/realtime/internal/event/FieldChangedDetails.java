// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            FieldChangedDetailsCreator

public class FieldChangedDetails
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new FieldChangedDetailsCreator();
    final int mKeyIndex;
    final int mVersionCode;

    FieldChangedDetails(int i, int j)
    {
        mVersionCode = i;
        mKeyIndex = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        FieldChangedDetailsCreator.writeToParcel$28de773c(this, parcel);
    }

}
