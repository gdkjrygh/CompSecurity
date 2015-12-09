// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.m;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

// Referenced classes of package com.google.android.gms.maps:
//            o

public final class StreetViewPanoramaOptions
    implements SafeParcelable
{

    public static final o CREATOR = new o();
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

    StreetViewPanoramaOptions(int i1, StreetViewPanoramaCamera streetviewpanoramacamera, String s, LatLng latlng, Integer integer, byte byte0, byte byte1, 
            byte byte2, byte byte3, byte byte4)
    {
        f = Boolean.valueOf(true);
        g = Boolean.valueOf(true);
        h = Boolean.valueOf(true);
        i = Boolean.valueOf(true);
        a = i1;
        b = streetviewpanoramacamera;
        d = latlng;
        e = integer;
        c = s;
        f = com.google.android.gms.maps.internal.m.a(byte0);
        g = com.google.android.gms.maps.internal.m.a(byte1);
        h = com.google.android.gms.maps.internal.m.a(byte2);
        i = com.google.android.gms.maps.internal.m.a(byte3);
        j = com.google.android.gms.maps.internal.m.a(byte4);
    }

    int a()
    {
        return a;
    }

    public StreetViewPanoramaOptions a(LatLng latlng)
    {
        d = latlng;
        return this;
    }

    public StreetViewPanoramaOptions a(LatLng latlng, Integer integer)
    {
        d = latlng;
        e = integer;
        return this;
    }

    public StreetViewPanoramaOptions a(StreetViewPanoramaCamera streetviewpanoramacamera)
    {
        b = streetviewpanoramacamera;
        return this;
    }

    public StreetViewPanoramaOptions a(String s)
    {
        c = s;
        return this;
    }

    public StreetViewPanoramaOptions a(boolean flag)
    {
        f = Boolean.valueOf(flag);
        return this;
    }

    byte b()
    {
        return com.google.android.gms.maps.internal.m.a(f);
    }

    public StreetViewPanoramaOptions b(boolean flag)
    {
        g = Boolean.valueOf(flag);
        return this;
    }

    byte c()
    {
        return com.google.android.gms.maps.internal.m.a(g);
    }

    public StreetViewPanoramaOptions c(boolean flag)
    {
        h = Boolean.valueOf(flag);
        return this;
    }

    byte d()
    {
        return com.google.android.gms.maps.internal.m.a(h);
    }

    public StreetViewPanoramaOptions d(boolean flag)
    {
        i = Boolean.valueOf(flag);
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    byte e()
    {
        return com.google.android.gms.maps.internal.m.a(i);
    }

    public StreetViewPanoramaOptions e(boolean flag)
    {
        j = Boolean.valueOf(flag);
        return this;
    }

    byte f()
    {
        return com.google.android.gms.maps.internal.m.a(j);
    }

    public StreetViewPanoramaCamera g()
    {
        return b;
    }

    public LatLng h()
    {
        return d;
    }

    public Integer i()
    {
        return e;
    }

    public String j()
    {
        return c;
    }

    public Boolean k()
    {
        return f;
    }

    public Boolean l()
    {
        return g;
    }

    public Boolean m()
    {
        return h;
    }

    public Boolean n()
    {
        return i;
    }

    public Boolean o()
    {
        return j;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.maps.o.a(this, parcel, i1);
    }

}
