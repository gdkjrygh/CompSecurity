// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount.api;

import com.google.android.apps.wallet.base.entitymanager.TypedCursor;
import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.eventbus.RpcCache;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.bankaccount.api:
//            BankAccountProtoManager, BankAccountClient

public class BankAccountsModelRpcCache
    implements RpcCache
{

    private final BankAccountClient bankAccountClient;
    private final BankAccountProtoManager protoManager;
    private final ThreadChecker threadChecker;

    BankAccountsModelRpcCache(BankAccountClient bankaccountclient, BankAccountProtoManager bankaccountprotomanager, ThreadChecker threadchecker)
    {
        bankAccountClient = bankaccountclient;
        protoManager = bankaccountprotomanager;
        threadChecker = threadchecker;
    }

    private List readFromCache()
    {
        Object obj;
        obj = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        obj = protoManager.getAllEntitiesCursor();
        Object obj1;
        obj1 = new ArrayList();
        for (; ((TypedCursor) (obj)).moveToNext(); ((List) (obj1)).add(((TypedCursor) (obj)).get())) { }
        break MISSING_BLOCK_LABEL_58;
        obj1;
        ((TypedCursor) (obj)).close();
        throw obj1;
        ((TypedCursor) (obj)).close();
        return ((List) (obj1));
    }

    private List readFromServer()
        throws RpcException, CallErrorException
    {
        Object obj = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        obj = bankAccountClient.getBankAccounts();
        if (((com.google.wallet.proto.api.NanoWalletInstrument.GetBankAccountsResponse) (obj)).callError != null)
        {
            throw new CallErrorException(((com.google.wallet.proto.api.NanoWalletInstrument.GetBankAccountsResponse) (obj)).callError);
        } else
        {
            return Arrays.asList(((com.google.wallet.proto.api.NanoWalletInstrument.GetBankAccountsResponse) (obj)).bankAccounts);
        }
    }

    private void writeToCache(List list)
    {
        ThreadChecker threadchecker = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        protoManager.deleteAllEntities();
        com.google.wallet.proto.NanoWalletEntities.BankAccount bankaccount;
        for (list = list.iterator(); list.hasNext(); protoManager.insert(bankaccount))
        {
            bankaccount = (com.google.wallet.proto.NanoWalletEntities.BankAccount)list.next();
        }

    }

    public final volatile Object readFromCache()
    {
        return readFromCache();
    }

    public final volatile Object readFromServer()
        throws Exception
    {
        return readFromServer();
    }

    public final volatile void writeToCache(Object obj)
    {
        writeToCache((List)obj);
    }
}
