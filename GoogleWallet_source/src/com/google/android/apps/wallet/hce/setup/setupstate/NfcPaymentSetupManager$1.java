// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup.setupstate;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;

// Referenced classes of package com.google.android.apps.wallet.hce.setup.setupstate:
//            NfcPaymentSetupManager

final class this._cls0
    implements RegistrationCallback
{

    final NfcPaymentSetupManager this$0;

    public final void handleRegistration(Object obj)
    {
        if (NfcPaymentSetupManager.access$000(NfcPaymentSetupManager.this) != null)
        {
            NfcPaymentSetupManager.access$100(NfcPaymentSetupManager.this).post(NfcPaymentSetupManager.access$000(NfcPaymentSetupManager.this));
            return;
        } else
        {
            NfcPaymentSetupManager.access$200(NfcPaymentSetupManager.this);
            return;
        }
    }

    ()
    {
        this$0 = NfcPaymentSetupManager.this;
        super();
    }
}
