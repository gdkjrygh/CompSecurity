// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.signin;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.common.SharedPreferencesCompat;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Joiner;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.games.util.AccountUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class SignInCache
{

    public static void clearAccount(Context context, String s)
    {
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorenter ;
        removeAccount(context, s, null);
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static int countSignedInGames(Context context, ClientContext clientcontext)
    {
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorenter ;
        int i = 0;
        Iterator iterator;
        clientcontext = clientcontext.getResolvedAccountName();
        context = getPrefs(context);
        iterator = context.getAll().keySet().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s = (String)iterator.next();
        if (s.endsWith("_greeted") || s.endsWith("_desiredAccount") || s.endsWith("_signedOutAccounts")) goto _L4; else goto _L3
_L3:
        s = context.getString(s, null);
        if (!clientcontext.equals(s)) goto _L6; else goto _L5
_L5:
        i++;
          goto _L4
_L6:
        String as[] = s.split(",");
        int j = 0;
_L9:
        if (j >= as.length) goto _L4; else goto _L7
_L7:
        boolean flag = clientcontext.equals(as[j]);
label0:
        {
            if (!flag)
            {
                break label0;
            }
            i++;
        }
        if (true) goto _L4; else goto _L8
_L8:
        j++;
          goto _L9
_L2:
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorexit ;
        return i;
        context;
        throw context;
          goto _L4
    }

    public static Account getAccount(Context context, String s)
    {
        boolean flag = false;
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorenter ;
        if (!getBoolean(context, "skip_verify")) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        signOut(context, s);
        context = getFullAccount(context, getString(context, s));
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorexit ;
        return context;
_L2:
        String s1 = getString(context, s);
        if (s1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = isAccountInvalid(context, getFullAccount(context, s1));
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    private static List getAccountNames(SharedPreferences sharedpreferences, String s)
    {
        sharedpreferences = sharedpreferences.getString(getSignedInAccountsPrefKey(s), null);
        if (sharedpreferences == null)
        {
            return new ArrayList();
        } else
        {
            return ArrayUtils.toArrayList(sharedpreferences.split(","));
        }
    }

    public static Set getAccounts(Context context, String s)
    {
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorenter ;
        Iterator iterator = getSignedInAccounts(context, s).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Account account = (Account)iterator.next();
            if (!getBoolean(context, "skip_verify") && isAccountInvalid(context, account))
            {
                signOut(context, s, account, false);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_66;
        context;
        throw context;
        context = getSignedInAccounts(context, s);
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorexit ;
        return context;
    }

    public static boolean getBoolean(Context context, String s)
    {
        return getPrefs(context).getBoolean(s, false);
    }

    public static Account getDesiredAccount(Context context, String s)
    {
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorenter ;
        boolean flag;
        Preconditions.checkNotNull(s);
        s = getFullAccount(context, getString(context, getDesiredAccountPrefKey(s)));
        flag = isAccountInvalid(context, s);
        context = s;
        if (flag)
        {
            context = null;
        }
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private static String getDesiredAccountPrefKey(String s)
    {
        return (new StringBuilder()).append(s).append("_desiredAccount").toString();
    }

    private static Account getFullAccount(Context context, String s)
    {
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorenter ;
        AndroidUtils.assertMainGmsProcess();
        if (s != null) goto _L2; else goto _L1
_L1:
        context = null;
_L4:
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorexit ;
        return context;
_L2:
        context = new Account(s, context.getSharedPreferences("games.account_types", 0).getString(s, "com.google"));
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    public static String getGreetedPrefKey(String s, String s1)
    {
        return (new StringBuilder()).append(s).append(",").append(s1).append("_greeted").toString();
    }

    private static SharedPreferences getPrefs(Context context)
    {
        AndroidUtils.assertMainGmsProcess();
        context = context.getSharedPreferences("games.sign_in_cache", 0);
        if (context.getInt("version_value", 0) < 0)
        {
            android.content.SharedPreferences.Editor editor = context.edit();
            editor.clear();
            editor.putInt("version_value", 0);
            SharedPreferencesCompat.apply(editor);
        }
        return context;
    }

    private static Set getSignedInAccounts(Context context, String s)
    {
        Object obj = getPrefs(context);
        String s1 = ((SharedPreferences) (obj)).getString(s, null);
        s = getAccountNames(((SharedPreferences) (obj)), s);
        obj = new HashSet(s.size());
        int i = 0;
        for (int j = s.size(); i < j; i++)
        {
            String s2 = (String)s.get(i);
            if (!TextUtils.isEmpty(s2))
            {
                ((HashSet) (obj)).add(getFullAccount(context, s2));
            }
        }

        if (s1 != null)
        {
            ((HashSet) (obj)).add(getFullAccount(context, s1));
        }
        return ((Set) (obj));
    }

    private static String getSignedInAccountsPrefKey(String s)
    {
        return (new StringBuilder()).append(s).append("_signedInAccounts").toString();
    }

    private static Set getSignedOutAccountsInner(Context context, String s)
    {
        s = getPrefs(context).getString(getSignedOutAccountsPrefKey(s), null);
        HashSet hashset;
        int i;
        if (s == null)
        {
            s = new ArrayList();
        } else
        {
            s = ArrayUtils.toArrayList(s.split(","));
        }
        hashset = new HashSet(s.size());
        i = 0;
        for (int j = s.size(); i < j; i++)
        {
            String s1 = (String)s.get(i);
            if (!TextUtils.isEmpty(s1))
            {
                hashset.add(getFullAccount(context, s1));
            }
        }

        return hashset;
    }

    private static String getSignedOutAccountsPrefKey(String s)
    {
        return (new StringBuilder()).append(s).append("_signedOutAccounts").toString();
    }

    private static String getString(Context context, String s)
    {
        return getPrefs(context).getString(s, null);
    }

    private static boolean isAccountInvalid(Context context, Account account)
    {
        return !AccountUtils.ensureAccountExists(context, account);
    }

    public static boolean isSignedIn(Context context, ClientContext clientcontext)
    {
        boolean flag1 = false;
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorenter ;
        Set set;
        set = getAccounts(context, clientcontext.mCallingPackageName);
        clientcontext = clientcontext.mResolvedAccount;
        if (clientcontext != null) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
_L4:
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = flag1;
        boolean flag2;
        if (!set.contains(clientcontext))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag2 = isAccountInvalid(context, clientcontext);
        flag = flag1;
        if (!flag2)
        {
            flag = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    public static void markAsGreeted(Context context, ClientContext clientcontext)
    {
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorenter ;
        context = getPrefs(context).edit();
        context.putBoolean(getGreetedPrefKey(clientcontext.mCallingPackageName, clientcontext.getResolvedAccountName()), true);
        SharedPreferencesCompat.apply(context);
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    private static void recordAccountType(Context context, Account account)
    {
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorenter ;
        context = context.getSharedPreferences("games.account_types", 0).edit();
        context.putString(account.name, account.type);
        SharedPreferencesCompat.apply(context);
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void recordSignIn(Context context, ClientContext clientcontext)
    {
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = getPrefs(context).edit();
        String s = clientcontext.mCallingPackageName;
        Account account = clientcontext.mResolvedAccount;
        List list = getAccountNames(getPrefs(context), s);
        list.add(account.name);
        recordAccountType(context, account);
        if (clientcontext.isResolvedDefaultAccount() || s.startsWith("com.google.android.play.games"))
        {
            editor.putString(s, account.name);
        }
        editor.putBoolean(getGreetedPrefKey(s, account.name), false);
        editor.putString(getSignedInAccountsPrefKey(s), Joiner.on(",").join(list));
        SharedPreferencesCompat.apply(editor);
        clientcontext = getSignedOutAccountsInner(context, s);
        clientcontext.remove(account);
        recordSignedOutAccounts(context, s, clientcontext);
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    private static void recordSignedOutAccounts(Context context, String s, Set set)
    {
        ArrayList arraylist = new ArrayList(set.size());
        for (set = set.iterator(); set.hasNext(); arraylist.add(((Account)set.next()).name)) { }
        context = getPrefs(context).edit();
        context.putString(getSignedOutAccountsPrefKey(s), Joiner.on(",").join(arraylist));
        SharedPreferencesCompat.apply(context);
    }

    private static void removeAccount(Context context, String s, Account account)
    {
        List list = null;
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorenter ;
        Account account1;
        Object obj;
        obj = getPrefs(context);
        account1 = getFullAccount(context, ((SharedPreferences) (obj)).getString(s, null));
        if (account == null)
        {
            context = account1;
        } else
        {
            context = account;
        }
          goto _L1
_L5:
        list = getAccountNames(((SharedPreferences) (obj)), s);
        list.remove(context);
        obj = ((SharedPreferences) (obj)).edit();
        if (account == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        if (!account.equals(account1))
        {
            break MISSING_BLOCK_LABEL_82;
        }
        ((android.content.SharedPreferences.Editor) (obj)).remove(s);
        if (!TextUtils.isEmpty(context))
        {
            ((android.content.SharedPreferences.Editor) (obj)).remove(getGreetedPrefKey(s, context));
        }
        ((android.content.SharedPreferences.Editor) (obj)).putString(getSignedInAccountsPrefKey(s), Joiner.on(",").join(list));
        SharedPreferencesCompat.apply(((android.content.SharedPreferences.Editor) (obj)));
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorexit ;
        return;
_L3:
        context = ((Account) (context)).name;
        continue; /* Loop/switch isn't completed */
        context;
        throw context;
_L1:
        if (context != null) goto _L3; else goto _L2
_L2:
        context = list;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void setDesiredAccount(Context context, String s, Account account)
    {
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor;
        Preconditions.checkNotNull(s);
        editor = getPrefs(context).edit();
        if (account == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        editor.putString(getDesiredAccountPrefKey(s), account.name);
        recordAccountType(context, account);
_L1:
        SharedPreferencesCompat.apply(editor);
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorexit ;
        return;
        editor.remove(getDesiredAccountPrefKey(s));
          goto _L1
        context;
        throw context;
    }

    public static void signOut(Context context, ClientContext clientcontext)
    {
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorenter ;
        signOut(context, clientcontext, false);
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void signOut(Context context, ClientContext clientcontext, boolean flag)
    {
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorenter ;
        signOut(context, clientcontext.mCallingPackageName, clientcontext.mResolvedAccount, flag);
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    private static void signOut(Context context, String s)
    {
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorenter ;
        signOut(context, s, null, false);
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    private static void signOut(Context context, String s, Account account, boolean flag)
    {
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorenter ;
        Account account1;
        account1 = getFullAccount(context, getPrefs(context).getString(s, null));
        removeAccount(context, s, account);
        if (account == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        if (!account.equals(account1))
        {
            break MISSING_BLOCK_LABEL_44;
        }
        com.google.android.gms.common.util.AccountUtils.clearSelectedAccount(context, s);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        recordAccountType(context, account);
        Set set = getSignedOutAccountsInner(context, s);
        set.add(account);
        recordSignedOutAccounts(context, s, set);
        com/google/android/gms/games/signin/SignInCache;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }
}
