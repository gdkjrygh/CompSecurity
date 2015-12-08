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
import com.appboy.a;
import com.appboy.d;

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
            com.appboy.a.a(getApplicationContext());
        } else
        {
            String s = intent.getAction();
            if (s == null)
            {
                (new StringBuilder("Null intent action received in Appboy location service: ")).append(intent.getDataString());
                return 1;
            }
            if (s.contains((new StringBuilder()).append(getApplicationContext().getPackageName()).append(".INIT_APPBOY_LOCATION_SERVICE").toString()))
            {
                (new StringBuilder("Setting up Appboy location service: ")).append(intent.getAction());
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
                (new StringBuilder("Requesting background location updates: ")).append(intent.getAction());
                if (b != null)
                {
                    float f = intent.getFloatExtra("distance", 50F);
                    long l = intent.getLongExtra("time", 0x36ee80L);
                    if (c != null)
                    {
                        d.requestLocationUpdates(b, l, f, c);
                        String.format("Collecting locations using %s provider with time interval %ds and update distance %.1fm.", new Object[] {
                            b, Long.valueOf(l / 1000L), Float.valueOf(f)
                        });
                        return 1;
                    }
                }
            } else
            if (s.contains((new StringBuilder()).append(e).append(".REQUEST_REMOVE_APPBOY_LOCATION_UPDATES").toString()))
            {
                (new StringBuilder("Removing current location updates: ")).append(intent.getAction());
                b();
                return 1;
            } else
            {
                (new StringBuilder("Unknown intent received: ")).append(intent.getAction());
                return 1;
            }
        }
        return 1;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, com/appboy/services/AppboyLocationService.getName()
        });
    }
}
