// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup.ui;

import com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupState;

// Referenced classes of package com.google.android.apps.wallet.hce.setup.ui:
//            SetupNfcPaymentTile

static final class pState
{

    static final int $SwitchMap$com$google$android$apps$wallet$hce$setup$setupstate$NfcPaymentSetupState[];

    static 
    {
        $SwitchMap$com$google$android$apps$wallet$hce$setup$setupstate$NfcPaymentSetupState = new int[NfcPaymentSetupState.values().length];
        try
        {
            $SwitchMap$com$google$android$apps$wallet$hce$setup$setupstate$NfcPaymentSetupState[NfcPaymentSetupState.NOT_STARTED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$hce$setup$setupstate$NfcPaymentSetupState[NfcPaymentSetupState.FAILED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$hce$setup$setupstate$NfcPaymentSetupState[NfcPaymentSetupState.COMPLETE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
