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

public class PickupPlaceSearchView extends PlaceSearchView
{

    AppFlow appFlow;
    IPlaceSearchPresenter placeSearchPresenter;
    IRideRequestSession rideRequestSession;
    final PlaceSearchScreens.PickupPlaceSearch screen;

    public PickupPlaceSearchView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        screen = (PlaceSearchScreens.PickupPlaceSearch)context.a();
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

    protected void onPlaceSelected(Location location)
    {
        rideRequestSession.setPickupLocation(location);
        rideRequestSession.setRequestRideStep(screen.getNextRequestRideStep());
        appFlow.goBack();
    }
}
