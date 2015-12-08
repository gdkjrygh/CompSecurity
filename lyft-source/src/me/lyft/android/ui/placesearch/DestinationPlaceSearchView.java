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

public class DestinationPlaceSearchView extends PlaceSearchView
{

    AppFlow appFlow;
    IPlaceSearchPresenter placeSearchPresenter;
    IRideRequestSession rideRequestSession;
    final PlaceSearchScreens.DestinationPlaceSearch screen;

    public DestinationPlaceSearchView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        screen = (PlaceSearchScreens.DestinationPlaceSearch)context.a();
    }

    protected int getHintId()
    {
        return 0x7f0702ac;
    }

    protected Observable getInitialPlaces()
    {
        return placeSearchPresenter.observeUserDropoffPlacesSuggestions();
    }

    protected String getInitialQuery()
    {
        return rideRequestSession.getDropoffLocation().getAddress();
    }

    protected int getInputIconId()
    {
        return 0x7f02016f;
    }

    protected String getSourceForAnalytics()
    {
        return "destination";
    }

    protected void onPlaceSelected(Location location)
    {
        rideRequestSession.setDropoffLocation(location);
        rideRequestSession.setRequestRideStep(screen.getNextRequestRideStep());
        appFlow.goBack();
    }
}
