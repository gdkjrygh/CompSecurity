// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.passenger;

import me.lyft.android.domain.ride.Passenger;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.domain.passenger:
//            PassengerRide

class this._cls0
    implements Func1
{

    final PassengerRide this$0;

    public Boolean call(Passenger passenger)
    {
        return Boolean.valueOf(passenger.isSelf());
    }

    public volatile Object call(Object obj)
    {
        return call((Passenger)obj);
    }

    ()
    {
        this$0 = PassengerRide.this;
        super();
    }
}
