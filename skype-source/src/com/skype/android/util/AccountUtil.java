// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.skype.Account;
import com.skype.Message;
import com.skype.SkyLib;
import java.util.ArrayList;
import java.util.List;

public class AccountUtil
{

    private AccountUtil()
    {
    }

    public static void a(Context context)
    {
        if (21 > android.os.Build.VERSION.SDK_INT)
        {
            CookieSyncManager.createInstance(context.getApplicationContext());
        }
        context = CookieManager.getInstance();
        if (android.os.Build.VERSION.SDK_INT > 21)
        {
            context.removeAllCookies(null);
            return;
        } else
        {
            context.removeAllCookie();
            return;
        }
    }

    public static boolean a(Account account)
    {
        return a(account, com.skype.SkyLib.PARTNER_ID.PARTNER_MICROSOFT);
    }

    private static boolean a(Account account, com.skype.SkyLib.PARTNER_ID partner_id)
    {
        return account != null && account.getLastPartnerId() == partner_id;
    }

    public static boolean a(Message message, Account account)
    {
        return message.getAuthorProp().equals(account.getSkypenameProp());
    }

    private static boolean a(String s)
    {
        return !TextUtils.isEmpty(s) && s.startsWith("live:");
    }

    public static String[] a(SkyLib skylib)
    {
        ArrayList arraylist = new ArrayList();
        skylib = skylib.getExistingAccounts();
        if (((com.skype.SkyLib.GetExistingAccounts_Result) (skylib)).m_return)
        {
            skylib = ((com.skype.SkyLib.GetExistingAccounts_Result) (skylib)).m_accountNameList;
            int j = skylib.length;
            for (int i = 0; i < j; i++)
            {
                String s = skylib[i];
                if (!a(s))
                {
                    arraylist.add(s);
                }
            }

        }
        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    public static boolean b(Account account)
    {
        return a(account, com.skype.SkyLib.PARTNER_ID.PARTNER_NONE);
    }

    public static boolean c(Account account)
    {
        return a(account, com.skype.SkyLib.PARTNER_ID.PARTNER_NONE) && !TextUtils.isEmpty(account.getPartnerUID(com.skype.SkyLib.PARTNER_ID.PARTNER_MICROSOFT));
    }

    public static String d(Account account)
    {
        account = account.getPartnerUID(com.skype.SkyLib.PARTNER_ID.PARTNER_MICROSOFT);
        Account account1 = account;
        if (!TextUtils.isEmpty(account))
        {
            do
            {
                account1 = account;
                if (account.length() >= 16)
                {
                    break;
                }
                account = (new StringBuilder("0")).append(account).toString();
            } while (true);
        }
        return account1;
    }

    public static boolean e(Account account)
    {
        return a(account, com.skype.SkyLib.PARTNER_ID.PARTNER_MICROSOFT) && !a(account.getSkypenameProp());
    }
}
