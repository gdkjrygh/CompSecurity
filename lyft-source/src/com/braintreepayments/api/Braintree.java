// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.braintreepayments.api.data.BraintreeEnvironment;
import com.braintreepayments.api.exceptions.AppSwitchNotAvailableException;
import com.braintreepayments.api.exceptions.BraintreeException;
import com.braintreepayments.api.exceptions.ConfigurationException;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.models.Card;
import com.braintreepayments.api.models.CardBuilder;
import com.braintreepayments.api.models.PayPalAccountBuilder;
import com.braintreepayments.api.models.PaymentMethod;
import com.braintreepayments.api.models.ThreeDSecureAuthenticationResponse;
import com.braintreepayments.api.models.ThreeDSecureLookup;
import com.braintreepayments.api.threedsecure.ThreeDSecureWebViewActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

// Referenced classes of package com.braintreepayments.api:
//            BraintreeApi

public class Braintree
{

    protected static final String INTEGRATION_DROPIN = "dropin";
    protected static final Map sInstances = new HashMap();
    private final BraintreeApi mBraintreeApi;
    private List mCachedPaymentMethods;
    private final List mCallbackQueue = new LinkedList();
    private final Set mCreatedListeners = new HashSet();
    private final Set mErrorListeners = new HashSet();
    private final ExecutorService mExecutorService = Executors.newSingleThreadExecutor();
    private String mIntegrationType;
    private final Handler mListenerHandler = new Handler(Looper.getMainLooper());
    private boolean mListenersLocked;
    private final Set mNonceListeners = new HashSet();
    private final Set mUpdatedListeners = new HashSet();

    protected Braintree(String s, BraintreeApi braintreeapi)
    {
        mListenersLocked = false;
        mBraintreeApi = braintreeapi;
        mIntegrationType = "custom";
        sInstances.put(s, this);
    }

    private void addPaymentMethodToCache(PaymentMethod paymentmethod)
    {
        if (mCachedPaymentMethods == null)
        {
            mCachedPaymentMethods = new ArrayList();
        }
        mCachedPaymentMethods.add(0, paymentmethod);
    }

    public static Braintree getInstance(Context context, String s)
    {
        if (sInstances.containsKey(s))
        {
            return (Braintree)sInstances.get(s);
        } else
        {
            return new Braintree(s, new BraintreeApi(context.getApplicationContext(), s));
        }
    }

    private void postCreatedMethodToListeners(final PaymentMethod paymentMethod)
    {
        this;
        JVM INSTR monitorenter ;
        postOrQueueCallback(new ListenerCallback() {

            final Braintree this$0;
            final PaymentMethod val$paymentMethod;

            public void execute()
            {
                PaymentMethodCreatedListener paymentmethodcreatedlistener;
                for (Iterator iterator = mCreatedListeners.iterator(); iterator.hasNext(); mListenerHandler.post(paymentmethodcreatedlistener. new Runnable() {

            final _cls9 this$1;
            final PaymentMethodCreatedListener val$listener;

            public void run()
            {
                listener.onPaymentMethodCreated(paymentMethod);
            }

            
            {
                this$1 = final__pcls9;
                listener = PaymentMethodCreatedListener.this;
                super();
            }
        }))
                {
                    paymentmethodcreatedlistener = (PaymentMethodCreatedListener)iterator.next();
                }

            }

            public boolean hasListeners()
            {
                return !mCreatedListeners.isEmpty();
            }

            
            {
                this$0 = Braintree.this;
                paymentMethod = paymentmethod;
                super();
            }

            private class PaymentMethodCreatedListener
                implements Listener
            {

                public abstract void onPaymentMethodCreated(PaymentMethod paymentmethod);
            }

        });
        this;
        JVM INSTR monitorexit ;
        return;
        paymentMethod;
        throw paymentMethod;
    }

