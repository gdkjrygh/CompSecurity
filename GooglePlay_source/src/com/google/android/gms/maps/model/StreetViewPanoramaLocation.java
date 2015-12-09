// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaLocationCreator, LatLng, StreetViewPanoramaLink

public class StreetViewPanoramaLocation
    implements SafeParcelable
{

    public static final StreetViewPanoramaLocationCreator CREATOR = new StreetViewPanoramaLocationCreator();
    public final StreetViewPanoramaLink links[];
    final int mVersionCode;
    public final String panoId;
    public final LatLng position;

    StreetViewPanoramaLocation(int i, StreetViewPanoramaLink astreetviewpanoramalink[], LatLng latlng, String s)
    {
        mVersionCode = i;
        links = astreetviewpanoramalink;
        position = latlng;
        panoId = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof StreetViewPanoramaLocation))
            {
                return false;
            }
            obj = (StreetViewPanoramaLocation)obj;
            if (!panoId.equals(((StreetViewPanoramaLocation) (obj)).panoId) || !position.equals(((StreetViewPanoramaLocation) (obj)).position))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            position, panoId
        });
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("panoId", panoId).add("position", position.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        StreetViewPanoramaLocationCreator.writeToParcel(this, parcel, i);
    }

}
