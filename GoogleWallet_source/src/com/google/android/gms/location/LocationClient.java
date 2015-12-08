// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.GooglePlayServicesClient;

public final class LocationClient
    implements GooglePlayServicesClient
{
    public static interface OnAddGeofencesResultListener
    {

        public abstract void onAddGeofencesResult(int i, String as[]);
    }

    public static interface OnRemoveGeofencesResultListener
    {

        public abstract void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingintent);

        public abstract void onRemoveGeofencesByRequestIdsResult(int i, String as[]);
    }


    public static final String CLIENT_NAME = "location";
    public static final String EXTRA_KEY_LOCATION_TYPE = "locationType";
    public static final String EXTRA_VALUE_LOCATION_TYPE_CELL = "cell";
    public static final String EXTRA_VALUE_LOCATION_TYPE_GPS = "gps";
    public static final String EXTRA_VALUE_LOCATION_TYPE_WIFI = "wifi";
    public static final int INJECTION_TYPE_GPS_EXTERNAL = 1;
    public static final String KEY_LOCATION_CHANGED = "com.google.android.location.LOCATION";
    public static final String KEY_MOCK_LOCATION = "mockLocation";
}
