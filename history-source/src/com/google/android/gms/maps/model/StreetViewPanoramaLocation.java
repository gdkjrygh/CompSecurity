// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.maps.model:
//            s, LatLng, StreetViewPanoramaLink

public class StreetViewPanoramaLocation
    implements SafeParcelable
{

    public static final s CREATOR = new s();
    private final int CK;
    public final StreetViewPanoramaLink links[];
    public final String panoId;
    public final LatLng position;

    StreetViewPanoramaLocation(int i, StreetViewPanoramaLink astreetviewpanoramalink[], LatLng latlng, String s1)
    {
        CK = i;
        links = astreetviewpanoramalink;
        position = latlng;
        panoId = s1;
    }

    public StreetViewPanoramaLocation(StreetViewPanoramaLink astreetviewpanoramalink[], LatLng latlng, String s1)
    {
        this(1, astreetviewpanoramalink, latlng, s1);
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

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            position, panoId
        });
    }

    public String toString()
    {
        return jv.h(this).a("panoId", panoId).a("position", position.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        s.a(this, parcel, i);
    }

}
