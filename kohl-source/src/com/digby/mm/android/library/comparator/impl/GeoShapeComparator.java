// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.comparator.impl;

import android.location.Location;
import com.digby.mm.android.library.geoshape.IGeoShape;
import java.util.Comparator;

public class GeoShapeComparator
    implements Comparator
{

    private Location loc;

    public GeoShapeComparator(Location location)
    {
        loc = location;
    }

    public int compare(IGeoShape igeoshape, IGeoShape igeoshape1)
    {
        if (loc != null)
        {
            float f = igeoshape.distanceFromLocation(loc);
            float f1 = igeoshape1.distanceFromLocation(loc);
            if (f < f1)
            {
                return -1;
            }
            if (f >= f1)
            {
                return 1;
            }
        }
        return 0;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((IGeoShape)obj, (IGeoShape)obj1);
    }
}
