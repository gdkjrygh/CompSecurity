// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.common.e;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.il;
import com.google.android.gms.internal.u;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.auth:
//            d, a, c

public final class b
{

    public static final String a = "callerUid";
    public static final String b = "androidPackageName";
    private static final ComponentName c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final ComponentName d = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");

    private b()
    {
    }

    public static String a(Context context, Account account, String s)
        throws IOException, com.google.android.gms.auth.d, a
    {
        return a(context, account, s, new Bundle());
    }

    public static String a(Context context, Account account, String s, Bundle bundle)
        throws IOException, com.google.android.gms.auth.d, a
    {
        return b(context, account, s, bundle).getString("authtoken");
    }

    public static String a(Context context, String s, String s1)
        throws IOException, com.google.android.gms.auth.d, a
    {
        return a(context, new Account(s, "com.google"), s1);
    }

    private static void a(Context context)
        throws a
    {
        try
        {
            e.b(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new com.google.android.gms.auth.c(context.a(), context.getMessage(), context.b());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a(context.getMessage());
        }
    }

    public static void a(Context context, String s)
        throws com.google.android.gms.auth.c, a, IOException
    {
        Object obj;
        Object obj1;
        obj = context.getApplicationContext();
        z.c("Calling this from your main thread can lead to deadlock");
        a(((Context) (obj)));
        obj1 = new Bundle();
        context = context.getApplicationInfo().packageName;
        ((Bundle) (obj1)).putString("clientPackageName", context);
        if (!((Bundle) (obj1)).containsKey(b))
        {
            ((Bundle) (obj1)).putString(b, context);
        }
        context = new h();
        obj = o.a(((Context) (obj)));
        if (!((o) (obj)).a(c, context, "GoogleAuthUtil"))
        {
            break MISSING_BLOCK_LABEL_176;
        }
        s = com.google.android.gms.internal.u.a.a(context.a()).a(s, ((Bundle) (obj1)));
        obj1 = s.getString("Error");
        if (!s.getBoolean("booleanResult"))
        {
            throw new a(((String) (obj1)));
        }
        break MISSING_BLOCK_LABEL_154;
        s;
        Log.i("GoogleAuthUtil", "GMS remote exception ", s);
        throw new IOException("remote exception");
        s;
        ((o) (obj)).b(c, context, "GoogleAuthUtil");
        throw s;
        ((o) (obj)).b(c, context, "GoogleAuthUtil");
        return;
        s;
        throw new a("Interrupted");
        throw new IOException("Could not bind to service with the given context.");
    }

    private static boolean a(String s)
    {
        return "NetworkError".equals(s) || "ServiceUnavailable".equals(s) || "Timeout".equals(s);
    }

    public static Bundle b(Context context, Account account, String s, Bundle bundle)
        throws IOException, com.google.android.gms.auth.d, a
    {
        Object obj;
        obj = context.getApplicationContext();
        z.c("Calling this from your main thread can lead to deadlock");
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
        if (TextUtils.isEmpty(bundle.getString(b)))
        {
            bundle.putString(b, context);
        }
        context = new h();
        obj = o.a(((Context) (obj)));
        if (!((o) (obj)).a(c, context, "GoogleAuthUtil"))
        {
            break MISSING_BLOCK_LABEL_276;
        }
        s = com.google.android.gms.internal.u.a.a(context.a()).a(account, s, bundle);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        Log.w("GoogleAuthUtil", "Binder call returned null.");
        throw new a("ServiceUnavailable");
        account;
        Log.i("GoogleAuthUtil", "GMS remote exception ", account);
        throw new IOException("remote exception");
        account;
        ((o) (obj)).b(c, context, "GoogleAuthUtil");
        throw account;
        boolean flag = TextUtils.isEmpty(s.getString("authtoken"));
        if (!flag)
        {
            ((o) (obj)).b(c, context, "GoogleAuthUtil");
            return s;
        }
        account = s.getString("Error");
        s = (Intent)s.getParcelable("userRecoveryIntent");
        if (b(((String) (account))))
        {
            throw new com.google.android.gms.auth.d(account, s);
        }
        break MISSING_BLOCK_LABEL_251;
        account;
        throw new a("Interrupted");
        if (a(account))
        {
            throw new IOException(account);
        } else
        {
            throw new a(account);
        }
        throw new IOException("Could not bind to service with the given context.");
    }

    private static boolean b(String s)
    {
        return "BadAuthentication".equals(s) || "CaptchaRequired".equals(s) || "DeviceManagementRequiredOrSyncDisabled".equals(s) || "NeedPermission".equals(s) || "NeedsBrowser".equals(s) || "UserCancel".equals(s) || "AppDownloadRequired".equals(s) || il.u.a().equals(s) || il.v.a().equals(s) || il.w.a().equals(s) || il.x.a().equals(s) || il.y.a().equals(s) || il.z.a().equals(s) || il.s.a().equals(s);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT < 11);
        if (android.os.Build.VERSION.SDK_INT < 14);
    }
}
