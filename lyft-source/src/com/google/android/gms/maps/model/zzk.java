// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaLocation, StreetViewPanoramaLink, LatLng

public class zzk
    implements android.os.Parcelable.Creator
{

    public zzk()
    {
    }

    static void a(StreetViewPanoramaLocation streetviewpanoramalocation, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, streetviewpanoramalocation.a());
        zzb.a(parcel, 2, streetviewpanoramalocation.a, i, false);
        zzb.a(parcel, 3, streetviewpanoramalocation.b, i, false);
        zzb.a(parcel, 4, streetviewpanoramalocation.c, false);
        zzb.a(parcel, j);
    }

    public StreetViewPanoramaLocation a(Parcel parcel)
    {
        String s;
        StreetViewPanoramaLink astreetviewpanoramalink[];
        Object obj;
        int i;
        int j;
        s = null;
        j = zza.b(parcel);
        i = 0;
        obj = null;
        astreetviewpanoramalink = null;
_L7:
        int k;
        if (parcel.dataPosition() >= j)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        k = zza.a(parcel);
        zza.a(k);
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
        zza.b(parcel, k);
        Object obj1 = obj;
        obj = astreetviewpanoramalink;
        astreetviewpanoramalink = ((StreetViewPanoramaLink []) (obj1));
_L8:
        Object obj2 = obj;
        obj = astreetviewpanoramalink;
        astreetviewpanoramalink = ((StreetViewPanoramaLink []) (obj2));
        if (true) goto _L7; else goto _L6
_L6:
        i = zza.f(parcel, k);
        StreetViewPanoramaLink astreetviewpanoramalink1[] = astreetviewpanoramalink;
        astreetviewpanoramalink = ((StreetViewPanoramaLink []) (obj));
        obj = astreetviewpanoramalink1;
          goto _L8
_L3:
        StreetViewPanoramaLink astreetviewpanoramalink2[] = (StreetViewPanoramaLink[])zza.b(parcel, k, StreetViewPanoramaLink.CREATOR);
        astreetviewpanoramalink = ((StreetViewPanoramaLink []) (obj));
        obj = astreetviewpanoramalink2;
          goto _L8
_L4:
        LatLng latlng = (LatLng)zza.a(parcel, k, LatLng.CREATOR);
        obj = astreetviewpanoramalink;
        astreetviewpanoramalink = latlng;
          goto _L8
        s = zza.m(parcel, k);
        Object obj3 = astreetviewpanoramalink;
        astreetviewpanoramalink = ((StreetViewPanoramaLink []) (obj));
        obj = obj3;
          goto _L8
        if (parcel.dataPosition() != j)
        {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
        } else
        {
            return new StreetViewPanoramaLocation(i, astreetviewpanoramalink, ((LatLng) (obj)), s);
        }
    }

    public StreetViewPanoramaLocation[] a(int i)
    {
        return new StreetViewPanoramaLocation[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
