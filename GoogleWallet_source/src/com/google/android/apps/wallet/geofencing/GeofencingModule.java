// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing;

import com.google.android.apps.wallet.geofencing.api.GeofencingNotificationHandler;

// Referenced classes of package com.google.android.apps.wallet.geofencing:
//            GeofencingNotificationSavedWobHandler

public class GeofencingModule
{

    public GeofencingModule()
    {
    }

    static GeofencingNotificationHandler getGeofencingNotificationHandler(GeofencingNotificationSavedWobHandler geofencingnotificationsavedwobhandler)
    {
        return geofencingnotificationsavedwobhandler;
    }
}
