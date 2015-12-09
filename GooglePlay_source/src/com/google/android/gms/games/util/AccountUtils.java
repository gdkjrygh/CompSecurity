// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.util;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.games.config.G;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class AccountUtils
{

    public static final List ACCOUNT_EMPTY_LIST = Collections.emptyList();

    public static boolean ensureAccountExists(Context context, Account account)
    {
        context = getAvailableAccounts(context);
        int j = context.length;
        for (int i = 0; i < j; i++)
        {
            if (context[i].equals(account))
            {
                return true;
            }
        }

        return false;
    }

    public static Account[] getAvailableAccounts(Context context)
    {
        AccountManager accountmanager = AccountManager.get(context);
        Account aaccount[] = accountmanager.getAccountsByType("com.google");
        context = aaccount;
        if (((Boolean)G.includeSidewinderAccounts.get()).booleanValue())
        {
            context = (Account[])ArrayUtils.concat(new Account[][] {
                aaccount, accountmanager.getAccountsByType("cn.google")
            });
        }
        return context;
    }

    public static List getAvailableAccountsAsList(Context context)
    {
        context = getAvailableAccounts(context);
        if (context.length == 0)
        {
            return ACCOUNT_EMPTY_LIST;
        } else
        {
            return Arrays.asList(context);
        }
    }

    public static String getResolvedAccountName(ClientContext clientcontext)
    {
        clientcontext = clientcontext.mResolvedAccount;
        if (clientcontext == null)
        {
            return null;
        } else
        {
            return ((Account) (clientcontext)).name;
        }
    }

    public static boolean hasGooglerAccount(Context context)
    {
        context = getAvailableAccounts(context);
        int j = context.length;
        for (int i = 0; i < j; i++)
        {
            if (((Account) (context[i])).name.endsWith("@google.com"))
            {
                return true;
            }
        }

        return false;
    }

}