    private void postCreatedNonceToListeners(final String nonce)
    {
        this;
        JVM INSTR monitorenter ;
        postOrQueueCallback(new ListenerCallback() {

            final Braintree this$0;
            final String val$nonce;

            public void execute()
            {
                PaymentMethodNonceListener paymentmethodnoncelistener;
                for (Iterator iterator = mNonceListeners.iterator(); iterator.hasNext(); mListenerHandler.post(paymentmethodnoncelistener. new Runnable() {

            final _cls10 this$1;
            final PaymentMethodNonceListener val$listener;

            public void run()
            {
                listener.onPaymentMethodNonce(nonce);
            }

            
            {
                this$1 = final__pcls10;
                listener = PaymentMethodNonceListener.this;
                super();
            }
        }))
                {
                    paymentmethodnoncelistener = (PaymentMethodNonceListener)iterator.next();
                }

            }

            public boolean hasListeners()
            {
                return !mNonceListeners.isEmpty();
            }

            
            {
                this$0 = Braintree.this;
                nonce = s;
                super();
            }

            private class PaymentMethodNonceListener
                implements Listener
            {

                public abstract void onPaymentMethodNonce(String s);
            }

        });
        this;
        JVM INSTR monitorexit ;
        return;
        nonce;
        throw nonce;
    }

    private void postPaymentMethodsToListeners(List list)
    {
        this;
        JVM INSTR monitorenter ;
        postOrQueueCallback(new ListenerCallback() {

            final Braintree this$0;
            final List val$paymentMethodsSafe;

            public void execute()
            {
                PaymentMethodsUpdatedListener paymentmethodsupdatedlistener;
                for (Iterator iterator = mUpdatedListeners.iterator(); iterator.hasNext(); mListenerHandler.post(paymentmethodsupdatedlistener. new Runnable() {

            final _cls8 this$1;
            final PaymentMethodsUpdatedListener val$listener;

            public void run()
            {
                listener.onPaymentMethodsUpdated(paymentMethodsSafe);
            }

            
            {
                this$1 = final__pcls8;
                listener = PaymentMethodsUpdatedListener.this;
                super();
            }
        }))
                {
                    paymentmethodsupdatedlistener = (PaymentMethodsUpdatedListener)iterator.next();
                }

            }

            public boolean hasListeners()
            {
                return !mUpdatedListeners.isEmpty();
            }

            
            {
                this$0 = Braintree.this;
                paymentMethodsSafe = list;
                super();
            }

            private class PaymentMethodsUpdatedListener
                implements Listener
            {

                public abstract void onPaymentMethodsUpdated(List list);
            }

        });
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
    }

    private void postRecoverableErrorToListeners(final ErrorWithResponse error)
    {
        this;
        JVM INSTR monitorenter ;
        postOrQueueCallback(new ListenerCallback() {

            final Braintree this$0;
            final ErrorWithResponse val$error;

            public void execute()
            {
                ErrorListener errorlistener;
                for (Iterator iterator = mErrorListeners.iterator(); iterator.hasNext(); mListenerHandler.post(errorlistener. new Runnable() {

            final _cls12 this$1;
            final ErrorListener val$listener;

            public void run()
            {
                listener.onRecoverableError(error);
            }

            
            {
                this$1 = final__pcls12;
                listener = ErrorListener.this;
                super();
            }
        }))
                {
                    errorlistener = (ErrorListener)iterator.next();
                }

            }

            public boolean hasListeners()
            {
                return !mErrorListeners.isEmpty();
            }

            
            {
                this$0 = Braintree.this;
                error = errorwithresponse;
                super();
            }

            private class ErrorListener
                implements Listener
            {

                public abstract void onRecoverableError(ErrorWithResponse errorwithresponse);

                public abstract void onUnrecoverableError(Throwable throwable);
            }

        });
        this;
        JVM INSTR monitorexit ;
        return;
        error;
        throw error;
    }

    public static void reset()
    {
        sInstances.clear();
    }

