// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import com.google.android.apps.wallet.bankaccount.api.BankAccountClient;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            VerifyBankAccountActivity

final class val.bankAccountSubId
    implements Callable
{

    final VerifyBankAccountActivity this$0;
    final String val$bankAccountSubId;

    private com.google.wallet.proto.api.eChallengeDepositResponse call()
        throws Exception
    {
        com.google.wallet.proto.api.eChallengeDepositRequest echallengedepositrequest = new com.google.wallet.proto.api.eChallengeDepositRequest();
        echallengedepositrequest.bankAccountSubId = val$bankAccountSubId;
        return bankAccountClient.initiateChallengeDeposit(echallengedepositrequest);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    itResponse()
    {
        this$0 = final_verifybankaccountactivity;
        val$bankAccountSubId = String.this;
        super();
    }
}
