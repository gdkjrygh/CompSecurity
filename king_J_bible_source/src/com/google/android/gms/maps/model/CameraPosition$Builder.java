// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//            CameraPosition, LatLng

public static final class SG
{

    private LatLng SD;
    private float SE;
    private float SF;
    private float SG;

    public SG bearing(float f)
    {
        SG = f;
        return this;
    }

    public CameraPosition build()
    {
        return new CameraPosition(SD, SE, SF, SG);
    }

    public SG target(LatLng latlng)
    {
        SD = latlng;
        return this;
    }

    public SD tilt(float f)
    {
        SF = f;
        return this;
    }

    public SF zoom(float f)
    {
        SE = f;
        return this;
    }

    public ()
    {
    }

    public (CameraPosition cameraposition)
    {
        SD = cameraposition.target;
        SE = cameraposition.zoom;
        SF = cameraposition.tilt;
        SG = cameraposition.bearing;
    }
}
