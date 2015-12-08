// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.ride.RideStatus;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerCancelRideDialogView

class this._cls0
    implements Action1
{

    final PassengerCancelRideDialogView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        if (!Objects.equals(passengerRideProvider.getPassengerRide().getStatus().getStatus(), PassengerCancelRideDialogView.access$100(PassengerCancelRideDialogView.this).getStatus()))
        {
            dialogFlow.dismiss(me/lyft/android/ui/passenger/PassengerDialogs$PassengerCancelRideDialog);
        }
        PassengerCancelRideDialogView.access$200(PassengerCancelRideDialogView.this);
        PassengerCancelRideDialogView.access$300(PassengerCancelRideDialogView.this);
    }

    RideDialog()
    {
        this$0 = PassengerCancelRideDialogView.this;
        super();
    }
}
