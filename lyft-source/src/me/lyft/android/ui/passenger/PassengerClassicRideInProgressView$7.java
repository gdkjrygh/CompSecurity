// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.res.Resources;
import android.widget.TextView;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.domain.passenger.Driver;
import me.lyft.android.domain.passenger.PassengerRide;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerClassicRideInProgressView, RideInProgressBottomView

class this._cls0
    implements Action1
{

    final PassengerClassicRideInProgressView this$0;

    public volatile void call(Object obj)
    {
        call((Driver)obj);
    }

    public void call(Driver driver)
    {
        rideDetailsView.setDriver(passengerRideProvider.getPassengerRide().getDriver());
        driverNameTextView.setText(passengerRideProvider.getPassengerRide().getDriver().getName());
        driver = passengerRideProvider.getPassengerRide().getDriver().getRating();
        if (driver == null)
        {
            driver = getResources().getString(0x7f07020c);
        } else
        {
            driver = driver.toString();
        }
        driverRatingTextView.setText(driver);
    }

    ()
    {
        this$0 = PassengerClassicRideInProgressView.this;
        super();
    }
}
