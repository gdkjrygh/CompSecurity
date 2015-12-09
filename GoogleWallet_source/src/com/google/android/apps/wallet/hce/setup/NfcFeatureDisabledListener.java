// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup;

import android.app.Application;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeaturesChangedEvent;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.collect.ImmutableSet;

// Referenced classes of package com.google.android.apps.wallet.hce.setup:
//            NfcPaymentSetupService

public class NfcFeatureDisabledListener
    implements InitializedEventPublisher
{

    private static final String TAG = com/google/android/apps/wallet/hce/setup/NfcFeatureDisabledListener.getSimpleName();
    private final Application application;
    private final EventBus eventBus;

    NfcFeatureDisabledListener(EventBus eventbus, Application application1)
    {
        eventBus = eventbus;
        application = application1;
    }

    void handleEvent(FeaturesChangedEvent featureschangedevent)
    {
        WLog.dfmt(TAG, "received FeaturesChangedEvent: %s", new Object[] {
            featureschangedevent
        });
        if (featureschangedevent.getTurnedOffFeatures().contains(Feature.NFC_HCE_PPMS))
        {
            WLog.d(TAG, "Hce feature turned off. Requesting HCE shutdown.");
            NfcPaymentSetupService.requestDisableHce(application);
        }
    }

    public final void initialize()
    {
        eventBus.register(this);
    }

}
