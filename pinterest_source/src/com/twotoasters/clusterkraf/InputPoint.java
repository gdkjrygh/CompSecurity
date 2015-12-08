// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.clusterkraf;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

// Referenced classes of package com.twotoasters.clusterkraf:
//            BasePoint

public class InputPoint extends BasePoint
{

    private Object b;

    private InputPoint(LatLng latlng)
    {
        a = latlng;
    }

    public InputPoint(LatLng latlng, Object obj)
    {
        this(latlng);
        b = obj;
    }

    public final volatile LatLng a()
    {
        return super.a();
    }

    public final volatile void a(Marker marker)
    {
        super.a(marker);
    }

    public final Object d()
    {
        return b;
    }
}
