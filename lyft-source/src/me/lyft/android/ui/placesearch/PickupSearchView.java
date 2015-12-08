// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import android.content.Context;
import android.util.AttributeSet;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.AppFlow;
import me.lyft.android.domain.location.Location;
import rx.Observable;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceSearchView, IPlaceSearchPresenter

public class PickupSearchView extends PlaceSearchView
{

    AppFlow appFlow;
    IPlaceSearchPresenter placeSearchPresenter;
    IRideRequestSession rideRequestSession;

    public PickupSearchView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected int getHintId()
    {
        return 0x7f0702ae;
    }

    protected Observable getInitialPlaces()
    {
        return placeSearchPresenter.observePickupPlacesSuggestions();
    }

    protected String getInitialQuery()
    {
        return rideRequestSession.getPickupLocation().getAddress();
    }

    protected int getInputIconId()
    {
        return 0x7f020170;
    }

    protected String getSourceForAnalytics()
    {
        return "pickup";
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
    }

    protected void onPlaceSelected(Location location)
    {
        rideRequestSession.setPickupLocation(location);
        if (rideRequestSession.getRideStep() == me.lyft.android.domain.ride.PassengerRideRequest.RideStep.SET_PICKUP)
        {
            rideRequestSession.setRideStep(me.lyft.android.domain.ride.PassengerRideRequest.RideStep.SET_DROPOFF);
        }
        appFlow.goBack();
    }
}
