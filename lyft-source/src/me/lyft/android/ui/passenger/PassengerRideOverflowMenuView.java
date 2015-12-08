// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.IUserSession;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.PassengerAnalytics;
import me.lyft.android.analytics.studies.RideAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IPassengerRideService;
import me.lyft.android.application.ride.IRideFareRepository;
import me.lyft.android.application.splitfare.ISplitFareStateRepository;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.passenger.Driver;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.ride.RideFare;
import me.lyft.android.domain.ride.RideStatus;
import me.lyft.android.domain.splitfare.SplitFareState;
import me.lyft.android.features.FeatureFlag;
import me.lyft.android.features.Features;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.infrastructure.sms.ISmsService;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.OverflowMenuItem;
import rx.functions.Action1;

public class PassengerRideOverflowMenuView extends FrameLayout
{

    AppFlow appFlow;
    View background;
    private Binder binder;
    OverflowMenuItem callDriverItem;
    OverflowMenuItem cancelRideItem;
    IConstantsProvider constantsProvider;
    DialogFlow dialogFlow;
    IRideFareRepository fareRepository;
    final LayoutInflater inflater;
    OverflowMenuItem inviteFriendsItem;
    private final Action1 onRideUpdate = new Action1() {

        final PassengerRideOverflowMenuView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            updateToolbar();
            if (!Objects.equals(previousRideStatus, passengerRideProvider.getPassengerRide().getStatus()))
            {
                dialogFlow.dismiss(me/lyft/android/ui/passenger/PassengerDialogs$PassengerRideOverflowMenuScreen);
            }
        }

            
            {
                this$0 = PassengerRideOverflowMenuView.this;
                super();
            }
    };
    IPassengerRideProvider passengerRideProvider;
    IPassengerRideService passengerRideService;
    private RideStatus previousRideStatus;
    IProgressController progressController;
    private PassengerDialogs.PassengerRideOverflowMenuScreen screen;
    OverflowMenuItem shareRouteItem;
    ISmsService smsService;
    ISplitFareStateRepository splitFareStateRepository;
    OverflowMenuItem splitPaymentDisabledItem;
    OverflowMenuItem splitPaymentItem;
    OverflowMenuItem textDriverItem;
    IUserSession userSession;
    IViewErrorHandler viewErrorHandler;

    public PassengerRideOverflowMenuView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        attributeset = Scoop.a(this);
        attributeset.b(this);
        inflater = LayoutInflater.from(context);
        screen = (PassengerDialogs.PassengerRideOverflowMenuScreen)attributeset.a();
    }

    private void initMenuItems()
    {
        callDriverItem.setTitle(getResources().getString(0x7f070084)).setIconId(0x7f02019a).setOnClickListener(new android.view.View.OnClickListener() {

            final PassengerRideOverflowMenuView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss(me/lyft/android/ui/passenger/PassengerDialogs$PassengerRideOverflowMenuScreen);
                dialogFlow.show(new PassengerDialogs.CallDriverConfirmationDialog());
            }

            
            {
                this$0 = PassengerRideOverflowMenuView.this;
                super();
            }
        });
        textDriverItem.setTitle(getResources().getString(0x7f070368)).setIconId(0x7f02018b).setOnClickListener(new android.view.View.OnClickListener() {

            final PassengerRideOverflowMenuView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss(me/lyft/android/ui/passenger/PassengerDialogs$PassengerRideOverflowMenuScreen);
                openSmsComposer();
            }

            
            {
                this$0 = PassengerRideOverflowMenuView.this;
                super();
            }
        });
        splitPaymentItem.setTitle(getResources().getString(0x7f07034f)).setIconId(0x7f0201c0).setOnClickListener(new android.view.View.OnClickListener() {

            final PassengerRideOverflowMenuView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss(me/lyft/android/ui/passenger/PassengerDialogs$PassengerRideOverflowMenuScreen);
                appFlow.goTo(new me.lyft.android.ui.splitfare.SplitScreens.InviteToSplitScreen());
            }

            
            {
                this$0 = PassengerRideOverflowMenuView.this;
                super();
            }
        });
        splitPaymentDisabledItem.setTitle(getResources().getString(0x7f07034f)).setIconId(0x7f0201c1).setOnClickListener(new android.view.View.OnClickListener() {

            final PassengerRideOverflowMenuView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss(me/lyft/android/ui/passenger/PassengerDialogs$PassengerRideOverflowMenuScreen);
                dialogFlow.show(me.lyft.android.ui.splitfare.SplitFareDialogs.SplitInProgressDialog.create(getResources(), splitFareStateRepository));
            }

            
            {
                this$0 = PassengerRideOverflowMenuView.this;
                super();
            }
        });
        shareRouteItem.setTitle(getResources().getString(0x7f07033d)).setIconId(0x7f0201b8).setOnClickListener(new android.view.View.OnClickListener() {

            final PassengerRideOverflowMenuView this$0;

            public void onClick(View view)
            {
                shareRoute();
            }

            
            {
                this$0 = PassengerRideOverflowMenuView.this;
                super();
            }
        });
        inviteFriendsItem.setTitle(getResources().getString(0x7f0701b6)).setIconId(0x7f02015e).setOnClickListener(new android.view.View.OnClickListener() {

            final PassengerRideOverflowMenuView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss(me/lyft/android/ui/passenger/PassengerDialogs$PassengerRideOverflowMenuScreen);
                appFlow.resetToParent(new me.lyft.android.ui.invites.InvitesScreens.InviteScreen());
            }

            
            {
                this$0 = PassengerRideOverflowMenuView.this;
                super();
            }
        });
        cancelRideItem.setTitle(getResources().getString(0x7f070089)).setIconId(0x7f02012a).setOnClickListener(new android.view.View.OnClickListener() {

            final PassengerRideOverflowMenuView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss(me/lyft/android/ui/passenger/PassengerDialogs$PassengerRideOverflowMenuScreen);
                dialogFlow.show(new PassengerDialogs.PassengerCancelRideDialog());
            }

            
            {
                this$0 = PassengerRideOverflowMenuView.this;
                super();
            }
        });
    }

    private void openSmsComposer()
    {
        PassengerAnalytics.trackTextDriverTap();
        smsService.openSmsComposer(passengerRideProvider.getPassengerRide().getDriver().getPhoneNumber());
    }

    private void shareRoute()
    {
        progressController.showProgress();
        progressController.disableUI();
        final AsyncActionAnalytics shareRouteAnalytics = RideAnalytics.createShareRouteAnalytics();
        shareRouteAnalytics.trackRequest();
        binder.bind(passengerRideService.shareRoute(), new AsyncCall() {

            final PassengerRideOverflowMenuView this$0;
            final AsyncActionAnalytics val$shareRouteAnalytics;

            public void onFail(Throwable throwable)
            {
                shareRouteAnalytics.trackResponseFailure(throwable);
                viewErrorHandler.handle(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s)
            {
                super.onSuccess(s);
                shareRouteAnalytics.trackResponseSuccess();
                smsService.sendShareRouteMessage(s);
            }

            public void onUnsubscribe()
            {
                dialogFlow.dismiss(me/lyft/android/ui/passenger/PassengerDialogs$PassengerRideOverflowMenuScreen);
                progressController.enableUI();
                progressController.hideProgress();
            }

            
            {
                this$0 = PassengerRideOverflowMenuView.this;
                shareRouteAnalytics = asyncactionanalytics;
                super();
            }
        });
    }

    private void updateToolbar()
    {
        boolean flag1 = true;
        boolean flag = false;
        Object obj = fareRepository.getFare();
        Object obj1 = splitFareStateRepository.getSplitFareState();
        int k = ((RideFare) (obj)).getMaximumContributors();
        OverflowMenuItem overflowmenuitem;
        int i;
        int j;
        if (((SplitFareState) (obj1)).getInvitedContributorsCount() >= k)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        obj1 = userSession.getRide();
        if (obj1 != null)
        {
            obj = ((RideDTO) (obj1)).getStatus();
        } else
        {
            obj = "";
        }
        if ("pickedUp".equalsIgnoreCase(((String) (obj))))
        {
            flag1 = false;
        }
        overflowmenuitem = cancelRideItem;
        if (obj1 != null)
        {
            obj = ((RideDTO) (obj1)).getIsPassengerRideCancelEnabled();
        } else
        {
            obj = null;
        }
        if (((Boolean)Objects.firstNonNull(obj, Boolean.valueOf(flag1))).booleanValue())
        {
            j = 0;
        } else
        {
            j = 8;
        }
        overflowmenuitem.setVisibility(j);
        obj = textDriverItem;
        if (Features.SMS_TO_DRIVER.isEnabled())
        {
            j = 0;
        } else
        {
            j = 8;
        }
        ((OverflowMenuItem) (obj)).setVisibility(j);
        obj = splitPaymentItem;
        if (k > 0 && i == 0)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        ((OverflowMenuItem) (obj)).setVisibility(j);
        obj = splitPaymentDisabledItem;
        if (k > 0 && i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((OverflowMenuItem) (obj)).setVisibility(i);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (!isInEditMode())
        {
            previousRideStatus = passengerRideProvider.getPassengerRide().getStatus();
            background.setOnClickListener(new android.view.View.OnClickListener() {

                final PassengerRideOverflowMenuView this$0;

                public void onClick(View view)
                {
                    dialogFlow.dismiss(me/lyft/android/ui/passenger/PassengerDialogs$PassengerRideOverflowMenuScreen);
                }

            
            {
                this$0 = PassengerRideOverflowMenuView.this;
                super();
            }
            });
            binder = Binder.attach(this);
            binder.bind(passengerRideProvider.observeRideUpdateEvent(), onRideUpdate);
            if (screen.isShareRouteSelected())
            {
                shareRoute();
                return;
            }
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            initMenuItems();
            return;
        }
    }




}
