// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            LocationSettingsRequestCreator

public final class LocationSettingsRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new LocationSettingsRequestCreator();
    final boolean mAlwaysShow;
    final List mLocationRequests;
    final boolean mNeedBle;
    final int mVersionCode;

    LocationSettingsRequest(int i, List list, boolean flag, boolean flag1)
    {
        mVersionCode = i;
        mLocationRequests = list;
        mAlwaysShow = flag;
        mNeedBle = flag1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        LocationSettingsRequestCreator.writeToParcel$3b05d9e5(this, parcel);
    }

}
