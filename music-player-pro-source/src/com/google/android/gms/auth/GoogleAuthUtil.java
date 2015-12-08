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
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.a;
import com.google.android.gms.internal.ii;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.r;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth:
//            GoogleAuthException, GooglePlayServicesAvailabilityException, UserRecoverableAuthException, UserRecoverableNotifiedException, 
//            AccountChangeEventsRequest, AccountChangeEventsResponse

public final class GoogleAuthUtil
{

    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    private static final ComponentName Ek;
    private static final ComponentName El;
    private static final Intent Em;
    private static final Intent En;
    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final String KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
    public static final String KEY_CALLER_UID = "callerUid";
    public static final String KEY_REQUEST_ACTIONS = "request_visible_actions";
    public static final String KEY_REQUEST_VISIBLE_ACTIVITIES = "request_visible_actions";
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";

    private GoogleAuthUtil()
    {
    }

    private static void C(Context context)
        throws GoogleAuthException
    {
        try
        {
            GooglePlayServicesUtil.C(context);
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

    private static String a(Context context, String s, String s1, Bundle bundle)
        throws IOException, GoogleAuthException
    {
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        try
        {
            s = getToken(context, s, s1, bundle1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GooglePlayServicesUtil.showErrorNotification(s.getConnectionStatusCode(), context);
            throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        }
        return s;
    }

    private static boolean ax(String s)
    {
        return "NetworkError".equals(s) || "ServiceUnavailable".equals(s) || "Timeout".equals(s);
    }

    private static boolean ay(String s)
    {
        return "BadAuthentication".equals(s) || "CaptchaRequired".equals(s) || "DeviceManagementRequiredOrSyncDisabled".equals(s) || "NeedPermission".equals(s) || "NeedsBrowser".equals(s) || "UserCancel".equals(s) || "AppDownloadRequired".equals(s) || ii.EI.fO().equals(s) || ii.EJ.fO().equals(s) || ii.EK.fO().equals(s) || ii.EL.fO().equals(s) || ii.EM.fO().equals(s) || ii.EN.fO().equals(s);
    }

    public static void clearToken(Context context, String s)
        throws GooglePlayServicesAvailabilityException, GoogleAuthException, IOException
    {
        Context context1;
        Object obj;
        context1 = context.getApplicationContext();
        jx.aV("Calling this from your main thread can lead to deadlock");
        C(context1);
        obj = new Bundle();
        context = context.getApplicationInfo().packageName;
        ((Bundle) (obj)).putString("clientPackageName", context);
        if (!((Bundle) (obj)).containsKey(KEY_ANDROID_PACKAGE_NAME))
        {
            ((Bundle) (obj)).putString(KEY_ANDROID_PACKAGE_NAME, context);
        }
        context = new a();
        if (!context1.bindService(Em, context, 1))
        {
            break MISSING_BLOCK_LABEL_166;
        }
        s = com.google.android.gms.internal.r.a.a(context.gs()).a(s, ((Bundle) (obj)));
        obj = s.getString(ii.Fk);
        if (!s.getBoolean("booleanResult"))
        {
            throw new GoogleAuthException(((String) (obj)));
        }
        break MISSING_BLOCK_LABEL_148;
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

    public static List getAccountChangeEvents(Context context, int i, String s)
        throws GoogleAuthException, IOException
    {
        a a1;
        jx.b(s, "accountName must be provided");
        jx.aV("Calling this from your main thread can lead to deadlock");
        context = context.getApplicationContext();
        C(context);
        a1 = new a();
        if (!context.bindService(Em, a1, 1))
        {
            break MISSING_BLOCK_LABEL_123;
        }
        s = com.google.android.gms.internal.r.a.a(a1.gs()).a((new AccountChangeEventsRequest()).setAccountName(s).setEventIndex(i)).getEvents();
        context.unbindService(a1);
        return s;
        s;
        Log.i("GoogleAuthUtil", "GMS remote exception ", s);
        throw new IOException("remote exception");
        s;
        context.unbindService(a1);
        throw s;
        s;
        throw new GoogleAuthException("Interrupted");
        throw new IOException("Could not bind to service with the given context.");
    }

    public static String getAccountId(Context context, String s)
        throws GoogleAuthException, IOException
    {
        jx.b(s, "accountName must be provided");
        jx.aV("Calling this from your main thread can lead to deadlock");
        C(context.getApplicationContext());
        return getToken(context, s, "^^_account_id_^^", new Bundle());
    }

    public static String getAppCert(Context context, String s)
    {
        return "spatula";
    }

    public static String getToken(Context context, String s, String s1)
        throws IOException, UserRecoverableAuthException, GoogleAuthException
    {
        return getToken(context, s, s1, new Bundle());
    }

    public static String getToken(Context context, String s, String s1, Bundle bundle)
        throws IOException, UserRecoverableAuthException, GoogleAuthException
    {
        Context context1;
        context1 = context.getApplicationContext();
        jx.aV("Calling this from your main thread can lead to deadlock");
        C(context1);
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
        context = new a();
        if (!context1.bindService(Em, context, 1))
        {
            break MISSING_BLOCK_LABEL_266;
        }
        s = com.google.android.gms.internal.r.a.a(context.gs()).a(s, s1, bundle);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_166;
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
        if (ay(s1))
        {
            throw new UserRecoverableAuthException(s1, s);
        }
        break MISSING_BLOCK_LABEL_241;
        s;
        throw new GoogleAuthException("Interrupted");
        if (ax(s1))
        {
            throw new IOException(s1);
        } else
        {
            throw new GoogleAuthException(s1);
        }
        throw new IOException("Could not bind to service with the given context.");
    }

    public static String getTokenWithNotification(Context context, String s, String s1, Bundle bundle)
        throws IOException, UserRecoverableNotifiedException, GoogleAuthException
    {
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        bundle1.putBoolean("handle_notification", true);
        return a(context, s, s1, bundle1);
    }

    public static String getTokenWithNotification(Context context, String s, String s1, Bundle bundle, Intent intent)
        throws IOException, UserRecoverableNotifiedException, GoogleAuthException
    {
        h(intent);
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        bundle1.putParcelable("callback_intent", intent);
        bundle1.putBoolean("handle_notification", true);
        return a(context, s, s1, bundle1);
    }

    public static String getTokenWithNotification(Context context, String s, String s1, Bundle bundle, String s2, Bundle bundle1)
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
        return a(context, s, s1, bundle2);
    }

    private static void h(Intent intent)
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

    public static void invalidateToken(Context context, String s)
    {
        AccountManager.get(context).invalidateAuthToken("com.google", s);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT < 11);
        if (android.os.Build.VERSION.SDK_INT < 14);
        Ek = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
        El = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
        Em = (new Intent()).setPackage("com.google.android.gms").setComponent(Ek);
        En = (new Intent()).setPackage("com.google.android.gms").setComponent(El);
    }
}
