// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//            CameraPosition, LatLng

public static final class alQ
{

    private LatLng alN;
    private float alO;
    private float alP;
    private float alQ;

    public alQ bearing(float f)
    {
        alQ = f;
        return this;
    }

    public CameraPosition build()
    {
        return new CameraPosition(alN, alO, alP, alQ);
    }

    public alQ target(LatLng latlng)
    {
        alN = latlng;
        return this;
    }

    public alN tilt(float f)
    {
        alP = f;
        return this;
    }

    public alP zoom(float f)
    {
        alO = f;
        return this;
    }

    public ()
    {
    }

    public (CameraPosition cameraposition)
    {
        alN = cameraposition.target;
        alO = cameraposition.zoom;
        alP = cameraposition.tilt;
        alQ = cameraposition.bearing;
    }
}
