// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc.api;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.wallet.api.InternalIntents;

// Referenced classes of package com.google.android.apps.wallet.kyc.api:
//            KycUserFlow

public final class KycApi
{

    public KycApi()
    {
    }

    public static Intent createKycCaptureIdActivity(Context context)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.kyc.KycCaptureIdActivity");
    }

    public static Intent createKycFullSsnActivityIntent(Context context)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.kyc.KycFullSsnActivity");
    }

    public static Intent createKycSsnActivityIntent(Context context, byte abyte0[])
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.kyc.KycShortSsnActivity").putExtra("CLIENT_ENCRYPTED_DATA", abyte0);
    }

    public static Intent createKycVerifyingIdentityActivityIntent(Context context)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.kyc.KycVerifyingIdentityActivity");
    }

    public static Intent createManualKycActivityIntentForPlasticCard(Context context)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.kyc.KycFlowActivity").putExtra("user_flow", KycUserFlow.PLASTIC_CARD).putExtra("KYC_MANUAL_FLOW", true);
    }

    public static Intent createManualKycActivityIntentForSetUpWalletBalance(Context context)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.kyc.KycFlowActivity").putExtra("user_flow", KycUserFlow.SETUP_WALLET_BALANCE).putExtra("KYC_MANUAL_FLOW", true);
    }

    public static Intent createManualKycActivityIntentToClaimMoney(Context context)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.kyc.KycFlowActivity").putExtra("user_flow", KycUserFlow.P2P_CLAIM).putExtra("KYC_MANUAL_FLOW", true);
    }

    public static Intent createTwoStepKycActivityIntentForPlasticCard(Context context)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.kyc.KycFlowActivity").putExtra("user_flow", KycUserFlow.PLASTIC_CARD).putExtra("KYC_MANUAL_FLOW", false);
    }

    public static Intent createTwoStepKycActivityIntentForSetUpWalletBalance(Context context)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.kyc.KycFlowActivity").putExtra("user_flow", KycUserFlow.SETUP_WALLET_BALANCE).putExtra("KYC_MANUAL_FLOW", false);
    }

    public static Intent createTwoStepKycActivityIntentToClaimMoney(Context context)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.kyc.KycFlowActivity").putExtra("user_flow", KycUserFlow.P2P_CLAIM).putExtra("KYC_MANUAL_FLOW", false);
    }
}
