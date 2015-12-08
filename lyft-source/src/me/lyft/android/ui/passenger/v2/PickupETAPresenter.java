// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;

import java.util.List;
import java.util.concurrent.TimeUnit;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.application.system.ILyftSystemRepository;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.domain.system.LyftSystem;
import me.lyft.android.events.AppStateUpdatedEvent;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.Presenter;
import rx.functions.Action1;

public class PickupETAPresenter extends Presenter
{

    private final Action1 appStateUpdate = new Action1() {

        final PickupETAPresenter this$0;

        public volatile void call(Object obj)
        {
            call((AppStateDTO)obj);
        }

        public void call(AppStateDTO appstatedto)
        {
            refreshPickupETA();
        }

            
            {
                this$0 = PickupETAPresenter.this;
                super();
            }
    };
    final MessageBus bus;
    final IGeoService geoService;
    private final Action1 onRequestRideTypeChange = new Action1() {

        final PickupETAPresenter this$0;

        public volatile void call(Object obj)
        {
            call((RequestRideType)obj);
        }

        public void call(RequestRideType requestridetype)
        {
            refreshPickupETA();
        }

            
            {
                this$0 = PickupETAPresenter.this;
                super();
            }
    };
    final IRideRequestSession rideRequestSession;
    final ILyftSystemRepository systemRepository;

    public PickupETAPresenter(MessageBus messagebus, IGeoService igeoservice, ILyftSystemRepository ilyftsystemrepository, IRideRequestSession iriderequestsession)
    {
        bus = messagebus;
        geoService = igeoservice;
        systemRepository = ilyftsystemrepository;
        rideRequestSession = iriderequestsession;
    }

    protected void onAttach()
    {
        bind(bus.observe(me/lyft/android/events/AppStateUpdatedEvent), appStateUpdate);
        bind(rideRequestSession.observeCurrentRideType(), onRequestRideTypeChange);
    }

    void refreshPickupETA()
    {
        final Object rideType = rideRequestSession.getCurrentRideType();
        me.lyft.android.domain.location.Location location = rideRequestSession.getPickupLocation();
        if (((RequestRideType) (rideType)).getDrivers().isEmpty())
        {
            rideType = systemRepository.getSystem().getShortMessage();
            if (!Strings.isNullOrEmpty(((String) (rideType))))
            {
                ((PickupETAView)view).setNoDriversAvailable(((String) (rideType)));
                return;
            } else
            {
                ((PickupETAView)view).setNoDriversAvailable();
                return;
            }
        } else
        {
            bind(geoService.getClosestDriverEta(location, ((RequestRideType) (rideType))), new AsyncCall() {

                final PickupETAPresenter this$0;
                final RequestRideType val$rideType;

                public void onFail(Throwable throwable)
                {
                    int i = rideType.getDrivers().size();
                    ((PickupETAView)
// JavaClassFileOutputException: get_constant: invalid tag

                public void onSuccess(Long long1)
                {
                    int i = 1;
                    int j = (int)TimeUnit.SECONDS.toMinutes(long1.longValue());
                    long1 = (PickupETAView)
// JavaClassFileOutputException: get_constant: invalid tag

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((Long)obj);
                }

            
            {
                this$0 = PickupETAPresenter.this;
                rideType = requestridetype;
                super();
            }
            });
            return;
        }
    }



    private class PickupETAView
        implements me.lyft.android.ui.Presenter.View
    {

        public abstract void setNoDriversAvailable();

        public abstract void setNoDriversAvailable(String s);

        public abstract void setPickupETA(int i);

        public abstract void setPickupNearbyDriverCount(int i);
    }

}
