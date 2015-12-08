// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import com.google.android.apps.wallet.money.CurrencyUtil;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecord;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecordManager;
import com.google.android.apps.wallet.transfer.api.FundsTransferClient;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            ClaimMoneyResultsActivity, ClaimablePurchaseRecordEventPublisher

final class instrumentId
    implements Callable
{

    private final String instrumentId;
    final ClaimMoneyResultsActivity this$0;

    private instrumentId call()
        throws Exception
    {
        Object obj = purchaseRecordManager.getClaimablePurchaseRecords();
        long l = 0L;
        for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext();)
        {
            l += ((PurchaseRecord)iterator.next()).getTotalAmountMicros();
        }

        Object obj1 = new com.google.wallet.proto.api.fersRequest();
        obj1.destinationInstrumentSubId = instrumentId;
        Object obj2 = new com.google.wallet.proto.api.>();
        obj2.enge = Integer.valueOf(2);
        obj1.userChallenge = (new com.google.wallet.proto.api.fersRequest.userChallenge[] {
            obj2
        });
        obj1 = fundsTransferClient.acceptAllMoney(((com.google.wallet.proto.api.fersRequest) (obj1)));
        if (((com.google.wallet.proto.api.fersResponse) (obj1)).callError != null)
        {
            return new >(null, null, null, ((com.google.wallet.proto.api.fersResponse) (obj1)).callError, ((com.google.wallet.proto.api.fersResponse) (obj1)).requestedChallenge);
        }
        ClaimMoneyResultsActivity.access$002(ClaimMoneyResultsActivity.this, ((com.google.wallet.proto.api.fersResponse) (obj1)).expectedAvailabilityDescription);
        claimablePurchaseRecordEventPublisher.invalidate();
        obj2 = purchaseRecordManager.getClaimablePurchaseRecords();
        long l1 = 0L;
        for (obj1 = ((List) (obj2)).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            l1 += ((PurchaseRecord)((Iterator) (obj1)).next()).getTotalAmountMicros();
        }

        obj1 = Currency.getInstance(((PurchaseRecord)((List) (obj)).get(0)).getTotalAmountCurrencyCode());
        l -= l1;
        if (l <= 0L)
        {
            obj = null;
        } else
        {
            obj = CurrencyUtil.microsToDisplayableMoney(l, ((Currency) (obj1)));
        }
        if (l1 <= 0L)
        {
            obj1 = null;
        } else
        {
            obj1 = CurrencyUtil.microsToDisplayableMoney(l1, ((Currency) (obj1)));
        }
        return new >(((String) (obj)), ((String) (obj1)), ((List) (obj2)), null, null);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ponse(String s)
    {
        this$0 = ClaimMoneyResultsActivity.this;
        super();
        instrumentId = s;
    }
}
