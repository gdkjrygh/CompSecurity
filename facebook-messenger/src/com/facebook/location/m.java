// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.facebook.debug.log.b;

// Referenced classes of package com.facebook.location:
//            h, j, i

class m
    implements LocationListener
{

    final j a;

    private m(j j1)
    {
        a = j1;
        super();
    }

    m(j j1, i i)
    {
        this(j1);
    }

    public void onLocationChanged(Location location)
    {
        b.b(h.a(), "onLocationChanged: %s", new Object[] {
            h.a(a.a, location)
        });
        j.a(a, location);
    }

    public void onProviderDisabled(String s)
    {
        b.b(h.a(), (new StringBuilder()).append("onProviderDisabled: ").append(s).toString());
    }

    public void onProviderEnabled(String s)
    {
        b.b(h.a(), (new StringBuilder()).append("onProviderEnabled: ").append(s).toString());
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
        b.b(h.a(), (new StringBuilder()).append("onStatusChanged: ").append(s).toString());
    }
}
