// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.domain.ride.Passenger;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverOverflowMenuView

class this._cls0
    implements Func1
{

    final DriverOverflowMenuView this$0;

    public volatile Object call(Object obj)
    {
        return call((Passenger)obj);
    }

    public String call(Passenger passenger)
    {
        return passenger.getId();
    }

    ()
    {
        this$0 = DriverOverflowMenuView.this;
        super();
    }
}
