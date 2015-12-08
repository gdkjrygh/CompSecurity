// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.rx.AsyncCall;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideInProgressView

class val.location extends AsyncCall
{

    final DriverRideInProgressView this$0;
    final Location val$location;

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Location)obj);
    }

    public void onSuccess(Location location1)
    {
        super.onSuccess(location1);
        Long long1 = constantsProvider.getConstants().getAutoNavigateDistanceThreshold();
        boolean flag;
        if (val$location.distanceTo(location1) > (double)long1.longValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            dialogFlow.queue(new Toast());
        }
    }

    Toast()
    {
        this$0 = final_driverrideinprogressview;
        val$location = Location.this;
        super();
    }
}
