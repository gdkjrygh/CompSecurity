// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.api;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.beacon.client.BeaconContentRestClient;
import com.dominos.beacon.model.BeaconConfig;
import com.dominos.beacon.util.BeaconConfigurationPreferences_;
import com.google.b.k;
import java.util.List;
import org.androidannotations.api.c.d;
import org.androidannotations.api.c.i;
import org.androidannotations.api.c.p;

public class BeaconConfigurationAPI
{

    private static final String TAG = com/dominos/beacon/api/BeaconConfigurationAPI.getSimpleName();
    BeaconConfigurationPreferences_ mBeaconConfigurationPreferences;
    BeaconContentRestClient mBeaconContentRestClient;

    public BeaconConfigurationAPI()
    {
    }

    private BeaconConfig getCachedBeaconConfiguration()
    {
        BeaconConfig beaconconfig = new BeaconConfig();
        beaconconfig.setTabletSupported(mBeaconConfigurationPreferences.tabletSupported().a(Boolean.valueOf(false)).booleanValue());
        beaconconfig.setScanDuration(((Integer)mBeaconConfigurationPreferences.scanDuration().c()).intValue());
        beaconconfig.setScanDelayInterval(((Integer)mBeaconConfigurationPreferences.scanDelayInterval().c()).intValue());
        beaconconfig.setGeoFenceRadius(((Integer)mBeaconConfigurationPreferences.geoFenceRadius().c()).intValue());
        beaconconfig.setEnableAllStores(mBeaconConfigurationPreferences.enableAllStores().a(Boolean.valueOf(false)).booleanValue());
        if (mBeaconConfigurationPreferences.storeLocationInfo().a())
        {
            java.lang.reflect.Type type = (new _cls1()).getType();
            beaconconfig.setStoreLocationInfo((List)(new k()).a((String)mBeaconConfigurationPreferences.storeLocationInfo().c(), type));
        }
        return beaconconfig;
    }

    private void persistBeaconConfiguration(BeaconConfig beaconconfig)
    {
        mBeaconConfigurationPreferences.clear();
        mBeaconConfigurationPreferences.tabletSupported().b(Boolean.valueOf(beaconconfig.getTabletSupported()));
        mBeaconConfigurationPreferences.scanDuration().b(Integer.valueOf(beaconconfig.getScanDuration()));
        mBeaconConfigurationPreferences.scanDelayInterval().b(Integer.valueOf(beaconconfig.getScanDelayInterval()));
        mBeaconConfigurationPreferences.geoFenceRadius().b(Integer.valueOf(beaconconfig.getGeoFenceRadius()));
        mBeaconConfigurationPreferences.enableAllStores().b(Boolean.valueOf(beaconconfig.getEnableAllStores()));
        if (beaconconfig.getStoreLocationInfo() != null && !beaconconfig.getStoreLocationInfo().isEmpty())
        {
            mBeaconConfigurationPreferences.storeLocationInfo().b((new k()).a(beaconconfig.getStoreLocationInfo()));
        }
    }

    public BeaconConfig loadBeaconConfiguration(String s, int j)
    {
        if (j == ((Integer)mBeaconConfigurationPreferences.beaconVersionCode().c()).intValue()) goto _L2; else goto _L1
_L1:
        s = mBeaconContentRestClient.getBeaconConfiguration(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        persistBeaconConfiguration(s);
        mBeaconConfigurationPreferences.beaconVersionCode().b(Integer.valueOf(j));
        return s;
        LogUtil.d(TAG, "Loading beacon configuration from CDN failed!", new Object[0]);
        return s;
        Exception exception;
        exception;
_L4:
        LogUtil.d(TAG, "Beacon configuration JSON parse exception!", new Object[0]);
        return s;
_L2:
        s = getCachedBeaconConfiguration();
        return s;
        s;
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
    }


    private class _cls1 extends a
    {

        final BeaconConfigurationAPI this$0;

        _cls1()
        {
            this$0 = BeaconConfigurationAPI.this;
            super();
        }
    }

}
