// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings.ui;

import android.content.SharedPreferences;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.location.api.GoogleLocationSettingHelper;

public class GeofencingSettingsChecker
{

    private boolean dialogHasBeenCanceled;
    private final GoogleLocationSettingHelper googleLocationSettingHelper;
    private final LocationManager locationManager;
    private final SharedPreferences sharedPreferences;
    private final WifiManager wifiManager;

    public GeofencingSettingsChecker(GoogleLocationSettingHelper googlelocationsettinghelper, LocationManager locationmanager, WifiManager wifimanager, SharedPreferences sharedpreferences)
    {
        dialogHasBeenCanceled = false;
        googleLocationSettingHelper = googlelocationsettinghelper;
        locationManager = locationmanager;
        wifiManager = wifimanager;
        sharedPreferences = sharedpreferences;
    }

    private boolean areAllRequiredSettingsEnabled()
    {
        return isGoogleAppsLocationSettingEnabled() && isNetworkProviderEnabled() && isWifiNetworksEnabled();
    }

    public final boolean isGoogleAppsLocationSettingAvailable()
    {
        return googleLocationSettingHelper.isAvailable();
    }

    public final boolean isGoogleAppsLocationSettingEnabled()
    {
        while (!googleLocationSettingHelper.isAvailable() || googleLocationSettingHelper.getUseLocationForServices() == 1) 
        {
            return true;
        }
        return false;
    }

    public final boolean isNetworkProviderEnabled()
    {
        return locationManager.isProviderEnabled("network");
    }

    public final boolean isWifiNetworksEnabled()
    {
        return wifiManager.isWifiEnabled();
    }

    public final void setGeofencingSettingsReminderDialogCanceled()
    {
        dialogHasBeenCanceled = true;
    }

    public final boolean shouldShowGeofencingSettingsReminderDialog()
    {
        return !dialogHasBeenCanceled && !((Boolean)SharedPreference.GEOFENCING_SETTINGS_REMINDER_DIALOG_DISMISSED.get(sharedPreferences)).booleanValue() && !areAllRequiredSettingsEnabled();
    }
}
