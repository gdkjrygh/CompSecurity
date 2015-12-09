// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//            CameraPosition, LatLng

public static final class 
{

    private LatLng azS;
    private float azT;
    private float azU;
    private float azV;

    public final  bearing(float f)
    {
        azV = f;
        return this;
    }

    public final CameraPosition build()
    {
        return new CameraPosition(azS, azT, azU, azV);
    }

    public final azV target(LatLng latlng)
    {
        azS = latlng;
        return this;
    }

    public final azS tilt(float f)
    {
        azU = f;
        return this;
    }

    public final azU zoom(float f)
    {
        azT = f;
        return this;
    }

    public ()
    {
    }
}
