// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import android.app.Activity;
import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.payments.googleplay.BillingService;
import com.soundcloud.android.payments.googleplay.Payload;
import com.soundcloud.android.rx.ScSchedulers;
import java.util.concurrent.TimeUnit;
import rx.R;
import rx.a.b.a;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.payments:
//            TokenStorage, AvailableProducts, CheckoutUpdated, PurchaseStatus, 
//            UpdateCheckout, StartCheckout, CheckoutStarted

class PaymentOperations
{

    private static final int API_VERSION = 1;
    private static final f IGNORE_PENDING = new _cls2();
    private static final f TO_STATUS = new _cls1();
    private static final int VERIFY_THROTTLE_SECONDS = 2;
    private final ApiClientRx api;
    private final rx.b.a clearToken;
    private final BillingService playBilling;
    private final f productToResult;
    private final rx.b.b saveToken;
    private final R scheduler;
    private final TokenStorage tokenStorage;
    private final f verifyPendingSubscription;

    PaymentOperations(ApiClientRx apiclientrx, BillingService billingservice, TokenStorage tokenstorage)
    {
        this(ScSchedulers.HIGH_PRIO_SCHEDULER, apiclientrx, billingservice, tokenstorage);
    }

    PaymentOperations(R r, ApiClientRx apiclientrx, BillingService billingservice, TokenStorage tokenstorage)
    {
        verifyPendingSubscription = new _cls3();
        productToResult = new _cls4();
        saveToken = new _cls5();
        clearToken = new _cls6();
        scheduler = r;
        api = apiclientrx;
        playBilling = billingservice;
        tokenStorage = tokenstorage;
    }

    private ApiRequest buildUpdateRequest(UpdateCheckout updatecheckout)
    {
        return ApiRequest.post(ApiEndpoints.CHECKOUT_URN.path(new Object[] {
            tokenStorage.getCheckoutToken()
        })).forPrivateApi(1).withContent(updatecheckout).build();
    }

    private b fetchAvailableProducts()
    {
        ApiRequest apirequest = ApiRequest.get(ApiEndpoints.PRODUCTS.path()).forPrivateApi(1).build();
        return api.mappedResponse(apirequest, com/soundcloud/android/payments/AvailableProducts).subscribeOn(scheduler);
    }

    private b getStatus()
    {
        ApiRequest apirequest = ApiRequest.get(ApiEndpoints.CHECKOUT_URN.path(new Object[] {
            tokenStorage.getCheckoutToken()
        })).forPrivateApi(1).build();
        return api.mappedResponse(apirequest, com/soundcloud/android/payments/CheckoutUpdated).subscribeOn(scheduler).map(CheckoutUpdated.TO_STATUS);
    }

    private b getSubscriptionId()
    {
        return fetchAvailableProducts().map(AvailableProducts.TO_PRODUCT);
    }

    private rx.b.b launchPaymentFlow(final String id)
    {
        return new _cls7();
    }

    private b pollStatus()
    {
        return b.interval(2L, TimeUnit.SECONDS, scheduler).take(4).flatMap(new _cls9()).filter(IGNORE_PENDING).firstOrDefault(PurchaseStatus.VERIFY_TIMEOUT);
    }

    private b queryProduct(String s)
    {
        return playBilling.getDetails(s).subscribeOn(scheduler);
    }

    private b update(Payload payload)
    {
        return api.response(buildUpdateRequest(UpdateCheckout.fromSuccess(payload))).subscribeOn(scheduler).map(TO_STATUS);
    }

    public b cancel(String s)
    {
        return api.response(buildUpdateRequest(UpdateCheckout.fromFailure(s))).subscribeOn(scheduler).doOnCompleted(clearToken);
    }

    b connect(Activity activity)
    {
        return playBilling.openConnection(activity);
    }

    void disconnect()
    {
        playBilling.closeConnection();
    }

