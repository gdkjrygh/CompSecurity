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

class val.subscriber
    implements com.braintreepayments.api.ethodNonceListener
{

    final val.subscriber this$1;
    final Subscriber val$subscriber;

    public void onPaymentMethodNonce(String s)
    {
        String s1 = braintree.collectDeviceData(PayPalService.access$100(_fld0), PayPalService.access$200());
        val$subscriber.onNext(new PayPalChargeData(s, s1));
        val$subscriber.onCompleted();
    }

    l.activityResult()
    {
        this$1 = final_activityresult;
        val$subscriber = Subscriber.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/infrastructure/paypal/PayPalService$3

/* anonymous class */
    class PayPalService._cls3
        implements rx.Observable.OnSubscribe
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
            final PayPalService._cls3._cls1 nonceListener = subscriber. new PayPalService._cls3._cls1();
            final com.braintreepayments.api.Braintree.ErrorListener errorListener = new PayPalService._cls3._cls2();
            subscriber.add(Subscriptions.create(new PayPalService._cls3._cls3()));
            braintree.addListener(nonceListener);
            braintree.addListener(errorListener);
            braintree.finishPayWithPayPal(PayPalService.access$300(PayPalService.this), activityResult.getResultCode(), activityResult.getIntent());
        }

            
            {
                this$0 = final_paypalservice;
                braintree = braintree1;
                activityResult = ActivityResult.this;
                super();
            }

        // Unreferenced inner class me/lyft/android/infrastructure/paypal/PayPalService$3$2

/* anonymous class */
        class PayPalService._cls3._cls2
            implements com.braintreepayments.api.Braintree.ErrorListener
        {

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
        }


        // Unreferenced inner class me/lyft/android/infrastructure/paypal/PayPalService$3$3

/* anonymous class */
        class PayPalService._cls3._cls3
            implements Action0
        {

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
        }

    }

}
