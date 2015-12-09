// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelPublisher;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            ChallengeDepositActivity

final class this._cls0
    implements AsyncCallback
{

    final ChallengeDepositActivity this$0;

    private void onSuccess(com.google.wallet.proto.api.ChallengeDepositResponse challengedepositresponse)
    {
        fullScreenProgressSpinnerManager.hide();
        ChallengeDepositActivity.access$202(ChallengeDepositActivity.this, false);
        if (challengedepositresponse.account != null)
        {
            bankAccountsModelPublisher.generateEventForAccount(challengedepositresponse.account);
        }
        ChallengeDepositActivity.access$300(ChallengeDepositActivity.this, challengedepositresponse);
    }

    public final void onFailure(Exception exception)
    {
        fullScreenProgressSpinnerManager.hide();
        ChallengeDepositActivity.access$202(ChallengeDepositActivity.this, false);
        ChallengeDepositActivity.access$300(ChallengeDepositActivity.this, null);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.api.ChallengeDepositResponse)obj);
    }

    tResponse()
    {
        this$0 = ChallengeDepositActivity.this;
        super();
    }
}
