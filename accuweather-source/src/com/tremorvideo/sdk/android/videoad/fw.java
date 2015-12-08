// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            fx, ct

public final class fw
{

    public static double a = 0.0D;
    public static double b = 0.0D;
    private static boolean c = false;

    public static void a(Context context)
    {
        if (!c)
        {
            c = true;
            if (a() || b())
            {
                context = (LocationManager)context.getSystemService("location");
                fx fx1 = new fx(context);
                if (a())
                {
                    if (!a("gps", ((LocationManager) (context)), ((LocationListener) (fx1))) && !a("network", ((LocationManager) (context)), ((LocationListener) (fx1))))
                    {
                        b(context.getLastKnownLocation("gps"));
                    }
                } else
                if (!a("network", ((LocationManager) (context)), ((LocationListener) (fx1))))
                {
                    b(context.getLastKnownLocation("network"));
                    return;
                }
            }
        }
    }

    static void a(Location location)
    {
        b(location);
    }

    private static boolean a()
    {
        return ct.a("android.permission.ACCESS_FINE_LOCATION");
    }

    private static boolean a(String s, LocationManager locationmanager, LocationListener locationlistener)
    {
        if (!locationmanager.isProviderEnabled(s))
        {
            return false;
        } else
        {
            b(locationmanager.getLastKnownLocation(s));
            locationmanager.requestLocationUpdates(s, 0L, 0.0F, locationlistener);
            return true;
        }
    }

    private static void b(Location location)
    {
        if (location != null)
        {
            a = location.getLatitude();
            b = location.getLongitude();
        }
    }

    private static boolean b()
    {
        return ct.a("android.permission.ACCESS_COARSE_LOCATION");
    }

}
