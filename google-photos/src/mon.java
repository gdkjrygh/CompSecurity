// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

final class mon
    implements mng
{

    private final AccountManager a;

    mon(Context context)
    {
        a = AccountManager.get(context);
    }

    public final List a()
    {
        Account aaccount[] = a.getAccountsByType("com.google");
        ArrayList arraylist = new ArrayList(aaccount.length);
        for (int i = 0; i < aaccount.length; i++)
        {
            arraylist.add((new mnf(aaccount[i].name, i)).a());
        }

        return arraylist;
    }
}
