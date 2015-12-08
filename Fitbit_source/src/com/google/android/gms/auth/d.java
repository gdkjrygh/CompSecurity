// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.e;
import com.google.android.gms.common.g;
import com.google.android.gms.internal.am;
import com.google.android.gms.internal.dr;
import com.google.android.gms.internal.ii;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth:
//            UserRecoverableAuthException, GoogleAuthException, UserRecoverableNotifiedException, AccountChangeEventsRequest, 
//            AccountChangeEventsResponse, GooglePlayServicesAvailabilityException

public final class d
{

    public static final String a = "com.google";
    public static final String b = "callerUid";
    public static final String c = "androidPackageName";
    public static final String d = "request_visible_actions";
    public static final String e = "request_visible_actions";
    public static final String f = "suppressProgressScreen";
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public static final int j = 4;
    private static final ComponentName k;
    private static final ComponentName l;
    private static final Intent m;
    private static final Intent n;

    private d()
    {
    }

    public static String a(Context context, String s, String s1)
        throws IOException, UserRecoverableAuthException, GoogleAuthException
    {
        return a(context, s, s1, new Bundle());
    }

    public static String a(Context context, String s, String s1, Bundle bundle)
        throws IOException, UserRecoverableAuthException, GoogleAuthException
    {
        Context context1;
        context1 = context.getApplicationContext();
        am.c("Calling this from your main thread can lead to deadlock");
        a(context1);
        if (bundle == null)
        {
            bundle = new Bundle();
        } else
        {
            bundle = new Bundle(bundle);
        }
        context = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", context);
        if (!bundle.containsKey(c))
        {
            bundle.putString(c, context);
        }
        context = new g();
        if (!context1.bindService(m, context, 1))
        {
            break MISSING_BLOCK_LABEL_257;
        }
        s = com.google.android.gms.internal.dr.a.a(context.a()).a(s, s1, bundle);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        Log.w("GoogleAuthUtil", "Binder call returned null.");
        throw new GoogleAuthException("ServiceUnavailable");
        s;
        Log.i("GoogleAuthUtil", "GMS remote exception ", s);
        throw new IOException("remote exception");
        s;
        context1.unbindService(context);
        throw s;
        boolean flag;
        s1 = s.getString("authtoken");
        flag = TextUtils.isEmpty(s1);
        if (!flag)
        {
            context1.unbindService(context);
            return s1;
        }
        s1 = s.getString("Error");
        s = (Intent)s.getParcelable("userRecoveryIntent");
        if (b(s1))
        {
            throw new UserRecoverableAuthException(s1, s);
        }
        break MISSING_BLOCK_LABEL_232;
        s;
        throw new GoogleAuthException("Interrupted");
        if (a(s1))
        {
            throw new IOException(s1);
        } else
        {
            throw new GoogleAuthException(s1);
        }
        throw new IOException("Could not bind to service with the given context.");
    }

    public static String a(Context context, String s, String s1, Bundle bundle, Intent intent)
        throws IOException, UserRecoverableNotifiedException, GoogleAuthException
    {
        a(intent);
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        bundle1.putParcelable("callback_intent", intent);
        bundle1.putBoolean("handle_notification", true);
        return c(context, s, s1, bundle1);
    }

    public static String a(Context context, String s, String s1, Bundle bundle, String s2, Bundle bundle1)
        throws IOException, UserRecoverableNotifiedException, GoogleAuthException
    {
        if (TextUtils.isEmpty(s2))
        {
            throw new IllegalArgumentException("Authority cannot be empty or null.");
        }
        Bundle bundle2 = bundle;
        if (bundle == null)
        {
            bundle2 = new Bundle();
        }
        bundle = bundle1;
        if (bundle1 == null)
        {
            bundle = new Bundle();
        }
        ContentResolver.validateSyncExtrasBundle(bundle);
        bundle2.putString("authority", s2);
        bundle2.putBundle("sync_extras", bundle);
        bundle2.putBoolean("handle_notification", true);
        return c(context, s, s1, bundle2);
    }

