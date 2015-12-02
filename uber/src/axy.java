// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

public final class axy
{

    private LatLng a;
    private float b;
    private float c;
    private float d;

    public axy()
    {
    }

    public final axy a(float f)
    {
        b = f;
        return this;
    }

    public final axy a(LatLng latlng)
    {
        a = latlng;
        return this;
    }

    public final CameraPosition a()
    {
        return new CameraPosition(a, b, c, d);
    }

    public final axy b(float f)
    {
        c = f;
        return this;
    }

    public final axy c(float f)
    {
        d = f;
        return this;
    }
}
