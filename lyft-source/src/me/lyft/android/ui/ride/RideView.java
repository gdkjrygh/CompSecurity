// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ride;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.analytics.studies.ExpressPayAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IDestinySession;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.User;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.RideStatus;
import me.lyft.android.features.FeatureFlag;
import me.lyft.android.features.Features;
import me.lyft.android.map.core.MapPlaceHolderView;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.ui.dialogs.Toast;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.ride:
//            RideViewModule, RideMap

public class RideView extends RelativeLayout
    implements IHandleBack
{

    ActivityController activityController;
    AppFlow appFlow;
    IConstantsProvider constantsProvider;
    private int currentRideViewId;
    private me.lyft.android.domain.User.UserMode currentUserMode;
    IDestinySession destinySession;
    DialogFlow dialogFlow;
    private final ReactiveProperty isInDriverModeSubject = ReactiveProperty.create();
    private final LayoutInflater layoutInflater;
    MapPlaceHolderView mapPlaceholder;
    private Action1 onRideStateChange;
    private Action1 onUserChanged;
    IPassengerRideProvider passengerRideProvider;
    ILyftPreferences preferences;
    RideMap rideMap;
    FrameLayout rideViewContainer;
    IDriverRideProvider routeProvider;
    Scoop scoop;
    IUserProvider userProvider;

    public RideView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        currentRideViewId = 0;
        onRideStateChange = new Action1() {

            final RideView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                checkForScreenWakeLock();
                if (userProvider.getUser().isInDriverMode())
                {
                    checkDriverRideStates();
                    return;
                } else
                {
                    checkPassengerRideStates();
                    return;
                }
            }

            
            {
                this$0 = RideView.this;
                super();
            }
        };
        onUserChanged = new Action1() {

            final RideView this$0;

            public volatile void call(Object obj)
            {
                call((User)obj);
            }

            public void call(User user)
            {
                showModeChangedToastIfNeeded();
                isInDriverModeSubject.onNext(Boolean.valueOf(user.isInDriverMode()));
                currentUserMode = userProvider.getUser().getMode();
            }

            
            {
                this$0 = RideView.this;
                super();
            }
        };
        context = Scoop.a(this);
        attributeset = (me.lyft.android.ui.MainScreens.RideScreen)context.a();
        scoop = Scoop.a(context.a(new Object[] {
            new RideViewModule()
        }), attributeset);
        scoop.b(this);
        layoutInflater = scoop.a(getContext());
    }

    private void checkDriverRideStates()
    {
        Object obj;
        int j;
        j = 0x7f030063;
        obj = routeProvider.getDriverRide();
        if (!((DriverRide) (obj)).isTrainingRide() || !((DriverRide) (obj)).getStatus().isLapsed() && !((DriverRide) (obj)).getStatus().isCanceled()) goto _L2; else goto _L1
_L1:
        appFlow.resetTo(new me.lyft.android.ui.settings.SettingsScreens.TrainingRideStartScreen());
_L4:
        return;
_L2:
        int i;
        if (!destinySession.isDriverInDestinyMode() || ((DriverRide) (obj)).isActive())
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0x7f030061;
_L5:
        if (currentRideViewId != i)
        {
            rideViewContainer.removeAllViews();
            currentRideViewId = i;
            obj = layoutInflater.inflate(i, this, false);
            rideViewContainer.addView(((View) (obj)), 0);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        i = j;
        if (!((DriverRide) (obj)).isNull())
        {
            if (((DriverRide) (obj)).isPending() || ((DriverRide) (obj)).getStatus().isLapsed())
            {
                i = 0x7f030066;
            } else
            if (((DriverRide) (obj)).isArrived() && ((DriverRide) (obj)).isCourier())
            {
                i = 0x7f030060;
            } else
            if (((DriverRide) (obj)).isAccepted() || ((DriverRide) (obj)).isPickedUp() || ((DriverRide) (obj)).isArrived())
            {
                i = 0x7f030068;
            } else
            {
                i = j;
                if (((DriverRide) (obj)).isDroppedOff())
                {
                    i = 0x7f030067;
                }
            }
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    private void checkForScreenWakeLock()
    {
        if (userProvider.getUser().isInDriverMode())
        {
            activityController.enableKeepScreenOn();
            return;
        }
        RideStatus ridestatus = passengerRideProvider.getPassengerRide().getStatus();
        if (ridestatus.isPending() || ridestatus.isAccepted())
        {
            activityController.enableKeepScreenOn();
            return;
        } else
        {
            activityController.disableKeepScreenOn();
            return;
        }
    }

    private void checkPassengerRideStates()
    {
        Object obj = passengerRideProvider.getPassengerRide();
        RideStatus ridestatus = ((PassengerRide) (obj)).getStatus();
        int i;
        if (destinySession.isInDestinyEditMode())
        {
            i = 0x7f030051;
        } else
        if (ridestatus.isPending())
        {
            if (((PassengerRide) (obj)).isCourier())
            {
                i = 0x7f0300b8;
            } else
            {
                i = 0x7f0300b6;
            }
        } else
        if (ridestatus.isAccepted() || ridestatus.isArrived() || ridestatus.isPickedUp())
        {
            if (((PassengerRide) (obj)).isCourier())
            {
                i = 0x7f0300b7;
            } else
            {
                i = 0x7f0300b5;
            }
        } else
        if (ridestatus.isDroppedOff())
        {
            i = 0x7f0300bb;
        } else
        if (Features.CONFIRMATION_FLOW.isEnabled())
        {
            i = 0x7f0300c5;
        } else
        {
            i = 0x7f0300c4;
        }
        if (currentRideViewId != i)
        {
            rideViewContainer.removeAllViews();
            currentRideViewId = i;
            obj = layoutInflater.inflate(i, this, false);
            rideViewContainer.addView(((View) (obj)), 0);
        }
    }

    private void showModeChangedToastIfNeeded()
    {
        if (currentUserMode == me.lyft.android.domain.User.UserMode.DRIVER && userProvider.getUser().isInPassengerMode() && !destinySession.isInDestinyEditMode())
        {
            if (userProvider.getUser().showExpressPayPopUp())
            {
                ExpressPayAnalytics.trackExpressPayPromoTaps();
                dialogFlow.show(new me.lyft.android.ui.driver.expresspay.ExpressPayDialogs.FirstTimeExpressPayDialog(constantsProvider.getConstants(), getResources().getString(0x7f070172)));
            }
            dialogFlow.queue(new Toast(getResources().getString(0x7f0701e3), Integer.valueOf(0x7f020145)));
        } else
        if (currentUserMode == me.lyft.android.domain.User.UserMode.PASSENGER && userProvider.getUser().isInDriverMode() && Features.LAST_RIDE.isEnabled() && !preferences.wasLastRideDescriptionShown())
        {
            dialogFlow.show(new me.lyft.android.ui.driver.DriverDialogs.LastRideDescriptionDialog());
            return;
        }
    }

    public View getView()
    {
        if (getChildCount() > 0)
        {
            return rideViewContainer.getChildAt(0);
        } else
        {
            return null;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        Binder binder = Binder.attach(this);
        rideMap.attach(mapPlaceholder);
        currentUserMode = userProvider.getUser().getMode();
        binder.bind(Observable.combineLatest(passengerRideProvider.observeRideUpdateEvent(), routeProvider.observeRide(), Unit.func2()), onRideStateChange);
        binder.bind(userProvider.observeUserUpdates(), onUserChanged);
        binder.bind(isInDriverModeSubject.map(Unit.func1()), onRideStateChange);
        binder.bind(destinySession.observeLocationChanges().map(Unit.func1()), onRideStateChange);
    }

    public boolean onBack()
    {
        View view = getView();
        return (view instanceof IHandleBack) && ((IHandleBack)view).onBack();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        mapPlaceholder.removeAllViews();
        rideMap.detach();
    }







/*
    static me.lyft.android.domain.User.UserMode access$502(RideView rideview, me.lyft.android.domain.User.UserMode usermode)
    {
        rideview.currentUserMode = usermode;
        return usermode;
    }

*/
}
