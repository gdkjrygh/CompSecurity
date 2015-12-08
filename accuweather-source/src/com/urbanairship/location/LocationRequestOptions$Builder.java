// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import java.util.concurrent.TimeUnit;

// Referenced classes of package com.urbanairship.location:
//            LocationRequestOptions

public static class REQUEST_PRIORITY
{

    private float minDistance;
    private long minTime;
    private int priority;

    public LocationRequestOptions create()
    {
        return new LocationRequestOptions(priority, minDistance, minTime, null);
    }

    public minTime setMinDistance(float f)
    {
        LocationRequestOptions.access$100(f);
        minDistance = f;
        return this;
    }

    public minDistance setMinTime(long l, TimeUnit timeunit)
    {
        LocationRequestOptions.access$000(timeunit.toMillis(l));
        minTime = timeunit.toMillis(l);
        return this;
    }

    public minTime setPriority(int i)
    {
        LocationRequestOptions.access$200(i);
        priority = i;
        return this;
    }

    public ()
    {
        minTime = LocationRequestOptions.DEFAULT_UPDATE_INTERVAL_MILLISECONDS;
        minDistance = LocationRequestOptions.DEFAULT_UPDATE_INTERVAL_METERS;
        priority = LocationRequestOptions.DEFAULT_REQUEST_PRIORITY;
    }
}
