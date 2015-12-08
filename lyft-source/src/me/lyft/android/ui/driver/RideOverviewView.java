// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.rx.Binder;
import me.lyft.android.utils.Navigator;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            RideOverviewPartyItem, RideOverviewRouteItem

public class RideOverviewView extends LinearLayout
{

    AppFlow appFlow;
    DialogFlow dialogFlow;
    Navigator navigator;
    LinearLayout partyContainer;
    TextView poorConnectionBanner;
    LinearLayout routContainer;
    IDriverRideProvider routeProvider;
    private DriverScreens.RideOverviewScreen screen;
    Toolbar toolbar;

    public RideOverviewView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        screen = (DriverScreens.RideOverviewScreen)context.a();
    }

    private void updatePartyView()
    {
        partyContainer.removeAllViews();
        RideOverviewPartyItem rideoverviewpartyitem;
        for (Iterator iterator = routeProvider.getDriverRide().getAllPassengers().iterator(); iterator.hasNext(); partyContainer.addView(rideoverviewpartyitem))
        {
            final Passenger passenger = (Passenger)iterator.next();
            rideoverviewpartyitem = new RideOverviewPartyItem(getContext());
            rideoverviewpartyitem.setPartyFirstName(passenger.getFirstName());
            rideoverviewpartyitem.setPartyProfilePhoto(passenger.getPhotoUrl());
            rideoverviewpartyitem.setCallPassengerButtonAction(new android.view.View.OnClickListener() {

                final RideOverviewView this$0;
                final Passenger val$passenger;

                public void onClick(View view)
                {
                    dialogFlow.show(new DriverDialogs.CallConfirmationDialog(passenger));
                }

            
            {
                this$0 = RideOverviewView.this;
                passenger = passenger1;
                super();
            }
            });
            rideoverviewpartyitem.setPartySize(Integer.valueOf(passenger.getPartySize()));
            rideoverviewpartyitem.setCallEnabled();
        }

    }

    private void updateRouteView()
    {
        routContainer.removeAllViews();
        DriverRide driverride = routeProvider.getDriverRide();
        Object obj;
        for (Iterator iterator = driverride.getAllStops().iterator(); iterator.hasNext(); routContainer.addView(((View) (obj))))
        {
            obj = (Stop)iterator.next();
            obj = new RideOverviewRouteItem(getContext(), driverride, ((Stop) (obj)), navigator, screen.isNetworkError().booleanValue());
        }

    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        }
        Binder binder = Binder.attach(this);
        if (screen.isNetworkError().booleanValue())
        {
            poorConnectionBanner.setVisibility(0);
        }
        toolbar.displayBackButton();
        toolbar.setTitle(getResources().getString(0x7f070314));
        updatePartyView();
        updateRouteView();
        binder.bind(toolbar.observeHomeClick(), new Action1() {

            final RideOverviewView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                appFlow.goBack();
            }

            
            {
                this$0 = RideOverviewView.this;
                super();
            }
        });
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }
}
