// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaOrientation

public final class g
{

    public float a;
    public float b;

    public g()
    {
    }

    public StreetViewPanoramaOrientation a()
    {
        return new StreetViewPanoramaOrientation(b, a);
    }

    public g a(float f)
    {
        b = f;
        return this;
    }

    public g b(float f)
    {
        a = f;
        return this;
    }
}
