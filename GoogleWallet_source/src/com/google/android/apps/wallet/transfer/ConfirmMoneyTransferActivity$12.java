// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer;

import com.google.android.apps.wallet.transfer.api.FundsTransferClient;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.transfer:
//            ConfirmMoneyTransferActivity

final class val.sendMoneyRequest
    implements Callable
{

    final ConfirmMoneyTransferActivity this$0;
    final com.google.wallet.proto.api.yRequest val$sendMoneyRequest;

    private com.google.wallet.proto.api.yResponse call()
        throws Exception
    {
        return fundsTransferClient.sendMoney(val$sendMoneyRequest);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_confirmmoneytransferactivity;
        val$sendMoneyRequest = com.google.wallet.proto.api.yRequest.this;
        super();
    }
}
