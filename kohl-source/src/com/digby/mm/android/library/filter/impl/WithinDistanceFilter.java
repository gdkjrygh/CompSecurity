// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.filter.impl;

import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.filter.IFilter;
import com.digby.mm.android.library.geofence.IGeoFence;
import com.digby.mm.android.library.geoshape.IGeoShape;
import com.digby.mm.android.library.utils.ILocationHelper;

public class WithinDistanceFilter
    implements IFilter
{

    private IDigbyController mController;
    private double mDistance;

    public WithinDistanceFilter(double d, IDigbyController idigbycontroller)
    {
        mDistance = d;
        mController = idigbycontroller;
    }

    public boolean matches(IGeoFence igeofence)
    {
        return (double)igeofence.getGeoShape().distanceFromLocation(mController.getLocationHelper().getBestCachedLocation()) <= mDistance;
    }

    public volatile boolean matches(Object obj)
    {
        return matches((IGeoFence)obj);
    }
}
