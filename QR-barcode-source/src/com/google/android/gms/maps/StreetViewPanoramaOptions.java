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
    private final int BR;
    private Boolean aiH;
    private Boolean aiN;
    private StreetViewPanoramaCamera ajj;
    private String ajk;
    private LatLng ajl;
    private Integer ajm;
    private Boolean ajn;
    private Boolean ajo;
    private Boolean ajp;

    public StreetViewPanoramaOptions()
    {
        ajn = Boolean.valueOf(true);
        aiN = Boolean.valueOf(true);
        ajo = Boolean.valueOf(true);
        ajp = Boolean.valueOf(true);
        BR = 1;
    }

    StreetViewPanoramaOptions(int i, StreetViewPanoramaCamera streetviewpanoramacamera, String s, LatLng latlng, Integer integer, byte byte0, byte byte1, 
            byte byte2, byte byte3, byte byte4)
    {
        ajn = Boolean.valueOf(true);
        aiN = Boolean.valueOf(true);
        ajo = Boolean.valueOf(true);
        ajp = Boolean.valueOf(true);
        BR = i;
        ajj = streetviewpanoramacamera;
        ajl = latlng;
        ajm = integer;
        ajk = s;
        ajn = a.a(byte0);
        aiN = a.a(byte1);
        ajo = a.a(byte2);
        ajp = a.a(byte3);
        aiH = a.a(byte4);
    }

    public int describeContents()
    {
        return 0;
    }

    public Boolean getPanningGesturesEnabled()
    {
        return ajo;
    }

    public String getPanoramaId()
    {
        return ajk;
    }

    public LatLng getPosition()
    {
        return ajl;
    }

    public Integer getRadius()
    {
        return ajm;
    }

    public Boolean getStreetNamesEnabled()
    {
        return ajp;
    }

    public StreetViewPanoramaCamera getStreetViewPanoramaCamera()
    {
        return ajj;
    }

    public Boolean getUseViewLifecycleInFragment()
    {
        return aiH;
    }

    public Boolean getUserNavigationEnabled()
    {
        return ajn;
    }

    int getVersionCode()
    {
        return BR;
    }

    public Boolean getZoomGesturesEnabled()
    {
        return aiN;
    }

    byte mE()
    {
        return a.c(ajn);
    }

    byte mF()
    {
        return a.c(ajo);
    }

    byte mG()
    {
        return a.c(ajp);
    }

    byte ms()
    {
        return a.c(aiH);
    }

    byte mw()
    {
        return a.c(aiN);
    }

    public StreetViewPanoramaOptions panningGesturesEnabled(boolean flag)
    {
        ajo = Boolean.valueOf(flag);
        return this;
    }

    public StreetViewPanoramaOptions panoramaCamera(StreetViewPanoramaCamera streetviewpanoramacamera)
    {
        ajj = streetviewpanoramacamera;
        return this;
    }

    public StreetViewPanoramaOptions panoramaId(String s)
    {
        ajk = s;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latlng)
    {
        ajl = latlng;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latlng, Integer integer)
    {
        ajl = latlng;
        ajm = integer;
        return this;
    }

    public StreetViewPanoramaOptions streetNamesEnabled(boolean flag)
    {
        ajp = Boolean.valueOf(flag);
        return this;
    }

    public StreetViewPanoramaOptions useViewLifecycleInFragment(boolean flag)
    {
        aiH = Boolean.valueOf(flag);
        return this;
    }

    public StreetViewPanoramaOptions userNavigationEnabled(boolean flag)
    {
        ajn = Boolean.valueOf(flag);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.maps.c.a(this, parcel, i);
    }

    public StreetViewPanoramaOptions zoomGesturesEnabled(boolean flag)
    {
        aiN = Boolean.valueOf(flag);
        return this;
    }

}
