// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView

class this._cls0
    implements Func1
{

    final PassengerRequestRideView this$0;

    public Boolean call(me.lyft.android.domain.ride.ep ep)
    {
        boolean flag;
        if (ep == me.lyft.android.domain.ride.ep.CONFIRM_REQUEST)
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
        return call((me.lyft.android.domain.ride.ep)obj);
    }

    p()
    {
        this$0 = PassengerRequestRideView.this;
        super();
    }
}
