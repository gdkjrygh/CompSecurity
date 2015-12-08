// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.k;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.apps.unveil.sensors:
//            s

public final class w
    implements LocationListener
{

    public final af a;
    public final k b;
    public final LocationManager c;
    public Location d;
    public final Set e;
    private final Context f;

    public final boolean a()
    {
        return s.a(f) && s.b(f) != 1;
    }

    public final void b()
    {
        c.removeUpdates(this);
        for (Iterator iterator = e.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    public final void c()
    {
        d = null;
        for (Iterator iterator = e.iterator(); iterator.hasNext(); iterator.next()) { }
        b();
    }

    public final void onLocationChanged(Location location)
    {
        if (a())
        {
            a.b("Got a new location, but location is disabled, turning off.", new Object[0]);
            c();
        } else
        {
            if (d == null)
            {
                d = location;
            } else
            {
                d.set(location);
            }
            location = b.e();
            if (location != null)
            {
                d.set(location);
            }
            location = e.iterator();
            while (location.hasNext()) 
            {
                location.next();
            }
        }
    }

    public final void onProviderDisabled(String s1)
    {
    }

    public final void onProviderEnabled(String s1)
    {
    }

    public final void onStatusChanged(String s1, int i, Bundle bundle)
    {
    }
}
