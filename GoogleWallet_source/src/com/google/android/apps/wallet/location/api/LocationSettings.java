// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.location.api;

import android.app.Activity;
import android.content.Intent;
import android.location.LocationManager;

// Referenced classes of package com.google.android.apps.wallet.location.api:
//            GoogleLocationSettingHelper

public class LocationSettings
{

    private final GoogleLocationSettingHelper googleLocationSettingHelper;
    private final LocationManager locationManager;

    public LocationSettings(GoogleLocationSettingHelper googlelocationsettinghelper, LocationManager locationmanager)
    {
        googleLocationSettingHelper = googlelocationsettinghelper;
        locationManager = locationmanager;
    }

    public final boolean isSystemPreferencesLocationEnabled()
    {
        boolean flag;
        boolean flag1;
        if (googleLocationSettingHelper.isAvailable())
        {
            if (googleLocationSettingHelper.getUseLocationForServices() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = true;
        }
        if (locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network"))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return flag && flag1;
    }

    public final void startSystemLocationSettingActivity(Activity activity)
    {
        if (googleLocationSettingHelper.isAvailable())
        {
            googleLocationSettingHelper.launchGoogleLocationSettingIntent();
            return;
        } else
        {
            activity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            return;
        }
    }
}