    public static List a(Context context, int i1, String s)
        throws GoogleAuthException, IOException
    {
        g g1;
        am.a(s, "accountName must be provided");
        am.c("Calling this from your main thread can lead to deadlock");
        context = context.getApplicationContext();
        a(context);
        g1 = new g();
        if (!context.bindService(m, g1, 1))
        {
            break MISSING_BLOCK_LABEL_119;
        }
        s = com.google.android.gms.internal.dr.a.a(g1.a()).a((new AccountChangeEventsRequest()).a(s).a(i1)).a();
        context.unbindService(g1);
        return s;
        s;
        Log.i("GoogleAuthUtil", "GMS remote exception ", s);
        throw new IOException("remote exception");
        s;
        context.unbindService(g1);
        throw s;
        s;
        throw new GoogleAuthException("Interrupted");
        throw new IOException("Could not bind to service with the given context.");
    }

    private static void a(Context context)
        throws GoogleAuthException
    {
        try
        {
            com.google.android.gms.common.e.b(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new GooglePlayServicesAvailabilityException(context.a(), context.getMessage(), context.b());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new GoogleAuthException(context.getMessage());
        }
    }

    public static void a(Context context, String s)
    {
        AccountManager.get(context).invalidateAuthToken("com.google", s);
    }

    private static void a(Intent intent)
    {
        if (intent == null)
        {
            throw new IllegalArgumentException("Callback cannot be null.");
        }
        intent = intent.toUri(1);
        try
        {
            Intent.parseUri(intent, 1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
        }
    }

    private static boolean a(String s)
    {
        return "NetworkError".equals(s) || "ServiceUnavailable".equals(s) || "Timeout".equals(s);
    }

    public static String b(Context context, String s, String s1, Bundle bundle)
        throws IOException, UserRecoverableNotifiedException, GoogleAuthException
    {
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        bundle1.putBoolean("handle_notification", true);
        return c(context, s, s1, bundle1);
    }

    public static void b(Context context, String s)
        throws GooglePlayServicesAvailabilityException, GoogleAuthException, IOException
    {
        Context context1;
        Object obj;
        context1 = context.getApplicationContext();
        am.c("Calling this from your main thread can lead to deadlock");
        a(context1);
        obj = new Bundle();
        context = context.getApplicationInfo().packageName;
        ((Bundle) (obj)).putString("clientPackageName", context);
        if (!((Bundle) (obj)).containsKey(c))
        {
            ((Bundle) (obj)).putString(c, context);
        }
        context = new g();
        if (!context1.bindService(m, context, 1))
        {
            break MISSING_BLOCK_LABEL_162;
        }
        s = com.google.android.gms.internal.dr.a.a(context.a()).a(s, ((Bundle) (obj)));
        obj = s.getString(ii.T);
        if (!s.getBoolean("booleanResult"))
        {
            throw new GoogleAuthException(((String) (obj)));
        }
        break MISSING_BLOCK_LABEL_145;
        s;
        Log.i("GoogleAuthUtil", "GMS remote exception ", s);
        throw new IOException("remote exception");
        s;
        context1.unbindService(context);
        throw s;
        context1.unbindService(context);
        return;
        s;
        throw new GoogleAuthException("Interrupted");
        throw new IOException("Could not bind to service with the given context.");
    }

    private static boolean b(String s)
    {
        return "BadAuthentication".equals(s) || "CaptchaRequired".equals(s) || "DeviceManagementRequiredOrSyncDisabled".equals(s) || "NeedPermission".equals(s) || "NeedsBrowser".equals(s) || "UserCancel".equals(s) || "AppDownloadRequired".equals(s) || ii.r.a().equals(s) || ii.s.a().equals(s) || ii.t.a().equals(s) || ii.u.a().equals(s) || ii.v.a().equals(s) || ii.w.a().equals(s);
    }

    public static String c(Context context, String s)
    {
        return "spatula";
    }

    private static String c(Context context, String s, String s1, Bundle bundle)
        throws IOException, GoogleAuthException
    {
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        try
        {
            s = a(context, s, s1, bundle1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.common.e.a(s.a(), context);
            throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        }
        return s;
    }

    public static String d(Context context, String s)
        throws GoogleAuthException, IOException
    {
        am.a(s, "accountName must be provided");
        am.c("Calling this from your main thread can lead to deadlock");
        a(context.getApplicationContext());
        return a(context, s, "^^_account_id_^^", new Bundle());
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT < 11);
        if (android.os.Build.VERSION.SDK_INT < 14);
        k = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
        l = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
        m = (new Intent()).setPackage("com.google.android.gms").setComponent(k);
        n = (new Intent()).setPackage("com.google.android.gms").setComponent(l);
    }
}
