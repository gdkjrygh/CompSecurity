// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer;

import com.google.android.apps.wallet.funding.api.FundingSource;
import com.google.android.apps.wallet.p2p.api.Contact;
import com.google.android.apps.wallet.transfer.api.FundsTransferClient;
import com.google.common.collect.ImmutableMap;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.transfer:
//            ConfirmMoneyTransferActivity

final class this._cls0
    implements Callable
{

    final ConfirmMoneyTransferActivity this$0;

    private com.google.wallet.proto.api.sTransferAvailabilityResponse call()
        throws Exception
    {
        com.google.wallet.proto.api.sTransferAvailabilityRequest stransferavailabilityrequest = new com.google.wallet.proto.api.sTransferAvailabilityRequest();
        stransferavailabilityrequest.amount = ConfirmMoneyTransferActivity.access$1200(ConfirmMoneyTransferActivity.this);
        stransferavailabilityrequest.fundingInstrumentSubId = ConfirmMoneyTransferActivity.access$800(ConfirmMoneyTransferActivity.this).getCdpId();
        stransferavailabilityrequest.transactionType = new com.google.wallet.proto.ype();
        stransferavailabilityrequest.transactionType.type = (Integer)ConfirmMoneyTransferActivity.TRANSACTION_TYPE.get(Integer.valueOf(transferType));
        if (((Integer)ConfirmMoneyTransferActivity.TRANSACTION_TYPE.get(Integer.valueOf(transferType))).intValue() == 1)
        {
            stransferavailabilityrequest.recipient = new com.google.wallet.proto.ifier();
            stransferavailabilityrequest.recipient.emailAddress = ConfirmMoneyTransferActivity.access$1300(ConfirmMoneyTransferActivity.this).getEmailAddress();
        }
        return fundsTransferClient.getFundsTransferAvailability(stransferavailabilityrequest);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ilabilityResponse()
    {
        this$0 = ConfirmMoneyTransferActivity.this;
        super();
    }
}
