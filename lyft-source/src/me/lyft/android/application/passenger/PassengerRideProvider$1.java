// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.passenger;

import me.lyft.android.common.Objects;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.Stop;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.passenger:
//            PassengerRideProvider

final class val.passengerId
    implements Func1
{

    final String val$passengerId;

    public Boolean call(Stop stop)
    {
        return Boolean.valueOf(Objects.equals(val$passengerId, stop.getPassenger().getId()));
    }

    public volatile Object call(Object obj)
    {
        return call((Stop)obj);
    }

    ()
    {
        val$passengerId = s;
        super();
    }
}
