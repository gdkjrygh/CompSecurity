// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.android.apps.wallet.transfer.api.FundsTransferClient;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordDetailActivity

final class val.transactionId
    implements Callable
{

    final PurchaseRecordDetailActivity this$0;
    final String val$transactionId;

    private com.google.wallet.proto.api.neyResponse call()
        throws Exception
    {
        com.google.wallet.proto.api.neyRequest neyrequest = new com.google.wallet.proto.api.neyRequest();
        neyrequest.id = val$transactionId;
        return fundsTransferClient.rejectMoney(neyrequest);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_purchaserecorddetailactivity;
        val$transactionId = String.this;
        super();
    }
}
