// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.services.impl;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.utils.Logger;

// Referenced classes of package com.digby.mm.android.library.services.impl:
//            BootCompleteService

class this._cls0
    implements LocationListener
{

    final BootCompleteService this$0;

    public void onLocationChanged(Location location)
    {
        try
        {
            Logger.Debug("Got fresh location!!", BootCompleteService.this);
            Logger.Debug("BootCompleteService_onLocationChanged: removing location updates", BootCompleteService.this);
            BootCompleteService.access$100(BootCompleteService.this).removeUpdates(this);
            DigbyController.getInstance(BootCompleteService.this).startLocationServices();
            stopSelf();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            Logger.Error("MyLocationListener_onLocationChanged", location);
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
        this$0 = BootCompleteService.this;
        super();
    }
}
