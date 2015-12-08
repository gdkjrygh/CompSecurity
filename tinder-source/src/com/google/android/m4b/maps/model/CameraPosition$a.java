// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;


// Referenced classes of package com.google.android.m4b.maps.model:
//            CameraPosition, LatLng

public static final class d
{

    public LatLng a;
    public float b;
    public float c;
    public float d;

    public final CameraPosition a()
    {
        return new CameraPosition(a, b, c, d);
    }

    public ()
    {
    }

    public (CameraPosition cameraposition)
    {
        a = cameraposition.b;
        b = cameraposition.c;
        c = cameraposition.d;
        d = cameraposition.e;
    }
}
