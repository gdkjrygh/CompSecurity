// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.widget.Button;
import me.lyft.android.analytics.studies.RideAnalytics;
import me.lyft.android.common.Objects;
import me.lyft.android.controls.RideSwitcherItem;
import me.lyft.android.controls.RideTypeSwitcher;
import me.lyft.android.controls.SwitcherSelection;
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
        call((SwitcherSelection)obj);
    }

    public void call(SwitcherSelection switcherselection)
    {
        switcherselection = (RideSwitcherItem)switcherselection.getSwitcherItem();
        if (Objects.equals(((RideSwitcherItem)rideTypeSwitcher.getSelectedItem()).getId(), "courier"))
        {
            tooltipContainer.hideAll();
        }
        Button button = pickupTime;
        int i;
        if (Objects.equals(((RideSwitcherItem)rideTypeSwitcher.getSelectedItem()).getId(), "chauffeur"))
        {
            i = 0;
        } else
        {
            i = 8;
        }
        button.setVisibility(i);
        RideAnalytics.trackRideTypeSwitch(switcherselection.getId());
        PassengerRequestRideView.access$5800(PassengerRequestRideView.this);
    }

    ()
    {
        this$0 = PassengerRequestRideView.this;
        super();
    }
}
