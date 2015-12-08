// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.location;

import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.digby.mm.android.library.location:
//            IMonitorable

public interface ILocationManager
    extends com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener, IMonitorable
{

    public static final String ACTION_LOCATION_UPDATED = "Action_Location_Updated";
    public static final int DEFAULT_FASTEST_INTERVAL = 300;
    public static final int DEFAULT_INTERVAL = 5000;

    public abstract void requestLocationUpdates(LocationRequest locationrequest);
}
