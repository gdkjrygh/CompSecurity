// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//            CameraPosition, LatLng

public static final class 
{

    private LatLng zzaqR;
    private float zzaqS;
    private float zzaqT;
    private float zzaqU;

    public final  bearing(float f)
    {
        zzaqU = f;
        return this;
    }

    public final CameraPosition build()
    {
        return new CameraPosition(zzaqR, zzaqS, zzaqT, zzaqU);
    }

    public final zzaqU target(LatLng latlng)
    {
        zzaqR = latlng;
        return this;
    }

    public final zzaqR tilt(float f)
    {
        zzaqT = f;
        return this;
    }

    public final zzaqT zoom(float f)
    {
        zzaqS = f;
        return this;
    }

    public ()
    {
    }
}
