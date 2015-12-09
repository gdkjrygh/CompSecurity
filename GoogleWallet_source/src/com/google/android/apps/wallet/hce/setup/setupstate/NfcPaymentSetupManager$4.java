// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup.setupstate;

import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.hce.setup.setupstate:
//            NfcPaymentSetupManager, NfcPaymentSetupState

final class val.state
    implements Runnable
{

    final NfcPaymentSetupManager this$0;
    final NfcPaymentSetupState val$state;

    public final void run()
    {
        NfcPaymentSetupManager.access$900(NfcPaymentSetupManager.this).executeAction(new Callable() {

            final NfcPaymentSetupManager._cls4 this$1;

            private List call()
                throws Exception
            {
                SharedPreference.HCE_PAYMENT_SETUP_STATE.putAndCommit(NfcPaymentSetupManager.access$500(this$0), Integer.valueOf(state.ordinal()));
                SharedPreference.HCE_PAYMENT_SETUP_TYPE.putAndCommit(NfcPaymentSetupManager.access$500(this$0), Integer.valueOf(NfcPaymentSetupManager.access$600(this$0)));
                return (List)NfcPaymentSetupManager.access$700(this$0).call();
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$1 = NfcPaymentSetupManager._cls4.this;
                super();
            }
        }, NfcPaymentSetupManager.access$800(NfcPaymentSetupManager.this));
    }

    _cls1.this._cls1()
    {
        this$0 = final_nfcpaymentsetupmanager;
        val$state = NfcPaymentSetupState.this;
        super();
    }
}
