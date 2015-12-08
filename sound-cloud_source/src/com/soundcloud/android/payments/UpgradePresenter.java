// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import com.soundcloud.android.configuration.ConfigurationManager;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UpgradeTrackingEvent;
import com.soundcloud.android.payments.googleplay.BillingResult;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;
import com.soundcloud.rx.eventbus.EventBus;
import rx.h.b;

// Referenced classes of package com.soundcloud.android.payments:
//            PaymentOperations, TransactionState, UpgradeView, PaymentErrorPresenter, 
//            ProductDetails, ConnectionStatus, ProductStatus, PurchaseStatus

class UpgradePresenter extends DefaultActivityLightCycle
    implements UpgradeView.Listener
{
    private class ConnectionSubscriber extends DefaultSubscriber
    {

        final UpgradePresenter this$0;

        public void onNext(ConnectionStatus connectionstatus)
        {
            if (connectionstatus.isReady())
            {
                restorePendingTransactionOrQueryStatus();
            } else
            if (connectionstatus.isUnsupported())
            {
                paymentErrorPresenter.showBillingUnavailable();
                return;
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((ConnectionStatus)obj);
        }

        private ConnectionSubscriber()
        {
            this$0 = UpgradePresenter.this;
            super();
        }

        ConnectionSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private class DetailsSubscriber extends DefaultSubscriber
    {

        final UpgradePresenter this$0;

        public void onError(Throwable throwable)
        {
            super.onError(throwable);
            paymentErrorPresenter.onError(throwable);
        }

        public void onNext(ProductStatus productstatus)
        {
            if (productstatus.isSuccess())
            {
                details = productstatus.getDetails();
                upgradeView.showBuyButton(details.getPrice());
                eventBus.publish(EventQueue.TRACKING, UpgradeTrackingEvent.forUpgradeButtonImpression());
                return;
            } else
            {
                paymentErrorPresenter.showConnectionError();
                return;
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((ProductStatus)obj);
        }

        private DetailsSubscriber()
        {
            this$0 = UpgradePresenter.this;
            super();
        }

        DetailsSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private class PurchaseSubscriber extends DefaultSubscriber
    {

        final UpgradePresenter this$0;

        public void onError(Throwable throwable)
        {
            super.onError(throwable);
            paymentErrorPresenter.onError(throwable);
            upgradeView.enableBuyButton();
        }

        private PurchaseSubscriber()
        {
            this$0 = UpgradePresenter.this;
            super();
        }

        PurchaseSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private class StatusSubscriber extends DefaultSubscriber
    {

        final UpgradePresenter this$0;

        public void onError(Throwable throwable)
        {
            super.onError(throwable);
            paymentErrorPresenter.onError(throwable);
        }

        public void onNext(PurchaseStatus purchasestatus)
        {
            switch (_cls1..SwitchMap.com.soundcloud.android.payments.PurchaseStatus[purchasestatus.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                upgradeSuccess();
                return;

            case 2: // '\002'
                paymentErrorPresenter.showVerifyFail();
                return;

            case 3: // '\003'
                paymentErrorPresenter.showVerifyTimeout();
                return;

            case 4: // '\004'
                loadPurchaseOptions();
                break;
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((PurchaseStatus)obj);
        }

        private StatusSubscriber()
        {
            this$0 = UpgradePresenter.this;
            super();
        }

        StatusSubscriber(_cls1 _pcls1)
        {
            this();
        }

        private class _cls1
        {

            static final int $SwitchMap$com$soundcloud$android$payments$PurchaseStatus[];

            static 
            {
                $SwitchMap$com$soundcloud$android$payments$PurchaseStatus = new int[PurchaseStatus.values().length];
                try
                {
                    $SwitchMap$com$soundcloud$android$payments$PurchaseStatus[PurchaseStatus.SUCCESS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$soundcloud$android$payments$PurchaseStatus[PurchaseStatus.VERIFY_FAIL.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$soundcloud$android$payments$PurchaseStatus[PurchaseStatus.VERIFY_TIMEOUT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$soundcloud$android$payments$PurchaseStatus[PurchaseStatus.NONE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }


    private AppCompatActivity activity;
    private final ConfigurationManager configurationManager;
    private ProductDetails details;
    private final EventBus eventBus;
    private final PaymentErrorPresenter paymentErrorPresenter;
    private final PaymentOperations paymentOperations;
    private rx.b purchaseObservable;
    private TransactionState restoreState;
    private rx.b statusObservable;
    private final b subscription = new b();
    private final UpgradeView upgradeView;

    UpgradePresenter(PaymentOperations paymentoperations, PaymentErrorPresenter paymenterrorpresenter, ConfigurationManager configurationmanager, UpgradeView upgradeview, EventBus eventbus)
    {
        paymentOperations = paymentoperations;
        paymentErrorPresenter = paymenterrorpresenter;
        configurationManager = configurationmanager;
        upgradeView = upgradeview;
        eventBus = eventbus;
    }

    private void clearExistingError(AppCompatActivity appcompatactivity)
    {
        android.support.v4.app.Fragment fragment = appcompatactivity.getSupportFragmentManager().findFragmentByTag("payment_error");
        if (fragment != null)
        {
            appcompatactivity.getSupportFragmentManager().beginTransaction().remove(fragment).commit();
        }
    }

    private void initConnection()
    {
        subscription.a(paymentOperations.connect(activity).subscribe(new ConnectionSubscriber(null)));
    }

    private void loadPurchaseOptions()
    {
        subscription.a(paymentOperations.queryProduct().subscribe(new DetailsSubscriber(null)));
    }

    private void restorePendingTransactionOrQueryStatus()
    {
        if (restoreState != null && restoreState.isTransactionInProgress())
        {
            restoreTransaction(restoreState);
            return;
        } else
        {
            subscribeToStatus(paymentOperations.queryStatus().cache());
            return;
        }
    }

    private void restoreTransaction(TransactionState transactionstate)
    {
        if (transactionstate.isRetrievingStatus())
        {
            subscribeToStatus(transactionstate.status());
        } else
        {
            subscribeToPurchase(transactionstate.purchase());
        }
        restoreState = null;
    }

    private void subscribeToPurchase(rx.b b1)
    {
        statusObservable = null;
        purchaseObservable = b1;
        subscription.a(purchaseObservable.subscribe(new PurchaseSubscriber(null)));
    }

    private void subscribeToStatus(rx.b b1)
    {
        statusObservable = b1;
        subscription.a(statusObservable.subscribe(new StatusSubscriber(null)));
    }

    private void upgradeSuccess()
    {
        configurationManager.updateUntilPlanChanged();
        upgradeView.showSuccess();
        eventBus.publish(EventQueue.TRACKING, UpgradeTrackingEvent.forUpgradeSuccess());
    }

    public TransactionState getState()
    {
        return new TransactionState(purchaseObservable, statusObservable);
    }

    public void handleBillingResult(BillingResult billingresult)
    {
label0:
        {
            if (billingresult.isForRequest())
            {
                if (!billingresult.isOk())
                {
                    break label0;
                }
                restoreState = null;
                upgradeView.hideBuyButton();
                subscribeToStatus(paymentOperations.verify(billingresult.getPayload()).cache());
            }
            return;
        }
        paymentErrorPresenter.showCancelled();
        DefaultSubscriber.fireAndForget(paymentOperations.cancel(billingresult.getFailReason()));
        if (details == null)
        {
            initConnection();
            return;
        } else
        {
            upgradeView.enableBuyButton();
            return;
        }
    }

    public volatile void onCreate(Activity activity1, Bundle bundle)
    {
        onCreate((AppCompatActivity)activity1, bundle);
    }

    public void onCreate(AppCompatActivity appcompatactivity, Bundle bundle)
    {
        activity = appcompatactivity;
        upgradeView.setupContentView(appcompatactivity, this);
        paymentErrorPresenter.setActivity(appcompatactivity);
        restoreState = (TransactionState)appcompatactivity.getLastCustomNonConfigurationInstance();
        clearExistingError(appcompatactivity);
        initConnection();
    }

    public volatile void onDestroy(Activity activity1)
    {
        onDestroy((AppCompatActivity)activity1);
    }

    public void onDestroy(AppCompatActivity appcompatactivity)
    {
        subscription.unsubscribe();
        paymentOperations.disconnect();
    }

    public void startPurchase()
    {
        subscribeToPurchase(paymentOperations.purchase(details.getId()).cache());
        upgradeView.disableBuyButton();
        eventBus.publish(EventQueue.TRACKING, UpgradeTrackingEvent.forUpgradeButtonClick());
    }





/*
    static ProductDetails access$502(UpgradePresenter upgradepresenter, ProductDetails productdetails)
    {
        upgradepresenter.details = productdetails;
        return productdetails;
    }

*/




}
