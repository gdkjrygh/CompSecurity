// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.Analytics;
import com.urbanairship.analytics.LocationEvent;
import com.urbanairship.util.UAStringUtil;

// Referenced classes of package com.urbanairship.location:
//            LocationService

class tub extends tub
{

    final LocationService this$0;

    public void createLocationEvent(Location location, int i, int j)
    {
        LocationService.access$702(LocationService.this, location);
        UAirship.shared().getAnalytics().addEvent(new LocationEvent(LocationService.access$700(LocationService.this), com.urbanairship.analytics.teType.SINGLE, i, j));
    }

    public String getBestProvider()
    {
        return LocationService.access$600(LocationService.this);
    }

    public Criteria getCriteria()
    {
        return criteria;
    }

    public String getCurrentProvider()
    {
        return LocationService.access$300(LocationService.this);
    }

    public Location getLocation()
    {
        return LocationService.access$700(LocationService.this);
    }

    public void requestSingleLocationUpdate(Criteria criteria)
    {
        Logger.info("Requesting a single update.");
        if (criteria == null && UAStringUtil.isEmpty(LocationService.access$300(LocationService.this)))
        {
            LocationService.access$1000(LocationService.this);
            LocationService.access$400(LocationService.this);
        }
        int i;
        if (criteria == null)
        {
            i = LocationService.this.criteria.getAccuracy();
        } else
        {
            i = criteria.getAccuracy();
        }
        if (criteria == null)
        {
            criteria = LocationService.access$300(LocationService.this);
        } else
        {
            criteria = LocationService.access$1100(LocationService.this).getBestProvider(criteria, true);
        }
        if (!UAStringUtil.isEmpty(criteria))
        {
            LocationService.access$1200(LocationService.this, i);
            LocationService.access$1100(LocationService.this).requestLocationUpdates(criteria, 0L, 0.0F, LocationService.access$1300(LocationService.this));
            return;
        } else
        {
            Logger.debug("There are no available location providers. Retrieving last known location.");
            LocationService.access$1400(LocationService.this);
            return;
        }
    }

    public void resetProviders()
    {
        LocationService.access$400(LocationService.this);
        if (LocationService.access$900())
        {
            LocationService.access$500(LocationService.this);
        }
    }

    public void setCriteria(Criteria criteria)
    {
        LocationService.this.criteria = criteria;
        LocationService.access$800(LocationService.this);
    }

    ateType()
    {
        this$0 = LocationService.this;
        super();
    }
}
