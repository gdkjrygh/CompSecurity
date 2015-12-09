// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.nfc;

import android.nfc.NfcAdapter;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.featurecontrol.FeaturesChangedEvent;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import java.util.concurrent.Callable;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.nfc:
//            NfcAdapterStateEvent

public class NfcAdapterStateEventPublisher
    implements InitializedEventPublisher
{

    private static final String TAG = com/google/android/apps/wallet/nfc/NfcAdapterStateEventPublisher.getSimpleName();
    private final ActionExecutor actionExecutor;
    private final EventBus eventBus;
    private final FeatureManager featureManager;
    private final Provider nfcAdapter;

    public NfcAdapterStateEventPublisher(FeatureManager featuremanager, Provider provider, ActionExecutor actionexecutor, EventBus eventbus)
    {
        featureManager = featuremanager;
        nfcAdapter = provider;
        actionExecutor = actionexecutor;
        eventBus = eventbus;
    }

    private boolean isNfcEnabled()
    {
        return ((NfcAdapter)nfcAdapter.get()).isEnabled();
    }

    private boolean supportsNfc()
    {
        return featureManager.isFeatureEnabled(Feature.NFC_HCE_PPMS) && nfcAdapter.get() != null;
    }

    void handleEvent(FeaturesChangedEvent featureschangedevent)
    {
        if (featureschangedevent.didFeatureStateChange(Feature.NFC_HCE_PPMS))
        {
            updateNfcAdapterState();
        }
    }

    public final void initialize()
    {
        eventBus.registerEventProducer(com/google/android/apps/wallet/nfc/NfcAdapterStateEvent, new RegistrationCallback() {

            final NfcAdapterStateEventPublisher this$0;

            public final void handleRegistration(Object obj)
            {
                updateNfcAdapterState();
            }

            
            {
                this$0 = NfcAdapterStateEventPublisher.this;
                super();
            }
        });
        eventBus.register(this);
    }

    public final void updateNfcAdapterState()
    {
        if (!supportsNfc())
        {
            eventBus.post(NfcAdapterStateEvent.unsupported());
            return;
        } else
        {
            actionExecutor.executeAction(new Callable() {

                final NfcAdapterStateEventPublisher this$0;

                private Boolean call()
                {
                    return Boolean.valueOf(isNfcEnabled());
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = NfcAdapterStateEventPublisher.this;
                super();
            }
            }, new AsyncCallback() {

                final NfcAdapterStateEventPublisher this$0;

                private void onSuccess(Boolean boolean1)
                {
                    EventBus eventbus = eventBus;
                    if (boolean1.booleanValue())
                    {
                        boolean1 = NfcAdapterStateEvent.on();
                    } else
                    {
                        boolean1 = NfcAdapterStateEvent.off();
                    }
                    eventbus.post(boolean1);
                }

                public final void onFailure(Exception exception)
                {
                    WLog.e(NfcAdapterStateEventPublisher.TAG, "Unexpected error retrieving NFC status", exception);
                }

                public final volatile void onSuccess(Object obj)
                {
                    onSuccess((Boolean)obj);
                }

            
            {
                this$0 = NfcAdapterStateEventPublisher.this;
                super();
            }
            });
            return;
        }
    }




}
