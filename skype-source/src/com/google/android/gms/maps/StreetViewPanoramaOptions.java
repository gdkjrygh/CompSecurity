// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.m;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

// Referenced classes of package com.google.android.gms.maps:
//            j

public final class StreetViewPanoramaOptions
    implements SafeParcelable
{

    public static final j CREATOR = new j();
    private final int a;
    private StreetViewPanoramaCamera b;
    private String c;
    private LatLng d;
    private Integer e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;

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
        f = m.a(byte0);
        g = m.a(byte1);
        h = m.a(byte2);
        i = m.a(byte3);
        j = m.a(byte4);
    }

    final int a()
    {
        return a;
    }

    final byte b()
    {
        return m.a(f);
    }

    final byte c()
    {
        return m.a(g);
    }

    final byte d()
    {
        return m.a(h);
    }

    public final int describeContents()
    {
        return 0;
    }

    final byte e()
    {
        return m.a(i);
    }

    final byte f()
    {
        return m.a(j);
    }

    public final StreetViewPanoramaCamera g()
    {
        return b;
    }

    public final LatLng h()
    {
        return d;
    }

    public final Integer i()
    {
        return e;
    }

    public final String j()
    {
        return c;
    }

    public final void writeToParcel(Parcel parcel, int k)
    {
        com.google.android.gms.maps.j.a(this, parcel, k);
    }

}
