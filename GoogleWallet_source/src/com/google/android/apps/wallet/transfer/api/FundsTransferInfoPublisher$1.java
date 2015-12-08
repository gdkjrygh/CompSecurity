// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.api;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.money.CurrencyUtil;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.common.cache.CacheLoader;

// Referenced classes of package com.google.android.apps.wallet.transfer.api:
//            FundsTransferInfoPublisher, FundsTransferClient

final class val.fundsTransferClient extends CacheLoader
{

    final FundsTransferInfoPublisher this$0;
    final FundsTransferClient val$fundsTransferClient;

    private com.google.wallet.proto.api.ndsTransferInfoResponse load(Object obj)
        throws RpcException, CallErrorException
    {
        com.google.wallet.proto.api.ndsTransferInfoRequest ndstransferinforequest = new com.google.wallet.proto.api.ndsTransferInfoRequest();
        ndstransferinforequest.currencyCode = CurrencyUtil.getCurrencyCode();
        ndstransferinforequest.transactionType = new com.google.wallet.proto.nType();
        ndstransferinforequest.transactionType.type = (Integer)obj;
        ndstransferinforequest.feeResponseFormat = Integer.valueOf(1);
        obj = val$fundsTransferClient.getFundsTransferInfo(ndstransferinforequest);
        if (((com.google.wallet.proto.api.ndsTransferInfoResponse) (obj)).callError != null)
        {
            throw new CallErrorException(((com.google.wallet.proto.api.ndsTransferInfoResponse) (obj)).callError);
        } else
        {
            return ((com.google.wallet.proto.api.ndsTransferInfoResponse) (obj));
        }
    }

    public final volatile Object load(Object obj)
        throws Exception
    {
        return load(obj);
    }

    esponse()
    {
        this$0 = final_fundstransferinfopublisher;
        val$fundsTransferClient = FundsTransferClient.this;
        super();
    }
}
