// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.accounts;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import com.soundcloud.android.accounts.exception.OperationFailedException;
import rx.X;

class AccountRemovalFunction
    implements rx.b.f
{

    private final Account account;
    private final AccountManager accountManager;

    public AccountRemovalFunction(Account account1, AccountManager accountmanager)
    {
        account = account1;
        accountManager = accountmanager;
    }

    public volatile void call(Object obj)
    {
        call((X)obj);
    }

    public void call(X x)
    {
        if (((Boolean)accountManager.removeAccount(account, null, null).getResult()).booleanValue())
        {
            x.onCompleted();
            return;
        }
        try
        {
            x.onError(new OperationFailedException());
            return;
        }
        catch (Exception exception)
        {
            x.onError(exception);
        }
        return;
    }
}
