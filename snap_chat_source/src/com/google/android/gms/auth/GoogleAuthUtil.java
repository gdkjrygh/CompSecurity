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
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzm;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.zza;
import com.google.android.gms.internal.zzjo;
import com.google.android.gms.internal.zzr;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.auth:
//            GoogleAuthException, GooglePlayServicesAvailabilityException, UserRecoverableAuthException

public final class GoogleAuthUtil
{

    public static final String KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
    public static final String KEY_CALLER_UID = "callerUid";
    private static final ComponentName zzHk = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final ComponentName zzHl = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");

    public static void clearToken(Context context, String s)
    {
        Object obj;
        Object obj1;
        obj = context.getApplicationContext();
        zzx.zzbe("Calling this from your main thread can lead to deadlock");
        zzI(((Context) (obj)));
        obj1 = new Bundle();
        context = context.getApplicationInfo().packageName;
        ((Bundle) (obj1)).putString("clientPackageName", context);
        if (!((Bundle) (obj1)).containsKey(KEY_ANDROID_PACKAGE_NAME))
        {
            ((Bundle) (obj1)).putString(KEY_ANDROID_PACKAGE_NAME, context);
        }
        context = new zza();
        obj = zzm.zzP(((Context) (obj)));
        if (!((zzm) (obj)).zza(zzHk, context, "GoogleAuthUtil"))
        {
            break MISSING_BLOCK_LABEL_168;
        }
        s = com.google.android.gms.internal.zzr.zza.zza(context.zzhJ()).zza(s, ((Bundle) (obj1)));
        obj1 = s.getString(zzjo.zzIi);
        if (!s.getBoolean("booleanResult"))
        {
            throw new GoogleAuthException(((String) (obj1)));
        }
        break MISSING_BLOCK_LABEL_146;
        s;
        throw new IOException("remote exception");
        s;
        ((zzm) (obj)).zzb(zzHk, context, "GoogleAuthUtil");
        throw s;
        ((zzm) (obj)).zzb(zzHk, context, "GoogleAuthUtil");
        return;
        s;
        throw new GoogleAuthException("Interrupted");
        throw new IOException("Could not bind to service with the given context.");
    }

    public static String getToken(Context context, Account account, String s)
    {
        return getToken(context, account, s, new Bundle());
    }

    public static String getToken(Context context, Account account, String s, Bundle bundle)
    {
        return zza(context, account, s, bundle, null);
    }

    public static String getToken(Context context, String s, String s1)
    {
        return getToken(context, new Account(s, "com.google"), s1);
    }

    private static void zzI(Context context)
    {
        try
        {
            GooglePlayServicesUtil.zzI(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new GooglePlayServicesAvailabilityException(context.getConnectionStatusCode(), context.getMessage(), context.getIntent());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new GoogleAuthException(context.getMessage());
        }
    }

    public static String zza(Context context, Account account, String s, Bundle bundle, Boolean boolean1)
    {
        Context context1 = context.getApplicationContext();
        zzx.zzbe("Calling this from your main thread can lead to deadlock");
        zzI(context1);
        if (bundle == null)
        {
            bundle = new Bundle();
        } else
        {
            bundle = new Bundle(bundle);
        }
        context = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", context);
        if (!bundle.containsKey(KEY_ANDROID_PACKAGE_NAME))
        {
            bundle.putString(KEY_ANDROID_PACKAGE_NAME, context);
        }
        if (boolean1 != null)
        {
            bundle.putBoolean("UseCache", boolean1.booleanValue());
        }
        context = new zza();
        boolean1 = zzm.zzP(context1);
        if (!boolean1.zza(zzHk, context, "GoogleAuthUtil"))
        {
            break MISSING_BLOCK_LABEL_274;
        }
        account = com.google.android.gms.internal.zzr.zza.zza(context.zzhJ()).zza(account, s, bundle);
        if (account != null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        throw new GoogleAuthException("ServiceUnavailable");
        account;
        throw new IOException("remote exception");
        account;
        boolean1.zzb(zzHk, context, "GoogleAuthUtil");
        throw account;
        boolean flag;
        s = account.getString("authtoken");
        flag = TextUtils.isEmpty(s);
        if (!flag)
        {
            boolean1.zzb(zzHk, context, "GoogleAuthUtil");
            return s;
        }
        s = account.getString("Error");
        account = (Intent)account.getParcelable("userRecoveryIntent");
        if (zzaD(s))
        {
            throw new UserRecoverableAuthException(s, account);
        }
        break MISSING_BLOCK_LABEL_249;
        account;
        throw new GoogleAuthException("Interrupted");
        if (zzaC(s))
        {
            throw new IOException(s);
        } else
        {
            throw new GoogleAuthException(s);
        }
        throw new IOException("Could not bind to service with the given context.");
    }

    private static boolean zzaC(String s)
    {
        return "NetworkError".equals(s) || "ServiceUnavailable".equals(s) || "Timeout".equals(s);
    }

    private static boolean zzaD(String s)
    {
        return "BadAuthentication".equals(s) || "CaptchaRequired".equals(s) || "DeviceManagementRequiredOrSyncDisabled".equals(s) || "NeedPermission".equals(s) || "NeedsBrowser".equals(s) || "UserCancel".equals(s) || "AppDownloadRequired".equals(s) || zzjo.zzHG.zzhg().equals(s) || zzjo.zzHH.zzhg().equals(s) || zzjo.zzHI.zzhg().equals(s) || zzjo.zzHJ.zzhg().equals(s) || zzjo.zzHK.zzhg().equals(s) || zzjo.zzHL.zzhg().equals(s) || zzjo.zzHE.zzhg().equals(s);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        i = android.os.Build.VERSION.SDK_INT;
    }
}
