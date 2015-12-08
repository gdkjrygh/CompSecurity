// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverFollowLocationAndStopButton

class this._cls0
    implements Action1
{

    final DriverFollowLocationAndStopButton this$0;

    public void call(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            rideMap.followLocationAndFitToNextStop();
            return;
        } else
        {
            rideMap.unfollowCurrentLocation();
            return;
        }
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ()
    {
        this$0 = DriverFollowLocationAndStopButton.this;
        super();
    }
}
