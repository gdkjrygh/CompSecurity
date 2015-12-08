// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.ride.RideStatus;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            StandbyConfirmationDialogView

class this._cls0
    implements Action1
{

    final StandbyConfirmationDialogView this$0;

    public volatile void call(Object obj)
    {
        call((AppStateDTO)obj);
    }

    public void call(AppStateDTO appstatedto)
    {
        if (!passengerRideProvider.getPassengerRide().getStatus().isPending())
        {
            dialogFlow.dismiss(me/lyft/android/ui/passenger/PassengerDialogs$StandbyConfirmationDialog);
        }
    }

    tionDialog()
    {
        this$0 = StandbyConfirmationDialogView.this;
        super();
    }
}
