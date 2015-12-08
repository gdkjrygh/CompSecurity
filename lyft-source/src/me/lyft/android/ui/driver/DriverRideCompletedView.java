// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideRatingAndEarningsView

public class DriverRideCompletedView extends LinearLayout
{

    AppFlow appFlow;
    MessageBus bus;
    DialogFlow dialogFlow;
    private DriverRideRatingAndEarningsView driverEarningsView;
    private Action1 onMenuItemClicked;
    ViewGroup ratingAndEarningScreen;
    IDriverRideProvider routeProvider;
    Toolbar toolbar;

    public DriverRideCompletedView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onMenuItemClicked = new Action1() {

            final DriverRideCompletedView this$0;

            public void call(Integer integer)
            {
                switch (integer.intValue())
                {
                default:
                    return;

                case 2131558433: 
                    dialogFlow.show(new DriverDialogs.DriverOverflowMenuScreen());
                    return;

                case 2131558400: 
                    dialogFlow.show(new DriverDialogs.CourierDriverInfoDialog());
                    return;

                case 2131558422: 
                    appFlow.goTo(new me.lyft.android.ui.help.HelpScreens.HelpScreen());
                    return;
                }
            }

            public volatile void call(Object obj)
            {
                call((Integer)obj);
            }

            
            {
                this$0 = DriverRideCompletedView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private void initRatingScreen()
    {
        ratingAndEarningScreen.setVisibility(0);
        if (driverEarningsView == null)
        {
            driverEarningsView = (DriverRideRatingAndEarningsView)Scoop.a(this).a(getContext()).inflate(0x7f030069, ratingAndEarningScreen, false);
            ratingAndEarningScreen.addView(driverEarningsView);
        }
        Binder binder = Binder.attach(this);
        binder.bind(toolbar.observeItemClick(), onMenuItemClicked);
        binder.bind(bus.observe(me/lyft/android/ui/driver/DriverOverflowMenuView$OverflowMenuItemPressedEvent), onMenuItemClicked);
    }

    private void initToolbar()
    {
        int i = 0x7f020107;
        if (!routeProvider.getDriverRide().isCourier()) goto _L2; else goto _L1
_L1:
        i = 0x7f020101;
_L4:
        toolbar.hideHomeIcon().setLogo(i);
        toolbar.addItem(0x7f0d0021, 0x7f02018c).showItem(0x7f0d0021);
        return;
_L2:
        if (routeProvider.getDriverRide().isPlus())
        {
            i = 0x7f020109;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        initToolbar();
        initRatingScreen();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        ratingAndEarningScreen.removeAllViews();
        ratingAndEarningScreen.setVisibility(8);
        toolbar.removeItem(0x7f0d000f);
        driverEarningsView = null;
    }
}
