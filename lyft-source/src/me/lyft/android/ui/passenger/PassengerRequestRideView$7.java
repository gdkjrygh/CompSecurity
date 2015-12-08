// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.domain.ride.RequestRideType;
import rx.functions.Func2;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView

class this._cls0
    implements Func2
{

    final PassengerRequestRideView this$0;

    public Boolean call(Boolean boolean1, RequestRideType requestridetype)
    {
        boolean flag;
        if (!requestridetype.isCourier() && boolean1.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj, Object obj1)
    {
        return call((Boolean)obj, (RequestRideType)obj1);
    }

    ()
    {
        this$0 = PassengerRequestRideView.this;
        super();
    }
}
