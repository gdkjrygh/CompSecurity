// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.controls.RideSwitcherItem;
import me.lyft.android.controls.RideTypeSwitcher;
import me.lyft.android.domain.ride.PassengerRideRequest;
import me.lyft.android.domain.ride.Pricing;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.domain.ride.RideType;
import me.lyft.android.infrastructure.lyft.constants.RideTypeMeta;
import me.lyft.android.infrastructure.lyft.constants.Selector;
import me.lyft.android.ui.tooltips.TooltipContainerView;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView

class this._cls0
    implements Action1
{

    final PassengerRequestRideView this$0;

    public volatile void call(Object obj)
    {
        call((List)obj);
    }

    public void call(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        RequestRideType requestridetype;
        RideTypeMeta ridetypemeta;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); arraylist.add(new RideSwitcherItem(requestridetype.getId(), ridetypemeta.getSelector().getLabel(), ridetypemeta.getSelector().getActiveColor(), requestridetype.getPricing().isPrimeTime())))
        {
            requestridetype = (RequestRideType)iterator.next();
            ridetypemeta = constantsProvider.getRideTypeMetaById(requestridetype.getId());
        }

        if (rideTypeSwitcher.getThumbViewAt(0) != null && !rideRequestSession.getCurrentRideType().isCourier() && preferences.getRideRequest().getShowCourierPromoBanner().booleanValue() && list.size() > 0 && RideType.getInstance(((RequestRideType)list.get(0)).getId()).isCourier() && PassengerRequestRideView.access$6300(PassengerRequestRideView.this))
        {
            tooltipContainer.tryToShowAndMarkShown("courierPromo", rideTypeSwitcher.getThumbViewAt(0), 80);
            PassengerRequestRideView.access$6302(PassengerRequestRideView.this, false);
        }
        rideTypeSwitcher.setItems(arraylist);
        rideTypeSwitcher.animateThumbToItemId(rideRequestSession.getCurrentRideType().getId());
        if (rideRequestSession.getCurrentRideType().isCourier() && rideRequestSession.getCurrentRideType().isDefault().booleanValue() && !preferences.getShownModeDetails().contains(rideTypeSwitcher.getSelectedItemId()))
        {
            PassengerRequestRideView.access$5900(PassengerRequestRideView.this);
        }
    }

    a()
    {
        this$0 = PassengerRequestRideView.this;
        super();
    }
}
