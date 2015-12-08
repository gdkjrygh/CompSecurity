// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup.setupstate;

import android.content.SharedPreferences;
import android.os.Handler;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.hce.database.HceLibraryDatabase;
import com.google.android.apps.wallet.hce.emv.RotatingAtc;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.hce.setup.setupstate:
//            NfcPaymentSetupState, NfcPaymentSetupEvent

public class NfcPaymentSetupManager
    implements InitializedEventPublisher
{

    private final ActionExecutor actionExecutor;
    private NfcPaymentSetupEvent cachedEvent;
    private final EventBus eventBus;
    private final FeatureManager featureManager;
    private final Callable getAtcsCallable = new Callable() {

        final NfcPaymentSetupManager this$0;

        private List call()
            throws Exception
        {
            return hceLibraryDatabase.getAllAtcs();
        }

        public final volatile Object call()
            throws Exception
        {
            return call();
        }

            
            {
                this$0 = NfcPaymentSetupManager.this;
                super();
            }
    };
    private final Handler handler;
    private final HceLibraryDatabase hceLibraryDatabase;
    private final SharedPreferences sharedPreferences;
    private final AsyncCallback updateCacheAndPostCallback = new AsyncCallback() {

        final NfcPaymentSetupManager this$0;

        private void onSuccess(List list)
        {
            NfcPaymentSetupState nfcpaymentsetupstate = getNfcPaymentSetupState();
            boolean flag = false;
            if (nfcpaymentsetupstate == NfcPaymentSetupState.COMPLETE)
            {
                if (!list.isEmpty())
                {
                    flag = ((RotatingAtc)list.get(0)).hasReachedLimit();
                } else
                {
                    flag = true;
                }
            }
            list = (com.google.wallet.proto.NanoWalletError.CallError)SharedPreference.messageFromPreference(SharedPreference.GET_HCE_BUNDLE_CALL_ERROR, new com.google.wallet.proto.NanoWalletError.CallError(), sharedPreferences);
            cachedEvent = new NfcPaymentSetupEvent(nfcpaymentsetupstate, list, flag);
            eventBus.post(cachedEvent);
        }

        public final void onFailure(Exception exception)
        {
        }

        public final volatile void onSuccess(Object obj)
        {
            onSuccess((List)obj);
        }

            
            {
                this$0 = NfcPaymentSetupManager.this;
                super();
            }
    };

    public NfcPaymentSetupManager(EventBus eventbus, SharedPreferences sharedpreferences, HceLibraryDatabase hcelibrarydatabase, ActionExecutor actionexecutor, Handler handler1, FeatureManager featuremanager)
    {
        cachedEvent = null;
        eventBus = eventbus;
        sharedPreferences = sharedpreferences;
        hceLibraryDatabase = hcelibrarydatabase;
        actionExecutor = actionexecutor;
        handler = handler1;
        featureManager = featuremanager;
    }

    private void generateEventAndPost()
    {
        actionExecutor.executeAction(getAtcsCallable, updateCacheAndPostCallback);
    }

    private static int getCurrentHceType()
    {
        return 2;
    }

    private NfcPaymentSetupState getNfcPaymentSetupState()
    {
        if (((Integer)SharedPreference.HCE_PAYMENT_SETUP_TYPE.get(sharedPreferences)).intValue() != getCurrentHceType())
        {
            return NfcPaymentSetupState.NOT_STARTED;
        } else
        {
            int i = ((Integer)SharedPreference.HCE_PAYMENT_SETUP_STATE.get(sharedPreferences)).intValue();
            return NfcPaymentSetupState.values()[i];
        }
    }

    public final void generateNewEventAndPost()
    {
        handler.post(new Runnable() {

            final NfcPaymentSetupManager this$0;

            public final void run()
            {
                generateEventAndPost();
            }

            
            {
                this$0 = NfcPaymentSetupManager.this;
                super();
            }
        });
    }

    public final void initialize()
    {
        eventBus.registerEventProducer(com/google/android/apps/wallet/hce/setup/setupstate/NfcPaymentSetupEvent, new RegistrationCallback() {

            final NfcPaymentSetupManager this$0;

            public final void handleRegistration(Object obj)
            {
                if (cachedEvent != null)
                {
                    eventBus.post(cachedEvent);
                    return;
                } else
                {
                    generateEventAndPost();
                    return;
                }
            }

            
            {
                this$0 = NfcPaymentSetupManager.this;
                super();
            }
        });
    }

    public final boolean isNfcPaymentSetupComplete()
    {
        return getNfcPaymentSetupState() == NfcPaymentSetupState.COMPLETE;
    }

    public final void setNfcPaymentSetupState(final NfcPaymentSetupState state)
    {
        handler.post(new Runnable() {

            final NfcPaymentSetupManager this$0;
            final NfcPaymentSetupState val$state;

            public final void run()
            {
                actionExecutor.executeAction(new Callable() {

                    final _cls4 this$1;

                    private List call()
                        throws Exception
                    {
                        SharedPreference.HCE_PAYMENT_SETUP_STATE.putAndCommit(sharedPreferences, Integer.valueOf(state.ordinal()));
                        SharedPreference.HCE_PAYMENT_SETUP_TYPE.putAndCommit(sharedPreferences, Integer.valueOf(NfcPaymentSetupManager.getCurrentHceType(_fld0)));
                        return (List)getAtcsCallable.call();
                    }

                    public final volatile Object call()
                        throws Exception
                    {
                        return call();
                    }

            
            {
                this$1 = _cls4.this;
                super();
            }
                }, updateCacheAndPostCallback);
            }

            
            {
                this$0 = NfcPaymentSetupManager.this;
                state = nfcpaymentsetupstate;
                super();
            }
        });
    }



/*
    static NfcPaymentSetupEvent access$002(NfcPaymentSetupManager nfcpaymentsetupmanager, NfcPaymentSetupEvent nfcpaymentsetupevent)
    {
        nfcpaymentsetupmanager.cachedEvent = nfcpaymentsetupevent;
        return nfcpaymentsetupevent;
    }

*/









}
