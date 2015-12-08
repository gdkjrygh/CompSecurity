// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//            CameraPosition, LatLng

public static final class ajE
{

    private LatLng ajB;
    private float ajC;
    private float ajD;
    private float ajE;

    public ajE bearing(float f)
    {
        ajE = f;
        return this;
    }

    public CameraPosition build()
    {
        return new CameraPosition(ajB, ajC, ajD, ajE);
    }

    public ajE target(LatLng latlng)
    {
        ajB = latlng;
        return this;
    }

    public ajB tilt(float f)
    {
        ajD = f;
        return this;
    }

    public ajD zoom(float f)
    {
        ajC = f;
        return this;
    }

    public ()
    {
    }

    public (CameraPosition cameraposition)
    {
        ajB = cameraposition.target;
        ajC = cameraposition.zoom;
        ajD = cameraposition.tilt;
        ajE = cameraposition.bearing;
    }
}
