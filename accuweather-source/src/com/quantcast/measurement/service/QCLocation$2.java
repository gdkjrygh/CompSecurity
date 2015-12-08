// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

// Referenced classes of package com.quantcast.measurement.service:
//            QCLocation

class this._cls0
    implements LocationListener
{

    final QCLocation this$0;

    public void onLocationChanged(Location location)
    {
        QCLocation.access$300(QCLocation.this).removeUpdates(singleUpdateListener);
        if (location != null)
        {
            QCLocation.access$400(QCLocation.this, location);
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

    ()
    {
        this$0 = QCLocation.this;
        super();
    }
}
