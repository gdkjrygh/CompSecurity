// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

// Referenced classes of package com.google.android.gms.maps:
//            b

public final class StreetViewPanoramaOptions
    implements SafeParcelable
{

    public static final b CREATOR = new b();
    final int a;
    StreetViewPanoramaCamera b;
    String c;
    LatLng d;
    Integer e;
    Boolean f;
    Boolean g;
    Boolean h;
    Boolean i;
    Boolean j;

    public StreetViewPanoramaOptions()
    {
        f = Boolean.valueOf(true);
        g = Boolean.valueOf(true);
        h = Boolean.valueOf(true);
        i = Boolean.valueOf(true);
        a = 1;
    }

    StreetViewPanoramaOptions(int k, StreetViewPanoramaCamera streetviewpanoramacamera, String s, LatLng latlng, Integer integer, byte byte0, byte byte1, 
            byte byte2, byte byte3, byte byte4)
    {
        f = Boolean.valueOf(true);
        g = Boolean.valueOf(true);
        h = Boolean.valueOf(true);
        i = Boolean.valueOf(true);
        a = k;
        b = streetviewpanoramacamera;
        d = latlng;
        e = integer;
        c = s;
        f = com.google.android.gms.maps.a.a.a(byte0);
        g = com.google.android.gms.maps.a.a.a(byte1);
        h = com.google.android.gms.maps.a.a.a(byte2);
        i = com.google.android.gms.maps.a.a.a(byte3);
        j = com.google.android.gms.maps.a.a.a(byte4);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int k)
    {
        com.google.android.gms.maps.b.a(this, parcel, k);
    }

}
