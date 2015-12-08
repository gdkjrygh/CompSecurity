// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.gps;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

// Referenced classes of package com.accuweather.android.services.gps:
//            NativeLocationFinder

private class <init>
    implements LocationListener
{

    final NativeLocationFinder this$0;

    public void onLocationChanged(Location location)
    {
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

    private ()
    {
        this$0 = NativeLocationFinder.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
