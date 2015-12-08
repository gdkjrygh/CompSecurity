// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.data;

import android.location.Location;
import com.thetransitapp.droid.model.BundleResponse;
import com.thetransitapp.droid.model.DetailRequest;
import com.thetransitapp.droid.model.Itinerary;
import com.thetransitapp.droid.model.NearbyRoutesRequest;
import com.thetransitapp.droid.model.ScheduleItem;
import com.thetransitapp.droid.model.ScheduleRequest;
import com.thetransitapp.droid.model.Stop;
import java.util.List;

public interface TransitSource
{

    public abstract List fullSchedules(ScheduleRequest schedulerequest)
        throws Exception;

    public abstract String headsign(Itinerary itinerary, Stop stop);

    public abstract BundleResponse loadBundle(Location location, boolean flag)
        throws Exception;

    public abstract DetailRequest loadDetails(DetailRequest detailrequest)
        throws Exception;

    public abstract ScheduleItem loadDetails(ScheduleItem scheduleitem)
        throws Exception;

    public abstract List loadLegal(Location location)
        throws Exception;

    public abstract NearbyRoutesRequest loadNearbyRoutes(NearbyRoutesRequest nearbyroutesrequest)
        throws Exception;
}
