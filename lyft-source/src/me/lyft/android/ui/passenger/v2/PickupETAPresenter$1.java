// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;

import me.lyft.android.domain.ride.RequestRideType;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2:
//            PickupETAPresenter

class this._cls0
    implements Action1
{

    final PickupETAPresenter this$0;

    public volatile void call(Object obj)
    {
        call((RequestRideType)obj);
    }

    public void call(RequestRideType requestridetype)
    {
        refreshPickupETA();
    }

    ()
    {
        this$0 = PickupETAPresenter.this;
        super();
    }
}
