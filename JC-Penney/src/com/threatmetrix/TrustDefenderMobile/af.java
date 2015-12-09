// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.location.Location;
import android.location.LocationManager;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            ae

class af
{

    private static final String a = com/threatmetrix/TrustDefenderMobile/af.getName();
    private Location b;
    private LocationManager c;
    private ae d;
    private boolean e;

    af()
    {
        e = false;
    }

    private boolean c()
    {
        return c != null && d != null;
    }

    public final void a()
    {
        if (c())
        {
            c.removeUpdates(d);
        }
    }

    public final Location b()
    {
        Location location1 = b;
        Location location = location1;
        if (location1 == null)
        {
            location = location1;
            if (d != null)
            {
                location = d.a();
            }
        }
        return location;
    }

}
