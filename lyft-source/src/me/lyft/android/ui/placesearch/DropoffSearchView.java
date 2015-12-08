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
import me.lyft.android.features.FeatureFlag;
import me.lyft.android.features.Features;
import rx.Observable;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceSearchView, IPlaceSearchPresenter

public class DropoffSearchView extends PlaceSearchView
{

    AppFlow appFlow;
    IPlaceSearchPresenter placeSearchPresenter;
    IRideRequestSession rideRequestSession;

    public DropoffSearchView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
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
        if (!Features.CONFIRMATION_FLOW.isEnabled())
        {
            updateRideStep();
        } else
        {
            updateRequestRideStepForNewConfirmationFlow();
        }
        appFlow.goBack();
    }

    void updateRequestRideStepForNewConfirmationFlow()
    {
        class _cls1
        {

            static final int $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RequestRideStep[];
            static final int $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RideStep[];

            static 
            {
                $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RequestRideStep = new int[me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.values().length];
                try
                {
                    $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RequestRideStep[me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.SET_DROPOFF.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RequestRideStep[me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.CONFIRM_REQUEST.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RideStep = new int[me.lyft.android.domain.ride.PassengerRideRequest.RideStep.values().length];
                try
                {
                    $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RideStep[me.lyft.android.domain.ride.PassengerRideRequest.RideStep.SET_DROPOFF.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep[rideRequestSession.getRequestRideStep().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            rideRequestSession.setRequestRideStep(me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.CONFIRM_REQUEST_WITH_DESTINATION);
            break;
        }
    }

    void updateRideStep()
    {
        switch (_cls1..SwitchMap.me.lyft.android.domain.ride.PassengerRideRequest.RideStep[rideRequestSession.getRideStep().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            rideRequestSession.setRideStep(me.lyft.android.domain.ride.PassengerRideRequest.RideStep.CONFIRM_REQUEST);
            break;
        }
    }
}
