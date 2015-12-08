// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

// Referenced classes of package com.flurry.sdk:
//            fh, gd

class it>
    implements LocationListener
{

    final fh a;

    public void onLocationChanged(Location location)
    {
        if (location != null)
        {
            fh.a(a, location);
        }
        if (fh.c(a) >= 3)
        {
            gd.a(4, fh.f(), "Max location reports reached, stopping");
            fh.b(a);
        }
    }

    public void onProviderDisabled(String s)
    {
    }

    public void onProviderEnabled(String s)
    {
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
    }

    public ation(fh fh1)
    {
        a = fh1;
        super();
    }
}
