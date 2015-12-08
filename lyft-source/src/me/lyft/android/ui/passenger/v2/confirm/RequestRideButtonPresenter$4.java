// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.confirm;

import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2.confirm:
//            RequestRideButtonPresenter

class this._cls0
    implements Action1
{

    final RequestRideButtonPresenter this$0;

    public volatile void call(Object obj)
    {
        call((me.lyft.android.ui.passenger.w.RequestType)obj);
    }

    public void call(me.lyft.android.ui.passenger.w.RequestType requesttype)
    {
        switch (.SwitchMap.me.lyft.android.ui.passenger.PrimeTimeRequestRideDialogView.RequestType[requesttype.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            requestRide(false);
            return;

        case 2: // '\002'
            rideRequestSession.setCurrentRideTypeById("courier");
            break;
        }
        requestRidePresenterV2.showPickupStep();
    }

    pe()
    {
        this$0 = RequestRideButtonPresenter.this;
        super();
    }
}
