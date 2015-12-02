// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public final class ayc
{

    public float a;
    public float b;

    public ayc()
    {
    }

    public final ayc a(float f)
    {
        b = f;
        return this;
    }

    public final StreetViewPanoramaOrientation a()
    {
        return new StreetViewPanoramaOrientation(b, a);
    }

    public final ayc b(float f)
    {
        a = f;
        return this;
    }
}
