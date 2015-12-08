// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.paypal;

import android.app.Activity;
import android.os.Bundle;
import com.braintreepayments.api.Braintree;
import com.braintreepayments.api.data.BraintreeData;
import com.braintreepayments.api.data.BraintreeEnvironment;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.payment.ChargeAccount;
import me.lyft.android.domain.payment.PayPalPayment;
import me.lyft.android.domain.payment.Payment;
import me.lyft.android.domain.ride.RideStatus;
import me.lyft.android.infrastructure.activity.ActivityResult;
import me.lyft.android.infrastructure.activity.ActivityService;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.subjects.PublishSubject;
import rx.subscriptions.Subscriptions;

// Referenced classes of package me.lyft.android.infrastructure.paypal:
//            IPayPalService, PayPalChargeData, PayPalServiceException

public class PayPalService extends ActivityService
    implements me.lyft.android.domain.payment.IPaymentFactory.IPaymentMetadataProvider, IPayPalService
{

    private static final BraintreeEnvironment ENVIRONMENT;
    private PublishSubject activityResultSubject;
    private BraintreeData braintreeData;
    private String cachedChargeToken;
    private final IChargeAccountsProvider chargeAccountsProvider;
    private final IPassengerRideProvider passengerRideProvider;
    private final IRideRequestSession rideRequestSession;

    public PayPalService(IChargeAccountsProvider ichargeaccountsprovider, IRideRequestSession iriderequestsession, IPassengerRideProvider ipassengerrideprovider)
    {
        activityResultSubject = PublishSubject.create();
        cachedChargeToken = "{}";
        chargeAccountsProvider = ichargeaccountsprovider;
        rideRequestSession = iriderequestsession;
        passengerRideProvider = ipassengerrideprovider;
    }

    private Observable createPaypalResultObservable(final String braintree, final ActivityResult activityResult)
    {
        braintree = getBraintree(braintree);
        if (activityResult.getResultCode() == 0)
        {
            braintree.finishPayWithPayPal(getCurrentActivity(), activityResult.getResultCode(), activityResult.getIntent());
            return Observable.empty();
        } else
        {
            return Observable.create(new rx.Observable.OnSubscribe() {

                final PayPalService this$0;
                final ActivityResult val$activityResult;
                final Braintree val$braintree;

                public volatile void call(Object obj)
                {
                    call((Subscriber)obj);
                }

                public void call(Subscriber subscriber)
                {
                    final com.braintreepayments.api.Braintree.PaymentMethodNonceListener nonceListener = subscriber. new com.braintreepayments.api.Braintree.PaymentMethodNonceListener() {

                        final _cls3 this$1;
                        final Subscriber val$subscriber;

                        public void onPaymentMethodNonce(String s)
                        {
                            String s1 = braintree.collectDeviceData(getCurrentActivity(), PayPalService.ENVIRONMENT);
                            subscriber.onNext(new PayPalChargeData(s, s1));
                            subscriber.onCompleted();
                        }

            
            {
                this$1 = final__pcls3;
                subscriber = Subscriber.this;
                super();
            }
                    };
                    com.braintreepayments.api.Braintree.ErrorListener errorlistener = subscriber. new com.braintreepayments.api.Braintree.ErrorListener() {

                        final _cls3 this$1;
                        final Subscriber val$subscriber;

                        public void onRecoverableError(ErrorWithResponse errorwithresponse)
                        {
                            subscriber.onError(new PayPalServiceException(errorwithresponse, (new StringBuilder()).append("recoverable_error_").append(errorwithresponse.toString()).toString()));
                        }

                        public void onUnrecoverableError(Throwable throwable)
                        {
                            subscriber.onError(new PayPalServiceException(throwable, (new StringBuilder()).append("unrecoverable_error_").append(throwable.getMessage()).toString()));
                        }

            
            {
                this$1 = final__pcls3;
                subscriber = Subscriber.this;
                super();
            }
                    };
                    subscriber.add(Subscriptions.create(errorlistener. new Action0() {

                        final _cls3 this$1;
                        final com.braintreepayments.api.Braintree.ErrorListener val$errorListener;
                        final com.braintreepayments.api.Braintree.PaymentMethodNonceListener val$nonceListener;

                        public void call()
                        {
                            braintree.removeListener(nonceListener);
                            braintree.removeListener(errorListener);
                        }

            
            {
                this$1 = final__pcls3;
                nonceListener = paymentmethodnoncelistener;
                errorListener = com.braintreepayments.api.Braintree.ErrorListener.this;
                super();
            }
                    }));
                    braintree.addListener(nonceListener);
                    braintree.addListener(errorlistener);
                    braintree.finishPayWithPayPal(getCurrentActivity(), activityResult.getResultCode(), activityResult.getIntent());
                }

            
            {
                this$0 = PayPalService.this;
                braintree = braintree1;
                activityResult = activityresult;
                super();
            }
            });
        }
    }

    private Braintree getBraintree(String s)
    {
        return Braintree.getInstance(getCurrentActivity(), s);
    }

    private void updateRequestRideChargeToken()
    {
        ChargeAccount chargeaccount;
        if (!passengerRideProvider.getPassengerRide().getStatus().isActive())
        {
            if ((chargeaccount = chargeAccountsProvider.getDefaultOrFirstValidChargeAccount()) != null && chargeaccount.isPayPal())
            {
                rideRequestSession.setChargeToken(obtainChargeToken());
                return;
            }
        }
    }

    public String obtainChargeToken()
    {
        if (braintreeData == null)
        {
            return cachedChargeToken;
        } else
        {
            return braintreeData.collectDeviceData();
        }
    }

    public Observable obtainPayPalChargeData(final String clientToken)
    {
        getBraintree(clientToken).startPayWithPayPal(getCurrentActivity(), 22);
        return activityResultSubject.first(new Func1() {

            final PayPalService this$0;

            public Boolean call(ActivityResult activityresult)
            {
                boolean flag;
                if (activityresult.getRequestCode() == 22)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call(Object obj)
            {
                return call((ActivityResult)obj);
            }

            
            {
                this$0 = PayPalService.this;
                super();
            }
        }).flatMap(new Func1() {

            final PayPalService this$0;
            final String val$clientToken;

            public volatile Object call(Object obj)
            {
                return call((ActivityResult)obj);
            }

            public Observable call(ActivityResult activityresult)
            {
                return createPaypalResultObservable(clientToken, activityresult);
            }

            
            {
                this$0 = PayPalService.this;
                clientToken = s;
                super();
            }
        });
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        super.onActivityCreated(activity, bundle);
        braintreeData = new BraintreeData(activity, ENVIRONMENT);
        cachedChargeToken = obtainChargeToken();
    }

    public void onActivityDestroyed(Activity activity)
    {
        super.onActivityDestroyed(activity);
        braintreeData = null;
    }

    public void onActivityResult(Activity activity, ActivityResult activityresult)
    {
        super.onActivityResult(activity, activityresult);
        activityResultSubject.onNext(activityresult);
    }

    public void onActivityResumed(Activity activity)
    {
        super.onActivityResumed(activity);
        updateRequestRideChargeToken();
    }

    public void provideMetadata(Payment payment)
    {
        if (payment instanceof PayPalPayment)
        {
            ((PayPalPayment)payment).setChargeToken(obtainChargeToken());
        }
    }

    static 
    {
        ENVIRONMENT = BraintreeEnvironment.PRODUCTION;
    }




}
