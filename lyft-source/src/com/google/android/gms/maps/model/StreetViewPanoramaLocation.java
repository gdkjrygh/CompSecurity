// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzk, LatLng, StreetViewPanoramaLink

public class StreetViewPanoramaLocation
    implements SafeParcelable
{

    public static final zzk CREATOR = new zzk();
    public final StreetViewPanoramaLink a[];
    public final LatLng b;
    public final String c;
    private final int d;

    StreetViewPanoramaLocation(int i, StreetViewPanoramaLink astreetviewpanoramalink[], LatLng latlng, String s)
    {
        d = i;
        a = astreetviewpanoramalink;
        b = latlng;
        c = s;
    }

    int a()
    {
        return d;
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
            if (!c.equals(((StreetViewPanoramaLocation) (obj)).c) || !b.equals(((StreetViewPanoramaLocation) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzt.a(new Object[] {
            b, c
        });
    }

    public String toString()
    {
        return zzt.a(this).a("panoId", c).a("position", b.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.a(this, parcel, i);
    }

}
