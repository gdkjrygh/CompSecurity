// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import com.google.android.apps.wallet.kyc.api.KycUserFlow;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycUiModel

static final class ow
{

    static final int $SwitchMap$com$google$android$apps$wallet$kyc$api$KycUserFlow[];

    static 
    {
        $SwitchMap$com$google$android$apps$wallet$kyc$api$KycUserFlow = new int[KycUserFlow.values().length];
        try
        {
            $SwitchMap$com$google$android$apps$wallet$kyc$api$KycUserFlow[KycUserFlow.SETUP_WALLET_BALANCE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$kyc$api$KycUserFlow[KycUserFlow.P2P_CLAIM.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$kyc$api$KycUserFlow[KycUserFlow.PLASTIC_CARD.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
