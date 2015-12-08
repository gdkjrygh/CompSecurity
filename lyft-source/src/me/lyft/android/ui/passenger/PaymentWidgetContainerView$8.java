// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import java.util.List;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.RequestRideType;
import rx.functions.Func3;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PaymentWidgetContainerView

class this._cls0
    implements Func3
{

    final PaymentWidgetContainerView this$0;

    public Boolean call(List list, Boolean boolean1, Location location)
    {
        boolean flag;
        if (!boolean1.booleanValue() && !list.isEmpty() && rideRequestSession.getCurrentRideType().isCourier() && !location.isNull())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj, Object obj1, Object obj2)
    {
        return call((List)obj, (Boolean)obj1, (Location)obj2);
    }

    ()
    {
        this$0 = PaymentWidgetContainerView.this;
        super();
    }
}
