// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.domain.passenger.Driver;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.ui.PassengerPhotoView;

// Referenced classes of package me.lyft.android.ui.passenger:
//            DriverPhotoView

public class RideInProgressBottomView extends FrameLayout
{

    DriverPhotoView driverPhotoView;
    ViewGroup rideDetailsView;

    public RideInProgressBottomView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).a(getContext()).inflate(0x7f0300d6, this, true);
        ButterKnife.a(this);
    }

    private void addPassengerDetailView(Passenger passenger)
    {
        passenger = PassengerPhotoView.forPassenger(passenger, getContext());
        rideDetailsView.addView(passenger);
    }

    public void setDriver(Driver driver)
    {
        driverPhotoView.setDriver(driver);
    }

    public void setPassengers(List list)
    {
        rideDetailsView.removeAllViews();
        for (list = list.iterator(); list.hasNext(); addPassengerDetailView((Passenger)list.next())) { }
    }
}
