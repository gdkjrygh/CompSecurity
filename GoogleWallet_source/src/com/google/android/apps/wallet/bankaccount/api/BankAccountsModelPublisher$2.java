// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount.api;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.bankaccount.api:
//            BankAccountsModelPublisher, BankAccountProtoManager

final class val.bankAccount
    implements Callable
{

    final BankAccountsModelPublisher this$0;
    final com.google.wallet.proto.t val$bankAccount;

    private Void call()
    {
        BankAccountsModelPublisher.access$000(BankAccountsModelPublisher.this).delete(val$bankAccount);
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    Q()
    {
        this$0 = final_bankaccountsmodelpublisher;
        val$bankAccount = com.google.wallet.proto.t.this;
        super();
    }
}
