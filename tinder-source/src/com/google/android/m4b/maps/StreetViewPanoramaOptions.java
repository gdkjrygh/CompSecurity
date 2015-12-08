// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps;

import android.os.Parcel;
import com.google.android.m4b.maps.df.a;
import com.google.android.m4b.maps.k.c;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.StreetViewPanoramaCamera;

// Referenced classes of package com.google.android.m4b.maps:
//            i

public final class StreetViewPanoramaOptions
    implements c
{

    public static final i CREATOR = new i();
    final int a;
    public StreetViewPanoramaCamera b;
    public String c;
    public LatLng d;
    public Integer e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public Boolean i;
    public Boolean j;

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
        f = com.google.android.m4b.maps.df.a.a(byte0);
        g = com.google.android.m4b.maps.df.a.a(byte1);
        h = com.google.android.m4b.maps.df.a.a(byte2);
        i = com.google.android.m4b.maps.df.a.a(byte3);
        j = com.google.android.m4b.maps.df.a.a(byte4);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int k)
    {
        com.google.android.m4b.maps.i.a(this, parcel, k);
    }

}
