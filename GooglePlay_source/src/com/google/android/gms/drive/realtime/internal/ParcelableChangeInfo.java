// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            ParcelableChangeInfoCreator

public class ParcelableChangeInfo
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ParcelableChangeInfoCreator();
    final List mEvents;
    final long mTimestamp;
    final int mVersionCode;

    ParcelableChangeInfo(int i, long l, List list)
    {
        mVersionCode = i;
        mTimestamp = l;
        mEvents = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ParcelableChangeInfoCreator.writeToParcel$4478533c(this, parcel);
    }

}
