// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            LocationResultCreator

public final class LocationResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new LocationResultCreator();
    static final List DEFAULT_LOCATIONS = Collections.emptyList();
    final List mLocations;
    final int mVersionCode;

    LocationResult(int i, List list)
    {
        mVersionCode = i;
        mLocations = list;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof LocationResult)
        {
            if (((LocationResult) (obj = (LocationResult)obj)).mLocations.size() == mLocations.size())
            {
                obj = ((LocationResult) (obj)).mLocations.iterator();
                Iterator iterator = mLocations.iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    Location location = (Location)iterator.next();
                    Location location1 = (Location)((Iterator) (obj)).next();
                    if (location.getTime() != location1.getTime())
                    {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        int i = 17;
        for (Iterator iterator = mLocations.iterator(); iterator.hasNext();)
        {
            long l = ((Location)iterator.next()).getTime();
            i = i * 31 + (int)(l >>> 32 ^ l);
        }

        return i;
    }

    public final String toString()
    {
        return (new StringBuilder("LocationResult[locations: ")).append(mLocations).append("]").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        LocationResultCreator.writeToParcel$3d3ce068(this, parcel);
    }

}
