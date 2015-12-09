// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.maps.model:
//            VisibleRegionCreator, LatLng, LatLngBounds

public final class VisibleRegion
    implements SafeParcelable
{

    public static final VisibleRegionCreator CREATOR = new VisibleRegionCreator();
    public final LatLng farLeft;
    public final LatLng farRight;
    public final LatLngBounds latLngBounds;
    final int mVersionCode;
    public final LatLng nearLeft;
    public final LatLng nearRight;

    VisibleRegion(int i, LatLng latlng, LatLng latlng1, LatLng latlng2, LatLng latlng3, LatLngBounds latlngbounds)
    {
        mVersionCode = i;
        nearLeft = latlng;
        nearRight = latlng1;
        farLeft = latlng2;
        farRight = latlng3;
        latLngBounds = latlngbounds;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof VisibleRegion))
            {
                return false;
            }
            obj = (VisibleRegion)obj;
            if (!nearLeft.equals(((VisibleRegion) (obj)).nearLeft) || !nearRight.equals(((VisibleRegion) (obj)).nearRight) || !farLeft.equals(((VisibleRegion) (obj)).farLeft) || !farRight.equals(((VisibleRegion) (obj)).farRight) || !latLngBounds.equals(((VisibleRegion) (obj)).latLngBounds))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            nearLeft, nearRight, farLeft, farRight, latLngBounds
        });
    }

    public final String toString()
    {
        return Objects.toStringHelper(this).add("nearLeft", nearLeft).add("nearRight", nearRight).add("farLeft", farLeft).add("farRight", farRight).add("latLngBounds", latLngBounds).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        VisibleRegionCreator.writeToParcel(this, parcel, i);
    }

}
