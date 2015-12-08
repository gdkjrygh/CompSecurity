// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.t;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.maps.model:
//            n, LatLng, StreetViewPanoramaLink

public class StreetViewPanoramaLocation
    implements SafeParcelable
{

    public static final n CREATOR = new n();
    final int a;
    public final StreetViewPanoramaLink b[];
    public final LatLng c;
    public final String d;

    StreetViewPanoramaLocation(int i, StreetViewPanoramaLink astreetviewpanoramalink[], LatLng latlng, String s)
    {
        a = i;
        b = astreetviewpanoramalink;
        c = latlng;
        d = s;
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
            if (!d.equals(((StreetViewPanoramaLocation) (obj)).d) || !c.equals(((StreetViewPanoramaLocation) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            c, d
        });
    }

    public String toString()
    {
        return t.a(this).a("panoId", d).a("position", c.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        n.a(this, parcel, i);
    }

}
