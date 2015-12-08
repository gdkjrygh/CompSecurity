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
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.a;
import com.google.android.gms.internal.gd;
import com.google.android.gms.internal.hm;
import com.google.android.gms.internal.r;
import java.io.IOException;
import java.net.URISyntaxException;

// Referenced classes of package com.google.android.gms.auth:
//            UserRecoverableNotifiedException, GoogleAuthException, GooglePlayServicesAvailabilityException, UserRecoverableAuthException

public final class GoogleAuthUtil
{
    private static class a extends Handler
    {

        private final Context lz;

        public void handleMessage(Message message)
        {
            if (message.what == 1)
            {
                int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(lz);
                if (GooglePlayServicesUtil.isUserRecoverableError(i))
                {
                    GooglePlayServicesUtil.showErrorNotification(i, lz);
                }
                return;
            } else
            {
                Log.wtf("GoogleAuthUtil", (new StringBuilder()).append("Don't know how to handle this message: ").append(message.what).toString());
                return;
            }
        }

        a(Context context)
        {
            Looper looper;
            if (Looper.myLooper() == null)
            {
                looper = Looper.getMainLooper();
            } else
            {
                looper = Looper.myLooper();
            }
            super(looper);
            lz = context;
        }
    }


    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final String KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
    public static final String KEY_CALLER_UID = "callerUid";
    public static final String KEY_REQUEST_ACTIONS = "request_visible_actions";
    public static final String KEY_REQUEST_VISIBLE_ACTIVITIES = "request_visible_actions";
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    private static final ComponentName yU;
    private static final ComponentName yV;
    private static final Intent yW;
    private static final Intent yX;

    private GoogleAuthUtil()
    {
    }

    private static String a(Context context, String s, String s1, Bundle bundle)
        throws IOException, UserRecoverableNotifiedException, GoogleAuthException
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
            int i = s.getConnectionStatusCode();
            if (b(context, i))
            {
                context = new a(context.getApplicationContext());
                context.sendMessageDelayed(context.obtainMessage(1), 30000L);
            } else
            {
                GooglePlayServicesUtil.showErrorNotification(i, context);
            }
            throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        }
        return s;
    }

    private static boolean ac(String s)
    {
        return "NetworkError".equals(s) || "ServiceUnavailable".equals(s) || "Timeout".equals(s);
    }

    private static boolean ad(String s)
    {
        return "BadAuthentication".equals(s) || "CaptchaRequired".equals(s) || "DeviceManagementRequiredOrSyncDisabled".equals(s) || "NeedPermission".equals(s) || "NeedsBrowser".equals(s) || "UserCancel".equals(s) || "AppDownloadRequired".equals(s);
    }

    private static boolean b(Context context, int i)
    {
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        context = context.getPackageManager();
        boolean flag = context.getApplicationInfo("com.google.android.gms", 8192).enabled;
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_30;
        context;
        return false;
    }

    public static void clearToken(Context context, String s)
        throws GooglePlayServicesAvailabilityException, GoogleAuthException, IOException
    {
        Context context1;
        Object obj;
        context1 = context.getApplicationContext();
        hm.az("Calling this from your main thread can lead to deadlock");
        z(context1);
        obj = new Bundle();
        context = context.getApplicationInfo().packageName;
        ((Bundle) (obj)).putString("clientPackageName", context);
        if (!((Bundle) (obj)).containsKey(KEY_ANDROID_PACKAGE_NAME))
        {
            ((Bundle) (obj)).putString(KEY_ANDROID_PACKAGE_NAME, context);
        }
        context = new com.google.android.gms.common.a();
        if (!context1.bindService(yW, context, 1))
        {
            break MISSING_BLOCK_LABEL_163;
        }
        s = com.google.android.gms.internal.r.a.a(context.ew()).a(s, ((Bundle) (obj)));
        obj = s.getString(gd.zL);
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

    private static void g(Intent intent)
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
        hm.az("Calling this from your main thread can lead to deadlock");
        z(context1);
        boolean flag;
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
        context = new com.google.android.gms.common.a();
        if (!context1.bindService(yW, context, 1))
        {
            break MISSING_BLOCK_LABEL_240;
        }
        s = com.google.android.gms.internal.r.a.a(context.ew()).a(s, s1, bundle);
        s1 = s.getString("authtoken");
        flag = TextUtils.isEmpty(s1);
        if (!flag)
        {
            context1.unbindService(context);
            return s1;
        }
        s1 = s.getString("Error");
        s = (Intent)s.getParcelable("userRecoveryIntent");
        if (ad(s1))
        {
            throw new UserRecoverableAuthException(s1, s);
        }
        break MISSING_BLOCK_LABEL_203;
        s;
        Log.i("GoogleAuthUtil", "GMS remote exception ", s);
        throw new IOException("remote exception");
        s;
        context1.unbindService(context);
        throw s;
        if (ac(s1))
        {
            throw new IOException(s1);
        }
        break MISSING_BLOCK_LABEL_231;
        s;
        throw new GoogleAuthException("Interrupted");
        throw new GoogleAuthException(s1);
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
        g(intent);
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

    public static void invalidateToken(Context context, String s)
    {
        AccountManager.get(context).invalidateAuthToken("com.google", s);
    }

    private static void z(Context context)
        throws GoogleAuthException
    {
        try
        {
            GooglePlayServicesUtil.z(context);
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

    static 
    {
        if (android.os.Build.VERSION.SDK_INT < 11);
        if (android.os.Build.VERSION.SDK_INT < 14);
        yU = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
        yV = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
        yW = (new Intent()).setPackage("com.google.android.gms").setComponent(yU);
        yX = (new Intent()).setPackage("com.google.android.gms").setComponent(yV);
    }
}
