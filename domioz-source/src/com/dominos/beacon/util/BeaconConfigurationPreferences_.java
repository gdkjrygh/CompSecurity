// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.util;

import android.content.Context;
import org.androidannotations.api.c.d;
import org.androidannotations.api.c.i;
import org.androidannotations.api.c.k;
import org.androidannotations.api.c.n;
import org.androidannotations.api.c.p;

public final class BeaconConfigurationPreferences_ extends n
{

    public BeaconConfigurationPreferences_(Context context)
    {
        super(context.getSharedPreferences("BeaconConfigurationPreferences", 0));
    }

    public final i beaconVersionCode()
    {
        return intField("beaconVersionCode", 0);
    }

    public final BeaconConfigurationPreferencesEditor_ edit()
    {
        return new BeaconConfigurationPreferencesEditor_(getSharedPreferences());
    }

    public final d enableAllStores()
    {
        return booleanField("enableAllStores", false);
    }

    public final i geoFenceRadius()
    {
        return intField("geoFenceRadius", 0);
    }

    public final k lastGefenceSetTime()
    {
        return longField("lastGefenceSetTime", 0L);
    }

    public final p lastGefenceSetZipcode()
    {
        return stringField("lastGefenceSetZipcode", "");
    }

    public final i scanDelayInterval()
    {
        return intField("scanDelayInterval", 0);
    }

    public final i scanDuration()
    {
        return intField("scanDuration", 0);
    }

    public final p storeLocationInfo()
    {
        return stringField("storeLocationInfo", "");
    }

    public final d tabletSupported()
    {
        return booleanField("tabletSupported", false);
    }

    private class BeaconConfigurationPreferencesEditor_ extends e
    {

        public final h beaconVersionCode()
        {
            return intField("beaconVersionCode");
        }

        public final c enableAllStores()
        {
            return booleanField("enableAllStores");
        }

        public final h geoFenceRadius()
        {
            return intField("geoFenceRadius");
        }

        public final j lastGefenceSetTime()
        {
            return longField("lastGefenceSetTime");
        }

        public final o lastGefenceSetZipcode()
        {
            return stringField("lastGefenceSetZipcode");
        }

        public final h scanDelayInterval()
        {
            return intField("scanDelayInterval");
        }

        public final h scanDuration()
        {
            return intField("scanDuration");
        }

        public final o storeLocationInfo()
        {
            return stringField("storeLocationInfo");
        }

        public final c tabletSupported()
        {
            return booleanField("tabletSupported");
        }

        BeaconConfigurationPreferencesEditor_(SharedPreferences sharedpreferences)
        {
            super(sharedpreferences);
        }
    }

}
