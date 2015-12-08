// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup.setupstate;


public final class NfcPaymentSetupState extends Enum
{

    private static final NfcPaymentSetupState $VALUES[];
    public static final NfcPaymentSetupState COMPLETE;
    public static final NfcPaymentSetupState FAILED;
    public static final NfcPaymentSetupState IN_FLIGHT;
    public static final NfcPaymentSetupState NOT_STARTED;

    private NfcPaymentSetupState(String s, int i)
    {
        super(s, i);
    }

    public static NfcPaymentSetupState valueOf(String s)
    {
        return (NfcPaymentSetupState)Enum.valueOf(com/google/android/apps/wallet/hce/setup/setupstate/NfcPaymentSetupState, s);
    }

    public static NfcPaymentSetupState[] values()
    {
        return (NfcPaymentSetupState[])$VALUES.clone();
    }

    static 
    {
        NOT_STARTED = new NfcPaymentSetupState("NOT_STARTED", 0);
        IN_FLIGHT = new NfcPaymentSetupState("IN_FLIGHT", 1);
        FAILED = new NfcPaymentSetupState("FAILED", 2);
        COMPLETE = new NfcPaymentSetupState("COMPLETE", 3);
        $VALUES = (new NfcPaymentSetupState[] {
            NOT_STARTED, IN_FLIGHT, FAILED, COMPLETE
        });
    }
}
