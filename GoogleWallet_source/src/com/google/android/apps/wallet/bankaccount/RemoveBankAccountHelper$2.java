// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import com.google.android.apps.wallet.bankaccount.api.BankAccountClient;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            RemoveBankAccountHelper

final class val.accountId
    implements Callable
{

    final RemoveBankAccountHelper this$0;
    final String val$accountId;

    private com.google.wallet.proto.api.ePaymentInstrumentResponse call()
        throws Exception
    {
        com.google.wallet.proto.api.ePaymentInstrumentRequest epaymentinstrumentrequest = new com.google.wallet.proto.api.ePaymentInstrumentRequest();
        epaymentinstrumentrequest.instrumentSubId = val$accountId;
        return bankAccountClient.delete(epaymentinstrumentrequest);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    entResponse()
    {
        this$0 = final_removebankaccounthelper;
        val$accountId = String.this;
        super();
    }
}
