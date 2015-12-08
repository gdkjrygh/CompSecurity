// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.location.LocationClient;

// Referenced classes of package com.leanplum:
//            c, LocationManagerImpl

public class ReceiveTransitionsIntentService extends IntentService
{

    public ReceiveTransitionsIntentService()
    {
        super("ReceiveTransitionsIntentService");
    }

    protected void onHandleIntent(Intent intent)
    {
        if (LocationClient.hasError(intent))
        {
            int i = LocationClient.getErrorCode(intent);
            Log.d("Leanplum", (new StringBuilder("Location Client Error with code: ")).append(i).toString());
        } else
        {
            int j = LocationClient.getGeofenceTransition(intent);
            intent = LocationClient.getTriggeringGeofences(intent);
            if (j == 1 || j == 2)
            {
                LocationManagerImpl locationmanagerimpl = (LocationManagerImpl)c.b();
                if (locationmanagerimpl != null)
                {
                    locationmanagerimpl.updateStatusForGeofences(intent, j);
                    return;
                }
            }
        }
    }
}
