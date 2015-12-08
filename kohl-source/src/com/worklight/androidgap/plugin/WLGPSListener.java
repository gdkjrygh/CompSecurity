// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.location.LocationManager;

// Referenced classes of package com.worklight.androidgap.plugin:
//            WLLocationListener, WLGeolocationPlugin

public class WLGPSListener extends WLLocationListener
{

    public WLGPSListener(LocationManager locationmanager, WLGeolocationPlugin wlgeolocationplugin)
    {
        super(locationmanager, wlgeolocationplugin, "gps");
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
                locationManager.requestLocationUpdates("gps", minChangeTime, minChangeDistance, this);
            }
            return;
        }
        fail(WLLocationListener.POSITION_UNAVAILABLE, "GPS provider is not available.");
    }
}
