// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.request;

import com.google.android.apps.wallet.p2p.api.Contact;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.transfer.api.FundsTransferClient;
import java.util.concurrent.Callable;

public final class RequestMoneyAction
    implements Callable
{

    private final FundsTransferClient client;
    private final com.google.wallet.proto.api.NanoWalletFundsTransfer.RequestMoneyRequest request = new com.google.wallet.proto.api.NanoWalletFundsTransfer.RequestMoneyRequest();
    private final String requesteeHumanIdentifier;

    public RequestMoneyAction(FundsTransferClient fundstransferclient, Contact contact, com.google.wallet.proto.NanoWalletEntities.MoneyProto moneyproto, String s, String s1)
    {
        client = fundstransferclient;
        fundstransferclient = new com.google.wallet.proto.api.NanoWalletFundsTransfer.MoneyRequest();
        fundstransferclient.accountIdentifier = new com.google.wallet.proto.NanoWalletEntities.AccountIdentifier();
        ((com.google.wallet.proto.api.NanoWalletFundsTransfer.MoneyRequest) (fundstransferclient)).accountIdentifier.emailAddress = contact.getEmailAddress();
        fundstransferclient.amount = moneyproto;
        fundstransferclient.replayId = s1;
        request.moneyRequest = (new com.google.wallet.proto.api.NanoWalletFundsTransfer.MoneyRequest[] {
            fundstransferclient
        });
        request.memo = s;
        requesteeHumanIdentifier = contact.getPreferredHumanIdentifier();
    }

    private com.google.wallet.proto.api.NanoWalletFundsTransfer.RequestMoneyResponse call()
        throws RpcException
    {
        return client.requestMoney(request);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    public final com.google.wallet.proto.NanoWalletEntities.MoneyProto getRequestedAmount()
    {
        return request.moneyRequest[0].amount;
    }

    public final String getRequesteeHumanIdentifier()
    {
        return requesteeHumanIdentifier;
    }
}
