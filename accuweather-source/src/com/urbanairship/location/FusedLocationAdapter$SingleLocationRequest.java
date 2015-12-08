// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.LocationClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.urbanairship.Logger;

// Referenced classes of package com.urbanairship.location:
//            PendingLocationResult, FusedLocationAdapter, LocationRequestOptions

private class fusedLocationListener extends PendingLocationResult
{

    private LocationListener fusedLocationListener;
    private LocationRequest locationRequest;
    final FusedLocationAdapter this$0;

    protected void onCancel()
    {
        Logger.verbose("Fused location canceling single location request.");
        FusedLocationAdapter.access$000(FusedLocationAdapter.this).removeLocationUpdates(fusedLocationListener);
    }

    _cls1.val.this._cls0(LocationRequestOptions locationrequestoptions)
    {
        this.this$0 = FusedLocationAdapter.this;
        super();
        locationRequest = FusedLocationAdapter.access$100(FusedLocationAdapter.this, locationrequestoptions);
        locationRequest.setNumUpdates(1);
        fusedLocationListener = new LocationListener() {

            final FusedLocationAdapter.SingleLocationRequest this$1;
            final FusedLocationAdapter val$this$0;

            public void onLocationChanged(Location location)
            {
                setResult(location);
            }

            
            {
                this$1 = FusedLocationAdapter.SingleLocationRequest.this;
                this$0 = fusedlocationadapter;
                super();
            }
        };
        Logger.verbose("Fused location starting single location request.");
        FusedLocationAdapter.access$000(FusedLocationAdapter.this).requestLocationUpdates(locationRequest, fusedLocationListener, Looper.myLooper());
    }
}
