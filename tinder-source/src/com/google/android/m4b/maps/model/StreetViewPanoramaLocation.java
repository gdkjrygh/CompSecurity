// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.j.v;
import com.google.android.m4b.maps.k.c;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.model:
//            q, LatLng, StreetViewPanoramaLink

public class StreetViewPanoramaLocation
    implements c
{

    public static final q CREATOR = new q();
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

    public StreetViewPanoramaLocation(StreetViewPanoramaLink astreetviewpanoramalink[], LatLng latlng, String s)
    {
        this(1, astreetviewpanoramalink, latlng, s);
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
        return v.a(this).a("panoId", d).a("position", c.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        q.a(this, parcel, i);
    }

}
