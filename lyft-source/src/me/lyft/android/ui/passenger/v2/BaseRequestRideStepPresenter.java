// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;

import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.Presenter;
import me.lyft.android.ui.ride.RideMap;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

public abstract class BaseRequestRideStepPresenter extends Presenter
{

    private final IGeoService geoService;
    private final ILocationService locationService;
    private final Action1 onLastLocationFound = new Action1() {

        final BaseRequestRideStepPresenter this$0;

        public volatile void call(Object obj)
        {
            call((Location)obj);
        }

        public void call(Location location)
        {
            centerMapToLocation(location);
        }

            
            {
                this$0 = BaseRequestRideStepPresenter.this;
                super();
            }
    };
    private final Action1 onMapDragEnd = new Action1() {

        final BaseRequestRideStepPresenter this$0;

        public volatile void call(Object obj)
        {
            call((Location)obj);
        }

        public void call(Location location)
        {
            location.setSource("map");
            centerMapToLocation(location);
        }

            
            {
                this$0 = BaseRequestRideStepPresenter.this;
                super();
            }
    };
    private final Action1 onMapLoad = new Action1() {

        final BaseRequestRideStepPresenter this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            bind(rideMap.observeMapDragEnd(), onMapDragEnd);
            onMapLoaded();
        }

            
            {
                this$0 = BaseRequestRideStepPresenter.this;
                super();
            }
    };
    private final RideMap rideMap;

    public BaseRequestRideStepPresenter(RideMap ridemap, ILocationService ilocationservice, IGeoService igeoservice)
    {
        rideMap = ridemap;
        locationService = ilocationservice;
        geoService = igeoservice;
    }

    public void bindBottomPadding(Observable observable)
    {
        bind(observable, new Action1() {

            final BaseRequestRideStepPresenter this$0;

            public void call(Integer integer)
            {
                rideMap.setBottomPadding(integer.intValue());
            }

            public volatile void call(Object obj)
            {
                call((Integer)obj);
            }

            
            {
                this$0 = BaseRequestRideStepPresenter.this;
                super();
            }
        });
    }

    public void bindTopPadding(Observable observable)
    {
        bind(observable, new Action1() {

            final BaseRequestRideStepPresenter this$0;

            public void call(Integer integer)
            {
                rideMap.setTopPadding(integer.intValue());
            }

            public volatile void call(Object obj)
            {
                call((Integer)obj);
            }

            
            {
                this$0 = BaseRequestRideStepPresenter.this;
                super();
            }
        });
    }

    public final void centerMapToCurrentLocation()
    {
        bind(locationService.getLastLocation(), onLastLocationFound);
    }

    public final void centerMapToCurrentLocationAndIgnoreTheResults()
    {
        bind(locationService.getLastLocation(), new AsyncCall());
    }

    public final Observable centerMapToLocation(Location location)
    {
        Observable observable = rideMap.centerToLocationWithoutPadding(location);
        onLocationUpdate(location);
        return observable;
    }

    protected void onAttach()
    {
        bind(rideMap.observeMapLoaded(), onMapLoad);
        bindBottomPadding(((BaseRequestRideStepView)view).observeBottomContainerHeight());
        bindTopPadding(((BaseRequestRideStepView)view).observeTopContainerHeight());
    }

    public abstract void onLocationUpdate(Location location);

    public abstract void onMapLoaded();

    public final Observable reverseGeocode(Location location)
    {
        if (location.isNull())
        {
            return Observable.empty();
        }
        String s = location.getDisplayName();
        if (!Strings.isNullOrEmpty(s))
        {
            return Observable.just(s);
        } else
        {
            return geoService.reverseGeocode(location).map(new Func1() {

                final BaseRequestRideStepPresenter this$0;

                public volatile Object call(Object obj)
                {
                    return call((Location)obj);
                }

                public String call(Location location1)
                {
                    return location1.getDisplayName();
                }

            
            {
                this$0 = BaseRequestRideStepPresenter.this;
                super();
            }
            });
        }
    }



    private class BaseRequestRideStepView
        implements me.lyft.android.ui.Presenter.View
    {

        public abstract Observable observeBottomContainerHeight();

        public abstract Observable observeTopContainerHeight();
    }

}
