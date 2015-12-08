// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.paypal;

import com.braintreepayments.api.Braintree;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import me.lyft.android.infrastructure.activity.ActivityResult;
import rx.Subscriber;
import rx.functions.Action0;
import rx.subscriptions.Subscriptions;

// Referenced classes of package me.lyft.android.infrastructure.paypal:
//            PayPalService, PayPalChargeData, PayPalServiceException

class 
    implements rx.scribe
{

    final PayPalService this$0;
    final ActivityResult val$activityResult;
    final Braintree val$braintree;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(final Subscriber subscriber)
    {
        final com.braintreepayments.api.tMethodNonceListener nonceListener = new com.braintreepayments.api.Braintree.PaymentMethodNonceListener() {

            final PayPalService._cls3 this$1;
            final Subscriber val$subscriber;

            public void onPaymentMethodNonce(String s)
            {
                String s1 = braintree.collectDeviceData(PayPalService.access$100(this$0), PayPalService.access$200());
                subscriber.onNext(new PayPalChargeData(s, s1));
                subscriber.onCompleted();
            }

            
            {
                this$1 = PayPalService._cls3.this;
                subscriber = subscriber1;
                super();
            }
        };
        final com.braintreepayments.api.istener errorListener = new com.braintreepayments.api.Braintree.ErrorListener() {

            final PayPalService._cls3 this$1;
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
                this$1 = PayPalService._cls3.this;
                subscriber = subscriber1;
                super();
            }
        };
        subscriber.add(Subscriptions.create(new Action0() {

            final PayPalService._cls3 this$1;
            final com.braintreepayments.api.Braintree.ErrorListener val$errorListener;
            final com.braintreepayments.api.Braintree.PaymentMethodNonceListener val$nonceListener;

            public void call()
            {
                braintree.removeListener(nonceListener);
                braintree.removeListener(errorListener);
            }

            
            {
                this$1 = PayPalService._cls3.this;
                nonceListener = paymentmethodnoncelistener;
                errorListener = errorlistener;
                super();
            }
        }));
        val$braintree.addListener(nonceListener);
        val$braintree.addListener(errorListener);
        val$braintree.finishPayWithPayPal(PayPalService.access$300(PayPalService.this), val$activityResult.getResultCode(), val$activityResult.getIntent());
    }

    ()
    {
        this$0 = final_paypalservice;
        val$braintree = braintree1;
        val$activityResult = ActivityResult.this;
        super();
    }
}
