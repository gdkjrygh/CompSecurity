// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.confirm;

import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.application.ride.BillingAddressRequiredException;
import me.lyft.android.application.ride.DynamicPricingNotConfirmedException;
import me.lyft.android.application.ride.HasDebtException;
import me.lyft.android.application.ride.IRideRequestService;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.application.ride.NoChargeAccountException;
import me.lyft.android.application.ride.NoValidChargeAccountException;
import me.lyft.android.application.ride.NoValidPhoneException;
import me.lyft.android.application.ride.PartySizeNotSetException;
import me.lyft.android.application.ride.PickupLocationMissingException;
import me.lyft.android.application.ride.PickupNotConfirmedException;
import me.lyft.android.application.ride.RouteInvalidException;
import me.lyft.android.application.ride.TermsNotAcceptedException;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.locationsettings.ILocationSettingsService;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.Presenter;
import me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2;
import me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter;
import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

public class RequestRideButtonPresenter extends Presenter
{

    final MessageBus bus;
    final IChargeAccountsProvider chargeAccountsProvider;
    final ILocationSettingsService locationSettingsService;
    private final Action1 onPartySizeSelected = new Action1() {

        final RequestRideButtonPresenter this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            requestRide(false);
        }

            
            {
                this$0 = RequestRideButtonPresenter.this;
                super();
            }
    };
    private final Action1 onPaymentRideRequest = new Action1() {

        final RequestRideButtonPresenter this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            requestRide(false);
        }

            
            {
                this$0 = RequestRideButtonPresenter.this;
                super();
            }
    };
    private final Action1 onPickupConfirmed = new Action1() {

        final RequestRideButtonPresenter this$0;

        public void call(Boolean boolean1)
        {
            if (boolean1.booleanValue())
            {
                requestRide(false);
            }
        }

        public volatile void call(Object obj)
        {
            call((Boolean)obj);
        }

            
            {
                this$0 = RequestRideButtonPresenter.this;
                super();
            }
    };
    private final Action1 onPrimeTimeConfirmed = new Action1() {

        final RequestRideButtonPresenter this$0;

        public volatile void call(Object obj)
        {
            call((me.lyft.android.ui.passenger.PrimeTimeRequestRideDialogView.RequestType)obj);
        }

        public void call(me.lyft.android.ui.passenger.PrimeTimeRequestRideDialogView.RequestType requesttype)
        {
            class _cls7
            {

                static final int $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType[];

                static 
                {
                    $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType = new int[me.lyft.android.ui.passenger.PrimeTimeRequestRideDialogView.RequestType.values().length];
                    try
                    {
                        $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType[me.lyft.android.ui.passenger.PrimeTimeRequestRideDialogView.RequestType.LYFT.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType[me.lyft.android.ui.passenger.PrimeTimeRequestRideDialogView.RequestType.COURIER.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType[me.lyft.android.ui.passenger.PrimeTimeRequestRideDialogView.RequestType.ALERT_TIME_OUT.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$me$lyft$android$ui$passenger$PrimeTimeRequestRideDialogView$RequestType[me.lyft.android.ui.passenger.PrimeTimeRequestRideDialogView.RequestType.CANCEL.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls7..SwitchMap.me.lyft.android.ui.passenger.PrimeTimeRequestRideDialogView.RequestType[requesttype.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                requestRide(false);
                return;

            case 2: // '\002'
                rideRequestSession.setCurrentRideTypeById("courier");
                break;
            }
            requestRidePresenterV2.showPickupStep();
        }

            
            {
                this$0 = RequestRideButtonPresenter.this;
                super();
            }
    };
    final IProgressController progressController;
    final PassengerRequestRidePresenterV2 requestRidePresenterV2;
    final RideMap rideMap;
    final IRideRequestService rideRequestService;
    final IRideRequestSession rideRequestSession;
    final PassengerRequestRideRouter router;
    final IViewErrorHandler viewErrorHandler;

    public RequestRideButtonPresenter(IRideRequestService iriderequestservice, IProgressController iprogresscontroller, IViewErrorHandler iviewerrorhandler, IChargeAccountsProvider ichargeaccountsprovider, ILocationSettingsService ilocationsettingsservice, RideMap ridemap, MessageBus messagebus, 
            PassengerRequestRideRouter passengerrequestriderouter, PassengerRequestRidePresenterV2 passengerrequestridepresenterv2, IRideRequestSession iriderequestsession)
    {
        rideRequestService = iriderequestservice;
        progressController = iprogresscontroller;
        viewErrorHandler = iviewerrorhandler;
        chargeAccountsProvider = ichargeaccountsprovider;
        locationSettingsService = ilocationsettingsservice;
        rideMap = ridemap;
        bus = messagebus;
        router = passengerrequestriderouter;
        requestRidePresenterV2 = passengerrequestridepresenterv2;
        rideRequestSession = iriderequestsession;
    }

    private void checkIfLocationServicesAreEnabled()
    {
        bind(locationSettingsService.observeLocationSettingsEnabled(), new AsyncCall() {

            final RequestRideButtonPresenter this$0;

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                rideMap.centerToCurrentLocation();
            }

            
            {
                this$0 = RequestRideButtonPresenter.this;
                super();
            }
        });
    }

    private void handleRideRequestError(Throwable throwable)
    {
        if (throwable instanceof NoValidPhoneException)
        {
            router.goToNextScreenInSignupFlow();
            return;
        }
        if (throwable instanceof BillingAddressRequiredException)
        {
            router.showPaymentFraudScreen();
            return;
        }
        if (throwable instanceof NoChargeAccountException)
        {
            router.showPaymentDialog();
            return;
        }
        if (throwable instanceof HasDebtException)
        {
            router.showHasDebtScreen();
            return;
        }
        if (throwable instanceof TermsNotAcceptedException)
        {
            router.showAcceptTermsScreen();
            return;
        }
        if (throwable instanceof NoValidChargeAccountException)
        {
            router.showNoValidChargeAccountDialog();
            router.showNoValidChargeAccountPaymentScreen();
            return;
        }
        if (throwable instanceof PickupNotConfirmedException)
        {
            router.showConfirmPickupLocationDialog();
            return;
        }
        if (throwable instanceof RouteInvalidException)
        {
            router.showInvalidRouteDialog(throwable);
            return;
        }
        if (throwable instanceof PartySizeNotSetException)
        {
            router.showPartySizePickerDialog();
            return;
        }
        if (throwable instanceof DynamicPricingNotConfirmedException)
        {
            router.showPrimeTimeRequestRideDialog();
            return;
        }
        if (throwable instanceof PickupLocationMissingException)
        {
            checkIfLocationServicesAreEnabled();
            return;
        } else
        {
            viewErrorHandler.handle(throwable);
            return;
        }
    }

    protected void onAttach()
    {
        bind(bus.observe(me/lyft/android/ui/passenger/ConfirmPickupLocationDialogView$ConfirmPickupLocationDialogResult), onPickupConfirmed);
        bind(bus.observe(me/lyft/android/ui/passenger/PrimeTimeRequestRideDialogView$ConfirmPricingDialogResultEvent), onPrimeTimeConfirmed);
        bind(bus.observe(me/lyft/android/ui/passenger/PartySizePickerDialogView$SelectNumberOfPassengersResultEvent), onPartySizeSelected);
        bind(bus.observe(me/lyft/android/ui/dialogs/PaymentDialogView$RequestRideEvent), onPaymentRideRequest);
    }

    public void requestRide()
    {
        requestRide(true);
    }

    public void requestRide(boolean flag)
    {
        progressController.disableUI();
        bind(rideRequestService.requestRide(flag), new AsyncCall() {

            final RequestRideButtonPresenter this$0;

            public void onFail(Throwable throwable)
            {
                handleRideRequestError(throwable);
            }

            public void onUnsubscribe()
            {
                progressController.enableUI();
            }

            
            {
                this$0 = RequestRideButtonPresenter.this;
                super();
            }
        });
    }

}
