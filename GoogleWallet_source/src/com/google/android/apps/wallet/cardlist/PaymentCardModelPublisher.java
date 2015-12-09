// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.cardlist;

import android.os.Handler;
import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.paymentcard.api.CredentialManager;
import com.google.android.apps.wallet.paymentcard.api.CredentialsChangedEvent;
import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import com.google.android.apps.wallet.refresh.RequestRefreshEvent;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.cardlist:
//            PaymentCardModelEvent, PaymentCardModel

public class PaymentCardModelPublisher
    implements InitializedEventPublisher
{

    private static final TimeUnit CACHE_TTL_UNIT;
    private static final String TAG = com/google/android/apps/wallet/cardlist/PaymentCardModelPublisher.getSimpleName();
    private final ActionExecutor actionExecutor;
    private final CredentialManager credentialManager;
    private final EventBus eventBus;
    private Exception lastRpcException;
    private long lastSuccessfulRpcTimeMillis;
    private final Handler mainThreadHandler;
    private final System system;
    private final ThreadChecker threadChecker;

    PaymentCardModelPublisher(EventBus eventbus, CredentialManager credentialmanager, ActionExecutor actionexecutor, System system1, Handler handler, ThreadChecker threadchecker)
    {
        credentialManager = credentialmanager;
        eventBus = eventbus;
        actionExecutor = actionexecutor;
        system = system1;
        mainThreadHandler = handler;
        threadChecker = threadchecker;
    }

    private void fetchCredentialsFromServerAndPostIfChanged()
    {
        ThreadChecker threadchecker = threadChecker;
        ThreadChecker.checkOnUiThread();
        actionExecutor.executeAction(new Callable() {

            final PaymentCardModelPublisher this$0;

            private Boolean call()
                throws Exception
            {
                return Boolean.valueOf(credentialManager.fetch());
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = PaymentCardModelPublisher.this;
                super();
            }
        }, new AsyncCallback() {

            final PaymentCardModelPublisher this$0;

            private void onSuccess(Boolean boolean1)
            {
                lastRpcException = null;
                PaymentCardModelPublisher paymentcardmodelpublisher = PaymentCardModelPublisher.this;
                System _tmp = system;
                paymentcardmodelpublisher.lastSuccessfulRpcTimeMillis = System.currentTimeMillis();
                if (boolean1.booleanValue())
                {
                    getCredentialsFromDatabaseAndPost(null);
                    eventBus.post(new CredentialsChangedEvent());
                }
            }

            public final void onFailure(Exception exception)
            {
                lastRpcException = exception;
                getCredentialsFromDatabaseAndPost(null);
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((Boolean)obj);
            }

            
            {
                this$0 = PaymentCardModelPublisher.this;
                super();
            }
        });
    }

    private void getCredentialsFromDatabaseAndPost(final Runnable doAfter)
    {
        ThreadChecker threadchecker = threadChecker;
        ThreadChecker.checkOnUiThread();
        actionExecutor.executeAction(new Callable() {

            final PaymentCardModelPublisher this$0;

            private List call()
                throws Exception
            {
                List list = credentialManager.getAll();
                Collections.sort(list, PaymentCardModelPublisher.orderByNickname());
                return list;
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = PaymentCardModelPublisher.this;
                super();
            }
        }, new AsyncCallback() {

            final PaymentCardModelPublisher this$0;
            final Runnable val$doAfter;

            private void onSuccess(List list)
            {
                list = new PaymentCardModelEvent(new PaymentCardModel(list), lastRpcException);
                eventBus.post(list);
                if (doAfter != null)
                {
                    doAfter.run();
                }
            }

            public final void onFailure(Exception exception)
            {
                WLog.e(PaymentCardModelPublisher.TAG, "Exception retrieving PaymentCards from db", exception);
                if (doAfter != null)
                {
                    doAfter.run();
                }
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((List)obj);
            }

            
            {
                this$0 = PaymentCardModelPublisher.this;
                doAfter = runnable;
                super();
            }
        });
    }

    private static Comparator orderByNickname()
    {
        return new Comparator() {

            private static int compare(PaymentCard paymentcard, PaymentCard paymentcard1)
            {
                return paymentcard.getNickname().compareTo(paymentcard1.getNickname());
            }

            public final volatile int compare(Object obj, Object obj1)
            {
                return compare((PaymentCard)obj, (PaymentCard)obj1);
            }

        };
    }

    public final void delete(PaymentCard paymentcard)
        throws RpcException
    {
        ThreadChecker threadchecker = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        if (credentialManager.delete(paymentcard))
        {
            mainThreadHandler.post(new Runnable() {

                final PaymentCardModelPublisher this$0;

                public final void run()
                {
                    getCredentialsFromDatabaseAndPost(null);
                    eventBus.post(new CredentialsChangedEvent());
                }

            
            {
                this$0 = PaymentCardModelPublisher.this;
                super();
            }
            });
        }
    }

    protected final void handleRegistrationEvent()
    {
        ThreadChecker threadchecker = threadChecker;
        ThreadChecker.checkOnUiThread();
        getCredentialsFromDatabaseAndPost(new Runnable() {

            final PaymentCardModelPublisher this$0;

            public final void run()
            {
                System _tmp = system;
                if (System.currentTimeMillis() > lastSuccessfulRpcTimeMillis + PaymentCardModelPublisher.CACHE_TTL_UNIT.toMillis(5L))
                {
                    fetchCredentialsFromServerAndPostIfChanged();
                }
            }

            
            {
                this$0 = PaymentCardModelPublisher.this;
                super();
            }
        });
    }

    public final void initialize()
    {
        eventBus.register(this);
        eventBus.registerEventProducer(com/google/android/apps/wallet/cardlist/PaymentCardModelEvent, new RegistrationCallback() {

            final PaymentCardModelPublisher this$0;

            public final void handleRegistration(Object obj)
            {
                handleRegistrationEvent();
            }

            
            {
                this$0 = PaymentCardModelPublisher.this;
                super();
            }
        });
    }

    public final void invalidateCacheAndFetch()
    {
        fetchCredentialsFromServerAndPostIfChanged();
    }

    void onRequestRefreshEvent(RequestRefreshEvent requestrefreshevent)
    {
        fetchCredentialsFromServerAndPostIfChanged();
    }

    static 
    {
        CACHE_TTL_UNIT = TimeUnit.MINUTES;
    }




/*
    static long access$102(PaymentCardModelPublisher paymentcardmodelpublisher, long l)
    {
        paymentcardmodelpublisher.lastSuccessfulRpcTimeMillis = l;
        return l;
    }

*/






/*
    static Exception access$502(PaymentCardModelPublisher paymentcardmodelpublisher, Exception exception)
    {
        paymentcardmodelpublisher.lastRpcException = exception;
        return exception;
    }

*/




}
