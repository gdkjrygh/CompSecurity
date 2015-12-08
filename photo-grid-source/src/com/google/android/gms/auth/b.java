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
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.ak;
import com.google.android.gms.internal.al;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.auth:
//            a, c, TokenData, d

public final class b
{

    public static final String a = "callerUid";
    public static final String b = "androidPackageName";
    private static final ComponentName c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final ComponentName d = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");

    private static TokenData a(Context context, Account account, String s, Bundle bundle)
    {
        Context context1 = context.getApplicationContext();
        bl.c("Calling this from your main thread can lead to deadlock");
        Bundle bundle1;
        try
        {
            GooglePlayServicesUtil.zzaa(context1);
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
        bundle1 = new Bundle(bundle);
        context = context.getApplicationInfo().packageName;
        bundle1.putString("clientPackageName", context);
        if (TextUtils.isEmpty(bundle1.getString(b)))
        {
            bundle1.putString(b, context);
        }
        bundle1.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        context = new h();
        bundle = am.a(context1);
        if (!bundle.a(c, context, "GoogleAuthUtil"))
        {
            break MISSING_BLOCK_LABEL_305;
        }
        s = al.a(context.a()).a(account, s, bundle1);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        Log.w("GoogleAuthUtil", "Binder call returned null.");
        throw new a("ServiceUnavailable");
        account;
        Log.i("GoogleAuthUtil", "GMS remote exception ", account);
        throw new IOException("remote exception");
        account;
        bundle.a(c, context);
        throw account;
        account = TokenData.a(s, "tokenDetails");
        if (account != null)
        {
            bundle.a(c, context);
            return account;
        }
        com.google.android.gms.auth.firstparty.shared.d d1;
        account = s.getString("Error");
        s = (Intent)s.getParcelable("userRecoveryIntent");
        d1 = com.google.android.gms.auth.firstparty.shared.d.a(account);
        if (com.google.android.gms.auth.firstparty.shared.d.a(d1))
        {
            throw new com.google.android.gms.auth.d(account, s);
        }
        break MISSING_BLOCK_LABEL_279;
        account;
        throw new a("Interrupted");
        if (com.google.android.gms.auth.firstparty.shared.d.b(d1))
        {
            throw new IOException(account);
        } else
        {
            throw new a(account);
        }
        throw new IOException("Could not bind to service with the given context.");
    }

    public static String a(Context context, String s, String s1)
    {
        return a(context, new Account(s, "com.google"), s1, new Bundle()).a();
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        i = android.os.Build.VERSION.SDK_INT;
    }
}
