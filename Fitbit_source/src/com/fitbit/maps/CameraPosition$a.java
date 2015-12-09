// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.maps;


// Referenced classes of package com.fitbit.maps:
//            CameraPosition, LatLng

public static final class .CameraPosition
{

    private com.google.android.gms.maps.model.c a;

    public .CameraPosition a(float f)
    {
        a.a(f);
        return this;
    }

    public .a a(LatLng latlng)
    {
        a.a(latlng.a());
        return this;
    }

    public CameraPosition a()
    {
        return new CameraPosition(a.a());
    }

    public .a b(float f)
    {
        a.b(f);
        return this;
    }

    public .b c(float f)
    {
        a.c(f);
        return this;
    }

    public .CameraPosition.a()
    {
        a = new com.google.android.gms.maps.model.<init>();
    }

    public .CameraPosition(CameraPosition cameraposition)
    {
        a = new com.google.android.gms.maps.model.<init>(cameraposition.a());
    }
}
