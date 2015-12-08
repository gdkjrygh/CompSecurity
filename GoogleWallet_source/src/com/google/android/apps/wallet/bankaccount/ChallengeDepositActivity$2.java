// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import com.google.android.apps.wallet.bankaccount.api.BankAccountClient;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            ChallengeDepositActivity

final class val.challengeAmount
    implements Callable
{

    final ChallengeDepositActivity this$0;
    final com.google.wallet.proto.to val$challengeAmount;

    private com.google.wallet.proto.api.ChallengeDepositResponse call()
        throws Exception
    {
        com.google.wallet.proto.api.ChallengeDepositRequest challengedepositrequest = new com.google.wallet.proto.api.ChallengeDepositRequest();
        challengedepositrequest.bankAccountSubId = ChallengeDepositActivity.access$100(ChallengeDepositActivity.this);
        challengedepositrequest.depositAmount = val$challengeAmount;
        return bankAccountClient.verifyChallengeDeposit(challengedepositrequest);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    tResponse()
    {
        this$0 = final_challengedepositactivity;
        val$challengeAmount = com.google.wallet.proto.to.this;
        super();
    }
}
