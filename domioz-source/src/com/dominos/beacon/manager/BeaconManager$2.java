// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.manager;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.beacon.util.BeaconConfigurationPreferences_;
import org.androidannotations.api.c.k;
import org.androidannotations.api.c.p;

// Referenced classes of package com.dominos.beacon.manager:
//            BeaconManager

class GeofenceCallback extends GeofenceCallback
{

    final BeaconManager this$0;
    final String val$currentZipCode;

    public void onGeofenceSetFailure()
    {
    }

    public void onGeofenceSetSuccess()
    {
        mBeaconPreferences.lastGefenceSetZipcode().b(val$currentZipCode);
        mBeaconPreferences.lastGefenceSetTime().b(Long.valueOf(System.currentTimeMillis()));
        LogUtil.d(BeaconManager.access$000(), "Set geo-fences successfully", new Object[0]);
    }

    Preferences_()
    {
        this$0 = final_beaconmanager;
        val$currentZipCode = String.this;
        super();
    }
}
