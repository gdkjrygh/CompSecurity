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
//            StreetViewPanoramaOptionsCreator

public final class StreetViewPanoramaOptions
    implements SafeParcelable
{

    public static final StreetViewPanoramaOptionsCreator CREATOR = new StreetViewPanoramaOptionsCreator();
    private Boolean RJ;
    private Boolean RP;
    private StreetViewPanoramaCamera Sl;
    private String Sm;
    private LatLng Sn;
    private Integer So;
    private Boolean Sp;
    private Boolean Sq;
    private Boolean Sr;
    private final int xH;

    public StreetViewPanoramaOptions()
    {
        Sp = Boolean.valueOf(true);
        RP = Boolean.valueOf(true);
        Sq = Boolean.valueOf(true);
        Sr = Boolean.valueOf(true);
        xH = 1;
    }

    StreetViewPanoramaOptions(int i, StreetViewPanoramaCamera streetviewpanoramacamera, String s, LatLng latlng, Integer integer, byte byte0, byte byte1, 
            byte byte2, byte byte3, byte byte4)
    {
        Sp = Boolean.valueOf(true);
        RP = Boolean.valueOf(true);
        Sq = Boolean.valueOf(true);
        Sr = Boolean.valueOf(true);
        xH = i;
        Sl = streetviewpanoramacamera;
        Sn = latlng;
        So = integer;
        Sm = s;
        Sp = a.a(byte0);
        RP = a.a(byte1);
        Sq = a.a(byte2);
        Sr = a.a(byte3);
        RJ = a.a(byte4);
    }

    public int describeContents()
    {
        return 0;
    }

    public Boolean getPanningGesturesEnabled()
    {
        return Sq;
    }

    public String getPanoramaId()
    {
        return Sm;
    }

    public LatLng getPosition()
    {
        return Sn;
    }

    public Integer getRadius()
    {
        return So;
    }

    public Boolean getStreetNamesEnabled()
    {
        return Sr;
    }

    public StreetViewPanoramaCamera getStreetViewPanoramaCamera()
    {
        return Sl;
    }

    public Boolean getUseViewLifecycleInFragment()
    {
        return RJ;
    }

    public Boolean getUserNavigationEnabled()
    {
        return Sp;
    }

    int getVersionCode()
    {
        return xH;
    }

    public Boolean getZoomGesturesEnabled()
    {
        return RP;
    }

    byte ih()
    {
        return a.c(RJ);
    }

    byte il()
    {
        return a.c(RP);
    }

    byte it()
    {
        return a.c(Sp);
    }

    byte iu()
    {
        return a.c(Sq);
    }

    byte iv()
    {
        return a.c(Sr);
    }

    public StreetViewPanoramaOptions panningGesturesEnabled(boolean flag)
    {
        Sq = Boolean.valueOf(flag);
        return this;
    }

    public StreetViewPanoramaOptions panoramaCamera(StreetViewPanoramaCamera streetviewpanoramacamera)
    {
        Sl = streetviewpanoramacamera;
        return this;
    }

    public StreetViewPanoramaOptions panoramaId(String s)
    {
        Sm = s;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latlng)
    {
        Sn = latlng;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latlng, Integer integer)
    {
        Sn = latlng;
        So = integer;
        return this;
    }

    public StreetViewPanoramaOptions streetNamesEnabled(boolean flag)
    {
        Sr = Boolean.valueOf(flag);
        return this;
    }

    public StreetViewPanoramaOptions useViewLifecycleInFragment(boolean flag)
    {
        RJ = Boolean.valueOf(flag);
        return this;
    }

    public StreetViewPanoramaOptions userNavigationEnabled(boolean flag)
    {
        Sp = Boolean.valueOf(flag);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.maps.StreetViewPanoramaOptionsCreator.a(this, parcel, i);
    }

    public StreetViewPanoramaOptions zoomGesturesEnabled(boolean flag)
    {
        RP = Boolean.valueOf(flag);
        return this;
    }

}
