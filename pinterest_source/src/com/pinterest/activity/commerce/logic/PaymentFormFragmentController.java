// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import android.content.Context;
import android.widget.Toast;
import com.braintreepayments.api.Braintree;
import com.braintreepayments.api.models.CardBuilder;
import com.google.common.base.Strings;
import com.pinterest.activity.commerce.api.PinterestCallbackWithDefaultFailure;
import com.pinterest.activity.commerce.dialog.CommerceFormBaseFragment;
import com.pinterest.activity.commerce.event.PaymentScannedEvent;
import com.pinterest.activity.commerce.event.SecureDialogActivityEvent;
import com.pinterest.activity.commerce.view.AddressFormView;
import com.pinterest.activity.commerce.view.CommerceFormView;
import com.pinterest.activity.commerce.view.PaymentFormView;
import com.pinterest.activity.commerce.viewmodel.AddressFormViewModel;
import com.pinterest.activity.commerce.viewmodel.PaymentFormViewModel;
import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.base.Events;
import com.pinterest.data.CommerceApiManager;
import com.pinterest.kit.application.Resources;
import com.pinterest.model.api.RequestAddressParameter;
import com.pinterest.model.commerce.Address;
import com.pinterest.model.commerce.DetailedShipping;
import com.pinterest.model.commerce.UserCard;
import com.pinterest.reporting.CrashReporting;
import com.stripe.android.Stripe;
import com.stripe.android.model.Card;
import com.stripe.exception.AuthenticationException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            CommerceFormBaseFragmentController, AddressFormController

