// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.app.PendingIntent;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.appboy.services.AppboyLocationService;

public final class dq
    implements LocationListener
{

    final AppboyLocationService a;

    public dq(AppboyLocationService appboylocationservice)
    {
        a = appboylocationservice;
        super();
    }

    public final void onLocationChanged(Location location)
    {
        if (location != null)
        {
            AppboyLocationService.a();
            Intent intent = new Intent((new StringBuilder()).append(AppboyLocationService.a(a)).append(".SINGLE_APPBOY_LOCATION_UPDATE").toString());
            intent.putExtra("location", location);
            intent.putExtra("origin", "Appboy location service");
            location = PendingIntent.getBroadcast(a.getApplicationContext(), 0, intent, 0x8000000);
            AppboyLocationService.c(a).requestSingleUpdate(AppboyLocationService.b(a), location);
        }
    }

    public final void onProviderDisabled(String s)
    {
        if (s != null && s.equals(AppboyLocationService.b(a)))
        {
            AppboyLocationService.d(a);
        }
    }

    public final void onProviderEnabled(String s)
    {
    }

    public final void onStatusChanged(String s, int i, Bundle bundle)
    {
    }
}
