// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.pickup;

import java.util.List;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.analytics.studies.RideAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.controls.RideSwitcherItem;
import me.lyft.android.controls.RideTypeSwitcherMapper;
import me.lyft.android.controls.SwitcherSelection;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.domain.ride.RideType;
import me.lyft.android.infrastructure.lyft.constants.Popup;
import me.lyft.android.infrastructure.lyft.constants.RideTypeMeta;
import me.lyft.android.ui.Presenter;
import me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2;
import me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter;
import rx.functions.Action1;

public class RideTypeSwitcherPresenter extends Presenter
{

    final IConstantsProvider constantsProvider;
    private final Action1 onRideTypesChange = new Action1() {

        final RideTypeSwitcherPresenter this$0;

        public volatile void call(Object obj)
        {
            call((List)obj);
        }

        public void call(List list)
        {
            RequestRideType requestridetype = rideRequestSession.getCurrentRideType();
            list = RideTypeSwitcherMapper.mapToRideSwitcherItem(list, constantsProvider.getRideTypeMetas());
            ((RideTypeSwitcherView)mapToRideSwitcherItem).setRideTypeSwitcherItems(list);
            ((RideTypeSwitcherView)mapToRideSwitcherItem).setRideType(requestridetype.getId(), true);
            if (shouldShowCourierHintBanner(requestridetype, list))
            {
                boolean flag = ((RideTypeSwitcherView)mapToRideSwitcherItem).showCourierTooltip();
                list = rideRequestSession;
                if (!flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                list.setShouldShowCourierPromoBanner(flag);
            }
        }

            
            {
                this$0 = RideTypeSwitcherPresenter.this;
                super();
            }

        private class RideTypeSwitcherView
            implements me.lyft.android.ui.Presenter.View
        {

            public abstract void setRideType(String s, boolean flag);

            public abstract void setRideTypeSwitcherItems(List list);

            public abstract boolean showCourierTooltip();
        }

    };
    final PassengerRequestRidePresenterV2 passengerRequestRidePresenter;
    final ILyftPreferences preferences;
    final IRequestRideTypeProvider requestRideTypeProvider;
    final IRideRequestSession rideRequestSession;
    final PassengerRequestRideRouter router;

    public RideTypeSwitcherPresenter(IRideRequestSession iriderequestsession, IRequestRideTypeProvider irequestridetypeprovider, IConstantsProvider iconstantsprovider, PassengerRequestRidePresenterV2 passengerrequestridepresenterv2, ILyftPreferences ilyftpreferences, PassengerRequestRideRouter passengerrequestriderouter)
    {
        rideRequestSession = iriderequestsession;
        requestRideTypeProvider = irequestridetypeprovider;
        constantsProvider = iconstantsprovider;
        passengerRequestRidePresenter = passengerrequestridepresenterv2;
        preferences = ilyftpreferences;
        router = passengerrequestriderouter;
    }

    private boolean shouldForcePopup(RequestRideType requestridetype)
    {
        Set set = preferences.getShownModeDetails();
        return constantsProvider.getRideTypeMetaById(requestridetype.getId()).getPopup().getShowOnFirstSelection().booleanValue() && !set.contains(requestridetype.getId());
    }

    private boolean shouldShowCourierHintBanner(RequestRideType requestridetype, List list)
    {
        boolean flag1 = requestridetype.isCourier();
        boolean flag;
        if (!list.isEmpty() && RideType.getInstance(((RideSwitcherItem)list.get(0)).getId()).isCourier())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return rideRequestSession.getShouldShowCourierPromoBanner() && !flag1 && flag;
    }

    private void showRideTypeInfoDialog(RequestRideType requestridetype)
    {
        Set set;
        if (requestridetype.isCourier())
        {
            router.showCourierRideTypeInfoDialog();
        } else
        {
            router.showRideTypeInfoDialog(requestridetype.getId());
        }
        set = preferences.getShownModeDetails();
        set.add(requestridetype.getId());
        preferences.setShownModeDetails(set);
    }

    protected void onAttach()
    {
        bind(requestRideTypeProvider.observeRideTypes(), onRideTypesChange);
    }

    public void onThumbClick()
    {
        showRideTypeInfoDialog(rideRequestSession.getCurrentRideType());
    }

    public void setSelectedRideType(SwitcherSelection switcherselection)
    {
        rideRequestSession.setCurrentRideTypeById(((RideSwitcherItem)switcherselection.getSwitcherItem()).getId());
        RequestRideType requestridetype = rideRequestSession.getCurrentRideType();
        if (shouldForcePopup(requestridetype))
        {
            showRideTypeInfoDialog(requestridetype);
        }
        if (switcherselection.isUserAction())
        {
            RideAnalytics.trackSetRideType(((RideSwitcherItem)switcherselection.getSwitcherItem()).getId());
            passengerRequestRidePresenter.reset();
        }
    }




}