public class PaymentFormFragmentController
    implements CommerceFormBaseFragmentController
{

    private static final String BRAINTREE_CLIENT_TOKEN = "eyJ2ZXJzaW9uIjoyLCJhdXRob3JpemF0aW9uRmluZ2VycHJpbnQiOiI1NDMzOGY2NzFhYTQ0MTgwZTYyNWEyNWNkMWQxMzFkNWNiNGU3MjFiNmJjODY0OTk1OWIwNmMyNDk3ODAwNjVhfGNyZWF0ZWRfYXQ9MjAxNS0wNS0xOFQyMjo1ODoxNi40MTA0MjgxNjYrMDAwMFx1MDAyNmZwc2NvcGVzPXRva2VuaXplXHUwMDI2bWVyY2hhbnRfaWQ9Z2dkaHZocXJtNGpyd2Y0eVx1MDAyNnB1YmxpY19rZXk9NjUzZjR0NWprYnM2a2NwZiIsImNvbmZpZ1VybCI6Imh0dHBzOi8vYXBpLmJyYWludHJlZWdhdGV3YXkuY29tOjQ0My9tZXJjaGFudHMvZ2dkaHZocXJtNGpyd2Y0eS9jbGllbnRfYXBpL3YxL2NvbmZpZ3VyYXRpb24iLCJjaGFsbGVuZ2VzIjpbXSwiZW52aXJvbm1lbnQiOiJwcm9kdWN0aW9uIiwiY2xpZW50QXBpVXJsIjoiaHR0cHM6Ly9hcGkuYnJhaW50cmVlZ2F0ZXdheS5jb206NDQzL21lcmNoYW50cy9nZ2Rodmhxcm00anJ3ZjR5L2NsaWVudF9hcGkiLCJhc3NldHNVcmwiOiJodHRwczovL2Fzc2V0cy5icmFpbnRyZWVnYXRld2F5LmNvbSIsImF1dGhVcmwiOiJodHRwczovL2F1dGgudmVubW8uY29tIiwiYW5hbHl0aWNzIjp7InVybCI6Imh0dHBzOi8vY2xpZW50LWFuYWx5dGljcy5icmFpbnRyZWVnYXRld2F5LmNvbSJ9LCJ0aHJlZURTZWN1cmVFbmFibGVkIjpmYWxzZSwicGF5cGFsRW5hYmxlZCI6ZmFsc2UsImNvaW5iYXNlRW5hYmxlZCI6ZmFsc2UsIm1lcmNoYW50SWQiOiJnZ2Rodmhxcm00anJ3ZjR5IiwidmVubW8iOiJvZmYiLCJhcHBsZVBheSI6eyJzdGF0dXMiOiJwcm9kdWN0aW9uIiwiY291bnRyeUNvZGUiOiJVUyIsImN1cnJlbmN5Q29kZSI6IlVTRCIsIm1lcmNoYW50SWRlbnRpZmllciI6Im1lcmNoYW50LnBpbnRlcmVzdCIsInN1cHBvcnRlZE5ldHdvcmtzIjpbXX19";
    private static final String BRAINTREE_TOKEN_KEY = "2";
    private static final String STRIPE_PUBLISHABLE_KEY = "pk_live_HguKPnfGM2bgDm8Cpr3AHJik";
    private static final String STRIPE_TOKEN_KEY = "1";
    private final AddressFormController addressFormController;
    private AddressFormViewModel addressFormViewModel;
    private String braintreeToken;
    private String cardIncentiveText;
    private final CommerceApiManager commerceApiManager;
    private CommerceFormBaseFragment commerceFormBaseFragment;
    private final Context context;
    private com.braintreepayments.api.Braintree.ErrorListener errorListener;
    private com.pinterest.base.Events.EventsSubscriber eventsSubscriber;
    private UserCard originalUserCard;
    private PaymentFormView paymentFormView;
    private PaymentFormViewModel paymentFormViewModel;
    private com.braintreepayments.api.Braintree.PaymentMethodNonceListener paymentMethodNonceListener;
    private DetailedShipping shippingAsBillingInit;
    private String stripeToken;
    private boolean vaultingFailed;

    public PaymentFormFragmentController(CommerceApiManager commerceapimanager, Context context1, AddressFormController addressformcontroller)
    {
        eventsSubscriber = new _cls7();
        commerceApiManager = commerceapimanager;
        context = context1;
        addressFormController = addressformcontroller;
    }

    private PinterestCallbackWithDefaultFailure getCallback()
    {
        return new _cls4();
    }

    private void handleBraintreeFailure(Braintree braintree)
    {
        removeBraintreeListener(braintree);
        vaultingFailed = true;
        maybeContinueAddingCard();
    }

    private void handleUpdatingCard()
    {
        PaymentFormViewModel paymentformviewmodel = paymentFormView.getData();
        AddressFormViewModel addressformviewmodel = addressFormController.getData();
        if (paymentformviewmodel == null || addressformviewmodel == null)
        {
            showInputInvalidToast();
            return;
        }
        UserCard usercard = originalUserCard;
        if (Integer.parseInt(paymentformviewmodel.getExpMonth()) == usercard.getExpMonth() && Integer.parseInt(paymentformviewmodel.getExpYear()) == usercard.getExpYear() && addressformviewmodel.getFirstName().equals(usercard.getFirstName()) && addressformviewmodel.getLastName().equals(usercard.getLastName()) && addressformviewmodel.getCity().equals(usercard.getAddress().getLocality()) && addressformviewmodel.getState().equals(usercard.getAddress().getRegion()) && addressformviewmodel.getStreetLine1().equals(usercard.getAddress().getStreet()) && addressformviewmodel.getStreetLine2().equals(usercard.getAddress().getExtraStreet()) && addressformviewmodel.getZip().equals(usercard.getAddress().getPostalCode()) && addressformviewmodel.getEmail().equals(usercard.getEmail()) && addressformviewmodel.getPhoneNumber().equals(usercard.getPhone()))
        {
            Events.post(new SecureDialogActivityEvent(com.pinterest.activity.commerce.event.SecureDialogActivityEvent.Type.Close));
            return;
        } else
        {
            Events.post(new DialogEvent(new LoadingDialog(0x7f070148)));
            commerceApiManager.a(originalUserCard.getId(), addressformviewmodel.getFirstName(), addressformviewmodel.getLastName(), new RequestAddressParameter(addressformviewmodel.getCity(), addressformviewmodel.getState(), addressformviewmodel.getStreetLine1(), addressformviewmodel.getZip(), addressformviewmodel.getStreetLine2()), Integer.valueOf(Integer.parseInt(paymentformviewmodel.getExpMonth())), Integer.valueOf(Integer.parseInt(paymentformviewmodel.getExpYear())), addressformviewmodel.getEmail(), addressformviewmodel.getPhoneNumber(), getCallback());
            return;
        }
    }

    private void maybeContinueAddingCard()
    {
        this;
        JVM INSTR monitorenter ;
        if (!vaultingFailed) goto _L2; else goto _L1
_L1:
        Toast.makeText(context, 0x7f070149, 0).show();
        Events.post(new DialogEvent(null));
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (stripeToken != null && braintreeToken != null)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("1", stripeToken);
            hashmap.put("2", braintreeToken);
            commerceApiManager.a(hashmap, addressFormViewModel.getFirstName(), addressFormViewModel.getLastName(), new RequestAddressParameter(addressFormViewModel.getCity(), addressFormViewModel.getState(), addressFormViewModel.getStreetLine1(), addressFormViewModel.getZip(), addressFormViewModel.getStreetLine2()), addressFormViewModel.getEmail(), addressFormViewModel.getPhoneNumber(), getCallback());
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void removeBraintreeListener(Braintree braintree)
    {
        braintree.b(errorListener);
        braintree.b(paymentMethodNonceListener);
    }

    private void showInputInvalidToast()
    {
        Toast.makeText(context, 0x7f070122, 0).show();
    }

    private void vaultBraintree(PaymentFormViewModel paymentformviewmodel, AddressFormViewModel addressformviewmodel)
    {
        final Braintree braintree = Braintree.a(context, "eyJ2ZXJzaW9uIjoyLCJhdXRob3JpemF0aW9uRmluZ2VycHJpbnQiOiI1NDMzOGY2NzFhYTQ0MTgwZTYyNWEyNWNkMWQxMzFkNWNiNGU3MjFiNmJjODY0OTk1OWIwNmMyNDk3ODAwNjVhfGNyZWF0ZWRfYXQ9MjAxNS0wNS0xOFQyMjo1ODoxNi40MTA0MjgxNjYrMDAwMFx1MDAyNmZwc2NvcGVzPXRva2VuaXplXHUwMDI2bWVyY2hhbnRfaWQ9Z2dkaHZocXJtNGpyd2Y0eVx1MDAyNnB1YmxpY19rZXk9NjUzZjR0NWprYnM2a2NwZiIsImNvbmZpZ1VybCI6Imh0dHBzOi8vYXBpLmJyYWludHJlZWdhdGV3YXkuY29tOjQ0My9tZXJjaGFudHMvZ2dkaHZocXJtNGpyd2Y0eS9jbGllbnRfYXBpL3YxL2NvbmZpZ3VyYXRpb24iLCJjaGFsbGVuZ2VzIjpbXSwiZW52aXJvbm1lbnQiOiJwcm9kdWN0aW9uIiwiY2xpZW50QXBpVXJsIjoiaHR0cHM6Ly9hcGkuYnJhaW50cmVlZ2F0ZXdheS5jb206NDQzL21lcmNoYW50cy9nZ2Rodmhxcm00anJ3ZjR5L2NsaWVudF9hcGkiLCJhc3NldHNVcmwiOiJodHRwczovL2Fzc2V0cy5icmFpbnRyZWVnYXRld2F5LmNvbSIsImF1dGhVcmwiOiJodHRwczovL2F1dGgudmVubW8uY29tIiwiYW5hbHl0aWNzIjp7InVybCI6Imh0dHBzOi8vY2xpZW50LWFuYWx5dGljcy5icmFpbnRyZWVnYXRld2F5LmNvbSJ9LCJ0aHJlZURTZWN1cmVFbmFibGVkIjpmYWxzZSwicGF5cGFsRW5hYmxlZCI6ZmFsc2UsImNvaW5iYXNlRW5hYmxlZCI6ZmFsc2UsIm1lcmNoYW50SWQiOiJnZ2Rodmhxcm00anJ3ZjR5IiwidmVubW8iOiJvZmYiLCJhcHBsZVBheSI6eyJzdGF0dXMiOiJwcm9kdWN0aW9uIiwiY291bnRyeUNvZGUiOiJVUyIsImN1cnJlbmN5Q29kZSI6IlVTRCIsIm1lcmNoYW50SWRlbnRpZmllciI6Im1lcmNoYW50LnBpbnRlcmVzdCIsInN1cHBvcnRlZE5ldHdvcmtzIjpbXX19");
        paymentformviewmodel = (new CardBuilder()).a(paymentformviewmodel.getCardNumber()).c(paymentformviewmodel.getExpMonth()).d(paymentformviewmodel.getExpYear()).b(paymentformviewmodel.getCvv()).e(addressformviewmodel.getFirstName()).f(addressformviewmodel.getLastName()).j(addressformviewmodel.getStreetLine1()).g(addressformviewmodel.getCity()).h(addressformviewmodel.getZip()).i(addressformviewmodel.getState());
        errorListener = new _cls2();
        paymentMethodNonceListener = new _cls3();
        braintree.a(errorListener);
        braintree.a(paymentMethodNonceListener);
        braintree.b(paymentformviewmodel);
    }

    private void vaultStripe(PaymentFormViewModel paymentformviewmodel, AddressFormViewModel addressformviewmodel)
    {
        paymentformviewmodel = new Card(paymentformviewmodel.getCardNumber(), Integer.valueOf(Integer.parseInt(paymentformviewmodel.getExpMonth())), Integer.valueOf(Integer.parseInt(paymentformviewmodel.getExpYear())), paymentformviewmodel.getCvv());
        paymentformviewmodel.setName(addressformviewmodel.getFullName());
        paymentformviewmodel.setAddressLine1(addressformviewmodel.getStreetLine1());
        paymentformviewmodel.setAddressLine2(addressformviewmodel.getStreetLine2());
        paymentformviewmodel.setAddressCity(addressformviewmodel.getCity());
        paymentformviewmodel.setAddressZip(addressformviewmodel.getZip());
        paymentformviewmodel.setAddressState(addressformviewmodel.getState());
        if (!paymentformviewmodel.validateCard())
        {
            vaultingFailed = true;
            maybeContinueAddingCard();
            return;
        }
        try
        {
            (new Stripe("pk_live_HguKPnfGM2bgDm8Cpr3AHJik")).createToken(paymentformviewmodel, new _cls1());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PaymentFormViewModel paymentformviewmodel)
        {
            CrashReporting.a(paymentformviewmodel);
        }
        vaultingFailed = true;
        maybeContinueAddingCard();
    }

    public void handleSaveClicked()
    {
        if (originalUserCard != null)
        {
            handleUpdatingCard();
            return;
        }
        PaymentFormViewModel paymentformviewmodel = paymentFormView.getData();
        if (paymentformviewmodel == null)
        {
            showInputInvalidToast();
            return;
        }
        if (shippingAsBillingInit != null && paymentFormView.isBillingAddressSelected())
        {
            addressFormViewModel = new AddressFormViewModel(shippingAsBillingInit);
        } else
        {
            addressFormViewModel = addressFormController.getData();
        }
        if (addressFormViewModel == null)
        {
            showInputInvalidToast();
            return;
        } else
        {
            stripeToken = null;
            braintreeToken = null;
            vaultingFailed = false;
            vaultStripe(paymentformviewmodel, addressFormViewModel);
            vaultBraintree(paymentformviewmodel, addressFormViewModel);
            Events.post(new DialogEvent(new LoadingDialog(0x7f070148)));
            return;
        }
    }

    public void init(DetailedShipping detailedshipping, String s, UserCard usercard, String s1)
    {
        shippingAsBillingInit = detailedshipping;
        originalUserCard = usercard;
        cardIncentiveText = s1;
        detailedshipping = null;
        if (originalUserCard != null)
        {
            detailedshipping = new DetailedShipping(originalUserCard);
            paymentFormViewModel = new PaymentFormViewModel(originalUserCard);
        }
        addressFormController.init(s, detailedshipping, false);
    }

    public void onDestroyView()
    {
        paymentFormView.getAddressFormView().setOnAddressFormSubmitListener(null);
        paymentFormView.setOnPaymentFormSubmitListener(null);
        addressFormController.onDestroyView();
        commerceFormBaseFragment = null;
        paymentFormView = null;
        Events.unregister(eventsSubscriber);
    }

    public void onViewCreated(CommerceFormView commerceformview)
    {
        paymentFormView = (PaymentFormView)commerceformview;
        if (paymentFormViewModel != null)
        {
            paymentFormView.setData(paymentFormViewModel);
        }
        addressFormController.onViewCreated(paymentFormView.getAddressFormView());
        paymentFormView.setOnPaymentFormSubmitListener(new _cls5());
        paymentFormView.getAddressFormView().setOnAddressFormSubmitListener(new _cls6());
        if (shippingAsBillingInit == null || originalUserCard != null)
        {
            paymentFormView.setupForAddressInputOnly(Resources.string(0x7f070143));
        }
        if (shippingAsBillingInit != null)
        {
            paymentFormView.setDetailedShipping(shippingAsBillingInit);
        }
        if (!Strings.isNullOrEmpty(cardIncentiveText))
        {
            paymentFormView.setupIncentive(cardIncentiveText);
        }
        Events.registerSticky(eventsSubscriber, com/pinterest/activity/commerce/event/PaymentScannedEvent, new Class[0]);
    }

    public void setFragment(CommerceFormBaseFragment commerceformbasefragment)
    {
        commerceFormBaseFragment = commerceformbasefragment;
    }


/*
    static boolean access$002(PaymentFormFragmentController paymentformfragmentcontroller, boolean flag)
    {
        paymentformfragmentcontroller.vaultingFailed = flag;
        return flag;
    }

*/



/*
    static String access$202(PaymentFormFragmentController paymentformfragmentcontroller, String s)
    {
        paymentformfragmentcontroller.stripeToken = s;
        return s;
    }

*/



/*
    static String access$402(PaymentFormFragmentController paymentformfragmentcontroller, String s)
    {
        paymentformfragmentcontroller.braintreeToken = s;
        return s;
    }

*/



    private class _cls7
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final PaymentFormFragmentController this$0;

        public void onEventMainThread(PaymentScannedEvent paymentscannedevent)
        {
            Events.removeStickyEvent(paymentscannedevent);
            paymentFormView.updateCreditCardNumber(paymentscannedevent.getCardNumber(), paymentscannedevent.getExpiration());
        }

        _cls7()
        {
            this$0 = PaymentFormFragmentController.this;
            super();
        }
    }


    private class _cls4 extends PinterestCallbackWithDefaultFailure
    {

        final PaymentFormFragmentController this$0;

        public void failure(PinterestError pinteresterror)
        {
            Events.post(new DialogEvent(null));
            super.failure(pinteresterror);
        }

        public void success(ApiResponse apiresponse, Response response)
        {
            Pinalytics.b(EventType.TAP, ElementType.BUYABLE_SETTINGS_PAYMENT_SAVE_BUTTON, null, null);
            Events.post(new DialogEvent(null));
            Events.post(new SecureDialogActivityEvent(com.pinterest.activity.commerce.event.SecureDialogActivityEvent.Type.Close));
            Events.postSticky(new PaymentSelectedEvent((UserCard)apiresponse.getData()));
        }

        public volatile void success(Object obj, Response response)
        {
            success((ApiResponse)obj, response);
        }

        _cls4()
        {
            this$0 = PaymentFormFragmentController.this;
            super();
        }
    }


    private class _cls2
        implements com.braintreepayments.api.Braintree.ErrorListener
    {

        final PaymentFormFragmentController this$0;
        final Braintree val$braintree;

        public void onRecoverableError(ErrorWithResponse errorwithresponse)
        {
            CrashReporting.a(errorwithresponse);
            handleBraintreeFailure(braintree);
        }

        public void onUnrecoverableError(Throwable throwable)
        {
            CrashReporting.a(throwable);
            handleBraintreeFailure(braintree);
        }

        _cls2()
        {
            this$0 = PaymentFormFragmentController.this;
            braintree = braintree1;
            super();
        }
    }


    private class _cls3
        implements com.braintreepayments.api.Braintree.PaymentMethodNonceListener
    {

        final PaymentFormFragmentController this$0;
        final Braintree val$braintree;

        public void onPaymentMethodNonce(String s)
        {
            braintreeToken = s;
            maybeContinueAddingCard();
            removeBraintreeListener(braintree);
        }

        _cls3()
        {
            this$0 = PaymentFormFragmentController.this;
            braintree = braintree1;
            super();
        }
    }


    private class _cls1 extends TokenCallback
    {

        final PaymentFormFragmentController this$0;

        public void onError(Exception exception)
        {
            CrashReporting.a(exception);
            vaultingFailed = true;
            maybeContinueAddingCard();
        }

        public void onSuccess(Token token)
        {
            stripeToken = token.getId();
            maybeContinueAddingCard();
        }

        _cls1()
        {
            this$0 = PaymentFormFragmentController.this;
            super();
        }
    }


    private class _cls5
        implements com.pinterest.activity.commerce.view.PaymentFormView.OnPaymentFormSubmitListener
    {

        final PaymentFormFragmentController this$0;

        public void onPaymentFormSubmit()
        {
            handleSaveClicked();
        }

        _cls5()
        {
            this$0 = PaymentFormFragmentController.this;
            super();
        }
    }


    private class _cls6
        implements com.pinterest.activity.commerce.view.AddressFormView.OnAddressFormSubmitListener
    {

        final PaymentFormFragmentController this$0;

        public void onAddressFormSubmit()
        {
            handleSaveClicked();
        }

        _cls6()
        {
            this$0 = PaymentFormFragmentController.this;
            super();
        }
    }

}
