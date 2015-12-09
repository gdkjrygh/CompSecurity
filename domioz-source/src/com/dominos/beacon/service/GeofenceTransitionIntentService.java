// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.service;

import android.app.IntentService;
import android.content.Intent;
import android.location.Location;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.beacon.receiver.BeaconReceiver_;
import com.dominos.utils.AnalyticsUtil;
import com.google.android.gms.location.h;

public class GeofenceTransitionIntentService extends IntentService
{

    protected static final String TAG = com/dominos/beacon/service/GeofenceTransitionIntentService.getSimpleName();
    AnalyticsUtil mAnalyticsUtil;

    public GeofenceTransitionIntentService()
    {
        super(TAG);
    }

    private void broadcastGeofence(int i)
    {
        Intent intent = new Intent(getApplicationContext(), com/dominos/beacon/receiver/BeaconReceiver_);
        intent.setAction("geofence.FOUND");
        intent.putExtra("geofence.status", i);
        sendBroadcast(intent);
    }

    protected void onHandleIntent(Intent intent)
    {
        intent = h.a(intent);
        Location location = intent.b();
        int i = intent.a();
        if (i == 1)
        {
            mAnalyticsUtil.postOnEventBeaconGeofenceEnter();
            LogUtil.d(TAG, (new StringBuilder("Location triggered: ")).append(location.getLatitude()).append(", ").append(location.getLongitude()).toString(), new Object[0]);
            broadcastGeofence(i);
            return;
        }
        if (i == 2)
        {
            mAnalyticsUtil.postOnEventBeaconGeofenceExit();
            broadcastGeofence(i);
            return;
        } else
        {
            LogUtil.e(TAG, "Geofence event with no fence", new Object[0]);
            return;
        }
    }

}
