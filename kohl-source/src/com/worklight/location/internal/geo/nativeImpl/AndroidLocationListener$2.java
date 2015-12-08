// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo.nativeImpl;

import android.location.LocationManager;
import android.os.Looper;
import com.worklight.location.api.geo.WLGeoAcquisitionPolicy;

// Referenced classes of package com.worklight.location.internal.geo.nativeImpl:
//            AndroidLocationListener

class val.singleAcquisition
    implements Runnable
{

    final AndroidLocationListener this$0;
    final boolean val$singleAcquisition;

    public void run()
    {
        if (val$singleAcquisition)
        {
            locationManager.requestSingleUpdate(AndroidLocationListener.access$000(AndroidLocationListener.this), AndroidLocationListener.this, Looper.myLooper());
            return;
        } else
        {
            locationManager.requestLocationUpdates(AndroidLocationListener.access$000(AndroidLocationListener.this), AndroidLocationListener.access$100(AndroidLocationListener.this).getMinChangeTime(), AndroidLocationListener.access$100(AndroidLocationListener.this).getMinChangeDistance(), AndroidLocationListener.this);
            return;
        }
    }

    ()
    {
        this$0 = final_androidlocationlistener;
        val$singleAcquisition = Z.this;
        super();
    }
}
