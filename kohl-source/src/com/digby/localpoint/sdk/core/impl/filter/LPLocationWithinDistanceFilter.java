// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl.filter;

import android.content.Context;
import android.location.Location;
import com.digby.localpoint.sdk.core.ILPFilter;
import com.digby.localpoint.sdk.core.ILPGeopoint;
import com.digby.localpoint.sdk.core.ILPLocation;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.exception.LPArgumentException;
import com.digby.mm.android.library.utils.ILocationHelper;

public class LPLocationWithinDistanceFilter
    implements ILPFilter
{

    private static final float DEFAULT_RADIUS = 50F;
    private final float distance;
    private final Location referenceLocation;

    public LPLocationWithinDistanceFilter(float f, Location location)
    {
        distance = f;
        referenceLocation = location;
    }

    public LPLocationWithinDistanceFilter(Context context)
    {
        this(50F, DigbyController.getInstance(context).getLocationHelper().getBestCachedLocation());
    }

    public LPLocationWithinDistanceFilter(Context context, float f)
    {
        this(f, DigbyController.getInstance(context).getLocationHelper().getBestCachedLocation());
    }

    public LPLocationWithinDistanceFilter(Location location)
    {
        distance = 50F;
        referenceLocation = location;
    }

    public boolean accept(Object obj)
    {
        if (!(obj instanceof ILPLocation))
        {
            throw new LPArgumentException("Filter can only apply to objects of type ILPLocation");
        }
        obj = (ILPLocation)obj;
        Location location = new Location("network");
        location.setLatitude(((ILPLocation) (obj)).getCenter().getLatitude());
        location.setLongitude(((ILPLocation) (obj)).getCenter().getLongitude());
        location.setAltitude(referenceLocation.getAltitude());
        return (double)referenceLocation.distanceTo(location) <= (double)distance;
    }
}