    public void addListener(Listener listener)
    {
        this;
        JVM INSTR monitorenter ;
        if (listener instanceof PaymentMethodsUpdatedListener)
        {
            mUpdatedListeners.add((PaymentMethodsUpdatedListener)listener);
        }
        if (listener instanceof PaymentMethodCreatedListener)
        {
            mCreatedListeners.add((PaymentMethodCreatedListener)listener);
        }
        if (listener instanceof PaymentMethodNonceListener)
        {
            mNonceListeners.add((PaymentMethodNonceListener)listener);
        }
        if (listener instanceof ErrorListener)
        {
            mErrorListeners.add((ErrorListener)listener);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        listener;
        throw listener;
    }

    protected String analyticsPrefix()
    {
        return (new StringBuilder()).append(mIntegrationType).append(".android").toString();
    }

    public String collectDeviceData(Activity activity, BraintreeEnvironment braintreeenvironment)
    {
        return mBraintreeApi.collectDeviceData(activity, braintreeenvironment);
    }

    public String collectDeviceData(Activity activity, String s, String s1)
    {
        return mBraintreeApi.collectDeviceData(activity, s, s1);
    }

    public void create(com.braintreepayments.api.models.PaymentMethod.Builder builder)
    {
        this;
        JVM INSTR monitorenter ;
        createHelper(builder);
        this;
        JVM INSTR monitorexit ;
        return;
        builder;
        throw builder;
    }

    protected Future createHelper(final com.braintreepayments.api.models.PaymentMethod.Builder paymentMethodBuilder)
    {
        this;
        JVM INSTR monitorenter ;
        paymentMethodBuilder = mExecutorService.submit(new Runnable() {

            final Braintree this$0;
            final com.braintreepayments.api.models.PaymentMethod.Builder val$paymentMethodBuilder;

            public void run()
            {
                try
                {
                    PaymentMethod paymentmethod = mBraintreeApi.create(paymentMethodBuilder);
                    addPaymentMethodToCache(paymentmethod);
                    postCreatedMethodToListeners(paymentmethod);
                    postCreatedNonceToListeners(paymentmethod.getNonce());
                    return;
                }
                catch (BraintreeException braintreeexception)
                {
                    postUnrecoverableErrorToListeners(braintreeexception);
                    return;
                }
                catch (ErrorWithResponse errorwithresponse)
                {
                    postRecoverableErrorToListeners(errorwithresponse);
                }
            }

            
            {
                this$0 = Braintree.this;
                paymentMethodBuilder = builder;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return paymentMethodBuilder;
        paymentMethodBuilder;
        throw paymentMethodBuilder;
    }

    public void finishPayWithPayPal(int i, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        intent = mBraintreeApi.handlePayPalResponse(null, i, intent);
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        create(intent);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        intent;
        postUnrecoverableErrorToListeners(intent);
        if (true) goto _L2; else goto _L1
_L1:
        intent;
        throw intent;
    }

    public void finishPayWithPayPal(Activity activity, int i, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        activity = mBraintreeApi.handlePayPalResponse(activity, i, intent);
        if (activity == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        create(activity);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        postUnrecoverableErrorToListeners(activity);
        if (true) goto _L2; else goto _L1
_L1:
        activity;
        throw activity;
    }

    public void finishPayWithVenmo(int i, final Intent nonce)
    {
        this;
        JVM INSTR monitorenter ;
        nonce = mBraintreeApi.finishPayWithVenmo(i, nonce);
        if (TextUtils.isEmpty(nonce)) goto _L2; else goto _L1
_L1:
        mExecutorService.submit(new Runnable() {

            final Braintree this$0;
            final String val$nonce;

            public void run()
            {
                try
                {
                    PaymentMethod paymentmethod = mBraintreeApi.getPaymentMethod(nonce);
                    paymentmethod.setSource("venmo-app");
                    addPaymentMethodToCache(paymentmethod);
                    postCreatedMethodToListeners(paymentmethod);
                    postCreatedNonceToListeners(nonce);
                    sendAnalyticsEvent("venmo-app.success");
                    return;
                }
                catch (BraintreeException braintreeexception)
                {
                    postUnrecoverableErrorToListeners(braintreeexception);
                    return;
                }
                catch (JSONException jsonexception)
                {
                    postUnrecoverableErrorToListeners(jsonexception);
                    return;
                }
                catch (ErrorWithResponse errorwithresponse)
                {
                    postRecoverableErrorToListeners(errorwithresponse);
                }
            }

            
            {
                this$0 = Braintree.this;
                nonce = s;
                super();
            }
        });
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        sendAnalyticsEvent("venmo-app.fail");
        if (true) goto _L4; else goto _L3
_L3:
        nonce;
        throw nonce;
    }

    public void finishThreeDSecureVerification(int i, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (i != -1) goto _L2; else goto _L1
_L1:
        intent = (ThreeDSecureAuthenticationResponse)intent.getParcelableExtra("com.braintreepayments.api.EXTRA_THREE_D_SECURE_RESULT");
        if (!intent.isSuccess()) goto _L4; else goto _L3
_L3:
        postCreatedMethodToListeners(intent.getCard());
        postCreatedNonceToListeners(intent.getCard().getNonce());
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (intent.getException() == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        postUnrecoverableErrorToListeners(new BraintreeException(intent.getException()));
          goto _L2
        intent;
        throw intent;
        postRecoverableErrorToListeners(new ErrorWithResponse(422, intent.getErrors()));
          goto _L2
    }

    public List getCachedPaymentMethods()
    {
        this;
        JVM INSTR monitorenter ;
        if (mCachedPaymentMethods != null) goto _L2; else goto _L1
_L1:
        List list = Collections.emptyList();
_L4:
        this;
        JVM INSTR monitorexit ;
        return list;
_L2:
        list = Collections.unmodifiableList(mCachedPaymentMethods);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected String getIntegrationType()
    {
        return mIntegrationType;
    }

    public void getPaymentMethods()
    {
        this;
        JVM INSTR monitorenter ;
        getPaymentMethodsHelper();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected Future getPaymentMethodsHelper()
    {
        this;
        JVM INSTR monitorenter ;
        Future future = mExecutorService.submit(new Runnable() {

            final Braintree this$0;

            public void run()
            {
                try
                {
                    List list = mBraintreeApi.getPaymentMethods();
                    mCachedPaymentMethods = list;
                    postPaymentMethodsToListeners(list);
                    return;
                }
                catch (BraintreeException braintreeexception)
                {
                    postUnrecoverableErrorToListeners(braintreeexception);
                    return;
                }
                catch (ErrorWithResponse errorwithresponse)
                {
                    postRecoverableErrorToListeners(errorwithresponse);
                }
            }

            
            {
                this$0 = Braintree.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return future;
        Exception exception;
        exception;
        throw exception;
    }

    public PayPalAccountBuilder handlePayPalResponse(Activity activity, int i, Intent intent)
    {
        try
        {
            activity = mBraintreeApi.handlePayPalResponse(activity, i, intent);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            postUnrecoverableErrorToListeners(activity);
            return null;
        }
        return activity;
    }

    public boolean hasCachedCards()
    {
        this;
        JVM INSTR monitorenter ;
        List list = mCachedPaymentMethods;
        boolean flag;
        if (list != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isCvvChallenegePresent()
    {
        return mBraintreeApi.isCvvChallengePresent();
    }

    public boolean isPayPalEnabled()
    {
        return mBraintreeApi.isPayPalEnabled();
    }

    public boolean isPostalCodeChallengePresent()
    {
        return mBraintreeApi.isPostalCodeChallengePresent();
    }

    public boolean isThreeDSecureEnabled()
    {
        return mBraintreeApi.isThreeDSecureEnabled();
    }

    public boolean isVenmoEnabled()
    {
        return mBraintreeApi.isVenmoEnabled();
    }

    public void lockListeners()
    {
        this;
        JVM INSTR monitorenter ;
        mListenersLocked = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void postOrQueueCallback(ListenerCallback listenercallback)
    {
        if (mListenersLocked || !listenercallback.hasListeners())
        {
            mCallbackQueue.add(listenercallback);
            return;
        } else
        {
            listenercallback.execute();
            return;
        }
    }

    protected void postUnrecoverableErrorToListeners(final Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        postOrQueueCallback(new ListenerCallback() {

            final Braintree this$0;
            final Throwable val$throwable;

            public void execute()
            {
                ErrorListener errorlistener;
                for (Iterator iterator = mErrorListeners.iterator(); iterator.hasNext(); mListenerHandler.post(errorlistener. new Runnable() {

            final _cls11 this$1;
            final ErrorListener val$listener;

            public void run()
            {
                listener.onUnrecoverableError(throwable);
            }

            
            {
                this$1 = final__pcls11;
                listener = ErrorListener.this;
                super();
            }
        }))
                {
                    errorlistener = (ErrorListener)iterator.next();
                }

            }

            public boolean hasListeners()
            {
                return !mErrorListeners.isEmpty();
            }

            
            {
                this$0 = Braintree.this;
                throwable = throwable1;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        throwable;
        throw throwable;
    }

    public void removeListener(Listener listener)
    {
        this;
        JVM INSTR monitorenter ;
        if (listener instanceof PaymentMethodsUpdatedListener)
        {
            mUpdatedListeners.remove(listener);
        }
        if (listener instanceof PaymentMethodCreatedListener)
        {
            mCreatedListeners.remove(listener);
        }
        if (listener instanceof PaymentMethodNonceListener)
        {
            mNonceListeners.remove(listener);
        }
        if (listener instanceof ErrorListener)
        {
            mErrorListeners.remove(listener);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        listener;
        throw listener;
    }

    public void sendAnalyticsEvent(String s)
    {
        this;
        JVM INSTR monitorenter ;
        sendAnalyticsEventHelper((new StringBuilder()).append(analyticsPrefix()).append(".").append(s).toString(), getIntegrationType());
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void sendAnalyticsEvent(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        sendAnalyticsEventHelper(s, s1);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    protected Future sendAnalyticsEventHelper(final String event, final String integrationType)
    {
        this;
        JVM INSTR monitorenter ;
        event = mExecutorService.submit(new Runnable() {

            final Braintree this$0;
            final String val$event;
            final String val$integrationType;

            public void run()
            {
                mBraintreeApi.sendAnalyticsEvent(event, integrationType);
            }

            
            {
                this$0 = Braintree.this;
                event = s;
                integrationType = s1;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return event;
        event;
        throw event;
    }

    public void setIntegrationDropin()
    {
        mIntegrationType = "dropin";
    }

    public void startPayWithPayPal(Activity activity, int i)
    {
        sendAnalyticsEvent("add-paypal.start");
        mBraintreeApi.startPayWithPayPal(activity, i);
    }

    public void startPayWithVenmo(Activity activity, int i)
    {
        try
        {
            mBraintreeApi.startPayWithVenmo(activity, i);
            sendAnalyticsEvent("add-venmo.start");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            sendAnalyticsEvent("add-venmo.unavailable");
        }
        postUnrecoverableErrorToListeners(activity);
    }

    public void startThreeDSecureVerification(final Activity activity, final int requestCode, final CardBuilder cardBuilder, final String amount)
    {
        this;
        JVM INSTR monitorenter ;
        mExecutorService.submit(new Runnable() {

            final Braintree this$0;
            final Activity val$activity;
            final String val$amount;
            final CardBuilder val$cardBuilder;
            final int val$requestCode;

            public void run()
            {
                try
                {
                    String s = mBraintreeApi.tokenize(cardBuilder);
                    startThreeDSecureVerification(activity, requestCode, s, amount);
                    return;
                }
                catch (BraintreeException braintreeexception)
                {
                    postUnrecoverableErrorToListeners(braintreeexception);
                    return;
                }
                catch (ErrorWithResponse errorwithresponse)
                {
                    postRecoverableErrorToListeners(errorwithresponse);
                }
            }

            
            {
                this$0 = Braintree.this;
                cardBuilder = cardbuilder;
                activity = activity1;
                requestCode = i;
                amount = s;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        throw activity;
    }

    public void startThreeDSecureVerification(final Activity activity, final int requestCode, final String nonce, final String amount)
    {
        this;
        JVM INSTR monitorenter ;
        mExecutorService.submit(new Runnable() {

            final Braintree this$0;
            final Activity val$activity;
            final String val$amount;
            final String val$nonce;
            final int val$requestCode;

            public void run()
            {
                Object obj;
                obj = mBraintreeApi.threeDSecureLookup(nonce, amount);
                if (((ThreeDSecureLookup) (obj)).getAcsUrl() != null)
                {
                    obj = (new Intent(activity, com/braintreepayments/api/threedsecure/ThreeDSecureWebViewActivity)).putExtra("com.braintreepayments.api.EXTRA_THREE_D_SECURE_LOOKUP", ((android.os.Parcelable) (obj)));
                    activity.startActivityForResult(((Intent) (obj)), requestCode);
                    return;
                }
                try
                {
                    postCreatedMethodToListeners(((ThreeDSecureLookup) (obj)).getCard());
                    postCreatedNonceToListeners(((ThreeDSecureLookup) (obj)).getCard().getNonce());
                    return;
                }
                catch (BraintreeException braintreeexception)
                {
                    postUnrecoverableErrorToListeners(braintreeexception);
                    return;
                }
                catch (JSONException jsonexception)
                {
                    postUnrecoverableErrorToListeners(jsonexception);
                    return;
                }
                catch (ErrorWithResponse errorwithresponse)
                {
                    postRecoverableErrorToListeners(errorwithresponse);
                }
                return;
            }

            
            {
                this$0 = Braintree.this;
                nonce = s;
                amount = s1;
                activity = activity1;
                requestCode = i;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        throw activity;
    }

    public void tokenize(com.braintreepayments.api.models.PaymentMethod.Builder builder)
    {
        this;
        JVM INSTR monitorenter ;
        tokenizeHelper(builder);
        this;
        JVM INSTR monitorexit ;
        return;
        builder;
        throw builder;
    }

    protected Future tokenizeHelper(final com.braintreepayments.api.models.PaymentMethod.Builder paymentMethodBuilder)
    {
        this;
        JVM INSTR monitorenter ;
        paymentMethodBuilder = mExecutorService.submit(new Runnable() {

            final Braintree this$0;
            final com.braintreepayments.api.models.PaymentMethod.Builder val$paymentMethodBuilder;

            public void run()
            {
                try
                {
                    String s = mBraintreeApi.tokenize(paymentMethodBuilder);
                    postCreatedNonceToListeners(s);
                    return;
                }
                catch (BraintreeException braintreeexception)
                {
                    postUnrecoverableErrorToListeners(braintreeexception);
                    return;
                }
                catch (ErrorWithResponse errorwithresponse)
                {
                    postRecoverableErrorToListeners(errorwithresponse);
                }
            }

            
            {
                this$0 = Braintree.this;
                paymentMethodBuilder = builder;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return paymentMethodBuilder;
        paymentMethodBuilder;
        throw paymentMethodBuilder;
    }

    public void unlockListeners()
    {
        this;
        JVM INSTR monitorenter ;
        mListenersLocked = false;
        Object obj = new ArrayList();
        ((List) (obj)).addAll(mCallbackQueue);
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ListenerCallback listenercallback = (ListenerCallback)((Iterator) (obj)).next();
            if (listenercallback.hasListeners())
            {
                listenercallback.execute();
                mCallbackQueue.remove(listenercallback);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_86;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }





/*
    static List access$102(Braintree braintree, List list)
    {
        braintree.mCachedPaymentMethods = list;
        return list;
    }

*/










    private class ListenerCallback
    {

        public abstract void execute();

        public abstract boolean hasListeners();
    }

}
