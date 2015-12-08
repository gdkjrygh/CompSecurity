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

final class this._cls1
    implements Callable
{

    final call this$1;

    private List call()
        throws Exception
    {
        SharedPreference.HCE_PAYMENT_SETUP_STATE.putAndCommit(NfcPaymentSetupManager.access$500(_fld0), Integer.valueOf(state.ordinal()));
        SharedPreference.HCE_PAYMENT_SETUP_TYPE.putAndCommit(NfcPaymentSetupManager.access$500(_fld0), Integer.valueOf(NfcPaymentSetupManager.access$600(_fld0)));
        return (List)NfcPaymentSetupManager.access$700(_fld0).call();
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    l.state()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/android/apps/wallet/hce/setup/setupstate/NfcPaymentSetupManager$4

/* anonymous class */
    final class NfcPaymentSetupManager._cls4
        implements Runnable
    {

        final NfcPaymentSetupManager this$0;
        final NfcPaymentSetupState val$state;

        public final void run()
        {
            NfcPaymentSetupManager.access$900(NfcPaymentSetupManager.this).executeAction(new NfcPaymentSetupManager._cls4._cls1(), NfcPaymentSetupManager.access$800(NfcPaymentSetupManager.this));
        }

            
            {
                this$0 = final_nfcpaymentsetupmanager;
                state = NfcPaymentSetupState.this;
                super();
            }
    }

}
