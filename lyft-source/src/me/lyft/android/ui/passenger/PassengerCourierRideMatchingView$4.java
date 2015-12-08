// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.common.DialogFlow;
import me.lyft.android.controls.StandbySwitcher;
import me.lyft.android.domain.ride.FixedFare;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerCourierRideMatchingView

class this._cls0
    implements Action1
{

    final PassengerCourierRideMatchingView this$0;

    public volatile void call(Object obj)
    {
        call((me.lyft.android.controls.)obj);
    }

    public void call(me.lyft.android.controls. )
    {
        dialogFlow.show(new nDialog(.getFare()));
         = PassengerCourierRideMatchingView.access$300(PassengerCourierRideMatchingView.this).getFixedFareToken();
        standbySwitcher.animateThumbToItemId();
    }

    nDialog()
    {
        this$0 = PassengerCourierRideMatchingView.this;
        super();
    }
}
