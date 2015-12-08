// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//            CameraPosition, LatLng

public static final class aaq
{

    private LatLng aan;
    private float aao;
    private float aap;
    private float aaq;

    public aaq bearing(float f)
    {
        aaq = f;
        return this;
    }

    public CameraPosition build()
    {
        return new CameraPosition(aan, aao, aap, aaq);
    }

    public aaq target(LatLng latlng)
    {
        aan = latlng;
        return this;
    }

    public aan tilt(float f)
    {
        aap = f;
        return this;
    }

    public aap zoom(float f)
    {
        aao = f;
        return this;
    }

    public ()
    {
    }

    public (CameraPosition cameraposition)
    {
        aan = cameraposition.target;
        aao = cameraposition.zoom;
        aap = cameraposition.tilt;
        aaq = cameraposition.bearing;
    }
}
