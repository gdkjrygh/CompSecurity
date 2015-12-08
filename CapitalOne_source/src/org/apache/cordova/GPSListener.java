// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.location.LocationManager;

// Referenced classes of package org.apache.cordova:
//            CordovaLocationListener, GeoBroker

public class GPSListener extends CordovaLocationListener
{

    public GPSListener(LocationManager locationmanager, GeoBroker geobroker)
    {
        super(locationmanager, geobroker, "[Cordova GPSListener]");
    }

    protected void start()
    {
label0:
        {
            if (!running)
            {
                if (locationManager.getProvider("gps") == null)
                {
                    break label0;
                }
                running = true;
                locationManager.requestLocationUpdates("gps", 60000L, 0.0F, this);
            }
            return;
        }
        fail(CordovaLocationListener.POSITION_UNAVAILABLE, "GPS provider is not available.");
    }
}
