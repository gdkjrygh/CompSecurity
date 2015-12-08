// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            fw

final class fx
    implements LocationListener
{

    final LocationManager a;

    fx(LocationManager locationmanager)
    {
        a = locationmanager;
        super();
    }

    public void onLocationChanged(Location location)
    {
        fw.a(location);
        a.removeUpdates(this);
    }

    public void onProviderDisabled(String s)
    {
        a.removeUpdates(this);
    }

    public void onProviderEnabled(String s)
    {
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
        if (i != 2)
        {
            a.removeUpdates(this);
        }
    }
}
