// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            VerifyBankAccountActivity

final class this._cls0
    implements AsyncCallback
{

    final VerifyBankAccountActivity this$0;

    private void onSuccess(com.google.wallet.proto.api.eChallengeDepositResponse echallengedepositresponse)
    {
        VerifyBankAccountActivity.access$200(VerifyBankAccountActivity.this, echallengedepositresponse);
    }

    public final void onFailure(Exception exception)
    {
        fullScreenProgressSpinnerManager.hide();
        analyticsUtil.sendError("SendChallengeDeposit", new AnalyticsCustomDimension[0]);
        VerifyBankAccountActivity.access$300(VerifyBankAccountActivity.this);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.api.eChallengeDepositResponse)obj);
    }

    itResponse()
    {
        this$0 = VerifyBankAccountActivity.this;
        super();
    }
}
