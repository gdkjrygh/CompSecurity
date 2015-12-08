// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import android.content.Context;
import android.util.AttributeSet;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IPassengerRideService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import rx.Observable;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceSearchView, IPlaceSearchPresenter

public class PassengerSetDropoffSearchView extends PlaceSearchView
{

    AppFlow appFlow;
    private Binder binder;
    IPassengerRideProvider passengerRideProvider;
    IPassengerRideService passengerRideService;
    IPlaceSearchPresenter placeSearchPresenter;
    IProgressController progressController;
    IViewErrorHandler viewErrorHandler;

    public PassengerSetDropoffSearchView(Context context, AttributeSet attributeset)
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
        return passengerRideProvider.getPassengerRide().getDropoff().getAddress();
    }

    protected int getInputIconId()
    {
        return 0x7f02016f;
    }

    protected String getSourceForAnalytics()
    {
        return "destiny";
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
    }

    protected void onPlaceSelected(Location location)
    {
        progressController.showProgress();
        binder.bind(passengerRideService.setDropoff(location), new AsyncCall() {

            final PassengerSetDropoffSearchView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                viewErrorHandler.handle(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                appFlow.goBack();
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = PassengerSetDropoffSearchView.this;
                super();
            }
        });
    }
}
