// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

// Referenced classes of package com.nielsen.app.sdk:
//            AppLocationManager

public class a
    implements LocationListener
{

    final AppLocationManager a;

    public void onLocationChanged(Location location)
    {
        if (location != null)
        {
            AppLocationManager.a(a, location);
        }
    }

    public void onProviderDisabled(String s)
    {
    }

    public void onProviderEnabled(String s)
    {
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
    }

    public (AppLocationManager applocationmanager)
    {
        a = applocationmanager;
        super();
    }
}
