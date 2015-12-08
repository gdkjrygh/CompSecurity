// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.location;

import android.app.Application;
import android.location.Location;
import android.location.LocationManager;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.location.api.LocationSettings;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.util.location:
//            LocationHelper

public class LocationFetcher
{

    private static final String TAG = com/google/android/apps/wallet/util/location/LocationFetcher.getSimpleName();
    private final Application application;
    private final FeatureManager featureManager;
    private final LocationHelper locationHelper;
    private final LocationManager locationManager;
    private final LocationSettings locationSettings;
    private final Provider synchronizedLocationClient;

    LocationFetcher(Application application1, LocationManager locationmanager, LocationHelper locationhelper, LocationSettings locationsettings, Provider provider, FeatureManager featuremanager)
    {
        application = application1;
        locationManager = locationmanager;
        locationHelper = locationhelper;
        locationSettings = locationsettings;
        synchronizedLocationClient = provider;
        featureManager = featuremanager;
    }

    public final Location getLastKnownLocation(long l)
    {
        Location location;
        if (!featureManager.isFeatureEnabled(Feature.LOCATION_REPORTING) || !locationSettings.isSystemPreferencesLocationEnabled())
        {
            location = null;
        } else
        {
            Location location1 = locationManager.getLastKnownLocation("gps");
            location = location1;
            if (!locationHelper.isLocationTimeRecent(location1, l))
            {
                Location location2 = locationManager.getLastKnownLocation("network");
                location = location2;
                if (!locationHelper.isLocationTimeRecent(location2, l))
                {
                    return null;
                }
            }
        }
        return location;
    }

}
