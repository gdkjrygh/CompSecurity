// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import android.content.Context;
import android.util.AttributeSet;
import com.lyft.scoop.Scoop;
import me.lyft.android.IUserSession;
import me.lyft.android.application.ride.IDriverRouteService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;
import me.lyft.android.infrastructure.lyft.location.NullLocationDTO;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.utils.Navigator;
import rx.Observable;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceSearchView, IPlaceSearchPresenter

public class DriverSetDropoffSearchView extends PlaceSearchView
{

    AppFlow appFlow;
    private Binder binder;
    IDriverRouteService driverRouteService;
    Navigator navigator;
    private final PlaceSearchScreens.DriverSetDropoffSearch params;
    IPlaceSearchPresenter placeSearchPresenter;
    IProgressController progressController;
    IUserSession userSession;

    public DriverSetDropoffSearchView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (PlaceSearchScreens.DriverSetDropoffSearch)context.a();
    }

    protected int getHintId()
    {
        return 0x7f0702ac;
    }

    protected Observable getInitialPlaces()
    {
        return placeSearchPresenter.observeDriverDropoffPlacesSuggestions();
    }

    protected String getInitialQuery()
    {
        Object obj = userSession.getRide();
        if (obj != null)
        {
            obj = ((RideDTO) (obj)).getDropoffLocation();
        } else
        {
            obj = null;
        }
        return (String)Objects.firstNonNull(((LocationDTO)Objects.firstNonNull(obj, NullLocationDTO.getInstance())).getAddress(), "");
    }

    protected int getInputIconId()
    {
        return 0x7f02016f;
    }

    protected String getSourceForAnalytics()
    {
        return "destination";
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
    }

    protected void onPlaceSelected(final Location location)
    {
        progressController.showProgress();
        binder.bind(driverRouteService.setDropoff(location), new AsyncCall() {

            final DriverSetDropoffSearchView this$0;
            final Location val$location;

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                if (params.isForwardToNavigation())
                {
                    navigator.navigate(location);
                }
                appFlow.goBack();
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = DriverSetDropoffSearchView.this;
                location = location1;
                super();
            }
        });
    }

}
