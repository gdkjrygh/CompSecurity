// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import rx.functions.Func1;

// Referenced classes of package me.lyft.android.domain.ride:
//            DriverRide, Passenger

class this._cls0
    implements Func1
{

    final DriverRide this$0;

    public Boolean call(Passenger passenger)
    {
        boolean flag;
        if (!passenger.isDroppedoff())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj)
    {
        return call((Passenger)obj);
    }

    ()
    {
        this$0 = DriverRide.this;
        super();
    }
}
