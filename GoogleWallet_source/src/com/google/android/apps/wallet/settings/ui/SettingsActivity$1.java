// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings.ui;

import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupEvent;

// Referenced classes of package com.google.android.apps.wallet.settings.ui:
//            SettingsActivity

final class this._cls0
    implements EventHandler
{

    final SettingsActivity this$0;

    private void handleEvent(NfcPaymentSetupEvent nfcpaymentsetupevent)
    {
        SettingsActivity.access$000(SettingsActivity.this, nfcpaymentsetupevent);
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((NfcPaymentSetupEvent)obj);
    }

    SetupEvent()
    {
        this$0 = SettingsActivity.this;
        super();
    }
}
