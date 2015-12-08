// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import me.lyft.android.analytics.studies.RideAnalytics;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView

class this._cls0
    implements Action1
{

    final PassengerRequestRideView this$0;

    public void call(View view)
    {
        RideAnalytics.trackTapSetDestination();
        PassengerRequestRideView.access$6100(PassengerRequestRideView.this);
    }

    public volatile void call(Object obj)
    {
        call((View)obj);
    }

    ()
    {
        this$0 = PassengerRequestRideView.this;
        super();
    }
}
