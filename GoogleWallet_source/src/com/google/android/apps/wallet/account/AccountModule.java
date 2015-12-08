// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.account;

import android.accounts.Account;

public class AccountModule
{

    public AccountModule()
    {
    }

    static Account getWalletAccount(String s)
    {
        return new Account(s, "com.google");
    }
}
