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
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.services.TimerManager;
import me.lyft.android.ui.dialogs.DialogContainerView;
import me.lyft.android.utils.Navigator;
import me.lyft.android.utils.TextToSpeech;
import rx.functions.Action1;

public class AutoNavigationToastView extends DialogContainerView
{

    private static final long AUTO_NAV_TIMEOUT = 3L;
    public static final String TIMER_PICKUP_AUTO_NAV = "pickup_auto_nav";
    TextView autoNavigateCountdownTextView;
    LinearLayout autoNavigateToast;
    private Action1 autoNavigationTimerCallback;
    MessageBus bus;
    DialogFlow dialogFlow;
    private Stop displayedStop;
    Navigator navigator;
    private Action1 onRouteUpdated;
    IDriverRideProvider routeProvider;
    TextToSpeech textToSpeech;
    TimerManager timerManager;

    public AutoNavigationToastView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        autoNavigationTimerCallback = new Action1() {

            final AutoNavigationToastView this$0;

            public void call(Long long1)
            {
                Stop stop;
                autoNavigateCountdownTextView.setText(getResources().getString(0x7f070120, new Object[] {
                    long1
                }));
                stop = routeProvider.getDriverRide().getCurrentStop();
                if (long1.longValue() != 3L) goto _L2; else goto _L1
_L1:
                long1 = routeProvider.getDriverRide().getCurrentPassenger().getFirstName();
                int i;
                if (stop.isPickup())
                {
                    i = 0x7f0702aa;
                } else
                {
                    i = 0x7f070163;
                }
                if (!Strings.isNullOrEmpty(long1))
                {
                    long1 = getResources().getString(i, new Object[] {
                        long1
                    });
                } else
                {
                    long1 = getResources().getString(0x7f070206);
                }
                textToSpeech.speak(long1);
_L4:
                return;
_L2:
                if (long1.longValue() != 0L) goto _L4; else goto _L3
_L3:
                if (!routeProvider.getDriverRide().isTrainingRide()) goto _L6; else goto _L5
_L5:
                dialogFlow.queue(new DriverDialogs.TrainingRideNavigationDialog());
_L8:
                dialogFlow.dismiss();
                return;
_L6:
                if (!stop.getLocation().isNull())
                {
                    navigator.navigate(stop.getLocation());
                }
                if (true) goto _L8; else goto _L7
_L7:
            }

            public volatile void call(Object obj)
            {
                call((Long)obj);
            }

            
            {
                this$0 = AutoNavigationToastView.this;
                super();
            }
        };
        onRouteUpdated = new Action1() {

            final AutoNavigationToastView this$0;

            public volatile void call(Object obj)
            {
                call((DriverRide)obj);
            }

            public void call(DriverRide driverride)
            {
                boolean flag;
                if (Objects.equals(Boolean.valueOf(driverride.getCurrentStop().isPickup()), Boolean.valueOf(displayedStop.isPickup())) && Objects.equals(driverride.getCurrentStop().getPassenger().getId(), displayedStop.getPassenger().getId()) && Objects.equals(driverride.getCurrentStop().getRideId(), displayedStop.getRideId()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!driverride.isInProgress() || !flag)
                {
                    dialogFlow.dismiss();
                }
            }

            
            {
                this$0 = AutoNavigationToastView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Binder binder = Binder.attach(this);
        ButterKnife.a(this);
        displayedStop = routeProvider.getDriverRide().getCurrentStop();
        autoNavigateToast.setOnClickListener(new android.view.View.OnClickListener() {

            final AutoNavigationToastView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
            }

            
            {
                this$0 = AutoNavigationToastView.this;
                super();
            }
        });
        binder.bind(routeProvider.observeRide(), onRouteUpdated);
        binder.bind(timerManager.getTimer("pickup_auto_nav", routeProvider.getDriverRide().getCurrentStop().getStopId(), Long.valueOf(3L)), autoNavigationTimerCallback);
    }

    protected void onClickOutside()
    {
        super.onClickOutside();
        dialogFlow.dismiss();
    }

}
