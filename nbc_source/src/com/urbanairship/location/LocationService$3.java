// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.LocationOptions;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.Analytics;
import com.urbanairship.analytics.LocationEvent;

// Referenced classes of package com.urbanairship.location:
//            LocationService, UALocationManager, LocationPreferences

class this._cls0 extends BroadcastReceiver
{

    final LocationService this$0;

    public void onReceive(Context context, Intent intent)
    {
        Location location;
label0:
        {
            if (UALocationManager.getLocationIntentAction(".urbanairship.location.LOCATION_CHANGED").equals(intent.getAction()) || UALocationManager.getLocationIntentAction(".urbanairship.location.SINGLE_LOCATION_CHANGED").equals(intent.getAction()))
            {
                location = (Location)intent.getExtras().get("location");
                if (location != null)
                {
                    break label0;
                }
            }
            return;
        }
        Logger.info("Received a location update.");
        Logger.verbose((new StringBuilder()).append("Location: ").append(location.toString()).toString());
        Object obj = com.urbanairship.analytics.teType.CONTINUOUS;
        int i;
        if (UALocationManager.getLocationIntentAction(".urbanairship.location.SINGLE_LOCATION_CHANGED").equals(intent.getAction()))
        {
            Logger.info("Received a single-shot location update.");
            LocationService.access$1100(LocationService.this).removeUpdates(LocationService.access$1300(LocationService.this));
            com.urbanairship.analytics.teType tetype = com.urbanairship.analytics.teType.SINGLE;
            boolean flag = false;
            i = ((flag) ? 1 : 0);
            obj = tetype;
            if (!UALocationManager.shared().getPreferences().isForegroundLocationEnabled())
            {
                UALocationManager.unbindService();
                obj = new Intent(context, com/urbanairship/location/LocationService);
                ((Intent) (obj)).setAction("com.urbanairship.location.STOP");
                Logger.debug("LocationService stopService");
                context.stopService(((Intent) (obj)));
                obj = tetype;
                i = ((flag) ? 1 : 0);
            }
        } else
        {
            i = UAirship.shared().getAirshipConfigOptions().locationOptions.updateIntervalMeters;
        }
        LocationService.access$702(LocationService.this, location);
        UAirship.shared().getAnalytics().addEvent(new LocationEvent(location, ((com.urbanairship.analytics.teType) (obj)), intent.getIntExtra("com.urbanairship.location.REQUESTED_ACCURACY", -1), i));
        intent = new Intent(UALocationManager.getLocationIntentAction(".urbanairship.location.LOCATION_UPDATE"));
        intent.putExtra("com.urbanairship.location.LOCATION", LocationService.access$700(LocationService.this));
        context.sendBroadcast(intent);
    }

    s()
    {
        this$0 = LocationService.this;
        super();
    }
}
