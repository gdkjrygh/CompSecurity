// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer;

import com.google.android.apps.wallet.funding.api.FundingSource;
import com.google.android.apps.wallet.transfer.api.FundsTransferClient;
import com.google.common.collect.ImmutableMap;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.transfer:
//            ConfirmMoneyTransferActivity

final class this._cls0
    implements Callable
{

    final ConfirmMoneyTransferActivity this$0;

    private com.google.wallet.proto.api.teFeeResponse call()
        throws Exception
    {
        com.google.wallet.proto.api.teFeeRequest tefeerequest = new com.google.wallet.proto.api.teFeeRequest();
        tefeerequest.amount = ConfirmMoneyTransferActivity.access$1200(ConfirmMoneyTransferActivity.this);
        tefeerequest.fundingInstrumentSubId = ConfirmMoneyTransferActivity.access$800(ConfirmMoneyTransferActivity.this).getCdpId();
        tefeerequest.transactionType = new com.google.wallet.proto.ype();
        tefeerequest.transactionType.type = (Integer)ConfirmMoneyTransferActivity.TRANSACTION_TYPE.get(Integer.valueOf(transferType));
        return fundsTransferClient.calculateFee(tefeerequest);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    e()
    {
        this$0 = ConfirmMoneyTransferActivity.this;
        super();
    }
}
