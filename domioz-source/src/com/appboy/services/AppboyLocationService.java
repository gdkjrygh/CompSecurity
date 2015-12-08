// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.services;

import a.a.co;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.IBinder;
import com.appboy.f;
import com.appboy.f.a;

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
            com.appboy.f.a.b(a, "Null intent received. Initializing Appboy and restarting Appboy location service.");
            com.appboy.a.a(getApplicationContext());
            return 1;
        }
        String s = intent.getAction();
        if (s == null)
        {
            com.appboy.f.a.c(a, (new StringBuilder("Null intent action received in Appboy location service: ")).append(intent.getDataString()).toString());
            return 1;
        }
        if (s.contains((new StringBuilder()).append(getApplicationContext().getPackageName()).append(".INIT_APPBOY_LOCATION_SERVICE").toString()))
        {
            com.appboy.f.a.b(a, (new StringBuilder("Setting up Appboy location service: ")).append(intent.getAction()).toString());
            e = getApplicationContext().getPackageName();
            d = (LocationManager)getApplicationContext().getSystemService("location");
            c = new co(this);
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
            com.appboy.f.a.b(a, (new StringBuilder("Requesting background location updates: ")).append(intent.getAction()).toString());
            if (b == null)
            {
                com.appboy.f.a.b(a, "Could not request background location updates. Android location provider was null.");
                return 1;
            }
            float f1 = intent.getFloatExtra("distance", 50F);
            long l = intent.getLongExtra("time", 0x36ee80L);
            if (c != null)
            {
                d.requestLocationUpdates(b, l, f1, c);
                com.appboy.f.a.b(a, String.format("Collecting locations using %s provider with time interval %ds and update distance %.1fm.", new Object[] {
                    b, Long.valueOf(l / 1000L), Float.valueOf(f1)
                }));
                return 1;
            } else
            {
                com.appboy.f.a.c(a, "Could not request background location updates. Appboy location listener was null.");
                return 1;
            }
        }
        if (s.contains((new StringBuilder()).append(e).append(".REQUEST_REMOVE_APPBOY_LOCATION_UPDATES").toString()))
        {
            com.appboy.f.a.b(a, (new StringBuilder("Removing current location updates: ")).append(intent.getAction()).toString());
            b();
            return 1;
        } else
        {
            com.appboy.f.a.c(a, (new StringBuilder("Unknown intent received: ")).append(intent.getAction()).toString());
            return 1;
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, com/appboy/services/AppboyLocationService.getName()
        });
    }
}
