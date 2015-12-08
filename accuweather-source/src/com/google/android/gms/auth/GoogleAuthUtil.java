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
import com.google.android.gms.internal.ge;
import com.google.android.gms.internal.hn;
import com.google.android.gms.internal.s;
import java.io.IOException;
import java.net.URISyntaxException;

// Referenced classes of package com.google.android.gms.auth:
//            UserRecoverableNotifiedException, GoogleAuthException, GooglePlayServicesAvailabilityException, UserRecoverableAuthException

public final class GoogleAuthUtil
{
    private static class a extends Handler
    {

        private final Context lx;

        public void handleMessage(Message message)
        {
            if (message.what == 1)
            {
                int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(lx);
                if (GooglePlayServicesUtil.isUserRecoverableError(i))
                {
                    GooglePlayServicesUtil.showErrorNotification(i, lx);
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
            lx = context;
        }
    }


    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final String KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
    public static final String KEY_CALLER_UID = "callerUid";
    public static final String KEY_REQUEST_ACTIONS = "request_visible_actions";
    public static final String KEY_REQUEST_VISIBLE_ACTIVITIES = "request_visible_actions";
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    private static final ComponentName yR;
    private static final ComponentName yS;
    private static final Intent yT;
    private static final Intent yU;

    private GoogleAuthUtil()
    {
    }

    private static String a(Context context, String s1, String s2, Bundle bundle)
        throws IOException, UserRecoverableNotifiedException, GoogleAuthException
    {
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        try
        {
            s1 = getToken(context, s1, s2, bundle1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            int i = s1.getConnectionStatusCode();
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
        return s1;
    }

    private static boolean ac(String s1)
    {
        return "NetworkError".equals(s1) || "ServiceUnavailable".equals(s1) || "Timeout".equals(s1);
    }

    private static boolean ad(String s1)
    {
        return "BadAuthentication".equals(s1) || "CaptchaRequired".equals(s1) || "DeviceManagementRequiredOrSyncDisabled".equals(s1) || "NeedPermission".equals(s1) || "NeedsBrowser".equals(s1) || "UserCancel".equals(s1) || "AppDownloadRequired".equals(s1);
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

    public static void clearToken(Context context, String s1)
        throws GooglePlayServicesAvailabilityException, GoogleAuthException, IOException
    {
        Context context1;
        Object obj;
        context1 = context.getApplicationContext();
        hn.az("Calling this from your main thread can lead to deadlock");
        w(context1);
        obj = new Bundle();
        context = context.getApplicationInfo().packageName;
        ((Bundle) (obj)).putString("clientPackageName", context);
        if (!((Bundle) (obj)).containsKey(KEY_ANDROID_PACKAGE_NAME))
        {
            ((Bundle) (obj)).putString(KEY_ANDROID_PACKAGE_NAME, context);
        }
        context = new com.google.android.gms.common.a();
        if (!context1.bindService(yT, context, 1))
        {
            break MISSING_BLOCK_LABEL_163;
        }
        s1 = com.google.android.gms.internal.s.a.a(context.er()).a(s1, ((Bundle) (obj)));
        obj = s1.getString(ge.zI);
        if (!s1.getBoolean("booleanResult"))
        {
            throw new GoogleAuthException(((String) (obj)));
        }
        break MISSING_BLOCK_LABEL_145;
        s1;
        Log.i("GoogleAuthUtil", "GMS remote exception ", s1);
        throw new IOException("remote exception");
        s1;
        context1.unbindService(context);
        throw s1;
        context1.unbindService(context);
        return;
        s1;
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

    public static String getToken(Context context, String s1, String s2)
        throws IOException, UserRecoverableAuthException, GoogleAuthException
    {
        return getToken(context, s1, s2, new Bundle());
    }

    public static String getToken(Context context, String s1, String s2, Bundle bundle)
        throws IOException, UserRecoverableAuthException, GoogleAuthException
    {
        Context context1;
        context1 = context.getApplicationContext();
        hn.az("Calling this from your main thread can lead to deadlock");
        w(context1);
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
        if (!context1.bindService(yT, context, 1))
        {
            break MISSING_BLOCK_LABEL_240;
        }
        s1 = com.google.android.gms.internal.s.a.a(context.er()).a(s1, s2, bundle);
        s2 = s1.getString("authtoken");
        flag = TextUtils.isEmpty(s2);
        if (!flag)
        {
            context1.unbindService(context);
            return s2;
        }
        s2 = s1.getString("Error");
        s1 = (Intent)s1.getParcelable("userRecoveryIntent");
        if (ad(s2))
        {
            throw new UserRecoverableAuthException(s2, s1);
        }
        break MISSING_BLOCK_LABEL_203;
        s1;
        Log.i("GoogleAuthUtil", "GMS remote exception ", s1);
        throw new IOException("remote exception");
        s1;
        context1.unbindService(context);
        throw s1;
        if (ac(s2))
        {
            throw new IOException(s2);
        }
        break MISSING_BLOCK_LABEL_231;
        s1;
        throw new GoogleAuthException("Interrupted");
        throw new GoogleAuthException(s2);
        throw new IOException("Could not bind to service with the given context.");
    }

    public static String getTokenWithNotification(Context context, String s1, String s2, Bundle bundle)
        throws IOException, UserRecoverableNotifiedException, GoogleAuthException
    {
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        bundle1.putBoolean("handle_notification", true);
        return a(context, s1, s2, bundle1);
    }

    public static String getTokenWithNotification(Context context, String s1, String s2, Bundle bundle, Intent intent)
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
        return a(context, s1, s2, bundle1);
    }

    public static String getTokenWithNotification(Context context, String s1, String s2, Bundle bundle, String s3, Bundle bundle1)
        throws IOException, UserRecoverableNotifiedException, GoogleAuthException
    {
        if (TextUtils.isEmpty(s3))
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
        bundle2.putString("authority", s3);
        bundle2.putBundle("sync_extras", bundle);
        bundle2.putBoolean("handle_notification", true);
        return a(context, s1, s2, bundle2);
    }

    public static void invalidateToken(Context context, String s1)
    {
        AccountManager.get(context).invalidateAuthToken("com.google", s1);
    }

    private static void w(Context context)
        throws GoogleAuthException
    {
        try
        {
            GooglePlayServicesUtil.w(context);
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
        yR = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
        yS = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
        yT = (new Intent()).setPackage("com.google.android.gms").setComponent(yR);
        yU = (new Intent()).setPackage("com.google.android.gms").setComponent(yS);
    }
}
