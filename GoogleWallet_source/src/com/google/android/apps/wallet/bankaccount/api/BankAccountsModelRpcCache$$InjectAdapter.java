// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount.api;

import com.google.android.apps.wallet.util.async.ThreadChecker;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.bankaccount.api:
//            BankAccountsModelRpcCache, BankAccountClient, BankAccountProtoManager

public final class  extends Binding
    implements Provider
{

    private Binding bankAccountClient;
    private Binding protoManager;
    private Binding threadChecker;

    public final void attach(Linker linker)
    {
        bankAccountClient = linker.requestBinding("com.google.android.apps.wallet.bankaccount.api.BankAccountClient", com/google/android/apps/wallet/bankaccount/api/BankAccountsModelRpcCache, getClass().getClassLoader());
        protoManager = linker.requestBinding("com.google.android.apps.wallet.bankaccount.api.BankAccountProtoManager", com/google/android/apps/wallet/bankaccount/api/BankAccountsModelRpcCache, getClass().getClassLoader());
        threadChecker = linker.requestBinding("com.google.android.apps.wallet.util.async.ThreadChecker", com/google/android/apps/wallet/bankaccount/api/BankAccountsModelRpcCache, getClass().getClassLoader());
    }

    public final BankAccountsModelRpcCache get()
    {
        return new BankAccountsModelRpcCache((BankAccountClient)bankAccountClient.get(), (BankAccountProtoManager)protoManager.get(), (ThreadChecker)threadChecker.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(bankAccountClient);
        set.add(protoManager);
        set.add(threadChecker);
    }

    public ()
    {
        super("com.google.android.apps.wallet.bankaccount.api.BankAccountsModelRpcCache", "members/com.google.android.apps.wallet.bankaccount.api.BankAccountsModelRpcCache", true, com/google/android/apps/wallet/bankaccount/api/BankAccountsModelRpcCache);
    }
}
