// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.pickup;

import me.lyft.android.controls.SwitcherSelection;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2.pickup:
//            SetPickupView, RideTypeSwitcherPresenter

class this._cls0
    implements Action1
{

    final SetPickupView this$0;

    public volatile void call(Object obj)
    {
        call((SwitcherSelection)obj);
    }

    public void call(SwitcherSelection switcherselection)
    {
        rideTypeSwitcherController.setSelectedRideType(switcherselection);
    }

    Presenter()
    {
        this$0 = SetPickupView.this;
        super();
    }
}
