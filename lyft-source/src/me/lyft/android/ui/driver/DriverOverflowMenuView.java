// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.application.ride.IDestinyService;
import me.lyft.android.application.ride.IDestinySession;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.features.FeatureFlag;
import me.lyft.android.features.Features;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.SimpleSubscriber;
import me.lyft.android.ui.CallPassengerMenuItem;
import me.lyft.android.ui.OverflowMenuItem;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

public class DriverOverflowMenuView extends FrameLayout
{

    AppFlow appFlow;
    View backgroundView;
    private Binder binder;
    MessageBus bus;
    IDestinyService destinyService;
    IDestinySession destinySession;
    DialogFlow dialogFlow;
    private List loadedPassengerIds;
    LinearLayout menuItems;
    private final android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() {

        final DriverOverflowMenuView this$0;

        public void onClick(View view)
        {
            dialogFlow.dismiss();
            onMenuItemClicked(view.getId());
        }

            
            {
                this$0 = DriverOverflowMenuView.this;
                super();
            }
    };
    private final Action1 onRouteUpdated = new Action1() {

        final DriverOverflowMenuView this$0;

        public volatile void call(Object obj)
        {
            call((DriverRide)obj);
        }

        public void call(DriverRide driverride)
        {
            boolean flag3 = true;
            boolean flag;
            boolean flag1;
            boolean flag2;
            boolean flag4;
            if (driverride.isPending() || driverride.isInProgress())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            setItemVisible(0x7f0d0016, flag1);
            if (!driverride.getCurrentStop().isNull())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag4 = driverride.isCourier();
            driverride = DriverOverflowMenuView.this;
            if (flag1 && flag)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            driverride.setItemVisible(0x7f0d0002, flag2);
            driverride = DriverOverflowMenuView.this;
            if (flag1 && flag4 && flag)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            driverride.setItemVisible(0x7f0d0023, flag2);
            driverride = DriverOverflowMenuView.this;
            if (flag1 && flag4)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            driverride.setItemVisible(0x7f0d0000, flag2);
            driverride = DriverOverflowMenuView.this;
            if (flag1 && flag)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            driverride.setItemVisible(0x7f0d0003, flag2);
            driverride = DriverOverflowMenuView.this;
            if (!flag1)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            driverride.setItemVisible(0x7f0d0010, flag2);
            driverride = DriverOverflowMenuView.this;
            if (!flag1 && Features.DESTINY.isEnabled() && !destinySession.isDriverInDestinyMode())
            {
                flag1 = flag3;
            } else
            {
                flag1 = false;
            }
            driverride.setItemVisible(0x7f0d000e, flag1);
            if (!Objects.equals(getPassengerIds(), loadedPassengerIds))
            {
                dialogFlow.dismiss();
            }
        }

            
            {
                this$0 = DriverOverflowMenuView.this;
                super();
            }
    };
    IDriverRideProvider routeProvider;

    public DriverOverflowMenuView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        loadedPassengerIds = Collections.emptyList();
        Scoop.a(this).b(this);
    }

    private void addCallPassengerButtons()
    {
        if (!shouldDisplayCallPassenger())
        {
            return;
        } else
        {
            addCallPassengerButtons(routeProvider.getDriverRide().getNotDroppedOffPassengers());
            return;
        }
    }

    private void addCallPassengerButtons(List list)
    {
        CallPassengerMenuItem callpassengermenuitem;
        for (list = list.iterator(); list.hasNext(); menuItems.addView(callpassengermenuitem))
        {
            final Passenger passenger = (Passenger)list.next();
            callpassengermenuitem = new CallPassengerMenuItem(getContext());
            callpassengermenuitem.setPassenger(passenger.getFirstName(), passenger.getPhotoUrl(), passenger.getPartySize(), passenger.isPickedup());
            callpassengermenuitem.setOnClickListener(new android.view.View.OnClickListener() {

                final DriverOverflowMenuView this$0;
                final Passenger val$passenger;

                public void onClick(View view)
                {
                    dialogFlow.show(new DriverDialogs.CallConfirmationDialog(passenger));
                }

            
            {
                this$0 = DriverOverflowMenuView.this;
                passenger = passenger1;
                super();
            }
            });
            callpassengermenuitem.setId(0x7f0d0002);
        }

    }

    private void addMenuItem(int i, String s, int j, boolean flag)
    {
        if (menuItems.findViewById(i) == null)
        {
            OverflowMenuItem overflowmenuitem = new OverflowMenuItem(getContext());
            overflowmenuitem.setTitle(s).setIconId(j).isNewItem(flag).setId(i);
            overflowmenuitem.setOnClickListener(onClickListener);
            menuItems.addView(overflowmenuitem);
        }
    }

    private List getPassengerIds()
    {
        return Iterables.select(routeProvider.getDriverRide().getPassengersFromCurrentRoute(), new Func1() {

            final DriverOverflowMenuView this$0;

            public volatile Object call(Object obj)
            {
                return call((Passenger)obj);
            }

            public String call(Passenger passenger)
            {
                return passenger.getId();
            }

            
            {
                this$0 = DriverOverflowMenuView.this;
                super();
            }
        });
    }

    private void initMenuItems()
    {
        addMenuItem(0x7f0d0010, getResources().getString(0x7f07015c), 0x7f0201c6, false);
        addMenuItem(0x7f0d000e, getResources().getString(0x7f070133), 0x7f02010a, false);
        addMenuItem(0x7f0d0023, getResources().getString(0x7f070313), 0x7f0201b0, false);
        addCallPassengerButtons();
        addMenuItem(0x7f0d0000, getResources().getString(0x7f07005b), 0x7f0200fb, false);
        addMenuItem(0x7f0d0016, getResources().getString(0x7f07019c), 0x7f0201ad, false);
        addMenuItem(0x7f0d0003, getResources().getString(0x7f070089), 0x7f02012a, false);
    }

    private void onMenuItemClicked(int i)
    {
        switch (i)
        {
        default:
            return;

        case 2131558402: 
            dialogFlow.show(new DriverDialogs.CallConfirmationDialog(routeProvider.getDriverRide().getCurrentPassenger()));
            return;

        case 2131558435: 
            appFlow.goTo(new DriverScreens.RideOverviewScreen(false));
            return;

        case 2131558400: 
            dialogFlow.show(new DriverDialogs.CourierDriverInfoDialog());
            return;

        case 2131558403: 
            dialogFlow.show(new DriverDialogs.DriverCancellationConfirmationDialog());
            return;

        case 2131558422: 
            appFlow.goTo(new me.lyft.android.ui.help.HelpScreens.HelpScreen(true));
            return;

        case 2131558416: 
            appFlow.goTo(new DriverScreens.DriverStatsScreen());
            return;

        case 2131558414: 
            destinyService.switchToDestiny().subscribe(new SimpleSubscriber());
            return;
        }
    }

    private void setItemVisible(int i, boolean flag)
    {
        View view = menuItems.findViewById(i);
        if (view != null)
        {
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    private boolean shouldDisplayCallPassenger()
    {
        return routeProvider.getDriverRide().isPending() || routeProvider.getDriverRide().isAccepted() || routeProvider.getDriverRide().isArrived() || routeProvider.getDriverRide().isPickedUp();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        loadedPassengerIds = getPassengerIds();
        backgroundView.setOnClickListener(new android.view.View.OnClickListener() {

            final DriverOverflowMenuView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
            }

            
            {
                this$0 = DriverOverflowMenuView.this;
                super();
            }
        });
        initMenuItems();
        binder = Binder.attach(this);
        binder.bind(routeProvider.observeRide(), onRouteUpdated);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }




}
