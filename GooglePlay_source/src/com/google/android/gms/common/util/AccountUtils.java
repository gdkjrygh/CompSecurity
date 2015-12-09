// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.android.common.SharedPreferencesCompat;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.permission.PermissionChecker;
import com.google.android.gsf.GoogleLoginServiceConstants;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.util:
//            PlatformVersion, AndroidUtils

public final class AccountUtils
{
    static interface GoogleAuthUtilCompat
    {
    }


    private static final GoogleAuthUtilCompat DEFAULT_GOOGLE_AUTH_UTIL = new GoogleAuthUtilCompat() {

    };
    private static final GmsLogger GMS_LOGGER = new GmsLogger("AccountUtils");

    public static void clearSelectedAccount(Context context, String s)
    {
        Log.d("AccountUtils", (new StringBuilder("Clearing selected account for ")).append(s).toString());
        context = getPrefs(context).edit();
        context.remove(s);
        context.remove((new StringBuilder("selected_account_type:")).append(s).toString());
        SharedPreferencesCompat.apply(context);
    }

    public static boolean ensureAccountExists(Context context, Account account)
    {
        return ensureAccountExists(context, account, context.getPackageName());
    }

    private static boolean ensureAccountExists(Context context, Account account, String s)
    {
        for (context = getAvailableAccountsByType(context, s, account.type).iterator(); context.hasNext();)
        {
            if (((Account)context.next()).name.equals(account.name))
            {
                return true;
            }
        }

        return false;
    }

    public static boolean ensureAccountExists(Context context, String s)
    {
        for (context = getAvailableAccountsByType(context, context.getPackageName(), "com.google").iterator(); context.hasNext();)
        {
            if (((Account)context.next()).name.equals(s))
            {
                return true;
            }
        }

        return false;
    }

    public static String[] extractSortedAccountNames(List list)
    {
        int j = list.size();
        String as[] = new String[j];
        for (int i = 0; i < j; i++)
        {
            as[i] = ((Account)list.get(i)).name;
        }

        Arrays.sort(as, String.CASE_INSENSITIVE_ORDER);
        return as;
    }

    private static List getAvailableAccountsByType(Context context, String s, String s1)
    {
        AccountManager accountmanager = AccountManager.get(context);
        boolean flag1 = PlatformVersion.checkVersion(18);
        boolean flag = flag1;
        if (flag1)
        {
            ClientContext clientcontext = new ClientContext();
            clientcontext.mCallingPackageName = context.getPackageName();
            clientcontext.mCallingUid = Process.myUid();
            if (PermissionChecker.createInstance(context, clientcontext).checkPermission("android.permission.INTERACT_ACROSS_USERS") == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        if (flag)
        {
            context = accountmanager.getAccountsByTypeForPackage(s1, s);
        } else
        {
            context = accountmanager.getAccountsByType(s1);
        }
        return Arrays.asList(context);
    }

    public static List getAvailableGoogleAccounts(Context context, String s)
    {
        return getAvailableAccountsByType(context, s, "com.google");
    }

    private static SharedPreferences getPrefs(Context context)
    {
        AndroidUtils.assertMainGmsProcess();
        return context.getSharedPreferences("common.selected_account_prefs", 0);
    }

    private static List getUnicornAccounts(Context context)
    {
        Object obj;
        Object obj1;
        Object obj3;
        Preconditions.checkNotMainThread("Cannot list accounts on main thread!");
        context = AccountManager.get(context).getAccountsByTypeAndFeatures("com.google", new String[] {
            GoogleLoginServiceConstants.featureForService("uca")
        }, null, null);
        obj3 = new Account[0];
        obj1 = obj3;
        obj = obj3;
        context = (Account[])context.getResult();
        obj1 = context;
        obj = context;
        obj3 = context;
        Log.v("AccountUtils", String.format("%d accounts found with %s feature", new Object[] {
            Integer.valueOf(context.length), "uca"
        }));
_L2:
        return Arrays.asList(context);
        obj;
        Object obj2;
        context = ((Context) (obj1));
        obj2 = obj;
_L3:
        Log.w("AccountUtils", "Unable to get accounts by type and feature", ((Throwable) (obj2)));
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        context = ((Context) (obj));
          goto _L3
        obj2;
        context = ((Context) (obj3));
          goto _L3
    }

    public static String getValidSelectedAccount(Context context, String s)
    {
        context = getValidSelectedAccountObj(context, s);
        if (context != null)
        {
            return ((Account) (context)).name;
        } else
        {
            return null;
        }
    }

    public static Account getValidSelectedAccountObj(Context context, String s)
    {
        Object obj = getPrefs(context);
        String s1 = ((SharedPreferences) (obj)).getString(s, null);
        if (!TextUtils.isEmpty(s1))
        {
            obj = new Account(s1, ((SharedPreferences) (obj)).getString((new StringBuilder("selected_account_type:")).append(s).toString(), "com.google"));
            if (ensureAccountExists(context, ((Account) (obj)), s))
            {
                return ((Account) (obj));
            }
        }
        return null;
    }

    public static boolean isDefaultAccount(Account account, String s)
    {
        return account != null && account.name.equals("<<default account>>") && account.type.equals(s);
    }

    public static boolean isUnicornAccount(Context context, String s)
    {
        context = getUnicornAccounts(context);
        int i = 0;
        for (int j = context.size(); i < j; i++)
        {
            if (s.equals(((Account)context.get(i)).name))
            {
                return true;
            }
        }

        return false;
    }

    public static Account resolveAccount(Context context, Account account, String s)
    {
        Account account1;
        if (account == null)
        {
            account1 = null;
        } else
        {
            if ("<<default account>>".equals(account.name))
            {
                return getValidSelectedAccountObj(context, s);
            }
            account1 = account;
            if (!ensureAccountExists(context, account, s))
            {
                return null;
            }
        }
        return account1;
    }

    public static void setSelectedAccount(Context context, ClientContext clientcontext)
    {
        if (clientcontext.isResolvedDefaultAccount())
        {
            setSelectedAccount(context, clientcontext.mCallingPackageName, clientcontext.mResolvedAccount);
        }
    }

    public static void setSelectedAccount(Context context, String s, Account account)
    {
        if (account != null)
        {
            context = getPrefs(context).edit();
            context.putString(s, account.name);
            context.putString((new StringBuilder("selected_account_type:")).append(s).toString(), account.type);
            SharedPreferencesCompat.apply(context);
        }
    }

    public static void setSelectedAccount(Context context, String s, String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            setSelectedAccount(context, s, new Account(s1, "com.google"));
        }
    }

}
