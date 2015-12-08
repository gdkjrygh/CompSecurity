// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

// Referenced classes of package com.google.android.gms.location:
//            LocationRequest

public interface FusedLocationProviderApi
{

    public static final int INJECTION_TYPE_GPS_EXTERNAL = 1;
    public static final String KEY_LOCATION_CHANGED = "com.google.android.location.LOCATION";
    public static final String KEY_MOCK_LOCATION = "mockLocation";

    public abstract Location getLastLocation(GoogleApiClient googleapiclient);

    public abstract PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, PendingIntent pendingintent);

    public abstract PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, PendingIntent pendingintent);
}
