// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup.setupstate;

import com.google.common.base.Objects;
import com.google.common.base.Strings;

// Referenced classes of package com.google.android.apps.wallet.hce.setup.setupstate:
//            NfcPaymentSetupState

public class NfcPaymentSetupEvent
{

    private final com.google.wallet.proto.NanoWalletError.CallError callError;
    private final boolean hasAtcReachedLimit;
    private final NfcPaymentSetupState state;

    public NfcPaymentSetupEvent(NfcPaymentSetupState nfcpaymentsetupstate, com.google.wallet.proto.NanoWalletError.CallError callerror, boolean flag)
    {
        state = nfcpaymentsetupstate;
        callError = callerror;
        hasAtcReachedLimit = flag;
    }

    public final com.google.wallet.proto.NanoWalletError.CallError getCallError()
    {
        return callError;
    }

    public final NfcPaymentSetupState getState()
    {
        return state;
    }

    public final boolean hasAtcReachedLimit()
    {
        return hasAtcReachedLimit;
    }

    public final boolean hasCallErrorStrings()
    {
        return callError != null && !Strings.isNullOrEmpty(callError.title) && !Strings.isNullOrEmpty(callError.content);
    }

    public final boolean isSuccessful()
    {
        return state == NfcPaymentSetupState.COMPLETE;
    }

    public String toString()
    {
        return Objects.toStringHelper(com/google/android/apps/wallet/hce/setup/setupstate/NfcPaymentSetupEvent).add("state", state).add("callError", callError).add("hasAtcReachedLimit", hasAtcReachedLimit).toString();
    }
}
