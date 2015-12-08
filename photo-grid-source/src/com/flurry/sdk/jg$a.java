// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

// Referenced classes of package com.flurry.sdk:
//            jg, kc

class it>
    implements LocationListener
{

    final jg a;

    public void onLocationChanged(Location location)
    {
        if (location != null)
        {
            jg.a(a, location);
        }
        if (jg.c(a) >= 3)
        {
            kc.a(4, jg.f(), "Max location reports reached, stopping");
            jg.b(a);
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

    public ation(jg jg1)
    {
        a = jg1;
        super();
    }
}
