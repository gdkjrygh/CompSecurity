// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.passenger;

import me.lyft.android.domain.ride.Stop;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.passenger:
//            PassengerRideProvider

final class 
    implements Func1
{

    public Boolean call(Stop stop)
    {
        return Boolean.valueOf(stop.isDropOff());
    }

    public volatile Object call(Object obj)
    {
        return call((Stop)obj);
    }

    ()
    {
    }
}
