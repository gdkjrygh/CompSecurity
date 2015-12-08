// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.passenger.PassengerRide;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRideOverflowMenuView

class this._cls0
    implements Action1
{

    final PassengerRideOverflowMenuView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        PassengerRideOverflowMenuView.access$200(PassengerRideOverflowMenuView.this);
        if (!Objects.equals(PassengerRideOverflowMenuView.access$300(PassengerRideOverflowMenuView.this), passengerRideProvider.getPassengerRide().getStatus()))
        {
            dialogFlow.dismiss(me/lyft/android/ui/passenger/PassengerDialogs$PassengerRideOverflowMenuScreen);
        }
    }

    erflowMenuScreen()
    {
        this$0 = PassengerRideOverflowMenuView.this;
        super();
    }
}
