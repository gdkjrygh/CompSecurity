// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.emv.paypass;


// Referenced classes of package com.google.android.apps.wallet.hce.emv.paypass:
//            PayPassMagStripe, PayPassState

static final class 
{

    static final int $SwitchMap$com$google$android$apps$wallet$hce$emv$paypass$PayPassState[];

    static 
    {
        $SwitchMap$com$google$android$apps$wallet$hce$emv$paypass$PayPassState = new int[PayPassState.values().length];
        try
        {
            $SwitchMap$com$google$android$apps$wallet$hce$emv$paypass$PayPassState[PayPassState.IDLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$hce$emv$paypass$PayPassState[PayPassState.SELECTED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$hce$emv$paypass$PayPassState[PayPassState.INITIATED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
