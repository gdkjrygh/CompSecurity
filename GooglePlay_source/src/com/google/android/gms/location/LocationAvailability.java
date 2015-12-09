// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location:
//            LocationAvailabilityCreator

public final class LocationAvailability
    implements SafeParcelable
{

    public static final LocationAvailabilityCreator CREATOR = new LocationAvailabilityCreator();
    int mCellStatus;
    long mElapsedRealtimeNs;
    int mLocationStatus;
    final int mVersionCode;
    int mWifiStatus;

    LocationAvailability(int i, int j, int k, int l, long l1)
    {
        mVersionCode = i;
        mLocationStatus = j;
        mCellStatus = k;
        mWifiStatus = l;
        mElapsedRealtimeNs = l1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof LocationAvailability)
        {
            if (mLocationStatus == ((LocationAvailability) (obj = (LocationAvailability)obj)).mLocationStatus && mCellStatus == ((LocationAvailability) (obj)).mCellStatus && mWifiStatus == ((LocationAvailability) (obj)).mWifiStatus && mElapsedRealtimeNs == ((LocationAvailability) (obj)).mElapsedRealtimeNs)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(mLocationStatus), Integer.valueOf(mCellStatus), Integer.valueOf(mWifiStatus), Long.valueOf(mElapsedRealtimeNs)
        });
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("LocationAvailability[isLocationAvailable: ");
        boolean flag;
        if (mLocationStatus < 1000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return stringbuilder.append(flag).append("]").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        LocationAvailabilityCreator.writeToParcel$13ba70a6(this, parcel);
    }

}
