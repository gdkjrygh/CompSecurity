// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//            CameraPosition, LatLng

public static final class 
{

    private LatLng a;
    private float b;
    private float c;
    private float d;

    public final  a(float f)
    {
        b = f;
        return this;
    }

    public final b a(LatLng latlng)
    {
        a = latlng;
        return this;
    }

    public final CameraPosition a()
    {
        return new CameraPosition(a, b, c, d);
    }

    public final d b(float f)
    {
        c = f;
        return this;
    }

    public final c c(float f)
    {
        d = f;
        return this;
    }

    public ()
    {
    }
}
