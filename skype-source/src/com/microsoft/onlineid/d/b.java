// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.d;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;

public final class b
{

    private final AccountManager a;

    public b(Context context)
    {
        a = AccountManager.get(context);
    }

    public final Account[] a()
    {
        return a.getAccounts();
    }

    public final Account[] a(String s)
    {
        return a.getAccountsByType(s);
    }
}
