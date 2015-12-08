// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.location.Location;
import android.os.Messenger;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.Analytics;

// Referenced classes of package com.urbanairship.location:
//            LocationService, LocationRequestOptions

class ions
    implements com.urbanairship.ltCallback
{

    final LocationService this$0;
    final Messenger val$client;
    final LocationRequestOptions val$options;
    final int val$requestId;

    public void onResult(Location location)
    {
        Logger.info((new StringBuilder()).append("Location service received single location: ").append(location).append(" for client:").append(val$client).append(" id: ").append(val$requestId).toString());
        UAirship.shared().getAnalytics().recordLocation(location, val$options, com.urbanairship.analytics.teType.SINGLE);
        LocationService.access$000(LocationService.this, val$client, 4, val$requestId, location);
        LocationService.access$100(LocationService.this, val$client, val$requestId);
    }

    public volatile void onResult(Object obj)
    {
        onResult((Location)obj);
    }

    ions()
    {
        this$0 = final_locationservice;
        val$client = messenger;
        val$requestId = i;
        val$options = LocationRequestOptions.this;
        super();
    }
}