    b purchase(String s)
    {
        ApiRequest apirequest = ApiRequest.post(ApiEndpoints.CHECKOUT.path()).forPrivateApi(1).withContent(new StartCheckout(s)).build();
        return api.mappedResponse(apirequest, com/soundcloud/android/payments/CheckoutStarted).subscribeOn(scheduler).map(CheckoutStarted.TOKEN).doOnNext(saveToken).doOnNext(launchPaymentFlow(s)).observeOn(a.a());
    }

    b queryProduct()
    {
        return getSubscriptionId().flatMap(productToResult).observeOn(a.a());
    }

    b queryStatus()
    {
        return playBilling.getStatus().subscribeOn(scheduler).flatMap(verifyPendingSubscription).observeOn(a.a());
    }

    b verify(Payload payload)
    {
        return update(payload).flatMap(new _cls8()).doOnCompleted(clearToken).observeOn(a.a());
    }







    private class _cls3
        implements f
    {

        final PaymentOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((SubscriptionStatus)obj);
        }

        public b call(SubscriptionStatus subscriptionstatus)
        {
            if (subscriptionstatus.isSubscribed())
            {
                tokenStorage.setCheckoutToken(subscriptionstatus.getToken());
                return verify(subscriptionstatus.getPayload());
            } else
            {
                return b.just(PurchaseStatus.NONE);
            }
        }

        _cls3()
        {
            this$0 = PaymentOperations.this;
            super();
        }
    }


    private class _cls4
        implements f
    {

        final PaymentOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((AvailableProducts.Product)obj);
        }

        public b call(AvailableProducts.Product product)
        {
            if (product.isEmpty())
            {
                return b.just(ProductStatus.fromNoProduct());
            } else
            {
                return queryProduct(product.id).map(ProductStatus.SUCCESS);
            }
        }

        _cls4()
        {
            this$0 = PaymentOperations.this;
            super();
        }
    }


    private class _cls5
        implements rx.b.b
    {

        final PaymentOperations this$0;

        public volatile void call(Object obj)
        {
            call((String)obj);
        }

        public void call(String s)
        {
            tokenStorage.setCheckoutToken(s);
        }

        _cls5()
        {
            this$0 = PaymentOperations.this;
            super();
        }
    }


    private class _cls6
        implements rx.b.a
    {

        final PaymentOperations this$0;

        public void call()
        {
            tokenStorage.clear();
        }

        _cls6()
        {
            this$0 = PaymentOperations.this;
            super();
        }
    }


    private class _cls7
        implements rx.b.b
    {

        final PaymentOperations this$0;
        final String val$id;

        public volatile void call(Object obj)
        {
            call((String)obj);
        }

        public void call(String s)
        {
            playBilling.startPurchase(id, s);
        }

        _cls7()
        {
            this$0 = PaymentOperations.this;
            id = s;
            super();
        }
    }


    private class _cls9
        implements f
    {

        final PaymentOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((Long)obj);
        }

        public b call(Long long1)
        {
            return getStatus();
        }

        _cls9()
        {
            this$0 = PaymentOperations.this;
            super();
        }
    }


    private class _cls8
        implements f
    {

        final PaymentOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((PurchaseStatus)obj);
        }

        public b call(PurchaseStatus purchasestatus)
        {
            if (purchasestatus.isPending())
            {
                return pollStatus();
            } else
            {
                return b.just(PurchaseStatus.UPDATE_FAIL);
            }
        }

        _cls8()
        {
            this$0 = PaymentOperations.this;
            super();
        }
    }


    private class _cls1
        implements f
    {

        public final PurchaseStatus call(ApiResponse apiresponse)
        {
            if (apiresponse.isSuccess())
            {
                return PurchaseStatus.PENDING;
            } else
            {
                return PurchaseStatus.UPDATE_FAIL;
            }
        }

        public final volatile Object call(Object obj)
        {
            return call((ApiResponse)obj);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements f
    {

        public final Boolean call(PurchaseStatus purchasestatus)
        {
            boolean flag;
            if (!purchasestatus.isPending())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public final volatile Object call(Object obj)
        {
            return call((PurchaseStatus)obj);
        }

        _cls2()
        {
        }
    }

}
