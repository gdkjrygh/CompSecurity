// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//            CameraPosition, LatLng

public static final class qd
{

    private LatLng qa;
    private float qb;
    private float qc;
    private float qd;

    public qd bearing(float f)
    {
        qd = f;
        return this;
    }

    public CameraPosition build()
    {
        return new CameraPosition(qa, qb, qc, qd);
    }

    public qd target(LatLng latlng)
    {
        qa = latlng;
        return this;
    }

    public qa tilt(float f)
    {
        qc = f;
        return this;
    }

    public qc zoom(float f)
    {
        qb = f;
        return this;
    }

    public ()
    {
    }

    public (CameraPosition cameraposition)
    {
        qa = cameraposition.target;
        qb = cameraposition.zoom;
        qc = cameraposition.tilt;
        qd = cameraposition.bearing;
    }
}
