// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

// Referenced classes of package com.google.android.gms.maps:
//            c

public final class StreetViewPanoramaOptions
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    private Boolean ayM;
    private Boolean ayS;
    private Integer azA;
    private Boolean azB;
    private Boolean azC;
    private Boolean azD;
    private StreetViewPanoramaCamera azx;
    private String azy;
    private LatLng azz;
    private final int mVersionCode;

    public StreetViewPanoramaOptions()
    {
        azB = Boolean.valueOf(true);
        ayS = Boolean.valueOf(true);
        azC = Boolean.valueOf(true);
        azD = Boolean.valueOf(true);
        mVersionCode = 1;
    }

    StreetViewPanoramaOptions(int i, StreetViewPanoramaCamera streetviewpanoramacamera, String s, LatLng latlng, Integer integer, byte byte0, byte byte1, 
            byte byte2, byte byte3, byte byte4)
    {
        azB = Boolean.valueOf(true);
        ayS = Boolean.valueOf(true);
        azC = Boolean.valueOf(true);
        azD = Boolean.valueOf(true);
        mVersionCode = i;
        azx = streetviewpanoramacamera;
        azz = latlng;
        azA = integer;
        azy = s;
        azB = a.a(byte0);
        ayS = a.a(byte1);
        azC = a.a(byte2);
        azD = a.a(byte3);
        ayM = a.a(byte4);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String getPanoramaId()
    {
        return azy;
    }

    public final LatLng getPosition()
    {
        return azz;
    }

    public final Integer getRadius()
    {
        return azA;
    }

    public final StreetViewPanoramaCamera getStreetViewPanoramaCamera()
    {
        return azx;
    }

    final int getVersionCode()
    {
        return mVersionCode;
    }

    final byte pS()
    {
        return a.c(ayM);
    }

    final byte pW()
    {
        return a.c(ayS);
    }

    final byte qg()
    {
        return a.c(azB);
    }

    final byte qh()
    {
        return a.c(azC);
    }

    final byte qi()
    {
        return a.c(azD);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.maps.c.a(this, parcel, i);
    }

}
