// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.maps;

import android.graphics.Point;
import com.google.android.gms.maps.i;

// Referenced classes of package com.fitbit.maps:
//            LatLng, VisibleRegion

public class s
{

    private i a;

    public s(i j)
    {
        a = j;
    }

    public Point a(LatLng latlng)
    {
        return a.a(latlng.a());
    }

    public LatLng a(Point point)
    {
        return new LatLng(a.a(point));
    }

    public VisibleRegion a()
    {
        return new VisibleRegion(a.a());
    }
}
