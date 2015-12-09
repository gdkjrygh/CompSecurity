// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import com.jcp.c.b;
import com.jcp.e.f;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.jcp.util:
//            ak, al, am, an

public class aj extends b
    implements LocationListener
{

    private LocationManager a;
    private Location b;
    private boolean c;
    private Handler d;
    private Runnable e;

    public aj(Activity activity)
    {
        d = new Handler();
        e = new ak(this);
        a(activity);
        a = (LocationManager)activity.getSystemService("location");
    }

    public static Address a(Context context, String s)
    {
        context = new Geocoder(context, Locale.ENGLISH);
        context = context.getFromLocationName(s, 1);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (context.isEmpty())
        {
            return null;
        }
        try
        {
            context = (Address)context.get(0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            context = null;
        }
        return context;
        return null;
    }

    static f a(aj aj1)
    {
        return aj1.c();
    }

    static f b(aj aj1)
    {
        return aj1.c();
    }

    static Runnable c(aj aj1)
    {
        return aj1.e;
    }

    static Handler d(aj aj1)
    {
        return aj1.d;
    }

    static f e(aj aj1)
    {
        return aj1.c();
    }

    static f f(aj aj1)
    {
        return aj1.c();
    }

    static f g(aj aj1)
    {
        return aj1.c();
    }

    static f h(aj aj1)
    {
        return aj1.c();
    }

    public void a()
    {
        boolean flag = a.isProviderEnabled("gps");
        if (!a.isProviderEnabled("network") && !flag)
        {
            e();
            return;
        } else
        {
            a.requestLocationUpdates("gps", 1L, 0.1F, this);
            a.requestLocationUpdates("network", 1L, 0.1F, this);
            d.removeCallbacks(e);
            d.postDelayed(e, 10000L);
            return;
        }
    }

    public void a(an an1)
    {
        a(((f) (an1)));
    }

    public void d()
    {
        a.removeUpdates(this);
    }

    public void e()
    {
        Object obj = new android.app.AlertDialog.Builder(b());
        ((android.app.AlertDialog.Builder) (obj)).setTitle(0x7f07003f);
        ((android.app.AlertDialog.Builder) (obj)).setMessage(0x7f07027a);
        ((android.app.AlertDialog.Builder) (obj)).setNegativeButton(0x7f070049, new al(this));
        obj = ((android.app.AlertDialog.Builder) (obj)).create();
        ((AlertDialog) (obj)).setOnKeyListener(new am(this));
        ((AlertDialog) (obj)).show();
    }

    public void onLocationChanged(Location location)
    {
        if (location != null && b == null)
        {
            d.removeCallbacks(e);
            a.removeUpdates(this);
            b = location;
            if (c() != null)
            {
                ((an)c()).a(b);
                return;
            }
        }
    }

    public void onProviderDisabled(String s)
    {
        c = false;
    }

    public void onProviderEnabled(String s)
    {
        c = true;
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
    }
}
