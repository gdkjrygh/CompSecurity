// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.services;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.IBinder;
import bo.app.dq;
import com.appboy.Appboy;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;

public class AppboyLocationService extends Service
{

    private static final String a;
    private String b;
    private LocationListener c;
    private LocationManager d;
    private String e;

    public AppboyLocationService()
    {
    }

    public static String a()
    {
        return a;
    }

    public static String a(AppboyLocationService appboylocationservice)
    {
        return appboylocationservice.e;
    }

    public static String b(AppboyLocationService appboylocationservice)
    {
        return appboylocationservice.b;
    }

    private void b()
    {
        if (c != null)
        {
            d.removeUpdates(c);
        }
    }

    public static LocationManager c(AppboyLocationService appboylocationservice)
    {
        return appboylocationservice.d;
    }

    public static void d(AppboyLocationService appboylocationservice)
    {
        appboylocationservice.b();
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onDestroy()
    {
        super.onDestroy();
        b();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (intent == null)
        {
            AppboyLogger.i(a, "Null intent received. Initializing Appboy and restarting Appboy location service.");
            Appboy.getInstance(getApplicationContext());
            return 1;
        }
        String s = intent.getAction();
        if (s == null)
        {
            AppboyLogger.w(a, (new StringBuilder("Null intent action received in Appboy location service: ")).append(intent.getDataString()).toString());
            return 1;
        }
        if (s.contains((new StringBuilder()).append(getApplicationContext().getPackageName()).append(".INIT_APPBOY_LOCATION_SERVICE").toString()))
        {
            AppboyLogger.i(a, (new StringBuilder("Setting up Appboy location service: ")).append(intent.getAction()).toString());
            e = getApplicationContext().getPackageName();
            d = (LocationManager)getApplicationContext().getSystemService("location");
            c = new dq(this);
            intent = intent.getStringExtra("provider");
            if (intent != null)
            {
                b = intent;
                return 1;
            } else
            {
                b = "passive";
                return 1;
            }
        }
        if (s.equals((new StringBuilder()).append(e).append(".REQUEST_APPBOY_LOCATION_UPDATES").toString()))
        {
            AppboyLogger.i(a, (new StringBuilder("Requesting background location updates: ")).append(intent.getAction()).toString());
            if (b == null)
            {
                AppboyLogger.i(a, "Could not request background location updates. Android location provider was null.");
                return 1;
            }
            float f = intent.getFloatExtra("distance", 50F);
            long l = intent.getLongExtra("time", 0x36ee80L);
            if (c != null)
            {
                d.requestLocationUpdates(b, l, f, c);
                AppboyLogger.i(a, String.format("Collecting locations using %s provider with time interval %ds and update distance %.1fm.", new Object[] {
                    b, Long.valueOf(l / 1000L), Float.valueOf(f)
                }));
                return 1;
            } else
            {
                AppboyLogger.w(a, "Could not request background location updates. Appboy location listener was null.");
                return 1;
            }
        }
        if (s.contains((new StringBuilder()).append(e).append(".REQUEST_REMOVE_APPBOY_LOCATION_UPDATES").toString()))
        {
            AppboyLogger.i(a, (new StringBuilder("Removing current location updates: ")).append(intent.getAction()).toString());
            b();
            return 1;
        } else
        {
            AppboyLogger.w(a, (new StringBuilder("Unknown intent received: ")).append(intent.getAction()).toString());
            return 1;
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/services/AppboyLocationService.getName()
        });
    }
}
