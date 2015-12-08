// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.geofencing.api.GeofencingClient;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.userscope.WalletUserScopedBroadcastReceiver;

public class GeofencingReceiver extends WalletUserScopedBroadcastReceiver
{

    private static final String TAG = com/google/android/apps/wallet/geofencing/service/GeofencingReceiver.getSimpleName();
    GeofencingClient mServiceClient;

    public GeofencingReceiver()
    {
    }

    public static Intent createLocationReadyPendingIntent(Context context)
    {
        return InternalIntents.forAction(context, "com.google.android.apps.wallet.services.geofencing.LOCATION_READY_BROADCAST");
    }

    public static Intent createRequestLocationBroadcastIntent(Context context)
    {
        return InternalIntents.forAction(context, "com.google.android.apps.wallet.services.geofencing.REQUEST_LOCATION_BROADCAST");
    }

    public void onReceive(Context context, Intent intent)
    {
        super.onReceive(context, intent);
        String s = intent.getAction();
        WLog.dfmt(TAG, "Process intent action: %s", new Object[] {
            s
        });
        if ("com.google.android.apps.wallet.services.geofencing.LOCATION_READY_BROADCAST".equals(s))
        {
            mServiceClient.onLocationReady(context, intent.getExtras());
            return;
        }
        if ("com.google.android.apps.wallet.services.geofencing.CROSS_BOUNDARY_BROADCAST".equals(s))
        {
            mServiceClient.onCrossBoundary(context, intent.getExtras());
            return;
        }
        if ("com.google.android.apps.wallet.services.geofencing.LEAVE_EXIT_ZONE_BROADCAST".equals(s))
        {
            mServiceClient.onLeaveExitZone(context, intent.getExtras());
            return;
        }
        if ("com.google.android.apps.wallet.services.geofencing.REQUEST_LOCATION_BROADCAST".equals(s))
        {
            mServiceClient.requestLocation(context);
            return;
        } else
        {
            WLog.efmt(TAG, "unknown action: %s", new Object[] {
                s
            });
            return;
        }
    }

}
