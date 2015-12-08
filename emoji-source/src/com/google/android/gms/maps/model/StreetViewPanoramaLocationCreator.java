// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaLocation, StreetViewPanoramaLink, LatLng

public class StreetViewPanoramaLocationCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public StreetViewPanoramaLocationCreator()
    {
    }

    static void a(StreetViewPanoramaLocation streetviewpanoramalocation, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, streetviewpanoramalocation.getVersionCode());
        b.a(parcel, 2, streetviewpanoramalocation.links, i, false);
        b.a(parcel, 3, streetviewpanoramalocation.position, i, false);
        b.a(parcel, 4, streetviewpanoramalocation.panoId, false);
        b.G(parcel, j);
    }

    public StreetViewPanoramaLocation createFromParcel(Parcel parcel)
    {
        String s;
        StreetViewPanoramaLink astreetviewpanoramalink[];
        Object obj;
        int i;
        int j;
        s = null;
        j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        i = 0;
        obj = null;
        astreetviewpanoramalink = null;
_L7:
        int k;
        if (parcel.dataPosition() >= j)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
        com.google.android.gms.common.internal.safeparcel.a.ar(k);
        JVM INSTR tableswitch 1 4: default 68
    //                   1 97
    //                   2 118
    //                   3 142
    //                   4 165;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_165;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
        Object obj1 = obj;
        obj = astreetviewpanoramalink;
        astreetviewpanoramalink = ((StreetViewPanoramaLink []) (obj1));
_L8:
        Object obj2 = obj;
        obj = astreetviewpanoramalink;
        astreetviewpanoramalink = ((StreetViewPanoramaLink []) (obj2));
        if (true) goto _L7; else goto _L6
_L6:
        i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
        StreetViewPanoramaLink astreetviewpanoramalink1[] = astreetviewpanoramalink;
        astreetviewpanoramalink = ((StreetViewPanoramaLink []) (obj));
        obj = astreetviewpanoramalink1;
          goto _L8
_L3:
        StreetViewPanoramaLink astreetviewpanoramalink2[] = (StreetViewPanoramaLink[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, StreetViewPanoramaLink.CREATOR);
        astreetviewpanoramalink = ((StreetViewPanoramaLink []) (obj));
        obj = astreetviewpanoramalink2;
          goto _L8
_L4:
        LatLng latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LatLng.CREATOR);
        obj = astreetviewpanoramalink;
        astreetviewpanoramalink = latlng;
          goto _L8
        s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
        Object obj3 = astreetviewpanoramalink;
        astreetviewpanoramalink = ((StreetViewPanoramaLink []) (obj));
        obj = obj3;
          goto _L8
        if (parcel.dataPosition() != j)
        {
            throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
        } else
        {
            return new StreetViewPanoramaLocation(i, astreetviewpanoramalink, ((LatLng) (obj)), s);
        }
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public StreetViewPanoramaLocation[] newArray(int i)
    {
        return new StreetViewPanoramaLocation[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
