// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.TextView;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.studies.DriverAnalytics;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.User;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.facades.UserModeSwitchFacade;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import rx.Observable;
import rx.functions.Action1;

public class DriverModeToggleView extends TextView
{

    private Binder binder;
    DialogFlow dialogFlow;
    IDriverRideProvider routeProvider;
    UserModeSwitchFacade userModeSwitchFacade;
    IUserProvider userProvider;

    public DriverModeToggleView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        while (isInEditMode() || isInEditMode()) 
        {
            return;
        }
        binder = Binder.attach(this);
        binder.bind(Observable.combineLatest(userProvider.observeUserUpdates(), routeProvider.observeRide(), Unit.func2()), new Action1() {

            final DriverModeToggleView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                if (userProvider.getUser().isInPassengerMode())
                {
                    setTextColor(getResources().getColor(0x7f0c0025));
                    setText(getResources().getString(0x7f07015f));
                    setBackgroundDrawable(getResources().getDrawable(0x7f0200e0));
                    setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(0x7f020146), null, null, null);
                    return;
                }
                if (!userProvider.getUser().isDriverLastRide())
                {
                    setText(getResources().getString(0x7f070160));
                    setTextColor(getResources().getColor(0x7f0c007e));
                    setBackgroundDrawable(getResources().getDrawable(0x7f0200df));
                    setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(0x7f020147), null, null, null);
                    return;
                } else
                {
                    setText(getResources().getString(0x7f07015e));
                    setTextColor(getResources().getColor(0x7f0c007e));
                    setBackgroundDrawable(getResources().getDrawable(0x7f0200df));
                    setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                    return;
                }
            }

            
            {
                this$0 = DriverModeToggleView.this;
                super();
            }
        });
    }

    public boolean performClick()
    {
        DriverAnalytics.trackModeToggleTap();
        if (userProvider.getUser().isInPassengerMode())
        {
            binder.bind(userModeSwitchFacade.switchToDriver(), new AsyncCall());
        } else
        if (routeProvider.getDriverRide().isActive())
        {
            if (userProvider.getUser().isDriverLastRide())
            {
                dialogFlow.show(new me.lyft.android.ui.driver.DriverDialogs.LastRideExitDialog());
            } else
            {
                dialogFlow.show(new me.lyft.android.ui.driver.DriverDialogs.LastRideConfirmationDialog());
            }
        } else
        {
            binder.bind(userModeSwitchFacade.switchToPassenger(), new AsyncCall());
        }
        return true;
    }
}
