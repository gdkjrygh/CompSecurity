// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.comparator.impl;

import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.geofence.IGeoFence;
import com.digby.mm.android.library.geoshape.IGeoShape;
import com.digby.mm.android.library.utils.ILocationHelper;
import java.util.Comparator;

public class DistanceComparator
    implements Comparator
{

    private IDigbyController mController;

    public DistanceComparator(IDigbyController idigbycontroller)
    {
        mController = idigbycontroller;
    }

    public int compare(IGeoFence igeofence, IGeoFence igeofence1)
    {
        android.location.Location location = mController.getLocationHelper().getBestCachedLocation();
        float f = igeofence.getGeoShape().distanceFromLocation(location);
        float f1 = igeofence1.getGeoShape().distanceFromLocation(location);
        if (f < f1)
        {
            return -1;
        }
        return f != f1 ? 1 : 0;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((IGeoFence)obj, (IGeoFence)obj1);
    }
}
