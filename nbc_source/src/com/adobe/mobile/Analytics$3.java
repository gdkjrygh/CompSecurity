// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.location.Location;
import java.util.Map;

// Referenced classes of package com.adobe.mobile:
//            Analytics, AnalyticsTrackLocation

static final class val.cdata
    implements Runnable
{

    final Map val$cdata;
    final Location val$location;

    public void run()
    {
        AnalyticsTrackLocation.trackLocation(val$location, val$cdata);
    }

    ckLocation(Location location1, Map map)
    {
        val$location = location1;
        val$cdata = map;
        super();
    }
}
