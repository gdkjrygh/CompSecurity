// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kl;

// Referenced classes of package com.google.android.gms.maps.model:
//            s, LatLng, StreetViewPanoramaLink

public class StreetViewPanoramaLocation
    implements SafeParcelable
{

    public static final s CREATOR = new s();
    public final StreetViewPanoramaLink links[];
    private final int mVersionCode;
    public final String panoId;
    public final LatLng position;

    StreetViewPanoramaLocation(int i, StreetViewPanoramaLink astreetviewpanoramalink[], LatLng latlng, String s1)
    {
        mVersionCode = i;
        links = astreetviewpanoramalink;
        position = latlng;
        panoId = s1;
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

    final int getVersionCode()
    {
        return mVersionCode;
    }

    public int hashCode()
    {
        return kl.hashCode(new Object[] {
            position, panoId
        });
    }

    public String toString()
    {
        return kl.j(this).a("panoId", panoId).a("position", position.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        s.a(this, parcel, i);
    }

}
