// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup.setupstate;

import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.hce.emv.RotatingAtc;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.hce.setup.setupstate:
//            NfcPaymentSetupManager, NfcPaymentSetupState, NfcPaymentSetupEvent

final class this._cls0
    implements AsyncCallback
{

    final NfcPaymentSetupManager this$0;

    private void onSuccess(List list)
    {
        NfcPaymentSetupState nfcpaymentsetupstate = NfcPaymentSetupManager.access$400(NfcPaymentSetupManager.this);
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
        list = (com.google.wallet.proto.)SharedPreference.messageFromPreference(SharedPreference.GET_HCE_BUNDLE_CALL_ERROR, new com.google.wallet.proto.(), NfcPaymentSetupManager.access$500(NfcPaymentSetupManager.this));
        NfcPaymentSetupManager.access$002(NfcPaymentSetupManager.this, new NfcPaymentSetupEvent(nfcpaymentsetupstate, list, flag));
        NfcPaymentSetupManager.access$100(NfcPaymentSetupManager.this).post(NfcPaymentSetupManager.access$000(NfcPaymentSetupManager.this));
    }

    public final void onFailure(Exception exception)
    {
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((List)obj);
    }

    ()
    {
        this$0 = NfcPaymentSetupManager.this;
        super();
    }
}
