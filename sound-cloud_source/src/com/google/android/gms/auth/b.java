// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.b.c;
import com.google.android.gms.b.i;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzl;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.zza;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.auth:
//            d, a, c

public final class b
{

    public static final String a = "callerUid";
    public static final String b = "androidPackageName";
    private static final ComponentName c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final ComponentName d = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");

    private static Bundle a(Context context, Account account, String s, Bundle bundle)
        throws IOException, d, a
    {
        Object obj;
        obj = context.getApplicationContext();
        zzx.zzci("Calling this from your main thread can lead to deadlock");
        try
        {
            GooglePlayServicesUtil.zzaa(((Context) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new com.google.android.gms.auth.c(context.getConnectionStatusCode(), context.getMessage(), context.getIntent());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new a(context.getMessage());
        }
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
        context = new zza();
        obj = zzl.zzak(((Context) (obj)));
        if (!((zzl) (obj)).zza(c, context, "GoogleAuthUtil"))
        {
            break MISSING_BLOCK_LABEL_482;
        }
        s = com.google.android.gms.b.c.a.a(context.zzmS()).a(account, s, bundle);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        throw new a("ServiceUnavailable");
        account;
        throw new IOException("remote exception");
        account;
        ((zzl) (obj)).zzb(c, context, "GoogleAuthUtil");
        throw account;
        boolean flag1 = TextUtils.isEmpty(s.getString("authtoken"));
        if (!flag1)
        {
            ((zzl) (obj)).zzb(c, context, "GoogleAuthUtil");
            return s;
        }
        account = s.getString("Error");
        s = (Intent)s.getParcelable("userRecoveryIntent");
        boolean flag;
        if (!"BadAuthentication".equals(account) && !"CaptchaRequired".equals(account) && !"DeviceManagementRequiredOrSyncDisabled".equals(account) && !"NeedPermission".equals(account) && !"NeedsBrowser".equals(account) && !"UserCancel".equals(account) && !"AppDownloadRequired".equals(account) && !i.u.W.equals(account) && !i.v.W.equals(account) && !i.w.W.equals(account) && !i.x.W.equals(account) && !i.y.W.equals(account) && !i.z.W.equals(account) && !i.s.W.equals(account))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_429;
        }
        throw new d(account, s);
        account;
        throw new a("Interrupted");
        if ("NetworkError".equals(account) || "ServiceUnavailable".equals(account) || "Timeout".equals(account))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_473;
        }
        throw new IOException(account);
        throw new a(account);
        throw new IOException("Could not bind to service with the given context.");
    }

    public static String a(Context context, String s, String s1, Bundle bundle)
        throws IOException, d, a
    {
        return a(context, new Account(s, "com.google"), s1, bundle).getString("authtoken");
    }

    public static void a(Context context, String s)
    {
        AccountManager.get(context).invalidateAuthToken("com.google", s);
    }

    static 
    {
        int j = android.os.Build.VERSION.SDK_INT;
        j = android.os.Build.VERSION.SDK_INT;
    }
}
