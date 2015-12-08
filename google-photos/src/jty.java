// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;

public final class jty
{

    private static String a = "androidPackageName";
    private static final ComponentName b = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    private static Bundle a(Context context, Account account, String s, Bundle bundle)
    {
        Object obj;
        obj = context.getApplicationContext();
        b.q("Calling this from your main thread can lead to deadlock");
        a(((Context) (obj)));
        if (bundle == null)
        {
            bundle = new Bundle();
        } else
        {
            bundle = new Bundle(bundle);
        }
        context = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", context);
        if (TextUtils.isEmpty(bundle.getString(a)))
        {
            bundle.putString(a, context);
        }
        context = new kdn();
        obj = kca.a(((Context) (obj)));
        if (!((kca) (obj)).a(b, context, "GoogleAuthUtil"))
        {
            break MISSING_BLOCK_LABEL_456;
        }
        s = kst.a(context.a()).a(account, s, bundle);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        Log.w("GoogleAuthUtil", "Binder call returned null.");
        throw new jtx("ServiceUnavailable");
        account;
        throw new IOException("remote exception");
        account;
        ((kca) (obj)).b(b, context, "GoogleAuthUtil");
        throw account;
        boolean flag1 = TextUtils.isEmpty(s.getString("authtoken"));
        if (!flag1)
        {
            ((kca) (obj)).b(b, context, "GoogleAuthUtil");
            return s;
        }
        account = s.getString("Error");
        s = (Intent)s.getParcelable("userRecoveryIntent");
        boolean flag;
        if (!"BadAuthentication".equals(account) && !"CaptchaRequired".equals(account) && !"DeviceManagementRequiredOrSyncDisabled".equals(account) && !"NeedPermission".equals(account) && !"NeedsBrowser".equals(account) && !"UserCancel".equals(account) && !"AppDownloadRequired".equals(account) && !juc.b.h.equals(account) && !juc.c.h.equals(account) && !juc.d.h.equals(account) && !juc.e.h.equals(account) && !juc.f.h.equals(account) && !juc.g.h.equals(account) && !juc.a.h.equals(account))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_403;
        }
        throw new jua(account, s);
        account;
        throw new jtx("Interrupted");
        if ("NetworkError".equals(account) || "ServiceUnavailable".equals(account) || "Timeout".equals(account))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_447;
        }
        throw new IOException(account);
        throw new jtx(account);
        throw new IOException("Could not bind to service with the given context.");
    }

    public static String a(Context context, String s, String s1)
    {
        return a(context, new Account(s, "com.google"), s1, new Bundle()).getString("authtoken");
    }

    public static String a(Context context, String s, String s1, Bundle bundle)
    {
        bundle = new Account(s, "com.google");
        s = null;
        if (true)
        {
            s = new Bundle();
        }
        s.putBoolean("handle_notification", true);
        return b(context, bundle, s1, s).getString("authtoken");
    }

    private static void a(Context context)
    {
        try
        {
            jyc.b(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new jtz(((jyb) (context)).a, context.getMessage(), context.a());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new jtx(context.getMessage());
        }
    }

    public static void a(Context context, String s)
    {
        Object obj;
        Object obj1;
        obj = context.getApplicationContext();
        b.q("Calling this from your main thread can lead to deadlock");
        a(((Context) (obj)));
        obj1 = new Bundle();
        context = context.getApplicationInfo().packageName;
        ((Bundle) (obj1)).putString("clientPackageName", context);
        if (!((Bundle) (obj1)).containsKey(a))
        {
            ((Bundle) (obj1)).putString(a, context);
        }
        context = new kdn();
        obj = kca.a(((Context) (obj)));
        if (!((kca) (obj)).a(b, context, "GoogleAuthUtil"))
        {
            break MISSING_BLOCK_LABEL_168;
        }
        s = kst.a(context.a()).a(s, ((Bundle) (obj1)));
        obj1 = s.getString("Error");
        if (!s.getBoolean("booleanResult"))
        {
            throw new jtx(((String) (obj1)));
        }
        break MISSING_BLOCK_LABEL_146;
        s;
        throw new IOException("remote exception");
        s;
        ((kca) (obj)).b(b, context, "GoogleAuthUtil");
        throw s;
        ((kca) (obj)).b(b, context, "GoogleAuthUtil");
        return;
        s;
        throw new jtx("Interrupted");
        throw new IOException("Could not bind to service with the given context.");
    }

    private static Bundle b(Context context, Account account, String s, Bundle bundle)
    {
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        try
        {
            account = a(context, account, s, bundle1);
            jyc.c(context);
        }
        // Misplaced declaration of an exception variable
        catch (Account account)
        {
            jyc.a(((jtz) (account)).a, context);
            throw new jub("User intervention required. Notification has been pushed.");
        }
        // Misplaced declaration of an exception variable
        catch (Account account)
        {
            jyc.c(context);
            throw new jub("User intervention required. Notification has been pushed.");
        }
        return account;
    }

    public static Account[] b(Context context, String s)
    {
        boolean flag;
        flag = true;
        jxz.a();
        jxz.b(context);
        b.o(s);
        if (!c.a(22)) goto _L2; else goto _L1
_L1:
        if (!c.a(23)) goto _L4; else goto _L3
_L3:
        if (flag)
        {
            return c(context, s);
        } else
        {
            return AccountManager.get(context).getAccountsByType(s);
        }
_L4:
        switch (android.os.Build.VERSION.CODENAME.charAt(0))
        {
        case 77: // 'M'
        case 78: // 'N'
            break;
        }
_L2:
        flag = false;
        if (true) goto _L3; else goto _L5
_L5:
    }

    private static Account[] c(Context context, String s)
    {
        int i;
        i = 0;
        context = ((Context)b.d(context)).getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
        if (context == null)
        {
            return new Account[0];
        }
        Account aaccount[];
        s = context.call("get_accounts", s, new Bundle()).getParcelableArray("accounts");
        aaccount = new Account[s.length];
_L1:
        if (i >= s.length)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        aaccount[i] = (Account)s[i];
        i++;
          goto _L1
        context.release();
        return aaccount;
        s;
        context.release();
        throw s;
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        i = android.os.Build.VERSION.SDK_INT;
        new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
    }
}
