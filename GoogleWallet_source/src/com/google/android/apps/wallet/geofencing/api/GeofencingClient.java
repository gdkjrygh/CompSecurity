// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing.api;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.network.NetworkConnectivityEvent;

// Referenced classes of package com.google.android.apps.wallet.geofencing.api:
//            GeofencingNotificationHandlerManager

public class GeofencingClient
{

    private final Application application;
    private final FeatureManager featureManager;
    private final GeofencingNotificationHandlerManager handlerManager;
    private final SharedPreferences sharedPreferences;

    public GeofencingClient(Application application1, SharedPreferences sharedpreferences, GeofencingNotificationHandlerManager geofencingnotificationhandlermanager, FeatureManager featuremanager)
    {
        application = application1;
        sharedPreferences = sharedpreferences;
        handlerManager = geofencingnotificationhandlermanager;
        featureManager = featuremanager;
    }

    private Intent createOnCrossBoundaryIntent(Bundle bundle)
    {
        return InternalIntents.forAction(application, "com.google.android.apps.wallet.services.geofencing.ON_CROSS_BOUNDARY").putExtras(bundle);
    }

    private Intent createOnLeaveExitZoneIntent(Bundle bundle)
    {
        return InternalIntents.forAction(application, "com.google.android.apps.wallet.services.geofencing.ON_LEAVE_EXIT_ZONE").putExtras(bundle);
    }

    private Intent createOnLocationReadyIntent(Bundle bundle)
    {
        return InternalIntents.forAction(application, "com.google.android.apps.wallet.services.geofencing.ON_LOCATION_READY").putExtras(bundle);
    }

    private Intent createRequestLocationIntent()
    {
        return InternalIntents.forAction(application, "com.google.android.apps.wallet.services.geofencing.ON_REQUEST_LOCATION");
    }

    private Intent createStartGeofencingIntent()
    {
        return InternalIntents.forAction(application, "com.google.android.apps.wallet.services.geofencing.START_GEOFENCING_NOTIFICATION");
    }

    private Intent createStopNotificationsIntent()
    {
        return InternalIntents.forAction(application, "com.google.android.apps.wallet.services.geofencing.STOP_GEOFENCING_NOTIFICATION");
    }

    private boolean isGeofencingEnabled()
    {
        return featureManager.isFeatureEnabled(Feature.WOBS_GEOFENCING) && featureManager.isFeatureEnabled(Feature.LOCATION_REPORTING);
    }

    void handleNetworkConnectivityEvent(NetworkConnectivityEvent networkconnectivityevent)
    {
        if (isGeofencingEnabled() && networkconnectivityevent.isConnected() && ((Boolean)SharedPreference.PROXIMITY_ALERT_ERROR_NO_NETWORK.get(sharedPreferences)).booleanValue())
        {
            SharedPreference.PROXIMITY_ALERT_ERROR_NO_NETWORK.put(sharedPreferences, Boolean.valueOf(false));
            requestLocation(application.getApplicationContext());
        }
    }

    public final void onCrossBoundary(Context context, Bundle bundle)
    {
        if (isGeofencingEnabled())
        {
            context.startService(createOnCrossBoundaryIntent(bundle));
        }
    }

    public final void onLeaveExitZone(Context context, Bundle bundle)
    {
        if (isGeofencingEnabled())
        {
            context.startService(createOnLeaveExitZoneIntent(bundle));
        }
    }

    public final void onLocationReady(Context context, Bundle bundle)
    {
        if (isGeofencingEnabled())
        {
            context.startService(createOnLocationReadyIntent(bundle));
        }
    }

    public final void requestLocation(Context context)
    {
        if (isGeofencingEnabled())
        {
            context.startService(createRequestLocationIntent());
        }
    }

    public final void start(Context context)
    {
        if (isGeofencingEnabled() && handlerManager.isEnabled())
        {
            context.startService(createStartGeofencingIntent());
        }
    }

    public final void stop(Context context)
    {
        if (isGeofencingEnabled())
        {
            context.startService(createStopNotificationsIntent());
        }
    }
}
