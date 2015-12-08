// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import rx.functions.Func1;

// Referenced classes of package me.lyft.android.domain.ride:
//            DriverRide, Stop

class this._cls0
    implements Func1
{

    final DriverRide this$0;

    public Boolean call(Stop stop)
    {
        return Boolean.valueOf(stop.isPickup());
    }

    public volatile Object call(Object obj)
    {
        return call((Stop)obj);
    }

    ()
    {
        this$0 = DriverRide.this;
        super();
    }
}
