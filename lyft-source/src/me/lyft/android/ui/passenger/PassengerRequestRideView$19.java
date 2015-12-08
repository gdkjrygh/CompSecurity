// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.analytics.studies.RideAnalytics;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.RideTypeSwitcher;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView

class this._cls0
    implements Action1
{

    final PassengerRequestRideView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        PassengerRequestRideView.access$5900(PassengerRequestRideView.this);
        RideAnalytics.trackRideTypeInfoTap(rideTypeSwitcher.getSelectedItemId());
    }

    ()
    {
        this$0 = PassengerRequestRideView.this;
        super();
    }
}
