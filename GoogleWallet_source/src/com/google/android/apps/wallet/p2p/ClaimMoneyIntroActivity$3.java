// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.kyc.api.KycApi;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            ClaimMoneyIntroActivity, GenericVerifyYourIdentityActivity

final class val.kycFailedOrReferred
    implements android.view.mMoneyIntroActivity._cls3
{

    final ClaimMoneyIntroActivity this$0;
    final boolean val$kycFailedOrReferred;

    public final void onClick(View view)
    {
        if (val$kycFailedOrReferred)
        {
            view = KycApi.createManualKycActivityIntentToClaimMoney(ClaimMoneyIntroActivity.this);
        } else
        {
            view = InternalIntents.forClass(ClaimMoneyIntroActivity.this, com/google/android/apps/wallet/p2p/GenericVerifyYourIdentityActivity);
        }
        view.putExtra("KYC_CLAIM_CONTEXT", true);
        startActivityForResult(view, 1);
    }

    ctivity()
    {
        this$0 = final_claimmoneyintroactivity;
        val$kycFailedOrReferred = Z.this;
        super();
    }
}
