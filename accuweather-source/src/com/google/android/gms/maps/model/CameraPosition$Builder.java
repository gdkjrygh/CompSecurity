// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//            CameraPosition, LatLng

public static final class aan
{

    private LatLng aak;
    private float aal;
    private float aam;
    private float aan;

    public aan bearing(float f)
    {
        aan = f;
        return this;
    }

    public CameraPosition build()
    {
        return new CameraPosition(aak, aal, aam, aan);
    }

    public aan target(LatLng latlng)
    {
        aak = latlng;
        return this;
    }

    public aak tilt(float f)
    {
        aam = f;
        return this;
    }

    public aam zoom(float f)
    {
        aal = f;
        return this;
    }

    public ()
    {
    }

    public (CameraPosition cameraposition)
    {
        aak = cameraposition.target;
        aal = cameraposition.zoom;
        aam = cameraposition.tilt;
        aan = cameraposition.bearing;
    }
}
