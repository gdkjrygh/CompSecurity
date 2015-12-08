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
    private final int CK;
    private Boolean akG;
    private Boolean akM;
    private StreetViewPanoramaCamera alr;
    private String als;
    private LatLng alt;
    private Integer alu;
    private Boolean alv;
    private Boolean alw;
    private Boolean alx;

    public StreetViewPanoramaOptions()
    {
        alv = Boolean.valueOf(true);
        akM = Boolean.valueOf(true);
        alw = Boolean.valueOf(true);
        alx = Boolean.valueOf(true);
        CK = 1;
    }

    StreetViewPanoramaOptions(int i, StreetViewPanoramaCamera streetviewpanoramacamera, String s, LatLng latlng, Integer integer, byte byte0, byte byte1, 
            byte byte2, byte byte3, byte byte4)
    {
        alv = Boolean.valueOf(true);
        akM = Boolean.valueOf(true);
        alw = Boolean.valueOf(true);
        alx = Boolean.valueOf(true);
        CK = i;
        alr = streetviewpanoramacamera;
        alt = latlng;
        alu = integer;
        als = s;
        alv = a.a(byte0);
        akM = a.a(byte1);
        alw = a.a(byte2);
        alx = a.a(byte3);
        akG = a.a(byte4);
    }

    public int describeContents()
    {
        return 0;
    }

    public Boolean getPanningGesturesEnabled()
    {
        return alw;
    }

    public String getPanoramaId()
    {
        return als;
    }

    public LatLng getPosition()
    {
        return alt;
    }

    public Integer getRadius()
    {
        return alu;
    }

    public Boolean getStreetNamesEnabled()
    {
        return alx;
    }

    public StreetViewPanoramaCamera getStreetViewPanoramaCamera()
    {
        return alr;
    }

    public Boolean getUseViewLifecycleInFragment()
    {
        return akG;
    }

    public Boolean getUserNavigationEnabled()
    {
        return alv;
    }

    int getVersionCode()
    {
        return CK;
    }

    public Boolean getZoomGesturesEnabled()
    {
        return akM;
    }

    byte nE()
    {
        return a.c(akG);
    }

    byte nI()
    {
        return a.c(akM);
    }

    byte nS()
    {
        return a.c(alv);
    }

    byte nT()
    {
        return a.c(alw);
    }

    byte nU()
    {
        return a.c(alx);
    }

    public StreetViewPanoramaOptions panningGesturesEnabled(boolean flag)
    {
        alw = Boolean.valueOf(flag);
        return this;
    }

    public StreetViewPanoramaOptions panoramaCamera(StreetViewPanoramaCamera streetviewpanoramacamera)
    {
        alr = streetviewpanoramacamera;
        return this;
    }

    public StreetViewPanoramaOptions panoramaId(String s)
    {
        als = s;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latlng)
    {
        alt = latlng;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latlng, Integer integer)
    {
        alt = latlng;
        alu = integer;
        return this;
    }

    public StreetViewPanoramaOptions streetNamesEnabled(boolean flag)
    {
        alx = Boolean.valueOf(flag);
        return this;
    }

    public StreetViewPanoramaOptions useViewLifecycleInFragment(boolean flag)
    {
        akG = Boolean.valueOf(flag);
        return this;
    }

    public StreetViewPanoramaOptions userNavigationEnabled(boolean flag)
    {
        alv = Boolean.valueOf(flag);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.maps.c.a(this, parcel, i);
    }

    public StreetViewPanoramaOptions zoomGesturesEnabled(boolean flag)
    {
        akM = Boolean.valueOf(flag);
        return this;
    }

}
