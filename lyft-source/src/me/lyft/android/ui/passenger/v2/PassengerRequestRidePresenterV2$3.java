// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;

import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2:
//            PassengerRequestRidePresenterV2

class this._cls0
    implements Action1
{

    final PassengerRequestRidePresenterV2 this$0;

    public volatile void call(Object obj)
    {
        call((me.lyft.android.domain.ride.ep)obj);
    }

    public void call(me.lyft.android.domain.ride.ep ep)
    {
        ((questRideViewV2)PassengerRequestRidePresenterV2.access$000(PassengerRequestRidePresenterV2.this)).showStep(ep);
    }

    questRideViewV2()
    {
        this$0 = PassengerRequestRidePresenterV2.this;
        super();
    }
}
